package p499t9;

import p000.AbstractC11266d;

/* JADX INFO: renamed from: t9.f0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C33629f0 {

    /* JADX INFO: renamed from: c */
    public static final C33629f0 f140370c = new C33629f0(0, 0);

    /* JADX INFO: renamed from: a */
    public final long f140371a;

    /* JADX INFO: renamed from: b */
    public final long f140372b;

    public C33629f0(long j7, long j13) {
        this.f140371a = j7;
        this.f140372b = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C33629f0.class == obj.getClass()) {
            C33629f0 c33629f0 = (C33629f0) obj;
            if (this.f140371a == c33629f0.f140371a && this.f140372b == c33629f0.f140372b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f140371a) * 31) + ((int) this.f140372b);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("[timeUs=");
        sb4.append(this.f140371a);
        sb4.append(", position=");
        return AbstractC11266d.m30457k(this.f140372b, "]", sb4);
    }
}
