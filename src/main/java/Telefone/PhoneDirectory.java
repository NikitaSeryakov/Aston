package Telefone;

import java.util.*;

public class PhoneDirectory {
    private Map<String, List<String>> directory = new HashMap<>();

    public void add(String surname, String phone) {
        directory.computeIfAbsent(surname, k -> new ArrayList<>()).add(phone);
    }

    public List<String> get(String surname) {
        return directory.getOrDefault(surname, Collections.emptyList());
    }

    public static void main(String[] args) {
        PhoneDirectory pb = new PhoneDirectory();

        pb.add("Колобанов", "8-950-214-94-97");
        pb.add("Герт", "8-952-152-12-32");
        pb.add("Вдовин", "8-963-456-12-32");
        pb.add("Герт","8-950-562-21-32" );

        System.out.println("Колобанов: " + pb.get("Колобанов"));
        System.out.println("Герт: " + pb.get("Герт"));
        System.out.println("Вдовин: " + pb.get("Вдовин"));
    }
}
