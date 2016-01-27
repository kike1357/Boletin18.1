package boletin18.pkg1;

/**
 *
 * @author epastorizalorenzo
 */
public class Numeros {
    int[]numeros=new int[6];
    
public void crearArray(){    
    for (int i=0; i<6; i++){
        numeros[i]= (int) (Math.random()*50 + 1);       
        System.out.println("Elemento" +(i+1) +"------>"+numeros[i]);  
}
        System.out.println("\n");
}
public void VisualizarArray(){
    for(int i=numeros.length-1; i>=0; i--){
        System.out.println("Elemento" +(i+1) +"----->"+numeros[i]);
}
}
}