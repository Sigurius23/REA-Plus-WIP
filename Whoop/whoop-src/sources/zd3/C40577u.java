package zd3;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zd3.u */
/* JADX INFO: loaded from: classes5.dex */
public final class C40577u {

    /* JADX INFO: renamed from: a */
    public final InterfaceC40578v f174765a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC40578v f174766b;

    /* JADX INFO: renamed from: c */
    public final Throwable f174767c;

    public /* synthetic */ C40577u(InterfaceC40578v interfaceC40578v, C40559c c40559c, Throwable th3, int i13) {
        this(interfaceC40578v, (i13 & 2) != 0 ? null : c40559c, (i13 & 4) != 0 ? null : th3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40577u)) {
            return false;
        }
        C40577u c40577u = (C40577u) obj;
        return AbstractC22676k.m65745e(this.f174765a, c40577u.f174765a) && AbstractC22676k.m65745e(this.f174766b, c40577u.f174766b) && AbstractC22676k.m65745e(this.f174767c, c40577u.f174767c);
    }

    public final int hashCode() {
        int iHashCode = this.f174765a.hashCode() * 31;
        InterfaceC40578v interfaceC40578v = this.f174766b;
        int iHashCode2 = (iHashCode + (interfaceC40578v == null ? 0 : interfaceC40578v.hashCode())) * 31;
        Throwable th3 = this.f174767c;
        return iHashCode2 + (th3 != null ? th3.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.f174765a + ", nextPlan=" + this.f174766b + ", throwable=" + this.f174767c + ')';
    }

    public C40577u(InterfaceC40578v interfaceC40578v, InterfaceC40578v interfaceC40578v2, Throwable th3) {
        this.f174765a = interfaceC40578v;
        this.f174766b = interfaceC40578v2;
        this.f174767c = th3;
    }
}
