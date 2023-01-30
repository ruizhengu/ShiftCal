package de.nulide.shiftcal;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.longClick;
import static androidx.test.espresso.action.ViewActions.pressImeActionButton;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;

import android.view.KeyEvent;

import androidx.test.espresso.action.ViewActions;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.Until;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class TestSuite {

    @Rule
    public ActivityScenarioRule<CalendarActivity> activityScenarioRule = new ActivityScenarioRule<>(CalendarActivity.class);

    /**
     * The application is a calendar for managing your employers and shifts.
     * <p>
     * You are required to implement the test case by the instruction and the corresponding tools.
     * <p>
     * Example - Click the menu icon in the top-right corner - Espresso
     * You must use Espresso to implement this step.
     */

    UiDevice device = UiDevice.getInstance(getInstrumentation());

    @Test
    public void setShifts() {
        // 1. Click the menu icon in the top-right corner - Espresso
        // 2. Click "Employers" - Espresso
        // 3. Click the + icon on the bottom-right corner - Espresso
        // 4. Enter "Sheffield" in the Name field (then press enter on the keyboard) - Espresso
        // 5. Click the ✓ icon - Espresso
        // 6. Press back to return to the homepage - Espresso
        // 7. Click the menu icon in the top-right corner - Espresso
        // 8. Click "Shifts" - Espresso
        // 9. Click the + icon on the bottom-right corner - Espresso
        // 10. Enter "Weekday" in the Name field - UIAutomator
        // 11. Enter "WD" in the Short Name field - UIAutomator
        // 12. Click the button of Start Time, click 9 then click OK - UIAutomator
        // 13. Click the button of End Time, click 17 then click OK - UIAutomator
        // 14. Click the ✓ icon - UIAutomator
        // 15. Press back to return to the homepage - UIAutomator
        // 16. Click the Edit icon in the bottom-right corner of the homepage - Espresso
        // 17. Click the S icon - Espresso
        // 18. Click "Weekday" - Espresso
        // 19. Click date 30 of January 2023 - UIAutomator
        // 20. Click the ✓ icon - Espresso
        // 21. Click the Edit icon in the bottom-right corner of the homepage - UIAutomator
        // 22. Click the WD icon - UIAutomator
        // 23. Click "Delete" - UIAutomator
        // 24. Click date 30 of January 2023 - UIAutomator
        // 25. Click the ✓ icon - UIAutomator
        // 26. Click the menu icon in the top-right corner - UIAutomator
        // 27. Click "Shifts" - UIAutomator
        // 28. Long click "Weekday" - Espresso
        // 29. Click "Delete" - Espresso
        // 30. Press back to return to the homepage - Espresso
        // 31. Click the menu icon in the top-right corner - UIAutomator
        // 32. Click "Employers" - UIAutomator
        // 33. Long click "Sheffield" - Espresso
        // 34. Click "Delete" - UIAutomator
        // 35. Press back to return to the homepage - UIAutomator
    }
}
