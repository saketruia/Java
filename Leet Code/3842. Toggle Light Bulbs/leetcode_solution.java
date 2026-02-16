class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> list=new ArrayList<>();
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int x:bulbs){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            if(e.getValue()%2!=0){
                list.add(e.getKey());
            }
        }
        Collections.sort(list);
        return list;
        
    }
}