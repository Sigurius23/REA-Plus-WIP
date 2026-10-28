package y00;

import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: y00.e2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38816e2 extends AbstractC38833g {

    /* JADX INFO: renamed from: a */
    public final int f167057a;

    /* JADX INFO: renamed from: b */
    public final int f167058b;

    public C38816e2(int i13, int i14) {
        this.f167057a = i13;
        this.f167058b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38816e2)) {
            return false;
        }
        C38816e2 c38816e2 = (C38816e2) obj;
        return this.f167057a == c38816e2.f167057a && this.f167058b == c38816e2.f167058b;
    }

    public final int hashCode() {
        return (this.f167057a * 31) + this.f167058b;
    }

    public final String toString() {
        return AbstractC25012a.m73372e(this.f167057a, this.f167058b, "Validated(month=", ", year=", ")");
    }
}
