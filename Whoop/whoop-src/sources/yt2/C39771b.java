package yt2;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: yt2.b */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C39771b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f171311w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f171312x;

    public /* synthetic */ C39771b(Function1 function1, int i13) {
        this.f171311w = i13;
        this.f171312x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f171311w) {
            case 0:
                return AbstractC39772c.m127349v(this.f171312x);
            case 1:
                return AbstractC39772c.m127350w(this.f171312x);
            case 2:
                return AbstractC39772c.m127326F(this.f171312x);
            case 3:
                return AbstractC39780k.m127366H(this.f171312x);
            default:
                return AbstractC39782m.m127441Q(this.f171312x);
        }
    }
}
