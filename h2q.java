class Student{
    String sName;
    int rollNo;
    int marks;
    String courseName;
    int courseCredits;
    Student(String n,int r,int m,String cn,int cc){
        this.sName = n;
        this.rollNo = r;
        this.marks = m;
        this.courseName = cn;
        this.courseCredits = cc;
    }
    int calculateFee(){
        return courseCredits*1500;
    }
    boolean checkEligibility(){
        if(marks>=50) return true;
        else return false;
    } 
    int calculateScholarship(){
        if(marks>=85) return 20;
        else if(marks>=70) return 10;
        else return 0;
    }
    int calculateFinalFee(){
        int c = calculateFee();
        int s = calculateScholarship();
        if(s!=0){
            s = 100/s;
            c = c-(c/s);
        }
        return c;
    }
    void display(){
        System.out.printf("Name : %s\nRollNo : %d\nMarks : %d\nCourse : %s\nCredits : %d\n",sName,rollNo,marks,courseName,courseCredits);
        System.out.println("Eligible : "+checkEligibility());
        System.out.println("Fees : "+calculateFee());
        System.out.println("Scholarship : "+calculateScholarship()+"%");
        System.out.println("Final Fees : "+calculateFinalFee());
    }
}
class h2q{
    public static void main(String[] args){
        Student s1 = new Student("Rahul", 30218, 78, "PSPJ", 7);
        Student s2 = new Student("Varun", 30187, 99, "PSPJ", 7);
        Student s3 = new Student("Jaya",30225,55,"PSPJ",7);
        s1.display();
        System.out.println();
        s2.display();
        System.out.println();
        s3.display();
    }
}