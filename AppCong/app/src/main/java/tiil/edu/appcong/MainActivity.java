package tiil.edu.appcong;



import android.app.Activity;
import android.graphics.Insets;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
            //gắn layout tương ứng
        setContentView(R.layout.activity_main);
    }
    //đây là bộ lắng nghe và xửa lý sự kiện lick lên nut tính tông
    public void XuLyCong(View view) {
        // Tìm tham chiếu đến điều khiển trên tệp XML, mapping sang Java file
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextKetQua = findViewById(R.id.edtKQ);

        // Lấy dữ liệu từ điều khiển số a
        String strA = editTextSoA.getText().toString(); // strA = "2"

        // Lấy dữ liệu từ điều khiển số b
        String strB = editTextSoB.getText().toString(); // strB = "4"

        // Chuyển dữ liệu sang dạng số
        int so_A = Integer.parseInt(strA); // 2
        int so_B = Integer.parseInt(strB); // 4

        // Tính toán theo yêu cầu
        int tong = so_A + so_B; // 6
        String strTong = String.valueOf(tong); // Chuyển sang dạng chuỗi: "6"

        // Hiển thị ra màn hình
        editTextKetQua.setText(strTong);
    }


}