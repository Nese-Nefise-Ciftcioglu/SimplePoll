import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Poll {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        ArrayList<String>katılımcılar=new ArrayList<String>();
        System.out.println("--------------------------------------------------");
        System.out.println("İstediğiniz kadar katılımcı ismi girebilirsiniz");
        System.out.println("İsim girme işleminiz bittiğinde \"-1\" yazınız");
        System.out.println("En son eklediğiniz ismi silmek için \"-2\" yazınız");
        System.out.println("Başka bir ismi silmek için önce \"-3\" sonra o ismin sıra numarasını yazınız");
        System.out.println("--------------------------------------------------");
        int index;
       boolean onOff=true;
       int counter=0;
        while(onOff){
            index=katılımcılar.size()-1;
            String isim=input.next();
            if(isim.equals("-1")){
                onOff=false;
            }
            else if(isim.equals("-2")){
                System.out.println("Son eklenen "+katılımcılar.get(index)+" ismi silindi");
                katılımcılar.remove(index);
            }
            else if(isim.equals("-3")){
                System.out.println("Kaç numaralı ismi silmek istiyorsunuz? ");
                int secim=input.nextInt();
                System.out.println(secim+". isim olan "+katılımcılar.get(secim-1)+" silindi");
                katılımcılar.remove(secim-1);
                System.out.println("Yeni "+secim+". isim: "+katılımcılar.get(secim-1));
            }
            else
                {
                    katılımcılar.add(isim);
                    System.out.println(counter+1+"."+isim);
                    counter++;
            }
        }
        System.out.println("ÇEKİLİŞE KATILANLAR: ");
        for(String element:katılımcılar){
            System.out.println(element);
        }
        System.out.println("Çekilişi başlatmak için \"-4\" yazınız");
        int basla = input.nextInt();
        while (basla!=-4) {
            System.out.println("HATALI BİR DEĞER GİRDİNİZ");
            System.out.println("Çekilişi başlatmak için \"-4\" yazınız");
            basla = input.nextInt();
        }
            if (basla == -4)
                cekilis(katılımcılar);
    }
    public static void cekilis(ArrayList<String>katılımcılar) {
        Random random = new Random();
        System.out.println("Çekilişe " + katılımcılar.size() + " kişi katıldı");
        int rand = random.nextInt(katılımcılar.size() + 1);
        String kazanan = katılımcılar.get(rand);
        System.out.println("Kazanan: " + kazanan);
        System.out.println("Tebrikler! " + kazanan);
    }
}
