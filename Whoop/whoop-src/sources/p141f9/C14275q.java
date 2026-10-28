package p141f9;

/* JADX INFO: renamed from: f9.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C14275q {

    /* JADX INFO: renamed from: a */
    public final long f52125a;

    /* JADX INFO: renamed from: b */
    public final long f52126b;

    public C14275q(long j7, long j13) {
        this.f52125a = j7;
        this.f52126b = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14275q.class == obj.getClass()) {
            C14275q c14275q = (C14275q) obj;
            if (this.f52125a == c14275q.f52125a && this.f52126b == c14275q.f52126b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f52125a) * 31) + ((int) this.f52126b);
    }
}
