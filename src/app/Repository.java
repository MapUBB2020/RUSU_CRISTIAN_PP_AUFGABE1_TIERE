package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Repository {
    private ArrayList <Animal> storage = new ArrayList<>();
    public Repository() {

    }

    public void add(Animal a) {
        storage.add(a);
    }

    public void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner fileReader = new Scanner(file);
        while (fileReader.hasNextLine()) {
            String line = fileReader.nextLine();
            var tokens = line.split("#");
            add(new Animal(tokens[0], tokens[1], TipAnimal.valueOf(tokens[2]), Locatie.valueOf(tokens[3])));
        }
        fileReader.close();
    }
}
