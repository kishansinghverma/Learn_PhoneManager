package com.example.learn_phonemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.github.tamir7.contacts.Contact;
import com.github.tamir7.contacts.Contacts;
import com.github.tamir7.contacts.Query;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Contacts.initialize(this);
        Query q=Contacts.getQuery();
        q.whereContains(Contact.Field.PhoneNumber, "14140");

        List<Contact> contacts = q.find();
        for(Contact contact:contacts){
            Log.d("Custom", contact.getDisplayName());
        }
    }
}
