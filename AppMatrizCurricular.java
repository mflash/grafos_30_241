public class AppMatrizCurricular {

	public static void main(String[] args) {
		Digraph g = new Digraph();
		In arq = new In("es.txt");
		while(arq.hasNextLine()) {
			String[] linha = arq.readLine().split("/");
			String pre = linha[0];
			for(int i = 1; i < linha.length; i++) {
				g.addEdge(pre, linha[i]);
			}
		}
		// System.out.println(g.toDot());
		OrdTopologica ot = new OrdTopologica(g);
		System.out.println("Ordem topológica:");
		for(String v: ot.getOrdemTopo()) {
			System.out.println(v);
		}
	}
}
