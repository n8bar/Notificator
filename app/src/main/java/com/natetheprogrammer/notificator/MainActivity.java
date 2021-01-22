package com.natetheprogrammer.notificator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Notification;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class MainActivity extends AppCompatActivity {
    
    private NotificationManagerCompat nMC;
    private EditText etTitle;
    private EditText etMessage;
    private Button bCh1;
    private Button bCh2;
            
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                
        etTitle=(EditText) findViewById(R.id.editText_title);
        etMessage=(EditText) findViewById(R.id.editText_message);
        bCh1=(Button) findViewById(R.id.bCh1);
        bCh2=(Button) findViewById(R.id.bCh2);
        
        nMC = NotificationManagerCompat.from(this);
    }

    public void bCh1Click(View view) {
        String title = etTitle.getText().toString();
        String message = etMessage.getText().toString();

        Notification notification = new NotificationCompat.Builder(this, Notificator.CHANNEL_1_ID)
                .setSmallIcon(R.drawable.icon_notify1)
                .setContentTitle(title)
                .setContentText(message)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();

        int notificationId = 1;
        nMC.notify(notificationId, notification);    }
        
    public void bCh2Click(View view) {
        String title = etTitle.getText().toString();
        String message = etMessage.getText().toString();

        Notification notification = new NotificationCompat.Builder(this, Notificator.CHANNEL_2_ID)
                .setSmallIcon(R.drawable.icon_notify2)
                .setContentTitle(title)
                .setContentText(message)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();

        int notificationId = 2;
        nMC.notify(notificationId, notification);
    }
    
}