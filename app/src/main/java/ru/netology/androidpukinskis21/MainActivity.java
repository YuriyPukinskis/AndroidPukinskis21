package ru.netology.androidpukinskis21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnClear = (Button) findViewById(R.id.buttonClear);
        Button btnOk = (Button) findViewById(R.id.buttonOk);
        final EditText editText = (EditText)findViewById(R.id.name);
        final EditText mail = (EditText)findViewById(R.id.mail);
        // TextInputEditText tMail = (TextInputEditText) findViewById(R.id.mail);
        final TextView textView = findViewById(R.id.textView);

       btnClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                textView.setText("");
                editText.setText("");
                mail.setText("");

            }
        });

       btnOk.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v) {
               textView.setText("Подписка на рассылку успешно оформлена для пользователя " + editText.getText() + " на 'электронный адрес " +mail.getText() + ".");
           }
       });
    }
}
