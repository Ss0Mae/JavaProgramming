package org.dfpl.lecture;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String course [] = {"C", "C++", "Python", "Java", "HTML5"};
        String grade [] = {"A", "B+", "B", "A+", "D"};

        while (true){
            String courseName = scanner.nextLine();
            if (courseName.equals("stop")) {
                break;
            }

            int index = -1;
            for (int i = 0; i < course.length; i++) {
                if (course[i].equals(courseName)) {
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                System.out.println(grade[index]);
            } else {
                System.out.println("none");
            }
        }
        scanner.close();
    }
}
