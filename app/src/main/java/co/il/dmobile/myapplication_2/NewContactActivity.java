package co.il.dmobile.myapplication_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_contact);

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name = findViewById(R.id.name);
                EditText email = findViewById(R.id.email);

                User user = new User(R.drawable.avatar4,name.getText().toString(),email.getText().toString());
                Intent result = new Intent();
                result.putExtra("user",user);
                setResult(1,result);
                finish();
            }
        });
    }
}