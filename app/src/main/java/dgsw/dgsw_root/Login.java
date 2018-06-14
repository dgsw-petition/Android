package dgsw.dgsw_root;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button to_sign = findViewById(R.id.login_to_sign_btn);
        View.OnClickListener ToSign = new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent nextIntent = new Intent(Login.this,Sign.class);
                startActivity(nextIntent);
            }
        };

        Button to_main = findViewById(R.id.do_login_btn);

        View.OnClickListener ToMain = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextIntent = new Intent(Login.this, Main.class);
                startActivity(nextIntent);
            }
        };

        to_sign.setOnClickListener(ToSign);
        to_main.setOnClickListener(ToMain);

    }
}
