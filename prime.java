public class prime {
    public static void main(String[]args){
        int[] a={1,2,3,4,5,6,7,8,9};
        for(int i=0;i<10;i++){
        flag=0;
        for(int j=2;j<a;j++){
            if(a%1==0)
           flag=1;
           break;
        }
       if (flag==0)
       count++;
    }
     System.out.println(count);

    }
}
    
    
