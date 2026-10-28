package bm2;

import c93.InterfaceC4339a;
import l83.InterfaceC23459e;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bm2.c */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3429c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13420w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC23459e f13421x;

    public /* synthetic */ C3429c(InterfaceC23459e interfaceC23459e, int i13) {
        this.f13420w = i13;
        this.f13421x = interfaceC23459e;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f13420w) {
            case 0:
                return C3432d.m9904d((Function1) this.f13421x, obj);
            default:
                return AbstractC3436e0.m9934F0((InterfaceC4339a) this.f13421x, obj);
        }
    }
}
