package t20;

import b30.C2656x4;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import q20.C29834s;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: t20.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C33330k implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f139014w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C33333n f139015x;

    public /* synthetic */ C33330k(C33333n c33333n, int i13) {
        this.f139014w = i13;
        this.f139015x = c33333n;
    }

    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f139014w) {
            case 0:
                this.f139015x.f139037p.invoke((C29834s) obj);
                break;
            case 1:
                this.f139015x.f139038q.invoke(new C2656x4(((Boolean) obj).booleanValue(), 10));
                break;
            default:
                this.f139015x.f139035n.invoke((InterfaceC33340u) obj);
                break;
        }
        return C23454a0.f92919a;
    }
}
