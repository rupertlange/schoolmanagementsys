package school.management.system;

import java.util.List;

/*

Class responsible for keeping the track of the school

*/

public class School {

    private static List<Teacher> teachers;
    private static List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * @param teachers list of teachers in the school
     * @param students list of students in the school
     */

    public School(List<Teacher> teachers, List<Student> students) {

        School.teachers = teachers;
        School.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     * @return list of teachers in school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Adds teacher to school
     * @param teacher the teacher at the school
     */
    public static void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * @return list of students in school
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Adds student to school
     * @param student the student at the school
     */
    public static void addStudent(Student student) {
        students.add(student);
    }

    /**
     * @return total money earned by school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * @param moneyEarned money to be added
     */
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    /**
     * @return total money spent by school
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * @param moneySpent money to be added
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned-=moneySpent;
    }
}

