package java_exer_teche3.Q003;

public class Main{
    public static void main(String[] args) {
        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            System.out.println(x/y);

        }catch (ArithmeticException  e){
            System.out.println("不正な計算を行いました");
        }catch (Exception e){
            System.out.println("引数は2つの数値を指定してください");
        }
    }
    public static void warizan (int x, int y) throws ArithmeticException {
        System.out.println(x/y);

    }
}
