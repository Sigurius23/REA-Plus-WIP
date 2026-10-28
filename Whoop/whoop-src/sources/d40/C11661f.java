package d40;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: d40.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C11661f {

    /* JADX INFO: renamed from: a */
    public final long f37641a;

    /* JADX INFO: renamed from: b */
    public final long f37642b;

    /* JADX INFO: renamed from: c */
    public final long f37643c;

    public C11661f(long j7, long j13, long j14) {
        this.f37641a = j7;
        this.f37642b = j13;
        this.f37643c = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11661f)) {
            return false;
        }
        C11661f c11661f = (C11661f) obj;
        return C17919x.m51542d(this.f37641a, c11661f.f37641a) && C17919x.m51542d(this.f37642b, c11661f.f37642b) && C17919x.m51542d(this.f37643c, c11661f.f37643c);
    }

    public final int hashCode() {
        int i13 = C17919x.f69638o;
        return Long.hashCode(this.f37643c) + AbstractC11266d.m30451e(Long.hashCode(this.f37641a) * 31, this.f37642b, 31);
    }

    public final String toString() {
        return AbstractC25012a.m73376i(C17919x.m51548j(this.f37643c), ")", AbstractC11895b.m32001t("EmbeddedRadioColors(separatorColor=", C17919x.m51548j(this.f37641a), ", selectedColor=", C17919x.m51548j(this.f37642b), ", unselectedColor="));
    }
}
