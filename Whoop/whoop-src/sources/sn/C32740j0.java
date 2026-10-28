package sn;

/* JADX INFO: renamed from: sn.j0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C32740j0 {

    /* JADX INFO: renamed from: a */
    public final int f136118a;

    /* JADX INFO: renamed from: b */
    public final boolean f136119b;

    public C32740j0(int i13, boolean z4) {
        this.f136118a = i13;
        this.f136119b = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C32740j0.class != obj.getClass()) {
            return false;
        }
        C32740j0 c32740j0 = (C32740j0) obj;
        return this.f136118a == c32740j0.f136118a && this.f136119b == c32740j0.f136119b;
    }

    public final int hashCode() {
        return (this.f136118a * 31) + (this.f136119b ? 1 : 0);
    }
}
