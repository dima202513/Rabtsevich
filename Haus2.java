import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Haus2 {
    public static void main(String[] args) {
    }
}
//        for(int j = 0; j < 100; j++) {
//            System.out.println(Math.random() * i + min);
//        }

        //        int[] array = {1, 2, 3, 4, 5};
//        int target = 6;
//        System.out.println("array = " + Arrays.toString(array) + ", target = " + target);
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] + array[j] == target) {
//                    System.out.println("para: (" + array[i] + ", " + array[j] + ")");
//                }
//            }
//        }
//    }
//}
// 16. Найти все пары элементов, сумма которых равна заданному числу.
//public static void task16() {
//

// 17. Проверить, есть ли в массиве дубликаты.
//public static void task17() {
//        int[] array = {1, 2, 3, 4, 2};
//        boolean hasDuplicates = false;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (array[i] == array[j] && (i != j)) {
//                    hasDuplicates = true;
//                    break;
//                }
//            }
//        }
//        System.out.println(hasDuplicates);
//    }
//}

// 18. Удалить все нули из массива и сдвинуть элементы влево.
//public static void task18() {
//        int[] array = {0, 1, 0, 3, 0};
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 0) {
//                count++;
//            }
//        }
//        int[] newArray = new int[array.length - count];
//        int a = 0;
//        for (int i = 0; i < args.length; i++) {
//            if (array[i] != 0) {
//                newArray[a++] = array[i];
//            }
//        } System.out.println(Arrays.toString(newArray));
//    }
//}

//// 20. Найти количество чисел, делящихся на заданное число без остатка.
//        int[] array = {10, 15, 20, 25, 30};
//        int divisor = 5;
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 5 == 0) {
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}

// 21. Упорядочить массив по возрастанию.
//        int[] array = {10, 15, 20, 25, 30};
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length - 1; j++) {
//                if (array[j] > array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(array));
//    }
//}

// 22. Найти индекс первого отрицательного элемента.
//        int[] array = {1, 2, -3, 4, -5};
//        int index = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < 0) {
//                index = 1;
//                break;
//            }
//        }
//    }
//}

// 23. Подсчитать сумму чисел на четных индексах.

//        int[] array = {1, 2, 3, 4, 5};
//        int sum = 0;
//        for (int i = 0; i < array.length; i += 2) {
//            sum = sum + array[i];
//        }
//        System.out.println(sum);
//    }
//} dolgo dumal poka ne ponyal chto + indeksi
//

// 24. Найти произведение всех элементов массива.
//        int[] array = {1, 2, 3, 4};
//        int multiply = array[0];
//        for (int i = 0; i < array.length; i++) {
//            multiply = multiply * array[i];
//        }
//        System.out.println(multiply);
//    }
//}


// 25. Переместить все отрицательные числа в конец массива.
//        int[] array = {1, -2, 3, -4, 5};
//        int temp = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length - 1; j++) {
//                if (array[j] < 0 && array[j + 1] > 0) {
//                    temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//
//            }
//        }
//        System.out.println(Arrays.toString(array));
//    }
//}

// 26. Найти количество уникальных элементов в массиве.
//        int[] array = {1, 2, 2, 3, 4, 4, 5};
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (array[i] == array[j] && (i != j)) {
//                    break;
//                }
//                if (j == array.length - 1) {
//                    count++;
//
//                }
//            }
//        }
//        System.out.println(count);
//    }
//}

// 27. Переставить минимальный элемент массива в начало.
//        int[] array = {3, 2, 1, 4, 5};
//        int minIndex = 0;
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] < array[minIndex]) {
//                minIndex = i;
//            }
//        }
//        int temp = array[0];
//        array[0] = array[minIndex];
//        array[minIndex] = temp;
//
//        for (int num : array) {
//            System.out.print(num + " ");
//        }
//    }
//}

// 28. Найти длину самой длинной последовательности одинаковых элементов.

//        int[] array = {1, 1, 2, 2, 2, 3, 3};
//        int maxLength = 1;
//        int currentLength = 1;
//        for (int i = 0; i < array.length - 1; i++) {
//            if (array[i] == array[i + 1]) {
//                currentLength++;
//            } else {
//                if (currentLength > maxLength) {
//                    maxLength = currentLength;
//                }
//                currentLength = 1;
//            }
//        }
//        System.out.println(maxLength);
//    }
//}
// 29. Найти сумму положительных элементов, расположенных после первого отрицательного.
//public static void task29() {

//        int[] array = {1, -2, 3, 4, -5};
//    int sum = 0;
//    for (int i = 1; i < array.length; i++) {
//        if (array[i] < 0){
//            int negat = i;
//            for (int j = negat; j < array.length; j++) {
//                if (array[j] > 0){
//                    sum = sum + array[j];
//                }
//            }
//        }
//    }
//    System.out.println("najti sumAll posle negat " + sum);
//}
//
// 30. Удалить все дубликаты из массива.
//        int[] array = {1, 2, 2, 3, 4, 4, 5};
//        int n = array.length;
//        int[] temp = new int[n];
//        int index = 0;
//        for (int i = 0; i < n; i++) {
//            boolean Dublicate = false;
//            for (int j = 0; j < index; j++) {
//                if (array[i] == temp[j]) {
//                    Dublicate = true;
//                }
//            }
//            if (!Dublicate) {
//                temp[index++] = array[i];
//            }
//        }
//        int[] result = Arrays.copyOf(temp, index);
//        System.out.println("massiv bez dublikata: " + Arrays.toString(result));
//    }
//}
