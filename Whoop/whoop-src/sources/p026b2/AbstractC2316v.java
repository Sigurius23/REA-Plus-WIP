package p026b2;

import androidx.compose.p018ui.ModifierNodeDetachedCancellationException;
import androidx.compose.p018ui.node.NodeCoordinator;
import bc3.AbstractC3006f0;
import bc3.C3023j1;
import bc3.C3031l1;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import hc3.C17171d;
import p005a3.AbstractC0201g;
import p005a3.C0266x1;
import p005a3.InterfaceC0229n;
import p132f0.C13807n;
import p450r5.C30929c;
import p603x2.AbstractC37831a;

/* JADX INFO: renamed from: b2.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2316v implements InterfaceC0229n {

    /* JADX INFO: renamed from: E */
    public AbstractC2316v f9132E;

    /* JADX INFO: renamed from: F */
    public AbstractC2316v f9133F;

    /* JADX INFO: renamed from: G */
    public C0266x1 f9134G;

    /* JADX INFO: renamed from: H */
    public NodeCoordinator f9135H;

    /* JADX INFO: renamed from: I */
    public boolean f9136I;

    /* JADX INFO: renamed from: J */
    public boolean f9137J;

    /* JADX INFO: renamed from: K */
    public boolean f9138K;

    /* JADX INFO: renamed from: L */
    public boolean f9139L;

    /* JADX INFO: renamed from: M */
    public C30929c f9140M;

    /* JADX INFO: renamed from: N */
    public boolean f9141N;

    /* JADX INFO: renamed from: x */
    public C17171d f9143x;

    /* JADX INFO: renamed from: y */
    public int f9144y;

    /* JADX INFO: renamed from: w */
    public AbstractC2316v f9142w = this;

    /* JADX INFO: renamed from: z */
    public int f9145z = -1;

    /* JADX INFO: renamed from: L0 */
    public final InterfaceC2994c0 m7158L0() {
        C17171d c17171d = this.f9143x;
        if (c17171d != null) {
            return c17171d;
        }
        C17171d c17171dM8708b = AbstractC3006f0.m8708b(AbstractC0201g.m517q(this).getCoroutineContext().plus(new C3031l1((InterfaceC3027k1) AbstractC0201g.m517q(this).getCoroutineContext().get(C3023j1.f12041w))));
        this.f9143x = c17171dM8708b;
        return c17171dM8708b;
    }

    /* JADX INFO: renamed from: M0 */
    public boolean mo3462M0() {
        return !(this instanceof C13807n);
    }

    /* JADX INFO: renamed from: N0 */
    public void mo658N0() {
        if (this.f9141N) {
            AbstractC37831a.m121374b("node attached multiple times");
        }
        if (this.f9135H == null) {
            AbstractC37831a.m121374b("attach invoked on a node without a coordinator");
        }
        this.f9141N = true;
        this.f9138K = true;
    }

    /* JADX INFO: renamed from: O0 */
    public void mo659O0() {
        if (!this.f9141N) {
            AbstractC37831a.m121374b("Cannot detach a node that is not attached");
        }
        if (this.f9138K) {
            AbstractC37831a.m121374b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.f9139L) {
            AbstractC37831a.m121374b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.f9141N = false;
        C17171d c17171d = this.f9143x;
        if (c17171d != null) {
            AbstractC3006f0.m8714h(c17171d, new ModifierNodeDetachedCancellationException());
            this.f9143x = null;
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void mo285P0() {
    }

    /* JADX INFO: renamed from: Q0 */
    public void mo286Q0() {
    }

    /* JADX INFO: renamed from: R0 */
    public void mo7159R0() {
    }

    /* JADX INFO: renamed from: S0 */
    public void mo660S0() {
        if (!this.f9141N) {
            AbstractC37831a.m121374b("reset() called on an unattached node");
        }
        mo7159R0();
    }

    /* JADX INFO: renamed from: T0 */
    public void mo661T0() {
        if (!this.f9141N) {
            AbstractC37831a.m121374b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.f9138K) {
            AbstractC37831a.m121374b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.f9138K = false;
        mo285P0();
        this.f9139L = true;
    }

    /* JADX INFO: renamed from: U0 */
    public void mo662U0() {
        if (!this.f9141N) {
            AbstractC37831a.m121374b("node detached multiple times");
        }
        if (this.f9135H == null) {
            AbstractC37831a.m121374b("detach invoked on a node without a coordinator");
        }
        if (!this.f9139L) {
            AbstractC37831a.m121374b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.f9139L = false;
        C30929c c30929c = this.f9140M;
        if (c30929c != null) {
            c30929c.invoke();
        }
        mo286Q0();
    }

    /* JADX INFO: renamed from: V0 */
    public void mo663V0(AbstractC2316v abstractC2316v) {
        this.f9142w = abstractC2316v;
    }

    /* JADX INFO: renamed from: W0 */
    public void mo664W0(NodeCoordinator nodeCoordinator) {
        this.f9135H = nodeCoordinator;
    }
}
