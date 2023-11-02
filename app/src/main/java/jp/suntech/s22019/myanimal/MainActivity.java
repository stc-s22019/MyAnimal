
package jp.suntech.s22019.myanimal;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("LifeCycleSample", "Main onCreate() called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MyLifeCycle", "Main onStart() called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MyLifeCycle", "Main onRestart() called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MyLifeCycle", "Main onResume() called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MyLifeCycle", "Main onPause() called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MyLifeCycle", "Main onStop() called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MyLifeCycle", "Main onDestroy() called");
    }

    public void onButtonClick(View view) {
        Intent intent = new Intent(MainActivity.this, SubActivity.class);
        startActivity(intent);
    }
}