public class FifthLesson {
    public static void main(String[] args) {

        Employee[] empCorp = new Employee[5];
        empCorp[0] = new Employee("Avdeev Pavel Klimovich", "Department head", "apk@mail.ru", "89711235171", 181000, 51);
        empCorp[1] = new Employee("Petrov Petr Petrovich", "manager", "ppp@mail.ru", "89131147755", 87000, 45);
        empCorp[2] = new Employee("Antonov Anton Antonovich", "programmer", "aaa@mail.ru", "89018883321", 135000, 27);
        empCorp[3] = new Employee("Ivanov Ivan Ivanovich", "tester", "iii@mail.ru", "89233874111", 78000, 31);
        empCorp[4] = new Employee("Popova Alina Antonovna", "trainee", "paa@mail.ru", "89134532133", 20000, 25);

        for (Employee employee : empCorp)
            if (employee.getAge() > 40) {
                System.out.println(employee);
            }
    }
}

