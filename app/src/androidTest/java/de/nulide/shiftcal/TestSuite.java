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
     */

    @Test
    public void setShifts() {
        // 1. Click the menu icon in the top-right corner.
        // 2. Click "Employers".
        // 3. Click the + icon on the bottom-right corner.
        // 4. Enter "Sheffield" in the Name field (then press enter on the keyboard).
        // 5. Click the ✓ icon.
        // 6. Press back to return to the homepage.
        // 7. Click the menu icon in the top-right corner.
        // 8. Click "Shifts".
        // 9. Click the + icon on the bottom-right corner.
        // 10. Enter "Weekday" in the Name field (then press enter on the keyboard).
        // 11. Enter "WD" in the Short Name field (then press enter on the keyboard).
        // 12. Click the button of Start Time, click 9 then click OK.
        // 13. Click the button of End Time, click 17 then click OK.
        // 14. Click the ✓ icon.
        // 15. Press back to return to the homepage.
        // 16. Click the Edit icon in the bottom-right corner of the homepage.
        // 17. Click the S icon.
        // 18. Click "Weekday".
        // 19. Click date 30 of January 2023.
        // 20. Click the ✓ icon.
        // 21. Click the Edit icon in the bottom-right corner of the homepage.
        // 22. Click the WD icon.
        // 23. Click "Delete".
        // 24. Click date 30 of January 2023.
        // 25. Click the ✓ icon.
        // 26. Click the menu icon in the top-right corner.
        // 27. Click "Shifts".
        // 28. Long click "Weekday".
        // 29. Click "Delete".
        // 30. Press back to return to the homepage.
        // 31. Click the menu icon in the top-right corner.
        // 32. Click "Employers".
        // 33. Long click "Sheffield".
        // 34. Click "Delete".
        // 35. Press back to return to the homepage.
    }
}
