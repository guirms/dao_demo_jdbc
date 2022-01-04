package aplicacao;

import java.util.List;

import model.dao.DaoFabrica;
import model.dao.DepartamentoDao;
import model.entidades.Departamento;

public class Programa2 {

	public static void main(String[] args) {

		DepartamentoDao dep = DaoFabrica.criarDepartamentoDao();

		System.out.println("TESTE 1: Inserir");
		Departamento dp = new Departamento(3, "CD");
		dep.inserir(dp);
		System.out.println("Sucesso, novo id: " + dp.getId());

		System.out.println("\nTESTE 2: Atualizar");
		dp = new Departamento(6, "MacBook");
		dep.atualizar(dp);
		System.out.println("Sucesso, id " + dp.getId() + " atualizado");

		System.out.println("\nTESTE 3: Deletar ");
		dp = new Departamento(20, null);
		dep.deletarPorId(dp.getId());
		System.out.println("Sucesso, id " + dp.getId() + " deletado");

		System.out.println("\nTESTE 4: Encontrar por ID");
		System.out.println(dep.encontrarPorId(1));

		System.out.println("\nTESTE 5: Encontrar tudo");
		List<Departamento> lista = dep.encontrarTudo();
		lista.forEach(System.out::println);

	}

}
