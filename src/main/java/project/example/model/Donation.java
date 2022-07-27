package project.example.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Donation {
    private Integer iddonations;
    private String Water;
    private String Food;
    private String Medicine;
    private String Clothes;
    private String Sponsor;
    private String EvacuationName;
    
    public Donation() {}
    public Donation(Integer iddonations,String Water, String Food, String Medicine, String Clothes, String Sponsor,  String EvacuationName) {
        this.iddonations = iddonations;
        this.Water = Water;
        this.Food = Food;
        this.Medicine = Medicine;
        this.Clothes = Clothes;
        this.Sponsor = Sponsor;
        this.EvacuationName = EvacuationName;
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
        Donation donation = (Donation) obj;
        return new EqualsBuilder()
        .append(this.iddonations, donation.iddonations)
                .append(this.Water, donation.Water)
                .append(this.Food, donation.Food)
                .append(this.Medicine, donation.Medicine)
                .append(this.Clothes, donation.Clothes)
                .append(this.Sponsor, donation.Sponsor)
                .append(this.EvacuationName, donation.EvacuationName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder() 
        .append(iddonations)
                .append(Water)
                .append(Food)
                .append(Medicine)
                .append(Clothes)
                .append(Sponsor)
                .append(EvacuationName)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
        .append("iddonations", iddonations)
                .append("Water", Water)
                .append("Food", Food)
                .append("Medicine", Medicine)
                .append("Clothes", Clothes)
                .append("Sponsor",Sponsor)
                .append("EvacuationName",EvacuationName)
                .toString();
    }
    public String getWater() {
        return Water;
    }
    public void setWater(String water) {
        Water = water;
    }
    public String getFood() {
        return Food;
    }
    public void setFood(String food) {
        Food = food;
    }
    public String getMedicine() {
        return Medicine;
    }
    public void setMedicine(String medicine) {
        Medicine = medicine;
    }
    public String getClothes() {
        return Clothes;
    }
    public void setClothes(String clothes) {
        Clothes = clothes;
    }
    public String getSponsor() {
        return Sponsor;
    }
    public void setSponsor(String sponsor) {
        Sponsor = sponsor;
    }
    public String getEvacuationName() {
        return EvacuationName;
    }
    public void setEvacuationName(String evacuationName) {
        EvacuationName = evacuationName;
    }
    public Integer getIddonations() {
        return iddonations;
    }
    public void setIddonations(Integer iddonations) {
        this.iddonations = iddonations;
    }
    
    
    
   



    
    
}
   

