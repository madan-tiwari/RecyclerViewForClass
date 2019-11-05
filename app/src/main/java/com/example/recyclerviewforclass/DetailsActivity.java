package com.example.recyclerviewforclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailsActivity extends AppCompatActivity {

    CircleImageView imgContacts;
    TextView tvfullname, tvPhoneNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imgContacts=findViewById(R.id.imgContacts);
        tvfullname=findViewById(R.id.tvfullname);
        tvPhoneNo=findViewById(R.id.tvCphone);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            imgContacts.setImageResource(bundle.getInt("image"));
            tvfullname.setText(bundle.getString("name"));
            tvPhoneNo.setText(bundle.getString("phone"));
        }
    }
}