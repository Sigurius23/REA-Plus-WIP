package aa3;

/* JADX INFO: renamed from: aa3.b0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0605b0 extends AbstractC0614e0 {

    /* JADX INFO: renamed from: a */
    public final float f2151a;

    public C0605b0(float f13) {
        this.f2151a = f13;
    }

    @Override // aa3.AbstractC0614e0
    /* JADX INFO: renamed from: a */
    public final Object mo1614a() {
        return Float.valueOf(this.f2151a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0605b0) && Float.compare(this.f2151a, ((C0605b0) obj).f2151a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2151a);
    }
}
