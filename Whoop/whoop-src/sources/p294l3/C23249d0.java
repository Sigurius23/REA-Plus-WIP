package p294l3;

import p000.AbstractC11266d;
import p448r3.AbstractC30895a;
import p636y3.C39183o;
import p636y3.C39184p;

/* JADX INFO: renamed from: l3.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23249d0 {

    /* JADX INFO: renamed from: a */
    public final long f92122a;

    /* JADX INFO: renamed from: b */
    public final long f92123b;

    /* JADX INFO: renamed from: c */
    public final int f92124c;

    public C23249d0(long j7, long j13, int i13) {
        this.f92122a = j7;
        this.f92123b = j13;
        this.f92124c = i13;
        C39184p[] c39184pArr = C39183o.f168427b;
        if ((j7 & 1095216660480L) == 0) {
            AbstractC30895a.m95015a("width cannot be TextUnit.Unspecified");
        }
        if ((j13 & 1095216660480L) == 0) {
            AbstractC30895a.m95015a("height cannot be TextUnit.Unspecified");
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m67310a() {
        return this.f92123b;
    }

    /* JADX INFO: renamed from: b */
    public final int m67311b() {
        return this.f92124c;
    }

    /* JADX INFO: renamed from: c */
    public final long m67312c() {
        return this.f92122a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23249d0)) {
            return false;
        }
        C23249d0 c23249d0 = (C23249d0) obj;
        return C39183o.m124803a(this.f92122a, c23249d0.f92122a) && C39183o.m124803a(this.f92123b, c23249d0.f92123b) && this.f92124c == c23249d0.f92124c;
    }

    public final int hashCode() {
        C39184p[] c39184pArr = C39183o.f168427b;
        return Integer.hashCode(this.f92124c) + AbstractC11266d.m30451e(Long.hashCode(this.f92122a) * 31, this.f92123b, 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb4 = new StringBuilder("Placeholder(width=");
        sb4.append((Object) C39183o.m124807e(this.f92122a));
        sb4.append(", height=");
        sb4.append((Object) C39183o.m124807e(this.f92123b));
        sb4.append(", placeholderVerticalAlign=");
        int i13 = this.f92124c;
        if (i13 == 1) {
            str = "AboveBaseline";
        } else if (i13 == 2) {
            str = "Top";
        } else if (i13 == 3) {
            str = "Bottom";
        } else if (i13 == 4) {
            str = "Center";
        } else if (i13 == 5) {
            str = "TextTop";
        } else if (i13 == 6) {
            str = "TextBottom";
        } else {
            str = i13 == 7 ? "TextCenter" : "Invalid";
        }
        sb4.append((Object) str);
        sb4.append(')');
        return sb4.toString();
    }
}
