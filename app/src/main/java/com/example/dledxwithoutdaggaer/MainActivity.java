package com.example.dledxwithoutdaggaer;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private MessageService messageService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        messageService = new MessageService(this, "Hello!", "Good bye!!", "What's your name???");

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @OnClick(R.id.hi_button)
    public void hi() {

        messageService.sayHi();
    }

    @OnClick(R.id.bye_button)
    public void bye() {

        messageService.sayBye();
    }

    @OnClick(R.id.ask_button)
    public void ask() {

        messageService.askSomething();
    }
}