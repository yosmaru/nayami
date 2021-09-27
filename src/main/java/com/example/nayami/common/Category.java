package com.example.nayami.common;

import java.util.EnumMap;

public enum Category {
	GREEDY("�×~"),
	ANGER("�{��"),
	DELUSION("�ϑz");
	
//    private final static EnumMap<Category, String> categoryMap;
//    
//    static {
//    	categoryMap = new EnumMap<Category, String>(Category.class);
//    	categoryMap.put(GREEDY, "�×~");
//    	categoryMap.put(ANGER, "�{��");
//    	categoryMap.put(DELUSION, "�ϑz");
//    }

  private final String category;

    private Category(final String category) {
        this.category = category;
    }
	
    public String getString(){
        return this.category;
    }
    
}
