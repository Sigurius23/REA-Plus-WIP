package androidx.compose.material;

import p000.AbstractC11266d;
import p005a3.InterfaceC0229n;
import p132f0.InterfaceC13832v0;
import p163g1.C14952a5;
import p208i2.C17919x;
import p238j0.InterfaceC21083i;
import p636y3.C39174f;

/* JADX INFO: renamed from: androidx.compose.material.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1119d implements InterfaceC13832v0 {

    /* JADX INFO: renamed from: a */
    public final boolean f4725a;

    /* JADX INFO: renamed from: b */
    public final float f4726b;

    /* JADX INFO: renamed from: c */
    public final long f4727c;

    public C1119d(boolean z4, float f13, long j7) {
        this.f4725a = z4;
        this.f4726b = f13;
        this.f4727c = j7;
    }

    @Override // p132f0.InterfaceC13832v0
    /* JADX INFO: renamed from: a */
    public final InterfaceC0229n mo3461a(InterfaceC21083i interfaceC21083i) {
        return new DelegatingThemeAwareRippleNode(interfaceC21083i, this.f4725a, this.f4726b, new C14952a5(this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1119d)) {
            return false;
        }
        C1119d c1119d = (C1119d) obj;
        if (this.f4725a == c1119d.f4725a && C39174f.m124782b(this.f4726b, c1119d.f4726b)) {
            return C17919x.m51542d(this.f4727c, c1119d.f4727c);
        }
        return false;
    }

    @Override // p132f0.InterfaceC13832v0
    public final int hashCode() {
        int iM30447a = AbstractC11266d.m30447a(this.f4726b, Boolean.hashCode(this.f4725a) * 31, 961);
        int i13 = C17919x.f69638o;
        return Long.hashCode(this.f4727c) + iM30447a;
    }
}
