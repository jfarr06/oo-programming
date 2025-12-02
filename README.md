# Object Orientated Programming Project

[Repo](https://github.com/jfarr06/oo-programming/tree/project)

All code for the TU857 Y2 OOP programming project (CMPU1016)

## Overview

### Classes

#### dev.petko.oop.project

- [dev.petko.oop.project.Main](./src/main/java/dev/petko/oop/project/Main.java) -> Main entrypoint for the project.
- [dev.petko.oop.project.Gui](./src/main/java/dev/petko/oop/project/Gui.java) -> The main window for the application.

#### dev.petko.oop.project.dataset

- [dev.petko.oop.project.dataset.DataSetEntry](./src/main/java/dev/petko/oop/project/dataset/DataSetEntry.java) -> Represents a model for an entry within the dataset file.
- [dev.petko.oop.project.dataset.DataSetManager](./src/main/java/dev/petko/oop/project/dataset/DataSetManager.java) -> Manager class for reading and writing from the dataset file.

#### dev.petko.oop.project.dialogs

- [dev.petko.oop.project.dialogs.AddEntryDialog](./src/main/java/dev/petko/oop/project/dialogs/AddEntryDialog.java) -> Dialog for adding a new entry to the data table.
- [dev.petko.oop.project.dialogs.StatisticsDialog](./src/main/java/dev/petko/oop/project/dialogs/StatisticsDialog.java) -> Dialog used to display statistics produced by StatisticsCalculator.

#### dev.petko.oop.project.stats

- [dev.petko.oop.project.stats.StatisticsCalculator](./src/main/java/dev/petko/oop/project/stats/StatisticsCalculator.java) -> A basic static class used to calculate some statistics to be fed into the StatisticsDialog

### Features

#### Selection of dataset file

Ability to choose which dataset file to read from on the command line.

#### Sortable/Filterable Table to view data

A table that is sortable, and dyanamically filterable based on an input filter.

#### New Entry Dialog

A dialog window with validation used to add a new entry to the dataset.

#### Statistics Summary Dialog

A dialog window with a list of stats such as total entries, and total students failing.

### With More Time?

I would add an ability to modify rows.

## Building

This project uses Maven as a baseline tool and also provides a Makefile to make things easier

- Doc: `make doc`
- Build: `make build`
- Run the target: `make run`
