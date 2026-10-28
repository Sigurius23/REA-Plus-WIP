package p353o0;

import p268k0.AbstractC22086a;

/* JADX INFO: renamed from: o0.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C27317b {

    /* JADX INFO: renamed from: a */
    public final int f109385a;

    public C27317b(int i13) {
        this.f109385a = i13;
        if (i13 > 0) {
            return;
        }
        AbstractC22086a.m63158a("Provided count should be larger than zero");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C27317b) {
            return this.f109385a == ((C27317b) obj).f109385a;
        }
        return false;
    }

    public final int hashCode() {
        return -this.f109385a;
    }
}
