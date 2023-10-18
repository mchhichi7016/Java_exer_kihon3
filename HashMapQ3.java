public class Main {
    public static void main(String[] args){
        HashMap<String,Integer> a = new HashMap<>();
        a.put("国語",90);
        a.put("数学",80);
        a.put("英語",70);

        for( String key: a.keySet()) {
            System.out.println(key + ":" + a.get(key));
        }
    }
}
