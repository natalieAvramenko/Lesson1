public class Employee {
    String fullName;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Employee(String newFullName, String newPosition, String newEmail, String newPhone, int newSalary, int newAge) {

        fullName = newFullName;
        position = newPosition;
        email = newEmail;
        phone = newPhone;
        salary = newSalary;
        age = newAge;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return (fullName + "\n -" + position + "\n -" + email + "\n -" + phone + "\n -" + salary + "\n -" + age);
    }
}
