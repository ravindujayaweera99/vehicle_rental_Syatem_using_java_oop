public class User {
    private String userId;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;


    //User ID
    public void setUserId(String userId) {
        userId = this.userId;
    }

    public String getUserId() {
        return this.userId;
    }

    //Name
    public void setName(String name) {
        name = this.name;
    }

    public String getName() {
        return this.name;
    }

    //Address
    public void setAddress(String address) {
        address = this.address;
    }

    public String getAddress() {
        return this.address;
    }

    //Phone Number
    public void setPhoneNumber(String phoneNumber) {
        phoneNumber = this.phoneNumber;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    //Email
    public void setEmail(){
        email = this.email;
    }

    public String getEmail() {
        return this.email;
    }

    //toString
    public String toString() {
        return ("User ID: " + this.getUserId() + "Name: " + this.getName() + "Address: " + this.getAddress() + "Phone Number: " + this.getPhoneNumber() + "Email: " + this.getEmail());
    }

    public void register(){

    }

    public void updateDetails(){

    }

    public void getDetails() {

    }
}
