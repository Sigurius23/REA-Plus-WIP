package p599wz;

import d00.C11433l;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wz.q1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37749q1 implements InterfaceC37752r1 {

    /* JADX INFO: renamed from: a */
    public final C11433l f161712a;

    public C37749q1(C11433l linkAccount) {
        AbstractC22676k.m65750j(linkAccount, "linkAccount");
        this.f161712a = linkAccount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37749q1) && AbstractC22676k.m65745e(this.f161712a, ((C37749q1) obj).f161712a);
    }

    public final int hashCode() {
        return this.f161712a.hashCode();
    }

    public final String toString() {
        return "VerificationDialog(linkAccount=" + this.f161712a + ")";
    }
}
