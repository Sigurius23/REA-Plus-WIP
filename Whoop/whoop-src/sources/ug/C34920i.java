package ug;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: ug.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C34920i {

    /* JADX INFO: renamed from: a */
    public final int f147034a;

    /* JADX INFO: renamed from: b */
    public final int f147035b;

    /* JADX INFO: renamed from: c */
    public final int f147036c;

    /* JADX INFO: renamed from: d */
    public final int f147037d;

    /* JADX INFO: renamed from: e */
    public final int f147038e;

    public C34920i(int i13, int i14, int i15, int i16, int i17) {
        this.f147034a = i13;
        this.f147035b = i14;
        this.f147036c = i15;
        this.f147037d = i16;
        this.f147038e = i17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34920i)) {
            return false;
        }
        C34920i c34920i = (C34920i) obj;
        return this.f147034a == c34920i.f147034a && this.f147035b == c34920i.f147035b && this.f147036c == c34920i.f147036c && this.f147037d == c34920i.f147037d && this.f147038e == c34920i.f147038e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f147038e) + AbstractC11266d.m30448b(this.f147037d, AbstractC11266d.m30448b(this.f147036c, AbstractC11266d.m30448b(this.f147035b, Integer.hashCode(this.f147034a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ParsedTime(hour=");
        sb4.append(this.f147034a);
        sb4.append(", min=");
        sb4.append(this.f147035b);
        sb4.append(", sec=");
        sb4.append(this.f147036c);
        sb4.append(", ns=");
        sb4.append(this.f147037d);
        sb4.append(", offsetSec=");
        return AbstractC11895b.m31999r(sb4, this.f147038e, ')');
    }
}
