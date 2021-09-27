package com.example.nayami.common;

import java.util.EnumMap;

public enum Category {
	GREEDY("æÃ—~"),
	ANGER("“{‚è"),
	DELUSION("–Ï‘z");
	
//    private final static EnumMap<Category, String> categoryMap;
//    
//    static {
//    	categoryMap = new EnumMap<Category, String>(Category.class);
//    	categoryMap.put(GREEDY, "æÃ—~");
//    	categoryMap.put(ANGER, "“{‚è");
//    	categoryMap.put(DELUSION, "–Ï‘z");
//    }

  private final String category;

    private Category(final String category) {
        this.category = category;
    }
	
    public String getString(){
        return this.category;
    }
    
}
