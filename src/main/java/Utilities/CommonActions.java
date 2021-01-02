package Utilities;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CommonActions {
    public static List<String> sortListFromAtoZ(List<String> list){
        List<String> sorted = list.stream().sorted().collect(Collectors.toList());
        return sorted;
    }

    public static List<String> sortListFromZtoA(List<String> list){
        List<String> sorted = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        return sorted;
    }

    public static List<Float> convertStringPriceListToFloat(List<String> list){
        List<Float> floatList = new ArrayList<>();
        for(int i=0;i<list.size();i++) {
            floatList.add(Float.parseFloat(list.get(i).replace("$","")));
        }
        return floatList;
    }

    public static List<Float> sortListFromHtoL(List<String> list){
        List<Float> sorted = convertStringPriceListToFloat(list).stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        return sorted;
    }

    public static List<Float> sortListFromLtoH(List<String> list){
        List<Float> sorted = convertStringPriceListToFloat(list).stream().sorted().collect(Collectors.toList());
        return sorted;
    }
}
