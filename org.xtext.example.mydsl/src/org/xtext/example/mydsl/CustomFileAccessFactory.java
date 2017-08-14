package org.xtext.example.mydsl;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.xtext.xtext.generator.CodeConfig;
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory;
import org.eclipse.xtext.xtext.generator.model.GeneratedJavaFileAccess;
import org.eclipse.xtext.xtext.generator.model.JavaFileAccess;
import org.eclipse.xtext.xtext.generator.model.TypeReference;
import org.eclipse.xtext.xtext.generator.model.XtendFileAccess;

public class CustomFileAccessFactory extends FileAccessFactory {

	CodeConfig codeConfig;

	public CustomFileAccessFactory(CodeConfig codeConfig) {
		this.codeConfig = codeConfig;
	}

	@Override
	public JavaFileAccess createJavaFile(TypeReference typeRef) {
		try {
			return new CustomJavaFileAccess(typeRef, codeConfig);
		} catch (SecurityException | IllegalArgumentException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public GeneratedJavaFileAccess createGeneratedJavaFile(TypeReference typeRef) {
		return new CustomGeneratedJavaFileAccess(typeRef, codeConfig);
	}

	@Override
	public XtendFileAccess createXtendFile(TypeReference typeRef) {
		return new CustomXtendFileAccess(typeRef, codeConfig);
	}

}
