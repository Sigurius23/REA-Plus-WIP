package x23;

import p715kotlin.jvm.internal.AbstractC22676k;
import s93.AbstractC32309k;

/* JADX INFO: renamed from: x23.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C37865a {

    /* JADX INFO: renamed from: a */
    public final int f162177a;

    /* JADX INFO: renamed from: b */
    public final AbstractC32309k f162178b;

    public C37865a(int i13, AbstractC32309k abstractC32309k) {
        this.f162177a = i13;
        this.f162178b = abstractC32309k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37865a)) {
            return false;
        }
        C37865a c37865a = (C37865a) obj;
        return this.f162177a == c37865a.f162177a && AbstractC22676k.m65745e(this.f162178b, c37865a.f162178b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f162177a) * 31;
        AbstractC32309k abstractC32309k = this.f162178b;
        return iHashCode + (abstractC32309k == null ? 0 : abstractC32309k.hashCode());
    }

    public final String toString() {
        return "JoinAnalyticsModel(retryAttempt=" + this.f162177a + ", joinReason=" + this.f162178b + ")";
    }
}
