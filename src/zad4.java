public class zad4 {
    public static void main(String[] args) {
        String fullName = "Иванов Семён Семёнович";
        if (fullName.contains("ё")) {
            fullName = fullName.replace('ё', 'е');
        }
        System.out.println("Данные ФИО сотрудника - "+fullName);
    }
}
