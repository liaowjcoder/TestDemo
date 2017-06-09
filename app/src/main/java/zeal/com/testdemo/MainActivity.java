package zeal.com.testdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        test();

    }

    /*
    1-100之和
     */
    private void test() {
        int n = 100;
        int sum = 0;

        //效率低
        for (int i = 1; i <= n; i++) {//
            sum += i;
        }
        //效率高
        int _sum = n * (n + 1) / 2;
        System.out.println("sum = " + _sum);//5050
    }
}
