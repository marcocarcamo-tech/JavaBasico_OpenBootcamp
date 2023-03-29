package StreamChannel;

public abstract class Suscriptor {


    private Streamer streamer;
    private String tipoSuscriptor;

    public Suscriptor (){

    }
    public Suscriptor(Streamer streamer){
        this.streamer = streamer;
    }

    public abstract void actualizarInsignia();

    public Streamer getStreamer() {
        return streamer;
    }

    public void setStreamer(Streamer streamer) {
        this.streamer = streamer;
    }

    public String getTipoSuscriptor() {
        return tipoSuscriptor;
    }

    public void setTipoSuscriptor(String tipoSuscriptor) {
        this.tipoSuscriptor = tipoSuscriptor;
    }
}
