package org.example.quickgui2.validation;

import org.eclipse.xtext.validation.Check;
import org.example.quickgui2.quickGUI.Window;
import org.example.quickgui2.quickGUI.Field;
import org.example.quickgui2.quickGUI.Button;
import org.example.quickgui2.quickGUI.QuickGUIPackage;

public class QuickGUIValidator extends AbstractQuickGUIValidator {

    @Check
    public void checkWindowTitle(Window window) {
        if (window.getTitle().trim().isEmpty()) {
            error(
                "Window title cannot be empty",
                QuickGUIPackage.Literals.WINDOW__TITLE
            );
        }
    }

    @Check
    public void checkFieldName(Field field) {
        if (field.getName().trim().isEmpty()) {
            error(
                "Field name cannot be empty",
                QuickGUIPackage.Literals.FIELD__NAME
            );
        }
    }

    @Check
    public void checkButtonText(Button button) {
        if (button.getText().trim().isEmpty()) {
            error(
                "Button text cannot be empty",
                QuickGUIPackage.Literals.BUTTON__TEXT
            );
        }
    }
}