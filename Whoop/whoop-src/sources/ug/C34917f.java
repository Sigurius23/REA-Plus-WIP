package ug;

import d13.AbstractC11478a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ug.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C34917f {

    /* JADX INFO: renamed from: a */
    public final int f147021a;

    /* JADX INFO: renamed from: b */
    public final Object f147022b;

    public C34917f(int i13, Object obj) {
        this.f147021a = i13;
        this.f147022b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34917f)) {
            return false;
        }
        C34917f c34917f = (C34917f) obj;
        return this.f147021a == c34917f.f147021a && AbstractC22676k.m65745e(this.f147022b, c34917f.f147022b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f147021a) * 31;
        Object obj = this.f147022b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ParseResult(pos=");
        sb4.append(this.f147021a);
        sb4.append(", result=");
        return AbstractC11478a.m30860l(sb4, this.f147022b, ')');
    }
}
