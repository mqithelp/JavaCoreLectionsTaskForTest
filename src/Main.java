public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        Person sarah = new Person("Sarah", 30);
        personService.setAgeToEighteen(sarah);

        personService.changePersonToDani(sarah);

    }
}