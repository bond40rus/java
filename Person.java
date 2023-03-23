import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gendor;


    public Person(String firstName, String lastName, int age, String gendor){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gendor = gendor;
    }

    @Override
    public String toString(){
        return String.format("%s %s, [%d], gen - %s",firstName, lastName, age, gendor);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        if (!(obj instanceof Person)) {
            return false ;
        }
        Person anotherPerson =(Person) obj;
        return Objects.equals(firstName, anotherPerson.firstName) && lastName == anotherPerson.lastName && age == anotherPerson.age;
    }
    // правило если сравнение по equals  true  то  hashcode  должен совпасть
    @Override
    public int hashCode() {
        return Objects.hash( firstName, lastName,age);

    }

    
}
 