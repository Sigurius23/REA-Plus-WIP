package p619xl;

import java.time.format.DateTimeParseException;
import java.util.Arrays;
import p000.AbstractC11266d;
import p460rg.AbstractC31366a;

/* JADX INFO: renamed from: xl.b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC38446b {

    /* JADX INFO: renamed from: a */
    public static final char[] f164638a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    /* JADX INFO: renamed from: b */
    public static final int f164639b;

    /* JADX INFO: renamed from: c */
    public static final char[] f164640c;

    static {
        int iPow = (int) Math.pow(10.0d, 4.0d);
        f164639b = iPow;
        f164640c = new char[(iPow * 4) + 10];
        int i13 = 0;
        for (int i14 = 0; i14 < f164639b; i14++) {
            m123189a(i13, 4, i14, f164640c);
            i13 += 4;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m123189a(int i13, int i14, int i15, char[] cArr) {
        char[] cArr2;
        int i16 = i13 + 10;
        int i17 = -i15;
        int i18 = i16;
        while (true) {
            cArr2 = f164638a;
            if (i17 > -10) {
                break;
            }
            int i19 = i17 / 10;
            cArr[i18] = cArr2[-(i17 - (i19 * 10))];
            i17 = i19;
            i18--;
        }
        cArr[i18] = cArr2[-i17];
        int i24 = i16 - i18;
        while (true) {
            i24++;
            if (i24 >= i14) {
                System.arraycopy(cArr, i18, cArr, i13, i14);
                return;
            } else {
                i18--;
                cArr[i18] = '0';
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m123190b(int i13, int i14, String str) {
        int i15 = 0;
        for (int i16 = i13; i16 < i14; i16++) {
            try {
                char cCharAt = str.charAt(i16);
                if (cCharAt < '0' || cCharAt > '9') {
                    AbstractC31366a.m96479s(str, i16, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9');
                    throw null;
                }
                i15 = (i15 * 10) + (cCharAt - '0');
            } catch (StringIndexOutOfBoundsException unused) {
                throw new DateTimeParseException(AbstractC11266d.m30461o("Unexpected end of input: ", str), str, i13);
            }
        }
        return i15;
    }

    /* JADX INFO: renamed from: c */
    public static void m123191c(int i13, int i14, int i15, char[] cArr) {
        if (i13 >= f164639b) {
            m123189a(i14, i15, i13, cArr);
            return;
        }
        int iMin = Math.min(4, i15);
        int i16 = i15 - iMin;
        int i17 = i15 > 4 ? 4 : 4 - i15;
        int i18 = i14 + i16;
        int i19 = i13 * 4;
        if (i15 >= 4) {
            i17 = 0;
        }
        System.arraycopy(f164640c, i19 + i17, cArr, i18, iMin);
        if (i16 > 0) {
            Arrays.fill(cArr, i14, i18, '0');
        }
    }
}
