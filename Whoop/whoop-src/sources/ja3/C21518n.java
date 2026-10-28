package ja3;

import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.C35850h;

/* JADX INFO: renamed from: ja3.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C21518n implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f82536w;

    /* JADX INFO: renamed from: x */
    public final C21519o f82537x;

    public /* synthetic */ C21518n(C21519o c21519o, int i13) {
        this.f82536w = i13;
        this.f82537x = c21519o;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C35850h it = (C35850h) obj;
        switch (this.f82536w) {
            case 0:
                AbstractC22676k.m65750j(it, "it");
                return this.f82537x.m60511E(it);
            default:
                AbstractC22676k.m65750j(it, "it");
                return this.f82537x.m60512F(it);
        }
    }
}
