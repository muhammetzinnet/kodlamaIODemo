package Entities;
public class Course {
    private int courseId;
    private String courseName;
    private String courseType;
    private double coursePrice;

    public Course() {
    }

    public Course(int courseId, String courseName, String courseType, double coursePrice) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseType = courseType;
        this.coursePrice = coursePrice;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }
}
