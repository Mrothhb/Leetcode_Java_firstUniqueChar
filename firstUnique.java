class Solution {
    public int firstUniqChar(String s) {
        if(s.length() == 0){
            return -1;
        }
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        String ch = "";
        int count  = 1;
        ch  += s.charAt(0);
        map.put(ch, count);
        ch = "";
        
        for(int i = 1; i < s.length(); i++){
            ch += s.charAt(i);
            
            if( (count = map.getOrDefault(ch, 0)) == 0 ){ 
                map.put(ch, new Integer(1));
            }else{
                map.put(ch, new Integer(++count));
            }
            ch = "";
        }

        for(int i = 0; i < s.length(); i++){
            ch+= s.charAt(i);
            if(map.get(ch) == 1){
               return i;
            }
            ch ="";
        }
        return -1;
    }
}


    
