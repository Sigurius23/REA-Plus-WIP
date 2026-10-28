package d40;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: d40.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C11664i {

    /* JADX INFO: renamed from: a */
    public final long f37651a;

    /* JADX INFO: renamed from: b */
    public final long f37652b;

    /* JADX INFO: renamed from: c */
    public final long f37653c;

    /* JADX INFO: renamed from: d */
    public final long f37654d;

    /* JADX INFO: renamed from: e */
    public final long f37655e;

    public C11664i(long j7, long j13, long j14, long j15, long j16) {
        this.f37651a = j7;
        this.f37652b = j13;
        this.f37653c = j14;
        this.f37654d = j15;
        this.f37655e = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11664i)) {
            return false;
        }
        C11664i c11664i = (C11664i) obj;
        return C17919x.m51542d(this.f37651a, c11664i.f37651a) && C17919x.m51542d(this.f37652b, c11664i.f37652b) && C17919x.m51542d(this.f37653c, c11664i.f37653c) && C17919x.m51542d(this.f37654d, c11664i.f37654d) && C17919x.m51542d(this.f37655e, c11664i.f37655e);
    }

    public final int hashCode() {
        int i13 = C17919x.f69638o;
        return Long.hashCode(this.f37655e) + AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(Long.hashCode(this.f37651a) * 31, this.f37652b, 31), this.f37653c, 31), this.f37654d, 31);
    }

    public final String toString() {
        String strM51548j = C17919x.m51548j(this.f37651a);
        String strM51548j2 = C17919x.m51548j(this.f37652b);
        String strM51548j3 = C17919x.m51548j(this.f37653c);
        String strM51548j4 = C17919x.m51548j(this.f37654d);
        String strM51548j5 = C17919x.m51548j(this.f37655e);
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PrimaryButtonColors(background=", strM51548j, ", onBackground=", strM51548j2, ", border=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j3, ", successBackground=", strM51548j4, ", onSuccessBackground=");
        return AbstractC25012a.m73376i(strM51548j5, ")", sbM32001t);
    }
}
