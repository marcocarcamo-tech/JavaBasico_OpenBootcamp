package StreamChannel;

public class SuscriptorSilver extends Suscriptor{

    public SuscriptorSilver(Streamer streamer){
        super(streamer);
        this.setTipoSuscriptor("StreamChannel.Suscriptor Silver");
        streamer.agregarSuscriptor(this);
    }
    @Override
    public void actualizarInsignia() {
        System.out.println("Mi nueva insignia es: " + this.getStreamer().getInsignias().get("StreamChannel.Suscriptor Silver"));
    }
}
