package org.example.quickgui2.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.example.quickgui2.quickGUI.Program
import org.example.quickgui2.quickGUI.Field
import org.example.quickgui2.quickGUI.Button
import org.example.quickgui2.quickGUI.FieldType
import org.example.quickgui2.quickGUI.ButtonAction

class QuickGUIGenerator extends AbstractGenerator {

override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

    val program = resource.allContents.filter(Program).head

    if (program !== null) {
        fsa.generateFile("GeneratedLogin.java", program.compile)
    }
}

def compile(Program program) '''
    import javax.swing.*;
    import java.awt.*;

    public class GeneratedLogin {

        public static void main(String[] args) {

            JFrame frame = new JFrame("«program.window.title»");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(350, 220);
            frame.setLocationRelativeTo(null);

            JPanel mainPanel = new JPanel();
            mainPanel.setBorder(
                BorderFactory.createTitledBorder(
                    "«program.window.panel.title»"
                )
            );

            mainPanel.setLayout(
                new GridLayout(0, 2, 10, 10)
            );

            «FOR c : program.window.panel.components»
                «IF c instanceof Field»
                    «val f = c as Field»

                    JLabel «f.name»Label =
                        new JLabel("«f.label»");

                    «IF f.type == FieldType.PASSWORD»
                        JPasswordField «f.name»Field =
                            new JPasswordField(15);
                    «ELSE»
                        JTextField «f.name»Field =
                            new JTextField(15);
                    «ENDIF»

                    mainPanel.add(«f.name»Label);
                    mainPanel.add(«f.name»Field);

                «ENDIF»
            «ENDFOR»

            «FOR c : program.window.panel.components»
                «IF c instanceof Button»
                    «val b = c as Button»

                    JButton «b.action.toString»Button =
                        new JButton("«b.text»");

                    «IF b.action == ButtonAction.LOGIN»
                        «b.action.toString»Button.addActionListener(e ->
                            JOptionPane.showMessageDialog(
                                frame,
                                "Login button clicked"
                            )
                        );
                    «ELSE»
                        «b.action.toString»Button.addActionListener(e ->
                            frame.dispose()
                        );
                    «ENDIF»

                    mainPanel.add(
                        «b.action.toString»Button
                    );

                «ENDIF»
            «ENDFOR»

            frame.add(mainPanel);
            frame.setVisible(true);
        }
    }
'''

}
