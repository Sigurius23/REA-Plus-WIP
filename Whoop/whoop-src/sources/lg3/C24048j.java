package lg3;

import com.squareup.wire.AbstractC5583n;
import com.whoop.service.network.model.UserSessionDto;
import ng3.EnumC26688a;
import org.joda.time.DateTimeConstants;
import p000.AbstractC11266d;
import p012ab.C0682h0;

/* JADX INFO: renamed from: lg3.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C24048j implements InterfaceC24044f {

    /* JADX INFO: renamed from: y */
    public static final String[] f95040y = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};

    /* JADX INFO: renamed from: z */
    public static final C24048j f95041z = new C24048j("Z", "+HH:MM:ss");

    /* JADX INFO: renamed from: w */
    public final String f95042w;

    /* JADX INFO: renamed from: x */
    public final int f95043x;

    static {
        new C24048j(UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE, "+HH:MM:ss");
    }

    public C24048j(String str, String str2) {
        this.f95042w = str;
        for (int i13 = 0; i13 < 9; i13++) {
            if (f95040y[i13].equals(str2)) {
                this.f95043x = i13;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str2));
    }

    @Override // lg3.InterfaceC24044f
    /* JADX INFO: renamed from: a */
    public final int mo70946a(C24055q c24055q, CharSequence charSequence, int i13) {
        int length = charSequence.length();
        int length2 = this.f95042w.length();
        if (length2 == 0) {
            if (i13 == length) {
                return c24055q.m70974k(EnumC26688a.OFFSET_SECONDS, 0L, i13, i13);
            }
        } else {
            if (i13 == length) {
                return ~i13;
            }
            if (c24055q.m70975l(charSequence, i13, this.f95042w, 0, length2)) {
                return c24055q.m70974k(EnumC26688a.OFFSET_SECONDS, 0L, i13, i13 + length2);
            }
        }
        char cCharAt = charSequence.charAt(i13);
        if (cCharAt == '+' || cCharAt == '-') {
            int i14 = cCharAt == '-' ? -1 : 1;
            int[] iArr = new int[4];
            iArr[0] = i13 + 1;
            if (!m70950c(iArr, 1, charSequence, true)) {
                if (!m70950c(iArr, 2, charSequence, this.f95043x >= 3) && !m70950c(iArr, 3, charSequence, false)) {
                    return c24055q.m70974k(EnumC26688a.OFFSET_SECONDS, ((((long) iArr[2]) * 60) + (((long) iArr[1]) * 3600) + ((long) iArr[3])) * ((long) i14), i13, iArr[0]);
                }
            }
        }
        return length2 == 0 ? c24055q.m70974k(EnumC26688a.OFFSET_SECONDS, 0L, i13, i13 + length2) : ~i13;
    }

    @Override // lg3.InterfaceC24044f
    /* JADX INFO: renamed from: b */
    public final boolean mo70947b(C0682h0 c0682h0, StringBuilder sb4) {
        Long lM1703r = c0682h0.m1703r(EnumC26688a.OFFSET_SECONDS);
        if (lM1703r == null) {
            return false;
        }
        int iM16770b0 = AbstractC5583n.m16770b0(lM1703r.longValue());
        String str = this.f95042w;
        if (iM16770b0 == 0) {
            sb4.append(str);
            return true;
        }
        int iAbs = Math.abs((iM16770b0 / DateTimeConstants.SECONDS_PER_HOUR) % 100);
        int iAbs2 = Math.abs((iM16770b0 / 60) % 60);
        int iAbs3 = Math.abs(iM16770b0 % 60);
        int length = sb4.length();
        sb4.append(iM16770b0 < 0 ? "-" : "+");
        sb4.append((char) ((iAbs / 10) + 48));
        sb4.append((char) ((iAbs % 10) + 48));
        int i13 = this.f95043x;
        if (i13 >= 3 || (i13 >= 1 && iAbs2 > 0)) {
            int i14 = i13 % 2;
            sb4.append(i14 == 0 ? ":" : "");
            sb4.append((char) ((iAbs2 / 10) + 48));
            sb4.append((char) ((iAbs2 % 10) + 48));
            iAbs += iAbs2;
            if (i13 >= 7 || (i13 >= 5 && iAbs3 > 0)) {
                sb4.append(i14 == 0 ? ":" : "");
                sb4.append((char) ((iAbs3 / 10) + 48));
                sb4.append((char) ((iAbs3 % 10) + 48));
                iAbs += iAbs3;
            }
        }
        if (iAbs == 0) {
            sb4.setLength(length);
            sb4.append(str);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002e  */
    /* JADX INFO: renamed from: c */
    public final boolean m70950c(int[] iArr, int i13, CharSequence charSequence, boolean z4) {
        int i14;
        char cCharAt;
        char cCharAt2;
        int i15;
        int i16 = this.f95043x;
        if ((i16 + 3) / 2 < i13) {
            return false;
        }
        int i17 = iArr[0];
        if (i16 % 2 != 0 || i13 <= 1) {
            i14 = i17 + 2;
            if (i14 <= charSequence.length()) {
                int i18 = i17 + 1;
                cCharAt = charSequence.charAt(i17);
                cCharAt2 = charSequence.charAt(i18);
                if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
                    i15 = (cCharAt2 - '0') + ((cCharAt - '0') * 10);
                    if (i15 >= 0 && i15 <= 59) {
                        iArr[i13] = i15;
                        iArr[0] = i14;
                        return false;
                    }
                }
            }
        } else {
            int i19 = i17 + 1;
            if (i19 <= charSequence.length() && charSequence.charAt(i17) == ':') {
                i17 = i19;
                i14 = i17 + 2;
                if (i14 <= charSequence.length()) {
                    int i110 = i17 + 1;
                    cCharAt = charSequence.charAt(i17);
                    cCharAt2 = charSequence.charAt(i110);
                    if (cCharAt >= '0') {
                        i15 = (cCharAt2 - '0') + ((cCharAt - '0') * 10);
                        if (i15 >= 0) {
                            iArr[i13] = i15;
                            iArr[0] = i14;
                            return false;
                        }
                    }
                }
            }
        }
        return z4;
    }

    public final String toString() {
        return AbstractC11266d.m30464r(new StringBuilder("Offset("), f95040y[this.f95043x], ",'", this.f95042w.replace("'", "''"), "')");
    }
}
