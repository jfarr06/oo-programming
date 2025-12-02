/**
 * @file StatisticsDialog.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop.project.dialogs;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import dev.petko.oop.project.stats.StatisticsCalculator;

/**
 * Dialog used to display statistics produced by {@link StatisticsCalculator}
 */
public class StatisticsDialog extends JDialog {
    /**
     * Constructs a new instance {@link StatisticsDialog}
     *
     * @param parent The parent {@link JFrame}
     * @param printableStats The stats {@link Map} produced by the {@link StatisticsCalculator}
     */
    public StatisticsDialog(JFrame parent, Map<String, Object> printableStats) {
        super(parent, "Statistics Summary", true);
    
        setupStatisticsDialog(printableStats);
    }

    private void setupStatisticsDialog(Map<String, Object> printableStats) {
        setLayout(new BorderLayout(10, 10));

        var statsPanel = new JPanel(new GridBagLayout());
        statsPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        var constraints = new GridBagConstraints();
        constraints.insets = new Insets(8, 10, 8, 10);
        constraints.anchor = GridBagConstraints.WEST;
        constraints.fill = GridBagConstraints.HORIZONTAL;

        for (int i = 0; i < StatisticsCalculator.STAT_NAMES.length; i++) {
            var stat = StatisticsCalculator.STAT_NAMES[i];

            constraints.gridx = 0;
            constraints.gridy = i;
            constraints.weightx = 0.4;

            var nameLabel = new JLabel(stat + ":");
            nameLabel.setFont(nameLabel.getFont().deriveFont(Font.BOLD));
            statsPanel.add(nameLabel, constraints);

            constraints.gridx = 1;
            constraints.weightx = 0.6;

            var valueLabel = new JLabel(printableStats.get(stat).toString());
            statsPanel.add(valueLabel, constraints);
        }

        var buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        var closeButton = new JButton("Close");

        closeButton.addActionListener(e -> dispose());

        buttonPanel.add(closeButton);

        add(statsPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(getParent());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
