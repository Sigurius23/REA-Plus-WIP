package ch3;

import bh3.InterfaceC3254a;
import xg3.AbstractC38292s;
import xg3.C38274a;
import xg3.InterfaceC38275b;
import xg3.InterfaceC38279f;

/* JADX INFO: renamed from: ch3.m0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4696m0 implements InterfaceC38279f {

    /* JADX INFO: renamed from: w */
    public final Long f19232w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC3254a f19233x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC38275b f19234y;

    public C4696m0() {
        this.f19232w = null;
        this.f19233x = null;
        this.f19234y = C38274a.f164080c;
    }

    @Override // bh3.InterfaceC3260g
    /* JADX INFO: renamed from: b */
    public final Object mo1678b(Object obj) {
        AbstractC38292s abstractC38292s = (AbstractC38292s) obj;
        C4692k0 c4692k0 = new C4692k0(abstractC38292s, this.f19232w, this.f19233x, this.f19234y);
        abstractC38292s.m122688c(c4692k0);
        abstractC38292s.mo14765f(c4692k0.f19221I);
        return c4692k0;
    }

    public C4696m0(long j7, InterfaceC3254a interfaceC3254a, InterfaceC38275b interfaceC38275b) {
        if (j7 <= 0) {
            throw new IllegalArgumentException("Buffer capacity must be > 0");
        }
        if (interfaceC38275b != null) {
            this.f19232w = Long.valueOf(j7);
            this.f19233x = interfaceC3254a;
            this.f19234y = interfaceC38275b;
            return;
        }
        throw new NullPointerException("The BackpressureOverflow strategy must not be null");
    }
}
