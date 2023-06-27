
package core;


public class Student {
    private String studentID;
    private String studentName;
    private String dob;
    private String email;
    private String phoneNumber;
    
    public Student(){
    
    }

    public Student(String studentID, String studentName, String dob, String email, String phoneNumber) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.dob = dob;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID + ", studentName=" + studentName + ", dob=" + dob + ", email=" + email + ", phoneNumber=" + phoneNumber + '}';
    }

   
    void remove() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
    
}
