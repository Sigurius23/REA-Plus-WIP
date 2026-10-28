package p182h3;

import androidx.compose.p018ui.node.NodeCoordinator;
import p209i3.C18034p;
import p635y2.InterfaceC39147y;
import p636y3.C39179k;

/* JADX INFO: renamed from: h3.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C16795k {

    /* JADX INFO: renamed from: a */
    public final C18034p f64548a;

    /* JADX INFO: renamed from: b */
    public final int f64549b;

    /* JADX INFO: renamed from: c */
    public final C39179k f64550c;

    /* JADX INFO: renamed from: d */
    public final NodeCoordinator f64551d;

    public C16795k(C18034p c18034p, int i13, C39179k c39179k, NodeCoordinator nodeCoordinator) {
        this.f64548a = c18034p;
        this.f64549b = i13;
        this.f64550c = c39179k;
        this.f64551d = nodeCoordinator;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC39147y m47342a() {
        return this.f64551d;
    }

    /* JADX INFO: renamed from: b */
    public final C18034p m47343b() {
        return this.f64548a;
    }

    /* JADX INFO: renamed from: c */
    public final C39179k m47344c() {
        return this.f64550c;
    }

    public final String toString() {
        return "ScrollCaptureCandidate(node=" + this.f64548a + ", depth=" + this.f64549b + ", viewportBoundsInWindow=" + this.f64550c + ", coordinates=" + this.f64551d + ')';
    }
}
