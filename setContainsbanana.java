package java_exer_kihon3.Q2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Set<String> set = new HashSet<String>();

        set.add("りんご");
        set.add("みかん");
        set.add("バナナ");
        set.add("ぶどう");

        set.remove("みかん");
        System.out.println(set);

        System.out.println(set.contains("バナナ"));
        System.out.println(set.contains("みかん"));

    }
}
