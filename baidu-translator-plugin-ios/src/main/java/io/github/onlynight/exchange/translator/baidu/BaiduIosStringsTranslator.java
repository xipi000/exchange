package io.github.onlynight.exchange.translator.baidu;

import io.github.onlynight.exchange.typed.text.plugin.sdk.IosStringsTranslator;

import java.util.List;

public class BaiduIosStringsTranslator extends IosStringsTranslator<BaiduTranslatorHandler> {

	@Override
	public String textType() {
		return TEXT_TYPE_IOS;
	}

}