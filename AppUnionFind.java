public class AppUnionFind
{

	public static void main(String[] args) {

		EdgeWeightedGraph g = new EdgeWeightedGraph("tinyEWG.txt");
		System.out.println(g.toDot());

		UnionFind uf = new UnionFind(g);

		System.out.println("Total de conjuntos: "+uf.getTotalSets());
		System.out.println(uf);

		System.out.println("\n0 conectado a 1? "+uf.connected("0", "1"));
		System.out.println("0 conectado a 7? "+uf.connected("0", "7"));

		System.out.println("Unindo 0 e 7");
		uf.union("0", "7");

		System.out.println("0 conectado a 7? "+uf.connected("0", "7"));
		System.out.println(uf.connected("0", "7"));

		System.out.println("\nTotal de conjuntos: "+uf.getTotalSets());
		System.out.println(uf);

		System.out.println("Unindo 1 e 2");
		uf.union("1", "2");

		System.out.println("\nTotal de conjuntos: "+uf.getTotalSets());
		System.out.println(uf);

		System.out.println("Unindo 2 e 7");
		uf.union("2", "7");

		System.out.println("\nTotal de conjuntos: "+uf.getTotalSets());
		System.out.println(uf);

		// A busca do 7 agora vai "comprimir" o caminho
		uf.find("7");

		System.out.println("\nTotal de conjuntos: "+uf.getTotalSets());
		System.out.println(uf);
	}
}