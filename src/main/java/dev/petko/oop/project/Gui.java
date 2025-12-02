/**
 * @file Gui.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop.project;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import dev.petko.oop.project.dataset.DataSetEntry;
import dev.petko.oop.project.dataset.DataSetManager;
import dev.petko.oop.project.dialogs.AddEntryDialog;
import dev.petko.oop.project.dialogs.StatisticsDialog;
import dev.petko.oop.project.stats.StatisticsCalculator;

/**
 * The main window for the application.
 */
public class Gui extends JFrame {
    private final DataSetManager dataSetManager;
    private final JPanel actionsPanel;
    private final JTable table;
    private final TableRowSorter<TableModel> sorter;

    /**
     * Construct a new instance of {@link Gui}
     *
     * @param dataSetManager The {@link DataSetManager}
     */
    public Gui(DataSetManager dataSetManager) {
        this.dataSetManager = dataSetManager;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(500, 500);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout(10, 10));

        table = new JTable(dataSetManager);
        sorter = new TableRowSorter<>(table.getModel());
        setupTable();

        actionsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        setupActions();

        add(new JScrollPane(table), BorderLayout.CENTER);
        add(actionsPanel, BorderLayout.SOUTH);
    }

    private void setupTable() {
        table.setRowSorter(sorter);

        var columnModel = table.getColumnModel();

        for (int i = 0; i < DataSetEntry.COLUMN_NAMES.length; i++) {
            var column = columnModel.getColumn(i);

            column.setHeaderValue(DataSetEntry.COLUMN_NAMES[i]);
        }
    }

    private void setupActions() {
        var calculateStatsButton = new JButton("Calculate Statistics");
        var addEntryButton = new JButton("Add");

        addEntryButton.addActionListener(e -> {
            var dialog = new AddEntryDialog(this);
            dialog.setVisible(true);

            if (dialog.getOkPressed()) {
                dataSetManager.addEntry(dialog.makeEntry());

                try {
                    dataSetManager.flush();
                } catch (IOException ex) {}
            }
        });

        calculateStatsButton.addActionListener(e -> {
            var stats = StatisticsCalculator.calculatePrintableStats(table);
            var dialog = new StatisticsDialog(this, stats);
            dialog.setVisible(true);
        });

        var filterPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        var filterTextField = new JTextField(10);
        var rowCountLabel = new JLabel(String.format("%d rows", table.getRowCount()));

        filterTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                filter();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filter();
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                filter();
            }

            void filter() {
                RowFilter<TableModel, Object> rf;

                try {
                    rf = RowFilter.regexFilter(filterTextField.getText(), DataSetEntry.COLUMN_INDICES); // Search all columns
                } catch (java.util.regex.PatternSyntaxException ex) {
                    return;
                }

                sorter.setRowFilter(rf);

                rowCountLabel.setText(String.format("%d rows", table.getRowCount()));
            }
        });

        filterPanel.add(new JLabel("Filter:"));
        filterPanel.add(filterTextField);
        filterPanel.add(rowCountLabel);

        actionsPanel.add(calculateStatsButton);
        actionsPanel.add(addEntryButton);
        actionsPanel.add(filterPanel);
    }
}
