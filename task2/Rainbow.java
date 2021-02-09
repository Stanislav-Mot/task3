package task2;

import java.util.Scanner;

public class Rainbow {

    private static final String[] COLORS = new String[]{"Red", "Blue", "White", "Green", "Pink"};

    private String getColorByNumber(int number) {
        String color = "";
        switch (number) {
            case 1:
                color = COLORS[0];
                break;
            case 2:
                color = COLORS[1];
                break;
            case 3:
                color = COLORS[2];
                break;
            case 4:
                color = COLORS[3];
                break;
            case 5:
                color = COLORS[4];
                break;
        }
        return color;
    }

    public void printColorByNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of Colors from 1 to 2");
        int number = input.nextInt();
        if (number == 1) {
            System.out.println("Enter number color from 1 to 5");
            int colorNumber = input.nextInt();
            System.out.println(getColorByNumber(colorNumber));
        } else if (number == 2) {
            System.out.println("Enter number color from 1 to 5");
            int colorNumber = input.nextInt();
            System.out.println("Enter number color from 1 to 5");
            int colorNumber2 = input.nextInt();
            String firstColor = getColorByNumber(colorNumber);
            String secondColor = getColorByNumber(colorNumber2);
            System.out.println(firstColor + "-" + secondColor);
        }
    }
}