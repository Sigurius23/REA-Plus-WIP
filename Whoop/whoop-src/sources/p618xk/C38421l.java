package p618xk;

import al.C0960g;
import java.io.InputStream;
import p508ty.C34249c;

/* JADX INFO: renamed from: xk.l */
/* JADX INFO: loaded from: classes.dex */
public final class C38421l implements InterfaceC38415f {

    /* JADX INFO: renamed from: a */
    public final C0960g f164491a;

    public C38421l(C0960g c0960g) {
        this.f164491a = c0960g;
    }

    @Override // p618xk.InterfaceC38415f
    /* JADX INFO: renamed from: a */
    public final InterfaceC38416g mo49223a(Object obj) {
        return new C34249c((InputStream) obj, this.f164491a);
    }

    @Override // p618xk.InterfaceC38415f
    /* JADX INFO: renamed from: b */
    public final Class mo49224b() {
        return InputStream.class;
    }
}
