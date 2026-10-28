package p005a3;

import androidx.compose.p018ui.node.NodeCoordinator;
import p002a0.C0039m0;
import p026b2.AbstractC2316v;
import p603x2.AbstractC37831a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a3.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0233o extends AbstractC2316v {

    /* JADX INFO: renamed from: O */
    public final int f803O = AbstractC0247r1.m767e(this);

    /* JADX INFO: renamed from: P */
    public AbstractC2316v f804P;

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: N0 */
    public final void mo658N0() {
        super.mo658N0();
        for (AbstractC2316v abstractC2316v = this.f804P; abstractC2316v != null; abstractC2316v = abstractC2316v.f9133F) {
            abstractC2316v.mo664W0(this.f9135H);
            if (!abstractC2316v.f9141N) {
                abstractC2316v.mo658N0();
            }
        }
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: O0 */
    public final void mo659O0() {
        for (AbstractC2316v abstractC2316v = this.f804P; abstractC2316v != null; abstractC2316v = abstractC2316v.f9133F) {
            abstractC2316v.mo659O0();
        }
        super.mo659O0();
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: S0 */
    public final void mo660S0() {
        super.mo660S0();
        for (AbstractC2316v abstractC2316v = this.f804P; abstractC2316v != null; abstractC2316v = abstractC2316v.f9133F) {
            abstractC2316v.mo660S0();
        }
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: T0 */
    public final void mo661T0() {
        for (AbstractC2316v abstractC2316v = this.f804P; abstractC2316v != null; abstractC2316v = abstractC2316v.f9133F) {
            abstractC2316v.mo661T0();
        }
        super.mo661T0();
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: U0 */
    public final void mo662U0() {
        super.mo662U0();
        for (AbstractC2316v abstractC2316v = this.f804P; abstractC2316v != null; abstractC2316v = abstractC2316v.f9133F) {
            abstractC2316v.mo662U0();
        }
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: V0 */
    public final void mo663V0(AbstractC2316v abstractC2316v) {
        this.f9142w = abstractC2316v;
        for (AbstractC2316v abstractC2316v2 = this.f804P; abstractC2316v2 != null; abstractC2316v2 = abstractC2316v2.f9133F) {
            abstractC2316v2.mo663V0(abstractC2316v);
        }
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: W0 */
    public final void mo664W0(NodeCoordinator nodeCoordinator) {
        this.f9135H = nodeCoordinator;
        for (AbstractC2316v abstractC2316v = this.f804P; abstractC2316v != null; abstractC2316v = abstractC2316v.f9133F) {
            abstractC2316v.mo664W0(nodeCoordinator);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final InterfaceC0229n m665X0(InterfaceC0229n interfaceC0229n) {
        AbstractC2316v abstractC2316v = ((AbstractC2316v) interfaceC0229n).f9142w;
        if (abstractC2316v != interfaceC0229n) {
            AbstractC2316v abstractC2316v2 = interfaceC0229n instanceof AbstractC2316v ? (AbstractC2316v) interfaceC0229n : null;
            AbstractC2316v abstractC2316v3 = abstractC2316v2 != null ? abstractC2316v2.f9132E : null;
            if (abstractC2316v != this.f9142w || !AbstractC22676k.m65745e(abstractC2316v3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
        } else {
            if (abstractC2316v.f9141N) {
                AbstractC37831a.m121374b("Cannot delegate to an already attached node");
            }
            abstractC2316v.mo663V0(this.f9142w);
            int i13 = this.f9144y;
            int iM768f = AbstractC0247r1.m768f(abstractC2316v);
            abstractC2316v.f9144y = iM768f;
            int i14 = this.f9144y;
            int i15 = iM768f & 2;
            if (i15 != 0 && (i14 & 2) != 0 && !(this instanceof InterfaceC0186c0)) {
                AbstractC37831a.m121374b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + abstractC2316v);
            }
            abstractC2316v.f9133F = this.f804P;
            this.f804P = abstractC2316v;
            abstractC2316v.f9132E = this;
            m667Z0(iM768f | this.f9144y, false);
            if (this.f9141N) {
                if (i15 == 0 || (i13 & 2) != 0) {
                    mo664W0(this.f9135H);
                } else {
                    C0223l1 c0223l1 = AbstractC0201g.m516p(this).f783e0;
                    this.f9142w.mo664W0(null);
                    c0223l1.m565o();
                }
                abstractC2316v.mo658N0();
                abstractC2316v.mo661T0();
                if (!abstractC2316v.f9141N) {
                    AbstractC37831a.m121374b("autoInvalidateInsertedNode called on unattached node");
                }
                AbstractC0247r1.m763a(abstractC2316v, -1, 1);
            }
        }
        return interfaceC0229n;
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m666Y0(InterfaceC0229n interfaceC0229n) {
        AbstractC2316v abstractC2316v = null;
        for (AbstractC2316v abstractC2316v2 = this.f804P; abstractC2316v2 != null; abstractC2316v2 = abstractC2316v2.f9133F) {
            if (abstractC2316v2 == interfaceC0229n) {
                boolean z4 = abstractC2316v2.f9141N;
                if (z4) {
                    C0039m0 c0039m0 = AbstractC0247r1.f856a;
                    if (!z4) {
                        AbstractC37831a.m121374b("autoInvalidateRemovedNode called on unattached node");
                    }
                    AbstractC0247r1.m763a(abstractC2316v2, -1, 2);
                    abstractC2316v2.mo662U0();
                    abstractC2316v2.mo659O0();
                }
                abstractC2316v2.mo663V0(abstractC2316v2);
                abstractC2316v2.f9145z = 0;
                if (abstractC2316v == null) {
                    this.f804P = abstractC2316v2.f9133F;
                } else {
                    abstractC2316v.f9133F = abstractC2316v2.f9133F;
                }
                abstractC2316v2.f9133F = null;
                abstractC2316v2.f9132E = null;
                int i13 = this.f9144y;
                int iM768f = AbstractC0247r1.m768f(this);
                m667Z0(iM768f, true);
                if (this.f9141N && (i13 & 2) != 0 && (iM768f & 2) == 0) {
                    C0223l1 c0223l1 = AbstractC0201g.m516p(this).f783e0;
                    this.f9142w.mo664W0(null);
                    c0223l1.m565o();
                    return;
                }
                return;
            }
            abstractC2316v = abstractC2316v2;
        }
        throw new IllegalStateException(("Could not find delegate: " + interfaceC0229n).toString());
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m667Z0(int i13, boolean z4) {
        AbstractC2316v abstractC2316v;
        int i14 = this.f9144y;
        this.f9144y = i13;
        if (i14 != i13) {
            AbstractC2316v abstractC2316v2 = this.f9142w;
            if (abstractC2316v2 == this) {
                this.f9145z = i13;
            }
            if (this.f9141N) {
                AbstractC2316v abstractC2316v3 = this;
                while (abstractC2316v3 != null) {
                    i13 |= abstractC2316v3.f9144y;
                    abstractC2316v3.f9144y = i13;
                    if (abstractC2316v3 == abstractC2316v2) {
                        break;
                    } else {
                        abstractC2316v3 = abstractC2316v3.f9132E;
                    }
                }
                if (z4 && abstractC2316v3 == abstractC2316v2) {
                    i13 = AbstractC0247r1.m768f(abstractC2316v2);
                    abstractC2316v2.f9144y = i13;
                }
                int i15 = i13 | ((abstractC2316v3 == null || (abstractC2316v = abstractC2316v3.f9133F) == null) ? 0 : abstractC2316v.f9145z);
                while (abstractC2316v3 != null) {
                    i15 |= abstractC2316v3.f9144y;
                    abstractC2316v3.f9145z = i15;
                    abstractC2316v3 = abstractC2316v3.f9132E;
                }
            }
        }
    }
}
