package p077d0;

/* JADX INFO: renamed from: d0.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11361i0 implements InterfaceC11372l {

    /* JADX INFO: renamed from: a */
    public final InterfaceC11416y f36417a;

    /* JADX INFO: renamed from: b */
    public final EnumC11408v0 f36418b;

    /* JADX INFO: renamed from: c */
    public final long f36419c;

    public C11361i0(InterfaceC11416y interfaceC11416y, EnumC11408v0 enumC11408v0, long j7) {
        this.f36417a = interfaceC11416y;
        this.f36418b = enumC11408v0;
        this.f36419c = j7;
    }

    @Override // p077d0.InterfaceC11372l
    /* JADX INFO: renamed from: a */
    public final InterfaceC11355g2 mo30534a(C11351f2 c11351f2) {
        return new C11375l2(this.f36417a.mo30534a(c11351f2), this.f36418b, this.f36419c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11361i0) {
            C11361i0 c11361i0 = (C11361i0) obj;
            if (c11361i0.f36417a.equals(this.f36417a) && c11361i0.f36418b == this.f36418b && c11361i0.f36419c == this.f36419c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f36419c) + ((this.f36418b.hashCode() + (this.f36417a.hashCode() * 31)) * 31);
    }
}
