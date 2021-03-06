package iqq.app.ui;

import com.alee.laf.WebLookAndFeel;
import iqq.app.core.context.IMContext;
import iqq.app.ui.frame.LoginFrame;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

/**
 * Project  : iqq
 * Author   : 承∮诺 < 6208317@qq.com >
 * Created  : 14-4-16
 * License  : Apache License 2.0
 */
public class TestLogin {

    @Before
    public void before() {
        IMContext.getIoc();
        WebLookAndFeel.install();
    }

    @Test
    public void testLoginBg() {
        LoginFrame login = new LoginFrame(IMContext.me());
        new Scanner(System.in).next();
    }
}
