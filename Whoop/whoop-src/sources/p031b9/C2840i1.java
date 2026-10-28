package p031b9;

/* JADX INFO: renamed from: b9.i1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2840i1 {

    /* JADX INFO: renamed from: c */
    public static final C2840i1 f11218c = new C2840i1(0, false);

    /* JADX INFO: renamed from: a */
    public final int f11219a;

    /* JADX INFO: renamed from: b */
    public final boolean f11220b;

    public C2840i1(int i13, boolean z4) {
        this.f11219a = i13;
        this.f11220b = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2840i1.class != obj.getClass()) {
            return false;
        }
        C2840i1 c2840i1 = (C2840i1) obj;
        return this.f11219a == c2840i1.f11219a && this.f11220b == c2840i1.f11220b;
    }

    public final int hashCode() {
        return (this.f11219a << 1) + (this.f11220b ? 1 : 0);
    }
}
