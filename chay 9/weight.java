import java.util.Hashset
 public class app {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
    }
}
class edge{
    int src;
    int dest;
    int weight;
    edge(int src,int dest,int weight){
        this.src=src;
        this.dest=dest;
        this.weight=weight;
    }
    edge(int src,int dest){
        this.src=src;
        this.dest=dest;
        this.weight=1;
        class garph{
            hashset<edge>graph;
            int vertices;
            boolean isdirected;
            graph(int vertices,boolean isdirected){
                this.vertices=vertices;
                this.isdirected=isdirected;
                graph=new Hashset<edge>();
            }
            public void addedge(int src,int dest){
                if (isvalid(src,dest)){
                    edge e=new edge(src,dest);
                    graph.add(e);
                    if(! isdirected){
                        edge e2=new edge(dest,src);
                        graph.add(e2);
                    }
                }else{
                    System.out.println("invalid source and destination");
                }
            }
            public void addedge(int src,int dest,int weight){
                if(isvalid(src,dest)){
                    edge e=new edge(src,dest,weight);
                    graph.add(e);
                    if(! isdirected){
                        var e2=new edge(dest,src,weight);
                        graph.add(e2);
                    }
                }else{
                    System.out.println("invalid source and destinations.");
                }
            }
            public boolean isvalid(int src,int dest){
                return src>=0 && dest>=0 && src<vertices && dest<vertices && src!=dest;
            }
        }
    }
}