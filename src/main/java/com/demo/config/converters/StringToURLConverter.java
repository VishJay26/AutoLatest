package com.demo.config.converters;

import lombok.SneakyThrows;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

public class StringToURLConverter implements Converter<URL> {
  @SneakyThrows
  @Override
  public URL convert(Method method, String stringURL) {
	  
	  URL url = null;
	try {
		url = new URL(stringURL);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
    return url;
  }
}
