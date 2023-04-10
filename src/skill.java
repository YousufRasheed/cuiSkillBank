class skill {
    String name;
    String note;
    String date;
    String time;

    public skill(String name, String note, String date, String time) {
        this.name = name;
        this.note = note;
        this.date = date;
        this.time = time;
    }

    public void createSkill() {
        System.out.println("Skill created successfully");
    }

    public void print() {
        System.out.println("Skill name: " + name);
        System.out.println("Skill note: " + note);
        System.out.println("Skill date: " + date);
        System.out.println("Skill time: " + time);
    }
}