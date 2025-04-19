package tiil.edu.testKT;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityCau1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau1);

        EditText edtSoA = findViewById(R.id.edtSoA);
        EditText edtSoB = findViewById(R.id.edtSoB);
        Button btnTinhTong = findViewById(R.id.btnTinhTong);
        TextView txtKetQua = findViewById(R.id.txtKetQua);

        btnTinhTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strA = edtSoA.getText().toString();
                String strB = edtSoB.getText().toString();

                if (strA.isEmpty() || strB.isEmpty()) {
                    Toast.makeText(ActivityCau1.this, "Vui lòng nhập đủ số!", Toast.LENGTH_SHORT).show();
                    return;
                }

                int a = Integer.parseInt(strA);
                int b = Integer.parseInt(strB);
                int tong = a + b;

                txtKetQua.setText("Kết quả: " + tong);
            }
        });
    }
}
