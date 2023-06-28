package n19_java_break_continue;

public class MainOfMyClass {


    public static void main(String[] args) {

        int health = 0;
        int potTime_Minute = 120; // 2 saatlik
        boolean potActive = true;

        while(potActive){

            if(health < 100) {
                health = health + 5;
                System.out.println(health + "increased");
                continue; // sanırım burada bu pasif iş görüyor
                // işte pot'una yeni zaman alırsa satın alırsa aktifse devam et  falan
                // ya da başka bir case de kullanılabilir. ya da birden fazla if else koşul konulur
                // bu döngünün çalışması için.  ve bu döngüler her çalıştığında bu if elseleri sınar.

            }
            //potTime_Minute--; // every second when user used the pot - time is decreasing.
            // ben burayı bilerek 1 1 düşsün diye yapacağım zaman ayarıyla uğraşmayacağım.
            // can dolarken belli bir süre geçmeli vs.
            // ve aktif olduğu süre boyunca
            if(potTime_Minute >= 0 && potTime_Minute != 0){
                    potTime_Minute--; // döngü her çalıştığında
                    // potTime_Minute =- 1  dediğimde 1 kere
                    // potTime_Minute = potTime_Minute - 1; dediğimde ise -2 oluşuyor niye acep?
                // yukarıyada pot time yazmışım :P
                    // burada for mu kullanılsaydı ki ?
                    System.out.println(potTime_Minute);
                // o belli süreyi zamanlayıcıdan almak yerine temsilen
                // döngü her çalıştığında -1 zamandan düşsün. TEST ETMEK AMACIYLA.
                // sistemin çalışılabilirliğini görmek amacıyla böyle yaptım.
                continue;
            }

    // while döngüsü asynchronous eş zamansız çalışıyor bu durumda
            // zaman pot çalışırken pot un bitmesi (yeni özeellik)
            // pot un zamanıın bitmesi
            // canın dolması gibi etkenler ayrı ayrı gerçekleştiği için.
            // asynchronous olamsı doğru yol.
            // düşünsene synchronous olduğunu sürekli cand olana kadar beklenirdi sonra zamandan düşülürdü aradan yarım saat geçmesine rağmen sadece 1 saniye düşebilirdi yani :P
            // synchronous çalıştığını düşünmeye başladım şimdi çünkü aşşağıda pottime i print ediyordum o while döngüsüyle alakasızmış.


            // bunu şimdilik burada böyle bırakıyorum ama bu projenin asynchronous olması gerekirdi ayrı bir döngü mü açmalıydı?
            // ya da döngünün içinde bir döngü mü yapmalıydı ?


            if(health >= 100 && potTime_Minute <= 0 ){ // canı 100 veya yüksek ise veya pot'un süresi 0  olursa. veya kapalı olursa while döngüsü zaten çalışmıcak
                System.out.println("health is full");
                break;
            }
        }


    }







}
