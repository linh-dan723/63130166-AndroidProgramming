package tiil.edu.appcong;



import android.app.Activity;
import android.graphics.Insets;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

// Cách Activity as Listener
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnSayHello = findViewById(R.layout);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}


    // 2.1 Listener in Variable
// B1 + B2
    View.OnClickListener bo_lang_nghe_XL_XinChao = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Code xử lý ở đây
            // Ví dụ, hiển thông báo nhanh bằng lớp Toast
            // Toast.makeText(ngữ cảnh, nội dung Tbao, thời gian hiện).show();
            Toast.makeText(MainActivity.this,
                    "Chào all HTTT và các bạn",
                    Toast.LENGTH_LONG).show();
        }
    };

    //đây là bộ lắng nghe và xửa lý sự kiện lick lên nut tính tông
    public void XuLyCong(View view) {
        // Tìm tham chiếu đến điều khiển trên tệp XML, mapping sang Java file
        EditText editTextSoA = editTextSoA.findViewById(R.id.edtA);
        EditText editTextSoB = editTextSoB.findViewById(R.id.edtB);
        EditText editTextKetQua = editTextKetQua.findViewById(R.id.edtKQ);

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