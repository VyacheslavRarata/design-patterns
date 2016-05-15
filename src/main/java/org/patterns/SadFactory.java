package org.patterns;

public class SadFactory implements AbstractFactory {

	@Override
	public EmotionProduct getSmile() {
		return new SadSmileEmotionProduct();
	}

	@Override
	public EmotionProduct getSymbol() {
		return new SadSymbolEmotionProduct();
	}

}
