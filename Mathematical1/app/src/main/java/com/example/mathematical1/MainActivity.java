package com.example.mathematical1;

        import androidx.appcompat.app.AppCompatActivity;

        import android.annotation.SuppressLint;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etfirstvalue,etsecondvalue;
    Button btnadd,btnsubs,btnmultiply,btndivision;
    Double num1,num2;
    TextView tvresult;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etfirstvalue=findViewById(R.id.etfirstvalue);
        etsecondvalue=findViewById(R.id.etsecondvalue);
        btnadd=findViewById(R.id.btnadd);
        btnsubs=findViewById(R.id.btnsubs);
        btnmultiply=findViewById(R.id.btnmultiply);
        btndivision=findViewById(R.id.btndivision);
        tvresult=findViewById(R.id.tvresult);
        ClickListener();
    }

    public void ClickListener() {
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Double.parseDouble(etfirstvalue.getText().toString());
                num2=Double.parseDouble(etsecondvalue.getText().toString());
                Double result=num1+num2;
                tvresult.setText(String.valueOf(result));
            }
        });
        btnsubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Double.parseDouble(etfirstvalue.getText().toString());
                num2=Double.parseDouble(etsecondvalue.getText().toString());
                Double result=num1-num2;
                tvresult.setText(String.valueOf(result));

            }
        });
        btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Double.parseDouble(etfirstvalue.getText().toString());
                num2=Double.parseDouble(etsecondvalue.getText().toString());
                Double result=num1*num2;
                tvresult.setText(String.valueOf(result));
            }
        });
        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Double.parseDouble(etfirstvalue.getText().toString());
                num2=Double.parseDouble(etsecondvalue.getText().toString());
                Double result=num1/num2;
                tvresult.setText(String.valueOf(result));
            }
        });

    }
}