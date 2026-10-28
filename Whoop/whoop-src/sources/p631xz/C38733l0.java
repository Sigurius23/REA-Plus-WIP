package p631xz;

import d00.C11433l;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xz.l0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38733l0 implements InterfaceC38735m0 {

    /* JADX INFO: renamed from: a */
    public final C11433l f166696a;

    public C38733l0(C11433l account) {
        AbstractC22676k.m65750j(account, "account");
        this.f166696a = account;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38733l0) && AbstractC22676k.m65745e(this.f166696a, ((C38733l0) obj).f166696a);
    }

    public final int hashCode() {
        return this.f166696a.hashCode();
    }

    public final String toString() {
        return "Success(account=" + this.f166696a + ")";
    }
}
