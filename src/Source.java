public class Source {
    public static void main(String[] args) {
    int a =93;
    int b = 90;
    int c= 95;
        System.out.println(getGrade(a,b,c)=='A');
    }
    public static char getGrade(int s1, int s2, int s3) {
    char [] data = {'A','B','C','D','F'};
    int aver=(s1+s2+s3)/3;
        return (aver>=90)? data[0] : (aver>=80)? data[1] : (aver>=70)? data[2] : (aver>=60)? data[3] : data[4];
    }
}
