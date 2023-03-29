package StreamChannel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Streamer {

    private List<Suscriptor> suscriptores = new ArrayList<>();
    HashMap<String, String> insignias;

    public void agregarSuscriptor(Suscriptor suscriptor){
        suscriptores.add(suscriptor);
    }

    public void notificarTodosObservadores(){
        for (Suscriptor suscriptor: suscriptores){
            suscriptor.actualizarInsignia();
        }
    }

    public List<Suscriptor> getSuscriptores() {
        return suscriptores;
    }

    public void setSuscriptores(List<Suscriptor> suscriptores) {
        this.suscriptores = suscriptores;
    }

    public HashMap<String, String> getInsignias() {
        return insignias;
    }

    public void setInsignias(HashMap insignias) {
        this.insignias = insignias;
        notificarTodosObservadores();
    }
}
