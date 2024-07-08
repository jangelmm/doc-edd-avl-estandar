public class NodoAvl{
    private Object Dato;
    private NodoAvl Izquierda;
    private NodoAvl Derecha;
    private int Fe;
    public NodoAvl(){}
    public NodoAvl(int i){
        setDato(i);
    }
    public void setDato(Object o){
        Dato = o;
    }
    public void setIzquierda(NodoAvl i){
        Izquierda = i;
    }
    public void setDerecha(NodoAvl d){
        Derecha = d;
    }
    public void setFe(int i){
        Fe = i;
    }
    public Object getDato(){
        return Dato;
    }
    public NodoAvl getIzquierda(){
        return Izquierda;
    }
    public NodoAvl getDerecha(){
        return Derecha;
    }
    public int getFe(){
        return Fe;
    }
}