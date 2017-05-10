package ru.stqa.pft.addressbook;

public class ContactData {
    private final String firstName;
    private final String lastName;
    private final String title;
    private final String company;
    private final String address;

    public ContactData(String firstName, String lastName, String title, String company, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.company = company;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }
}