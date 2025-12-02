/**
 * @file StatisticsCalculator.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop.project.stats;

import dev.petko.oop.project.dataset.*;

import java.util.Map;
import java.util.HashMap;
import javax.swing.JTable;

/**
 * A basic static class used to calculate some
 * statistics to be fed into the {@link dev.petko.oop.project.dialogs.StatisticsDialog}
 */
public final class StatisticsCalculator {
    /**
     * All the names of each recorded stat.
     */
    public static final String[] STAT_NAMES = {
        "Total Rows",
        "Most Common Subject",
        "Most Common Grade",
        "Most Common Term",
        "Avg Num Assessments",
        "Avg Score Overall",
        "Avg Attendance",
        "Total Failing"
    };

    /**
     * Calculates a map of printable statistics based 
     * on the dynamic entries of the {@link JTable}
     *
     * @param model The {@link JTable} that holds the rows.
     * @return A map of Stat->Value.
     */
    public static Map<String, Object> calculatePrintableStats(JTable model) {
        var stats = new HashMap<String, Object>();

        stats.put(STAT_NAMES[0], model.getRowCount());
        stats.put(STAT_NAMES[1], getMostCommonEntry(model, DataSetEntry.SUBJECT));
        stats.put(STAT_NAMES[2], getMostCommonEntry(model, DataSetEntry.GRADE));
        stats.put(STAT_NAMES[3], getMostCommonEntry(model, DataSetEntry.TERM));
        stats.put(STAT_NAMES[4], (int)calculateAverage(model, DataSetEntry.NUM_ASSESSMENTS));
        stats.put(STAT_NAMES[5], calculateAverage(model, DataSetEntry.AVERAGE_SCORE));
        stats.put(STAT_NAMES[6], calculateAverage(model, DataSetEntry.ATTENDANCE_PERCENT));
        stats.put(STAT_NAMES[7], getTotal(model, DataSetEntry.GRADE, DataSetEntry.Grade.F.toString()));

        return stats;
    }

    private static String getMostCommonEntry(JTable model, int columnIndex) {
        var entryCounts = new HashMap<String, Integer>();

        for (int i = 0; i < model.getRowCount(); i++)
            entryCounts.merge((String)model.getValueAt(i, columnIndex), 1, Integer::sum);

        return entryCounts.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("");
    }

    private static double calculateAverage(JTable model, int columnIndex) {
        var total = model.getRowCount();
        var sum = 0.0;
        
        for (int i = 0; i < total; i++) 
            sum += Double.valueOf((String)model.getValueAt(i, columnIndex));

        return sum / total;
    }

    private static int getTotal(JTable model, int columnIndex, String value) {
        var entryCounts = new HashMap<String, Integer>();

        for (int i = 0; i < model.getRowCount(); i++)
            entryCounts.merge((String)model.getValueAt(i, columnIndex), 1, Integer::sum);

        return entryCounts.getOrDefault(value, 0);
    }
}
