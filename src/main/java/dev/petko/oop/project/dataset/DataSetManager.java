/**
 * @file DataSetManager.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop.project.dataset;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 * Manager class for reading and writing from the dataset file.
 *
 * This is used as the {@link TableModel} because it pretty much
 * encapsulates everything that the {@link TableModel} needed.
 *
 * <p>NOTE: Instead of hackifying some way to dynamically
 *    add and remove rows from the file, opted to just overwrite
 *    the file completely with the current cached state of this
 *    class.</p>
 */
public final class DataSetManager extends AbstractTableModel {
    private final Path dataSetFilePath;
    private final ArrayList<DataSetEntry> cachedRows;

    /**
     * Construct a new instance of {@link DataSetManager}
     *
     * @param dataSetFilePath The path to the dataset file.
     * @throws FileNotFoundException
     * @throws IOException
     */
    public DataSetManager(Path dataSetFilePath) throws FileNotFoundException, IOException {
        this.dataSetFilePath = dataSetFilePath;
        cachedRows = new ArrayList<>();
    
        reload();
    }

    /**
     * Reloads the currently cached rows directly from the dataset file.
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void reload() throws FileNotFoundException, IOException {
        try (var bufReader = Files.newBufferedReader(dataSetFilePath)) {
            bufReader.readLine(); // Skip CSV header

            var line = bufReader.readLine();
            while (line != null) {
                cachedRows.add(new DataSetEntry(line));
                line = bufReader.readLine();
            }
        }
    }

    /**
     * Flushes the currently cached rows to the dataset file.
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void flush() throws FileNotFoundException, IOException {
        try (var bufWriter = Files.newBufferedWriter(dataSetFilePath)) {
            bufWriter.append(String.join(DataSetEntry.CSV_DELIM, DataSetEntry.COLUMN_NAMES));
            bufWriter.newLine();

            for (var entry : cachedRows) {
                bufWriter.append(entry.toString());
                bufWriter.newLine();
            }
        }
    }

    /**
     * Adds a new {@link DataSetEntry} to the cache and
     * updates the current {@link TableModel}
     *
     * NOTE: Will only insert if NO entry exists with the same Student_ID.
     * @param entry The new {@link DataSetEntry}
     */
    public void addEntry(DataSetEntry entry) {
        if (cachedRows.stream().filter(x -> x.getStudentId() == entry.getStudentId()).count() == 0) {
            cachedRows.add(entry);
            fireTableChanged(null);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getColumnCount() {
        return DataSetEntry.NUM_COLUMNS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getRowCount() {
        return cachedRows.size();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        var row = cachedRows.get(rowIndex);

        return row.getColumn(columnIndex);
    }
}
