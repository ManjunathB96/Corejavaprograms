package logical_programs;


interface InterfaceFibonacci{
    void display();
}
public class FibonacciSeries implements InterfaceFibonacci {

    @Override
        public void display () {
            int n =10, t1=0, t2 = 1;
            System.out.println("First"+"  "+n+"  "+"terms :");

        System.out.println("Fibonacci series is :");
            for (int i =1; i<=n; ++i){
                System.out.print(t1+" + ");
                int sum =t1+t2;
                t1=t2;
                t2=sum;
            }


        }

    public static void main(String[] args) {
        InterfaceFibonacci obj = new FibonacciSeries();
        obj.display();

    }
}

