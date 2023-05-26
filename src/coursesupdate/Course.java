// ICE# 10.6
public class Course {
  private String courseName;
  private String[] students = new String[100];
  private int numberOfStudents;
    
  public Course(String courseName) {
    this.courseName = courseName;
  }
  
  public void addStudent(String student) {
    students[numberOfStudents] = student;
    numberOfStudents++;
  }
  
  public String[] getStudents() {
    return students;
  }

  public int getNumberOfStudents() {
    return numberOfStudents;
  }  

  public String getCourseName() {
    return courseName;
  }  
  
  public void dropStudent(String student) {
    // Left as an exercise in Exercise 10.9
    String[] newStudents = new String[students.length-1];

    for (int i = 0, k = 0; i < students.length; i++) {
        if (students[i] != student) {
            newStudents[k] = students[i];
            k++;
        }
    }
  }
}
