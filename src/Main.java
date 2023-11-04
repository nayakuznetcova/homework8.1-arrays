public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4Method1();
        task4Method2();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] array = generateRandomArray();
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println("Сумма трат зa месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] array = generateRandomArray();
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            int val = array[i];
            if (val < min) {
                min = val;
            }
            if (val > max) {
                max = val;
            }
        }
        System.out.println("Минимальное значение " + min);
        System.out.println("Максимальное значение " + max);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] array = generateRandomArray();
        int sum = 0;
        int average = 0;
        for (int c : array) {
            sum += c;
        }
        average = sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }

    public static void task4Method1() {
        System.out.println("Задача 4 метод 1");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i] + " ");
        }
        System.out.println();
    }

    public static void task4Method2() {
        System.out.println("Задача 4 метод 2");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int k = 0;
        int j = reverseFullName.length - 1;
        while (k < j) {
            char temp = reverseFullName[k];
            reverseFullName[k] = reverseFullName[j];
            reverseFullName[j] = temp;
            k++;
            j--;
        }
        for (char c : reverseFullName) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}