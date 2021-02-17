package school.management.system;

/*

Class responsible for keeping the track of teacher's
name, id, and salary.

*/

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**

     * Creates new Teacher object
     * @param id id for the teacher
     * @param name name of teacher
     * @param salary grade of the teacher

     */

    public Teacher(int id, String name, int salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;

    }

    /**
     * @return id of teacher
     */

    public int getId() {
        return id;
    }

    /**
     * @return name of teacher
     */

    public String getName() {
        return name;
    }

    /**
     * @return salary of teacher
     */

    public int getSalary() {
        return salary;
    }

    /**
     * set the salary
     * @param salary of teacher
     */

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Adds to salaryEarned
     * Removes from total money earned by the school
     * @param salary
     */
    public void recieveSalary(int salary) {
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teacher's Name: " + name + "\nTeacher's ID: "+ id + "\nTeacher's Salary: $" + salaryEarned + "\n";
    }

}
