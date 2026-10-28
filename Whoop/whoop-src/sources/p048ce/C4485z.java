package p048ce;

import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ce.z */
/* JADX INFO: loaded from: classes5.dex */
public final class C4485z implements InterfaceC4461b0 {

    /* JADX INFO: renamed from: a */
    public final String f18026a;

    /* JADX INFO: renamed from: b */
    public final EnumC4471l f18027b;

    /* JADX INFO: renamed from: c */
    public final boolean f18028c;

    /* JADX INFO: renamed from: d */
    public final boolean f18029d;

    public C4485z(String str, EnumC4471l enumC4471l, boolean z4, boolean z13) {
        this.f18026a = str;
        this.f18027b = enumC4471l;
        this.f18028c = z4;
        this.f18029d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4485z)) {
            return false;
        }
        C4485z c4485z = (C4485z) obj;
        return AbstractC22676k.m65745e(this.f18026a, c4485z.f18026a) && this.f18027b == c4485z.f18027b && this.f18028c == c4485z.f18028c && this.f18029d == c4485z.f18029d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18029d) + AbstractC2875y.m8289b((this.f18027b.hashCode() + (this.f18026a.hashCode() * 31)) * 31, 31, this.f18028c);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Section(name=");
        sb4.append(this.f18026a);
        sb4.append(", type=");
        sb4.append(this.f18027b);
        sb4.append(", hasSectionPrefix=");
        sb4.append(this.f18028c);
        sb4.append(", isValid=");
        return AbstractC2875y.m8305r(sb4, this.f18029d, ')');
    }
}
