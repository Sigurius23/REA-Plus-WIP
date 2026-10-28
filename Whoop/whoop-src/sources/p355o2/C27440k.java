package p355o2;

import p000.AbstractC30802r;

/* JADX INFO: renamed from: o2.k */
/* JADX INFO: loaded from: classes.dex */
public final class C27440k extends AbstractC27423a0 {

    /* JADX INFO: renamed from: c */
    public final float f110609c;

    public C27440k(float f13) {
        super(3);
        this.f110609c = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C27440k) && Float.compare(this.f110609c, ((C27440k) obj).f110609c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f110609c);
    }

    public final String toString() {
        return AbstractC30802r.m94763l(new StringBuilder("HorizontalTo(x="), this.f110609c, ')');
    }
}
