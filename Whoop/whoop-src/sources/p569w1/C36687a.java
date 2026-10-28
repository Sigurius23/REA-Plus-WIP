package p569w1;

import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: w1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C36687a {

    /* JADX INFO: renamed from: a */
    public int f157124a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C36687a) && this.f157124a == ((C36687a) obj).f157124a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f157124a);
    }

    public final String toString() {
        return AbstractC11895b.m31999r(new StringBuilder("DeltaCounter(count="), this.f157124a, ')');
    }
}
