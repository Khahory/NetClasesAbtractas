
package paquete1;

public class Main {
    public static void main(String args[]){
        SerVivo h = new Planta();
        AnimalHervivoro o = new AnimalHervivoro();
        
        o.alimentarse();
        h.hola();
        h.alimentarse();
        
        
    }
}
