package or2;

import e93.AbstractC12889b;
import i93.C18282h;
import i93.C18284j;
import java.util.List;
import l83.C23465k;
import p715kotlin.Metadata;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: or2.a1 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0005\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a9\u0010\u000e\u001a\u00020\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000f\u001aA\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"", "interval", "e", "(DD)D", "", "f", "(FF)F", "", "decimals", "d", "(FI)F", "Ll83/k;", "startPoint", "endPoint", "a", "(Ll83/k;Ll83/k;)F", "", "b", "(Ll83/k;Ll83/k;)Ljava/util/List;", "Li93/h;", "c", "(II)Li93/h;", "core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28145a1 {
    /* JADX INFO: renamed from: a */
    public static final float m85165a(C23465k c23465k, C23465k c23465k2) {
        if (c23465k == null || c23465k2 == null) {
            return 0.0f;
        }
        return m85168d(360 - (((float) Math.atan2(((Number) c23465k2.f92938x).floatValue() - ((Number) c23465k.f92938x).floatValue(), ((Number) c23465k2.f92937w).floatValue() - ((Number) c23465k.f92937w).floatValue())) * 100), 2) - 90.0f;
    }

    /* JADX INFO: renamed from: b */
    public static final List<Float> m85166b(C23465k c23465k, C23465k c23465k2) {
        if (c23465k == null || c23465k2 == null) {
            return null;
        }
        return AbstractC37056f.m118959K(Float.valueOf(0.0f), Float.valueOf(1 - ((((Number) c23465k2.f92938x).floatValue() + ((Number) c23465k.f92938x).floatValue()) / 2)), Float.valueOf(1.0f));
    }

    /* JADX INFO: renamed from: c */
    public static final C18282h m85167c(int i13, int i14) {
        return i13 > i14 ? new C18282h(i13, i14, -1) : new C18284j(i13, i14, 1);
    }

    /* JADX INFO: renamed from: d */
    public static final float m85168d(float f13, int i13) {
        if (Float.isNaN(f13)) {
            return f13;
        }
        if (i13 < 0) {
            i13 = 0;
        }
        double dPow = Math.pow(10.0d, i13);
        return (float) (((double) AbstractC12889b.m36257W(((double) f13) * dPow)) / dPow);
    }

    /* JADX INFO: renamed from: e */
    public static final double m85169e(double d3, double d14) {
        return Math.round(d3 / d14) * d14;
    }

    /* JADX INFO: renamed from: f */
    public static final float m85170f(float f13, float f14) {
        return Math.round(f13 / f14) * f14;
    }
}
