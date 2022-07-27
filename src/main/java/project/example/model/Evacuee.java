package project.example.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Evacuee {
    private int idevacuee;
    private String firstName;
    private String lastname;
    private String contactNumber;
    private String gender;
    private String Address;
    private String evacuationName;
    public Evacuee() {}
    public Evacuee(int idevacuee,String firstName, String lastname, String contactNumber, String gender, String address, String evacuationName) {
        this.idevacuee = idevacuee;
        this.firstName = firstName;
        this.lastname = lastname;
        this.contactNumber = contactNumber;
        this.gender = gender;
        this.Address = address;
        this.evacuationName = evacuationName;
    }  @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Evacuee evacuee = (Evacuee) obj;
        return new EqualsBuilder()
                .append(this.idevacuee, evacuee.idevacuee)
                .append(this.firstName, evacuee.firstName)
                .append(this.lastname, evacuee.lastname)
                .append(this.contactNumber, evacuee.contactNumber)
                .append(this.gender, evacuee.gender)
                .append(this.Address, evacuee.Address)
                .append(this.evacuationName, evacuee.evacuationName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder() 
        .append(idevacuee)
                .append(firstName)
                .append(lastname)
                .append(contactNumber)
                .append(gender)
                .append(Address)
                .append(evacuationName)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
        .append("idevacuee", idevacuee)
                .append("firstName", firstName)
                .append("lastName", lastname)
                .append("contactNumber", contactNumber)
                .append("gender", gender)
                .append("Address",Address)
                .append("evacuationName",evacuationName)
                .toString();
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public String getEvacuationName() {
        return evacuationName;
    }
    public void setEvacuationName(String evacuationName) {
        this.evacuationName = evacuationName;
    }
    public int getIdevacuee() {
        return idevacuee;
    }
    public void setIdevacuee(int idevacuee) {
        this.idevacuee = idevacuee;
    }
    
    
   



    
    
}
   

