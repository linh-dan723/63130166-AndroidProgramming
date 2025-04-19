package tiil.edu.a63130166_gk;  // Thay bằng package của bạn

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Chucnang3 extends AppCompatActivity {

    private EditText edtDay, edtMonth, edtYear;
    private Button btnCheck;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chucnang3);

        // Gọi hàm khởi tạo View
        initViews();
    }

    // Hàm khởi tạo View
    private void initViews() {
        edtDay = findViewById(R.id.edtYear);
        edtMonth = findViewById(R.id.edtYear);
        edtYear = findViewById(R.id.edtYear);
        btnCheck = findViewById(R.id.btnFunction3);
        txtResult = findViewById(R.id.txtTitle);

        // Xử lý sự kiện nhấn nút
        btnCheck.setOnClickListener(v -> checkAnswer());
    }

    // Hàm kiểm tra câu trả lời
    private void checkAnswer() {
        String day = edtDay.getText().toString().trim();
        String month = edtMonth.getText().toString().trim();
        String year = edtYear.getText().toString().trim();

        if (day.equals("30") && month.equals("4") && year.equals("1975")) {
            txtResult.setText("Chính xác! Chiến dịch Hồ Chí Minh kết thúc ngày 30/4/1975.");
            txtResult.setTextColor(getResources().getColor(android.R.color.holo_green_dark));
        } else {
            txtResult.setText("Sai! Hãy thử lại.");
            txtResult.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
        }
    }
}
