package StreamChannel;

public class SuscriptorBronze extends Suscriptor{


    SuscriptorBronze(Streamer streamer){
        super(streamer);

        this.setTipoSuscriptor("StreamChannel.Suscriptor Bronze");
        streamer.agregarSuscriptor(this);
    }


    @Override
    public void actualizarInsignia() {
        System.out.println("Mi nueva insignia es: " + this.getStreamer().getInsignias().get("StreamChannel.Suscriptor Bronze"));
    }
}
