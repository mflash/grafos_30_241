import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class OrdTopologica {

	private Set<String> marked;
	private List<String> ordemTopo;

	public OrdTopologica(Digraph G) {
		marked = new HashSet<String>();
		ordemTopo = new LinkedList<String>();
		for(String v: G.getVerts()) {
			if(!marked.contains(v))
				dfs(G, v);
		}
	}

	public Iterable<String> getOrdemTopo() {
		return ordemTopo;
	}

	private void dfs(Digraph g, String s) {
		System.out.println("Iniciando: " + s);
		marked.add(s);
		for (String w : g.getAdj(s)) {
			if (!marked.contains(w)) {
				dfs(g, w);
			}
		}
		System.out.println("Terminei: " + s);
		// Pós-ordem reversa
		ordemTopo.add(0, s); // add no início da lista (inverte)
	}
}
