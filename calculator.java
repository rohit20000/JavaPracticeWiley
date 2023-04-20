public class calculator {
        public static int cal(int a,int b,int c,int d)
        {
            int sum=a+b+c+d;
            if(sum>10000)
            {
                int temp = sum%10;

                sum=sum-temp;

                return sum;
            }
            else 
            return sum;

        }
    public static void main(String ar[])
    {
        int a=1000;
        int b=8000;
        int c=1400;
        int d=100;
        
        System.out.println(cal(a,b,c,d));
    }
}
