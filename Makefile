LAB ?=

build:

	@mvn --batch-mode --update-snapshots package

run:
	
ifeq ($(strip $(LAB)),)
		@java -cp $(shell pwd)/target/dev.petko.oop-1.0.jar dev.petko.oop.Main
else
		@java -cp $(shell pwd)/target/dev.petko.oop-1.0.jar dev.petko.oop.lab${LAB}.Main
endif
