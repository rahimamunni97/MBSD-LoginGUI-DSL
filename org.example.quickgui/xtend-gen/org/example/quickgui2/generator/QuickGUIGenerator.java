package org.example.quickgui2.generator;

import com.google.common.collect.Iterators;
import java.util.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.example.quickgui2.quickGUI.Button;
import org.example.quickgui2.quickGUI.ButtonAction;
import org.example.quickgui2.quickGUI.Component;
import org.example.quickgui2.quickGUI.Field;
import org.example.quickgui2.quickGUI.FieldType;
import org.example.quickgui2.quickGUI.Program;

@SuppressWarnings("all")
public class QuickGUIGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Program program = IteratorExtensions.<Program>head(Iterators.<Program>filter(resource.getAllContents(), Program.class));
    if ((program != null)) {
      fsa.generateFile("GeneratedLogin.java", this.compile(program));
    }
  }

  public CharSequence compile(final Program program) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import javax.swing.*;");
    _builder.newLine();
    _builder.append("import java.awt.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class GeneratedLogin {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("JFrame frame = new JFrame(\"");
    String _title = program.getWindow().getTitle();
    _builder.append(_title, "        ");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("frame.setSize(350, 220);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("frame.setLocationRelativeTo(null);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("JPanel mainPanel = new JPanel();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("mainPanel.setBorder(");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("BorderFactory.createTitledBorder(");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("\"");
    String _title_1 = program.getWindow().getPanel().getTitle();
    _builder.append(_title_1, "                ");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append(")");
    _builder.newLine();
    _builder.append("        ");
    _builder.append(");");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("mainPanel.setLayout(");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("new GridLayout(0, 2, 10, 10)");
    _builder.newLine();
    _builder.append("        ");
    _builder.append(");");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Component> _components = program.getWindow().getPanel().getComponents();
      for(final Component c : _components) {
        {
          if ((c instanceof Field)) {
            _builder.append("        ");
            final Field f = ((Field) c);
            _builder.newLineIfNotEmpty();
            _builder.newLine();
            _builder.append("        ");
            _builder.append("JLabel ");
            String _name = f.getName();
            _builder.append(_name, "        ");
            _builder.append("Label =");
            _builder.newLineIfNotEmpty();
            _builder.append("        ");
            _builder.append("    ");
            _builder.append("new JLabel(\"");
            String _label = f.getLabel();
            _builder.append(_label, "            ");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
            {
              FieldType _type = f.getType();
              boolean _equals = Objects.equals(_type, FieldType.PASSWORD);
              if (_equals) {
                _builder.append("        ");
                _builder.append("JPasswordField ");
                String _name_1 = f.getName();
                _builder.append(_name_1, "        ");
                _builder.append("Field =");
                _builder.newLineIfNotEmpty();
                _builder.append("        ");
                _builder.append("    ");
                _builder.append("new JPasswordField(15);");
                _builder.newLine();
              } else {
                _builder.append("        ");
                _builder.append("JTextField ");
                String _name_2 = f.getName();
                _builder.append(_name_2, "        ");
                _builder.append("Field =");
                _builder.newLineIfNotEmpty();
                _builder.append("        ");
                _builder.append("    ");
                _builder.append("new JTextField(15);");
                _builder.newLine();
              }
            }
            _builder.newLine();
            _builder.append("        ");
            _builder.append("mainPanel.add(");
            String _name_3 = f.getName();
            _builder.append(_name_3, "        ");
            _builder.append("Label);");
            _builder.newLineIfNotEmpty();
            _builder.append("        ");
            _builder.append("mainPanel.add(");
            String _name_4 = f.getName();
            _builder.append(_name_4, "        ");
            _builder.append("Field);");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
      }
    }
    _builder.newLine();
    {
      EList<Component> _components_1 = program.getWindow().getPanel().getComponents();
      for(final Component c_1 : _components_1) {
        {
          if ((c_1 instanceof Button)) {
            _builder.append("        ");
            final Button b = ((Button) c_1);
            _builder.newLineIfNotEmpty();
            _builder.newLine();
            _builder.append("        ");
            _builder.append("JButton ");
            String _string = b.getAction().toString();
            _builder.append(_string, "        ");
            _builder.append("Button =");
            _builder.newLineIfNotEmpty();
            _builder.append("        ");
            _builder.append("    ");
            _builder.append("new JButton(\"");
            String _text = b.getText();
            _builder.append(_text, "            ");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
            {
              ButtonAction _action = b.getAction();
              boolean _equals_1 = Objects.equals(_action, ButtonAction.LOGIN);
              if (_equals_1) {
                _builder.append("        ");
                String _string_1 = b.getAction().toString();
                _builder.append(_string_1, "        ");
                _builder.append("Button.addActionListener(e ->");
                _builder.newLineIfNotEmpty();
                _builder.append("        ");
                _builder.append("    ");
                _builder.append("JOptionPane.showMessageDialog(");
                _builder.newLine();
                _builder.append("        ");
                _builder.append("        ");
                _builder.append("frame,");
                _builder.newLine();
                _builder.append("        ");
                _builder.append("        ");
                _builder.append("\"Login button clicked\"");
                _builder.newLine();
                _builder.append("        ");
                _builder.append("    ");
                _builder.append(")");
                _builder.newLine();
                _builder.append("        ");
                _builder.append(");");
                _builder.newLine();
              } else {
                _builder.append("        ");
                String _string_2 = b.getAction().toString();
                _builder.append(_string_2, "        ");
                _builder.append("Button.addActionListener(e ->");
                _builder.newLineIfNotEmpty();
                _builder.append("        ");
                _builder.append("    ");
                _builder.append("frame.dispose()");
                _builder.newLine();
                _builder.append("        ");
                _builder.append(");");
                _builder.newLine();
              }
            }
            _builder.newLine();
            _builder.append("        ");
            _builder.append("mainPanel.add(");
            _builder.newLine();
            _builder.append("        ");
            _builder.append("    ");
            String _string_3 = b.getAction().toString();
            _builder.append(_string_3, "            ");
            _builder.append("Button");
            _builder.newLineIfNotEmpty();
            _builder.append("        ");
            _builder.append(");");
            _builder.newLine();
            _builder.newLine();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("        ");
    _builder.append("frame.add(mainPanel);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("frame.setVisible(true);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
