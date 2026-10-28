package pg3;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: pg3.f */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC29185f {
    public static Type getParameterUpperBound(int i13, ParameterizedType parameterizedType) {
        return AbstractC29184e1.m88686h(i13, parameterizedType);
    }

    public static Class<?> getRawType(Type type) {
        return AbstractC29184e1.m88687i(type);
    }

    public abstract InterfaceC29187g get(Type type, Annotation[] annotationArr, C29224y0 c29224y0);
}
