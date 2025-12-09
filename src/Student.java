public class Student    { private String fullName;
private int age;
private int grade;
private int gpa;

public Student(String fullName, int age, int grade,int gpa) {
    this.fullName = fullName;
    this.age = age;
    this.grade = grade;
    this.gpa = gpa;
}

public String getFullName() {return fullName;}
public void setFullName(String fullName) {this.fullName = fullName;}

public int getAge() {return age;}
public void setAge(int age) {this.age = age;}

public int getGrade() {return grade;}
public void setGrade(int grade) {this.grade = grade;}

public int getGpa() {return gpa;}
public void setGpa(int gpa) {this.gpa = gpa;}
public void infoAboutStudent() {
System.out.println("Full Name: "+fullName);
System.out.println("Age: " + age);
System.out.println("Grade: " + grade);
System.out.println("GPA: "+gpa);
}
public boolean hasHigherGpaThan(Student other){
    return this.gpa >= other.getGpa();
}
}


