package Practice;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Saiful");
        names.add("Islam");
        names.add("Hasan");
        int n = 10;
        double nDouble = 12.02;
        n = (int) nDouble;

        System.out.println(n);
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);

        }
        boolean booleanVariable1 = true;
        boolean booleanVariable2 = false;
        if (booleanVariable1 || booleanVariable2) {
            System.out.println("Hello world");
        }
        int x = 1;
        int y = x++;
        int z = ++x;
        System.out.printf("x = %d, y = %d, z = %d%n", x, y, z);


        Animal animal = new Cat();
        animal.eat();
        

    }

    public void fileReader() {
        try {
            FileReader fileReader = new FileReader("file");
        } catch (Exception e) {
            System.out.println(e);
        }

    }


}
