package o42;

import c93.InterfaceC4339a;
import p163g1.C15199y3;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o42.g */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C27527g implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f110821w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f110822x;

    public /* synthetic */ C27527g(Object obj, int i13) {
        this.f110821w = i13;
        this.f110822x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f110821w) {
            case 0:
                return AbstractC27531k.m82988V((Function1) this.f110822x);
            case 1:
                return AbstractC27531k.m83010i0((Function1) this.f110822x);
            case 2:
                return AbstractC27531k.m82992Z((Function1) this.f110822x);
            default:
                return Boolean.valueOf(AbstractC27531k.a.m83037h((C15199y3) this.f110822x));
        }
    }
}
