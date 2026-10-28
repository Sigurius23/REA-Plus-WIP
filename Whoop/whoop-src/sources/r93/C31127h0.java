package r93;

import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import s93.InterfaceC32307i;
import va3.C35847e;

/* JADX INFO: renamed from: r93.h0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C31127h0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f128337w;

    /* JADX INFO: renamed from: x */
    public final C35847e f128338x;

    public /* synthetic */ C31127h0(C35847e c35847e, int i13) {
        this.f128337w = i13;
        this.f128338x = c35847e;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f128337w) {
            case 0:
                C35847e it = (C35847e) obj;
                AbstractC22676k.m65750j(it, "it");
                return Boolean.valueOf(!it.f152613a.m113793c() && it.m113789b().equals(this.f128338x));
            default:
                InterfaceC32307i it3 = (InterfaceC32307i) obj;
                AbstractC22676k.m65750j(it3, "it");
                return it3.mo52689T(this.f128338x);
        }
    }
}
