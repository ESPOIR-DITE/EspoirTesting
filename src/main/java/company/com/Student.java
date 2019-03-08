package company.com;

public class Student implements People
{
    private String name;
    private String sname;
    private int phoneNumber;

    public Student() {
    }

    public Student(String name, String sname, int phoneNumber) {
        this.name = name;
        this.sname = sname;
        this.phoneNumber = phoneNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String reccord(String name, String sname, int phoneNumber) {
        return "Student" +
                "name=" + name + '\'' +
                ", sname='" + sname + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
