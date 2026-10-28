package gt;

import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: gt.j */
/* JADX INFO: loaded from: classes.dex */
public final class C16171j {

    /* JADX INFO: renamed from: a */
    public final C16177p f61451a;

    /* JADX INFO: renamed from: b */
    public final int f61452b;

    /* JADX INFO: renamed from: c */
    public final int f61453c;

    public C16171j(int i13, int i14, Class cls) {
        this(C16177p.m45715a(cls), i13, i14);
    }

    /* JADX INFO: renamed from: a */
    public static C16171j m45713a(Class cls) {
        return new C16171j(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16171j)) {
            return false;
        }
        C16171j c16171j = (C16171j) obj;
        return this.f61451a.equals(c16171j.f61451a) && this.f61452b == c16171j.f61452b && this.f61453c == c16171j.f61453c;
    }

    public final int hashCode() {
        return ((((this.f61451a.hashCode() ^ 1000003) * 1000003) ^ this.f61452b) * 1000003) ^ this.f61453c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb4 = new StringBuilder("Dependency{anInterface=");
        sb4.append(this.f61451a);
        sb4.append(", type=");
        int i13 = this.f61452b;
        if (i13 == 1) {
            str = "required";
        } else {
            str = i13 == 0 ? "optional" : "set";
        }
        sb4.append(str);
        sb4.append(", injection=");
        int i14 = this.f61453c;
        if (i14 == 0) {
            str2 = "direct";
        } else if (i14 == 1) {
            str2 = "provider";
        } else {
            if (i14 != 2) {
                throw new AssertionError(AbstractC2875y.m8295h(i14, "Unsupported injection: "));
            }
            str2 = "deferred";
        }
        return AbstractC25012a.m73376i(str2, "}", sb4);
    }

    public C16171j(C16177p c16177p, int i13, int i14) {
        this.f61451a = c16177p;
        this.f61452b = i13;
        this.f61453c = i14;
    }
}
