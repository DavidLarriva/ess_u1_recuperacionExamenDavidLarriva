
import Controllers.CarroController;
import Models.Carro;

import java.util.Arrays;

public class App {
        public static void main(String[] args) throws Exception {
                Carro[] carros = new Carro[] {
                                new Carro("Toyota", 2010),
                                new Carro("Honda", 2015),
                                new Carro("Ford", 2005),
                                new Carro("Chevrolet", 2018),
                                new Carro("BMW", 2010),
                                new Carro("Nissan", 2015),
                                new Carro("Volkswagen", 2020),
                                new Carro("Hyundai", 2010),
                                new Carro("Kia", 2005),
                                new Carro("Mazda", 2000),
                                new Carro("Subaru", 2012),
                                new Carro("Mercedes-Benz", 2016),
                                new Carro("Lexus", 2011),
                                new Carro("Audi", 2019),
                                new Carro("Tesla", 2020),
                                new Carro("Jaguar", 2014),
                                new Carro("Land Rover", 2018),
                                new Carro("Volvo", 2013),
                                new Carro("Infiniti", 2008),
                                new Carro("Acura", 2017)
                };

                // Implementar un método para ordenar los carros por año en orden ascendente
                // El metodo se le especificara en el enunciado del examen

                // Encontrar el carro usando búsqueda binaria basada en el año de fabricación y
                // imprimir su posició
                // en el arreglo de carros
                // Años a buscar en el arreglo de carros:
                // - 2012
                // - 2009

                // Imprimir:
                // Si encontro al carro en el arreglo de carros y su posisción
                // Si no encontro al carro en el arreglo de carros

                //Variables para los carros

                int carroEncontrado2012 = busquedaBinaria(carros, 2012);
                int carroEncontrado2009 = busquedaBinaria(carros, 2009);

                seleccion(carros);

                //Busqueda del año 2009
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println();
                System.out.println();
                System.out.println("BUSQUEDA EN EL ANIO 2009");
                System.out.println();
                if(carroEncontrado2009 == -1) {
                        System.out.println("Carro no encontrado ...");
                }else{
                        System.out.println();
                        System.out.println("!Carro Encontrado en la posicion " + "# " + (carroEncontrado2009-1) );
                        System.out.println("marca: " + carros[carroEncontrado2009].getMarca() + " | " + "anio:" + carros[carroEncontrado2009].getAnio());
                        System.out.println();  
                }

                //Busqueda del año 2012
                System.out.println("---------------------------------------------------------------------------------------");

                System.out.println();
                System.out.println("BUSQUEDA EN EL ANIO 2012");
                System.out.println();
                if(carroEncontrado2012 == -1) {
                        System.out.println("Carro no encontrado ...");
                }else{
                        System.out.println();
                        System.out.println("!Carro Encontrado en la posicion " + "# " + (carroEncontrado2012-1) );
                        System.out.println("marca: " + carros[carroEncontrado2012].getMarca() + " | " + "anio:" + carros[carroEncontrado2012].getAnio());
                        System.out.println();  
                }

                System.out.println("---------------------------------------------------------------------------------------");


                //Imprimir carros ordenados 
                int i = 1;
                System.out.println();
                System.out.println("CARROS ORDENADOS SEGUN ANIO EN ORDEN ASCENDENTE");
                System.out.println();

                

                for(Carro carro:carros){
                        System.out.println();
                        System.out.println("Carro Numero: " + i + " : ");
                        System.out.println("marca: " + carro.getMarca() + " | " + "anio:" + carro.getAnio());
                        System.out.println();
                        i++;
                }

        }

        

        //ORDENAMIENTO POR INSERCION para el Arreglo del tipo Carro
        public static void insercion(Carro[] carro){
                for(int i=1;i<carro.length;i++) {
                        int clave = carro[i].getAnio();
                        Carro claveC = carro[i];
                        int j = i-1;
                        while(j>=0 && carro[j].getAnio() > clave) {
                                carro[j+1] = carro[j];
                                j--;
                        }
                        carro[j+1]= claveC;
                }
        }

        //ORDENAMIENTO POR SELECCION para el arreglo del tipo Carro
        public static void seleccion(Carro[] carros) {
                for (int i = 0; i < carros.length - 1; i++) {
                        int minIndex = i;
                        for (int j = i + 1; j < carros.length; j++) {
                            if (carros[j].getMarca().compareTo(carros[minIndex].getMarca()) < 0) {
                                minIndex = j;
                            }
                        }
                        //Intercambiar los elementos 
                        Carro temp = carros[i];
                        carros[i] = carros[minIndex];
                        carros[minIndex] = temp;
                    }
            
        }

        
        //BUSQUEDA BINARIA para el Arreglo del tipo Carro

        public static int busquedaBinaria(Carro[] arr, int num) {
                int n = arr.length;
                int fin = n-1;
                int ini = 0;

                while (ini<=fin) {
                        int mid = (ini+fin) /2;

                        if(arr[mid].getAnio() == num) {
                                return mid;
                        }else if (arr[mid].getAnio() <num) {
                                ini = mid+1;
                        }else {
                                fin=mid-1;
                        }
                }

                return -1;


        }
}