package jo;

import android.view.View;
import android.widget.PopupWindow;
import p004a2.AbstractC0152a;
import p031b9.C2871w;
import p085d9.C11799p;
import p087db.C11842c0;
import p309lo.C24548f;
import p309lo.C24563u;
import p309lo.C24564v;
import p465rm.C31571u;
import p465rm.C31580y0;
import p465rm.InterfaceC31519b1;
import p465rm.InterfaceC31582z0;

/* JADX INFO: renamed from: jo.l */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewOnClickListenerC21823l implements InterfaceC31582z0, View.OnClickListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C21830s f84145w;

    public ViewOnClickListenerC21823l(C21830s c21830s) {
        this.f84145w = c21830s;
    }

    @Override // p465rm.InterfaceC31582z0
    /* JADX INFO: renamed from: k */
    public final void mo61755k(C31580y0 c31580y0) {
        C24548f c24548f = c31580y0.f130479a;
        boolean zM97242a = c31580y0.m97242a(4, 5);
        C21830s c21830s = this.f84145w;
        if (zM97242a) {
            c21830s.m61767l();
        }
        if (c31580y0.m97242a(4, 5, 7)) {
            c21830s.m61769n();
        }
        if (c24548f.f95817a.get(8)) {
            c21830s.m61770o();
        }
        if (c24548f.f95817a.get(9)) {
            c21830s.m61772q();
        }
        if (c31580y0.m97242a(8, 9, 11, 0, 16, 17, 13)) {
            c21830s.m61766k();
        }
        if (c31580y0.m97242a(11, 0)) {
            c21830s.m61773r();
        }
        if (c24548f.f95817a.get(12)) {
            c21830s.m61768m();
        }
        if (c24548f.f95817a.get(2)) {
            c21830s.m61774s();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C21830s c21830s = this.f84145w;
        C11842c0 c11842c0 = c21830s.f84165G0;
        InterfaceC31519b1 interfaceC31519b1 = c21830s.f84215r0;
        if (interfaceC31519b1 == null) {
            return;
        }
        c11842c0.m31794i();
        if (c21830s.f84226z == view) {
            ((AbstractC0152a) interfaceC31519b1).m376J();
            return;
        }
        if (c21830s.f84224y == view) {
            ((AbstractC0152a) interfaceC31519b1).m379M();
            return;
        }
        if (c21830s.f84162F == view) {
            if (((C31571u) interfaceC31519b1).m97212e0() != 4) {
                AbstractC0152a abstractC0152a = (AbstractC0152a) interfaceC31519b1;
                C31571u c31571u = (C31571u) abstractC0152a;
                c31571u.m97198B0();
                abstractC0152a.m378L(c31571u.f130406W);
                return;
            }
            return;
        }
        if (c21830s.f84164G == view) {
            AbstractC0152a abstractC0152a2 = (AbstractC0152a) interfaceC31519b1;
            C31571u c31571u2 = (C31571u) abstractC0152a2;
            c31571u2.m97198B0();
            abstractC0152a2.m378L(-c31571u2.f130405V);
            return;
        }
        if (c21830s.f84160E == view) {
            C31571u c31571u3 = (C31571u) interfaceC31519b1;
            int iM97212e0 = c31571u3.m97212e0();
            if (iM97212e0 != 1 && iM97212e0 != 4 && c31571u3.m97211d0()) {
                c31571u3.m97225t0(false);
                return;
            }
            int iM97212e1 = c31571u3.m97212e0();
            if (iM97212e1 == 1) {
                c31571u3.m97218m0();
            } else if (iM97212e1 == 4) {
                c31571u3.m97222q0(c31571u3.m97206Y(), -9223372036854775807L);
            }
            c31571u3.m97225t0(true);
            return;
        }
        if (c21830s.f84170J == view) {
            C31571u c31571u4 = (C31571u) interfaceC31519b1;
            c31571u4.m97198B0();
            int i13 = c31571u4.f130416g0;
            int i14 = c21830s.f84156A0;
            for (int i15 = 1; i15 <= 2; i15++) {
                int i16 = (i13 + i15) % 3;
                if (i16 != 0) {
                    if (i16 != 1) {
                        if (i16 != 2 || (i14 & 2) == 0) {
                        }
                    } else if ((i14 & 1) == 0) {
                    }
                }
                i13 = i16;
            }
            c31571u4.m97226u0(i13);
            return;
        }
        if (c21830s.f84172K == view) {
            C31571u c31571u5 = (C31571u) interfaceC31519b1;
            c31571u5.m97198B0();
            boolean z4 = !c31571u5.f130417h0;
            C11799p c11799p = c31571u5.f130395M;
            c31571u5.m97198B0();
            if (c31571u5.f130417h0 != z4) {
                c31571u5.f130417h0 = z4;
                C24564v c24564v = c31571u5.f130393L.f130483H;
                c24564v.getClass();
                C24563u c24563uM71648b = C24564v.m71648b();
                c24563uM71648b.f95863a = c24564v.f95865a.obtainMessage(12, z4 ? 1 : 0, 0);
                c24563uM71648b.m71647b();
                c11799p.m31623g(9, new C2871w(z4, 2));
                c31571u5.m97229x0();
                c11799p.m31618b();
                return;
            }
            return;
        }
        if (c21830s.f84193U0 == view) {
            c11842c0.m31793h();
            c21830s.m61759d(c21830s.f84171J0);
            return;
        }
        if (c21830s.f84195V0 == view) {
            c11842c0.m31793h();
            c21830s.m61759d(c21830s.f84173K0);
        } else if (c21830s.f84197W0 == view) {
            c11842c0.m31793h();
            c21830s.m61759d(c21830s.f84183P0);
        } else if (c21830s.f84187R0 == view) {
            c11842c0.m31793h();
            c21830s.m61759d(c21830s.f84181O0);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C21830s c21830s = this.f84145w;
        if (c21830s.f84177M0) {
            c21830s.f84165G0.m31794i();
        }
    }
}
