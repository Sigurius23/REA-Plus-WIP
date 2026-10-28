package pg3;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* JADX INFO: renamed from: pg3.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C29197l extends AbstractC29185f {
    @Override // pg3.AbstractC29185f
    public final InterfaceC29187g get(Type type, Annotation[] annotationArr, C29224y0 c29224y0) {
        if (AbstractC29184e1.m88687i(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeM88686h = AbstractC29184e1.m88686h(0, (ParameterizedType) type);
        if (AbstractC29184e1.m88687i(typeM88686h) != C29218v0.class) {
            return new C29193j(0, typeM88686h);
        }
        if (!(typeM88686h instanceof ParameterizedType)) {
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        return new C29193j(1, AbstractC29184e1.m88686h(0, (ParameterizedType) typeM88686h));
    }
}
