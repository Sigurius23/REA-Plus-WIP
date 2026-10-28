package aa3;

/* JADX INFO: renamed from: aa3.g0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0620g0 extends AbstractC0614e0 {

    /* JADX INFO: renamed from: a */
    public final short f2182a;

    public C0620g0(short s13) {
        this.f2182a = s13;
    }

    @Override // aa3.AbstractC0614e0
    /* JADX INFO: renamed from: a */
    public final Object mo1614a() {
        return Short.valueOf(this.f2182a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0620g0) && this.f2182a == ((C0620g0) obj).f2182a;
    }

    public final int hashCode() {
        return Short.hashCode(this.f2182a);
    }
}
