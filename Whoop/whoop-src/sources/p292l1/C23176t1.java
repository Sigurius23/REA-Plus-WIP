package p292l1;

import androidx.room.C1841x;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import io.getstream.chat.android.p226ui.viewmodel.typing.C19962a;
import java.util.ArrayList;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0233o;
import p005a3.C0227m1;
import p005a3.InterfaceC0225m;
import p040c0.C3731d;
import p077d0.AbstractC11348f;
import p077d0.C11344e;
import p077d0.C11351f2;
import p133f1.AbstractC13923a2;
import p133f1.C13995y1;
import p134f2.C14014c;
import p134f2.C14015d;
import p208i2.C17919x;
import p208i2.InterfaceC17869a1;
import p238j0.C21084j;
import p238j0.InterfaceC21083i;
import p636y3.C39174f;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: l1.t1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23176t1 extends AbstractC0233o implements InterfaceC0225m {

    /* JADX INFO: renamed from: Q */
    public boolean f91677Q;

    /* JADX INFO: renamed from: R */
    public InterfaceC21083i f91678R;

    /* JADX INFO: renamed from: S */
    public float f91679S;

    /* JADX INFO: renamed from: T */
    public float f91680T;

    /* JADX INFO: renamed from: U */
    public boolean f91681U;

    /* JADX INFO: renamed from: V */
    public C2996c2 f91682V;

    /* JADX INFO: renamed from: W */
    public C23089e4 f91683W;

    /* JADX INFO: renamed from: X */
    public C11344e f91684X;

    /* JADX INFO: renamed from: Y */
    public InterfaceC17869a1 f91685Y;

    /* JADX INFO: renamed from: Z */
    public final C11344e f91686Z;

    /* JADX INFO: renamed from: a0 */
    public final C14014c f91687a0;

    public C23176t1(boolean z4, InterfaceC21083i interfaceC21083i, C23089e4 c23089e4, InterfaceC17869a1 interfaceC17869a1) {
        float f13 = C23107h4.f91273e;
        float f14 = C23107h4.f91272d;
        this.f91677Q = z4;
        this.f91678R = interfaceC21083i;
        this.f91679S = f13;
        this.f91680T = f14;
        this.f91683W = c23089e4;
        this.f91685Y = interfaceC17869a1;
        this.f91686Z = new C11344e(new C39174f((this.f91681U && z4) ? f13 : f14), AbstractC11348f.f36369k, null, 12);
        C14014c c14014c = new C14014c(new C14015d(), new C19962a(this, 23));
        m665X0(c14014c);
        this.f91687a0 = c14014c;
    }

    /* JADX INFO: renamed from: a1 */
    public static final Object m67136a1(C23176t1 c23176t1, AbstractC32275i abstractC32275i) {
        c23176t1.f91681U = false;
        ((C21084j) c23176t1.f91678R).f79947a.collect(new C1841x(9, new ArrayList(), c23176t1), abstractC32275i);
        return EnumC31071a.f128113w;
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: M0 */
    public final boolean mo3462M0() {
        return false;
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: P0 */
    public final void mo285P0() {
        this.f91682V = AbstractC3006f0.m8732z(m7158L0(), null, null, new C23170s1(this, null, 2), 3);
        if (this.f91684X == null) {
            C23089e4 c23089e4M67086c = this.f91683W;
            if (c23089e4M67086c == null) {
                C23107h4 c23107h4 = C23107h4.f91269a;
                c23089e4M67086c = C23107h4.m67086c((C23132m) AbstractC0201g.m506f(this, AbstractC23138n.f91494a), (C13995y1) AbstractC0201g.m506f(this, AbstractC13923a2.f49638a));
            }
            long jM67064c = c23089e4M67086c.m67064c(this.f91677Q, false, this.f91681U);
            this.f91684X = new C11344e(new C17919x(jM67064c), new C11351f2(C3731d.f15261z, new C0227m1(C17919x.m51545g(jM67064c), 9)), null, 12);
        }
    }

    /* JADX INFO: renamed from: b1 */
    public final void m67137b1() {
        AbstractC3006f0.m8732z(m7158L0(), null, null, new C23170s1(this, null, 0), 3);
        AbstractC3006f0.m8732z(m7158L0(), null, null, new C23170s1(this, null, 1), 3);
    }
}
