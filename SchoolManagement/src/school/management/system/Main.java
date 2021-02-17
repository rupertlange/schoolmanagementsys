package school.management.system;

import javax.swing.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SchoolMGMTGUI myGUI = new SchoolMGMTGUI();
                myGUI.setVisible(true);
            }
        });
    }

}