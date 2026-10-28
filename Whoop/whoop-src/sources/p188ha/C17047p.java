package p188ha;

import java.util.Objects;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: ha.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C17047p extends AbstractC17041j {

    /* JADX INFO: renamed from: b */
    public final String f65542b;

    /* JADX INFO: renamed from: c */
    public final String f65543c;

    public C17047p(String str, String str2, String str3) {
        super(str);
        this.f65542b = str2;
        this.f65543c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17047p.class == obj.getClass()) {
            C17047p c17047p = (C17047p) obj;
            if (this.f65528a.equals(c17047p.f65528a) && Objects.equals(this.f65542b, c17047p.f65542b) && Objects.equals(this.f65543c, c17047p.f65543c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(527, 31, this.f65528a);
        String str = this.f65542b;
        int iHashCode = (iM30450d + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f65543c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // p188ha.AbstractC17041j
    public final String toString() {
        return this.f65528a + ": url=" + this.f65543c;
    }
}
