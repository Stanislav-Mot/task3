package task3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        createDefaultCats();
        createTenCats();
        createCatsThroughConstructor();
        createNewCats();
    }

    public static void createDefaultCats() {
        int i = 0;
        System.out.println("Task 1");
        while (i < 10) {
            Cat cat = new Cat();
            System.out.println(cat);
            i++;
        }
        System.out.println("");
    }

    public static void createTenCats() {
        System.out.println("Task 2");
        Cat cat = new Cat();
        System.out.println("Get value");
        for (int i = 1; i <= 10; i++) {
            cat.getName();
            cat.getAge();
            System.out.println(cat);
        }
        System.out.println("Set value");
        for (int i = 1; i <= 10; i++) {
            cat.setName("Tom" + i);
            cat.setAge(i);
            System.out.println(cat);
        }
        System.out.println("");
    }

    public static void createCatsThroughConstructor() {
        System.out.println("Task 3");
        int i = 1;
        do {
            System.out.println(new Cat("Tima" + i, 3 + i));
            i++;

        } while (i <= 10);
        System.out.println("");
    }

    public static void createNewCats() {
        System.out.println("Task 4");
        Cat[] cats = new Cat[5];
        int counter = 1;
        for (Cat cat : cats) {
            cats[counter - 1] = new Cat("Barry" + counter, counter);
            counter++;
        }
        System.out.println(Arrays.toString(cats));
    }
}
