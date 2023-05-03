import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel{

    //Menu
    private JMenuBar menuBar = new JMenuBar();
    private JMenu LenguageMenu = new JMenu("Language");
    private JMenuItem RussiaMenuItem = new JMenuItem("Russia");
    private JMenuItem EnglishMenuItem = new JMenuItem("English");
    private JMenuItem EspanolMenuItem = new JMenuItem("Español");
    public static int plugMenu = 1;

    //Texts(JLabels)
    public static JLabel nameProgram = new JLabel("Перевод систем счисления", SwingConstants.CENTER);
    public static JLabel nameArticle_1 = new JLabel("Введите число:", SwingConstants.CENTER);
    public static JLabel nameArticle_2 = new JLabel("Из какой системы переводить:", SwingConstants.CENTER);
    public static JLabel nameArticle_3 = new JLabel("В какую систему переводить:", SwingConstants.CENTER);
    public static JLabel resultArticle = new JLabel("Результат:", SwingConstants.CENTER);
    public static JLabel resultText = new JLabel("", SwingConstants.CENTER);

    //TextFieldes (geters and seter)
    public static JTextField geterNum = new JTextField("");
    public static JTextField geterSystemNum = new JTextField("");
    public static JTextField geterTranslatorSystemNum = new JTextField("");

    //Buttons
    public static JButton enter = new JButton("ПОСЧИТАТЬ");
    public static JButton cleaner = new JButton("ОЧИСТИТЬ");

    //Fonts
    public static Font font_nameProgram = new Font("SanSerif", Font.BOLD, 24);
    public static Font font_result = new Font("SanSerif", Font.BOLD, 24);
    public static Font font_text = new Font("SanSerif", Font.BOLD, 24);
    public static Font font_displ = new Font("SanSerif", Font.BOLD, 20);
    public static Font font_3 = new Font("SanSerif", Font.BOLD, 18);

    //Colors
    private Color backgroundForProg = new Color(111, 184, 253);
    private Color color_1 = new Color(178, 217, 255, 255);
    public static Color colorText = new Color(0, 0, 0);
    public static Color error = new Color(255, 0, 0);

    public Panel(){
        setLayout(null);
        setBackground(backgroundForProg);

        creating_a_language_change_menu();
        Texts();
        TextFields();
        Buttons();
    }

    // function for creating drop downMenu
    private void creating_a_language_change_menu(){
        menuBar.setBounds(25, 0, 100, 50);
        menuBar.setBackground(color_1);
        add(menuBar);
        LenguageMenu.setBackground(color_1);
        LenguageMenu.setFont(font_3);
        menuBar.add(LenguageMenu);
        RussiaMenuItem.setBackground(color_1);
        RussiaMenuItem.setFont(font_3);
        LenguageMenu.add(RussiaMenuItem);
        EnglishMenuItem.setBackground(color_1);
        EnglishMenuItem.setFont(font_3);
        LenguageMenu.add(EnglishMenuItem);
        EspanolMenuItem.setBackground(color_1);
        EspanolMenuItem.setFont(font_3);
        LenguageMenu.add(EspanolMenuItem);

        ActionListener RussiaMenuItem_listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TransatorEvent.RussianL();
            }
        };

        ActionListener EnglishMenuItem_listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TransatorEvent.EnglishL();
            }
        };

        ActionListener EspanolMenuItem_listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TransatorEvent.EspanolL();
            }
        };

        RussiaMenuItem.addActionListener(RussiaMenuItem_listener);
        EnglishMenuItem.addActionListener(EnglishMenuItem_listener);
        EspanolMenuItem.addActionListener(EspanolMenuItem_listener);
    }

    // function for creating text headers
    private void Texts(){
        nameProgram.setBounds(0, 0, 700, 50);
        nameProgram.setFont(font_nameProgram);
        nameProgram.setForeground(colorText);
        nameProgram.setVisible(true);
        add(nameProgram);

        nameArticle_1.setBounds(0, 80, 700, 50);
        nameArticle_1.setFont(font_text);
        nameArticle_1.setForeground(colorText);
        nameArticle_1.setVisible(true);
        add(nameArticle_1);

        nameArticle_2.setBounds(0, 225, 700, 50);
        nameArticle_2.setFont(font_text);
        nameArticle_2.setForeground(colorText);
        nameArticle_2.setVisible(true);
        add(nameArticle_2);

        nameArticle_3.setBounds(0, 375, 700, 50);
        nameArticle_3.setFont(font_text);
        nameArticle_3.setForeground(colorText);
        nameArticle_3.setVisible(true);
        add(nameArticle_3);

        resultArticle.setBounds(0, 660, 700, 50);
        resultArticle.setFont(font_result);
        resultArticle.setForeground(colorText);
        resultArticle.setVisible(true);
        add(resultArticle);

        resultText.setBounds(0, 735, 700, 50);
        resultText.setFont(font_result);
        resultText.setForeground(colorText);
        resultText.setVisible(true);
        add(resultText);
    }

    // function for creating input fields
    private void TextFields(){
        geterNum.setBounds(100, 140, 500, 50);
        geterNum.setFont(font_displ);
        geterNum.setHorizontalAlignment(JTextField.CENTER);
        geterNum.setVisible(true);
        add(geterNum);

        geterSystemNum.setBounds(100, 290, 500, 50);
        geterSystemNum.setFont(font_displ);
        geterSystemNum.setHorizontalAlignment(JTextField.CENTER);
        geterSystemNum.setVisible(true);
        add(geterSystemNum);

        geterTranslatorSystemNum.setBounds(100, 430, 500, 50);
        geterTranslatorSystemNum.setFont(font_displ);
        geterTranslatorSystemNum.setHorizontalAlignment(JTextField.CENTER);
        geterTranslatorSystemNum.setVisible(true);
        add(geterTranslatorSystemNum);
    }

    // function for creating buttons and listeners for buttons
    private void Buttons(){
        enter.setBounds(250, 490, 200, 75);
        enter.setFont(font_text);
        enter.setVisible(true);
        add(enter);

        cleaner.setBounds(250, 580, 200, 75);
        cleaner.setFont(font_text);
        cleaner.setVisible(true);
        add(cleaner);

        ActionListener listener_enter = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EventsButtons.workTranslator();
            }
        };
        enter.addActionListener(listener_enter);

        ActionListener listener_cleaner = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EventsButtons.cleanTextFields();
            }
        };
        cleaner.addActionListener(listener_cleaner);
    }
}
