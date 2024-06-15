import java.lang.reflect.Array;
import java.util.ArrayList;

public class Room {
    ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }
    public void add(Person person) {
        this.persons.add(person);
    }
    public boolean isEmpty() {
        return persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        if(persons.isEmpty()){
            return null;
        }

        Person shortest = this.persons.get(0);
        for(Person person : persons){
            if(person.getHeight() < shortest.getHeight()){
                shortest = person;
            }
        }
        return shortest;
    }

    public Person take() {
        if(this.persons.isEmpty()){
            return null;
        }
        
        Person takePerson = this.persons.get(0);
        
        for(Person person : persons){
            if(takePerson.getHeight() > person.getHeight()){
                takePerson = person;
            }
        }
        
        this.persons.remove(takePerson);
        return takePerson;
    }
}

