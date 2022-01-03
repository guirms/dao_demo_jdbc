package aplicacao;

import java.util.List;

import model.dao.DaoFabrica;
import model.dao.VendedorDao;
import model.entidades.Departamento;
import model.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {
		
		VendedorDao vdd = DaoFabrica.criarVendedorDao();
		
		System.out.println("TESTE 1: Encontrar por Id");
		System.out.println(vdd.encontrarPorId(3));
		
		System.out.println("\nTESTE 2: Encontrar por Departamento");
		Departamento dep = new Departamento(2, null);
		List<Vendedor> lista = vdd.encontrarPorDepartamento(dep);
		lista.forEach(System.out::println);

	}

}
