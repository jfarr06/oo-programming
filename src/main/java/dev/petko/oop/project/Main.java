/**
 * @file Main.java
 * @author James Farrelly (C24402114 - TU857-2)
 */

package dev.petko.oop.project;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import dev.petko.oop.project.dataset.DataSetManager;

/**
 * Main entrypoint for the project.
 */
public class Main {
    /**
     * Main method for app entrypoint
     *
     * @param args Arguments from the command line.
     */
    public static void main(String[] args) {
        var options = new Options();
        var parser = new DefaultParser();
        var formatter = new HelpFormatter();
        CommandLine cmd = null;

        options.addOption(Option.builder("d").longOpt("data-set-path").desc("Path to the dataset CSV file").required().hasArg().build());

        try {
            cmd = parser.parse(options, args);
        }
        catch (ParseException e) {
            System.out.println(e.getMessage());
            formatter.printHelp("project", options);

            System.exit(1);
        }

        var dataSetPath = Paths.get(cmd.getOptionValue("data-set-path"));
        if (!Files.exists(dataSetPath))
        {
            System.out.printf("Unknown file: %s\n", dataSetPath);

            System.exit(1);
        }

        try {
            var dataSetManager = new DataSetManager(dataSetPath);
            var gui = new Gui(dataSetManager);
            gui.setVisible(true);
        } catch (IOException e) {
            System.out.printf("Failed to read dataset file: %s\n", e.getMessage());
            System.exit(1);
        }
    }
}
