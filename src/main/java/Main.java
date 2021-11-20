public class Main {
    public static void main(String[] args) {
        Person person = new Person("Nancy ", "Christian", "35 Sewells", (short) 28);
        System.out.println("Full name is: " + person.getFullName());
        System.out.println("Old address is: " + person.getAddress());
       // System.out.println("Age is: "+person.getAge());
        String newAddress = person.changeAddress("DONE HAVE IT YET");
        System.out.println("The current address is: " + newAddress);
    }
}
