package com.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText eName;
    Button bClick;
    TextView tName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eName = findViewById(R.id.textEdit);
        bClick = findViewById(R.id.helloButton);
        tName = findViewById(R.id.textHello);


        bClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = "Hello, " + eName.getText().toString();
                tName.setText(name);
                Log.d("Nume", name);

                openDialog(name);

            }
        });
    }

    //    public void clicked(View view){
//        String name ="Hello, " + eName.getText().toString();
//        tName.setText(name);
//    }
    private void openDialog(String greet) {
        Bundle bundle = new Bundle();
        bundle.putString("greet", greet);

        PopUpDialogFragment popUpDialogFragment = new PopUpDialogFragment();
        popUpDialogFragment.setArguments(bundle);
        popUpDialogFragment.show(getSupportFragmentManager(), "Dialog Hello");
    }

}