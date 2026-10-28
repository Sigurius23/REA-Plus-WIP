package t23;

import q63.AbstractC30007c;

/* JADX INFO: renamed from: t23.f0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33385f0 implements InterfaceC33400i0 {

    /* JADX INFO: renamed from: a */
    public final int f139375a;

    /* JADX INFO: renamed from: b */
    public final String f139376b;

    public C33385f0(int i13, String str) {
        this.f139375a = i13;
        this.f139376b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33385f0)) {
            return false;
        }
        C33385f0 c33385f0 = (C33385f0) obj;
        return this.f139375a == c33385f0.f139375a && this.f139376b.equals(c33385f0.f139376b);
    }

    @Override // t23.InterfaceC33400i0
    public final String getMessage() {
        return this.f139376b;
    }

    public final int hashCode() {
        return this.f139376b.hashCode() + (((Integer.hashCode(this.f139375a) * 31) - 1136901261) * 31);
    }

    public final String toString() {
        return AbstractC30007c.m91838h(this.f139375a, "RetryExhausted(retryCount=", ", failureCode=reconnect-failed, message=", this.f139376b, ")");
    }
}
