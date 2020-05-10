import java.util.ArrayList;
import java.util.List;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Produto> produtos = new ArrayList<>();

		produtos.add(new Produto("Televisao", 1200.00));
		produtos.add(new Produto("Radio", 100.00));
		produtos.add(new Produto("Celular", 1400.00));

		produtos.sort((p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));

		for (Produto p : produtos) {
			System.out.println(p.toString());
		}

	}

}
