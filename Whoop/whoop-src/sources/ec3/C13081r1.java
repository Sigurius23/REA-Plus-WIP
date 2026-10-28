package ec3;

import bc3.InterfaceC3027k1;
import dc3.EnumC11916a;
import fc3.InterfaceC14386q;
import java.util.List;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: ec3.r1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13081r1 implements InterfaceC13037f2, InterfaceC13026d, InterfaceC14386q {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC13037f2 f45200w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC3027k1 f45201x;

    public C13081r1(InterfaceC13075p1 interfaceC13075p1, InterfaceC3027k1 interfaceC3027k1) {
        this.f45200w = interfaceC13075p1;
        this.f45201x = interfaceC3027k1;
    }

    @Override // fc3.InterfaceC14386q
    /* JADX INFO: renamed from: b */
    public final InterfaceC13058l mo36565b(InterfaceC30063j interfaceC30063j, int i13, EnumC11916a enumC11916a) {
        return (((i13 < 0 || i13 >= 2) && i13 != -2) || enumC11916a != EnumC11916a.f38983x) ? AbstractC13091v.m36581G(this, interfaceC30063j, i13, enumC11916a) : this;
    }

    @Override // ec3.InterfaceC13058l
    public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
        return this.f45200w.collect(interfaceC13062m, interfaceC30057d);
    }

    @Override // ec3.InterfaceC13087t1
    public final List getReplayCache() {
        return this.f45200w.getReplayCache();
    }

    @Override // ec3.InterfaceC13037f2
    public final Object getValue() {
        return this.f45200w.getValue();
    }
}
