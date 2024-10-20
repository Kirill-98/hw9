public class Main {
    public static void main(String[] args) {
        //1 задача
        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = " ";
        fullName = lastName + firstName + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        //2 задача
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
        //3 задача
        fullName = "Иванов Семён Семёнович";
        String fullNameTwo = fullName.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + fullNameTwo);

    }
}