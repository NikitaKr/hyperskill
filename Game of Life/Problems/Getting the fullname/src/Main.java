class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        if (firstName == null) {
            firstName = "";
        }
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        if (lastName == null) {
            lastName = "";
        }
    }

    public String getFullName() {
        String fullName = "";
        if (firstName == null) {
            fullName = lastName;
        }
        if (lastName == null) {
            fullName = firstName;
        }
        if (lastName == null && firstName == null) {
            fullName = "Unknown";
        }
        if (lastName != null && firstName != null) {
            fullName = firstName + " " + lastName;
        }

        return fullName;

    }
}