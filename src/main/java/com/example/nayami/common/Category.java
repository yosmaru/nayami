package com.example.nayami.common;

public enum Category {
	GREEDY("貪欲"),
	ANGER("怒り"),
	DELUSION("妄想");

  private final String category;

    private Category(final String category) {
        this.category = category;
    }
	
    public String getString(){
        return this.category;
    }
    
}
