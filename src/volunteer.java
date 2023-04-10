class volunteer extends User {
    String role;
    skill[] skills;

    public volunteer(int id, String name, String email, String password, String mobile, skill[] skills, String role) {
        super(id, name, email, password, mobile);
        this.skills = skills;
        this.role = role;
    }

    public void registerVolunteer() {
        System.out.println("Volunteer registered successfully");
    }

    public void applyJob() {
        System.out.println("Job Applied successfully");
    }

    public void chat() {
        System.out.println("Chat system is working");
    }
}