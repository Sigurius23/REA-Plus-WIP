package p077d0;

/* JADX INFO: renamed from: d0.g1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11354g1 implements InterfaceC11416y {

    /* JADX INFO: renamed from: a */
    public final int f36403a;

    public C11354g1(int i13) {
        this.f36403a = i13;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C11354g1) && ((C11354g1) obj).f36403a == this.f36403a;
    }

    public final int hashCode() {
        return this.f36403a;
    }

    @Override // p077d0.InterfaceC11372l
    /* JADX INFO: renamed from: a */
    public final InterfaceC11363i2 mo30534a(C11351f2 c11351f2) {
        return new C11387o2(this.f36403a, 0);
    }
}
