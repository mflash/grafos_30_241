public class AppCaminhoCritico {

    public static void main(String[] args) {

        EdgeWeightedDigraph dg = new EdgeWeightedDigraph();

        In in = new In("jobs.txt");
        while(in.hasNextLine()) {
            String line = in.readLine();
            String[] data = line.split(" ");
            String jobNum = data[0];
            // Só para diferenciar do início da tarefa...
            String jobNumx = data[0]+"x";
            int duration = Integer.parseInt(data[1]);

            System.out.println(jobNum+" - "+duration);

            // Cria aresta do jobNum + jobNumx
            dg.addEdge(jobNum, jobNumx, duration);
            // Cria aresta do START para o jobNum
            dg.addEdge("START", jobNum, 0);
            // Cria aresta do jobNumx para o END
            dg.addEdge(jobNumx, "END", 0);

            for(int i=2; i<data.length; i++) {
                String dep = data[i];
                // Cria aresta do jobNumx para o início da dependência
                dg.addEdge(jobNumx, dep, 0);
            }
        }
        System.out.println(dg.toDot());
    }
}
