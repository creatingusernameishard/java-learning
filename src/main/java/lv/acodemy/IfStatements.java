package lv.acodemy;

public class IfStatements {
    public static void main(String[] args) {

        String color = "red";

        if (color.equals("green")) {
            System.out.println("Go");
        } else if  (color.equals("yellow")){
            System.out.println("Slow down");
        } else {
            System.out.println("Stop");
        }

    }
}
