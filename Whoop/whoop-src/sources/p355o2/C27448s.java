package p355o2;

import p000.AbstractC30802r;

/* JADX INFO: renamed from: o2.s */
/* JADX INFO: loaded from: classes.dex */
public final class C27448s extends AbstractC27423a0 {

    /* JADX INFO: renamed from: c */
    public final float f110637c;

    public C27448s(float f13) {
        super(3);
        this.f110637c = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C27448s) && Float.compare(this.f110637c, ((C27448s) obj).f110637c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f110637c);
    }

    public final String toString() {
        return AbstractC30802r.m94763l(new StringBuilder("RelativeHorizontalTo(dx="), this.f110637c, ')');
    }
}
