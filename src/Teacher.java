public class Teacher {
    //	•	fullName (String) — ФИО
    //	•	age (int) — возраст
    //	•	grade (int) — класс (напр. 1–11)
    //	•	gpa (double) — средний балл (0.0–5.0 или 0.0–4.0 — выберите одно)
    private String fullname;
    private String subject;
    private int expirience;
    public Teacher(String fullname, String subject, int expirience) {
        this.fullname = fullname;
        this.subject = subject;
        this.expirience = expirience;
    }
    public String getFullname() {return fullname;}
    public String getSubject() {return subject;}
    public int getExpirience() {return expirience;}

    public void setFullname(String fullname) {this.fullname = fullname;}
    public void setSubject(String subject) {this.subject = subject;}
    public void setExpirience(int expirience) {this.expirience = expirience;}

    public void  printTeacher() {
        System.out.println("Fullname: " + fullname);
        System.out.println("Subject: " + subject);
        System.out.println("Expirience: " + expirience);
    }
    public boolean hasMoreExperienceThan(Teacher other) {
        return this.expirience > other.expirience;
    }


}