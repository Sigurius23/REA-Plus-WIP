package pc3;

import com.whoop.service.network.model.UserSessionDto;
import kotlinx.datetime.DatePeriod;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.DateTimePeriod;
import p000.AbstractC11266d;
import p477s2.AbstractC32073e;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35846d;
import vc3.C35886e;
import wc3.InterfaceC37138c;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: pc3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C29080b {
    /* JADX WARN: Code duplicated, block: B:107:0x01da  */
    /* JADX WARN: Code duplicated, block: B:170:0x028d  */
    /* JADX WARN: Code duplicated, block: B:172:0x0295  */
    /* JADX WARN: Code duplicated, block: B:175:0x029c  */
    /* JADX WARN: Code duplicated, block: B:182:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:184:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:186:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:217:0x0321 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x030b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x0305 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x02ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x02fb A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static DateTimePeriod m88405a(String text) {
        int i13;
        int i14;
        char cCharAt;
        char c3;
        long jAddExact;
        char upperCase;
        int i15;
        int i16;
        char cCharAt2;
        char c7;
        char cCharAt3;
        AbstractC22676k.m65750j(text, "text");
        int i17 = 0;
        char c14 = 0;
        int i18 = 1;
        int iM88407c = 0;
        int iM88407c2 = 0;
        boolean z4 = false;
        int iM88407c3 = 0;
        int iM88407c4 = 0;
        int iM88407c5 = 0;
        int iM88407c6 = 0;
        int iM88407c7 = 0;
        int i19 = 0;
        while (i17 < text.length()) {
            if (c14 == 0) {
                int i24 = i17 + 1;
                if (i24 >= text.length() && (text.charAt(i17) == '+' || text.charAt(i17) == '-')) {
                    m88406b(i17, "Unexpected end of string; 'P' designator is required");
                    throw null;
                }
                char cCharAt4 = text.charAt(i17);
                int i25 = i18;
                if (cCharAt4 == '+' || cCharAt4 == '-') {
                    int i26 = text.charAt(i17) == '-' ? -1 : i25;
                    if (text.charAt(i24) != 'P') {
                        m88406b(i24, "Expected 'P', got '" + text.charAt(i24) + '\'');
                        throw null;
                    }
                    i17 += 2;
                    i18 = i26;
                } else {
                    if (cCharAt4 != 'P') {
                        m88406b(i17, "Expected '+', '-', 'P', got '" + text.charAt(i17) + '\'');
                        throw null;
                    }
                    i17 = i24;
                    i18 = i25;
                }
                c14 = 1;
            } else {
                int i27 = i18;
                char cCharAt5 = text.charAt(i17);
                if (cCharAt5 == '+' || cCharAt5 == '-') {
                    i13 = text.charAt(i17) == '-' ? i27 * (-1) : i27;
                    i14 = i17 + 1;
                    if (i14 < text.length() && '0' <= (cCharAt = text.charAt(i14))) {
                        c3 = ':';
                        if (cCharAt >= ':') {
                        }
                        jAddExact = 0;
                        while (i14 < text.length() && '0' <= (cCharAt3 = text.charAt(i14)) && cCharAt3 < c3) {
                            int i28 = iM88407c;
                            int i29 = iM88407c2;
                            int i34 = iM88407c3;
                            try {
                                jAddExact = Math.addExact(Math.multiplyExact(jAddExact, 10L), text.charAt(i14) - '0');
                                i14++;
                                iM88407c = i28;
                                iM88407c3 = i34;
                                iM88407c2 = i29;
                                c3 = ':';
                            } catch (ArithmeticException unused) {
                                m88406b(i17, "The number is too large");
                                throw null;
                            }
                        }
                        int i35 = iM88407c;
                        int i36 = iM88407c2;
                        int i37 = iM88407c3;
                        long j7 = ((long) i13) * jAddExact;
                        if (i14 != text.length()) {
                            m88406b(i14, "Expected a designator after the numerical value");
                            throw null;
                        }
                        upperCase = Character.toUpperCase(text.charAt(i14));
                        if (upperCase != ',' || upperCase == '.') {
                            i15 = i14 + 1;
                            if (i15 >= text.length()) {
                                m88406b(i15, "Expected designator 'S' after " + text.charAt(i14));
                                throw null;
                            }
                            i14 = i15;
                            while (i14 < text.length() && '0' <= (cCharAt2 = text.charAt(i14)) && cCharAt2 < ':') {
                                i14++;
                            }
                            i16 = i14 - i15;
                            if (i16 > 9) {
                                m88406b(i15, "Only the nanosecond fractions of a second are supported");
                                throw null;
                            }
                            StringBuilder sb4 = new StringBuilder();
                            String strSubstring = text.substring(i15, i14);
                            AbstractC22676k.m65749i(strSubstring, "substring(...)");
                            sb4.append(strSubstring);
                            sb4.append(AbstractC39421y.m125925J(9 - i16, UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE));
                            String string = sb4.toString();
                            AbstractC35846d.m113779c(10);
                            int i38 = Integer.parseInt(string, 10) * i13;
                            if (text.charAt(i14) != 'S') {
                                m88406b(i14, "Expected the 'S' designator after a fraction");
                                throw null;
                            }
                            if (c14 < '\t' || c14 < 6) {
                                m88406b(i14, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                throw null;
                            }
                            i19 = i38;
                            iM88407c7 = m88407c(j7, i17, 'S');
                            c14 = '\t';
                        } else {
                            if (upperCase != 'D') {
                                if (upperCase == 'H') {
                                    c7 = 7;
                                    if (c14 >= 7 || c14 < 6) {
                                        m88406b(i14, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                        throw null;
                                    }
                                    iM88407c5 = m88407c(j7, i17, 'H');
                                } else if (upperCase != 'M') {
                                    if (upperCase != 'S') {
                                        if (upperCase != 'W') {
                                            if (upperCase != 'Y') {
                                                m88406b(i14, "Expected a designator after the numerical value");
                                                throw null;
                                            }
                                            if (c14 >= 2) {
                                                m88406b(i14, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                                throw null;
                                            }
                                            iM88407c3 = m88407c(j7, i17, 'Y');
                                            c14 = 2;
                                            iM88407c2 = i36;
                                        } else {
                                            if (c14 >= 4) {
                                                m88406b(i14, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                                throw null;
                                            }
                                            iM88407c2 = m88407c(j7, i17, 'W');
                                            c14 = 4;
                                            iM88407c3 = i37;
                                        }
                                        iM88407c = i35;
                                    } else {
                                        if (c14 >= '\t' || c14 < 6) {
                                            m88406b(i14, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                            throw null;
                                        }
                                        iM88407c7 = m88407c(j7, i17, 'S');
                                        iM88407c3 = i37;
                                        iM88407c2 = i36;
                                        iM88407c = i35;
                                        c14 = '\t';
                                    }
                                } else if (c14 >= 6) {
                                    c7 = '\b';
                                    if (c14 >= '\b') {
                                        m88406b(i14, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                        throw null;
                                    }
                                    iM88407c6 = m88407c(j7, i17, 'M');
                                } else {
                                    c7 = 3;
                                    if (c14 >= 3) {
                                        m88406b(i14, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                        throw null;
                                    }
                                    iM88407c4 = m88407c(j7, i17, 'M');
                                }
                                c14 = c7;
                            } else {
                                if (c14 >= 5) {
                                    m88406b(i14, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                    throw null;
                                }
                                iM88407c = m88407c(j7, i17, 'D');
                                c14 = 5;
                                iM88407c3 = i37;
                                iM88407c2 = i36;
                            }
                            i17 = i14 + 1;
                            z4 = true;
                            i18 = i27;
                        }
                        iM88407c3 = i37;
                        iM88407c2 = i36;
                        iM88407c = i35;
                        i17 = i14 + 1;
                        z4 = true;
                        i18 = i27;
                    }
                    m88406b(i14, "A number expected after '" + text.charAt(i14) + '\'');
                    throw null;
                }
                if (('0' <= cCharAt5 && cCharAt5 < ':') || cCharAt5 != 'T') {
                    i14 = i17;
                    i13 = i27;
                    c3 = ':';
                    jAddExact = 0;
                    while (i14 < text.length()) {
                        int i210 = iM88407c;
                        int i211 = iM88407c2;
                        int i39 = iM88407c3;
                        jAddExact = Math.addExact(Math.multiplyExact(jAddExact, 10L), text.charAt(i14) - '0');
                        i14++;
                        iM88407c = i210;
                        iM88407c3 = i39;
                        iM88407c2 = i211;
                        c3 = ':';
                    }
                    int i310 = iM88407c;
                    int i311 = iM88407c2;
                    int i312 = iM88407c3;
                    long j13 = ((long) i13) * jAddExact;
                    if (i14 != text.length()) {
                        m88406b(i14, "Expected a designator after the numerical value");
                        throw null;
                    }
                    upperCase = Character.toUpperCase(text.charAt(i14));
                    if (upperCase != ',') {
                        i15 = i14 + 1;
                        if (i15 >= text.length()) {
                            m88406b(i15, "Expected designator 'S' after " + text.charAt(i14));
                            throw null;
                        }
                        i14 = i15;
                        while (i14 < text.length()) {
                            i14++;
                        }
                        i16 = i14 - i15;
                        if (i16 > 9) {
                            m88406b(i15, "Only the nanosecond fractions of a second are supported");
                            throw null;
                        }
                        StringBuilder sb5 = new StringBuilder();
                        String strSubstring2 = text.substring(i15, i14);
                        AbstractC22676k.m65749i(strSubstring2, "substring(...)");
                        sb5.append(strSubstring2);
                        sb5.append(AbstractC39421y.m125925J(9 - i16, UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE));
                        String string2 = sb5.toString();
                        AbstractC35846d.m113779c(10);
                        int i313 = Integer.parseInt(string2, 10) * i13;
                        if (text.charAt(i14) != 'S') {
                            m88406b(i14, "Expected the 'S' designator after a fraction");
                            throw null;
                        }
                        if (c14 < '\t') {
                        }
                        m88406b(i14, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                        throw null;
                    }
                    i15 = i14 + 1;
                    if (i15 >= text.length()) {
                        m88406b(i15, "Expected designator 'S' after " + text.charAt(i14));
                        throw null;
                    }
                    i14 = i15;
                    while (i14 < text.length()) {
                        i14++;
                    }
                    i16 = i14 - i15;
                    if (i16 > 9) {
                        m88406b(i15, "Only the nanosecond fractions of a second are supported");
                        throw null;
                    }
                    StringBuilder sb6 = new StringBuilder();
                    String strSubstring3 = text.substring(i15, i14);
                    AbstractC22676k.m65749i(strSubstring3, "substring(...)");
                    sb6.append(strSubstring3);
                    sb6.append(AbstractC39421y.m125925J(9 - i16, UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE));
                    String string3 = sb6.toString();
                    AbstractC35846d.m113779c(10);
                    int i314 = Integer.parseInt(string3, 10) * i13;
                    if (text.charAt(i14) != 'S') {
                        m88406b(i14, "Expected the 'S' designator after a fraction");
                        throw null;
                    }
                    if (c14 < '\t') {
                    }
                    m88406b(i14, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                    throw null;
                    i17 = i14 + 1;
                    z4 = true;
                    i18 = i27;
                } else {
                    if (c14 >= 6) {
                        m88406b(i17, "Only one 'T' designator is allowed");
                        throw null;
                    }
                    i17++;
                    i18 = i27;
                    c14 = 6;
                }
            }
        }
        if (c14 == 0) {
            m88406b(i17, "Unexpected end of input; 'P' designator is required");
            throw null;
        }
        if (c14 == 6) {
            m88406b(i17, "Unexpected end of input; at least one time component is required after 'T'");
            throw null;
        }
        long j14 = ((long) iM88407c) + ((long) (iM88407c2 * 7));
        if (-2147483648L > j14 || j14 > 2147483647L) {
            m88406b(0, "The total number of days under 'D' and 'W' designators should fit into an Int");
            throw null;
        }
        int i44 = (int) j14;
        if (!z4) {
            m88406b(0, "At least one component is required, but none were found");
            throw null;
        }
        long j15 = i19;
        long jM99748h0 = AbstractC32073e.m99748h0(iM88407c3, iM88407c4);
        long j16 = 60;
        long j17 = ((((long) iM88407c5) * j16) + ((long) iM88407c6)) * j16;
        long j18 = 1000000000;
        long j19 = (j15 / j18) + j17 + ((long) iM88407c7);
        try {
            long j24 = j15 % j18;
            if (j19 > 0 && j24 < 0) {
                j19--;
                j24 += 1000000000;
            } else if (j19 < 0 && j24 > 0) {
                j19++;
                j24 -= 1000000000;
            }
            long jAddExact2 = Math.addExact(Math.multiplyExact(j19, 1000000000L), j24);
            return jAddExact2 != 0 ? new C29081c(i44, jM99748h0, jAddExact2) : new DatePeriod(jM99748h0, i44);
        } catch (ArithmeticException unused2) {
            StringBuilder sbM30465s = AbstractC11266d.m30465s(iM88407c5, iM88407c6, "The total number of nanoseconds in ", " hours, ", " minutes, ");
            sbM30465s.append(iM88407c7);
            sbM30465s.append(" seconds, and ");
            sbM30465s.append(j15);
            sbM30465s.append(" nanoseconds overflows a Long");
            throw new IllegalArgumentException(sbM30465s.toString());
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m88406b(int i13, String str) {
        throw new DateTimeFormatException(AbstractC11266d.m30456j(i13, "Parse error at char ", ": ", str));
    }

    /* JADX INFO: renamed from: c */
    public static final int m88407c(long j7, int i13, char c3) {
        if (j7 >= -2147483648L && j7 <= 2147483647L) {
            return (int) j7;
        }
        m88406b(i13, "Value " + j7 + " does not fit into an Int, which is required for component '" + c3 + '\'');
        throw null;
    }

    public final InterfaceC37138c serializer() {
        return C35886e.f152808b;
    }
}
