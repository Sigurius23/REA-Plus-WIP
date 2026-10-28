package p043c4;

import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: c4.a0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C3948a0 {

    /* JADX INFO: renamed from: a */
    public final boolean f16090a;

    /* JADX INFO: renamed from: b */
    public final boolean f16091b;

    /* JADX INFO: renamed from: c */
    public final EnumC3968k0 f16092c;

    /* JADX INFO: renamed from: d */
    public final boolean f16093d;

    /* JADX INFO: renamed from: e */
    public final boolean f16094e;

    /* JADX INFO: renamed from: f */
    public final String f16095f;

    public C3948a0(boolean z4, boolean z13, boolean z14, boolean z15, int i13) {
        EnumC3968k0 enumC3968k0 = EnumC3968k0.f16173w;
        z4 = (i13 & 1) != 0 ? true : z4;
        z13 = (i13 & 2) != 0 ? true : z13;
        this.f16090a = z4;
        this.f16091b = z13;
        this.f16092c = enumC3968k0;
        this.f16093d = z14;
        this.f16094e = z15;
        this.f16095f = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3948a0)) {
            return false;
        }
        C3948a0 c3948a0 = (C3948a0) obj;
        return this.f16090a == c3948a0.f16090a && this.f16091b == c3948a0.f16091b && this.f16092c == c3948a0.f16092c && this.f16093d == c3948a0.f16093d && this.f16094e == c3948a0.f16094e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16094e) + AbstractC2875y.m8289b((this.f16092c.hashCode() + AbstractC2875y.m8289b(Boolean.hashCode(this.f16090a) * 31, 31, this.f16091b)) * 31, 31, this.f16093d);
    }

    public /* synthetic */ C3948a0(int i13) {
        this(true, true, (i13 & 4) != 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3948a0(boolean z4, boolean z13, boolean z14) {
        this(z4, z13, z14, true, 32);
        EnumC3968k0 enumC3968k0 = EnumC3968k0.f16173w;
    }
}
