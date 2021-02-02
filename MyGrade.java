public class MyGrade {
    public static char calculateMyGrade(double homework, double codelab, double projects, double midterm, double finalExam, double recitation){

        double courseAverage=projects*.10+codelab*.10+ midterm*.30+finalExam*.30+recitation*.1+homework*.10;

        if(courseAverage>=90)return 'A';
        else if(courseAverage>=80) return 'B';
        else if(courseAverage>=70 )return 'C';
        else if(courseAverage>=60 )return 'D';
        else return 'F';


}

    public static void main(String[] args) {
        char grade=' ';
        grade= calculateMyGrade(89.5,100,86.8,88,90,100);
        System.out.println(grade);

    }
}
