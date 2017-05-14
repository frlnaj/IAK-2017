package id.ac.tau.studio.androidkejar.mainhome;

import android.content.Context;

import java.util.ArrayList;

import id.ac.tau.studio.androidkejar.maininteractor.HomeInterface;
import id.ac.tau.studio.androidkejar.model.HomeModel;


/**
 * Created by Farlian22 on 14/05/2017.
 */

public class HomePresenter implements HomeInterface {

    private Context mContext;
    private ArrayList<HomeModel> mHomeModel;

    public HomePresenter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public void showList(ArrayList<HomeModel> homeModels) {

        mHomeModel = homeModels;
        mHomeModel.add(new HomeModel("irwan","pamulang","irwan@gmail.com","081945396231"));
        mHomeModel.add(new HomeModel("Aji","Lilangan","aji@gmail.com","081945461055"));
        mHomeModel.add(new HomeModel("Farlian","Lilangan","farlian@gmail.com","085945461055"));
        mHomeModel.add(new HomeModel("Lusy","Pangkal Pinang","lusy@gmail.com","085687904561"));
    }
}
