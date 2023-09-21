import java.util.Scanner;
public class burc_bulma {
    public static void main(String[] args) {
        
            int mont , day;
            String burc = "";
            boolean isEror;
            Scanner input = new Scanner(System.in);
            System.out.println("DOĞDUNUZ AYI GİRİNİZ : ");
            mont = input.nextInt();
            System.out.println("DOĞDUNUZ GÜNÜ GİRİNİZ");
            day = input.nextInt();

            switch(mont){
                case 1 :
                    if( day >= 1 && day <= 31){

                        if(day < 22){

                            burc = "OĞLAK BURCU ";
                        }
                        else{
                            burc = "KOVA BURCUSUNUZ";
                        }
                    }
                    else{
                        isEror=true;
                    }
                    break;

                case 2:
                        if(day >= 1 && day<=28){
                            if(day < 20){
                                burc = "KOVA BURCUSUN";
                            }
                            else{
                                burc="BALIK BURCUSUN";
                            }
                        }
                        else{
                            isEror=true;
                        }
                        break;
                case 3:
                        if( day >=1 && day <= 31){
                            if(day < 21){
                                burc = "BALIK BURCU";
                            }
                            else{
                                burc = "KOÇ BURCUSUN";
                            }
                        }
                        else{
                            isEror=true;
                        }
                        break;
                case 4:
                        if(day >=1 && day <=30){
                            if(day < 21){
                                burc = "KOÇ BURCUSUN";
                            }
                            else {
                                burc = "BOĞA BURCUSUN";
                            }
                        }
                        else{
                            isEror=true;
                        }
                        break;
                case 5:
                        if(day >=1 && day <=31){
                            if(day < 22){
                                burc = "BOĞA BURCUSUN";
                            }
                            else {
                                burc = "İKİZLER BURCUSUN";
                            }
                        }
                        else{
                            isEror=true;
                        }
                        break;        
                case 6:
                        if(day >=1 && day <=30){
                            if(day < 23){
                                burc = "İKİZLER BURCU";
                            }
                            else {
                                burc = "YENGEÇ BURCU";
                            }
                        }
                        else{
                            isEror=true;
                        }
                        break;
                case 7:
                        if(day >=1 && day <=31){
                            if(day < 23){
                                burc = "YENGEÇ BURCUSUN";
                            }
                            else {
                                burc = "ASLAN BURCUSUN";
                            }
                        }
                        else{
                            isEror=true;
                        }
                        break; 
                case 8:
                        if(day >=1 && day <=31){
                            if(day < 23){
                                burc = "ASLAN BURCU";
                            }
                            else {
                                burc = "BAŞAK BURCU";
                            }
                        }
                        else{
                            isEror=true;
                        }
                        break;
                case 9:
                        if(day >=1 && day <=30){
                            if(day < 21){
                                burc = "KOÇ BURCUSUN";
                            }
                            else {
                                burc = "BOĞA BURCUSUN";
                            }
                        }
                        else{
                            isEror=true;
                        }
                        break; 
                case 10:
                        if(day >=1 && day <=31){
                            if(day < 22){
                                burc = "AKREP BURCU";
                            }
                            else {
                                burc = "TERAZİ BURCU ";
                            }
                        }
                        else{
                            isEror=true;
                        }
                        break;
                case 11:
                        if(day >=1 && day <=30){
                            if(day < 21){
                                burc = "YAY BURCU";
                            }
                            else {
                                burc = "AKREP BURCUSUN";
                            }
                        }
                        else{
                            isEror=true;
                        }
                        break;
                 case 12:
                        if(day >=1 && day <=30){
                            if(day < 21){
                                burc = "YAY BURCU";
                            }
                            else {
                                burc = "OĞLAK BURCUSUN ";
                            }
                        }
                        else{
                            isEror=true;
                        }
                        break;
                    default:
                        isEror=true;
                          
                        
                        if(isEror == true){
                            System.out.println("hatalı giriş yaptınız tekrar deneyiniz");
                        }
                        else{
                            System.out.println("BURCUNUZ : " + burc);
                        }
                
                
                    }                                             
            }


    }
