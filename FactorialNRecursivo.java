public class FactorialNRecursivo{
public class factorialRecursivo{}public static void main(String[]args){
                int limite=Integer.parseInt(args[0]);
                try{

                System.out.println("El factorial es " +factorialRecursivo(limite));
                }

                catch(Exception e){
                        System.out.println(e.getMessage());
                }

        }

        public static int factorialRecursivo(int n) throws Exception {
                if (n<0){
                        throw new Exception("error:numero negativo");
                }
                if (n==0){
                        return 1;
                }
                else{
                        return n*factorialRecursivo(n-1);
                

                }
        }
}


        