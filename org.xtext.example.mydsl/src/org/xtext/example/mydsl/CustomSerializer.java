package org.xtext.example.mydsl;

import java.lang.reflect.Field;

import org.eclipse.xtext.xtext.generator.CodeConfig;
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory;
import org.eclipse.xtext.xtext.generator.serializer.SerializerFragment2;

public class CustomSerializer extends SerializerFragment2 {

	@Override
	public void generate() {
		System.out.println("Generating stuff");
		try {
			Field fileAccessFactoryField = SerializerFragment2.class.getDeclaredField("fileAccessFactory");
			fileAccessFactoryField.setAccessible(true);
			FileAccessFactory factory = (FileAccessFactory) fileAccessFactoryField.get(this);
			Field codeConfigField = FileAccessFactory.class.getDeclaredField("codeConfig");
			codeConfigField.setAccessible(true);
			CodeConfig codeConfig = (CodeConfig) codeConfigField.get(factory);

			fileAccessFactoryField.set(this, new CustomFileAccessFactory(codeConfig));
			super.generate();
			fileAccessFactoryField.set(this, factory);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}
	
}
