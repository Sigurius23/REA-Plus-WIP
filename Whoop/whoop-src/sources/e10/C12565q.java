package e10;

import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: e10.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C12565q implements InterfaceC12573u {

    /* JADX INFO: renamed from: a */
    public final int f42909a;

    public C12565q(int i13) {
        this.f42909a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12565q) && this.f42909a == ((C12565q) obj).f42909a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42909a);
    }

    public final String toString() {
        return AbstractC2875y.m8296i(this.f42909a, "GooglePay(errorCode=", ")");
    }
}
