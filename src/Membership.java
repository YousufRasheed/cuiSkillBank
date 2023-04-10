class Membership {
    static int id_counter = 0;
    int id;
    User user;

    public Membership(User user) {
        this.id = id_counter++;
        this.user = user;
    }
}