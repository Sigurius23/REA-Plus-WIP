package p040c0;

import p077d0.AbstractC11348f;
import p077d0.C11347e2;
import p077d0.InterfaceC11337c0;
import p077d0.InterfaceC11403t1;
import p558vp.AbstractC36259c;
import p636y3.C39178j;

/* JADX INFO: renamed from: c0.q */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3770q extends InterfaceC11403t1 {
    /* JADX INFO: renamed from: a */
    static C3739f1 m11570a(InterfaceC3770q interfaceC3770q, int i13, C11347e2 c11347e2, int i14) {
        InterfaceC11337c0 interfaceC11337c0M30573u = c11347e2;
        if ((i14 & 2) != 0) {
            long j7 = 1;
            interfaceC11337c0M30573u = AbstractC11348f.m30573u(0.0f, 0.0f, 3, new C39178j((j7 & 4294967295L) | (j7 << 32)));
        }
        C3789x c3789x = (C3789x) interfaceC3770q;
        if (c3789x.m11597g(i13)) {
            return AbstractC3788w0.m11589q(interfaceC11337c0M30573u, new C3787w(c3789x, 0));
        }
        if (c3789x.m11598h(i13)) {
            return AbstractC3788w0.m11589q(interfaceC11337c0M30573u, new C3787w(c3789x, 1));
        }
        if (AbstractC36259c.m115670G(i13, 2)) {
            return AbstractC3788w0.m11591s(interfaceC11337c0M30573u, new C3787w(c3789x, 2));
        }
        return AbstractC36259c.m115670G(i13, 3) ? AbstractC3788w0.m11591s(interfaceC11337c0M30573u, new C3787w(c3789x, 3)) : AbstractC3736e1.f15289a;
    }
}
