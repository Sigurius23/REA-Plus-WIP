package p716lb1;

import i93.C18278d;
import i93.InterfaceC18280f;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lb1.v2 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"", "value", "c", "(D)D", "", "decimalPlaces", "Llb1/w2;", "rule", "d", "(DILlb1/w2;)D", "", "b", "(DI)Z", "lowerBound", "upperBound", "Li93/f;", "a", "(DDI)Li93/f;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23727v2 {

    /* JADX INFO: renamed from: lb1.v2$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f94028a;

        static {
            int[] iArr = new int[EnumC23733w2.values().length];
            try {
                iArr[EnumC23733w2.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC23733w2.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC23733w2.NEAREST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f94028a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC18280f m69581a(double d3, double d14, int i13) {
        double dM69584d = m69584d(d3, i13, EnumC23733w2.UP);
        double dM69584d2 = m69584d(d14, i13, EnumC23733w2.DOWN);
        if (dM69584d <= dM69584d2) {
            return new C18278d(dM69584d, dM69584d2);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m69582b(double d3, int i13) {
        return m69584d(d3, i13, EnumC23733w2.NEAREST) == d3;
    }

    /* JADX INFO: renamed from: c */
    private static final double m69583c(double d3) {
        return d3 < 0.0d ? -Math.floor((-d3) + 0.5d) : Math.floor(d3 + 0.5d);
    }

    /* JADX INFO: renamed from: d */
    public static final double m69584d(double d3, int i13, EnumC23733w2 rule) {
        double dCeil;
        AbstractC22676k.m65750j(rule, "rule");
        double dPow = Math.pow(10.0d, i13);
        if (Math.abs(dPow) > Double.MAX_VALUE) {
            return d3;
        }
        double d14 = d3 * dPow;
        if (Math.abs(d14) > Double.MAX_VALUE) {
            return d3;
        }
        double dM69583c = m69583c(d14);
        if (Math.abs(d14 - dM69583c) <= Math.ulp(d14) * ((double) 2)) {
            d14 = dM69583c;
        }
        int i14 = a.f94028a[rule.ordinal()];
        if (i14 == 1) {
            dCeil = Math.ceil(d14);
        } else if (i14 == 2) {
            dCeil = Math.floor(d14);
        } else {
            if (i14 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            dCeil = m69583c(d14);
        }
        return dCeil / dPow;
    }
}
