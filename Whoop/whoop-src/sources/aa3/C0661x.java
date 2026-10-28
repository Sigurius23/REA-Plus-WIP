package aa3;

/* JADX INFO: renamed from: aa3.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C0661x extends AbstractC0614e0 {

    /* JADX INFO: renamed from: a */
    public final byte f2294a;

    public C0661x(byte b) {
        this.f2294a = b;
    }

    @Override // aa3.AbstractC0614e0
    /* JADX INFO: renamed from: a */
    public final Object mo1614a() {
        return Byte.valueOf(this.f2294a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0661x) && this.f2294a == ((C0661x) obj).f2294a;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f2294a);
    }
}
