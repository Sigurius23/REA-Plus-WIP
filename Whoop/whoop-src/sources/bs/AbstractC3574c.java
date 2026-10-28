package bs;

import java.math.RoundingMode;
import se.AbstractC32417h;

/* JADX INFO: renamed from: bs.c */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3574c {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f14449a = 0;

    static {
        Math.log(2.0d);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m10727a(double d3) {
        if (AbstractC32417h.m101181L(d3)) {
            return d3 == 0.0d || 52 - Long.numberOfTrailingZeros(AbstractC32417h.m101175F(d3)) <= Math.getExponent(d3);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m10728b(double d3) {
        if (d3 > 0.0d && AbstractC32417h.m101181L(d3)) {
            long jM101175F = AbstractC32417h.m101175F(d3);
            if ((jM101175F & (jM101175F - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static int m10729c(double d3) {
        boolean zM10728b;
        RoundingMode roundingMode = RoundingMode.CEILING;
        boolean z4 = false;
        if (!(d3 > 0.0d && AbstractC32417h.m101181L(d3))) {
            throw new IllegalArgumentException("x must be positive and finite");
        }
        int exponent = Math.getExponent(d3);
        if (Math.getExponent(d3) < -1022) {
            return m10729c(d3 * 4.503599627370496E15d) - 52;
        }
        switch (AbstractC3573b.f14448a[roundingMode.ordinal()]) {
            case 1:
                if (!m10728b(d3)) {
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                }
                if (z4) {
                    return exponent + 1;
                }
                return exponent;
            case 2:
                if (z4) {
                    return exponent + 1;
                }
                return exponent;
            case 3:
                z4 = !m10728b(d3);
                if (z4) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                z4 = exponent < 0;
                zM10728b = m10728b(d3);
                z4 &= !zM10728b;
                if (z4) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                z4 = exponent >= 0;
                zM10728b = m10728b(d3);
                z4 &= !zM10728b;
                if (z4) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double dLongBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d3) & 4503599627370495L) | 4607182418800017408L);
                if (dLongBitsToDouble * dLongBitsToDouble > 2.0d) {
                    z4 = true;
                }
                if (z4) {
                    return exponent + 1;
                }
                return exponent;
            default:
                throw new AssertionError();
        }
    }
}
