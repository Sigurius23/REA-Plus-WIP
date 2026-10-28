package hm;

import p000.AbstractC11266d;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: hm.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C17414a {

    /* JADX INFO: renamed from: a */
    public final int f67499a;

    /* JADX INFO: renamed from: b */
    public final long f67500b;

    public C17414a(int i13, long j7) {
        if (i13 == 0) {
            throw new NullPointerException("Null status");
        }
        this.f67499a = i13;
        this.f67500b = j7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17414a)) {
            return false;
        }
        C17414a c17414a = (C17414a) obj;
        return AbstractC12682p.m35483c(this.f67499a, c17414a.f67499a) && this.f67500b == c17414a.f67500b;
    }

    public final int hashCode() {
        int iM35485e = (AbstractC12682p.m35485e(this.f67499a) ^ 1000003) * 1000003;
        long j7 = this.f67500b;
        return iM35485e ^ ((int) ((j7 >>> 32) ^ j7));
    }

    public final String toString() {
        String str;
        StringBuilder sb4 = new StringBuilder("BackendResponse{status=");
        int i13 = this.f67499a;
        if (i13 == 1) {
            str = "OK";
        } else if (i13 == 2) {
            str = "TRANSIENT_ERROR";
        } else if (i13 != 3) {
            str = i13 != 4 ? "null" : "INVALID_PAYLOAD";
        } else {
            str = "FATAL_ERROR";
        }
        sb4.append(str);
        sb4.append(", nextRequestWaitMillis=");
        return AbstractC11266d.m30457k(this.f67500b, "}", sb4);
    }
}
