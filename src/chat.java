class chat {
    String message;
    volunteer volunteer;
    staff staff;

    public chat(String message, volunteer volunteer, staff staff) {
        this.message = message;
        this.volunteer = volunteer;
        this.staff = staff;
    }

    public void print() {
        System.out.println("Message: " + message);
        System.out.println("Volunteer: " + volunteer.name);
        System.out.println("Staff: " + staff.name);
    }
}