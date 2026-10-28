package d30;

import e30.AbstractC12605c;
import ec3.C13045h2;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p696zy.InterfaceC41211c;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: d30.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C11560s implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37283w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC12605c f37284x;

    public /* synthetic */ C11560s(AbstractC12605c abstractC12605c, int i13) {
        this.f37283w = i13;
        this.f37284x = abstractC12605c;
    }

    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f37283w) {
            case 0:
                this.f37284x.f43016T.m47279a((InterfaceC41211c) obj, true);
                break;
            case 1:
                this.f37284x.mo35327g();
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                C13045h2 c13045h2 = this.f37284x.f43019W;
                c13045h2.getClass();
                c13045h2.m36571k(null, bool);
                break;
        }
        return C23454a0.f92919a;
    }
}
