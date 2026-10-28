package p698au1;

import c93.InterfaceC4339a;
import p390p1.InterfaceC28670t2;

/* JADX INFO: renamed from: au1.r */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C2073r implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8223w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f8224x;

    public /* synthetic */ C2073r(Object obj, int i13) {
        this.f8223w = i13;
        this.f8224x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f8223w) {
            case 0:
                return Boolean.valueOf(AbstractC2072q.b.m6559h((InterfaceC28670t2) this.f8224x));
            default:
                return AbstractC2060e.m6488f((InterfaceC4339a) this.f8224x);
        }
    }
}
