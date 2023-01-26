package jp.ac.uryukyu.ie.e225749;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    /**
     * 食いつき度が初期値以上にならないことを検証。また、食いつき度の上限値がCharacter.recover()に依存しているかを確認。
     * 検証手順
     *  (1) プレイヤーの持つ食いつき度を設定。
     *  (2) プレイヤーの食いつき度を回復する「竿を緩める」を設定しているRestクラスのexecutの中身の計算式を個別に検証。
     *  (3) 食いつき度は初期値である100以上に回復しないはず。
     */
    @Test
    void ActionTest() {
        int defaultPlayerSt = 100;
        Player demoPlayer = new Player("テスト用",200,defaultPlayerSt,15,0);
        //Enemy demoEnemy = new Enemy("テスト用の魚",100,10,10,10);
        
        demoPlayer.recover(100);

        assertEquals(defaultPlayerSt,demoPlayer.stamina);
    }
}
