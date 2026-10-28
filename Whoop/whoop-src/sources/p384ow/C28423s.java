package p384ow;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
import p440qw.AbstractC30672g;
import p440qw.C30674i;

/* JADX INFO: renamed from: ow.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C28423s extends AbstractC28420p {

    /* JADX INFO: renamed from: w */
    public final Serializable f114644w;

    public C28423s(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f114644w = bool;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m86139e(C28423s c28423s) {
        Serializable serializable = c28423s.f114644w;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    /* JADX INFO: renamed from: a */
    public final BigInteger m86140a() {
        Serializable serializable = this.f114644w;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (m86139e(this)) {
            return BigInteger.valueOf(m86141c().longValue());
        }
        String strM86142d = m86142d();
        AbstractC30672g.m94268d(strM86142d);
        return new BigInteger(strM86142d);
    }

    /* JADX INFO: renamed from: c */
    public final Number m86141c() {
        Serializable serializable = this.f114644w;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new C30674i((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    /* JADX INFO: renamed from: d */
    public final String m86142d() {
        Serializable serializable = this.f114644w;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return m86141c().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C28423s.class != obj.getClass()) {
            return false;
        }
        C28423s c28423s = (C28423s) obj;
        Serializable serializable = c28423s.f114644w;
        Serializable serializable2 = this.f114644w;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (m86139e(this) && m86139e(c28423s)) {
            if ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) {
                return m86140a().equals(c28423s.m86140a());
            }
            return m86141c().longValue() == c28423s.m86141c().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : AbstractC30672g.m94273i(m86142d())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : AbstractC30672g.m94273i(c28423s.m86142d())) == 0;
        }
        double dDoubleValue = serializable2 instanceof Number ? m86141c().doubleValue() : Double.parseDouble(m86142d());
        double dDoubleValue2 = serializable instanceof Number ? c28423s.m86141c().doubleValue() : Double.parseDouble(c28423s.m86142d());
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f114644w;
        if (serializable == null) {
            return 31;
        }
        if (m86139e(this)) {
            jDoubleToLongBits = m86141c().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(m86141c().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public C28423s(Number number) {
        Objects.requireNonNull(number);
        this.f114644w = number;
    }

    public C28423s(String str) {
        Objects.requireNonNull(str);
        this.f114644w = str;
    }
}
