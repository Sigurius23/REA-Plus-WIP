package k20;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: k20.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C22141f extends AbstractC22143h {

    /* JADX INFO: renamed from: w */
    public final int f85888w;

    /* JADX INFO: renamed from: x */
    public final String f85889x;

    public C22141f(int i13) {
        this.f85888w = i13;
        this.f85889x = String.valueOf(i13);
    }

    @Override // k20.AbstractC22143h
    /* JADX INFO: renamed from: a */
    public final String mo63404a() {
        return AbstractC11266d.m30461o("googlePay_", this.f85889x);
    }

    @Override // k20.AbstractC22143h
    /* JADX INFO: renamed from: b */
    public final String mo63405b() {
        return this.f85889x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C22141f) && this.f85888w == ((C22141f) obj).f85888w;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f85888w);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return AbstractC2875y.m8296i(this.f85888w, "GooglePay(errorCodeInt=", ")");
    }
}
