package p561vt;

import ae3.C0803k;
import p108e4.AbstractC12682p;
import p555vl.AbstractC36095b;

/* JADX INFO: renamed from: vt.b */
/* JADX INFO: loaded from: classes.dex */
public final class C36481b {

    /* JADX INFO: renamed from: a */
    public final String f155818a;

    /* JADX INFO: renamed from: b */
    public final long f155819b;

    /* JADX INFO: renamed from: c */
    public final int f155820c;

    public C36481b(int i13, String str, long j7) {
        this.f155818a = str;
        this.f155819b = j7;
        this.f155820c = i13;
    }

    /* JADX INFO: renamed from: a */
    public static C0803k m116904a() {
        C0803k c0803k = new C0803k(5);
        c0803k.f2965c = 0L;
        return c0803k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C36481b)) {
            return false;
        }
        C36481b c36481b = (C36481b) obj;
        int i13 = c36481b.f155820c;
        String str = c36481b.f155818a;
        String str2 = this.f155818a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f155819b != c36481b.f155819b) {
            return false;
        }
        int i14 = this.f155820c;
        if (i14 == 0) {
            return i13 == 0;
        }
        return AbstractC12682p.m35483c(i14, i13);
    }

    public final int hashCode() {
        String str = this.f155818a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j7 = this.f155819b;
        int i13 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003;
        int i14 = this.f155820c;
        return (i14 != 0 ? AbstractC12682p.m35485e(i14) : 0) ^ i13;
    }

    public final String toString() {
        return "TokenResult{token=" + this.f155818a + ", tokenExpirationTimestamp=" + this.f155819b + ", responseCode=" + AbstractC36095b.m114671A(this.f155820c) + "}";
    }
}
