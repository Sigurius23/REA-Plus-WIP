package sl;

import d13.AbstractC11478a;
import java.security.MessageDigest;
import p586wk.InterfaceC37327e;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: sl.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C32578d implements InterfaceC37327e {

    /* JADX INFO: renamed from: b */
    public final Object f134968b;

    public C32578d(Object obj) {
        AbstractC29125c.m88539p(obj, "Argument must not be null");
        this.f134968b = obj;
    }

    @Override // p586wk.InterfaceC37327e
    /* JADX INFO: renamed from: a */
    public final void mo33605a(MessageDigest messageDigest) {
        messageDigest.update(this.f134968b.toString().getBytes(InterfaceC37327e.f159589a));
    }

    @Override // p586wk.InterfaceC37327e
    public final boolean equals(Object obj) {
        if (obj instanceof C32578d) {
            return this.f134968b.equals(((C32578d) obj).f134968b);
        }
        return false;
    }

    @Override // p586wk.InterfaceC37327e
    public final int hashCode() {
        return this.f134968b.hashCode();
    }

    public final String toString() {
        return AbstractC11478a.m30860l(new StringBuilder("ObjectKey{object="), this.f134968b, '}');
    }
}
