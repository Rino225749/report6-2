package jp.ac.uryukyu.ie.e225749;

import java.util.ArrayList;
import java.util.Random;

public class Enemy extends Character {
    public static String actionValue;
    int originSta = stamina;

    Enemy(String name, int hp, int stamina, int str, int guard) {
        super(name, hp, stamina, str, guard);
    }

    @Override
    void showStatus() {
        System.out.printf("%s:スタミナ %d\n", name, stamina);
    }

    @Override
    void act(ArrayList<Character> targets) {
        //魚の行動の選択肢を追加
        addAction(new EnemyActions("必死に泳いだ", str, 10));
        addAction(new EnemyActions("超必死に泳いだ", str*2, 20));
        addAction(new EnemyActions("疲れている", 0, -30));
        addAction(new EnemyRampage("暴れた", str, 15));

        //スタミナが0より大きいとき、全ての行動が取れる
        if (stamina > 0){
            var rand = new Random();
            int index = rand.nextInt(actions.size()); //ランダムに選択されたインデクス
            var selected_action = actions.get(index);
            selected_action.execute(this, targets.get(0));
        }else{//スタミナが0の時、疲れて動けない
            stamina = 0;
            var selected_action = actions.get(2);
            selected_action.execute(this, targets.get(0));
        }
        //スタミナが初期値を上回るのを防ぐ
        if(stamina >= originSta){
            stamina = originSta;
        }
        //スタミナが0未満になるのを防ぐ
        if(stamina <= 0){
            stamina = 0;
        }

    }
 }
