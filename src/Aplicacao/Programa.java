package aplicacao;

import model.dao.DaoFabrica;
import model.dao.VendedorDao;
import model.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {
		
		VendedorDao vdd = DaoFabrica.criarVendedorDao();
		
		Vendedor vendedor = vdd.encontrarPorId(3);
		
		System.out.println(vendedor);

	}

}
