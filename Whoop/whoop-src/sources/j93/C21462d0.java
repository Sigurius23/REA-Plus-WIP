package j93;

import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j93.d0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C21462d0 {

    /* JADX INFO: renamed from: c */
    public static final C21462d0 f82423c = new C21462d0(null, null);

    /* JADX INFO: renamed from: a */
    public final EnumC21464e0 f82424a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC21456a0 f82425b;

    public C21462d0(EnumC21464e0 enumC21464e0, InterfaceC21456a0 interfaceC21456a0) {
        String str;
        this.f82424a = enumC21464e0;
        this.f82425b = interfaceC21456a0;
        if ((enumC21464e0 == null) == (interfaceC21456a0 == null)) {
            return;
        }
        if (enumC21464e0 == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + enumC21464e0 + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    /* JADX INFO: renamed from: a */
    public final EnumC21464e0 m60391a() {
        return this.f82424a;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC21456a0 m60392b() {
        return this.f82425b;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC21456a0 m60393c() {
        return this.f82425b;
    }

    /* JADX INFO: renamed from: d */
    public final EnumC21464e0 m60394d() {
        return this.f82424a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21462d0)) {
            return false;
        }
        C21462d0 c21462d0 = (C21462d0) obj;
        return this.f82424a == c21462d0.f82424a && AbstractC22676k.m65745e(this.f82425b, c21462d0.f82425b);
    }

    public final int hashCode() {
        EnumC21464e0 enumC21464e0 = this.f82424a;
        int iHashCode = (enumC21464e0 == null ? 0 : enumC21464e0.hashCode()) * 31;
        InterfaceC21456a0 interfaceC21456a0 = this.f82425b;
        return iHashCode + (interfaceC21456a0 != null ? interfaceC21456a0.hashCode() : 0);
    }

    public final String toString() {
        EnumC21464e0 enumC21464e0 = this.f82424a;
        int i13 = enumC21464e0 == null ? -1 : AbstractC21460c0.f82422a[enumC21464e0.ordinal()];
        if (i13 == -1) {
            return "*";
        }
        InterfaceC21456a0 interfaceC21456a0 = this.f82425b;
        if (i13 == 1) {
            return String.valueOf(interfaceC21456a0);
        }
        if (i13 == 2) {
            return "in " + interfaceC21456a0;
        }
        if (i13 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + interfaceC21456a0;
    }
}
