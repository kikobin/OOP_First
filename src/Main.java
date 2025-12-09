public class Main {
    public static void main(String[] args) {


        School schoolA = new School("AITU School", "Astana", 100, 20);


        Student s1 = new Student("Aruzhan K.", 16, 10, 4);
        Student s2 = new Student("Dias N.",    17, 11, 5);
        Student s3 = new Student("Alua S.",    15,  9, 4);


        Teacher t1 = new Teacher("Serik Aitbayev", "Math",    12);
        Teacher t2 = new Teacher("Kemel Ayan", "O-O-P", 92);

        schoolA.addStudent(s1);
        schoolA.addStudent(s2);
        schoolA.addStudent(s3);

        schoolA.addTeacher(t1);
        schoolA.addTeacher(t2);



        System.out.println("School: " + schoolA.getName() + "City: " + schoolA.getCity());
        System.out.print("Students count: " + schoolA.getStudentCount() + "Teachers count: " + schoolA.getTeacherCount());

        schoolA.printStudents();
        System.out.println();
        schoolA.printTeachers();
        System.out.println();


        System.out.println("Is " + s2.getFullName() + " GPA >= " + s1.getFullName() + "? "
                + s2.hasHigherGpaThan(s1));


        System.out.println("Does " + t1.getFullname() + " have more experience than " + t2.getFullname() + "? "
                + t1.hasMoreExperienceThan(t2));


        School schoolB = new School("Steppe School", "Almaty", 50, 10);
        schoolB.addStudent(new Student("Beknur N.", 16, 10, 3));

        boolean schoolAHasMore = schoolA.getStudentCount() > schoolB.getStudentCount();
        System.out.println("Does " + schoolA.getName() + " have more students than " + schoolB.getName() + "? "
                + schoolAHasMore);
    }
}