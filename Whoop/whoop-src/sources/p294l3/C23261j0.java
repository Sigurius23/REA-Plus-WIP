package p294l3;

import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l3.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23261j0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public static final C23261j0 f92149w = new C23261j0();

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (AbstractC22676k.m65745e(obj, Boolean.FALSE)) {
            return new C17919x(C17919x.f69637n);
        }
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.Int");
        return new C17919x(AbstractC17918w0.m51515c(((Integer) obj).intValue()));
    }
}
