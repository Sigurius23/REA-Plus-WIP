package t10;

import b30.InterfaceC2527g4;
import p031b9.AbstractC2875y;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: t10.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C33290j {

    /* JADX INFO: renamed from: a */
    public final InterfaceC41211c f138835a;

    /* JADX INFO: renamed from: b */
    public final boolean f138836b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2527g4 f138837c;

    /* JADX INFO: renamed from: d */
    public final boolean f138838d;

    /* JADX INFO: renamed from: e */
    public final boolean f138839e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC41211c f138840f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC41211c f138841g;

    public C33290j(InterfaceC41211c interfaceC41211c, boolean z4, InterfaceC2527g4 interfaceC2527g4, boolean z13, boolean z14, InterfaceC41211c interfaceC41211c2, InterfaceC41211c interfaceC41211c3) {
        this.f138835a = interfaceC41211c;
        this.f138836b = z4;
        this.f138837c = interfaceC2527g4;
        this.f138838d = z13;
        this.f138839e = z14;
        this.f138840f = interfaceC41211c2;
        this.f138841g = interfaceC41211c3;
    }

    /* JADX INFO: renamed from: a */
    public static C33290j m105602a(C33290j c33290j, InterfaceC41211c interfaceC41211c, boolean z4, InterfaceC2527g4 interfaceC2527g4, boolean z13, InterfaceC41211c interfaceC41211c2, InterfaceC41211c interfaceC41211c3, int i13) {
        if ((i13 & 1) != 0) {
            interfaceC41211c = c33290j.f138835a;
        }
        InterfaceC41211c interfaceC41211c4 = interfaceC41211c;
        if ((i13 & 2) != 0) {
            z4 = c33290j.f138836b;
        }
        boolean z14 = z4;
        if ((i13 & 4) != 0) {
            interfaceC2527g4 = c33290j.f138837c;
        }
        InterfaceC2527g4 interfaceC2527g5 = interfaceC2527g4;
        if ((i13 & 8) != 0) {
            z13 = c33290j.f138838d;
        }
        boolean z15 = z13;
        boolean z16 = c33290j.f138839e;
        if ((i13 & 32) != 0) {
            interfaceC41211c2 = c33290j.f138840f;
        }
        InterfaceC41211c interfaceC41211c5 = interfaceC41211c2;
        if ((i13 & 64) != 0) {
            interfaceC41211c3 = c33290j.f138841g;
        }
        c33290j.getClass();
        return new C33290j(interfaceC41211c4, z14, interfaceC2527g5, z15, z16, interfaceC41211c5, interfaceC41211c3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33290j)) {
            return false;
        }
        C33290j c33290j = (C33290j) obj;
        return AbstractC22676k.m65745e(this.f138835a, c33290j.f138835a) && this.f138836b == c33290j.f138836b && AbstractC22676k.m65745e(this.f138837c, c33290j.f138837c) && this.f138838d == c33290j.f138838d && this.f138839e == c33290j.f138839e && AbstractC22676k.m65745e(this.f138840f, c33290j.f138840f) && AbstractC22676k.m65745e(this.f138841g, c33290j.f138841g);
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.f138837c.hashCode() + AbstractC2875y.m8289b(this.f138835a.hashCode() * 31, 31, this.f138836b)) * 31, 31, this.f138838d), 31, this.f138839e);
        InterfaceC41211c interfaceC41211c = this.f138840f;
        int iHashCode = (iM8289b + (interfaceC41211c == null ? 0 : interfaceC41211c.hashCode())) * 31;
        InterfaceC41211c interfaceC41211c2 = this.f138841g;
        return iHashCode + (interfaceC41211c2 != null ? interfaceC41211c2.hashCode() : 0);
    }

    public final String toString() {
        return "State(primaryButtonLabel=" + this.f138835a + ", isEnabled=" + this.f138836b + ", processingState=" + this.f138837c + ", isProcessing=" + this.f138838d + ", shouldDisplayLockIcon=" + this.f138839e + ", error=" + this.f138840f + ", mandateText=" + this.f138841g + ")";
    }
}
