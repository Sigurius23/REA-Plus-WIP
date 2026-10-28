package pg3;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: pg3.m */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC29199m {
    public static Type getParameterUpperBound(int i13, ParameterizedType parameterizedType) {
        return AbstractC29184e1.m88686h(i13, parameterizedType);
    }

    public static Class<?> getRawType(Type type) {
        return AbstractC29184e1.m88687i(type);
    }

    public InterfaceC29201n requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C29224y0 c29224y0) {
        return null;
    }

    public InterfaceC29201n responseBodyConverter(Type type, Annotation[] annotationArr, C29224y0 c29224y0) {
        return null;
    }

    public InterfaceC29201n stringConverter(Type type, Annotation[] annotationArr, C29224y0 c29224y0) {
        return null;
    }
}
