package id.ac.tau.studio.androidkejar.mainview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

import id.ac.tau.studio.androidkejar.R;
import id.ac.tau.studio.androidkejar.adapter.HomeAdapter;
import id.ac.tau.studio.androidkejar.mainhome.HomePresenter;
import id.ac.tau.studio.androidkejar.maininteractor.HomeInterface;
import id.ac.tau.studio.androidkejar.model.HomeModel;

public class HomeActivity extends AppCompatActivity {

    private TextView mTextUsername;
    private RecyclerView mRecylerView;
    private HomeAdapter mHomeAdapter;
    private HomeInterface mHomeInterface;
    private ArrayList<HomeModel> mHomeModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mTextUsername = (TextView) findViewById(R.id.txtusername);

        Intent mIntent = getIntent();
        String username = mIntent.getStringExtra("username");
        mTextUsername.setText(username);

        mHomeInterface = new HomePresenter(this);
        mHomeModel = new ArrayList<>();
        mHomeInterface.showList(mHomeModel);
        initView();

    }

    private void initView(){

        mRecylerView = (RecyclerView) findViewById(R.id.list_item);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(HomeActivity.this);
        mRecylerView.setLayoutManager(layoutManager);
        mRecylerView.setHasFixedSize(true);
        mHomeAdapter = new HomeAdapter(mHomeModel, this);
        mRecylerView.setAdapter(mHomeAdapter);
    }
}
