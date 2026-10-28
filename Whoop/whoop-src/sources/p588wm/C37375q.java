package p588wm;

import p000.AbstractC11266d;

/* JADX INFO: renamed from: wm.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C37375q {

    /* JADX INFO: renamed from: c */
    public static final C37375q f159869c = new C37375q(0, 0);

    /* JADX INFO: renamed from: a */
    public final long f159870a;

    /* JADX INFO: renamed from: b */
    public final long f159871b;

    public C37375q(long j7, long j13) {
        this.f159870a = j7;
        this.f159871b = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C37375q.class == obj.getClass()) {
            C37375q c37375q = (C37375q) obj;
            if (this.f159870a == c37375q.f159870a && this.f159871b == c37375q.f159871b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f159870a) * 31) + ((int) this.f159871b);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder(60);
        sb4.append("[timeUs=");
        sb4.append(this.f159870a);
        sb4.append(", position=");
        return AbstractC11266d.m30457k(this.f159871b, "]", sb4);
    }
}
