import java.util.ArrayList;
public class Playlist{

    public static void main(String[] args){
    ArrayList<String> listaParaIlhaDeserta = new ArrayList<String>();
    listaParaIlhaDeserta.add("walked");
    listaParaIlhaDeserta.add("Warning");
    listaParaIlhaDeserta.add("metamorphosis");
    listaParaIlhaDeserta.add("Rapture");
    listaParaIlhaDeserta.add("lost in the moon");
    listaParaIlhaDeserta.add("Consume");
    listaParaIlhaDeserta.add("Murder in my mind");
    System.out.println(listaParaIlhaDeserta);
    System.out.println(listaParaIlhaDeserta.size());
     listaParaIlhaDeserta.remove("Murder in my mind");
     listaParaIlhaDeserta.remove("lost in the moon");
     System.out.println(listaParaIlhaDeserta);
     System.out.println(listaParaIlhaDeserta.size());
     int indiceA = 2;
     int indiceB = 3;
     String tempA = listaParaIlhaDeserta.get(indiceA);
     String tempB = listaParaIlhaDeserta.get(indiceB);
     listaParaIlhaDeserta.set(indiceB, tempA);
     listaParaIlhaDeserta.set(indiceA, tempB);
     System.out.println(listaParaIlhaDeserta);
    }
}