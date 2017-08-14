package org.xtext.example.mydsl;

import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.xtext.generator.CodeConfig;
import org.eclipse.xtext.xtext.generator.model.TypeReference;
import org.eclipse.xtext.xtext.generator.model.XtendFileAccess;

public class CustomXtendFileAccess extends XtendFileAccess {

	protected CustomXtendFileAccess(TypeReference typeRef, CodeConfig codeConfig) {
		super(typeRef, codeConfig);
	}

	@Override
	public void setContent(StringConcatenationClient javaContent) {
		super.setContent(javaContent);
	}

	@Override
	public CharSequence getContent() {
		return super.getContent();
	}
	
}
