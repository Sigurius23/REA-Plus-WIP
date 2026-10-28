package p587wl;

import java.time.format.DateTimeParseException;
import p460rg.AbstractC31366a;
import p497t7.InterfaceC33561b;
import p555vl.C36096c;
import p555vl.C36097d;
import p619xl.AbstractC38446b;
import p715kotlin.time.DurationKt;

/* JADX INFO: renamed from: wl.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC37351a {

    /* JADX INFO: renamed from: a */
    public static final int[] f159762a = {100000000, 10000000, DurationKt.NANOS_IN_MILLIS, 100000, InterfaceC33561b.INVALID_OWNERSHIP, 1000, 100, 10, 1};

    /* JADX INFO: renamed from: a */
    public static void m119605a(C36096c c36096c, String str, int i13) {
        c36096c.getClass();
        int i14 = i13 + 1;
        if (str.length() > i14) {
            throw new DateTimeParseException(String.format("Trailing junk data after position %d: %s", Integer.valueOf(i13 + 2), str), str, i14);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m119606b(char[] cArr, int i13, C36097d c36097d) {
        int i14;
        if (c36097d == null) {
            i14 = 0;
        } else if (c36097d.equals(C36097d.f154318c)) {
            cArr[i13] = 'Z';
            i14 = 1;
        } else {
            cArr[i13] = c36097d.m114699a() < 0 ? '-' : '+';
            AbstractC38446b.m123191c(Math.abs(c36097d.f154319a), i13 + 1, 2, cArr);
            cArr[i13 + 3] = ':';
            AbstractC38446b.m123191c(Math.abs(c36097d.f154320b), i13 + 4, 2, cArr);
            i14 = 6;
        }
        return new String(cArr, 0, i13 + i14);
    }

    /* JADX INFO: renamed from: c */
    public static C36097d m119607c(C36096c c36096c, String str, int i13) {
        if (i13 >= str.length()) {
            return null;
        }
        int length = str.length() - i13;
        char cCharAt = str.charAt(i13);
        if (cCharAt == 'Z' || cCharAt == 'z') {
            m119605a(c36096c, str, i13);
            return C36097d.f154318c;
        }
        char cCharAt2 = str.charAt(i13);
        if (cCharAt2 != '+' && cCharAt2 != '-') {
            AbstractC31366a.m96479s(str, i13, 'Z', 'z', '+', '-');
            throw null;
        }
        if (length < 6) {
            throw new DateTimeParseException("Invalid timezone offset: ".concat(str), str, i13);
        }
        int iM123190b = AbstractC38446b.m123190b(i13 + 1, i13 + 3, str);
        int iM123190b2 = AbstractC38446b.m123190b(i13 + 4, i13 + 6, str);
        if (cCharAt2 == '-') {
            iM123190b = -iM123190b;
            iM123190b2 = -iM123190b2;
            if (iM123190b == 0 && iM123190b2 == 0) {
                throw new DateTimeParseException("Unknown 'Local Offset Convention' date-time not allowed", str, i13);
            }
        }
        m119605a(c36096c, str, i13 + 5);
        return new C36097d(iM123190b, iM123190b2);
    }
}
