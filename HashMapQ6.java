package java_exer_kihon3.Q6;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args){
        Map<String, Person> personMap = new HashMap<>();

        personMap.put("田中",new Person("tanaka", 28));
        personMap.put("鈴木",new Person("suzuki", 25));
        personMap.put("井澤",new Person("izawa", 32));

        if (personMap.keySet().contains("井澤")){
            System.out.println("います。");
        }else {
            System.out.println("いません。");
        }

        for (String key:personMap.keySet()) {
            System.out.println(key + "は" + personMap.get(key).getAge());
        }

        int max = 0;
        for (String key: personMap.keySet()) {
            max = Math.max(max,personMap.get(key).getAge());
        }
        System.out.println(max + "歳が最年長です。");

    }

}

