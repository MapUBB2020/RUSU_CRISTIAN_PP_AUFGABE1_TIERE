package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Repository {
    private final ArrayList <Animal> storage = new ArrayList<>();
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
            add(new Animal(tokens[0], tokens[1], TipAnimal.valueOf(tokens[2]), Locatie.getEnum(tokens[3])));
        }
        fileReader.close();
        for (var e : storage)
            System.out.println(e + "-");
    }

    public void generateSortFile(String fileName) throws IOException {
        FileWriter myWriter = new FileWriter(fileName);
        ArrayList<Animal> sorted = new ArrayList<>(storage);
        sorted.sort(Comparator.comparing(Animal::getNume));
        for(var e : sorted) {
            myWriter.write(e.toFileFormat() + "\n");
        }
        myWriter.close();
    }

    public void generateFilterFile(String fileName) throws IOException {
        FileWriter myWriter = new FileWriter(fileName);
        for(var e : storage) {
            if (e.getTip() == TipAnimal.carnivore)
                myWriter.write(e.toFileFormat() + "\n");
        }
        int Max = -1;
        Locatie maxL = null;
        for (var e : Locatie.values()) {
            int Count = 0;
            for (var a : storage) {
                if (a.getLocatie() == e)
                    Count += 1;
            }
            if (Count > Max)
            {
                Max = Count;
                maxL = e;
            }
        }
        myWriter.write("Locatia cea mai des intalnita este: " + maxL);
        myWriter.close();
    }

}
