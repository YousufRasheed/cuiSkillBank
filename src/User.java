class User {
    int id;
    String name;
    String email;
    String password;
    String mobile;

    public User(int id, String name, String email, String password, String mobile) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
    }

    public void register() {
        System.out.println("User registered successfully");
    }

    public void login() {
        System.out.println("User logged in successfully");
    }
}