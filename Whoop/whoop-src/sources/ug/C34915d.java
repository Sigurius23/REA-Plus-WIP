package ug;

import p088dc.AbstractC11895b;
import p477s2.AbstractC32072d;

/* JADX INFO: renamed from: ug.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C34915d extends AbstractC32072d {

    /* JADX INFO: renamed from: w */
    public final int f147019w;

    public C34915d(int i13) {
        this.f147019w = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C34915d) && this.f147019w == ((C34915d) obj).f147019w;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f147019w);
    }

    public final String toString() {
        return AbstractC11895b.m31999r(new StringBuilder("incomplete input needed ("), this.f147019w, ')');
    }
}
