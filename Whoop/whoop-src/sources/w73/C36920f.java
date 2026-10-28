package w73;

import bi.AbstractC3269g;
import com.whoop.data.repositories.C6656c;
import l73.AbstractC23412c;
import l73.InterfaceC23413d;
import p249jc.AbstractC21598x;

/* JADX INFO: renamed from: w73.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C36920f extends AbstractC23412c {

    /* JADX INFO: renamed from: w */
    public final C6656c f157976w;

    public C36920f(C6656c c6656c) {
        this.f157976w = c6656c;
    }

    @Override // l73.AbstractC23412c
    /* JADX INFO: renamed from: d */
    public final void mo43873d(InterfaceC23413d interfaceC23413d) {
        C36919e c36919e = new C36919e(interfaceC23413d, 0);
        interfaceC23413d.mo13591b(c36919e);
        try {
            this.f157976w.m19989d(c36919e);
        } catch (Throwable th3) {
            AbstractC3269g.m9495a0(th3);
            if (c36919e.m118548a(th3)) {
                return;
            }
            AbstractC21598x.m60677d0(th3);
        }
    }
}
