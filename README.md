# Object Orientated Programming

All code from each TU857 Y2 OOP programming lab (CMPU1016)

## Lab[N]

All labs are in their own Java file under src/main/java/dev/petko/oop/lab[N]

## Building

This project uses Maven as a baseline tool and also provides a Makefile to make things easier

- To build this using Maven, simply just run `mvn package`.
- To run all labs:  `java -cp ./target/dev.petko.oop-1.0.jar dev.petko.oop.Main`
- To run all problems in the lab use: `java -cp ./target/dev.petko.oop-1.0.jar dev.petko.oop.lab[n].Main`
- To run an individual problem use: `java -cp ./target/dev.petko.oop-1.0.jar dev.petko.oop.lab[n].Problem[n]`

Or use the make file:

- Build: `make build`
- Run all Labs: `make run`
- Run all problems in Lab: `make run LAB=[n]`
- Run specific problem in Lab: `make run LAB=[n] PROBLEM=[n]`
