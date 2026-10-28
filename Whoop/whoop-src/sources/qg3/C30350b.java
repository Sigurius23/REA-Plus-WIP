package qg3;

import ih3.C18530c;
import xg3.AbstractC38292s;
import xg3.InterfaceC38278e;

/* JADX INFO: renamed from: qg3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C30350b implements InterfaceC38278e {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f124528w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC38278e f124529x;

    public /* synthetic */ C30350b(InterfaceC38278e interfaceC38278e, int i13) {
        this.f124528w = i13;
        this.f124529x = interfaceC38278e;
    }

    @Override // bh3.InterfaceC3255b
    /* JADX INFO: renamed from: b */
    public final void mo9472b(Object obj) {
        switch (this.f124528w) {
            case 0:
                this.f124529x.mo9472b(new C30349a((AbstractC38292s) obj));
                break;
            default:
                this.f124529x.mo9472b(new C18530c((AbstractC38292s) obj));
                break;
        }
    }
}
