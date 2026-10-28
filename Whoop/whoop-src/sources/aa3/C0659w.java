package aa3;

/* JADX INFO: renamed from: aa3.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C0659w extends AbstractC0614e0 {

    /* JADX INFO: renamed from: a */
    public final boolean f2289a;

    public C0659w(boolean z4) {
        this.f2289a = z4;
    }

    @Override // aa3.AbstractC0614e0
    /* JADX INFO: renamed from: a */
    public final Object mo1614a() {
        return Boolean.valueOf(this.f2289a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0659w) && this.f2289a == ((C0659w) obj).f2289a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2289a);
    }
}
