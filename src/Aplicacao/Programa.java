package aplicacao;

import java.util.Date;
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
		
		System.out.println("\nTESTE 3: Encontrar tudo");
		List<Vendedor> listaa = vdd.encontrarTudo();
		listaa.forEach(System.out::println);
		
		System.out.println("\nTESTE 4: Inserir objeto");
		Vendedor vendedor = new Vendedor(null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
		vdd.inserir(vendedor);
		System.out.println("Sucesso; Novo id: " +vendedor.getId());
		
		System.out.println("\nTESTE 4: Atualizar");
		vendedor = vdd.encontrarPorId(1);
		vendedor.setNome("Bob");
		vdd.atualizar(vendedor);
		System.out.println("Sucesso, id " + vendedor.getId() + " alterado");
	}

}
