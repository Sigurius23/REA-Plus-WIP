package aa3;

/* JADX INFO: renamed from: aa3.c0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0608c0 extends AbstractC0614e0 {

    /* JADX INFO: renamed from: a */
    public final int f2160a;

    public C0608c0(int i13) {
        this.f2160a = i13;
    }

    @Override // aa3.AbstractC0614e0
    /* JADX INFO: renamed from: a */
    public final Object mo1614a() {
        return Integer.valueOf(this.f2160a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0608c0) && this.f2160a == ((C0608c0) obj).f2160a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2160a);
    }
}
