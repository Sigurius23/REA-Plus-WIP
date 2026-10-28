package eu2;

import c93.InterfaceC4339a;
import p390p1.InterfaceC28670t2;
import p711j31.C21280k;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: eu2.h */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C13651h implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f48390w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f48391x;

    public /* synthetic */ C13651h(Object obj, int i13) {
        this.f48390w = i13;
        this.f48391x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f48390w) {
            case 0:
                return AbstractC13650g.e.m38485h((C21280k) this.f48391x);
            case 1:
                return AbstractC13650g.g.m38487h((InterfaceC28670t2) this.f48391x);
            default:
                return AbstractC13650g.m38472t((Function1) this.f48391x);
        }
    }
}
