package ec3;

import l83.C23454a0;
import p000.C36623w;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: ec3.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C13034f implements InterfaceC13026d {

    /* JADX INFO: renamed from: w */
    public final InterfaceC13058l f45052w;

    public C13034f(InterfaceC13058l interfaceC13058l) {
        this.f45052w = interfaceC13058l;
    }

    @Override // ec3.InterfaceC13058l
    public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
        Object objCollect = this.f45052w.collect(new C36623w(interfaceC13062m, 5), interfaceC30057d);
        return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
    }
}
