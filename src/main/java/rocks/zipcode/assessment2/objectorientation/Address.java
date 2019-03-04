package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 */
public class Address {
    public String expectedLine1;
    public String expectedLine2;
    public String expectedCity;
    public String expectedState;
    public String expectedZipcode;


    public Address() {
        this.expectedLine1 = "";
        this.expectedLine2 = "";
        this.expectedCity = "";
        this.expectedState = "";
        this.expectedZipcode = "";
    }

    /**
     * @param addressLine1 - first address line
     * @param addressLine2 - second address line
     * @param city - city of location
     * @param state - state of city
     * @param zipcode - zipcode of region
     */
    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode) {
        this.expectedLine1 = addressLine1;
        this.expectedLine2 = addressLine2;
        this.expectedCity = city;
        this.expectedState = state;
        this.expectedZipcode = zipcode;
    }

    public String getAddressLine1() {

        return expectedLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.expectedLine1=addressLine1;
    }

    public String getAddressLine2() {

        return expectedLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.expectedLine2= addressLine2;
    }

    public String getCity() {

        return expectedCity;
    }

    public void setCity(String city) {
        this.expectedCity=city;
    }

    public String getState() {

        return expectedState;
    }

    public void setState(String state) {
        this.expectedState=state;
    }

    public String getZipcode() {

        return expectedZipcode;
    }

    public void setZipcode(String zipcode) {
        this.expectedZipcode=zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if(o==this)
            return true;
        if(o==null)
            return false;
        if(o.getClass()!=this.getClass())
            return false;
        Address addr =(Address)o;
        return(addr.expectedLine1==this.expectedLine1 &&
                addr.expectedLine2==this.expectedLine2 &&
                addr.expectedCity==this.expectedCity &&
                addr.expectedState==this.expectedState &&
                addr.expectedZipcode == this.expectedZipcode);
    }
    @Override
    public String toString() {
        return "Address{" +
                "addressLine1='" + expectedLine1 + '\'' +
                ", addressLine2='" + expectedLine2 + '\'' +
                ", city='" + expectedCity + '\'' +
                ", state='" + expectedState + '\'' +
                ", zipcode='" + expectedZipcode + '\'' +
                '}';
    }
}
