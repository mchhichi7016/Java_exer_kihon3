public class Main {
    public static void main(String[] args){
        MenuManager manager = new MenuManager();

        manager.showMenu("sandwitch");

        manager.setMenu("sandwitch", "ビッグバーガー");
        manager.showMenu("sandwitch");

        manager.searchMenu("ホットミルク");
        manager.searchMenu("オレンジジュース");

    }

  package java_exer_kihon3.Q4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MenuManager {
    Map<String, ArrayList<String>> map = new HashMap<>();

    MenuManager(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("ハンバーガー");
        list.add("チーズバーガー");
        list.add("ダブルチーズバーガー");
        map.put("sandwitch",list);

        list = new ArrayList<>();
        list.add("コーラ");
        list.add("オレンジジュース");
        list.add("ミネラルウォーター");
        map.put("drink", list);

        list = new ArrayList<>();
        list.add("フライトポテト");
        list.add("チキンナゲット");
        list.add("フレッシュサラダ");
        map.put("sidemenu", list);
    }
    void searchMenu(String menu){
        for (String key:map.keySet()) {
            if (map.get(key).contains(menu)){
                System.out.println(menu + "は" + key + "に含まれています。");
                return;
            }
        }
        System.out.println("这个菜单里没有！");
    }

    void setMenu(String category, String menu){
        map.get(category).add(menu);
    }

    void showMenu(String category){
        System.out.println(map.get(category));
    }
}

}
