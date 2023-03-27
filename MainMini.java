package JavaHomeworkProject;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

class Student{
    int id;
    String stiName;
    String gender;
    int age;
    String className;
    float score;

    public Student() {
        this.id = id;
        this.stiName = stiName;
        this.gender = gender;
        this.age = age;
        this.className = className;
        this.score = score;
    }

    void outputStudent(){
        System.out.println("===============================================================");
        System.out.println("ID: " +id);
        System.out.println("Name: " +stiName);
        System.out.println("Gender: " +gender);
        System.out.println("Age: " +age);
        System.out.println("ClassName : " +className);
        System.out.println("Score: " +score);
        System.out.println("===============================================================");
    }

    void inputStudent(Scanner input){
        Scanner obj = new Scanner(System.in);

        String stringID;
        boolean ValidId = false;
        do {
            try {
                System.out.println("enter id: ");
                stringID = obj.nextLine();
                id = Integer.parseInt(stringID);
                ValidId = true;
            }catch (Exception ex){
                System.out.println("ERROR!!! ID can only be INTEGER...!!!");
            }
        }while (!ValidId);

        System.out.println("Enter the student name: ");
//        obj.nextLine();
        stiName = obj.nextLine();

        System.out.println("Enter the Gender: ");
        gender = obj.nextLine();

        String stringAge;
        boolean ValidAge = false;
        do {
            try {
                System.out.println("Enter the Student age: ");
                stringAge = obj.nextLine();
                age = Integer.parseInt(stringAge);
                ValidAge = true;
            }catch (Exception ex){
                System.out.println("ERROR!!! Age can only be INTEGER...!!!");
            }
        }while (!ValidAge);

        System.out.println("Enter the Student Class Name: ");
//        obj.nextLine();
        className = obj.nextLine();

        String studentScore;
        boolean scoreStudent = false;
        try {
            System.out.println("Enter the Student score: ");
            studentScore = obj.nextLine();
            score = Float.parseFloat(studentScore);

            scoreStudent = true;
        }catch (Exception ex){
            System.out.println("ERROR!!! SCORE can only be INTEGER...!!!");
        }while (!scoreStudent);

    }
    void updateStudent(Scanner input){

        System.out.println("Enter the student to Update name: ");
//        input.nextLine();
        stiName = input.nextLine();

        System.out.println("Enter the Student to Update Gender: ");
        gender = input.nextLine();

        String stringAge;
        boolean ValidAge = false;
        do {
            try {
                System.out.println("Enter to Update age: ");
                stringAge = input.nextLine();
                age = Integer.parseInt(stringAge);
                ValidAge = true;
            }catch (Exception ex){
                System.out.println("ERROR!!! Age can only be INTEGER...!!!");
            }
        }while (!ValidAge);

        System.out.println("Enter the Student to Update Class Name: ");
//        obj.nextLine();
        className = input.nextLine();

        String studentScore;
        boolean scoreStudent = false;

        try {
            System.out.println("Enter the Student Update Score: ");
            studentScore = input.nextLine();
            score = Float.parseFloat(studentScore);

            scoreStudent = true;
        }catch (Exception ex){
            System.err.println("ERROR!!! SCORE can only be INTEGER...!!!");
        }while (!scoreStudent) ;

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + stiName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", className='" + className + '\'' +
                ", score=" + score +
                '}';
    }
}



public class MainMini {

