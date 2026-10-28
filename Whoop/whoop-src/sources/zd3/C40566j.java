package zd3;

import yd3.AbstractC39470a;

/* JADX INFO: renamed from: zd3.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C40566j extends AbstractC39470a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC40578v f174692e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C40567k f174693f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40566j(String str, InterfaceC40578v interfaceC40578v, C40567k c40567k) {
        super(str, true);
        this.f174692e = interfaceC40578v;
        this.f174693f = c40567k;
    }

    @Override // yd3.AbstractC39470a
    /* JADX INFO: renamed from: a */
    public final long mo70158a() throws InterruptedException {
        C40577u c40577u;
        InterfaceC40578v interfaceC40578v = this.f174692e;
        try {
            c40577u = interfaceC40578v.mo131526g();
        } catch (Throwable th3) {
            c40577u = new C40577u(interfaceC40578v, null, th3, 2);
        }
        C40567k c40567k = this.f174693f;
        if (!c40567k.f174694E.contains(interfaceC40578v)) {
            return -1L;
        }
        c40567k.f174695F.put(c40577u);
        return -1L;
    }
}
