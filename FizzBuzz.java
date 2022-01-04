public class FizzBuzz {

    public static void main(String[] args) {
        
        for(int i = 1; i <= Integer.parseInt(args[0]); i++) {
        //コマンドライン引数に入力した数値以下まで１ずつ足していく
           
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz");
            }
            //３で割り切れてかつ５で割り切れる数値はFizzBuzzと出力する
            
            else if (i % 5 == 0) {
                System.out.print("Buzz");
            }
            //５でわりきれる数値はBuzzと出力する

            else if (i % 3 == 0) {
                System.out.print("Fizz");
            }
            //３でわりきれる数値はFizzと出力する

            else  { 
                System.out.print(i); 
            }
            //それ以外の数値を出力する
                System.out.print(" ");
        }
    }
}