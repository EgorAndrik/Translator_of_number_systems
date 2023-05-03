import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventsButtons {
    public static void cleanTextFields(){
        Panel.geterNum.setText("");
        Panel.geterSystemNum.setText("");
        Panel.geterTranslatorSystemNum.setText("");
        Panel.resultText.setText("");
    }

    public static void workTranslator(){
        String num = Panel.geterNum.getText() + "", systemNum = Panel.geterSystemNum.getText() + "",
                translatorSystemNum = Panel.geterTranslatorSystemNum.getText() + "";
        int plug = Panel.plugMenu;
        if(Examination.completion(num)
                && Examination.completion(systemNum)
                && Examination.completion(translatorSystemNum)){
            if(Examination.correctSys(systemNum) && Examination.correctSys(translatorSystemNum)
                    && Examination.correctNum(num)){
                if(Examination.correctSys_and_Num(num, systemNum)){
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
                    Panel.resultText.setForeground(Panel.colorText);
                    Panel.resultText.setText(res);
                }
                else{
                    Panel.resultText.setForeground(Panel.error);
                    if (plug == 1)
                        Panel.resultText.setText("Не корректно выбрана система для числа");
                    else if (plug == 2)
                        Panel.resultText.setText("Incorrect system selected for number");
                    else
                        Panel.resultText.setText("Sistema incorrecto seleccionado para el número");
                }
            }
            else{
                if (plug == 1) {
                    if (!Examination.correctNum(num))
                        Panel.resultText.setText("Не корректно введено число");
                    else if (!Examination.correctSys(systemNum) || !Examination.correctSys(translatorSystemNum))
                        Panel.resultText.setText("Не корректно введена система");
                    Panel.resultText.setForeground(Panel.error);
                }
                else if (plug == 2){
                    if (!Examination.correctNum(num))
                        Panel.resultText.setText("Number entered incorrectly");
                    else if (!Examination.correctSys(systemNum) || !Examination.correctSys(translatorSystemNum))
                        Panel.resultText.setText("System entered incorrectly");
                    Panel.resultText.setForeground(Panel.error);
                }
                else{
                    if (!Examination.correctNum(num))
                        Panel.resultText.setText("Número ingresado incorrectamente");
                    else if (!Examination.correctSys(systemNum) || !Examination.correctSys(translatorSystemNum))
                        Panel.resultText.setText("Sistema ingresado incorrectamente");
                    Panel.resultText.setForeground(Panel.error);
                }
            }
        }
        else{
            if (plug == 1) {
                if (!Examination.completion(num) &&
                        !Examination.completion(systemNum) &&
                        !Examination.completion(translatorSystemNum))
                    Panel.resultText.setText("Заполните все поля");
                else if (!Examination.completion(num))
                    Panel.resultText.setText("Введите число");
                else if (!Examination.completion(systemNum))
                    Panel.resultText.setText("Введите систему в которой записано число");
                else
                    Panel.resultText.setText("Введите систему в которую надо переводить");
                Panel.resultText.setForeground(Panel.error);
            }
            else if (plug == 2){
                if (!Examination.completion(num) &&
                        !Examination.completion(systemNum) &&
                        !Examination.completion(translatorSystemNum))
                    Panel.resultText.setText("Fill in all the fields");
                else if (!Examination.completion(num))
                    Panel.resultText.setText("Enter the number");
                else if (!Examination.completion(systemNum))
                    Panel.resultText.setText("Enter the system in which the number is written");
                else
                    Panel.resultText.setText("Enter the system to which you want to transfer");
                Panel.resultText.setForeground(Panel.error);
            }
            else{
                if (!Examination.completion(num) &&
                        !Examination.completion(systemNum) &&
                        !Examination.completion(translatorSystemNum))
                    Panel.resultText.setText("Rellena todos los campos");
                else if (!Examination.completion(num))
                    Panel.resultText.setText("Introduce el número");
                else if (!Examination.completion(systemNum))
                    Panel.resultText.setText("Ingrese el sistema en el que está escrito el número");
                else
                    Panel.resultText.setText("Ingrese el sistema al que desea transferir");
                Panel.resultText.setForeground(Panel.error);
            }
        }
    }

}
