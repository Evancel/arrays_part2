public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
    }

    public static int[] generateRandomArray(){
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000)+100_000;
        }
        return arr;
    }
    public static void task1(){
        System.out.println("Task1");
        int[]arr = generateRandomArray();
        int sumExpense = 0;
        for (int i = 0; i < arr.length; i++) {
            sumExpense+=arr[i];
          //  System.out.println(arr[i]);
        }
        System.out.println("Сумма трат за месяц составила " + sumExpense + " рублей");
    }

    public static void task2(){
        System.out.println("Task2");
        int[]arr = generateRandomArray();
        int minExpense = 200_000;
        for (int i = 0; i < arr.length && arr[i]<minExpense; i++) {
            minExpense = arr[i];
        }

        int maxExpense = 0;
        for (int i = 0; i < arr.length && arr[i]>maxExpense; i++) {
            maxExpense = arr[i];
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpense +
                " рублей. Максимальная сумма трат за день составила " + maxExpense + " рублей");
    }

    public static void task3(){
        System.out.println("Task3");
        int[]arr = generateRandomArray();
        int sumExpense = 0;
        double avgExpense = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sumExpense+=arr[i];
        }
        avgExpense = sumExpense * 1.0 / 30;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", avgExpense);
    }

    public static void task4(){
        System.out.println("Task4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}