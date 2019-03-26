package com.widiyanto.user.latihan2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonMoveActivity, buttonMoveActivityData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMoveActivity = findViewById(R.id.moveActivity);
        buttonMoveActivity.setOnClickListener(this);

        buttonMoveActivityData=findViewById(R.id.data);
        buttonMoveActivityData.setOnClickListener(this);




        }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.moveActivity:
                Intent moveIntent = new Intent(MainActivity.this , MoveActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.data:
                Intent moveWithData = new Intent(MainActivity.this , MoveWithDataActivity.class);
                moveWithData.putExtra(MoveWithDataActivity.EXTRA_NAME , "BOY PRO");
                moveWithData.putExtra(MoveWithDataActivity.EXTRA_AGE , 5);
                startActivity(moveWithData);
                break;
        }
    }
}
