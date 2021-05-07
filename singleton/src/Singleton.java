package src;

import java.util.HashMap;

public class Singleton {

    private Singleton(){

    }

    public static Singleton getInstance(int threadId){
        if(!_instance.containsKey(threadId))
            _instance.put(threadId,new Singleton());
        return _instance.get(threadId);
    }
    
    private static HashMap<Integer,Singleton> _instance = new HashMap<Integer,Singleton>();
}
