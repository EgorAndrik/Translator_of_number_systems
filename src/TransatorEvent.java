import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TransatorEvent {
    public static String textRes = Panel.resultText.getText() + "";
    public static void RussianL(){
        Panel.nameProgram.setText("Перевод систем счисления");
        Panel.nameArticle_1.setText("Введите число:");
        Panel.nameArticle_2.setText("Из какой системы переводить:");
        Panel.nameArticle_3.setText("В какую систему переводить:");
        Panel.resultArticle.setText("Результат:");
        Panel.enter.setText("ПОСЧИТАТЬ");
        Panel.cleaner.setText("ОЧИСТИТЬ");
        Panel.plugMenu = 1;
        if (!Examination.numer(textRes) && textRes.length() > 0){
            switch (textRes){
                case "Fill in all the fields":
                    Panel.resultText.setText("Заполните все поля");
                    break;
                case "Rellena todos los campos":
                    Panel.resultText.setText("Заполните все поля");
                    break;
                case "Enter the number":
                    Panel.resultText.setText("Введите число");
                    break;
                case "Introduce el número":
                    Panel.resultText.setText("Введите число");
                    break;
                case "Enter the system in which the number is written":
                    Panel.resultText.setText("Введите систему в которой записано число");
                    break;
                case "Ingrese el sistema en el que está escrito el número":
                    Panel.resultText.setText("Введите систему в которой записано число");
                    break;
                case "Enter the system to which you want to transfer":
                    Panel.resultText.setText("Введите систему в которую надо переводить");
                    break;
                case "Ingrese el sistema al que desea transferir":
                    Panel.resultText.setText("Введите систему в которую надо переводить");
                    break;
                case "Number entered incorrectly":
                    Panel.resultText.setText("Не корректно введено число");
                    break;
                case "Número ingresado incorrectamente":
                    Panel.resultText.setText("Не корректно введено число");
                    break;
                case "System entered incorrectly":
                    Panel.resultText.setText("Не корректно введена система");
                    break;
                case "Sistema ingresado incorrectamente":
                    Panel.resultText.setText("Не корректно введена система");
                    break;
                case "Incorrect system selected for number":
                    Panel.resultText.setText("Не корректно выбрана система для числа");
                    break;
                case "Sistema incorrecto seleccionado para el número":
                    Panel.resultText.setText("Не корректно выбрана система для числа");
                    break;
                default:
                    break;
            }
        }
    }
    public static void EnglishL(){
        Panel.nameProgram.setText("Translation of number systems");
        Panel.nameArticle_1.setText("Enter the number:");
        Panel.nameArticle_2.setText("From which system to transfer:");
        Panel.nameArticle_3.setText("What system should I transfer to:");
        Panel.resultArticle.setText("Result:");
        Panel.enter.setText("CALCULATE");
        Panel.cleaner.setText("CLEAR");
        Panel.plugMenu = 2;

        if (!Examination.numer(textRes) && textRes.length() > 0){
            switch (textRes){
                case "Заполните все поля":
                    Panel.resultText.setText("Fill in all the fields");
                    break;
                case "Rellena todos los campos":
                    Panel.resultText.setText("Fill in all the fields");
                    break;
                case "Введите число":
                    Panel.resultText.setText("Enter the number");
                    break;
                case "Introduce el número":
                    Panel.resultText.setText("Enter the number");
                    break;
                case "Введите систему в которой записано число":
                    Panel.resultText.setText("Enter the system in which the number is written");
                    break;
                case "Ingrese el sistema en el que está escrito el número":
                    Panel.resultText.setText("Enter the system in which the number is written");
                    break;
                case "Введите систему в которую надо переводить":
                    Panel.resultText.setText("Enter the system to which you want to transfer");
                    break;
                case "Ingrese el sistema al que desea transferir":
                    Panel.resultText.setText("Enter the system to which you want to transfer");
                    break;
                case "Не корректно введено число":
                    Panel.resultText.setText("Number entered incorrectly");
                    break;
                case "Número ingresado incorrectamente":
                    Panel.resultText.setText("Number entered incorrectly");
                    break;
                case "Не корректно введена система":
                    Panel.resultText.setText("System entered incorrectly");
                    break;
                case "Sistema ingresado incorrectamente":
                    Panel.resultText.setText("System entered incorrectly");
                    break;
                case "Не корректно выбрана система для числа":
                    Panel.resultText.setText("Incorrect system selected for number");
                    break;
                case "Sistema incorrecto seleccionado para el número":
                    Panel.resultText.setText("Incorrect system selected for number");
                    break;
                default:
                    break;
            }
        }
    }
    public static void EspanolL(){
        Panel.nameProgram.setText("Traducción de sistemas numéricos");
        Panel.nameArticle_1.setText("Introduce el número:");
        Panel.nameArticle_2.setText("Desde qué sistema transferir:");
        Panel.nameArticle_3.setText("A qué sistema debo transferir:");
        Panel.resultArticle.setText("Resultado:");
        Panel.enter.setText("CALCULAR");
        Panel.cleaner.setText("CLARO");
        Panel.plugMenu = 3;

        if (!Examination.numer(textRes) && textRes.length() > 0){
            switch (textRes){
                case "Заполните все поля":
                    Panel.resultText.setText("Rellena todos los campos");
                    break;
                case "Fill in all the fields":
                    Panel.resultText.setText("Rellena todos los campos");
                    break;
                case "Введите число":
                    Panel.resultText.setText("Introduce el número");
                    break;
                case "Enter the number":
                    Panel.resultText.setText("Introduce el número");
                    break;
                case "Введите систему в которой записано число":
                    Panel.resultText.setText("Ingrese el sistema en el que está escrito el número");
                    break;
                case "Enter the system in which the number is written":
                    Panel.resultText.setText("Ingrese el sistema en el que está escrito el número");
                    break;
                case "Введите систему в которую надо переводить":
                    Panel.resultText.setText("Ingrese el sistema al que desea transferir");
                    break;
                case "Enter the system to which you want to transfer":
                    Panel.resultText.setText("Ingrese el sistema al que desea transferir");
                    break;
                case "Не корректно введено число":
                    Panel.resultText.setText("Número ingresado incorrectamente");
                    break;
                case "Number entered incorrectly":
                    Panel.resultText.setText("Número ingresado incorrectamente");
                    break;
                case "Не корректно введена система":
                    Panel.resultText.setText("Sistema ingresado incorrectamente");
                    break;
                case "System entered incorrectly":
                    Panel.resultText.setText("Sistema ingresado incorrectamente");
                    break;
                case "Не корректно выбрана система для числа":
                    Panel.resultText.setText("Sistema incorrecto seleccionado para el número");
                    break;
                case "Incorrect system selected for number":
                    Panel.resultText.setText("Sistema incorrecto seleccionado para el número");
                    break;
                default:
                    break;
            }
        }
    }
}
