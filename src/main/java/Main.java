import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        Student s1 = new Student("Ковалев", 1, 48);
        s1.subjects.put("Автоматизация", 4);
        s1.subjects.put("Мануальное тестирование", 4);

        Student s2 = new Student("Серяков", 1, 48);
        s2.subjects.put("Автоматизация", 4);
        s2.subjects.put("Мануальное тестирование", 4);

        Student s3 = new Student("Романова", 1, 48);
        s3.subjects.put("Автоматизация", 5);
        s3.subjects.put("Мануальное тестирование", 4);

        Student s4 = new Student("Рудковский", 1, 48);
        s4.subjects.put("Автоматизация", 5);
        s4.subjects.put("Мануальное тестирование", 4);

        Student s5 = new Student("Севостьянов", 1, 48);
        s5.subjects.put("Автоматизация", 4);
        s5.subjects.put("Мануальное тестирование", 5);

        Student s6 = new Student("Григорян", 1, 48);
        s6.subjects.put("Автоматизация", 2);
        s6.subjects.put("Мануальное тестирование", 4);

        Student s7 = new Student("Борсяков", 1, 48);
        s7.subjects.put("Автоматизация", 5);
        s7.subjects.put("Мануальное тестирование", 5);

        Student s8 = new Student("Сушков", 1, 48);
        s8.subjects.put("Автоматизация", 4);
        s8.subjects.put("Мануальное тестирование", 5);

        Student s9 = new Student("Хорбенко", 1, 48);
        s9.subjects.put("Автоматизация", 4);
        s9.subjects.put("Мануальное тестирование", 4);

        Student s10 = new Student("Захаров", 1, 48);
        s10.subjects.put("Автоматизация", 4);
        s10.subjects.put("Мануальное тестирование", 5);

        Student s11 = new Student("Смирнова", 1, 48);
        s11.subjects.put("Автоматизация", 4);
        s11.subjects.put("Мануальное тестирование", 4);

        Student s12 = new Student("Севостьянов", 1, 48);
        s12.subjects.put("Автоматизация", 3);
        s12.subjects.put("Мануальное тестирование", 5);

        Student s13 = new Student("Болдышева", 1, 48);
        s13.subjects.put("Автоматизация", 5);
        s13.subjects.put("Мануальное тестирование", 5);

        Student s14 = new Student("Сомова", 1, 48);
        s14.subjects.put("Автоматизация", 5);
        s14.subjects.put("Мануальное тестирование", 5);

        Student s15 = new Student("Крупина", 1, 48);
        s15.subjects.put("Автоматизация", 5);
        s15.subjects.put("Мануальное тестирование", 4);

        Student s16 = new Student("Максименко", 1, 48);
        s16.subjects.put("Автоматизация", 4);
        s16.subjects.put("Мануальное тестирование", 4);

        Student s17 = new Student("Рыжанков", 1, 48);
        s17.subjects.put("Автоматизация", 3);
        s17.subjects.put("Мануальное тестирование", 4);

        Student s18 = new Student("Радиончик", 1, 48);
        s18.subjects.put("Автоматизация", 4);
        s18.subjects.put("Мануальное тестирование", 3);

        Student s19 = new Student("Сазонова", 1, 48);
        s19.subjects.put("Автоматизация", 4);
        s19.subjects.put("Мануальное тестирование", 4);

        Student s20 = new Student("Ерёмин", 1, 48);
        s20.subjects.put("Автоматизация", 5);
        s20.subjects.put("Мануальное тестирование", 5);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
        list.add(s7);
        list.add(s8);
        list.add(s9);
        list.add(s10);
        list.add(s11);
        list.add(s12);
        list.add(s13);
        list.add(s14);
        list.add(s15);
        list.add(s16);
        list.add(s17);
        list.add(s18);
        list.add(s19);
        list.add(s20);



        Student.updateList(list);
        Student.printStudents(new HashSet<>(list), 2);
    }

