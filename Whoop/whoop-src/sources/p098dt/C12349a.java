package p098dt;

import p000.AbstractC11266d;

/* JADX INFO: renamed from: dt.a */
/* JADX INFO: loaded from: classes.dex */
public final class C12349a {

    /* JADX INFO: renamed from: a */
    public final long f41507a;

    /* JADX INFO: renamed from: b */
    public final long f41508b;

    /* JADX INFO: renamed from: c */
    public final long f41509c;

    public C12349a(long j7, long j13, long j14) {
        this.f41507a = j7;
        this.f41508b = j13;
        this.f41509c = j14;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12349a) {
            C12349a c12349a = (C12349a) obj;
            if (this.f41507a == c12349a.f41507a && this.f41508b == c12349a.f41508b && this.f41509c == c12349a.f41509c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f41507a;
        long j13 = this.f41508b;
        int i13 = (((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003;
        long j14 = this.f41509c;
        return i13 ^ ((int) ((j14 >>> 32) ^ j14));
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("StartupTime{epochMillis=");
        sb4.append(this.f41507a);
        sb4.append(", elapsedRealtime=");
        sb4.append(this.f41508b);
        sb4.append(", uptimeMillis=");
        return AbstractC11266d.m30457k(this.f41509c, "}", sb4);
    }
}
