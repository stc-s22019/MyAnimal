package jp.suntech.s22019.myanimal;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import android.widget.Button;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        Button showDescriptionButton = findViewById(R.id.showDescriptionButton);
        Button showDescriptionButton2 = findViewById(R.id.showDescriptionButton2);
        Button showDescriptionButton3 = findViewById(R.id.showDescriptionButton3);

        Log.i("LifeCycleSample", "Sub onCreate() called");
        showDescriptionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DescriptionFragment descriptionFragment = new DescriptionFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragmentContainer, descriptionFragment);
                transaction.commit();
            }
        });
        showDescriptionButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DescriptionFragment2 descriptionFragment2 = new DescriptionFragment2();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragmentContainer, descriptionFragment2);
                transaction.commit();
            }
        });
        showDescriptionButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DescriptionFragment3 descriptionFragment3 = new DescriptionFragment3();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragmentContainer, descriptionFragment3);
                transaction.commit();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MyLifeCycle", "Sub onStart() called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MyLifeCycle", "Sub onRestart() called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MyLifeCycle", "Sub onResume() called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MyLifeCycle", "Sub onPause() called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MyLifeCycle", "Sub onStop() called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MyLifeCycle", "Sub onDestroy() called");
    }

    private void displayAnimalDescription(int descriptionResId) {
        // 選択した動物の説明を表示するためのコードを追加
        String description = getResources().getString(descriptionResId);
        // 例: ダイアログを表示するか、テキストビューに説明を表示するなどの方法で表示

    }

    public void onButtonClick(View view) {
        finish();
    }
}