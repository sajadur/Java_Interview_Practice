package problem_solving;

import java.util.ArrayList;
import java.util.List;

public class Print_all_sub_array_of_given_array {

    public static void main(String ... args){
        int[] arr = {1,3,5};
        fundSubset(arr);

    }

    public static void fundSubset(int[] arr){
        List<List<Integer>> subsets = new ArrayList<>();
        findSubSet(subsets, new ArrayList<>(), arr, 0);
        for(int i=0; i<subsets.size();i++){
            for(int j=0;j<subsets.get(i).size();j++){
                System.out.print(subsets.get(i).get(j) + "\t");
            }
            System.out.println();
        }
        System.out.println(subsets.stream().toArray());
    }

    public static void findSubSet(List<List<Integer>> subsets, List<Integer> subset, int[] arr, int start){
        subsets.add(new ArrayList<>(subset));
        for(int i=start; i<arr.length;i++){
            subset.add(arr[i]);
            findSubSet(subsets, subset, arr, i+1);
            subset.remove(subset.size()-1);
        }
    }


}
