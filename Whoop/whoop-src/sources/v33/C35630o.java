package v33;

import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: v33.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C35630o {

    /* JADX INFO: renamed from: a */
    public final int f151428a;

    /* JADX INFO: renamed from: b */
    public final int f151429b;

    public C35630o(int i13, int i14) {
        this.f151428a = i13;
        this.f151429b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35630o)) {
            return false;
        }
        C35630o c35630o = (C35630o) obj;
        return this.f151428a == c35630o.f151428a && this.f151429b == c35630o.f151429b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f151429b) + (Integer.hashCode(this.f151428a) * 31);
    }

    public final String toString() {
        return AbstractC25012a.m73372e(this.f151428a, this.f151429b, "ParticipantCount(total=", ", anonymous=", ")");
    }
}
