package p586wk;

import java.security.MessageDigest;
import tl.C33903b;

/* JADX INFO: renamed from: wk.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C37330h implements InterfaceC37327e {

    /* JADX INFO: renamed from: b */
    public final C33903b f159595b = new C33903b(0);

    @Override // p586wk.InterfaceC37327e
    /* JADX INFO: renamed from: a */
    public final void mo33605a(MessageDigest messageDigest) {
        int i13 = 0;
        while (true) {
            C33903b c33903b = this.f159595b;
            if (i13 >= c33903b.f50y) {
                return;
            }
            C37329g c37329g = (C37329g) c33903b.m38g(i13);
            Object objM42k = this.f159595b.m42k(i13);
            InterfaceC37328f interfaceC37328f = c37329g.f159592b;
            if (c37329g.f159594d == null) {
                c37329g.f159594d = c37329g.f159593c.getBytes(InterfaceC37327e.f159589a);
            }
            interfaceC37328f.mo2343a(c37329g.f159594d, objM42k, messageDigest);
            i13++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object m119569c(C37329g c37329g) {
        C33903b c33903b = this.f159595b;
        return c33903b.containsKey(c37329g) ? c33903b.get(c37329g) : c37329g.f159591a;
    }

    @Override // p586wk.InterfaceC37327e
    public final boolean equals(Object obj) {
        if (obj instanceof C37330h) {
            return this.f159595b.equals(((C37330h) obj).f159595b);
        }
        return false;
    }

    @Override // p586wk.InterfaceC37327e
    public final int hashCode() {
        return this.f159595b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f159595b + '}';
    }
}
