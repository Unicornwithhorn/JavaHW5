import java.util.*;


public class PopularScaleNames {
    TreeMap<Integer, List<String>> treeMap = new TreeMap<>(Comparator.reverseOrder());
    void addName(String fullName){
        String[] CoupleNameLastname = fullName.split(" ");
        String currentName = CoupleNameLastname[0];
        if (treeMap.isEmpty()){
            List<String> newValue = new ArrayList<>();
            newValue.add(currentName);
            treeMap.put(1, newValue);
            return;
        }
        else {
            for (Map.Entry<Integer, List<String>> entry : treeMap.entrySet()) {
                if (entry.getValue().contains(currentName)) {
                    int frequency = entry.getKey() + 1;
                    if (treeMap.containsKey(frequency)) {
                        treeMap.get(frequency).add(currentName);
                        entry.getValue().remove(currentName);
                    } else {
                        List<String> newValue = new ArrayList<>();
                        newValue.add(currentName);
                        treeMap.put(frequency, newValue);
                        entry.getValue().remove(currentName);
                    }
                    return;
                }
            }
        }
        if (treeMap.containsKey(1)) {
            treeMap.get(1).add(currentName);
        } else {
            List<String> newValue = new ArrayList<>();
            newValue.add(currentName);
            treeMap.put(1, newValue);
        }
    }
}
