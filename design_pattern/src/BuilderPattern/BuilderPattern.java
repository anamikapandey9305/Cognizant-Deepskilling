package BuilderPattern;

public class BuilderPattern {

    public static void main(String[] args) {

        Student student = new Student.Builder()
                .setId(101)
                .setName("Anamika")
                .setAge(22)
                .setCourse("Java")
                .setCity("Delhi")
                .build();

        student.display();
    }
}
// Builder Pattern : Builder Pattern is a Creational Design Pattern used to create complex objects step by step. It avoids constructors with many parameters and improves readability and maintainability.
