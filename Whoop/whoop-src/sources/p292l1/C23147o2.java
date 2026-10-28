package p292l1;

import p031b9.AbstractC2875y;
import p043c4.EnumC3968k0;

/* JADX INFO: renamed from: l1.o2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23147o2 {

    /* JADX INFO: renamed from: a */
    public final EnumC3968k0 f91543a = EnumC3968k0.f16173w;

    /* JADX INFO: renamed from: b */
    public final boolean f91544b = true;

    /* JADX INFO: renamed from: c */
    public final boolean f91545c = true;

    public C23147o2() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23147o2)) {
            return false;
        }
        C23147o2 c23147o2 = (C23147o2) obj;
        return this.f91543a == c23147o2.f91543a && this.f91545c == c23147o2.f91545c && this.f91544b == c23147o2.f91544b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f91545c) + AbstractC2875y.m8289b(this.f91543a.hashCode() * 31, 29791, this.f91544b);
    }

    public C23147o2(int i13) {
    }
}
