doc:

	@mvn javadoc:javadoc

build:

	@mvn clean compile assembly:single

run:
	@java -jar $(shell pwd)/target/dev.petko.oop.project-1.0-jar-with-dependencies.jar -d resources/Farrelly_James.csv
