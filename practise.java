import java.util.Scanner;
class arraylo
{
    public static void main(String[] args) {
    Scanner ip = new Scanner(System.in);
    System.out.println("enter the size of array");
    int size=ip.nextInt();
    int[]arr=new int[size];
    System.out.println("Enter the elements:");
    for(int ind=0;ind<size;ind++)
      arr[ind]=ip.nextInt();
    int sum =0;
    for(int ind=0;ind<size;ind++)
       sum=sum+arr[ind];
    System.out.println("sum="+sum);

}
}