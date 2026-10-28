package fc3;

import dc3.EnumC11916a;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import q83.C30064k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;

/* JADX INFO: renamed from: fc3.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C14377h extends AbstractC14376g {
    public C14377h(InterfaceC13058l interfaceC13058l, InterfaceC30063j interfaceC30063j, int i13, EnumC11916a enumC11916a, int i14) {
        super((i14 & 4) != 0 ? -3 : i13, (i14 & 8) != 0 ? EnumC11916a.f38982w : enumC11916a, interfaceC13058l, (i14 & 2) != 0 ? C30064k.f122676w : interfaceC30063j);
    }

    @Override // fc3.AbstractC14373d
    /* JADX INFO: renamed from: f */
    public final AbstractC14373d mo36559f(InterfaceC30063j interfaceC30063j, int i13, EnumC11916a enumC11916a) {
        return new C14377h(i13, enumC11916a, this.f52490z, interfaceC30063j);
    }

    @Override // fc3.AbstractC14373d
    /* JADX INFO: renamed from: g */
    public final InterfaceC13058l mo36562g() {
        return this.f52490z;
    }

    @Override // fc3.AbstractC14376g
    /* JADX INFO: renamed from: i */
    public final Object mo41041i(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
        Object objCollect = this.f52490z.collect(interfaceC13062m, interfaceC30057d);
        return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
    }
}
