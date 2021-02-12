package id.ac.umn.week02_30665;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    EditText angka1, angka2;
    TextView hasil;
    Button btnTambah, btnKurang, btnKali, btnBagi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        angka1 = this.findViewById(R.id.angka1);
        angka2 = this.findViewById(R.id.angka2);
        hasil = this.findViewById(R.id.hasil);
        btnTambah = this.findViewById(R.id.btnTambah);
        btnKurang = this.findViewById(R.id.btnKurang);
        btnKali = this.findViewById(R.id.btnKali);
        btnBagi = this.findViewById(R.id.btnBagi);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung('+');
            }
        });
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung('-');
            }
        });
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung('*');
            }
        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung('/');
            }
        });
    }

    protected void hitung(char operator) {
        String angka11 = angka1.getText().toString();
        String angka22 = angka2.getText().toString();
        if (angka11.matches("")) {
            Toast.makeText(this, "Angka 1 harus diisi!", Toast.LENGTH_SHORT).show();
            return;
        }
        if (angka22.matches("")) {
            Toast.makeText(this, "Angka 2 harus diisi!", Toast.LENGTH_SHORT).show();
            return;
        }
        double operand1 = Double.parseDouble(angka11);
        double operand2 = Double.parseDouble(angka22);
        double result = 0.0;
        switch(operator) {
            case('+') : result = operand1 + operand2; break;
            case('-') : result = operand1 - operand2; break;
            case('*') : result = operand1 * operand2; break;
            case('/') : result = operand1 / operand2;
        }
        hasil.setText(String.valueOf(result));
    }
}
