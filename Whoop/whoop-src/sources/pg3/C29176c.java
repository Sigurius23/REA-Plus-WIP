package pg3;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import l83.C23454a0;
import la.C23548b;
import ud3.AbstractC34799a1;
import ud3.AbstractC34846v0;
import wg3.InterfaceC37292w;

/* JADX INFO: renamed from: pg3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C29176c extends AbstractC29199m {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f118147a;

    public /* synthetic */ C29176c(int i13) {
        this.f118147a = i13;
    }

    @Override // pg3.AbstractC29199m
    public InterfaceC29201n requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C29224y0 c29224y0) {
        switch (this.f118147a) {
            case 0:
                if (AbstractC34846v0.class.isAssignableFrom(AbstractC29184e1.m88687i(type))) {
                    return C29173b.f118133x;
                }
                return null;
            default:
                return super.requestBodyConverter(type, annotationArr, annotationArr2, c29224y0);
        }
    }

    @Override // pg3.AbstractC29199m
    public final InterfaceC29201n responseBodyConverter(Type type, Annotation[] annotationArr, C29224y0 c29224y0) {
        switch (this.f118147a) {
            case 0:
                if (type == AbstractC34799a1.class) {
                    return AbstractC29184e1.m88690l(annotationArr, InterfaceC37292w.class) ? C29170a.f118127y : C29170a.f118126x;
                }
                if (type == Void.class) {
                    return C29170a.f118128z;
                }
                if (AbstractC29184e1.f118162b && type == C23454a0.class) {
                    return C29173b.f118135z;
                }
                return null;
            default:
                if (AbstractC29199m.getRawType(type) != Optional.class) {
                    return null;
                }
                return new C23548b(c29224y0.m88735d(AbstractC29199m.getParameterUpperBound(0, (ParameterizedType) type), annotationArr), 25);
        }
    }
}
