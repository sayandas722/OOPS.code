import java.util.*;
public class HashMapApplications {

         // Implementation of Topological Sort using hashmap.
    public boolean topologicalSort(int numCourses, int[][] prerequisites) {

        int count = 0;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int[] indegree = new int[numCourses];
        for(int i = 0 ;i < prerequisites.length; i++) {
            if(!map.containsKey(prerequisites[i][1])) {
                map.put(prerequisites[i][1], new ArrayList<>());
            }
            indegree[prerequisites[i][0]]++;
            map.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < numCourses; i++) {
            if(indegree[i] == 0) {
                q.offer(i);
            }
        }
        
        if(q.isEmpty()) {
            return false;
        }
        
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i < size; i++) {
                int temp = q.poll();
                count++;
                List<Integer> list = map.get(temp);
                
                if(list != null) {
                    for(int l: list) {
                        indegree[l]--;
                        if(indegree[l] == 0) {
                            q.offer(l);
                        }
                    }
                }  
            }
        }
        return count == numCourses;
        
    }




         // Implementation of Prefix tree (Prefix tree is a tree data structure used to efficiently store and retrieve keys in a dataset of strings) 
           // using hashmap.

    class Trie {
    
        TrieNode root = new TrieNode();
    
        public Trie() {
            
        }
        
        public void insert(String word) {
            TrieNode current = root;
            for(char ch : word.toCharArray()){
                if(!current.children.containsKey(ch)){
                    current.children.put(ch, new TrieNode());
                }
                current = current.children.get(ch);
            }
            current.children.put('*', null);
        }
        
        public boolean search(String word) {
            TrieNode node = root;
            for(char ch : word.toCharArray()){
                if(!node.children.containsKey(ch)){
                    return false;
                }
                node = node.children.get(ch);
            }
            return node.children.containsKey('*');
        }
        
        public boolean startsWith(String prefix) {
            TrieNode node = root;
            for(char ch : prefix.toCharArray()){
                if(!node.children.containsKey(ch)){
                    return false;
                }
                node = node.children.get(ch);
            }
            return true;
        }
        
        static class TrieNode{
            Map<Character, TrieNode> children = new HashMap<>();
        }
    }


            //LFU Cache Implementation 
    class LFUCache {
    
        int cap;
        Map<Integer,Integer> cache = new HashMap<>();
        Map<Integer,Integer> keycount = new HashMap<>();
        Map<Integer,LinkedHashSet<Integer>> freqmap = new HashMap<>();
        int min = -1;
        public LFUCache(int capacity) {
            cap = capacity;
            freqmap.put(1,new LinkedHashSet<>());
        }
        
        public int get(int key) {
            if(cache.containsKey(key)==false)
                return -1;
            int count = keycount.get(key);
            keycount.put(key,count+1);
            freqmap.get(count).remove(key);
            if(count==min&&freqmap.get(count).size()==0)
                min++;
            if(freqmap.containsKey(count+1)==false)
                freqmap.put(count+1,new LinkedHashSet<>());
            freqmap.get(count+1).add(key);
            return cache.get(key);
        }
        
        public void put(int key, int value) {
            if(cap<=0)
                return;
            if(cache.containsKey(key))
            {
                cache.put(key,value);
                get(key);
                return;
            }    
            if(cache.size()>=cap)
            {
                int evict = freqmap.get(min).iterator().next();
                freqmap.get(min).remove(evict);
                cache.remove(evict);
                keycount.remove(evict);
            }
            cache.put(key,value);
            keycount.put(key,1);
            min = 1;
            freqmap.get(1).add(key);
            
        }
    }
}
