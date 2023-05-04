public class Examination {
    public static boolean completion(String textField){
        if (textField.length() > 0)
            return true;
        return false;
    }
    public static boolean correctSys(String SystemChisl){
        String alpha = "0123456789";
        for(int i = 0; i < SystemChisl.length(); i++)
            if(!alpha.contains(SystemChisl.charAt(i) + ""))
                return false;
        if (Integer.valueOf(SystemChisl + "") <= 1 || Integer.valueOf(SystemChisl + "") >= 37)
            return false;
        return true;
    }
    public static boolean correctNum(String Num){
        String alpha = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Num = Num.toUpperCase();
        for(int i = 0; i < Num.length(); i++)
            if (!alpha.contains(Num.charAt(i) + ""))
                return false;
        return true;
    }
    public static boolean correctSys_and_Num(String num, String SysChisl){
        String alpha = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int SysCh = Integer.valueOf(SysChisl + "");
        num = num.toUpperCase();
        for(int i = 0; i < num.length(); i++)
            if (alpha.indexOf(num.charAt(i) + "") >= SysCh)
                return false;
        return true;
    }
    public static boolean numer(String num){
        String alpha = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; num.length() > i; i++)
            if (!alpha.contains(num.indexOf(i) + ""))
                return false;
        return true;
    }
}
