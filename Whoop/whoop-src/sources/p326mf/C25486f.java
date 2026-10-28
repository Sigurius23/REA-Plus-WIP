package p326mf;

import java.util.List;
import java.util.Set;
import m83.C25235a0;
import m83.C25271y;

/* JADX INFO: renamed from: mf.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C25486f implements InterfaceC25482b {

    /* JADX INFO: renamed from: c */
    public static final C25486f f99822c = new C25486f();

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
        return (obj instanceof InterfaceC25482b) && ((InterfaceC25482b) obj).isEmpty();
    }

    @Override // gf.InterfaceC15779t
    public final boolean isEmpty() {
        return true;
    }
}
