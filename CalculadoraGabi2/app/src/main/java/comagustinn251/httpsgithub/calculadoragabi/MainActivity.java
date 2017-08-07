package comagustinn251.httpsgithub.calculadoragabi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Valor1, Valor2;
    TextView Gabi1  ;
    int n1 , n2 ,total ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Valor1 = (EditText)findViewById(R.id.editText);
        Valor2 = (EditText)findViewById(R.id.editText2);
        Gabi1 = (TextView)findViewById(R.id.textView);

    }
    public void suma (View v) {
        n1 = Integer.parseInt( Valor1.getText().toString());
        n2 = Integer.parseInt( Valor2.getText().toString());
        total = n1+ n2;
        Gabi1.setText(String.valueOf(total));
    }
    public void Resta (View v) {
        n1 = Integer.parseInt( Valor1.getText().toString());
        n2 = Integer.parseInt( Valor2.getText().toString());
        total = n1- n2;
        Gabi1.setText(String.valueOf(total));
    }
    public void Multiplicacion (View v) {
        n1 = Integer.parseInt( Valor1.getText().toString());
        n2 = Integer.parseInt( Valor2.getText().toString());
        total = n1* n2;
        Gabi1.setText(String.valueOf(total));
    }
    public void Division (View v) {
        n1 = Integer.parseInt( Valor1.getText().toString());
        n2 = Integer.parseInt( Valor2.getText().toString());
        if (n2>0){
            total = n1/ n2;
            Gabi1.setText(String.valueOf(total));
        }


    }




}