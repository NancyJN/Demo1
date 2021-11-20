public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private short age;

    public Person(String firstName, String lastName, String address, short age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
    }

    public String getFullName() {
        return String.format("%s %s", firstName, lastName);
    }

    public String getAddress() {
        return address;
    }

    public short getAge() {
        return age;
    }

    public String changeAddress (String newAddress){
        this.address = newAddress;
        return newAddress;
    }

}