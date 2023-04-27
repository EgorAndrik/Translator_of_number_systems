import javax.swing.*;

public class Main {
    public static void creatTranslator_of_number_systems(){
        JFrame TranslatorSystems = new JFrame("Translator of number systems");
        TranslatorSystems.setSize(700, 900);
        TranslatorSystems.setResizable(false);
        TranslatorSystems.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TranslatorSystems.setContentPane(new Panel());
        TranslatorSystems.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                creatTranslator_of_number_systems();
            }
        });
    }
}