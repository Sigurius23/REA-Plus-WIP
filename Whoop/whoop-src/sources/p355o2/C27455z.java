package p355o2;

import p000.AbstractC30802r;

/* JADX INFO: renamed from: o2.z */
/* JADX INFO: loaded from: classes.dex */
public final class C27455z extends AbstractC27423a0 {

    /* JADX INFO: renamed from: c */
    public final float f110653c;

    public C27455z(float f13) {
        super(3);
        this.f110653c = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C27455z) && Float.compare(this.f110653c, ((C27455z) obj).f110653c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f110653c);
    }

    public final String toString() {
        return AbstractC30802r.m94763l(new StringBuilder("VerticalTo(y="), this.f110653c, ')');
    }
}
