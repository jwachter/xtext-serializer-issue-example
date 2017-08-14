package org.xtext.example.mydsl;

import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.xtext.generator.CodeConfig;
import org.eclipse.xtext.xtext.generator.model.GeneratedJavaFileAccess;
import org.eclipse.xtext.xtext.generator.model.TypeReference;

public class CustomGeneratedJavaFileAccess extends GeneratedJavaFileAccess {

	private TypeReference typeRef;

	protected CustomGeneratedJavaFileAccess(TypeReference typeRef, CodeConfig codeConfig) {
		super(typeRef, codeConfig);
		this.typeRef = typeRef;
	}

	@Override
	public void setContent(StringConcatenationClient javaContent) {
		super.setContent(javaContent);
	}

	@Override
	public CharSequence getContent() {
		if (typeRef.getSimpleName().endsWith("SemanticSequencer")) {
			return super.getContent().toString().replace(", semanticObject.eGet", ", ((EObject) semanticObject).eGet");
		} else {
			return super.getContent();
		}
	}

	@Override
	public String getContentString() {
		if (typeRef.getSimpleName().endsWith("SemanticSequencer")) {
			return super.getContentString().replace(", semanticObject.eGet", ", ((EObject) semanticObject).eGet");
		} else {
			return super.getContentString();
		}
	}

}
