package backend;

public class Member implements Recordable{
    private String name, email, memberId, phoneNumber;
    private String status;
    private String membershipType;

    public Member(String memberId, String name, String membershipType, String email, String phoneNumber, String status) {
         if (!Validator.isValidID(memberId, 'M'))
            throw new IllegalArgumentException("Invalid ID number!");
        if (!Validator.isValidName(name))
            throw new IllegalArgumentException("Invalid name!");
        if (!Validator.isValidEmail(email))
            throw new IllegalArgumentException("Invalid email address!");
        if (!Validator.isValidPhoneNumber(phoneNumber))
            throw new IllegalArgumentException("Invalid phone number!"); 

        this.memberId = memberId;
        this.name = name;
        this.membershipType = membershipType;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getStatus() {
        return status;
    }

    public String getMembershipType() {
        return membershipType;
    }
    

    @Override
    public String lineRepresentation () {
        String line = String.join(",", 
        memberId, name, membershipType, 
        email, phoneNumber, status);

        return line;
    }

    @Override
    public String getSearchKey () {
        return memberId;
    }

    @Override
    public String toString() {
        return "Member [name=" + name + ", email=" + email + ", memberId=" + memberId + ", phoneNumber=" + phoneNumber
                + ", status=" + status + ", membershipType=" + membershipType + "]";
    }

    

}
