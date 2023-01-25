package jp.ac.uryukyu.ie.e225749;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void ActionTest() {
        int defaultPlayerSt = 100;
        Player demoPlayer = new Player("テスト用",200,defaultPlayerSt,15,0);
        //Enemy demoEnemy = new Enemy("テスト用の魚",100,10,10,10);
        
        demoPlayer.recover(100);

        assertEquals(defaultPlayerSt,demoPlayer.stamina);
    }
}
