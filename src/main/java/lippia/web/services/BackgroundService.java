package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;

import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.PracticeAutomationTestingContants.*;

public class BackgroundService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickMyAccount(){
        click(BTN_MYACCOUNT_ID);
    }
}
