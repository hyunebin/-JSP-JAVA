package Ex09;

import java.util.ArrayList;

public class StudentManager {

    ArrayList<Student> students = new ArrayList<>();


    public static void main(String[] args){
        StudentManager studentManager = new StudentManager();
        studentManager.addList("김현빈",24,2016250013,"컴퓨터공학");
        studentManager.addList("박민국", 42, 20001020,"외과");

         for(int i =0; i < studentManager.students.size(); i++){
             System.out.print(" " + studentManager.students.get(i).getAge());
             System.out.print(" " + studentManager.students.get(i).getName());
             System.out.print(" " + studentManager.students.get(i).getStudentNum());
             System.out.println(" " + studentManager.students.get(i).getMajor());
         }

    }

    public void addList(String name, int age, int studentNum, String major){
        students.add(new Student(name, age, studentNum,major));
    }





}
