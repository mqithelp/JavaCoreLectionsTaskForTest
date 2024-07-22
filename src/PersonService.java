public class PersonService {

    public void setAgeToEighteen(Person person) {
        person.setAge(18);
        person.child = new Person("Markus", 30);

    }
    public void changePersonToDani(Person person) {
//        person = new Person("Dani", 26);
        person.setAge(30);
     }
}
