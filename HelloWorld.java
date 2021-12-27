public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
 
        String gender = "男性";
        int age = 10;
        if (gender.equals("男性") && age >= 10) {
            System.out.println(age);
        
            System.out.println(gender);
        }

        

        int i = Integer.parseInt(args[0]);
        if (i != 1) {

            System.out.println(i); 
        }
        //System.out.println(i); 
    }
}