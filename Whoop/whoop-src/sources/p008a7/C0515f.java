package p008a7;

import p208i2.C17919x;

/* JADX INFO: renamed from: a7.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C0515f {

    /* JADX INFO: renamed from: a */
    public final long f1723a;

    public C0515f(long j7) {
        this.f1723a = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0515f) && C17919x.m51542d(this.f1723a, ((C0515f) obj).f1723a);
    }

    public final int hashCode() {
        int i13 = C17919x.f69638o;
        return Long.hashCode(this.f1723a);
    }

    public final String toString() {
        return "FixedColorProvider(color=" + ((Object) C17919x.m51548j(this.f1723a)) + ')';
    }
}
