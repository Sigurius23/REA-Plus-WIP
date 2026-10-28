package ug;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: ug.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C34919h {

    /* JADX INFO: renamed from: a */
    public final int f147026a;

    /* JADX INFO: renamed from: b */
    public final int f147027b;

    /* JADX INFO: renamed from: c */
    public final int f147028c;

    /* JADX INFO: renamed from: d */
    public final int f147029d;

    /* JADX INFO: renamed from: e */
    public final int f147030e;

    /* JADX INFO: renamed from: f */
    public final int f147031f;

    /* JADX INFO: renamed from: g */
    public final int f147032g;

    /* JADX INFO: renamed from: h */
    public final int f147033h;

    public C34919h(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24) {
        this.f147026a = i13;
        this.f147027b = i14;
        this.f147028c = i15;
        this.f147029d = i16;
        this.f147030e = i17;
        this.f147031f = i18;
        this.f147032g = i19;
        this.f147033h = i24;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34919h)) {
            return false;
        }
        C34919h c34919h = (C34919h) obj;
        return this.f147026a == c34919h.f147026a && this.f147027b == c34919h.f147027b && this.f147028c == c34919h.f147028c && this.f147029d == c34919h.f147029d && this.f147030e == c34919h.f147030e && this.f147031f == c34919h.f147031f && this.f147032g == c34919h.f147032g && this.f147033h == c34919h.f147033h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f147033h) + AbstractC11266d.m30448b(this.f147032g, AbstractC11266d.m30448b(this.f147031f, AbstractC11266d.m30448b(this.f147030e, AbstractC11266d.m30448b(this.f147029d, AbstractC11266d.m30448b(this.f147028c, AbstractC11266d.m30448b(this.f147027b, Integer.hashCode(this.f147026a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ParsedDatetime(year=");
        sb4.append(this.f147026a);
        sb4.append(", month=");
        sb4.append(this.f147027b);
        sb4.append(", day=");
        sb4.append(this.f147028c);
        sb4.append(", hour=");
        sb4.append(this.f147029d);
        sb4.append(", min=");
        sb4.append(this.f147030e);
        sb4.append(", sec=");
        sb4.append(this.f147031f);
        sb4.append(", ns=");
        sb4.append(this.f147032g);
        sb4.append(", offsetSec=");
        return AbstractC11895b.m31999r(sb4, this.f147033h, ')');
    }
}
