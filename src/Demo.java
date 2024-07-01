import java.util.Scanner;

import objects.Student;

class Demo{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("How Many Students In your Classroom ? ");
            int studentCount = input.nextInt();

            Student [] student = new Student[studentCount];

            for(int i = 0; i<studentCount; i++){
                System.out.println("\n Enter detail Student Number "+(i+1)+":");
                System.out.print("Enter Student Number "+(i+1)+ "'s Name : ");
                String name = input.next();
                System.out.print("Enter Student Number "+(i+1)+ "'s age : ");
                int age = input.nextInt();
                System.out.print("Enter Student Number "+(i+1)+ "'s id : ");
                String id = input.next();
                System.out.print("Enter Student Number "+(i+1)+ "'s Address: ");
                String address = input.next();

                student[i] = new Student(name,age,id,address);
            }

            System.out.println("\nThank You For the Details");
            System.out.print("Do you Want to Print Student Data ? (y/n)");
            String choice = input.next();
            if(choice.equals("y")){
                for(int i = 0; i<studentCount; i++){
                    System.out.println("\nStudent Number "+(i+1)+ "'s");
                    System.out.println("Name : "+student[i].getName());
                    System.out.println("Age : "+student[i].getAge());
                    System.out.println("id : "+student[i].getStudentId());
                    System.out.println("Address : "+student[i].getAddress());
                }
            }else{

            }

        };
        
    }
}