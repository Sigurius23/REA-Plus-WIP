package p516u8;

import java.util.Locale;
import p607x8.AbstractC38065t;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: u8.e0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34589e0 {

    /* JADX INFO: renamed from: d */
    public static final C34589e0 f145647d = new C34589e0(1.0f);

    /* JADX INFO: renamed from: a */
    public final float f145648a;

    /* JADX INFO: renamed from: b */
    public final float f145649b;

    /* JADX INFO: renamed from: c */
    public final int f145650c;

    static {
        AbstractC38065t.m121892F(0);
        AbstractC38065t.m121892F(1);
    }

    public C34589e0(float f13) {
        this(f13, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C34589e0.class == obj.getClass()) {
            C34589e0 c34589e0 = (C34589e0) obj;
            if (this.f145648a == c34589e0.f145648a && this.f145649b == c34589e0.f145649b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f145649b) + ((Float.floatToRawIntBits(this.f145648a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f145648a), Float.valueOf(this.f145649b)};
        int i13 = AbstractC38065t.f163031a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public C34589e0(float f13, float f14) {
        AbstractC35849g.m113802d(f13 > 0.0f);
        AbstractC35849g.m113802d(f14 > 0.0f);
        this.f145648a = f13;
        this.f145649b = f14;
        this.f145650c = Math.round(f13 * 1000.0f);
    }
}
