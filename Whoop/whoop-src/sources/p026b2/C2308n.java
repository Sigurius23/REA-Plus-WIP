package p026b2;

import c93.InterfaceC4351m;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: b2.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C2308n extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public static final C2308n f9123w = new C2308n(2);

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        InterfaceC2315u interfaceC2315u = (InterfaceC2315u) obj2;
        if (str.length() == 0) {
            return interfaceC2315u.toString();
        }
        return str + ", " + interfaceC2315u;
    }
}
