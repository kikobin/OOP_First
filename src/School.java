public class School {
    private String name;
    private String city;

    private Student[] students;
    private Teacher[] teachers;

    private int studentCount;
    private int teacherCount;

    public School(String name, String city,int studentmax,int teachermax) {
        this.name = name;
        this.city = city;
        this.students = new Student[studentmax];
        this.teachers = new Teacher[teachermax];
    }

    public String getName() { return name;}
    public String getCity() { return city;}
    public int getStudentCount() { return studentCount;}
    public int getTeacherCount() { return teacherCount;}

    public void setName(String name) { this.name = name;}
    public void setCity(String city) { this.city = city;}

    public boolean addStudent(Student student) {
        if (studentCount >= students.length) {
            return false;
        }
        students[studentCount] = student;
        studentCount++;
        return true;
    }
    public boolean addTeacher(Teacher teacher) {
        if (teacherCount >= teachers.length) {
            return false;

        }
        teachers[teacherCount] = teacher;
        teacherCount++;
        return true;
    }

    public void printStudents() {
        for (int i = 0; i < studentCount; i++) {
            students[i].infoAboutStudent();
        }
    }
    public void printTeachers() {
        for (int i = 0; i < teacherCount; i++) {
            teachers[i].printTeacher();
        }
    }

}
