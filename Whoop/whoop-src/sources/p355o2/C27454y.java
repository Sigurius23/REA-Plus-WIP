package p355o2;

import p000.AbstractC30802r;

/* JADX INFO: renamed from: o2.y */
/* JADX INFO: loaded from: classes.dex */
public final class C27454y extends AbstractC27423a0 {

    /* JADX INFO: renamed from: c */
    public final float f110652c;

    public C27454y(float f13) {
        super(3);
        this.f110652c = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C27454y) && Float.compare(this.f110652c, ((C27454y) obj).f110652c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f110652c);
    }

    public final String toString() {
        return AbstractC30802r.m94763l(new StringBuilder("RelativeVerticalTo(dy="), this.f110652c, ')');
    }
}
