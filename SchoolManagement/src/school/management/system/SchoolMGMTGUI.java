package school.management.system;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class SchoolMGMTGUI extends JFrame{

    private String schoolname;
    private School school;
    private List<Teacher> teachers = new ArrayList<Teacher>();
    private List<Student> students = new ArrayList<Student>();
    private JTextField schoolName;
    private JLabel schoolNameLabel;
    private JButton schoolNameSubmit;
    private JLabel teacherNameLabel;
    private JTextField teacherName;
    private JTextField teacherID;
    private JLabel teacherIDLabel;
    private JLabel teacherSalaryLabel;
    private JTextField teacherSalary;
    private JButton submitTeacher;
    private JTextField studentName;
    private JLabel studentNameLabel;
    private JLabel studentIDLabel;
    private JTextField studentID;
    private JLabel studentGradeLabel;
    private JTextField studentGrade;
    private JButton submitStudent;
    private JPanel rootPanel;
    private JButton doneButton;

    public SchoolMGMTGUI() {
        add(rootPanel);
        setTitle("School Management System");
        setSize(650, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        submitTeacher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String teacherid = teacherID.getText();
                String teachername = teacherName.getText();
                String teachersalary = teacherSalary.getText();
                teacherID.setText("");
                teacherName.setText("");
                teacherSalary.setText("");
                int teacherSal = Integer.parseInt(teachersalary);
                int teacherId = Integer.parseInt(teacherid);
                Teacher teacher = new Teacher(teacherId,teachername,teacherSal);
                teachers.add(teacher);
            }
        });
        submitStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String studentid = studentID.getText();
                String studentname = studentName.getText();
                String studentgrade = studentGrade.getText();
                studentID.setText("");
                studentName.setText("");
                studentGrade.setText("");
                int studentId = Integer.parseInt(studentid);
                int studentGr = Integer.parseInt(studentgrade);
                Student student = new Student(studentId,studentname,studentGr);
                students.add(student);
            }
        });
        schoolNameSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                schoolname = schoolName.getText();
                schoolName.setText("");
            }
        });
        doneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                School school = new School(teachers, students);
                JOptionPane.showMessageDialog(rootPanel, "Information for teachers and students at " + schoolname + "\n" + teachers + students);
            }
        });
    }
}
