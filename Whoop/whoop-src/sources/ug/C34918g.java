package ug;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: ug.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C34918g {

    /* JADX INFO: renamed from: a */
    public final int f147023a;

    /* JADX INFO: renamed from: b */
    public final int f147024b;

    /* JADX INFO: renamed from: c */
    public final int f147025c;

    public C34918g(int i13, int i14, int i15) {
        this.f147023a = i13;
        this.f147024b = i14;
        this.f147025c = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34918g)) {
            return false;
        }
        C34918g c34918g = (C34918g) obj;
        return this.f147023a == c34918g.f147023a && this.f147024b == c34918g.f147024b && this.f147025c == c34918g.f147025c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f147025c) + AbstractC11266d.m30448b(this.f147024b, Integer.hashCode(this.f147023a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ParsedDate(year=");
        sb4.append(this.f147023a);
        sb4.append(", month=");
        sb4.append(this.f147024b);
        sb4.append(", day=");
        return AbstractC11895b.m31999r(sb4, this.f147025c, ')');
    }
}
