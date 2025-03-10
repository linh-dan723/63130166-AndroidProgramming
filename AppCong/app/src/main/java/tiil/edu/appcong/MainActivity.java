package tiil.edu.appcong;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editTextSoA, editTextSoB, editTextKetQua;
    Button btnSayHi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ các thành phần từ XML
        editTextSoA = findViewById(R.id.edtA);
        editTextSoB = findViewById(R.id.edtB);
        editTextKetQua = findViewById(R.id.edtKQ);
        btnSayHi = findViewById(R.id.btnSayHi);

        // Gán sự kiện click cho nút
        btnSayHi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyCong();
            }
        });
    }

    // Hàm xử lý phép cộng
    public void XuLyCong() {
        try {
            // Lấy dữ liệu từ ô nhập
            String strA = editTextSoA.getText().toString().trim();
            String strB = editTextSoB.getText().toString().trim();

            // Kiểm tra nếu trống
            if (strA.isEmpty() || strB.isEmpty()) {
                Toast.makeText(this, "Vui lòng nhập cả hai số!", Toast.LENGTH_SHORT).show();
                return;
            }

            // Chuyển sang kiểu số nguyên
            int so_A = Integer.parseInt(strA);
            int so_B = Integer.parseInt(strB);

            // Tính tổng
            int tong = so_A + so_B;

            // Hiển thị kết quả
            editTextKetQua.setText(String.valueOf(tong));

        } catch (NumberFormatException e) {
            Toast.makeText(this, "Vui lòng nhập số hợp lệ!", Toast.LENGTH_SHORT).show();
        }
    }
}
