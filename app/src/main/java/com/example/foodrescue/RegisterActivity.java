package com.example.foodrescue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    DBHelper DB;
    Button button;
    EditText password,name,email,Phone,address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
//        name = (EditText) findViewById(R.id.username);
//        password = (EditText) findViewById(R.id.password);
//        email = (EditText) findViewById(R.id.txtmail);
//        Phone = (EditText)findViewById(R.id.txtphone);
//        address = (EditText) findViewById(R.id.txtaddress);
//        button = (Button) findViewById(R.id.btnsignin);
//        DB = new DBHelper(this);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String user = name.getText().toString();
//                String pass = password.getText().toString();
//
//                if(user.equals("")||pass.equals(""))
//                    Toast.makeText(RegisterActivity.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
//                else{
//                    if(pass.equals(repass)){
//                        Boolean checkuser = DB.checkusername(user);
//                        if(checkuser==false){
//                            Boolean insert = DB.insertData(user, pass);
//                            if(insert==true){
//                                Toast.makeText(RegisterActivity.this, "Registered successfully", Toast.LENGTH_SHORT).show();
//                                Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
//                                startActivity(intent);
//                            }else{
//                                Toast.makeText(RegisterActivity.this, "Registration failed", Toast.LENGTH_SHORT).show();
//                            }
//                        }
//                        else{
//                            Toast.makeText(RegisterActivity.this, "User already exists! please sign in", Toast.LENGTH_SHORT).show();
//                        }
//                    }else{
//                        Toast.makeText(RegisterActivity.this, "Passwords not matching", Toast.LENGTH_SHORT).show();
//                    }
//                } }
//        });
//
//        signin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}
//        openHelper = new DBHelper(this);
//        name = (EditText)findViewById(R.id.txtname);
//        email = (EditText)findViewById(R.id.txtmail);
//        Phone = (EditText)findViewById(R.id.txtphone);
//        address = (EditText)findViewById(R.id.txtaddress);
//        password = (EditText)findViewById(R.id.txtpassword);
//        button=(Button)findViewById(R.id.buttonn);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                db=openHelper.getWritableDatabase();
//                String fname=name.getText().toString();
//                String emaill=email.getText().toString();
//                String phonee=Phone.getText().toString();
//                String addresss=address.getText().toString();
//                String passwordd=password.getText().toString();
////                DBHelper.insertdata(fname, emaill,phonee,addresss,passwordd);
//                Toast.makeText(getApplicationContext(), "register successfully",Toast.LENGTH_LONG).show();
//
//            }
//        });
//
//    }
//
//}
