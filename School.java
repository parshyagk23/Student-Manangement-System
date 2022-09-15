import java.util.*;
import java.util.zip.CheckedOutputStream;

public class School {
    static Scanner sc = new Scanner(System.in);
    static String Name[] = new String[20];
    static String Branch[] = new String[10];
    static String Year[] = new String[10];
    static String  Div[] = new String[5];
    static String GR_No[] = new String[10];
    static String CGPA[] = new String[5];
    static int total=0;

   public static void enter(){
        int ch=0;
        System.out.println("How many students do u want to enter??");
        ch=sc.nextInt();
        if(total==0){
            total=ch+total;
            for(int i=0;i<ch;i++){
                System.out.println("Enter the Data of student "+ (i+1));
                System.out.println("Enter Name -> ");
                Name[i]= sc.next();
                System.out.println("Enter Branch -> ");
                Branch[i]= sc.next();
                System.out.println("Enter Year -> ");
                Year[i]= sc.next();
                System.out.println("Enter Div -> ");
                Div[i]= sc.next();
                System.out.println("Enter GR_No -> ");
                GR_No[i]= sc.next();
                System.out.println("Enter CGPA out off 10 -> ");
                CGPA[i]= sc.next();
            }
        }else{
            for(int i=total;i<ch+total;i++){
               System.out.println("Enter the Data of student "+ (i+1));
                System.out.println("Enter Name -> ");
                Name[i]= sc.next();
                System.out.println("Enter Branch -> ");
                Branch[i]= sc.next();
                System.out.println("Enter Passing Year -> ");
                Year[i]=sc.next();
                System.out.println("Enter Div -> ");
                Div[i]= sc.next();
                System.out.println("Enter GR No -> ");
                GR_No[i]= sc.next();
                System.out.println("Enter CGPA Out Off 10 -> ");
                CGPA[i]= sc.next();
            }
            total =ch+total;
        }
    }
    static void show(){
        if(total==0){
          System.out.println("No Data is Entered");
        }
        else{
            for(int i=0;i<total;i++)
            {
                    System.out.println("Data of Student " + (i + 1));
                    System.out.println("Name -> " + Name[i]);
                    System.out.println("Branch -> " + Branch[i]);
                    System.out.println("Year -> " + Year[i]);
                    System.out.println("Div -> " + Div[i]);
                    System.out.println("GR No -> " + GR_No[i]);
                    System.out.println("Enter CGPA out of 10 -> " + CGPA[i]);
                }

}
}
    static void  search(){
       String GR_NO;
       if(total==0){
           System.out.println("No Data is Entered");
       }else{
           System.out.println("Enter The GR No Of Student");
           GR_NO=sc.next();
           for(int i=0;i<total;i++){
               if(GR_NO.equals(GR_No[i])){
                  System.out.println("Name -> "+ Name[i]);
                  System.out.println("Branch -> "+ Branch[i]);
                  System.out.println("Year -> "+ Year[i]);
                  System.out.println("Div -> "+ Div[i]);
                  System.out.println("GR_no -> "+ GR_No[i]);
                  System.out.println("CGPA -> "+CGPA[i]);
               }

           }
       }
    }

    static void update() {
       String GR_NO;
        if (total == 0) {
            System.out.println("No Data is Entered");
        }else {
            System.out.println("Enter The GR No Of Student Which You Want To Update");
            GR_NO = sc.next();
            for (int i = 0; i < total; i++) {
                if (GR_NO.equals(GR_No[i])) {
                    System.out.println("Previous Data");
                    System.out.println("Name -> " + Name[i]);
                    System.out.println("Branch -> " + Branch[i]);
                    System.out.println("Year -> " + Year[i]);
                    System.out.println("Div -> " + Div[i]);
                    System.out.println("GR_no -> " + GR_No[i]);
                    System.out.println("CGPA -> " + CGPA[i]);
                    System.out.println("Enter New Data");

                    System.out.println("Enter Name -> ");
                    Name[i] = sc.next();
                    System.out.println("Enter Branch -> ");
                    Branch[i] = sc.next();
                    System.out.println("Enter Year -> ");
                    Year[i] = sc.next();
                    System.out.println("Enter Div -> ");
                    Div[i] = sc.next();
                    System.out.println("Enter GR_No -> ");
                    GR_No[i] = sc.next();
                    System.out.println("Enter CGPA out off 10 -> ");
                    CGPA[i] = sc.next();
                }else{
                   System.out.println("Incorrect GR No");
                   System.out.println("Please Enter Correct GR No");
                   update();
               }
            }
        }
    }

    static void deleterecord(){
       String GR_NO;
       if (total == 0) {
            System.out.println("No Data is Entered");
        }else{
           int a;
           System.out.println("Choose the option");
           System.out.println("Press 1 to Delete All Record");
           System.out.println("Press 2 to Delete Specific Record");
           a=sc.nextInt();
           if(a==1){
               total=0;
               System.out.println("All Record is Deleted..!!");
           }else if(a==2){
               System.out.println("Enter The GR No of Student Which You Want to Delete");
               GR_NO=sc.next();
               for(int i=0;i<total;i++){
                   if(GR_NO.equals(GR_No[i]));
                   {
                       for(int j=i;j<total;j++){
                           Name[j]=Name[j+1];
                           Branch[j]=Branch[j+1];
                           Year[j]=Year[j+1];
                           Div[j]=Div[j+1];
                           GR_No[j]=GR_No[j+1];
                           CGPA[j]=CGPA[j+1];
                       }
                       total--;
                       System.out.println("Your Required Record is Deleted");
                   }
               }
           }else{
               System.out.println("Invalid Input");
           }
       }
    }

    static void exit(){
       System.out.println("Successfully Exited..!!");

    }

    public static void main(String[] args) {

        int value;
        while(true) {
            System.out.println("Press 1 To Enter Data");
            System.out.println("Press 2 To Show Data");
            System.out.println("Press 3 To Search Data");
            System.out.println("Press 4 To Update Data");
            System.out.println("Press 5 To Delete Data");
            System.out.println("Press 6 To Exit Data");
            value=sc.nextInt();

            switch (value) {
                case 1 -> enter();
                case 2 -> show();
                case 3 -> search();
                case 4 -> update();
                case 5 -> deleterecord();
                case 6 -> exit();
                default -> System.out.println("Invalid input");
            }
        }
    }
}
