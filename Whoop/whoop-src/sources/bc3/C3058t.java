package bc3;

import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: bc3.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C3058t extends C3060t1 implements InterfaceC3055s {
    public C3058t(InterfaceC3027k1 interfaceC3027k1) {
        super(true);
        m8804H(interfaceC3027k1);
    }

    @Override // bc3.InterfaceC3018i0
    public final Object await(InterfaceC30057d interfaceC30057d) {
        Object objM8817m = m8817m(interfaceC30057d);
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8817m;
    }

    public final boolean completeExceptionally(Throwable th3) {
        return m8807L(new C3067w(th3, false));
    }
}
