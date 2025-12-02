/**
 * @file AddEntryDialog.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop.project.dialogs;

import dev.petko.oop.project.dataset.*;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

/**
 * Dialog for adding a new entry
 * to the data table.
 */
public class AddEntryDialog extends JDialog {
    private final ArrayList<JTextField> fields;
    private boolean okPressed = false;

    /**
     * Construct a new instance of {@link AddEntryDialog}
     *
     * @param parent The parent {@link JFrame}
     */
    public AddEntryDialog(JFrame parent) {
        super(parent, "Add entry", true);

        fields = new ArrayList<>();

        setupDialog();
    }

    private void setupDialog() {
        setLayout(new BorderLayout(10, 10));

        var inputPanel = new JPanel(new GridBagLayout());
        var constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);
        constraints.anchor = GridBagConstraints.WEST;
        constraints.fill = GridBagConstraints.HORIZONTAL;

        for (int i = 0; i < DataSetEntry.COLUMN_NAMES.length; i++) {
            constraints.gridx = 0;
            constraints.gridy = i;
            constraints.weightx = 0.3;

            var label = new JLabel(DataSetEntry.COLUMN_NAMES[i] + ":");
            inputPanel.add(label, constraints);

            constraints.gridx = 1;
            constraints.weightx = 0.7;

            var field = new JTextField(20);
            fields.add(field);
            inputPanel.add(field, constraints);
        }

        var buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        var okButton = new JButton("OK");
        var cancelButton = new JButton("Cancel");

        okButton.addActionListener(e -> { 
            try {
                makeEntry();

                okPressed = true;
                dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Format Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        cancelButton.addActionListener(e -> {
            okPressed = false;

            dispose();
        });

        buttonPanel.add(okButton);
        buttonPanel.add(cancelButton);

        add(inputPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(getParent());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * Determines if the OK button was pressed or not.
     *
     * @return True if the button was pressed, false otherwise.
     */
    public boolean getOkPressed() { return okPressed; }

    /**
     * Validates and creates a new entry based on the inputted fields.
     *
     * @return A new instance of {@link DataSetEntry}
     */
    public DataSetEntry makeEntry() {
        var columns = new String[fields.size()];
        
        for (int i = 0; i < fields.size(); i++)
            columns[i] = fields.get(i).getText();

        return new DataSetEntry(String.join(",", columns));
    }
}
