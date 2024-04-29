public class AppDFS {

	public static void main(String[] args) {
		Graph g = new Graph("tinyG.txt");
		DFS dfs = new DFS(g, "0");
		for(String v: g.getVerts()) {
			if (dfs.hasPathTo(v)) {
				System.out.println("Caminho para " + v + ": " + dfs.pathTo(v));
			} else {
				System.out.println("Sem caminho para " + v);
			}
		}
	}
}
