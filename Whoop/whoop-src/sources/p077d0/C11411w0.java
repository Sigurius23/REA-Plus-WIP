package p077d0;

import ai.C0902h;

/* JADX INFO: renamed from: d0.w0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11411w0 implements InterfaceC11337c0 {

    /* JADX INFO: renamed from: a */
    public final C11347e2 f36603a;

    /* JADX INFO: renamed from: b */
    public final EnumC11408v0 f36604b;

    /* JADX INFO: renamed from: c */
    public final long f36605c;

    public C11411w0(C11347e2 c11347e2, EnumC11408v0 enumC11408v0, long j7) {
        this.f36603a = c11347e2;
        this.f36604b = enumC11408v0;
        this.f36605c = j7;
    }

    @Override // p077d0.InterfaceC11372l
    /* JADX INFO: renamed from: a */
    public final InterfaceC11355g2 mo30534a(C11351f2 c11351f2) {
        return new C0902h(this.f36603a.mo30534a(c11351f2), this.f36604b, this.f36605c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11411w0) {
            C11411w0 c11411w0 = (C11411w0) obj;
            if (c11411w0.f36603a.equals(this.f36603a) && c11411w0.f36604b == this.f36604b && c11411w0.f36605c == this.f36605c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f36605c) + ((this.f36604b.hashCode() + ((this.f36603a.hashCode() + 217) * 31)) * 31);
    }
}
