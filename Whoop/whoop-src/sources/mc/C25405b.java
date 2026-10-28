package mc;

import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: mc.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C25405b extends AbstractC25406c {

    /* JADX INFO: renamed from: a */
    public final int f99502a;

    public C25405b(int i13) {
        this.f99502a = i13;
    }

    /* JADX INFO: renamed from: a */
    public final int m74593a() {
        return this.f99502a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25405b) && this.f99502a == ((C25405b) obj).f99502a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f99502a);
    }

    public final String toString() {
        return AbstractC11895b.m31999r(new StringBuilder("ConstraintsNotMet(reason="), this.f99502a, ')');
    }
}
