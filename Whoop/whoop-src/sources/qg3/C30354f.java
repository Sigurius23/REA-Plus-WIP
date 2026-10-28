package qg3;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import pg3.AbstractC29184e1;
import pg3.AbstractC29185f;
import pg3.C29218v0;
import pg3.C29224y0;
import pg3.InterfaceC29187g;
import xg3.C38277d;
import xg3.C38280g;
import xg3.C38289p;

/* JADX INFO: renamed from: qg3.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C30354f extends AbstractC29185f {
    @Override // pg3.AbstractC29185f
    public final InterfaceC29187g get(Type type, Annotation[] annotationArr, C29224y0 c29224y0) {
        Type typeM88686h;
        boolean z4;
        boolean z13;
        Class clsM88687i = AbstractC29184e1.m88687i(type);
        boolean z14 = clsM88687i == C38289p.class;
        boolean z15 = clsM88687i == C38277d.class;
        if (clsM88687i != C38280g.class && !z14 && !z15) {
            return null;
        }
        if (z15) {
            return new C30353e(Void.class, false, true, false, true);
        }
        if (!(type instanceof ParameterizedType)) {
            String str = z14 ? "Single" : "Observable";
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type typeM88686h2 = AbstractC29184e1.m88686h(0, (ParameterizedType) type);
        Class clsM88687i2 = AbstractC29184e1.m88687i(typeM88686h2);
        if (clsM88687i2 == C29218v0.class) {
            if (!(typeM88686h2 instanceof ParameterizedType)) {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
            typeM88686h = AbstractC29184e1.m88686h(0, (ParameterizedType) typeM88686h2);
            z13 = false;
            z4 = false;
        } else if (clsM88687i2 != C30352d.class) {
            typeM88686h = typeM88686h2;
            z4 = true;
            z13 = false;
        } else {
            if (!(typeM88686h2 instanceof ParameterizedType)) {
                throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
            }
            typeM88686h = AbstractC29184e1.m88686h(0, (ParameterizedType) typeM88686h2);
            z13 = true;
            z4 = false;
        }
        return new C30353e(typeM88686h, z13, z4, z14, false);
    }
}
