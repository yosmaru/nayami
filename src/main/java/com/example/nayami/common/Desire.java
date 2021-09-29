package com.example.nayami.common;

public enum Desire {
	SURVIVAL("生存欲"),
	SAFETY("安全欲"),
	SEX("性欲"),
	SLEEP("睡眠欲"),
	LAZY("怠惰欲"),
	PLEASURE("感楽欲"),
	APPROVAL("承認欲");

	private final String desire;

	private Desire(final String desire) {
        this.desire = desire;
    }
	
    public String getString(){
        return this.desire;
    }
	
}
