public class SumaNRecursivo{
        public static void main(String[]args){
                int limite=Integer.parseInt(args[0]);
                try{

                        System.out.println("La suma es " +sumaRecursiva(limite));
                }catch(Exception e){
                        System.out.println(e.getMessage());
                }
        }

        public static int sumaRecursiva(int n) throws Exception {
                if (n<0){
                        throw new Exception("error:numero negativo");
                }
                if (n==0){
                        return 0;
                }
                else{
                        return n+sumaRecursiva(n-1);

                }

			}
}