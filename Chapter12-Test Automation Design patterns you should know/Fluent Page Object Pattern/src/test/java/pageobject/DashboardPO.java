package pageobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


/**
 * Year: 2018-19
 *
 * @author Prat3ik on 23/11/18
 * @project POM_Automation_Framework
 */
public class DashboardPO extends BasePO {
    /**
     * A base constructor that sets the page's driver
     * <p>
     * The page structure is being used within this test in order to separate the
     * page actions from the tests.
     * <p>
     * Please use the AppiumFieldDecorator class within the page factory. This way annotations
     * like @AndroidFindBy within the page objects.
     *
     * @param driver the appium driver created in the beforesuite method.
     */
    public DashboardPO(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "logout_textview")
    AndroidElement logoutTextView;

    /**
     * This method will click on Logout textview.
     */
    public void tapOnLogoutTextView() {
        logoutTextView.click();
    }

}
