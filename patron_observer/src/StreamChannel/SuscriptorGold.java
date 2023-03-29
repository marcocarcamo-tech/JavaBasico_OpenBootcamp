package StreamChannel;

public class SuscriptorGold extends Suscriptor{

    public SuscriptorGold (Streamer streamer){
        super(streamer);
        this.setTipoSuscriptor("StreamChannel.Suscriptor Gold");
        streamer.agregarSuscriptor(this);
    }
    @Override
    public void actualizarInsignia() {
        System.out.println("Mi nueva insignia es: " + this.getStreamer().getInsignias().get("StreamChannel.Suscriptor Gold"));
    }
}
