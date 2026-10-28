package p329n0;

import java.util.Collection;
import m83.AbstractC25265s;
import p389p0.InterfaceC28540o;
import p390p1.C28621h1;
import se.AbstractC32410a;
import se.AbstractC32417h;

/* JADX INFO: renamed from: n0.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C26050c implements InterfaceC28540o {

    /* JADX INFO: renamed from: a */
    public final C26068u f103119a;

    public C26050c(C26068u c26068u) {
        this.f103119a = c26068u;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // p389p0.InterfaceC28540o
    /* JADX INFO: renamed from: a */
    public final int mo77523a() {
        int i13;
        C26068u c26068u = this.f103119a;
        if (c26068u.m77565h().f103177k.isEmpty()) {
            return 0;
        }
        int iM101176G = AbstractC32417h.m101176G(c26068u.m77565h());
        int iM101039k0 = AbstractC32410a.m101039k0(c26068u.m77565h());
        if (iM101039k0 != 0 && (i13 = iM101176G / iM101039k0) >= 1) {
            return i13;
        }
        return 1;
    }

    @Override // p389p0.InterfaceC28540o
    /* JADX INFO: renamed from: b */
    public final boolean mo77524b() {
        return !((Collection) this.f103119a.m77565h().f103177k).isEmpty();
    }

    @Override // p389p0.InterfaceC28540o
    /* JADX INFO: renamed from: c */
    public final int mo77525c() {
        return Math.max(0, ((C28621h1) this.f103119a.f103222e.f91958b).m87024x());
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // p389p0.InterfaceC28540o
    /* JADX INFO: renamed from: d */
    public final int mo77526d() {
        return Math.min(getItemCount() - 1, ((C26062o) ((InterfaceC26054g) AbstractC25265s.m74112P0(this.f103119a.m77565h().f103177k))).f103184a);
    }

    @Override // p389p0.InterfaceC28540o
    public final int getItemCount() {
        return this.f103119a.m77565h().f103180n;
    }
}
