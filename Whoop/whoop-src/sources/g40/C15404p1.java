package g40;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: g40.p1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15404p1 {

    /* JADX INFO: renamed from: a */
    public final long f57862a;

    /* JADX INFO: renamed from: b */
    public final long f57863b;

    /* JADX INFO: renamed from: c */
    public final long f57864c;

    /* JADX INFO: renamed from: d */
    public final long f57865d;

    /* JADX INFO: renamed from: e */
    public final long f57866e;

    public C15404p1(long j7, long j13, long j14, long j15, long j16) {
        this.f57862a = j7;
        this.f57863b = j13;
        this.f57864c = j14;
        this.f57865d = j15;
        this.f57866e = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15404p1)) {
            return false;
        }
        C15404p1 c15404p1 = (C15404p1) obj;
        return C17919x.m51542d(this.f57862a, c15404p1.f57862a) && C17919x.m51542d(this.f57863b, c15404p1.f57863b) && C17919x.m51542d(this.f57864c, c15404p1.f57864c) && C17919x.m51542d(this.f57865d, c15404p1.f57865d) && C17919x.m51542d(this.f57866e, c15404p1.f57866e);
    }

    public final int hashCode() {
        int i13 = C17919x.f69638o;
        return Long.hashCode(this.f57866e) + AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(Long.hashCode(this.f57862a) * 31, this.f57863b, 31), this.f57864c, 31), this.f57865d, 31);
    }

    public final String toString() {
        String strM51548j = C17919x.m51548j(this.f57862a);
        String strM51548j2 = C17919x.m51548j(this.f57863b);
        String strM51548j3 = C17919x.m51548j(this.f57864c);
        String strM51548j4 = C17919x.m51548j(this.f57865d);
        String strM51548j5 = C17919x.m51548j(this.f57866e);
        StringBuilder sbM32001t = AbstractC11895b.m32001t("OTPElementColors(selectedBorder=", strM51548j, ", placeholder=", strM51548j2, ", background=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j3, ", selectedBackground=", strM51548j4, ", unselectedBorder=");
        return AbstractC25012a.m73376i(strM51548j5, ")", sbM32001t);
    }
}
