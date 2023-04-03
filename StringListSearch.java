import java.util.ArrayList;

public class StringListSearch {

    public static int unorderedSearch(ArrayList<String> items, String term) {
        for(int i = 0;i<items.size();i++){
            if(items.get(i).equals(term)){
                return i;
            }
        }
        return -1;
    }

    public static int orderedLinearSearch(ArrayList<String> items, String term){
        for(int i =0;i<items.size();i++){
            if(items.get(i).compareTo(term)>0){
                return -1;
            }
            if(items.get(i).equals(term)){
                return i;
            }
        }
        return -1;
    }
    //is, the,there, mountain
    public static int binarySearch(ArrayList<String> items, String term){
        int maxIndex = items.size()-1;
        int minIndex = 0;
        int mid = (minIndex+maxIndex)/2;
        while(minIndex!=maxIndex){
            if(items.get(mid).equals(term)){
                return mid;
            }
            if(items.get(mid).compareTo(term)<0){
                minIndex = mid+1;
            }
            if(items.get(mid).compareTo(term)>0){
                maxIndex = mid-1;
            }
            mid = (maxIndex+minIndex)/2;
        }
        if(items.get(mid).equals(term)){
            return mid;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        
    }
}