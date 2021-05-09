
import java.util.ArrayList;
import java.util.Collection;

import src.Graph;
import src.Graph.Edge;
import src.Graph.Vertex;

public class Main {

    public static void main(String[] args) {
        var prod1 = new Product("Abc Manufacturing","TZ distributors","A crate of 24 bottles of coke");
        var prod2 = new Product("Az suppliers","Mr B Jonson","Dozen of fresh eggs");
        Block block1 = new Block(prod1);
        Block block2 = new Block(prod2);

        Vertex<Block> vertex = new Vertex<>(block1);
        Vertex<Block> vertex2 = new Vertex<Block>(block2);
        Edge<Block> edge = new Edge<>(1, vertex, vertex2);

        Collection<Vertex<Block>> vertexs = new ArrayList<>();

        vertexs.add(vertex);
        vertexs.add(vertex2);
        Collection<Edge<Block>> edges = new ArrayList<>();
        edges.add(edge);

        Graph<Block> g = new Graph<>(Graph.TYPE.DIRECTED, vertexs, edges);

        for (Vertex<Block> v:g.getVertices()) {
            System.out.println(v.getValue().getData().getDescription());

        }
    
    }

}
