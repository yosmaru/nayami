package com.example.nayami.common;

import java.util.EnumMap;

public enum Desire {
	SURVIVAL("¶‘¶—~"),
	SAFETY("ˆÀ‘S—~"),
	SEX("«—~"),
	SLEEP("‡–°—~"),
	LAZY("‘Ó‘Ä—~"),
	PLEASURE("Š´Šy—~"),
	APPROVAL("³”F—~");

//	private final static EnumMap<Desire, String> desireMap;
//    
//    static {
//    	desireMap = new EnumMap<Desire, String>(Desire.class);
//    	desireMap.put(SURVIVAL, "¶‘¶—~");
//    	desireMap.put(SAFETY, "ˆÀ‘S—~");
//    	desireMap.put(SEX, "«—~");
//    	desireMap.put(SLEEP, "‡–°—~");
//    	desireMap.put(LAZY, "‘Ó‘Ä—~");
//    	desireMap.put(PLEASURE, "Š´Šy—~");
//    	desireMap.put(APPROVAL, "³”F—~");
//    }
//
//    public static String toString(Desire desire){
//        return desireMap.get(desire);
//    }

	private final String desire;

	private Desire(final String desire) {
        this.desire = desire;
    }
	
    public String getString(){
        return this.desire;
    }

	


	
}
