package p409q0;

import m83.AbstractC25265s;
import p097ds.AbstractC12313p;
import p389p0.InterfaceC28540o;

/* JADX INFO: renamed from: q0.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C29682f implements InterfaceC28540o {

    /* JADX INFO: renamed from: a */
    public final AbstractC29701y f121312a;

    /* JADX INFO: renamed from: b */
    public final int f121313b;

    public C29682f(AbstractC29701y abstractC29701y, int i13) {
        this.f121312a = abstractC29701y;
        this.f121313b = i13;
    }

    @Override // p389p0.InterfaceC28540o
    /* JADX INFO: renamed from: a */
    public final int mo77523a() {
        int i13;
        AbstractC29701y abstractC29701y = this.f121312a;
        if (abstractC29701y.m91163l().f121381a.size() == 0) {
            return 0;
        }
        int iM34257I = AbstractC12313p.m34257I(abstractC29701y.m91163l());
        int i14 = abstractC29701y.m91163l().f121382b + abstractC29701y.m91163l().f121383c;
        if (i14 != 0 && (i13 = iM34257I / i14) >= 1) {
            return i13;
        }
        return 1;
    }

    @Override // p389p0.InterfaceC28540o
    /* JADX INFO: renamed from: b */
    public final boolean mo77524b() {
        return !this.f121312a.m91163l().f121381a.isEmpty();
    }

    @Override // p389p0.InterfaceC28540o
    /* JADX INFO: renamed from: c */
    public final int mo77525c() {
        return Math.max(0, this.f121312a.f121434e - this.f121313b);
    }

    @Override // p389p0.InterfaceC28540o
    /* JADX INFO: renamed from: d */
    public final int mo77526d() {
        AbstractC29701y abstractC29701y = this.f121312a;
        return Math.min(abstractC29701y.mo91148m() - 1, ((C29678d) AbstractC25265s.m74112P0(abstractC29701y.m91163l().f121381a)).f121294a + this.f121313b);
    }

    @Override // p389p0.InterfaceC28540o
    public final int getItemCount() {
        return this.f121312a.mo91148m();
    }
}
