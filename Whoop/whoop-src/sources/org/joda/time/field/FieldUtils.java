package org.joda.time.field;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import yb0.AbstractC39383f;

/* JADX INFO: loaded from: classes5.dex */
public class FieldUtils {
    private FieldUtils() {
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static int getWrappedValue(int i13, int i14, int i15, int i16) {
        return getWrappedValue(i13 + i14, i15, i16);
    }

    public static int safeAdd(int i13, int i14) {
        int i15 = i13 + i14;
        if ((i13 ^ i15) >= 0 || (i13 ^ i14) < 0) {
            return i15;
        }
        throw new ArithmeticException(AbstractC2875y.m8294g(i13, i14, "The calculation caused an overflow: ", " + "));
    }

    public static long safeDivide(long j7, long j13) {
        if (j7 != Long.MIN_VALUE || j13 != -1) {
            return j7 / j13;
        }
        StringBuilder sbM125596b = AbstractC39383f.m125596b(j7, "Multiplication overflows a long: ", " / ");
        sbM125596b.append(j13);
        throw new ArithmeticException(sbM125596b.toString());
    }

    public static int safeMultiply(int i13, int i14) {
        long j7 = ((long) i13) * ((long) i14);
        if (j7 < -2147483648L || j7 > 2147483647L) {
            throw new ArithmeticException(AbstractC2875y.m8294g(i13, i14, "Multiplication overflows an int: ", " * "));
        }
        return (int) j7;
    }

    public static int safeMultiplyToInt(long j7, long j13) {
        return safeToInt(safeMultiply(j7, j13));
    }

    public static int safeNegate(int i13) {
        if (i13 != Integer.MIN_VALUE) {
            return -i13;
        }
        throw new ArithmeticException("Integer.MIN_VALUE cannot be negated");
    }

    public static long safeSubtract(long j7, long j13) {
        long j14 = j7 - j13;
        if ((j7 ^ j14) >= 0 || (j7 ^ j13) >= 0) {
            return j14;
        }
        StringBuilder sbM125596b = AbstractC39383f.m125596b(j7, "The calculation caused an overflow: ", " - ");
        sbM125596b.append(j13);
        throw new ArithmeticException(sbM125596b.toString());
    }

    public static int safeToInt(long j7) {
        if (-2147483648L > j7 || j7 > 2147483647L) {
            throw new ArithmeticException(AbstractC11895b.m31994m(j7, "Value cannot fit in an int: "));
        }
        return (int) j7;
    }

    public static void verifyValueBounds(DateTimeField dateTimeField, int i13, int i14, int i15) {
        if (i13 < i14 || i13 > i15) {
            throw new IllegalFieldValueException(dateTimeField.getType(), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15));
        }
    }

    public static int getWrappedValue(int i13, int i14, int i15) {
        if (i14 >= i15) {
            throw new IllegalArgumentException("MIN > MAX");
        }
        int i16 = (i15 - i14) + 1;
        int i17 = i13 - i14;
        if (i17 >= 0) {
            return (i17 % i16) + i14;
        }
        int i18 = (-i17) % i16;
        return i18 == 0 ? i14 : (i16 - i18) + i14;
    }

    public static void verifyValueBounds(DateTimeFieldType dateTimeFieldType, int i13, int i14, int i15) {
        if (i13 < i14 || i13 > i15) {
            throw new IllegalFieldValueException(dateTimeFieldType, Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15));
        }
    }

    public static void verifyValueBounds(String str, int i13, int i14, int i15) {
        if (i13 < i14 || i13 > i15) {
            throw new IllegalFieldValueException(str, Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15));
        }
    }

    public static long safeDivide(long j7, long j13, RoundingMode roundingMode) {
        if (j7 == Long.MIN_VALUE && j13 == -1) {
            StringBuilder sbM125596b = AbstractC39383f.m125596b(j7, "Multiplication overflows a long: ", " / ");
            sbM125596b.append(j13);
            throw new ArithmeticException(sbM125596b.toString());
        }
        return new BigDecimal(j7).divide(new BigDecimal(j13), roundingMode).longValue();
    }

    public static long safeAdd(long j7, long j13) {
        long j14 = j7 + j13;
        if ((j7 ^ j14) >= 0 || (j7 ^ j13) < 0) {
            return j14;
        }
        StringBuilder sbM125596b = AbstractC39383f.m125596b(j7, "The calculation caused an overflow: ", " + ");
        sbM125596b.append(j13);
        throw new ArithmeticException(sbM125596b.toString());
    }

    public static long safeMultiply(long j7, int i13) {
        if (i13 == -1) {
            if (j7 != Long.MIN_VALUE) {
                return -j7;
            }
            throw new ArithmeticException("Multiplication overflows a long: " + j7 + " * " + i13);
        }
        if (i13 == 0) {
            return 0L;
        }
        if (i13 == 1) {
            return j7;
        }
        long j13 = i13;
        long j14 = j7 * j13;
        if (j14 / j13 == j7) {
            return j14;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j7 + " * " + i13);
    }

    public static long safeMultiply(long j7, long j13) {
        if (j13 == 1) {
            return j7;
        }
        if (j7 == 1) {
            return j13;
        }
        if (j7 == 0 || j13 == 0) {
            return 0L;
        }
        long j14 = j7 * j13;
        if (j14 / j13 == j7 && ((j7 != Long.MIN_VALUE || j13 != -1) && (j13 != Long.MIN_VALUE || j7 != -1))) {
            return j14;
        }
        StringBuilder sbM125596b = AbstractC39383f.m125596b(j7, "Multiplication overflows a long: ", " * ");
        sbM125596b.append(j13);
        throw new ArithmeticException(sbM125596b.toString());
    }
}
