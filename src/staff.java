class staff extends User {
    String role;

    public staff(int id, String name, String email, String password, String mobile) {
        super(id, name, email, password, mobile);
    }

    public void chat() {
        System.out.println("Chat System is working");
    }
}