package tiil.edu.manhinhdongian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button nutMH2, nutMH3; // Đổi tên biến cho dễ hiểu

    void TimDieuKhien() {
        nutMH2 = findViewById(R.id.btnMH2);
        nutMH3 = findViewById(R.id.btnMH3);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tìm điều khiển nút bấm
        TimDieuKhien();

        // Gán sự kiện cho nút MH2
        nutMH2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMH2 = new Intent(MainActivity.this, ActivityMH2.class);
                startActivity(intentMH2);
            }
        });

        // Gán sự kiện cho nút MH3
        nutMH3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentMH3 = new Intent(MainActivity.this, ActivityMH3.class);
                startActivity(intentMH3);
            }
        });
    }
}
