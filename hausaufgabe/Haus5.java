public class Haus5 {
    public static void main(String[] args) {
        // 21. Генерация нового массива из четных чисел.
//        int[] array = {1, 2, 3, 4, 5, 6};
//        int count;
//        count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                count++;
//            }
//        }
//        int[] newArray = new int[count];
//        int index = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                newArray[index] = array[i];
//                index++;
//            }
//        }
//for (int i = 0; i < newArray.length; i++) {
//    System.out.println("newArray chetnie: " + newArray[i]);
//        }
//    }
//}


// 22. Генерация нового массива из нечетных чисел.
//int[] array = {1, 2, 3, 4, 5, 6};
//        int count;
//        count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 != 0) {
//                count++;
//            }
//        }
//        int[] newArray = new int[count];
//        int index = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 != 0) {
//                newArray[index] = array[i];
//                index++;
//            }
//        }
//        for (int i = 0; i < newArray.length; i++) {
//            System.out.println("newArray nechetnie: " + newArray[i]);
//        }
//    }
//}


// 23. Проверка на палиндром в массиве строк.

//        String[] array = {"level", "hello", "radar", "world"};
//        boolean isPalindrome = true;
//        for (int i = 0; i < array.length / 2; i++) {
//            if (array[i]!= array[array.length - 1 - i]) {
//                isPalindrome = false;
//                break;
//            }
//            if (!isPalindrome) {
//                break;
//            }
//        }
//        System.out.println(isPalindrome);
//    }}

// 24. Поиск всех подстрок в строках массива, соответствующих заданному шаблону.
//
//        String[] array = {"apple", "application", "banana", "grape"};
//        String pattern = "app";
//        for (String s : array) {
//            if (s.contains(pattern)) {
//                System.out.println(s);
//            }
//        }
//    }
//}

// 25. Создание массива чисел с четными индексами.
//         int[] array = {1, 2, 3, 4, 5, 6};
//        int count = 0;
//        for (int i = 0; i < array.length; i += 2) {
//            count++;
//        }
//        int[] newArray = new int[count];
//        int index = 0;
//        for (int i = 0; i < array.length; i += 2) {
//            newArray[index] = array[i];
//            index++;
//        }
//
//        for (int i = 0; i < newArray.length; i++) {
//            System.out.println("newArray ind chetnie: " + newArray[i]);
//        }
//    }
//}


// 26. Создание массива чисел с нечетными индексами.
//        int[] array = {1, 2, 3, 4, 5, 6};
//        int count = 0;
//        for (int 1 = 1; i < array.length; i += 2) {
//            count++;
//        }
//        int[] newArray = new int[count];
//        int index = 0;
//        for (int i = 1; i < array.length; i += 2) {
//            newArray[index] = array[i];
//            index++;
//        }
//
//        for (int i = 0; i < newArray.length; i++) {
//            System.out.println("newArray ind nechetnie: " + newArray[i]);
//        }
//    }
//}


//    }

// 27. Разделение массива строк на два: строки с четной и нечетной длиной.

        String[] array = {"apple", "banana", "cat", "dog", "elephant"};
        int count = 0;


        System.out.println("Stroki s chetnymi dlinami:");
        System.out.println("stroki s nechetnymi dlinami:");
    }
}

// 28. Найти все строки, которые начинаются и заканчиваются одинаковой буквой.
//    public static void task28() {
//        String[] array = {"apple", "banana", "level", "radar", "hello"};
//
//    }

// 29. Создать массив чисел, которые являются квадратами элементов исходного массива.
//    public static void task29() {
//        int[] array = {1, 2, 3, 4, 5};
//
//    }

// 30. Создать массив строк, содержащих только уникальные символы.
//    public static void task30() {
//        String[] array = {"apple", "banana", "cat", "dog", "race"};
//    }
//}
//}