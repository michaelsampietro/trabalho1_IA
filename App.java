public class App {
    final static private String INITIAL_STATE = "342517608";
    final static private String GOAL_STATE = "123804765";



    public static void main(String[] args) {
        String rootState = INITIAL_STATE;
        long startTime = System.currentTimeMillis();

        SearchTree search = new SearchTree(new Node(rootState), GOAL_STATE);
        search.breadthFirstSearch();

        long finishTime = System.currentTimeMillis();
        long totalTime = finishTime - startTime;
        System.out.println("Time  :" + totalTime);


    }
}
