package sg3;

import ad3.AbstractC0757c;
import ad3.C0783z;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p389p0.C28539n0;
import p474s.C31983m2;
import p549vb.AbstractC35862g;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.AbstractC29199m;
import pg3.C29224y0;
import pg3.InterfaceC29201n;
import ud3.C34818h0;
import wc3.InterfaceC37147l;

/* JADX INFO: renamed from: sg3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C32474a extends AbstractC29199m {

    /* JADX INFO: renamed from: a */
    public final C34818h0 f134487a;

    /* JADX INFO: renamed from: b */
    public final C0783z f134488b;

    public C32474a(C34818h0 c34818h0, C0783z c0783z) {
        this.f134487a = c34818h0;
        this.f134488b = c0783z;
    }

    @Override // pg3.AbstractC29199m
    public final InterfaceC29201n requestBodyConverter(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, C29224y0 retrofit) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(parameterAnnotations, "parameterAnnotations");
        AbstractC22676k.m65750j(methodAnnotations, "methodAnnotations");
        AbstractC22676k.m65750j(retrofit, "retrofit");
        C0783z c0783z = this.f134488b;
        return new C31983m2(this.f134487a, AbstractC35862g.m113845h(((AbstractC0757c) ((InterfaceC37147l) c0783z.f2818x)).f2764b, type), c0783z);
    }

    @Override // pg3.AbstractC29199m
    public final InterfaceC29201n responseBodyConverter(Type type, Annotation[] annotations, C29224y0 retrofit) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(annotations, "annotations");
        AbstractC22676k.m65750j(retrofit, "retrofit");
        C0783z c0783z = this.f134488b;
        return new C28539n0(4, AbstractC35862g.m113845h(((AbstractC0757c) ((InterfaceC37147l) c0783z.f2818x)).f2764b, type), c0783z);
    }
}
