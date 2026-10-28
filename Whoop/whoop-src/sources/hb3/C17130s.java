package hb3;

import c93.InterfaceC4339a;
import java.util.List;
import m83.AbstractC25265s;
import m83.C25271y;
import wa3.InterfaceC37019v;

/* JADX INFO: renamed from: hb3.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C17130s implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f65780w;

    /* JADX INFO: renamed from: x */
    public final C17135x f65781x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC37019v f65782y;

    /* JADX INFO: renamed from: z */
    public final int f65783z;

    public /* synthetic */ C17130s(C17135x c17135x, InterfaceC37019v interfaceC37019v, int i13, int i14) {
        this.f65780w = i14;
        this.f65781x = c17135x;
        this.f65782y = interfaceC37019v;
        this.f65783z = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f65780w) {
            case 0:
                C17135x c17135x = this.f65781x;
                C17122k c17122k = c17135x.f65803a;
                AbstractC17104a0 abstractC17104a0M48373a = c17135x.m48373a(c17122k.f65762c);
                List listM74093D1 = abstractC17104a0M48373a != null ? AbstractC25265s.m74093D1(c17122k.f65760a.f65739e.mo16013q(abstractC17104a0M48373a, this.f65782y, this.f65783z)) : null;
                return listM74093D1 == null ? C25271y.f99162w : listM74093D1;
            default:
                C17135x c17135x2 = this.f65781x;
                C17122k c17122k2 = c17135x2.f65803a;
                AbstractC17104a0 abstractC17104a0M48373a2 = c17135x2.m48373a(c17122k2.f65762c);
                List listMo16008h = abstractC17104a0M48373a2 != null ? c17122k2.f65760a.f65739e.mo16008h(abstractC17104a0M48373a2, this.f65782y, this.f65783z) : null;
                return listMo16008h == null ? C25271y.f99162w : listMo16008h;
        }
    }
}
