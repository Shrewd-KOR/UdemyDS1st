package com.gmm.ds.sec5.linkedlist;

public class App {
    public static void main(String[] args) {

        /*
        LinkedList<String> names = new LinkedList<>();
        names.insert("Adam");
        names.insert("Daniel");
        names.insert("Ana");

        names.traverse();

        names.remove("Michael");
        names.traverse();
        */

        /*
        LinkedList<Person> people = new LinkedList<>();

        Person p = new Person(23, "Adam");

        people.insert(p);
        people.insert(new Person(34, "Daniel"));
        people.insert(new Person(56, "Michale"));

        people.remove(p);
        people.traverse();
        */

        LinkedList<Person> people = new LinkedList<>();
        people.insert(new Person(23, "Adam"));
        people.insert(new Person(34, "Daniel"));
        people.insert(new Person(56, "Michale"));
        people.insert(new Person(11, "Kevin"));
        people.insert(new Person(66, "Ana"));

        System.out.println(people.getMiddleNode());

    }
}
