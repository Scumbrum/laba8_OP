import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Sorting{
    public static TreeSet AnonymousMarkSort(TreeSet<Student> set){
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAverageMark()-o2.getAverageMark();
            }
        };
        TreeSet<Student> studentsSet = new TreeSet<>(comparator);
        for(Student student: set){
            studentsSet.add(student);
        }
        return studentsSet;
    }

    public static Student[] AnonymousMarkSort(Student[] list){
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAverageMark()-o2.getAverageMark();
            }
        };
        Arrays.sort(list,comparator);
        return list;
    }
}
