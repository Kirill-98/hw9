public class Main {
    public static void main(String[] args) {
        //1 задача
        int [] expenses = new int [5];
        expenses [0] = 26998;
        expenses [1] = 43876;
        expenses [2] = 16789;
        expenses [3] = 5678;
        expenses [4] = 9874;
        int sum  = 0;
        for (int index = 0; index < expenses.length; index++){
            sum = sum + expenses[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        //2 задача
        int maxExperenses = expenses[0];
        int minExperenses = expenses[0];
        for (int i: expenses){
            if (i < minExperenses){
                minExperenses = i;
            }
            if ( i > maxExperenses){
                maxExperenses = i;
            }
        }

        System.out.println("Минимальная сумма трат за неделю составила " + minExperenses +" рублей. Максимальная сумма трат за неделю составила " + maxExperenses + " рублей");
        //3 задача
        float averageExperenses = 0;
        for (int i = 0; i <expenses.length; i++){
            averageExperenses = sum / 5.0f;
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageExperenses + " рублей");
        //  4 задача
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }

    }

}