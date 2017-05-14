package id.ac.tau.studio.androidkejar.mainview;

import android.text.TextUtils;

import id.ac.tau.studio.androidkejar.maininteractor.InterfaceMain;
import id.ac.tau.studio.androidkejar.maininteractor.InterfacePresenter;

/**
 * Created by Farlian22 on 13/05/2017.
 */

public class MainPresenter  implements InterfacePresenter {

    private InterfaceMain mInterfaceMain;

    public MainPresenter(InterfaceMain mInterfaceMain) {
        this.mInterfaceMain = mInterfaceMain;
    }

    @Override
    public void login(String username, String password) {
        if (TextUtils.isEmpty(username)|| TextUtils.isEmpty(password)){
            mInterfaceMain.MessageError();
        } else {
            if (username.equals("aji")&&(password.equals("aji"))){
                mInterfaceMain.loginsucces();
            }else {
                mInterfaceMain.loginerror();
            }
        }
    }
}
