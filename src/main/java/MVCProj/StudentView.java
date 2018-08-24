package MVCProj;

public class StudentView {

    public void printStudent(Student student){
        System.out.println("Imie: " + student.getName());
        System.out.println("Nazwisko: " + student.getLastname());
        System.out.println("Indeks: " + student.getIndex());
    }
}
