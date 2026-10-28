package lg3;

import com.squareup.wire.AbstractC5583n;
import hc3.AbstractC17176i;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import ng3.C26706s;
import ng3.InterfaceC26700m;
import p012ab.C0682h0;

/* JADX INFO: renamed from: lg3.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C24045g implements InterfaceC24044f {

    /* JADX INFO: renamed from: w */
    public final InterfaceC26700m f95029w;

    /* JADX INFO: renamed from: x */
    public final int f95030x;

    /* JADX INFO: renamed from: y */
    public final boolean f95031y;

    public C24045g(InterfaceC26700m interfaceC26700m) {
        AbstractC5583n.m16762V(interfaceC26700m, "field");
        C26706s c26706sRange = interfaceC26700m.range();
        if (c26706sRange.f106201w != c26706sRange.f106202x || c26706sRange.f106203y != c26706sRange.f106204z) {
            throw new IllegalArgumentException(AbstractC17176i.m48504f("Field must have a fixed set of values: ", interfaceC26700m));
        }
        this.f95029w = interfaceC26700m;
        this.f95030x = 9;
        this.f95031y = true;
    }

    @Override // lg3.InterfaceC24044f
    /* JADX INFO: renamed from: a */
    public final int mo70946a(C24055q c24055q, CharSequence charSequence, int i13) {
        boolean z4 = c24055q.f95069c;
        C24058t c24058t = (C24058t) c24055q.f95070d;
        int i14 = z4 ? this.f95030x : 9;
        int length = charSequence.length();
        if (i13 != length) {
            if (this.f95031y) {
                char cCharAt = charSequence.charAt(i13);
                c24058t.getClass();
                if (cCharAt == '.') {
                    i13++;
                }
            }
            int i15 = i13;
            if (i15 > length) {
                return ~i15;
            }
            int iMin = Math.min(i14 + i15, length);
            int i16 = 0;
            int i17 = i15;
            while (i17 < iMin) {
                int i18 = i17 + 1;
                char cCharAt2 = charSequence.charAt(i17);
                c24058t.getClass();
                int i19 = cCharAt2 - '0';
                if (i19 < 0 || i19 > 9) {
                    i19 = -1;
                }
                if (i19 < 0) {
                    if (i18 >= i15) {
                        break;
                    }
                    return ~i15;
                }
                i16 = (i16 * 10) + i19;
                i17 = i18;
            }
            BigDecimal bigDecimalMovePointLeft = new BigDecimal(i16).movePointLeft(i17 - i15);
            C26706s c26706sRange = this.f95029w.range();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(c26706sRange.f106201w);
            return c24055q.m70974k(this.f95029w, bigDecimalMovePointLeft.multiply(BigDecimal.valueOf(c26706sRange.f106204z).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i15, i17);
        }
        return i13;
    }

    @Override // lg3.InterfaceC24044f
    /* JADX INFO: renamed from: b */
    public final boolean mo70947b(C0682h0 c0682h0, StringBuilder sb4) {
        InterfaceC26700m interfaceC26700m = this.f95029w;
        Long lM1703r = c0682h0.m1703r(interfaceC26700m);
        if (lM1703r == null) {
            return false;
        }
        C24058t c24058t = (C24058t) c0682h0.f2434z;
        long jLongValue = lM1703r.longValue();
        C26706s c26706sRange = interfaceC26700m.range();
        c26706sRange.m79421b(jLongValue, interfaceC26700m);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(c26706sRange.f106201w);
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(c26706sRange.f106204z).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        if (bigDecimal.scale() == 0) {
            return true;
        }
        String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), 0), this.f95030x), roundingMode).toPlainString().substring(2);
        c24058t.getClass();
        if (this.f95031y) {
            sb4.append('.');
        }
        sb4.append(strSubstring);
        return true;
    }

    public final String toString() {
        return "Fraction(" + this.f95029w + ",0," + this.f95030x + (this.f95031y ? ",DecimalPoint" : "") + ")";
    }
}
