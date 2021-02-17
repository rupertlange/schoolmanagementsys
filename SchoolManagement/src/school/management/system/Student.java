package school.management.system;

/*

Class responsible for keeping the track of student's fees,
name, grades, and fees paid.

*/

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**

     * Fees for every student is $30000 per year
     * Fees paid initially is 0
     * @param id id for the student: unique
     * @param name name of student
     * @param grade grade of the student

     */
    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }

    // Not going to alter student's name or id

    /**

     * Used to update student's grade
     * @param grade new grade of the student

     */

    public void setGrade(int grade) {

        this.grade = grade;

    }

    /**

     * Keep adding fees to feesPaid
     * @param fees fees that student pays

     */
    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(fees);
    }

    /**
     * @return id of student
     */

    public int getId() {
        return id;
    }

    /**
     * @return name of student
     */

    public String getName() {
        return name;
    }

    /**
     * @return grade of student
     */

    public int getGrade() {
        return grade;
    }

    /**
     * @return fees paid by student
     */

    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     * @return fees total for student
     */

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees() {
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name: "+ name + "\nStudent's ID" + id + "\nStudent's grade: " + grade + "\n";
    }
}

