package androidx.compose.material3;

import p000.AbstractC11266d;
import p005a3.InterfaceC0229n;
import p132f0.InterfaceC13832v0;
import p208i2.C17919x;
import p238j0.InterfaceC21083i;
import p292l1.C23136m3;
import p636y3.C39174f;

/* JADX INFO: renamed from: androidx.compose.material3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C1122c implements InterfaceC13832v0 {

    /* JADX INFO: renamed from: a */
    public final boolean f4752a;

    /* JADX INFO: renamed from: b */
    public final float f4753b;

    /* JADX INFO: renamed from: c */
    public final long f4754c;

    public C1122c(boolean z4, float f13, long j7) {
        this.f4752a = z4;
        this.f4753b = f13;
        this.f4754c = j7;
    }

    @Override // p132f0.InterfaceC13832v0
    /* JADX INFO: renamed from: a */
    public final InterfaceC0229n mo3461a(InterfaceC21083i interfaceC21083i) {
        return new DelegatingThemeAwareRippleNode(interfaceC21083i, this.f4752a, this.f4753b, new C23136m3(this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1122c)) {
            return false;
        }
        C1122c c1122c = (C1122c) obj;
        if (this.f4752a == c1122c.f4752a && C39174f.m124782b(this.f4753b, c1122c.f4753b)) {
            return C17919x.m51542d(this.f4754c, c1122c.f4754c);
        }
        return false;
    }

    @Override // p132f0.InterfaceC13832v0
    public final int hashCode() {
        int iM30447a = AbstractC11266d.m30447a(this.f4753b, Boolean.hashCode(this.f4752a) * 31, 961);
        int i13 = C17919x.f69638o;
        return Long.hashCode(this.f4754c) + iM30447a;
    }
}
