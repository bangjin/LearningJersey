package com.bj.learning.resources;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/**
 * Created by wbj on 16-6-19.
 */
public class UserParam implements ParamConverterProvider {
    public <T> ParamConverter<T> getConverter(Class<T> rawType, Type genericType, Annotation[] annotations) {
        return null;
    }
}
