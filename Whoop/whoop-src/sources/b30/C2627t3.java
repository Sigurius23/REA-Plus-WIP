package b30;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: b30.t3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2627t3 {

    /* JADX INFO: renamed from: a */
    public final long f10223a;

    /* JADX INFO: renamed from: b */
    public final long f10224b;

    /* JADX INFO: renamed from: c */
    public final long f10225c;

    /* JADX INFO: renamed from: d */
    public final long f10226d;

    /* JADX INFO: renamed from: e */
    public final long f10227e;

    public C2627t3(long j7, long j13, long j14, long j15, long j16) {
        this.f10223a = j7;
        this.f10224b = j13;
        this.f10225c = j14;
        this.f10226d = j15;
        this.f10227e = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2627t3)) {
            return false;
        }
        C2627t3 c2627t3 = (C2627t3) obj;
        return C17919x.m51542d(this.f10223a, c2627t3.f10223a) && C17919x.m51542d(this.f10224b, c2627t3.f10224b) && C17919x.m51542d(this.f10225c, c2627t3.f10225c) && C17919x.m51542d(this.f10226d, c2627t3.f10226d) && C17919x.m51542d(this.f10227e, c2627t3.f10227e);
    }

    public final int hashCode() {
        int i13 = C17919x.f69638o;
        return Long.hashCode(this.f10227e) + AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(Long.hashCode(this.f10223a) * 31, this.f10224b, 31), this.f10225c, 31), this.f10226d, 31);
    }

    public final String toString() {
        String strM51548j = C17919x.m51548j(this.f10223a);
        String strM51548j2 = C17919x.m51548j(this.f10224b);
        String strM51548j3 = C17919x.m51548j(this.f10225c);
        String strM51548j4 = C17919x.m51548j(this.f10226d);
        String strM51548j5 = C17919x.m51548j(this.f10227e);
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PrimaryButtonColors(background=", strM51548j, ", onBackground=", strM51548j2, ", successBackground=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j3, ", onSuccessBackground=", strM51548j4, ", border=");
        return AbstractC25012a.m73376i(strM51548j5, ")", sbM32001t);
    }
}
