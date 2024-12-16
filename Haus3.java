public class Haus3 {
    public static void main(String[] args) {
// 1. Найти сумму элементов массива целых чисел.
//        int[] array = {1, 2, 3, 4};
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        System.out.println(sum);
//    }
//}

        // 2. Найти длину самой длинной строки в массиве строк.
//        String[] array = {"cat", "elephant", "dog"};
//        int maxLength = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].length() > maxLength) {
//                maxLength = array[i].length();
//            }
//        }
//
//        System.out.println("dlina samoj dlinnoj: " + maxLength);
//    }
//}

        // 3. Проверить, содержит ли массив строк заданное слово.
//        String[] array = {"apple", "banana", "cherry"};
//        String target = "banana";
//        boolean contains = false;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].equals(target)) {
//                contains = true;
//                break;
//            }
//        }
//        if (contains) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
//    }
//}

        // 4. Подсчитать количество строк, содержащих заданный символ.
//        String[] array = {"apple", "banana", "cherry"};
//        char target = 'a';
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].indexOf(target) != -1) {
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}
        // 5. Найти строку с максимальным количеством символов 'e'.
//            String[] array = {"elephant", "eagle", "dog"};
//            String maxString = "";
//            int maxCount = 0;
//        for (int i = 0; i < array.length; i++) {
//            int count = 0;
//            for (int j = 0; j < array[i].length(); j++) {
//                if (array[i].charAt(j) == 'e') {
//                    count++;
//                }
//            }
//            if (count > maxCount) {
//                maxCount = count;
//                maxString = array[i];
//            }
//        }
//        System.out.println("stroka s max 'e': " + maxString);
//    }
//        }

        // 6. Удалить из массива строк все строки, содержащие заданное слово.
//        String[] array = {"apple pie", "banana bread", "cherry tart"};
//        String target = "bread";
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].contains(target)) {
//                array[i] = "";
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            if (!array[i].equals("")) {
//                System.out.println(array[i]);
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].length() > array.length) {
//                array[i] = String.valueOf(array[i].length());
//                System.out.println();
//            }
//        }
//    }
//}

        // 7. Найти минимальный элемент массива целых чисел.
//        int[] array = {3, 1, 4, 1, 5};
//        int min = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] < min) {
//                min = array[i];
//            }
//        }
//        System.out.println(min);
//
//    }
//}

        // 8. Найти строку с минимальной длиной.
//        String[] array = {"cat", "elephant", "dog"};
//String minString = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].length() < minString.length()) {
//                minString = array[i];
//            }
//        }
//        System.out.println(minString);
//    }
//}

        // 9. Подсчитать количество четных чисел в массиве.
//        int[] array = {1, 2, 3, 4, 5};
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                count++;
//            }
//        }
//        System.out.println(count);
//
//    }
//}

        // 10. Найти строку, которая встречается чаще всего.
//        String[] array = {"apple", "banana", "apple", "cherry", "banana", "banana"};
//        String mostFrequent = "";
//        int maxCount = 0;
//        for (String word : array) {
//            int count = 0;
//            for (String currentWord : array) {
//                if (word.equals(currentWord)) {
//                    count++;
//                }
//            }
//            if (count > maxCount) {
//                maxCount = count;
//                mostFrequent = word;
//            }
//
//        }System.out.println("chastaya stroka: " + mostFrequent);
//    }
//}
    }
}