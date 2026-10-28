package p522uf;

import p647yf.InterfaceC39492e;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: uf.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C34886m implements InterfaceC39492e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f146925a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC39492e f146926b;

    public /* synthetic */ C34886m(InterfaceC39492e interfaceC39492e, int i13) {
        this.f146925a = i13;
        this.f146926b = interfaceC39492e;
    }

    @Override // p647yf.InterfaceC39492e
    /* JADX INFO: renamed from: a */
    public final Object mo2061a(Object obj, AbstractC32269c abstractC32269c) {
        switch (this.f146925a) {
            case 0:
                return ((C34873e) this.f146926b).m110026b((C34894u) obj, abstractC32269c);
            default:
                return this.f146926b.mo2061a((C34894u) obj, abstractC32269c);
        }
    }
}
