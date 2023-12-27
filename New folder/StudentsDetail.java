public class StudentDetails {
    public static void main(String[] args) {
        Student student = new Student();
        Address address = new Address();

        student.getStudentDetails();
        address.getAddress();
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Address: " + address.getAddressDetails());
    }
}