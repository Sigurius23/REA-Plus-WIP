package p326mf;

import java.util.List;
import java.util.Set;
import m83.AbstractC25265s;
import m83.C25235a0;
import m83.C25271y;

/* JADX INFO: renamed from: mf.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C25487g implements InterfaceC25488h {

    /* JADX INFO: renamed from: c */
    public static final C25487g f99823c = new C25487g();

    @Override // gf.InterfaceC15779t
    /* JADX INFO: renamed from: b */
    public final Set mo44479b() {
        return C25235a0.f99113w;
    }

    @Override // gf.InterfaceC15779t
    /* JADX INFO: renamed from: d */
    public final boolean mo44481d() {
        return true;
    }

    @Override // gf.InterfaceC15779t
    /* JADX INFO: renamed from: e */
    public final List mo44482e(String str) {
        return C25271y.f99162w;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof InterfaceC25488h) && ((InterfaceC25488h) obj).isEmpty();
    }

    @Override // gf.InterfaceC15779t
    /* JADX INFO: renamed from: f */
    public final boolean mo44483f() {
        return false;
    }

    @Override // gf.InterfaceC15779t
    public final Object get(String str) {
        return (String) AbstractC25265s.m74100H0(C25271y.f99162w);
    }

    @Override // gf.InterfaceC15779t
    public final boolean isEmpty() {
        return true;
    }
}
