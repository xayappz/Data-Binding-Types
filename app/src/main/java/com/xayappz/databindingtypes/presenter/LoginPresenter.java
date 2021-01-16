package com.xayappz.databindingtypes.presenter;

import android.view.View;
import com.xayappz.databindingtypes.model.LoginModel;

public class LoginPresenter {

    public View.OnClickListener login(final LoginModel loginModel) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginModel.login(loginModel);
            }
        };
    }

    public View.OnClickListener reset(final LoginModel loginModel) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginModel.reset();
            }
        };
    }
}
