package bfs;

import java.util.*;

public class BFSImplement {
    /*
                 0-----------1------------3
                  -         -
                   -       -
                    -    -
                      -2


     */
    public static void main(String... args){
        Map<Integer, List<Integer>> map = new HashMap<>();
        map.put(0, Arrays.asList(1,2));
        map.put(1, Arrays.asList(2,3));
        bfs(map, 0);

    }

    public static void bfs(Map<Integer, List<Integer>> map , int start){
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.offer(start);
        visited.add(start);

        while (!queue.isEmpty()){
            int vertex = queue.poll();
            System.out.println(vertex);
            List<Integer> adjacentList = map.getOrDefault(vertex, new ArrayList<>());
            for(int i=0;i<adjacentList.size();i++){
                int  currentNode = adjacentList.get(i);
                if(!visited.contains(currentNode)){
                    visited.add(currentNode);
                    queue.add(currentNode);
                }
            }
        }
    }
}
