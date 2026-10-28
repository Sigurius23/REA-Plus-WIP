package p008a7;

import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: a7.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C0516g {

    /* JADX INFO: renamed from: a */
    public final int f1724a;

    public C0516g(int i13) {
        this.f1724a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0516g) && this.f1724a == ((C0516g) obj).f1724a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1724a);
    }

    public final String toString() {
        return AbstractC11895b.m31999r(new StringBuilder("ResourceColorProvider(resId="), this.f1724a, ')');
    }
}
