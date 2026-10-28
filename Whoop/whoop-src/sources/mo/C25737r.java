package mo;

import p465rm.InterfaceC31529f;

/* JADX INFO: renamed from: mo.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C25737r implements InterfaceC31529f {

    /* JADX INFO: renamed from: E */
    public static final C25737r f101428E = new C25737r(1.0f, 0, 0, 0);

    /* JADX INFO: renamed from: w */
    public final int f101429w;

    /* JADX INFO: renamed from: x */
    public final int f101430x;

    /* JADX INFO: renamed from: y */
    public final int f101431y;

    /* JADX INFO: renamed from: z */
    public final float f101432z;

    public C25737r(float f13, int i13, int i14, int i15) {
        this.f101429w = i13;
        this.f101430x = i14;
        this.f101431y = i15;
        this.f101432z = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C25737r) {
            C25737r c25737r = (C25737r) obj;
            if (this.f101429w == c25737r.f101429w && this.f101430x == c25737r.f101430x && this.f101431y == c25737r.f101431y && this.f101432z == c25737r.f101432z) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f101432z) + ((((((217 + this.f101429w) * 31) + this.f101430x) * 31) + this.f101431y) * 31);
    }
}
