package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Client {
    
    private String firstName;

    private String middleName;

    private String lastName;

    private String fullName;

    private String cpf;

    private String birthDate;

    private int age;

    private char gender;

    private String email;

    private String address;

    private String phoneNumber;

    
    public Client(String firstName, String middleName, String lastName, String cpf,
                  String birthDate, char gender, String email, String address, String phoneNumber) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.fullName = firstName + " " + middleName + " " + lastName;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.age = defineAge();
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        
    }

    private int defineAge() {
        int currentYear = retrieveCurrentYear();
        int yearOfBirth = retrieveYearOfBirth();
        return currentYear - yearOfBirth;
    }

    private int retrieveYearOfBirth() {
        Calendar calendar = Calendar.getInstance();
        Date clientDateOfBirth;
        try {
            clientDateOfBirth = defineDateFormat("dd/MM/YYYY")
            .parse(birthDate);
        } catch (ParseException e) {
            
            throw new RuntimeException(e);
        }
        calendar.setTime(clientDateOfBirth);
        return calendar.get(Calendar.YEAR);
    }

    private int retrieveCurrentYear() {
        Calendar calendar = Calendar.getInstance();
        Date currentDay = new Date();
        calendar.setTime(currentDay);
        return calendar.get(Calendar.YEAR);
    }

    private SimpleDateFormat defineDateFormat(String dateFormat){
        if(dateFormat == "") {
            return new SimpleDateFormat("dd/MM/YYYY");
        } else {
            return new SimpleDateFormat(dateFormat);
        }
       
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAdress(String adress) {
        this.address = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private String genderTreatment() {
        if(getGender() == 'M') {
            return "Mr.";
        } else if(getGender() == 'F') {
            return "Ms.";
        } else {
            return "";
        }
    }

    @Override
    public String toString() {
        return genderTreatment() + " " + getFullName() +
        ", with CPF " + getCpf() + ", birth date " + getBirthDate() +
        ", with " + getAge() + " years old" + ", email " + getEmail() +
        ", address " + getAddress() + " and phone number " + getPhoneNumber() + ".";
    }
}