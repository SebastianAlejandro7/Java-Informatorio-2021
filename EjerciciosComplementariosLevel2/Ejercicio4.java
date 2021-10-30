public class DemoArray {
    public static void main(String args[])
    {
        int lista[]= new int ;
        int num[]={1,2,3};
        int tabla[][]={
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
        System.out.println("Longitud de lista: "+lista.length);
        System.out.println("Longitud de num: " +num.length);
        System.out.println("Longitud de tabla: "+tabla.length);
        System.out.println("Longitud de tabla: " +tabla.length);
        System.out.println("Longitud de tabla: " +tabla.length);
        System.out.println("Longitud de tabla: " +tabla.length);
        for (int i=0; i < lista.length; i++)
        lista=i*i;
        System.out.print("La lista es: ");
        for (int i=0; i < lista.length; i++)
        System.out.print(lista+ " ");
        System.out.println();
    }
}
