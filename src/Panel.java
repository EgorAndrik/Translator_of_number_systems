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
    private int plugMenu = 1;

    //Texts(JLabels)
    private JLabel nameProgram = new JLabel("Перевод систем счисления", SwingConstants.CENTER);
    private JLabel nameArticle_1 = new JLabel("Введите число:", SwingConstants.CENTER);
    private JLabel nameArticle_2 = new JLabel("Из какой системы переводить:", SwingConstants.CENTER);
    private JLabel nameArticle_3 = new JLabel("В какую систему переводить:", SwingConstants.CENTER);
    private JLabel resultArticle = new JLabel("Результат:", SwingConstants.CENTER);
    private JLabel resultText = new JLabel("", SwingConstants.CENTER);

    //TextFieldes (geters and seter)
    private JTextField geterNum = new JTextField("");
    private JTextField geterSystemNum = new JTextField("");
    private JTextField geterTranslatorSystemNum = new JTextField("");

    //Buttons
    private JButton enter = new JButton("ПОСЧИТАТЬ");
    private JButton cleaner = new JButton("ОЧИСТИТЬ");

    //Fonts
    private Font font_nameProgram = new Font("SanSerif", Font.BOLD, 24);
    private Font font_result = new Font("SanSerif", Font.BOLD, 24);
    private Font font_text = new Font("SanSerif", Font.BOLD, 24);
    private Font font_displ = new Font("SanSerif", Font.BOLD, 20);
    private Font font_3 = new Font("SanSerif", Font.BOLD, 18);

    //Colors
    private Color backgroundForProg = new Color(111, 184, 253);
    private Color color_1 = new Color(178, 217, 255, 255);
    private Color colorText = new Color(0, 0, 0);
    private Color error = new Color(255, 0, 0);

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
                RussianL();
            }
        };

        ActionListener EnglishMenuItem_listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EnglishL();
            }
        };

        ActionListener EspanolMenuItem_listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EspanolL();
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
                workTranslator();
            }
        };
        enter.addActionListener(listener_enter);

        ActionListener listener_cleaner = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cleanTextFields();
            }
        };
        cleaner.addActionListener(listener_cleaner);
    }

    // events for buttons
    private void workTranslator(){
        String num = geterNum.getText() + "", systemNum = geterSystemNum.getText() + "",
                translatorSystemNum = geterTranslatorSystemNum.getText() + "";
        if(completion(num) && completion(systemNum) && completion(translatorSystemNum)){
            if(correctSys(systemNum) && correctNum(num) && correctSys(translatorSystemNum)){
                if(correctSys_and_Num(num, systemNum)){
                    int sysFirst = Integer.valueOf(systemNum), sysSecond = Integer.valueOf(translatorSystemNum);
                    String alpha = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ", res = "";
                    num = new StringBuilder(num).reverse().toString();
                    num = num.toUpperCase();
                    int n = 0;
                    for (int i = 0; i < num.length(); i++){
                        n += alpha.indexOf(num.charAt(i)) * (int) Math.pow(sysFirst, i);
                    }
                    while(n > 0){
                        res = alpha.charAt(n % sysSecond) + res;
                        n /= sysSecond;
                    }
                    resultText.setForeground(colorText);
                    resultText.setText(res);
                }
                else{
                    resultText.setForeground(error);
                    if (plugMenu == 1)
                        resultText.setText("Не корректно выбрана система для числа");
                    else if (plugMenu == 2)
                        resultText.setText("Incorrect system selected for number");
                    else
                        resultText.setText("Sistema incorrecto seleccionado para el número");
                }
            }
            else{
                if (plugMenu == 1) {
                    if (!correctNum(num))
                        resultText.setText("Не корректно введено число");
                    else if (!correctSys(systemNum) || !correctSys(translatorSystemNum))
                        resultText.setText("Не корректно введена система");
                    resultText.setForeground(error);
                }
                else if (plugMenu == 2){
                    if (!correctNum(num))
                        resultText.setText("Number entered incorrectly");
                    else if (!correctSys(systemNum) || !correctSys(translatorSystemNum))
                        resultText.setText("System entered incorrectly");
                    resultText.setForeground(error);
                }
                else{
                    if (!correctNum(num))
                        resultText.setText("Número ingresado incorrectamente");
                    else if (!correctSys(systemNum) || !correctSys(translatorSystemNum))
                        resultText.setText("Sistema ingresado incorrectamente");
                    resultText.setForeground(error);
                }
            }
        }
        else{
            if (plugMenu == 1) {
                if (!completion(num) && !completion(systemNum) && !completion(translatorSystemNum))
                    resultText.setText("Заполните все поля");
                else if (!completion(num))
                    resultText.setText("Введите число");
                else if (!completion(systemNum))
                    resultText.setText("Введите систему в которой записано число");
                else
                    resultText.setText("Введите систему в которую надо переводить");
                resultText.setForeground(error);
            }
            else if (plugMenu == 2){
                if (!completion(num) && !completion(systemNum) && !completion(translatorSystemNum))
                    resultText.setText("Fill in all the fields");
                else if (!completion(num))
                    resultText.setText("Enter the number");
                else if (!completion(systemNum))
                    resultText.setText("Enter the system in which the number is written");
                else
                    resultText.setText("Enter the system to which you want to transfer");
                resultText.setForeground(error);
            }
            else{
                if (!completion(num) && !completion(systemNum) && !completion(translatorSystemNum))
                    resultText.setText("Rellena todos los campos");
                else if (!completion(num))
                    resultText.setText("Introduce el número");
                else if (!completion(systemNum))
                    resultText.setText("Ingrese el sistema en el que está escrito el número");
                else
                    resultText.setText("Ingrese el sistema al que desea transferir");
                resultText.setForeground(error);
            }
        }
    }
    private void cleanTextFields(){
        geterNum.setText("");
        geterSystemNum.setText("");
        geterTranslatorSystemNum.setText("");
        resultText.setText("");
    }

    // boolean functions for examination
    private boolean completion(String textField){
        if (textField.length() > 0)
            return true;
        return false;
    }
    private boolean correctSys(String SystemChisl){
        String alpha = "0123456789";
        for(int i = 0; i < SystemChisl.length(); i++)
            if(!alpha.contains(SystemChisl.charAt(i) + ""))
                return false;
        if (Integer.valueOf(SystemChisl + "") <= 1 || Integer.valueOf(SystemChisl + "") >= 37)
            return false;
        return true;
    }
    private boolean correctNum(String Num){
        String alpha = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Num = Num.toUpperCase();
        for(int i = 0; i < Num.length(); i++)
            if (!alpha.contains(Num.charAt(i) + ""))
                return false;
        return true;
    }
    private boolean correctSys_and_Num(String num, String SysChisl){
        String alpha = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int SysCh = Integer.valueOf(SysChisl + "");
        for(int i = 0; i < num.length(); i++)
            if (alpha.indexOf(num.charAt(i) + "") >= SysCh)
                return false;
        return true;
    }

    // function for creating Language translation events
    private void RussianL(){
        nameProgram.setText("Перевод систем счисления");
        nameArticle_1.setText("Введите число:");
        nameArticle_2.setText("Из какой системы переводить:");
        nameArticle_3.setText("В какую систему переводить:");
        resultArticle.setText("Результат:");
        enter.setText("ПОСЧИТАТЬ");
        cleaner.setText("ОЧИСТИТЬ");
        plugMenu = 1;
        if (!numer(resultText.getText() + "") && resultText.getText().length() > 0){
            switch (resultText.getText() + ""){
                case "Fill in all the fields":
                    resultText.setText("Заполните все поля");
                    break;
                case "Rellena todos los campos":
                    resultText.setText("Заполните все поля");
                    break;
                case "Enter the number":
                    resultText.setText("Введите число");
                    break;
                case "Introduce el número":
                    resultText.setText("Введите число");
                    break;
                case "Enter the system in which the number is written":
                    resultText.setText("Введите систему в которой записано число");
                    break;
                case "Ingrese el sistema en el que está escrito el número":
                    resultText.setText("Введите систему в которой записано число");
                    break;
                case "Enter the system to which you want to transfer":
                    resultText.setText("Введите систему в которую надо переводить");
                    break;
                case "Ingrese el sistema al que desea transferir":
                    resultText.setText("Введите систему в которую надо переводить");
                    break;
                case "Number entered incorrectly":
                    resultText.setText("Не корректно введено число");
                    break;
                case "Número ingresado incorrectamente":
                    resultText.setText("Не корректно введено число");
                    break;
                case "System entered incorrectly":
                    resultText.setText("Не корректно введена система");
                    break;
                case "Sistema ingresado incorrectamente":
                    resultText.setText("Не корректно введена система");
                    break;
                case "Incorrect system selected for number":
                    resultText.setText("Не корректно выбрана система для числа");
                    break;
                case "Sistema incorrecto seleccionado para el número":
                    resultText.setText("Не корректно выбрана система для числа");
                    break;
                default:
                    break;
            }
        }
    }
    private void EnglishL(){
        nameProgram.setText("Translation of number systems");
        nameArticle_1.setText("Enter the number:");
        nameArticle_2.setText("From which system to transfer:");
        nameArticle_3.setText("What system should I transfer to:");
        resultArticle.setText("Result:");
        enter.setText("CALCULATE");
        cleaner.setText("CLEAR");
        plugMenu = 2;
        if (!numer(resultText.getText() + "") && resultText.getText().length() > 0){
            switch (resultText.getText() + ""){
                case "Заполните все поля":
                    resultText.setText("Fill in all the fields");
                    break;
                case "Rellena todos los campos":
                    resultText.setText("Fill in all the fields");
                    break;
                case "Введите число":
                    resultText.setText("Enter the number");
                    break;
                case "Introduce el número":
                    resultText.setText("Enter the number");
                    break;
                case "Введите систему в которой записано число":
                    resultText.setText("Enter the system in which the number is written");
                    break;
                case "Ingrese el sistema en el que está escrito el número":
                    resultText.setText("Enter the system in which the number is written");
                    break;
                case "Введите систему в которую надо переводить":
                    resultText.setText("Enter the system to which you want to transfer");
                    break;
                case "Ingrese el sistema al que desea transferir":
                    resultText.setText("Enter the system to which you want to transfer");
                    break;
                case "Не корректно введено число":
                    resultText.setText("Number entered incorrectly");
                    break;
                case "Número ingresado incorrectamente":
                    resultText.setText("Number entered incorrectly");
                    break;
                case "Не корректно введена система":
                    resultText.setText("System entered incorrectly");
                    break;
                case "Sistema ingresado incorrectamente":
                    resultText.setText("System entered incorrectly");
                    break;
                case "Не корректно выбрана система для числа":
                    resultText.setText("Incorrect system selected for number");
                    break;
                case "Sistema incorrecto seleccionado para el número":
                    resultText.setText("Incorrect system selected for number");
                    break;
                default:
                    break;
            }
        }
    }
    private void EspanolL(){
        nameProgram.setText("Traducción de sistemas numéricos");
        nameArticle_1.setText("Introduce el número:");
        nameArticle_2.setText("Desde qué sistema transferir:");
        nameArticle_3.setText("A qué sistema debo transferir:");
        resultArticle.setText("Resultado:");
        enter.setText("CALCULAR");
        cleaner.setText("CLARO");
        plugMenu = 3;

        if (!numer(resultText.getText() + "") && resultText.getText().length() > 0){
            switch (resultText.getText() + ""){
                case "Заполните все поля":
                    resultText.setText("Rellena todos los campos");
                    break;
                case "Fill in all the fields":
                    resultText.setText("Rellena todos los campos");
                    break;
                case "Введите число":
                    resultText.setText("Introduce el número");
                    break;
                case "Enter the number":
                    resultText.setText("Introduce el número");
                    break;
                case "Введите систему в которой записано число":
                    resultText.setText("Ingrese el sistema en el que está escrito el número");
                    break;
                case "Enter the system in which the number is written":
                    resultText.setText("Ingrese el sistema en el que está escrito el número");
                    break;
                case "Введите систему в которую надо переводить":
                    resultText.setText("Ingrese el sistema al que desea transferir");
                    break;
                case "Enter the system to which you want to transfer":
                    resultText.setText("Ingrese el sistema al que desea transferir");
                    break;
                case "Не корректно введено число":
                    resultText.setText("Número ingresado incorrectamente");
                    break;
                case "Number entered incorrectly":
                    resultText.setText("Número ingresado incorrectamente");
                    break;
                case "Не корректно введена система":
                    resultText.setText("Sistema ingresado incorrectamente");
                    break;
                case "System entered incorrectly":
                    resultText.setText("Sistema ingresado incorrectamente");
                    break;
                case "Не корректно выбрана система для числа":
                    resultText.setText("Sistema incorrecto seleccionado para el número");
                    break;
                case "Incorrect system selected for number":
                    resultText.setText("Sistema incorrecto seleccionado para el número");
                    break;
                default:
                    break;
            }
        }
    }
    private boolean numer(String num){
        String alpha = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; num.length() > i; i++)
            if (!alpha.contains(num.indexOf(i) + ""))
                return false;
        return true;
    }
}
