package ntu.nt21_quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class loginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText edtDN = findViewById(R.id.edtUsername);
        EditText edtPass = findViewById(R.id.edtPass);
        Button btnXacNhan = findViewById(R.id.btnOK);

        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tenDangNhap = edtDN.getText().toString().trim();
                String mk = edtPass.getText().toString().trim();

                if (tenDangNhap.equals("maicuongtho") && mk.equals("123")) {
                    // Chuyển sang màn hình Home
                    Intent iQuiz2 = new Intent(loginActivity.this, HomeActivity.class);
                    iQuiz2.putExtra("ten_dang_nhap", tenDangNhap);
                    startActivity(iQuiz2);
                } else {
                    // Thông báo sai mật khẩu
                    Toast.makeText(loginActivity.this, "BẠN NHẬP SAI THÔNG TIN", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
