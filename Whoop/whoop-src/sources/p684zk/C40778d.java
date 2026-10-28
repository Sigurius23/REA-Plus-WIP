package p684zk;

import java.security.MessageDigest;
import p586wk.InterfaceC37327e;

/* JADX INFO: renamed from: zk.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C40778d implements InterfaceC37327e {

    /* JADX INFO: renamed from: b */
    public final InterfaceC37327e f175829b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC37327e f175830c;

    public C40778d(InterfaceC37327e interfaceC37327e, InterfaceC37327e interfaceC37327e2) {
        this.f175829b = interfaceC37327e;
        this.f175830c = interfaceC37327e2;
    }

    @Override // p586wk.InterfaceC37327e
    /* JADX INFO: renamed from: a */
    public final void mo33605a(MessageDigest messageDigest) {
        this.f175829b.mo33605a(messageDigest);
        this.f175830c.mo33605a(messageDigest);
    }

    @Override // p586wk.InterfaceC37327e
    public final boolean equals(Object obj) {
        if (obj instanceof C40778d) {
            C40778d c40778d = (C40778d) obj;
            if (this.f175829b.equals(c40778d.f175829b) && this.f175830c.equals(c40778d.f175830c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p586wk.InterfaceC37327e
    public final int hashCode() {
        return this.f175830c.hashCode() + (this.f175829b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f175829b + ", signature=" + this.f175830c + '}';
    }
}
