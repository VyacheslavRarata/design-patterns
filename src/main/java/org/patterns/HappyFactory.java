package org.patterns;

public class HappyFactory implements AbstractFactory {

	@Override
	public EmotionProduct getSmile() {
		return new HappySmileEmotionProduct();
	}

	@Override
	public EmotionProduct getSymbol() {
		return new HappySymbolEmotionProduct();
	}

}
