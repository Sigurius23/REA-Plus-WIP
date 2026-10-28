package p341nh;

import p098dt.AbstractC12350b;

/* JADX INFO: renamed from: nh.a */
/* JADX INFO: loaded from: classes.dex */
public final class C26707a extends AbstractC12350b {

    /* JADX INFO: renamed from: a */
    public final int f106205a;

    public C26707a(int i13) {
        this.f106205a = i13;
        if (i13 <= 0) {
            throw new IllegalArgumentException("px must be > 0.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C26707a) {
            return this.f106205a == ((C26707a) obj).f106205a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f106205a;
    }

    public final String toString() {
        return String.valueOf(this.f106205a);
    }
}
