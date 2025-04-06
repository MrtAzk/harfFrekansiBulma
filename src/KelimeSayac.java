import java.util.HashMap;
import java.util.Map;

public class KelimeSayac {
    Map<String,Integer>kelimeSayilari = new HashMap<>();

    public void kelimeEkle(String kelime){
        if (kelimeSayilari.containsKey(kelime)){
            int kelimeSayisi= kelimeSayilari.get(kelime);
            kelimeSayisi +=1;
            kelimeSayilari.put(kelime,kelimeSayisi);
        }else {
            kelimeSayilari.put(kelime,1);
        }
    }

    public void kelimeleSayilariGoster(){
        for (Map.Entry<String,Integer> girdi : kelimeSayilari.entrySet()){
            int kelimeSayı=girdi.getValue();
            String kelime =girdi.getKey();
            System.out.println("Kelime : " + "("+ kelime +")" + "  Kelime Sayısı : " + kelimeSayı);
        }

    }
}
