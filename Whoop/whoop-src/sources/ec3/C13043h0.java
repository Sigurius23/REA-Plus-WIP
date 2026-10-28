package ec3;

import l83.C23454a0;
import p715kotlin.jvm.internal.C22665e0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: ec3.h0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13043h0 implements InterfaceC13058l {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC13058l f45083w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f45084x;

    public C13043h0(InterfaceC13058l interfaceC13058l, int i13) {
        this.f45083w = interfaceC13058l;
        this.f45084x = i13;
    }

    @Override // ec3.InterfaceC13058l
    public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
        Object objCollect = this.f45083w.collect(new C13051j0(new C22665e0(), this.f45084x, interfaceC13062m), interfaceC30057d);
        return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
    }
}
