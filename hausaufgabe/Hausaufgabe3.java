package hausaufgabe;

import java.util.Scanner;

public class Hausaufgabe3 {
    public static void main(String[] args) {
//        String str = new String("I study Basic Java!");
//        runString(str);
//    }
//
//    public static void runString(String input) {
//
//        char lastChar = input.charAt(input.length() - 1);
//        System.out.println("poslednij simvol: " + lastChar);
//        String contains = input.contains("Java") ? "y" : "n";
//
//        System.out.println("stroka soderzit 'Java': " + contains);
//        String replacedString = input.replace('a', 'o');
//        System.out.println("zamena 'a' na 'o': " + replacedString);
//        String upperCaseString = input.toUpperCase();
//        System.out.println("smena na verhnij registr: " + upperCaseString);
//        String lowerCaseString = input.toLowerCase();
//        System.out.println("smena na niznij registr: " + lowerCaseString);
//
//
//        // 6. Вырезание подстроки "Basic Java"
//        String substring = input.substring(14, 18);
//        System.out.println("virezat stroku: " + substring);
//
//        // 7. Удаление подстроки "Basic Java"
//        String withoutSubstring = input.replace(substring, "");
//        System.out.println("stroka posle udaleniya: " + withoutSubstring);
//    }
//}

//Домашнее задание 3.
//        № 1
//Создайте строку через new - I study Basic Java!
//        Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
//Распечатать последний символ строки. Используем метод String.charAt().
//Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//Заменить все символы “а” на “о”.
//Преобразуйте строку к верхнему регистру.
//Преобразуйте строку к нижнему регистру.
//Вырезать строку Java c помощью метода String.substring().
        Scanner scanner = new Scanner(System.in);
        System.out.println("vvesti pervoe chislo: ");
        float a = scanner.nextFloat();
        System.out.println("vvesti operacii: +, -, *, /  ");
        char operation = scanner.next().charAt(0);
        System.out.println("vvesti vtoroe chislo: ");
        float b = scanner.nextFloat();

        if (operation == '+') {
            float result = a + b;
            System.out.println("summa chisel: " + a + " i " + b + "ravna " + result);
        } else if (operation == '-') {
            float result = a - b;
            System.out.println("raznost chisel: " + a + " i " + b + "ravna " + result);
        }
        if (operation == '*') {
            float result = a * b;
            System.out.println("proizvedenie chisel: " + a + " i " + b + "ravna " + result);
        } else if (operation == '/') {
            float result = a / b;
            if (b != 0) {
                System.out.println("chastnoe chislo: " + a + " i " + b + "ravna " + result);
            } else {
                System.out.println("oshibka");

            }

        }
    }
}



//        № 2
//Создайте методы с математическими операциями +, -, *, /
//Каждый метод принимает два числа в параметрах и возвращает результат
//Вызовите все методы в main
//Результат распечатайте в консоль
