package id.ac.tau.studio.androidkejar.mainview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import id.ac.tau.studio.androidkejar.R;
import id.ac.tau.studio.androidkejar.maininteractor.InterfaceMain;
import id.ac.tau.studio.androidkejar.maininteractor.InterfacePresenter;

public class MainActivity extends AppCompatActivity implements InterfaceMain {

    private EditText mtextusername;
    private EditText mtextpassword;
    private Button mButtonLogin;
    private InterfacePresenter mInterfacePresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtextusername = (EditText) findViewById(R.id.txtnama);
        mtextpassword = (EditText) findViewById(R.id.txtpass);
        mButtonLogin = (Button) findViewById(R.id.btnlogin);

        mInterfacePresenter = new MainPresenter (this);
        mButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mInterfacePresenter.login(mtextusername.getText().toString(),
                        mtextpassword.getText().toString());
            }
        });
    }



    @Override
    public void showError() {

    }

    @Override
    public void MessageError() {
        Toast.makeText(this, " Username atau Password tidak boleh kosong", Toast.LENGTH_LONG);
    }

    @Override
    public void loginerror() {
        Toast.makeText(this, " Username atau Password salah", Toast.LENGTH_LONG);
    }

    @Override
    public void loginsucces() {
        Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
        intent.putExtra("username",mtextusername.getText().toString());
        startActivity(intent);
    }
}
