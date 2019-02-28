package learnProgramming;

public class Mymain {

    public static void main(String[] args) {

        Person personobj1 = new Person();
        Person personobj2 = new Person();
        Person personobj3 = new Person();
        Person personobj4 = new Person();

        personobj1.setFirstName("Deepa1");
        personobj2.setFirstName("Deepa2");
        personobj3.setFirstName("Deepa3");
        personobj4.setFirstName("Deepa4");

        personobj1.setLastName("Reddy1");
        personobj2.setLastName("Reddy2");
        personobj3.setLastName("Reddy3");
        personobj4.setLastName("Reddy4");

        System.out.println(personobj1.getFirstName()+personobj1.getLastName());
        System.out.println(personobj2.getFirstName()+personobj2.getLastName());
        System.out.println(personobj3.getFirstName()+personobj3.getLastName());
        System.out.println(personobj4.getFirstName()+personobj4.getLastName());
    }
}
