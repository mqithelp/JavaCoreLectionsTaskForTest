public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        Person sarah = new Person("Sarah", 30);
        Person john = new Person("John", 13);
        sarah.child = john;

        personService.setAgeToEighteen(sarah);
        System.out.println("sarah.child.getName() = " + sarah.child.getName());


//        System.out.println("sarah.getAge() = " + sarah.getAge());
//        personService.changePersonToDani(sarah);
//        System.out.println("sarah.getAge() = " + sarah.getAge());

    }
}