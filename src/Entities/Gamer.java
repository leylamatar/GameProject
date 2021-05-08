package Entities;

import java.time.LocalDate;

public class Gamer {
    private int id;
    private String FirstName;
    private String LastName;
    private String Nationaltityid;
    private LocalDate DateOfBirth;



    public Gamer(){

    }
    public Gamer(int id,String FirstName,String LastName,String Nationalityid, LocalDate DateOfBirth){
        super();
        this.setId(id);
        this.setFirstName(FirstName);
        this.setLastName(LastName);
        this.setNationaltityid(Nationalityid);
        this.setDateOfBirth(DateOfBirth);

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getNationaltityid() {
        return Nationaltityid;
    }

    public void setNationaltityid(String nationaltityid) {
        Nationaltityid = nationaltityid;
    }

    public LocalDate getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }
}
