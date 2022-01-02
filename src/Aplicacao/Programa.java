package aplicacao;

import java.util.Date;

import model.dao.DaoFabrica;
import model.dao.VendedorDao;
import model.entidades.Departamento;
import model.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {
		
		Departamento dp = new Departamento(1, "livros");
		Vendedor vendedor = new Vendedor(21, "Bob", "Bob@gmail.com", new Date(), 300.00, dp);
		System.out.println(dp);
		System.out.println(vendedor);
		
		VendedorDao vdd = DaoFabrica.criarVendedorDao();

	}

}
