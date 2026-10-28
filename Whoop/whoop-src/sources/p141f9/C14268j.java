package p141f9;

import p000.AbstractC11266d;
import p607x8.AbstractC38046a;

/* JADX INFO: renamed from: f9.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C14268j {

    /* JADX INFO: renamed from: a */
    public final long f52103a;

    /* JADX INFO: renamed from: b */
    public final long f52104b;

    /* JADX INFO: renamed from: c */
    public final String f52105c;

    /* JADX INFO: renamed from: d */
    public int f52106d;

    public C14268j(String str, long j7, long j13) {
        this.f52105c = str == null ? "" : str;
        this.f52103a = j7;
        this.f52104b = j13;
    }

    /* JADX INFO: renamed from: a */
    public final C14268j m40751a(C14268j c14268j, String str) {
        C14268j c14268j2;
        String strM121823r = AbstractC38046a.m121823r(str, this.f52105c);
        if (c14268j != null) {
            long j7 = c14268j.f52104b;
            if (strM121823r.equals(AbstractC38046a.m121823r(str, c14268j.f52105c))) {
                long j13 = this.f52104b;
                if (j13 != -1) {
                    long j14 = this.f52103a;
                    c14268j2 = null;
                    if (j14 + j13 == c14268j.f52103a) {
                        return new C14268j(strM121823r, j14, j7 != -1 ? j13 + j7 : -1L);
                    }
                } else {
                    c14268j2 = null;
                }
                if (j7 == -1) {
                    return c14268j2;
                }
                long j15 = c14268j.f52103a;
                if (j15 + j7 == this.f52103a) {
                    return new C14268j(strM121823r, j15, j13 != -1 ? j7 + j13 : -1L);
                }
                return c14268j2;
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14268j.class == obj.getClass()) {
            C14268j c14268j = (C14268j) obj;
            if (this.f52103a == c14268j.f52103a && this.f52104b == c14268j.f52104b && this.f52105c.equals(c14268j.f52105c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f52106d == 0) {
            this.f52106d = this.f52105c.hashCode() + ((((527 + ((int) this.f52103a)) * 31) + ((int) this.f52104b)) * 31);
        }
        return this.f52106d;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("RangedUri(referenceUri=");
        sb4.append(this.f52105c);
        sb4.append(", start=");
        sb4.append(this.f52103a);
        sb4.append(", length=");
        return AbstractC11266d.m30457k(this.f52104b, ")", sb4);
    }
}
