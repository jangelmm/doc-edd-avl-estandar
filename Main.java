public class Main {
    public static void main(String[] args) {
        ArbolBalanceado arbol = new ArbolBalanceado();
        arbol.insertar(234);
        arbol.insertar(222);
        arbol.insertar(100);
        arbol.insertar(10);
        arbol.insertar(10000);
        arbol.insertar(345);
        arbol.insertar(2);
        arbol.insertar(456);
        arbol.insertar(756);
        System.out.println(arbol.size());
        arbol.posOrden();
    }
}
