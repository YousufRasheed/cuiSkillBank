class localCommunity {
    String name;
    String description;
    String date;
    String time;
    String location;

    public localCommunity(String name, String description, String date, String time, String location) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.time = time;
        this.location = location;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Location: " + location);
    }
}
