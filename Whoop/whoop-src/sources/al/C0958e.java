package al;

/* JADX INFO: renamed from: al.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C0958e implements InterfaceC0962i {

    /* JADX INFO: renamed from: a */
    public final C0959f f3542a;

    /* JADX INFO: renamed from: b */
    public int f3543b;

    /* JADX INFO: renamed from: c */
    public Class f3544c;

    public C0958e(C0959f c0959f) {
        this.f3542a = c0959f;
    }

    @Override // al.InterfaceC0962i
    /* JADX INFO: renamed from: a */
    public final void mo2439a() {
        this.f3542a.m2413A0(this);
    }

    /* JADX INFO: renamed from: b */
    public final void m2440b(int i13, Class cls) {
        this.f3543b = i13;
        this.f3544c = cls;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0958e) {
            C0958e c0958e = (C0958e) obj;
            if (this.f3543b == c0958e.f3543b && this.f3544c == c0958e.f3544c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i13 = this.f3543b * 31;
        Class cls = this.f3544c;
        return i13 + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f3543b + "array=" + this.f3544c + '}';
    }
}
