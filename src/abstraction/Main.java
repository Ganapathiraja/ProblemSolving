package abstraction;


import java.util.*;

class Abstract{

    public static abstract class LimitedAccessStructure<T>{

        protected LinkedList<T> linkedList;

        public LimitedAccessStructure(){
            linkedList = new LinkedList<T>();
        }

        public boolean isEmpty(){
            return linkedList.isEmpty();
        }

        public abstract void put(T newEntry);
        public abstract T take();
    }


    public static class Stack<T> extends LimitedAccessStructure<T>{

        @Override
        public void put(T newEntry) {
            linkedList.add(newEntry);
        }

        @Override
        public T take() {
            return linkedList.remove(linkedList.size()-1);
        }
    }


    // little bit of a complex example


    public static class PriorityQueue<T extends Comparable<? super T>> extends LimitedAccessStructure<T>{


        @Override
        public void put(T newEntry) {
            ListIterator<T> trailing = (ListIterator<T>) linkedList.iterator();
            ListIterator<T> scout = (ListIterator<T>) linkedList.iterator();

            while (scout.hasNext()){

                T value = scout.next();

                if (newEntry.compareTo(value) < 0) break;
                trailing.next();
            }

            trailing.add(newEntry);
        }

        @Override
        public T take() {
            return linkedList.remove(0);
        }
    }



}

public class Main {

    public static void main(String[] args) {
        Abstract.Stack abstractClass = new Abstract.Stack();

        Integer integer ;

        for (int i=0;i<10;i++){
            integer = new Integer(i);
            abstractClass.put(integer);
        }

        System.out.println(abstractClass.linkedList.get(7));


        Abstract.PriorityQueue priorityQueue = new Abstract.PriorityQueue();

        priorityQueue.put(30);
        priorityQueue.put(100);
        priorityQueue.put(49);
        priorityQueue.put(1);

        System.out.println(priorityQueue.linkedList.get(0));


        System.out.println("----------------------");

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(10);
        arrayDeque.add(20);
        arrayDeque.add(30);
        arrayDeque.add(40);


        System.out.println(arrayDeque.offerFirst(20));

        Iterator<Integer> iterator = arrayDeque.iterator();

        while (iterator.hasNext()){
            System.out.println("The value is {} "+iterator.next());
        }
        System.out.println("----------------------");

        Student s1 = new Student(10,"Ajay");
        Student s2 = new Student(20,"Ajay");
        Student s3 = new Student(10,"Rama");
        Student s4 = new Student(30,"Teja");
        Student s5 = new Student(50,"Jai");


        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);

        System.out.println(studentList);

        // by age
/*
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {



                return s1.getAge() - s2.getAge();
            }
        });
*/


        // by name
        /*Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });
*/
       // System.out.println(studentList);


        //by age and name

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int name = s1.getName().compareTo(s2.getName());
                int age = s1.getAge() - s2.getAge();

                return (name == 0) ? age : name;
            }
        });

        System.out.println(studentList);




    }



}

class Student{
   private int age;
    private String name;

    public Student(int age,String name){
        this.age = age;
        this.name = name ;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

}