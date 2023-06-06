package de.nulide.shiftcal;

import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.uiautomator.UiDevice;

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
        // 10. Enter "Weekday" in the Name field - UI Automator
        // 11. Enter "WD" in the Short Name field - UI Automator
        // 12. Click the button of Start Time, click 9 then click OK - UI Automator
        // 13. Click the button of End Time, click 17 then click OK - UI Automator
        // 14. Click the ✓ icon - UI Automator
        // 15. Press back to return to the homepage - UI Automator
        // 16. Click the Edit icon in the bottom-right corner of the homepage - Espresso
        // 17. Click the S icon - Espresso
        // 18. Click "Weekday" - Espresso
        // 19. Click date 30 of January 2023 - UI Automator
        // 20. Click the ✓ icon - Espresso
        // 21. Click the Edit icon in the bottom-right corner of the homepage - UI Automator
        // 22. Click the WD icon - UI Automator
        // 23. Click "Delete" - UI Automator
        // 24. Click date 30 of January 2023 - UI Automator
        // 25. Click the ✓ icon - UI Automator
        // 26. Click the menu icon in the top-right corner - UI Automator
        // 27. Click "Shifts" - UI Automator
        // 28. Long click "Weekday" - Espresso
        // 29. Click "Delete" - Espresso
        // 30. Press back to return to the homepage - Espresso
        // 31. Click the menu icon in the top-right corner - UI Automator
        // 32. Click "Employers" - UI Automator
        // 33. Long click "Sheffield" - Espresso
        // 34. Click "Delete" - UI Automator
        // 35. Press back to return to the homepage - UI Automator
    }
}
