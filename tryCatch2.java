public class Main{
    public static void main(String[] args){
        try {
            int x = Integer.parseInt("5");
            int y = Integer.parseInt("0");
            System.out.println(x/y);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("引数は2つの数値を指定してください.");
        }catch (ArithmeticException e){
            System.out.println("不正な計算を行いました.");
        }finally {
            System.out.println("プログラムを終了します");
        }
    }
}
