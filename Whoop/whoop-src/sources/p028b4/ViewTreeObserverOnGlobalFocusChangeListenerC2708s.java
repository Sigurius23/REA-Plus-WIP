package p028b4;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.p018ui.node.Owner;
import no.nordicsemi.android.dfu.DfuBaseService;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0233o;
import p026b2.AbstractC2316v;
import p095dp.AbstractC12240d;
import p164g2.AbstractC15235g;
import p164g2.C15240l;
import p164g2.C15252x;
import p164g2.InterfaceC15239k;
import p164g2.InterfaceC15241m;
import p164g2.InterfaceC15245q;
import p446r1.C30849c;
import p603x2.AbstractC37831a;

/* JADX INFO: renamed from: b4.s */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewTreeObserverOnGlobalFocusChangeListenerC2708s extends AbstractC2316v implements InterfaceC15245q, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: O */
    public View f10673O;

    /* JADX INFO: renamed from: P */
    public ViewTreeObserver f10674P;

    /* JADX INFO: renamed from: Q */
    public final C2707r f10675Q = new C2707r(this, 0);

    /* JADX INFO: renamed from: R */
    public final C2707r f10676R = new C2707r(this, 1);

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: P0 */
    public final void mo285P0() {
        ViewTreeObserver viewTreeObserver = AbstractC12240d.m34057W(this).getViewTreeObserver();
        this.f10674P = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: Q0 */
    public final void mo286Q0() {
        ViewTreeObserver viewTreeObserver = this.f10674P;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f10674P = null;
        AbstractC12240d.m34057W(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.f10673O = null;
    }

    /* JADX INFO: renamed from: X0 */
    public final C15252x m7592X0() {
        if (!this.f9142w.f9141N) {
            AbstractC37831a.m121374b("visitLocalDescendants called on an unattached node");
        }
        AbstractC2316v abstractC2316v = this.f9142w;
        if ((abstractC2316v.f9145z & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            boolean z4 = false;
            for (AbstractC2316v abstractC2316v2 = abstractC2316v.f9133F; abstractC2316v2 != null; abstractC2316v2 = abstractC2316v2.f9133F) {
                if ((abstractC2316v2.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                    AbstractC2316v abstractC2316vM504d = abstractC2316v2;
                    C30849c c30849c = null;
                    while (abstractC2316vM504d != null) {
                        if (abstractC2316vM504d instanceof C15252x) {
                            C15252x c15252x = (C15252x) abstractC2316vM504d;
                            if (z4) {
                                return c15252x;
                            }
                            z4 = true;
                        } else if ((abstractC2316vM504d.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 && (abstractC2316vM504d instanceof AbstractC0233o)) {
                            int i13 = 0;
                            for (AbstractC2316v abstractC2316v3 = ((AbstractC0233o) abstractC2316vM504d).f804P; abstractC2316v3 != null; abstractC2316v3 = abstractC2316v3.f9133F) {
                                if ((abstractC2316v3.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                    i13++;
                                    if (i13 == 1) {
                                        abstractC2316vM504d = abstractC2316v3;
                                    } else {
                                        if (c30849c == null) {
                                            c30849c = new C30849c(new AbstractC2316v[16]);
                                        }
                                        if (abstractC2316vM504d != null) {
                                            c30849c.m94885b(abstractC2316vM504d);
                                            abstractC2316vM504d = null;
                                        }
                                        c30849c.m94885b(abstractC2316v3);
                                    }
                                }
                            }
                            if (i13 == 1) {
                            }
                        }
                        abstractC2316vM504d = AbstractC0201g.m504d(c30849c);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // p164g2.InterfaceC15245q
    /* JADX INFO: renamed from: j0 */
    public final void mo469j0(InterfaceC15241m interfaceC15241m) {
        interfaceC15241m.mo534b(false);
        interfaceC15241m.mo43349d(this.f10675Q);
        interfaceC15241m.mo43348a(this.f10676R);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (AbstractC0201g.m516p(this).f765M == null) {
            return;
        }
        View viewM7586e = AbstractC2703n.m7586e(this);
        InterfaceC15239k focusOwner = AbstractC0201g.m517q(this).getFocusOwner();
        Owner ownerM517q = AbstractC0201g.m517q(this);
        boolean z4 = (view == null || view.equals(ownerM517q) || !AbstractC2703n.m7584c(viewM7586e, view)) ? false : true;
        boolean z13 = (view2 == null || view2.equals(ownerM517q) || !AbstractC2703n.m7584c(viewM7586e, view2)) ? false : true;
        if (z4 && z13) {
            this.f10673O = view2;
            return;
        }
        if (z13) {
            this.f10673O = view2;
            C15252x c15252xM7592X0 = m7592X0();
            if (c15252xM7592X0.m43358Z0().m43353a()) {
                return;
            }
            AbstractC15235g.m43304D(c15252xM7592X0);
            return;
        }
        if (!z4) {
            this.f10673O = null;
            return;
        }
        this.f10673O = null;
        if (m7592X0().m43358Z0().m43354b()) {
            ((C15240l) focusOwner).m43341d(8, false, false);
        }
    }
}
