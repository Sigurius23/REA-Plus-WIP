package p133f1;

import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: f1.u */
/* JADX INFO: loaded from: classes5.dex */
public final class C13981u {

    /* JADX INFO: renamed from: a */
    public final C13978t f49879a;

    /* JADX INFO: renamed from: b */
    public final C13978t f49880b;

    /* JADX INFO: renamed from: c */
    public final boolean f49881c;

    public C13981u(C13978t c13978t, C13978t c13978t2, boolean z4) {
        this.f49879a = c13978t;
        this.f49880b = c13978t2;
        this.f49881c = z4;
    }

    /* JADX INFO: renamed from: a */
    public static C13981u m39791a(C13981u c13981u, C13978t c13978t, C13978t c13978t2, boolean z4, int i13) {
        if ((i13 & 1) != 0) {
            c13978t = c13981u.f49879a;
        }
        if ((i13 & 2) != 0) {
            c13978t2 = c13981u.f49880b;
        }
        if ((i13 & 4) != 0) {
            z4 = c13981u.f49881c;
        }
        c13981u.getClass();
        return new C13981u(c13978t, c13978t2, z4);
    }

    /* JADX INFO: renamed from: b */
    public final C13978t m39792b() {
        return this.f49880b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m39793c() {
        return this.f49881c;
    }

    /* JADX INFO: renamed from: d */
    public final C13978t m39794d() {
        return this.f49879a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13981u)) {
            return false;
        }
        C13981u c13981u = (C13981u) obj;
        return AbstractC22676k.m65745e(this.f49879a, c13981u.f49879a) && AbstractC22676k.m65745e(this.f49880b, c13981u.f49880b) && this.f49881c == c13981u.f49881c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f49881c) + ((this.f49880b.hashCode() + (this.f49879a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Selection(start=");
        sb4.append(this.f49879a);
        sb4.append(", end=");
        sb4.append(this.f49880b);
        sb4.append(", handlesCrossed=");
        return AbstractC2875y.m8305r(sb4, this.f49881c, ')');
    }
}
