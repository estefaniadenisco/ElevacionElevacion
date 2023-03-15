    public class FibonacciRecursivo{
        public static void main(String[]args){
                int limite=Integer.parseInt(args[0]);
                System.out.println("El termino es " +fibonacciRecursivo(limite));

        }

        public static int fibonacciRecursivo(int n){
                if (n==1||n==2){
                        return 1;
                }
                else{
                        return fibonacciRecursivo(n-1)+fibonacciRecursivo(n-2);

                }



        }

}

