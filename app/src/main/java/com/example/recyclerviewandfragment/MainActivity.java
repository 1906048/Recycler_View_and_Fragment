package com.example.recyclerviewandfragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  implements PersonAdapter.Itemclicked {

    Button btn;
    EditText edtName,edtTel;
    TextView tvName,tvTel;
     ListFrag listFrag;
     FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager=this.getSupportFragmentManager();
        listFrag=(ListFrag)fragmentManager.findFragmentById(R.id.list);

        btn=findViewById(R.id.btn);
        edtName=findViewById(R.id.edtname);
        edtTel=findViewById(R.id.edttel);
        tvName=findViewById(R.id.tvName);
        tvTel=findViewById(R.id.tvtel);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if(edtName.getText().toString().isEmpty()||edtTel.getText().toString().isEmpty()){
                  Toast.makeText(MainActivity.this,"Please Enter all Fields ",Toast.LENGTH_SHORT).show();
              }
              else {
                  MyPeople.people.add(new Person(edtName.getText().toString(),edtTel.getText().toString()));
                  listFrag.notifydata();
              }
            }
        });

    }

    @Override
    public void OnItemclicked(int index) {
        tvName.setText(MyPeople.people.get(index).getName());
         tvTel.setText(MyPeople.people.get(index).getTel());
    }
}
