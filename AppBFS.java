public class AppBFS {

	public static void main(String[] args) {
		Graph g = new Graph("tinyG.txt");
		BFS bfs = new BFS(g, "0");
		for(String v: g.getVerts()) {
			if (bfs.hasPathTo(v)) {
				System.out.println("Caminho para " + v + ": " + bfs.pathTo(v)
					+ " - dist: "+bfs.distTo(v));
			} else {
				System.out.println("Sem caminho para " + v);
			}
		}
	}
}
