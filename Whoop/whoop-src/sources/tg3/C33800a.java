package tg3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import p441qx.C30722l0;
import p441qx.InterfaceC30739u;
import pg3.AbstractC29199m;
import pg3.C29224y0;
import pg3.InterfaceC29201n;

/* JADX INFO: renamed from: tg3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C33800a extends AbstractC29199m {

    /* JADX INFO: renamed from: a */
    public final C30722l0 f141574a;

    public C33800a(C30722l0 c30722l0) {
        this.f141574a = c30722l0;
    }

    /* JADX INFO: renamed from: a */
    public static Set m106959a(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(InterfaceC30739u.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.EMPTY_SET;
    }

    @Override // pg3.AbstractC29199m
    public final InterfaceC29201n requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C29224y0 c29224y0) {
        return new C33801b(this.f141574a.m94400c(type, m106959a(annotationArr), null));
    }

    @Override // pg3.AbstractC29199m
    public final InterfaceC29201n responseBodyConverter(Type type, Annotation[] annotationArr, C29224y0 c29224y0) {
        return new C33802c(this.f141574a.m94400c(type, m106959a(annotationArr), null));
    }
}
