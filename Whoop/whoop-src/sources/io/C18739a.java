package io;

/* JADX INFO: renamed from: io.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C18739a {

    /* JADX INFO: renamed from: a */
    public final long f73612a;

    /* JADX INFO: renamed from: b */
    public final long f73613b;

    public C18739a(long j7, long j13) {
        this.f73612a = j7;
        this.f73613b = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18739a)) {
            return false;
        }
        C18739a c18739a = (C18739a) obj;
        return this.f73612a == c18739a.f73612a && this.f73613b == c18739a.f73613b;
    }

    public final int hashCode() {
        return (((int) this.f73612a) * 31) + ((int) this.f73613b);
    }
}
