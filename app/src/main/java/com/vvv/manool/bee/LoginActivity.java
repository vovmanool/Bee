package com.vvv.manool.bee;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        View.OnClickListener  listenerLogin = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.d(TAG, "onClick: ");
                Intent intent=new Intent(getBaseContext(),Main2Activity.class);
                startActivity(intent);
            }
        };
        Button btn=(Button)findViewById(R.id.btn_login);
        btn.setOnClickListener(listenerLogin);


    }
}
