import java.util.*;

public class Student {
        String name;
        int course;
        int group;
        Map<String, Integer> subjects = new HashMap<>();

        Student(String name, int course , int group) {
            this.name = name;
            this.course = course;
            this.group = group;
        }

        double getAvg() {
            return subjects.values().stream().mapToInt(Integer::intValue).average().orElse(0);
        }

        public static void updateList(List<Student> students) {
            students.removeIf(s -> s.getAvg() < 3);
            students.forEach(s -> s.course++);
        }

        public static void printStudents(Set<Student> students, int course) {
            students.stream()
                    .filter(s -> s.course == course)
                    .forEach(s -> System.out.println(s.name + " " +s.course));
        }
    }



