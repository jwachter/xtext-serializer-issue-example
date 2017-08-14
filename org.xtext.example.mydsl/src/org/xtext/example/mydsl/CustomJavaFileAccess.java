package org.xtext.example.mydsl;

import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.xtext.generator.CodeConfig;
import org.eclipse.xtext.xtext.generator.model.JavaFileAccess;
import org.eclipse.xtext.xtext.generator.model.TypeReference;

public class CustomJavaFileAccess extends JavaFileAccess {

	private TypeReference typeRef;

	public CustomJavaFileAccess(TypeReference typeRef, CodeConfig codeConfig) {
		super(typeRef, codeConfig);
		this.typeRef = typeRef;
	}
	
	
	@Override
	public void setContent(StringConcatenationClient javaContent) {
		super.setContent(javaContent);
	}
	
	@Override
	public CharSequence getContent() {
		return super.getContent();
	}
	
	@Override
	public String getContentString() {
		if(typeRef.getSimpleName().endsWith("SemanticSequencer")) {
			System.out.println("Something semantic");
		}
		return super.getContentString();
	}

}
