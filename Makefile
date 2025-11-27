build:

	@mvn --batch-mode --update-snapshots package

run:
	@java -cp $(shell pwd)/target/dev.petko.oop.project-1.0.jar dev.petko.oop.project.Main
