LAB ?=

.PHONY: build

build:

	@mvn package

run:
	
ifeq ($(strip $(LAB)),)
		$(info "$$LAB should be specified!")
else
		java -cp $(shell pwd)/target/dev.petko.oop-1.0.jar dev.petko.oop.lab${LAB}.Main
endif
