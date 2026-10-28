package p045c6;

import al0.C0971f;
import c93.InterfaceC4339a;
import l83.C23454a0;
import ne3.C26611e0;
import oe3.AbstractC27883c;
import p249jc.C21567b;

/* JADX INFO: renamed from: c6.d */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C4261d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17309w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C4262e f17310x;

    public /* synthetic */ C4261d(C4262e c4262e, int i13) {
        this.f17309w = i13;
        this.f17310x = c4262e;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f17309w) {
            case 0:
                C4262e c4262e = this.f17310x;
                synchronized (C4262e.f17312g) {
                    C4262e.f17311f.remove(((C26611e0) c4262e.f17317e.getValue()).f105849w.m79265s());
                }
                return C23454a0.f92919a;
            default:
                C0971f c0971f = this.f17310x.f17316d;
                C26611e0 c26611e0 = (C26611e0) c0971f.invoke();
                if (AbstractC27883c.m84154a(c26611e0) != -1) {
                    return C21567b.m60606o(c26611e0.f105849w.m79265s(), true);
                }
                throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + c0971f + ", instead got " + c26611e0).toString());
        }
    }
}
