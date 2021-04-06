import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        Student daddy = new Student("Daddy",45);
        Student john = new Student("John",20);
        Student vasya = new Student("Vasya",25);
        vasya.setAverageMark(90);
        john.setAverageMark(98);
        daddy.setAverageMark(100);
        Student[] students = {john,vasya,daddy};
        Arrays.sort(students,new People.PeopleComparator());
        TreeSet<Student> studentsSet = new TreeSet<>(new People.PeopleComparator());
        studentsSet.add(daddy);
        studentsSet.add(vasya);
        studentsSet.add(john);

        System.out.println("Static class");
        System.out.println("<----------------------->");
        printList(students);
        System.out.println(studentsSet);
        System.out.println("<----------------------->");

        students = Sorting.AnonymousMarkSort(students);
        studentsSet = Sorting.AnonymousMarkSort(studentsSet);
        System.out.println("\n");

        System.out.println("Anonymous class");
        System.out.println("<----------------------->");
        printList(students);
        System.out.println(studentsSet);
        System.out.println("<----------------------->");
    }

    public static void printList(Student[] students){
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for(Student student:students){
            sb.append(student);
            sb.append(", ");
        }
        sb.delete(sb.length()-2,sb.length());
        sb.append("]");
        System.out.println(sb);
    }
}
