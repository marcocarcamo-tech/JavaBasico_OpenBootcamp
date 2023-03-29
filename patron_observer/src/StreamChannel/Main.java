package StreamChannel;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Streamer Auron = new Streamer();

        System.out.println(Auron.getSuscriptores());
        System.out.println(Auron.getInsignias());

        Suscriptor suscriptor1= new SuscriptorBronze(Auron);
        Suscriptor suscriptor2= new SuscriptorSilver(Auron);
        Suscriptor suscriptor3= new SuscriptorGold(Auron);

        System.out.println(Auron.getSuscriptores());

        HashMap<String, String> insigniasAuron=  new HashMap<>();
        insigniasAuron.put("StreamChannel.Suscriptor Bronze", "Aldeano");
        insigniasAuron.put("StreamChannel.Suscriptor Silver", "Mago");
        insigniasAuron.put("StreamChannel.Suscriptor Gold", "Héroe");

        Auron.setInsignias(insigniasAuron);

        insigniasAuron.replace("StreamChannel.Suscriptor Bronze", "Aprendiz");
        insigniasAuron.replace("StreamChannel.Suscriptor Silver", "Maestro");
        insigniasAuron.replace("StreamChannel.Suscriptor Gold", "Samurai");

        Auron.setInsignias(insigniasAuron);

    }
}