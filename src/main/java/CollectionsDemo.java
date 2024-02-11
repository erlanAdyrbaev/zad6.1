import java.util.*;

public class CollectionsDemo {
    public static int countStartWith(ArrayList<String> list, char c) {
        int result = 0;
        for (String string : list) {
            if (string.charAt(0) == c) {
                result++;
            }
        }
        return result;
    }

    public static List<Human> getNamesakes(ArrayList<Human> humans, Human current) {
        List<Human> result = new ArrayList<>(humans.size());
        for (Human human : humans) {
            if (human.getSurname().equals(current.getSurname())) {
                result.add(human);
            }

        }
        return result;
    }
    public static ArrayList<Human> deleteHuman(ArrayList<Human> humans, Human human ){
        ArrayList<Human> result = new ArrayList<>(humans.size());
        for(Human humanI : humans){
            if(!humanI.equals(human)){
                result.add(humanI);
            }
        }
        return result;
    }
    public static ArrayList<Set<Integer>> equalIntNum(ArrayList<Set<Integer>> numsOne, Set<Integer> setTwo){
        ArrayList<Set<Integer>> result = new ArrayList<>();
        for(Set<Integer> setOne : numsOne){
            boolean flag = true;

            for(Integer num : setTwo){
                if(setOne.contains(num)) flag = false;
            }
            if(flag) result.add(setOne);
        }
        return result;
    }
    public static Set<Human> maxHumanAge(ArrayList<Human> humans){
        int maxAge = 0;
        Set<Human> result = new HashSet<>();
        for(Human human : humans){
            if(human.getAge() >= maxAge) maxAge = human.getAge();
        }
        for(Human human : humans){
            if(maxAge == human.getAge()) result.add(human);
        }
        return result;
    }
    public static Set<Human> numHuman(Map<Integer, Human> map, Set<Integer> setNum){
        Set<Human> result = new HashSet<>();
        for(Integer num : setNum){
            if( map.containsKey(num)){
                result.add(map.get(num));
            }
        }
        return result;
    }

}
