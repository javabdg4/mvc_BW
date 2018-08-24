package MVCProj;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John",
                                        "Rock",
                                            "123456");

        StudentView studentView = new StudentView();
        StudentController controller = new StudentController(studentView, student);

        controller.updateView();
        controller.setStudentName("Nowe Imie");
        controller.updateView();
    }
}
