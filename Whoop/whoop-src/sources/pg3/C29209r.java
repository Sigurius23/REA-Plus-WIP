package pg3;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: pg3.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C29209r extends AbstractC29185f {

    /* JADX INFO: renamed from: a */
    public final Executor f118208a;

    public C29209r(Executor executor) {
        this.f118208a = executor;
    }

    @Override // pg3.AbstractC29185f
    public final InterfaceC29187g get(Type type, Annotation[] annotationArr, C29224y0 c29224y0) {
        if (AbstractC29184e1.m88687i(type) != InterfaceC29182e.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new C29203o(AbstractC29184e1.m88686h(0, (ParameterizedType) type), AbstractC29184e1.m88690l(annotationArr, InterfaceC29226z0.class) ? null : this.f118208a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
