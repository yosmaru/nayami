package com.example.nayami.common;

import java.util.EnumMap;

public enum Desire {
	SURVIVAL("�����~"),
	SAFETY("���S�~"),
	SEX("���~"),
	SLEEP("�����~"),
	LAZY("�ӑė~"),
	PLEASURE("���y�~"),
	APPROVAL("���F�~");

//	private final static EnumMap<Desire, String> desireMap;
//    
//    static {
//    	desireMap = new EnumMap<Desire, String>(Desire.class);
//    	desireMap.put(SURVIVAL, "�����~");
//    	desireMap.put(SAFETY, "���S�~");
//    	desireMap.put(SEX, "���~");
//    	desireMap.put(SLEEP, "�����~");
//    	desireMap.put(LAZY, "�ӑė~");
//    	desireMap.put(PLEASURE, "���y�~");
//    	desireMap.put(APPROVAL, "���F�~");
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
