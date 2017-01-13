package javaappl;

/**
 * Created by александр on 13.01.2017.
 */
public class Person implements Comparable<Person> {
    String name;
    int age;
    boolean male;

    public void print(){
        System.out.println("Log - this is " + this.name + " and " + (this.male?"he":"she") + " is " + this.age + " years old.");
    }

    @Override
    public String toString(){
        return name;
    }
    @Override
    public int compareTo(Person oPerson){
        return this.name.compareTo(oPerson.name);
    }
}
