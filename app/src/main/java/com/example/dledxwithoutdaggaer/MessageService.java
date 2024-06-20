package com.example.dledxwithoutdaggaer;

import android.content.Context;
import android.widget.Toast;

public class MessageService {

    private Context context;
    private String hi;
    private String bye;
    private String question;

    public MessageService(Context _context, String _hi, String _bye, String _question) {

        this.context = _context;
        this.hi = _hi;
        this.bye = _bye;
        this.question = _question;

    }

    public void sayHi() {
        Toast.makeText(context, hi, Toast.LENGTH_SHORT).show();
    }

    public void sayBye() {

        Toast.makeText(context, bye, Toast.LENGTH_SHORT).show();
    }

    public void askSomething() {

        Toast.makeText(context, question, Toast.LENGTH_SHORT).show();
    }

}
