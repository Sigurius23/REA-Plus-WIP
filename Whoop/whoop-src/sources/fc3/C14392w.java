package fc3;

import dc3.InterfaceC11936u;
import dc3.InterfaceC11939x;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: fc3.w */
/* JADX INFO: loaded from: classes5.dex */
public final class C14392w implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final InterfaceC11939x f52534w;

    public C14392w(InterfaceC11936u interfaceC11936u) {
        this.f52534w = interfaceC11936u;
    }

    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        Object objMo32219t = this.f52534w.mo32219t(obj, interfaceC30057d);
        return objMo32219t == EnumC31071a.f128113w ? objMo32219t : C23454a0.f92919a;
    }
}
