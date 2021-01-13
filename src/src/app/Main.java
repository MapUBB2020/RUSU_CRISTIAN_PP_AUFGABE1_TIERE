package app;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	    Repository r = new Repository();
	    r.readFile("tiere.txt");
	    r.generateSortFile("animals-sort-name.txt");
    }
}
