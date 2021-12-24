public class ArgsLastPrinter {
    public static void main(String[] args) {
        if(args.length == 0){
            //引数がないとき
            System.out.println("なし");
        } else {
            //引数があるとき
            System.out.println(args[args.length - 1]);
            //引数の最後の値を表示する
        }  
    }
}
