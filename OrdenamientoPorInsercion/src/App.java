public class App {
    public static void main(String[] args) throws Exception {
        
        int Arreglo[] = {3,5,8,9,6,5,2};
        System.out.println("Arreglo original:");
        mostrarArreglo(Arreglo, Arreglo.length);
        OrdenarPorInsercion(Arreglo, Arreglo.length);
        System.out.println("Arreglo ordenado:");
        mostrarArreglo(Arreglo, Arreglo.length);
    }
    public static void OrdenarPorInsercion(int Arr[], int n){
        for (int i = 1; i < Arr.length; i++) {
            int ValorC = Arr[i];    //Asignar a la variable temporal el valor del segundo elemento
            int posicion = i;       //Es para llevar el seguimiento de las posiciones del elemento de referencia
            //Verificar si se está trabajando con el elemento que está después del primero
            //y si elemento que está de primero es mayor que el segundo
            while((posicion > 0) && (Arr[posicion - 1] > ValorC)){
                Arr[posicion] = Arr[posicion - 1];  //Cambiamos de posicion
                posicion = posicion - 1;    //Para verificar los elementos anteriores
            }
            Arr[posicion] = ValorC;
        }
    }
    public static void mostrarArreglo(int Arr[], int n){
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
    }
}
