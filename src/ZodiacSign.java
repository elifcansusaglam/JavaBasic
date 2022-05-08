import java.util.Scanner;

public class ZodiacSign {
    public static void main(String[] args) {
        //Koç Burcu : 21 Mart - 20 Nisan, Boğa Burcu : 21 Nisan - 21 Mayıs, İkizler Burcu : 22 Mayıs - 22 Haziran
        //Yengeç Burcu : 23 Haziran - 22 Temmuz, Aslan Burcu : 23 Temmuz - 22 Ağustos, Başak Burcu : 23 Ağustos - 22 Eylül
        //Terazi Burcu : 23 Eylül - 22 Ekim, Akrep Burcu : 23 Ekim - 21 Kasım, Yay Burcu : 22 Kasım - 21 Aralık
        //Oğlak Burcu : 22 Aralık - 21 Ocak, Kova Burcu : 22 Ocak - 19 Şubat, Balık Burcu : 20 Şubat - 20 Mart

        int day, month;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ayı giriniz : ");
        month = input.nextInt();
        System.out.print("Doğduğunuz günü giriniz : ");
        day = input.nextInt();

        if (month >= 1 && month <= 12) {

            if (month == 1) {

                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        System.out.println("Burcunuz Oğlak");
                    } else {
                        System.out.println("Burcunuz Kova");
                    }
                } else {
                    System.out.println("Hatalı giriş yaptınız!");
                }
            }
            else if (month == 2) {
                if (day >= 1 && day <= 29) {
                    if (day < 20) {
                        System.out.println("Burcunuz Kova");
                    } else {
                        System.out.println("Burcunuz Balık");
                    }
                } else {
                    System.out.println("Hatalı giriş yaptınız!");
                }
            }
            else if (month == 3) {
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        System.out.println("Burcunuz Balık");
                    } else {
                        System.out.println("Burcunuz Koç");
                    }
                } else {
                    System.out.println("Hatalı giriş yaptınız!");
                }
            }
            else if (month == 4) {
                if (day >= 1 && day <= 30) {
                    if (day < 21) {
                        System.out.println("Burcunuz Balık");
                    }else {
                        System.out.println("Burcunuz Koç");
                    }
                }else {
                    System.out.println("Hatalı giriş yaptınız!");
                }
            }
            else if (month == 5) {
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        System.out.println("Burcunuz Koç");
                    } else {
                        System.out.println("Burcunuz İkizler");
                    }
                } else {
                    System.out.println("Hatalı giriş yaptınız!");
                }
            }
            else if (month == 6) {
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        System.out.println("Burcunuz İkizler");
                    } else {
                        System.out.println("Burcunuz Yengeç");
                    }
                } else {
                    System.out.println("Hatalı giriş yaptınız!");
                }
            }
            else if (month == 7) {
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        System.out.println("Burcunuz Yengeç");
                    } else {
                        System.out.println("Burcunuz Aslan");
                    }
                } else {
                    System.out.println("Hatalı giriş yaptınız!");
                }
            }
            else if (month == 8) {
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        System.out.println("Burcunuz Aslan");
                    } else {
                        System.out.println("Burcunuz Başak");
                    }
                } else {
                    System.out.println("Hatalı giriş yaptınız!");
                    }
                }
            else if (month == 9) {
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        System.out.println("Burcunuz Başak");
                    } else {
                        System.out.println("Burcunuz Terazi");
                }
                } else {
                    System.out.println("Hatalı giriş yaptınız!");
                }
            }
            else if (month == 10) {
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        System.out.println("Burcunuz Terazi");
                    } else {
                        System.out.println("Burcunuz Akrep ");
                    }
                } else {
                System.out.println("Hatalı giriş yaptınız!");
                }
            }
            else if (month == 11) {
                if (day >= 1 && day <= 30) {
                    if (day < 22) {
                        System.out.println("Burcunuz Akrep");
                    } else {
                        System.out.println("Burcunuz Yay");
                    }
                } else {
                System.out.println("Hatalı giriş yaptınız!");
                }
            }
            else if (month == 12) {
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        System.out.println("Burcunuz Yay");
                    } else {
                        System.out.println("Burcunuz Oğlak");
                    }
                } else {
                    System.out.println("Hatalı giriş yaptınız!");
                }
            }
    }
    else{
            System.out.println("Hatalı sayı girdiniz!");
        }
    }
}
