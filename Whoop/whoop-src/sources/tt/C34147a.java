package tt;

import p000.AbstractC11266d;

/* JADX INFO: renamed from: tt.a */
/* JADX INFO: loaded from: classes.dex */
public final class C34147a {

    /* JADX INFO: renamed from: a */
    public final String f143132a;

    /* JADX INFO: renamed from: b */
    public final long f143133b;

    /* JADX INFO: renamed from: c */
    public final long f143134c;

    public C34147a(String str, long j7, long j13) {
        this.f143132a = str;
        this.f143133b = j7;
        this.f143134c = j13;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C34147a) {
            C34147a c34147a = (C34147a) obj;
            if (this.f143132a.equals(c34147a.f143132a) && this.f143133b == c34147a.f143133b && this.f143134c == c34147a.f143134c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f143132a.hashCode() ^ 1000003) * 1000003;
        long j7 = this.f143133b;
        long j13 = this.f143134c;
        return ((iHashCode ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ ((int) (j13 ^ (j13 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("InstallationTokenResult{token=");
        sb4.append(this.f143132a);
        sb4.append(", tokenExpirationTimestamp=");
        sb4.append(this.f143133b);
        sb4.append(", tokenCreationTimestamp=");
        return AbstractC11266d.m30457k(this.f143134c, "}", sb4);
    }
}
