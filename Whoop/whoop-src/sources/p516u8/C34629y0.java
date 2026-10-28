package p516u8;

import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: u8.y0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34629y0 {

    /* JADX INFO: renamed from: d */
    public static final C34629y0 f145874d = new C34629y0(1.0f, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f145875a;

    /* JADX INFO: renamed from: b */
    public final int f145876b;

    /* JADX INFO: renamed from: c */
    public final float f145877c;

    static {
        AbstractC38065t.m121892F(0);
        AbstractC38065t.m121892F(1);
        AbstractC38065t.m121892F(3);
    }

    public C34629y0(float f13, int i13, int i14) {
        this.f145875a = i13;
        this.f145876b = i14;
        this.f145877c = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C34629y0) {
            C34629y0 c34629y0 = (C34629y0) obj;
            if (this.f145875a == c34629y0.f145875a && this.f145876b == c34629y0.f145876b && this.f145877c == c34629y0.f145877c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f145877c) + ((((217 + this.f145875a) * 31) + this.f145876b) * 31);
    }
}
