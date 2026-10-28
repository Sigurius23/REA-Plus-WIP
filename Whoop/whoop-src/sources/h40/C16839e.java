package h40;

import p000.AbstractC11266d;
import p208i2.C17919x;
import p319m4.AbstractC25012a;
import p490t0.C33252i;

/* JADX INFO: renamed from: h40.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C16839e {

    /* JADX INFO: renamed from: a */
    public final C33252i f64709a;

    /* JADX INFO: renamed from: b */
    public final long f64710b;

    /* JADX INFO: renamed from: c */
    public final long f64711c;

    public C16839e(C33252i c33252i, long j7, long j13) {
        this.f64709a = c33252i;
        this.f64710b = j7;
        this.f64711c = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16839e)) {
            return false;
        }
        C16839e c16839e = (C16839e) obj;
        return this.f64709a.equals(c16839e.f64709a) && C17919x.m51542d(this.f64710b, c16839e.f64710b) && C17919x.m51542d(this.f64711c, c16839e.f64711c);
    }

    public final int hashCode() {
        int iHashCode = this.f64709a.hashCode() * 31;
        int i13 = C17919x.f69638o;
        return Long.hashCode(this.f64711c) + AbstractC11266d.m30451e(iHashCode, this.f64710b, 31);
    }

    public final String toString() {
        String strM51548j = C17919x.m51548j(this.f64710b);
        String strM51548j2 = C17919x.m51548j(this.f64711c);
        StringBuilder sb4 = new StringBuilder("StripeBottomSheetLayoutInfo(sheetShape=");
        sb4.append(this.f64709a);
        sb4.append(", sheetBackgroundColor=");
        sb4.append(strM51548j);
        sb4.append(", scrimColor=");
        return AbstractC25012a.m73376i(strM51548j2, ")", sb4);
    }
}
