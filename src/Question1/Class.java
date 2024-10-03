package Question1;

/*
    1- Create "Class" interface which will have takeAttendance and getAttendanceList functions.
    implement that interface from 2 class which called "Math" and "Italian". write test cases.
 */

import java.util.ArrayList;
import java.util.List;

public interface Class {
    void takeAttendance(String name);
    List<String> getAttendanceList();
}

class Math implements Class {
    List<String> attendanceList;

    public Math() {
        attendanceList = new ArrayList<>();
    }

    public void takeAttendance(String name) {
        attendanceList.add(name);
    }

    public List<String> getAttendanceList() {
        return attendanceList;
    }
}

class Italian implements Class {
    List<String> attendanceList;

    public Italian() {
        attendanceList = new ArrayList<>();
    }

    public void takeAttendance(String name) {
        attendanceList.add(name);
    }

    public List<String> getAttendanceList() {
        return attendanceList;
    }
}

class ClassRunner {
    public static void main(String[] args) {
        Class mathClass = new Math();
        Class italianClass = new Italian();

        mathClass.takeAttendance("wafi");
        mathClass.takeAttendance("jermie");

        italianClass.takeAttendance("melisa");
        italianClass.takeAttendance("gulead");

        System.out.println(mathClass.getAttendanceList());
        System.out.println(italianClass.getAttendanceList());
    }
}


interface Person{
    String getAttandanceString();

}

//2- Create 'Person' interface and that interface should have getAttandenceString() function.
//
//Create two class Teacher and  Student. Both should have necessary fields.
//
//Last step update the Italian and Math class's takeAttandence function's parameter to Person type and just call getAttandenceString()
class Student implements Person {
    private String id;
    private String address;


    @Override
    public String getAttandanceString() {
        return "This is a Student";
    }
}


class Teacher implements Person{
    private String name;
    private String Subject;

    public Teacher(String name, String Subject){
        this.name = name;
        this.Subject = Subject;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    @Override
    public String getAttandanceString() {
        return null;
    }

}
