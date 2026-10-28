package p459rf;

import java.util.List;
import java.util.Set;
import m83.AbstractC25265s;
import p326mf.InterfaceC25488h;
import ud3.C34807d0;

/* JADX INFO: renamed from: rf.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C31349t implements InterfaceC25488h {

    /* JADX INFO: renamed from: c */
    public final C34807d0 f128992c;

    public C31349t(C34807d0 c34807d0) {
        this.f128992c = c34807d0;
    }

    @Override // gf.InterfaceC15779t
    /* JADX INFO: renamed from: b */
    public final Set mo44479b() {
        return this.f128992c.m109866e().entrySet();
    }

    @Override // gf.InterfaceC15779t
    /* JADX INFO: renamed from: d */
    public final boolean mo44481d() {
        return true;
    }

    @Override // gf.InterfaceC15779t
    /* JADX INFO: renamed from: e */
    public final List mo44482e(String str) {
        List listM109868j = this.f128992c.m109868j(str);
        if (listM109868j.isEmpty()) {
            listM109868j = null;
        }
        return listM109868j;
    }

    @Override // gf.InterfaceC15779t
    /* JADX INFO: renamed from: f */
    public final boolean mo44483f() {
        return this.f128992c.m109863a("Accept-Encoding") != null;
    }

    @Override // gf.InterfaceC15779t
    public final Object get(String str) {
        List listMo44482e = mo44482e(str);
        return (String) (listMo44482e != null ? AbstractC25265s.m74100H0(listMo44482e) : null);
    }

    @Override // gf.InterfaceC15779t
    public final boolean isEmpty() {
        return this.f128992c.size() == 0;
    }
}
