package repaso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CalculoTest {
	
	public static void main(String[] args) {
		 System.out.printf("%d ^ %d = %d\n", 2,3, Calculos.potencia(2,3));
	     System.out.printf("PI %f ",  Calculos.PI);

	     Calculos calculos1 = new Calculos();
	     Calculos calculos2 = new Calculos();
	     Calculos calculos3 = new Calculos();
	     Calculos calculos4 = calculos3;

	     Calculos.totalInstancias();
	     List<Integer> listaInteger = new LinkedList<>();
	     listaInteger.add(1); //pos 0
	     listaInteger.add(2); //pos 1
	     listaInteger.add(2); //pos 2
	     listaInteger.indexOf(1); //  return 0
	     listaInteger.indexOf(2); //  return 1
	     listaInteger.get(1); //return 2
	     listaInteger.lastIndexOf(2); // return 2


	     List<Integer> lisInteger = new ArrayList<>();
	     Set<Integer> setInteger = new HashSet<>();
	     Map<String, Double> tablaTiposIva = new HashMap<>();
	     tablaTiposIva.put("spain",21.0);
	     tablaTiposIva.put("france",24.0);
	     for (String elemento: tablaTiposIva.keySet()) {
	    	 System.out.printf("\nClave %s Valor %f\n",elemento,tablaTiposIva.get(elemento));
	     }
	     System.out.println("El iva de españa es " + tablaTiposIva.get("spain"));



	     ArrayList<Integer> listaInteger2 = new ArrayList<>();
	     listaInteger2.add(4);
	     listaInteger2.addAll(listaInteger);
	}
}
