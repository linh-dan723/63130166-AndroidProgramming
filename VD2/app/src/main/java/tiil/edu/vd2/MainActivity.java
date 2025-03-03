package tiil.edu.vd2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }
    // Xử lý cộng
    void XuLyCong(View v) {
        // Lấy dữ liệu từ EditText
        EditText editTextSo1 = (EditText) findViewById(R.id.edtA);
        EditText editTextSo2 = (EditText) findViewById(R.id.edtB);

        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();

        // Chuyển đổi dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);

        // Tính toán
        float Tong = soA + soB;

        // Hiện kết quả
        EditText editTextKQ = (EditText) findViewById(R.id.edtKetQua);
        String chuoiKQ = String.valueOf(Tong);
        editTextKQ.setText(chuoiKQ);
    }

    // Xử lý trừ
    void XuLyTru(View v) {
        EditText editTextSo1 = (EditText) findViewById(R.id.edtA);
        EditText editTextSo2 = (EditText) findViewById(R.id.edtB);

        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();

        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);

        float Hieu = soA - soB;

        EditText editTextKQ = (EditText) findViewById(R.id.edtKetQua);
        String chuoiKQ = String.valueOf(Hieu);
        editTextKQ.setText(chuoiKQ);
    }

    // Xử lý nhân
    void XuLyNhan(View v) {
        EditText editTextSo1 = (EditText) findViewById(R.id.edtA);
        EditText editTextSo2 = (EditText) findViewById(R.id.edtB);

        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();

        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);

        float Tich = soA * soB;

        EditText editTextKQ = (EditText) findViewById(R.id.edtKetQua);
        String chuoiKQ = String.valueOf(Tich);
        editTextKQ.setText(chuoiKQ);
    }

    // Xử lý chia
    void XuLyChia(View v) {
        EditText editTextSo1 = (EditText) findViewById(R.id.edtA);
        EditText editTextSo2 = (EditText) findViewById(R.id.edtB);

        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();

        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);

        if (soB == 0) {
            // Nếu chia cho 0, hiển thị thông báo lỗi
            EditText editTextKQ = (EditText) findViewById(R.id.edtKetQua);
            editTextKQ.setText("Lỗi: Chia cho 0!");
        } else {
            float Thuong = soA / soB;
            EditText editTextKQ = (EditText) findViewById(R.id.edtKetQua);
            String chuoiKQ = String.valueOf(Thuong);
            editTextKQ.setText(chuoiKQ);
        }
    }

}