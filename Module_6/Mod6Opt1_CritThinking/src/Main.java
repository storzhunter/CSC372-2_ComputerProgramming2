import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice", "123 Street"));
        students.add(new Student(1, "Bob", "456 Avenue"));
        students.add(new Student(2, "Charlie", "789 Road"));
        students.add(new Student(5, "David", "101 Park"));
        students.add(new Student(4, "Eve", "202 Lane"));
        students.add(new Student(7, "Frank", "303 Boulevard"));
        students.add(new Student(6, "Grace", "404 Court"));
        students.add(new Student(9, "Henry", "505 Drive"));
        students.add(new Student(8, "Ivy", "606 Place"));
        students.add(new Student(10, "Jack", "707 Square"));

        // Sort by name using NameComparator
        selectionSort(students, new NameComparator());
        System.out.println("Sorted by name:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort by rollno using RollnoComparator
        selectionSort(students, new RollnoComparator());
        System.out.println("\nSorted by rollno:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void selectionSort(ArrayList<Student> students, Comparator<Student> comparator) {
        int n = students.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(students.get(j), students.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Student temp = students.get(i);
                students.set(i, students.get(minIndex));
                students.set(minIndex, temp);
            }
        }
    }
}