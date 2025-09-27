package com.example.btcn_tuan2;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class QAPage extends AppCompatActivity {

    Button btnA, btnB, btnC, btnD;
    boolean isAnswered = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qapage);

        btnA = findViewById(R.id.btnA);
        btnB = findViewById(R.id.btnB);
        btnC = findViewById(R.id.btnC);
        btnD = findViewById(R.id.btnD);

        // Câu trả lời đúng là D
        btnA.setOnClickListener(v -> handleAnswer(btnA, false));
        btnB.setOnClickListener(v -> handleAnswer(btnB, false));
        btnC.setOnClickListener(v -> handleAnswer(btnC, false));
        btnD.setOnClickListener(v -> handleAnswer(btnD, true));
    }

    private void handleAnswer(Button selectedButton, boolean isCorrect) {// Đã chọn thì không xử lý nữa

        if (isCorrect) {
            selectedButton.setBackgroundColor(Color.GREEN);
        } else {
            selectedButton.setBackgroundColor(Color.RED);
        }

        // Ẩn màu đỏ nếu chọn đúng (chỉ hiện màu xanh)
        if (isCorrect) {
            btnA.setBackgroundColor(Color.TRANSPARENT);
            btnB.setBackgroundColor(Color.TRANSPARENT);
            btnC.setBackgroundColor(Color.TRANSPARENT);
            btnD.setBackgroundColor(Color.TRANSPARENT);
            selectedButton.setBackgroundColor(Color.GREEN);
        }

    }
}
