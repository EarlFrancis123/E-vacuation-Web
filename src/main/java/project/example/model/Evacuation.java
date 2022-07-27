package project.example.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Evacuation {
    private int idevacuation;
    private String evacuationName;
    private String evacuationNumber;
    private String evacuationAddress;
    private String evacuationBarangay;
    private String evacuationCapacity;
    private String evacuationStatus;
    
    public Evacuation() {}
    public Evacuation(int idevacuation,String evacuationName, String evacuationNumber, String evacuationAddress, String evacuationBarangay, String evacuationCapacity, String evacuationStatus) {
        this.idevacuation = idevacuation;
        this.evacuationName = evacuationName;
        this.evacuationNumber = evacuationNumber;
        this.evacuationAddress = evacuationAddress;
        this.evacuationBarangay = evacuationBarangay;
        this.evacuationCapacity = evacuationCapacity;
        this.evacuationStatus = evacuationStatus;
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
        Evacuation evacuation = (Evacuation) obj;
        return new EqualsBuilder()
        .append(this.idevacuation, evacuation.idevacuation)
                .append(this.evacuationName, evacuation.evacuationName)
                .append(this.evacuationNumber, evacuation.evacuationNumber)
                .append(this.evacuationAddress, evacuation.evacuationAddress)
                .append(this.evacuationBarangay, evacuation.evacuationBarangay)
                .append(this.evacuationCapacity, evacuation.evacuationCapacity)
                .append(this.evacuationStatus, evacuation.evacuationStatus)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder() 
        .append(idevacuation)
                .append(evacuationName)
                .append(evacuationNumber)
                .append(evacuationAddress)
                .append(evacuationBarangay)
                .append(evacuationCapacity)
                .append(evacuationStatus)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
        .append("idevacuation", idevacuation)
                .append("evacuationName", evacuationName)
                .append("evacuationNumber", evacuationNumber)
                .append("evacuationAddress", evacuationAddress)
                .append("evacuationBarangay", evacuationBarangay)
                .append("evacuationCapacity",evacuationCapacity)
                .append("evacuationCapacity",evacuationStatus)
                .toString();
    }
    public String getEvacuationName() {
        return evacuationName;
    }
    public void setEvacuationName(String evacuationName) {
        this.evacuationName = evacuationName;
    }
    public String getEvacuationNumber() {
        return evacuationNumber;
    }
    public void setEvacuationNumber(String evacuationNumber) {
        this.evacuationNumber = evacuationNumber;
    }
    public String getEvacuationAddress() {
        return evacuationAddress;
    }
    public void setEvacuationAddress(String evacuationAddress) {
        this.evacuationAddress = evacuationAddress;
    }
    public String getEvacuationBarangay() {
        return evacuationBarangay;
    }
    public void setEvacuationBarangay(String evacuationBarangay) {
        this.evacuationBarangay = evacuationBarangay;
    }
    public String getEvacuationCapacity() {
        return evacuationCapacity;
    }
    public void setEvacuationCapacity(String evacuationCapacity) {
        this.evacuationCapacity = evacuationCapacity;
    }
    public String getEvacuationStatus() {
        return evacuationStatus;
    }
    public void setEvacuationStatus(String evacuationStatus) {
        this.evacuationStatus = evacuationStatus;
    }
    public int getIdevacuation() {
        return idevacuation;
    }
    public void setIdevacuation(int idevacuation) {
        this.idevacuation = idevacuation;
    }
   



    
    
}
   