    static void pressEnterKey(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("===================== Press to Continue ==============================");
//        scanner.nextLine();
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("===================================================================");
            System.out.println("\t\t\t\t\t  Student Management System");
            System.out.println("===================================================================");
            System.out.println("1. Insert Student to System: ");
            System.out.println("2. Edit Student Information: ");
            System.out.println("3. Search Student Information: ");
            System.out.println("4. Delete Student Information: ");
            System.out.println("5. show Student Information: ");
            System.out.println("6. exit");
            System.out.println("===================================================================");

            String strOption;
            System.out.print(">>> Choose Option from 1-6: ");
            strOption = input.nextLine();

            try {
                option = Integer.parseInt(strOption);
            } catch (Exception ex){
                option=0;
                System.out.println("Invalid input!!!!");
            }

            switch (option){
                case 1:
                    System.out.println("====================> Insert Student to System <===================");
                    Student newStudent = new Student();
                    newStudent.inputStudent(input);
                    students.add(newStudent);
                    System.out.println("Successfully added.....!!!");
                    break;

                case 2:
                    System.out.println("====================> Edit Student Information <====================");
//                    System.out.println("Enter Student ID: ");
//                    input.nextInt();
//                    System.out.println("Enter Student Name: ");
//                    input.nextInt();
//
//                    System.out.println("Enter Student Gender: ");
//                    input.nextInt();
//                    System.out.println("Enter Student Age: ");
//                    input.nextInt();
//                    System.out.println("Enter Student Score: ");
//                    input.nextInt();
//                    System.out.println("Exit: ");
//                    int updaID = input.nextInt();
//                    boolean isStudenthere = false;


                    System.out.println("Input your ID :");
                    int updateID = input.nextInt();
                    boolean answers = false;
                    if (students.size() > 0) {
                        for (Student student : students) {
                            if (student.id == updateID) {

                                System.out.println("Input the new name :");
                                student.stiName = input.nextLine();
                                input.nextLine();

                                System.out.println("Input the New Gender :");
                                student.gender = input.nextLine();

                                System.out.println("Input the New Age :");
                                student.age = input.nextInt();

                                System.out.println("Input the New Score :");
                                student.score = input.nextInt();


                                answers = true;
                            }
                        }
                    }
                    if (!answers)
                        System.out.println("Invalid Update Please try again!!");
                    break;


//                    for (int i=0; i<students.size(); i++){
//                        if (updaID == students.get(i).id){
//                            isStudenthere = true;
//                            Student updaStudent = students.get(i);
//
//                            updaStudent = students.get(i);
//                            updaStudent.outputStudent();
//
//                            students.set(i, updaStudent);
//                            System.out.println("Successful Update...");
//
//                        }
//                    }
//                    if (!isStudenthere){
//                        System.out.println("Student With ID of " +updateID+ "Doesn't Exist! ");
//                    }
//                    input.nextLine();
//                    break;


                case 3:
                    int searchStudent;
                    System.out.println("==============> Search Student Information <================");
                    System.out.println("1. Search By ID: ");
                    System.out.println("2. Search By Name: ");
                    System.out.println("3. exit");

                    System.out.println("Choose option 1-3: ");
                    searchStudent = input.nextInt();
                    switch (searchStudent) {
                        case 1:
                            int searchID;
                            boolean searchingId = false;

                            System.out.println("====== Search By ID ======");
                            System.out.println("Enter ID to search: ");
                            searchID = input.nextInt();

                            for (int i = 0; i < students.size(); i++) {
                                if (searchID == students.get(i).id) {
                                    searchingId = true;
                                    students.get(i).outputStudent();
                                }
                            }
                            if (!searchingId) {
                                System.out.println("Student With ID: " + searchStudent + "are invalid!!!");
                            }
                            pressEnterKey();
                            break;
                        case 2:
                            input.nextLine();
                            System.out.println("====== Search By Name ======");
                            String searchName;
                            boolean searchingName = false;

                            System.out.println("Enter Name to Search: ");
                            searchName = input.nextLine();

                            for (int i = 0; i < students.size(); i++) {


                                if (searchName.equalsIgnoreCase(students.get(i).stiName)) {

                                    searchingName = true;
                                    students.get(i).outputStudent();
                                }
                                else{
                                    System.out.println("Student With Name are" + searchName + "are invalid!!!");

                                    pressEnterKey();
                                    break;
                                }
                            }



                    }
                    input.nextLine();
                    break;
                case 4:
                    System.out.println("==============> Delete Student Information <================");
                    boolean isRemoved = false;
                    System.out.println("Enter ID: ");
                    int index = input.nextInt();

                    for (int i=0; i<students.size(); i++){
                        if (students.get(i).id == index){
                            isRemoved = true;
                            students.remove(i);
                        }
                    }
                    if (!isRemoved){
                        System.out.println("Not Found!!!!");
                    }
                    else{
                        System.out.println("Successfully Delete !!!!");
                    }

                    break;
                case 5:
                    System.out.println("==============> Show Student Information <================");
                    for (int i = 0; i<students.size(); i++){
//                        System.out.println("No Student here");
                        students.get(i).outputStudent();
                    }
                    break;
               case 6:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Wrong option!!!");

            }

            Scanner pressingEnd = new Scanner(System.in);
            System.out.println("<(-,-)>  Press to Continue...");
            pressingEnd.nextLine();

        } while (option !=6);
    }
}
