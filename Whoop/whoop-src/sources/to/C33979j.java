package to;

/* JADX INFO: renamed from: to.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C33979j {

    /* JADX INFO: renamed from: a */
    public final Object f142447a;

    /* JADX INFO: renamed from: b */
    public final String f142448b;

    public C33979j(Object obj, String str) {
        this.f142447a = obj;
        this.f142448b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33979j)) {
            return false;
        }
        C33979j c33979j = (C33979j) obj;
        return this.f142447a == c33979j.f142447a && this.f142448b.equals(c33979j.f142448b);
    }

    public final int hashCode() {
        return this.f142448b.hashCode() + (System.identityHashCode(this.f142447a) * 31);
    }
}
