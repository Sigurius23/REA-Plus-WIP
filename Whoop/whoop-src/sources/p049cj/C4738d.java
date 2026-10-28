package p049cj;

import androidx.health.platform.client.proto.C1533u;
import java.io.EOFException;
import java.io.IOException;
import live.hms.video.factories.MediaConstraintsFactory;
import ne3.C26607c0;
import ne3.C26616h;
import ne3.C26621j0;
import ne3.C26622k;
import ne3.C26624l;
import p031b9.AbstractC2875y;
import p581we.C37199o;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: cj.d */
/* JADX INFO: loaded from: classes.dex */
public final class C4738d extends AbstractC4737c {

    /* JADX INFO: renamed from: L */
    public static final C26624l f19344L;

    /* JADX INFO: renamed from: M */
    public static final C26624l f19345M;

    /* JADX INFO: renamed from: N */
    public static final C26624l f19346N;

    /* JADX INFO: renamed from: F */
    public final C26621j0 f19347F;

    /* JADX INFO: renamed from: G */
    public final C26616h f19348G;

    /* JADX INFO: renamed from: H */
    public int f19349H;

    /* JADX INFO: renamed from: I */
    public long f19350I;

    /* JADX INFO: renamed from: J */
    public int f19351J;

    /* JADX INFO: renamed from: K */
    public String f19352K;

    static {
        C26622k c26622k = C26624l.f105882z;
        f19344L = C26622k.m79241b("'\\");
        f19345M = C26622k.m79241b("\"\\");
        f19346N = C26622k.m79241b("{}[]:, \n\t\r\f/\\;#=");
        C26622k.m79241b("\n\r");
        C26622k.m79241b("*/");
    }

    public C4738d(C26621j0 c26621j0) {
        this.f19341x = new int[32];
        this.f19342y = new String[32];
        this.f19343z = new int[32];
        this.f19349H = 0;
        this.f19347F = c26621j0;
        this.f19348G = c26621j0.f105872x;
        m14823k(6);
    }

    /* JADX INFO: renamed from: F0 */
    public final char m14827F0() throws C4736b, EOFException {
        int i13;
        C26621j0 c26621j0 = this.f19347F;
        if (!c26621j0.request(1L)) {
            m14826x("Unterminated escape sequence");
            throw null;
        }
        C26616h c26616h = this.f19348G;
        byte b = c26616h.readByte();
        if (b == 10 || b == 34 || b == 39 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            m14826x("Invalid escape sequence: \\" + ((char) b));
            throw null;
        }
        if (!c26621j0.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + m14820b());
        }
        char c3 = 0;
        for (int i14 = 0; i14 < 4; i14++) {
            byte bM79229s = c26616h.m79229s(i14);
            char c7 = (char) (c3 << 4);
            if (bM79229s >= 48 && bM79229s <= 57) {
                i13 = bM79229s - 48;
            } else if (bM79229s >= 97 && bM79229s <= 102) {
                i13 = bM79229s - 87;
            } else {
                if (bM79229s < 65 || bM79229s > 70) {
                    m14826x("\\u".concat(c26616h.m79188M0(4L, AbstractC39397a.f169546a)));
                    throw null;
                }
                i13 = bM79229s - 55;
            }
            c3 = (char) (i13 + c7);
        }
        c26616h.skip(4L);
        return c3;
    }

    /* JADX INFO: renamed from: J */
    public final void m14828J() throws C4736b {
        m14826x("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX INFO: renamed from: M0 */
    public final void m14829M0(C26624l c26624l) throws C4736b, EOFException {
        while (true) {
            long jMo79206f0 = this.f19347F.mo79206f0(c26624l);
            if (jMo79206f0 == -1) {
                m14826x("Unterminated string");
                throw null;
            }
            C26616h c26616h = this.f19348G;
            if (c26616h.m79229s(jMo79206f0) != 92) {
                c26616h.skip(jMo79206f0 + 1);
                return;
            } else {
                c26616h.skip(jMo79206f0 + 1);
                m14827F0();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:148:0x01b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:162:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:164:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:167:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:172:0x01ed A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:173:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:175:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:177:0x0200  */
    /* JADX WARN: Code duplicated, block: B:230:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0115 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x0116  */
    /* JADX WARN: Code duplicated, block: B:92:0x0127  */
    /* JADX WARN: Code duplicated, block: B:94:0x0130  */
    /* JADX INFO: renamed from: T */
    public final int m14830T() throws C4736b, EOFException {
        int i13;
        String str;
        String str2;
        long j7;
        char cM79229s;
        char c3;
        int i14;
        int i15;
        int i16;
        byte bM79229s;
        char c7;
        int[] iArr = this.f19341x;
        int i17 = this.f19340w - 1;
        int i18 = iArr[i17];
        C26616h c26616h = this.f19348G;
        if (i18 == 1) {
            iArr[i17] = 2;
        } else if (i18 == 2) {
            int iM14833o0 = m14833o0(true);
            c26616h.readByte();
            if (iM14833o0 != 44) {
                if (iM14833o0 == 59) {
                    m14828J();
                    throw null;
                }
                if (iM14833o0 == 93) {
                    this.f19349H = 4;
                    return 4;
                }
                m14826x("Unterminated array");
                throw null;
            }
        } else {
            if (i18 == 3 || i18 == 5) {
                iArr[i17] = 4;
                if (i18 == 5) {
                    int iM14833o1 = m14833o0(true);
                    c26616h.readByte();
                    if (iM14833o1 != 44) {
                        if (iM14833o1 == 59) {
                            m14828J();
                            throw null;
                        }
                        if (iM14833o1 == 125) {
                            this.f19349H = 2;
                            return 2;
                        }
                        m14826x("Unterminated object");
                        throw null;
                    }
                }
                int iM14833o2 = m14833o0(true);
                if (iM14833o2 == 34) {
                    c26616h.readByte();
                    this.f19349H = 13;
                    return 13;
                }
                if (iM14833o2 == 39) {
                    c26616h.readByte();
                    m14828J();
                    throw null;
                }
                if (iM14833o2 != 125) {
                    m14828J();
                    throw null;
                }
                if (i18 == 5) {
                    m14826x("Expected name");
                    throw null;
                }
                c26616h.readByte();
                this.f19349H = 2;
                return 2;
            }
            if (i18 == 4) {
                iArr[i17] = 5;
                int iM14833o3 = m14833o0(true);
                c26616h.readByte();
                if (iM14833o3 != 58) {
                    if (iM14833o3 != 61) {
                        m14826x("Expected ':'");
                        throw null;
                    }
                    m14828J();
                    throw null;
                }
            } else if (i18 == 6) {
                iArr[i17] = 7;
            } else {
                if (i18 == 7) {
                    if (m14833o0(false) == -1) {
                        this.f19349H = 18;
                        return 18;
                    }
                    m14828J();
                    throw null;
                }
                if (i18 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int iM14833o4 = m14833o0(true);
        if (iM14833o4 == 34) {
            c26616h.readByte();
            this.f19349H = 9;
            return 9;
        }
        if (iM14833o4 == 39) {
            m14828J();
            throw null;
        }
        if (iM14833o4 != 44 && iM14833o4 != 59) {
            if (iM14833o4 == 91) {
                c26616h.readByte();
                this.f19349H = 3;
                return 3;
            }
            if (iM14833o4 != 93) {
                if (iM14833o4 == 123) {
                    c26616h.readByte();
                    this.f19349H = 1;
                    return 1;
                }
                byte bM79229s2 = c26616h.m79229s(0L);
                C26621j0 c26621j0 = this.f19347F;
                if (bM79229s2 == 116 || bM79229s2 == 84) {
                    i13 = 5;
                    str2 = MediaConstraintsFactory.kValueTrue;
                    str = "TRUE";
                } else {
                    if (bM79229s2 != 102 && bM79229s2 != 70) {
                        if (bM79229s2 == 110 || bM79229s2 == 78) {
                            i13 = 7;
                            str2 = "null";
                            str = "NULL";
                        } else {
                            j7 = 0;
                            i13 = 0;
                        }
                        if (i13 != 0) {
                            return i13;
                        }
                        boolean z4 = true;
                        long j13 = j7;
                        c3 = 0;
                        i14 = 0;
                        boolean z13 = false;
                        while (true) {
                            i15 = i14 + 1;
                            if (c26621j0.request(i15)) {
                                bM79229s = c26616h.m79229s(i14);
                                if (bM79229s != 43) {
                                    if (bM79229s != 69 || bM79229s == 101) {
                                        c7 = 6;
                                        if (c3 != 2 || c3 == 4) {
                                            c3 = 5;
                                            i14 = i15;
                                        } else {
                                            i16 = 0;
                                        }
                                    } else if (bM79229s == 45) {
                                        c7 = 6;
                                        if (c3 == 0) {
                                            c3 = 1;
                                            z13 = true;
                                        } else {
                                            if (c3 != 5) {
                                                i16 = 0;
                                            }
                                            c3 = c7;
                                        }
                                        i14 = i15;
                                    } else if (bM79229s != 46) {
                                        if (bM79229s >= 48 && bM79229s <= 57) {
                                            if (c3 == 1 || c3 == 0) {
                                                c7 = 6;
                                                j13 = -(bM79229s - 48);
                                                c3 = 2;
                                            } else {
                                                if (c3 == 2) {
                                                    if (j13 != j7) {
                                                        long j14 = (10 * j13) - ((long) (bM79229s - 48));
                                                        z4 &= j13 > -922337203685477580L || (j13 == -922337203685477580L && j14 < j13);
                                                        j13 = j14;
                                                    }
                                                } else if (c3 == 3) {
                                                    c3 = 4;
                                                } else {
                                                    c7 = 6;
                                                    if (c3 == 5 || c3 == 6) {
                                                        c3 = 7;
                                                    }
                                                }
                                                c7 = 6;
                                                i14 = i15;
                                            }
                                            i14 = i15;
                                        } else if (!m14832b0(bM79229s)) {
                                        }
                                        i16 = 0;
                                    } else {
                                        c7 = 6;
                                        if (c3 == 2) {
                                            c3 = 3;
                                            i14 = i15;
                                        } else {
                                            i16 = 0;
                                        }
                                    }
                                    if (i16 != 0) {
                                        return i16;
                                    }
                                    if (m14832b0(c26616h.m79229s(j7))) {
                                        m14828J();
                                        throw null;
                                    }
                                    m14826x("Expected value");
                                    throw null;
                                }
                                c7 = 6;
                                if (c3 != 5) {
                                    i16 = 0;
                                    if (i16 != 0) {
                                        return i16;
                                    }
                                    if (m14832b0(c26616h.m79229s(j7))) {
                                        m14826x("Expected value");
                                        throw null;
                                    }
                                    m14828J();
                                    throw null;
                                }
                                c3 = c7;
                                i14 = i15;
                            }
                            if (c3 != 2 && z4 && ((j13 != Long.MIN_VALUE || z13) && (j13 != j7 || !z13))) {
                                if (!z13) {
                                    j13 = -j13;
                                }
                                this.f19350I = j13;
                                c26616h.skip(i14);
                                i16 = 16;
                                this.f19349H = 16;
                            } else if (c3 != 2 || c3 == 4 || c3 == 7) {
                                this.f19351J = i14;
                                i16 = 17;
                                this.f19349H = 17;
                            } else {
                                i16 = 0;
                            }
                            if (i16 != 0) {
                                return i16;
                            }
                            if (m14832b0(c26616h.m79229s(j7))) {
                                m14826x("Expected value");
                                throw null;
                            }
                            m14828J();
                            throw null;
                        }
                    }
                    i13 = 6;
                    str2 = MediaConstraintsFactory.kValueFalse;
                    str = "FALSE";
                }
                int length = str2.length();
                j7 = 0;
                int i19 = 1;
                while (true) {
                    if (i19 >= length) {
                        if (!c26621j0.request(length + 1) || !m14832b0(c26616h.m79229s(length))) {
                            c26616h.skip(length);
                            this.f19349H = i13;
                            break;
                        }
                    } else {
                        int i24 = i19 + 1;
                        if (c26621j0.request(i24) && ((cM79229s = c26616h.m79229s(i19)) == str2.charAt(i19) || cM79229s == str.charAt(i19))) {
                            i19 = i24;
                        }
                    }
                    i13 = 0;
                    break;
                }
                if (i13 != 0) {
                    return i13;
                }
                boolean z14 = true;
                long j15 = j7;
                c3 = 0;
                i14 = 0;
                boolean z15 = false;
                while (true) {
                    i15 = i14 + 1;
                    if (c26621j0.request(i15)) {
                        bM79229s = c26616h.m79229s(i14);
                        if (bM79229s != 43) {
                            if (bM79229s != 69) {
                                c7 = 6;
                                if (c3 != 2) {
                                }
                                c3 = 5;
                                i14 = i15;
                            } else {
                                c7 = 6;
                                if (c3 != 2) {
                                }
                                c3 = 5;
                                i14 = i15;
                            }
                            if (i16 != 0) {
                                return i16;
                            }
                            if (m14832b0(c26616h.m79229s(j7))) {
                                m14826x("Expected value");
                                throw null;
                            }
                            m14828J();
                            throw null;
                        }
                        c7 = 6;
                        if (c3 != 5) {
                            i16 = 0;
                            if (i16 != 0) {
                                return i16;
                            }
                            if (m14832b0(c26616h.m79229s(j7))) {
                                m14826x("Expected value");
                                throw null;
                            }
                            m14828J();
                            throw null;
                        }
                        c3 = c7;
                        i14 = i15;
                    }
                    if (c3 != 2) {
                        if (c3 != 2) {
                        }
                        this.f19351J = i14;
                        i16 = 17;
                        this.f19349H = 17;
                    } else {
                        if (c3 != 2) {
                        }
                        this.f19351J = i14;
                        i16 = 17;
                        this.f19349H = 17;
                    }
                    if (i16 != 0) {
                        return i16;
                    }
                    if (m14832b0(c26616h.m79229s(j7))) {
                        m14826x("Expected value");
                        throw null;
                    }
                    m14828J();
                    throw null;
                }
            }
            if (i18 == 1) {
                c26616h.readByte();
                this.f19349H = 4;
                return 4;
            }
        }
        if (i18 == 1 || i18 == 2) {
            m14828J();
            throw null;
        }
        m14826x("Unexpected value");
        throw null;
    }

    /* JADX INFO: renamed from: a0 */
    public final int m14831a0(String str, C37199o c37199o) {
        int length = ((String[]) c37199o.f159040w).length;
        for (int i13 = 0; i13 < length; i13++) {
            if (str.equals(((String[]) c37199o.f159040w)[i13])) {
                this.f19349H = 0;
                this.f19342y[this.f19340w - 1] = str;
                return i13;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m14832b0(int i13) throws C4736b {
        if (i13 == 9 || i13 == 10 || i13 == 12 || i13 == 13 || i13 == 32) {
            return false;
        }
        if (i13 != 35) {
            if (i13 == 44) {
                return false;
            }
            if (i13 != 47 && i13 != 61) {
                if (i13 == 123 || i13 == 125 || i13 == 58) {
                    return false;
                }
                if (i13 != 59) {
                    switch (i13) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m14828J();
        throw null;
    }

    @Override // p049cj.AbstractC4737c
    public final void beginArray() throws C4736b, EOFException {
        int iM14830T = this.f19349H;
        if (iM14830T == 0) {
            iM14830T = m14830T();
        }
        if (iM14830T == 3) {
            m14823k(1);
            this.f19343z[this.f19340w - 1] = 0;
            this.f19349H = 0;
        } else {
            throw new C4735a("Expected BEGIN_ARRAY but was " + AbstractC2875y.m8287C(mo14822i()) + " at path " + m14820b());
        }
    }

    @Override // p049cj.AbstractC4737c
    public final void beginObject() throws C4736b, EOFException {
        int iM14830T = this.f19349H;
        if (iM14830T == 0) {
            iM14830T = m14830T();
        }
        if (iM14830T == 1) {
            m14823k(3);
            this.f19349H = 0;
        } else {
            throw new C4735a("Expected BEGIN_OBJECT but was " + AbstractC2875y.m8287C(mo14822i()) + " at path " + m14820b());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f19349H = 0;
        this.f19341x[0] = 8;
        this.f19340w = 1;
        this.f19348G.m79200b();
        this.f19347F.close();
    }

    @Override // p049cj.AbstractC4737c
    public final void endArray() throws C4736b, EOFException {
        int iM14830T = this.f19349H;
        if (iM14830T == 0) {
            iM14830T = m14830T();
        }
        if (iM14830T != 4) {
            throw new C4735a("Expected END_ARRAY but was " + AbstractC2875y.m8287C(mo14822i()) + " at path " + m14820b());
        }
        int i13 = this.f19340w;
        this.f19340w = i13 - 1;
        int[] iArr = this.f19343z;
        int i14 = i13 - 2;
        iArr[i14] = iArr[i14] + 1;
        this.f19349H = 0;
    }

    @Override // p049cj.AbstractC4737c
    public final void endObject() throws C4736b, EOFException {
        int iM14830T = this.f19349H;
        if (iM14830T == 0) {
            iM14830T = m14830T();
        }
        if (iM14830T != 2) {
            throw new C4735a("Expected END_OBJECT but was " + AbstractC2875y.m8287C(mo14822i()) + " at path " + m14820b());
        }
        int i13 = this.f19340w;
        int i14 = i13 - 1;
        this.f19340w = i14;
        this.f19342y[i14] = null;
        int[] iArr = this.f19343z;
        int i15 = i13 - 2;
        iArr[i15] = iArr[i15] + 1;
        this.f19349H = 0;
    }

    @Override // p049cj.AbstractC4737c
    /* JADX INFO: renamed from: h */
    public final boolean mo14821h() throws C4736b, EOFException {
        int iM14830T = this.f19349H;
        if (iM14830T == 0) {
            iM14830T = m14830T();
        }
        if (iM14830T == 5) {
            this.f19349H = 0;
            int[] iArr = this.f19343z;
            int i13 = this.f19340w - 1;
            iArr[i13] = iArr[i13] + 1;
            return true;
        }
        if (iM14830T == 6) {
            this.f19349H = 0;
            int[] iArr2 = this.f19343z;
            int i14 = this.f19340w - 1;
            iArr2[i14] = iArr2[i14] + 1;
            return false;
        }
        throw new C4735a("Expected a boolean but was " + AbstractC2875y.m8287C(mo14822i()) + " at path " + m14820b());
    }

    @Override // p049cj.AbstractC4737c
    public final boolean hasNext() throws C4736b, EOFException {
        int iM14830T = this.f19349H;
        if (iM14830T == 0) {
            iM14830T = m14830T();
        }
        return (iM14830T == 2 || iM14830T == 4 || iM14830T == 18) ? false : true;
    }

    @Override // p049cj.AbstractC4737c
    /* JADX INFO: renamed from: i */
    public final int mo14822i() throws C4736b, EOFException {
        int iM14830T = this.f19349H;
        if (iM14830T == 0) {
            iM14830T = m14830T();
        }
        switch (iM14830T) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return 7;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    @Override // p049cj.AbstractC4737c
    /* JADX INFO: renamed from: m */
    public final int mo14824m(C37199o c37199o) throws C4736b, EOFException {
        int iM14830T = this.f19349H;
        if (iM14830T == 0) {
            iM14830T = m14830T();
        }
        if (iM14830T < 12 || iM14830T > 15) {
            return -1;
        }
        if (iM14830T == 15) {
            return m14831a0(this.f19352K, c37199o);
        }
        int iMo79198Y0 = this.f19347F.mo79198Y0((C26607c0) c37199o.f159041x);
        if (iMo79198Y0 != -1) {
            this.f19349H = 0;
            this.f19342y[this.f19340w - 1] = ((String[]) c37199o.f159040w)[iMo79198Y0];
            return iMo79198Y0;
        }
        String str = this.f19342y[this.f19340w - 1];
        String strNextName = nextName();
        int iM14831a0 = m14831a0(strNextName, c37199o);
        if (iM14831a0 == -1) {
            this.f19349H = 15;
            this.f19352K = strNextName;
            this.f19342y[this.f19340w - 1] = str;
        }
        return iM14831a0;
    }

    @Override // p049cj.AbstractC4737c
    public final double nextDouble() throws C4736b, EOFException {
        int iM14830T = this.f19349H;
        if (iM14830T == 0) {
            iM14830T = m14830T();
        }
        if (iM14830T == 16) {
            this.f19349H = 0;
            int[] iArr = this.f19343z;
            int i13 = this.f19340w - 1;
            iArr[i13] = iArr[i13] + 1;
            return this.f19350I;
        }
        if (iM14830T == 17) {
            long j7 = this.f19351J;
            C26616h c26616h = this.f19348G;
            c26616h.getClass();
            this.f19352K = c26616h.m79188M0(j7, AbstractC39397a.f169546a);
        } else if (iM14830T == 9) {
            this.f19352K = m14834p0(f19345M);
        } else if (iM14830T == 8) {
            this.f19352K = m14834p0(f19344L);
        } else if (iM14830T == 10) {
            this.f19352K = m14835x0();
        } else if (iM14830T != 11) {
            throw new C4735a("Expected a double but was " + AbstractC2875y.m8287C(mo14822i()) + " at path " + m14820b());
        }
        this.f19349H = 11;
        try {
            double d3 = Double.parseDouble(this.f19352K);
            if (Double.isNaN(d3) || Double.isInfinite(d3)) {
                StringBuilder sbM8306s = AbstractC2875y.m8306s("JSON forbids NaN and infinities: ", d3, " at path ");
                sbM8306s.append(m14820b());
                throw new C4736b(sbM8306s.toString());
            }
            this.f19352K = null;
            this.f19349H = 0;
            int[] iArr2 = this.f19343z;
            int i14 = this.f19340w - 1;
            iArr2[i14] = iArr2[i14] + 1;
            return d3;
        } catch (NumberFormatException unused) {
            throw new C4735a("Expected a double but was " + this.f19352K + " at path " + m14820b());
        }
    }

    @Override // p049cj.AbstractC4737c
    public final int nextInt() throws C4736b, EOFException {
        int iM14830T = this.f19349H;
        if (iM14830T == 0) {
            iM14830T = m14830T();
        }
        if (iM14830T == 16) {
            long j7 = this.f19350I;
            int i13 = (int) j7;
            if (j7 == i13) {
                this.f19349H = 0;
                int[] iArr = this.f19343z;
                int i14 = this.f19340w - 1;
                iArr[i14] = iArr[i14] + 1;
                return i13;
            }
            throw new C4735a("Expected an int but was " + this.f19350I + " at path " + m14820b());
        }
        if (iM14830T == 17) {
            long j13 = this.f19351J;
            C26616h c26616h = this.f19348G;
            c26616h.getClass();
            this.f19352K = c26616h.m79188M0(j13, AbstractC39397a.f169546a);
        } else if (iM14830T == 9 || iM14830T == 8) {
            String strM14834p0 = iM14830T == 9 ? m14834p0(f19345M) : m14834p0(f19344L);
            this.f19352K = strM14834p0;
            try {
                int i15 = Integer.parseInt(strM14834p0);
                this.f19349H = 0;
                int[] iArr2 = this.f19343z;
                int i16 = this.f19340w - 1;
                iArr2[i16] = iArr2[i16] + 1;
                return i15;
            } catch (NumberFormatException unused) {
            }
        } else if (iM14830T != 11) {
            throw new C4735a("Expected an int but was " + AbstractC2875y.m8287C(mo14822i()) + " at path " + m14820b());
        }
        this.f19349H = 11;
        try {
            double d3 = Double.parseDouble(this.f19352K);
            int i17 = (int) d3;
            if (i17 != d3) {
                throw new C4735a("Expected an int but was " + this.f19352K + " at path " + m14820b());
            }
            this.f19352K = null;
            this.f19349H = 0;
            int[] iArr3 = this.f19343z;
            int i18 = this.f19340w - 1;
            iArr3[i18] = iArr3[i18] + 1;
            return i17;
        } catch (NumberFormatException unused2) {
            throw new C4735a("Expected an int but was " + this.f19352K + " at path " + m14820b());
        }
    }

    public final String nextName() throws C4736b, EOFException {
        String strM14834p0;
        int iM14830T = this.f19349H;
        if (iM14830T == 0) {
            iM14830T = m14830T();
        }
        if (iM14830T == 14) {
            strM14834p0 = m14835x0();
        } else if (iM14830T == 13) {
            strM14834p0 = m14834p0(f19345M);
        } else if (iM14830T == 12) {
            strM14834p0 = m14834p0(f19344L);
        } else {
            if (iM14830T != 15) {
                throw new C4735a("Expected a name but was " + AbstractC2875y.m8287C(mo14822i()) + " at path " + m14820b());
            }
            strM14834p0 = this.f19352K;
        }
        this.f19349H = 0;
        this.f19342y[this.f19340w - 1] = strM14834p0;
        return strM14834p0;
    }

    @Override // p049cj.AbstractC4737c
    public final String nextString() throws C4736b, EOFException {
        String strM79188M0;
        int iM14830T = this.f19349H;
        if (iM14830T == 0) {
            iM14830T = m14830T();
        }
        if (iM14830T == 10) {
            strM79188M0 = m14835x0();
        } else if (iM14830T == 9) {
            strM79188M0 = m14834p0(f19345M);
        } else if (iM14830T == 8) {
            strM79188M0 = m14834p0(f19344L);
        } else if (iM14830T == 11) {
            strM79188M0 = this.f19352K;
            this.f19352K = null;
        } else if (iM14830T == 16) {
            strM79188M0 = Long.toString(this.f19350I);
        } else {
            if (iM14830T != 17) {
                throw new C4735a("Expected a string but was " + AbstractC2875y.m8287C(mo14822i()) + " at path " + m14820b());
            }
            long j7 = this.f19351J;
            C26616h c26616h = this.f19348G;
            c26616h.getClass();
            strM79188M0 = c26616h.m79188M0(j7, AbstractC39397a.f169546a);
        }
        this.f19349H = 0;
        int[] iArr = this.f19343z;
        int i13 = this.f19340w - 1;
        iArr[i13] = iArr[i13] + 1;
        return strM79188M0;
    }

    /* JADX INFO: renamed from: o0 */
    public final int m14833o0(boolean z4) throws C4736b, EOFException {
        int i13 = 0;
        while (true) {
            int i14 = i13 + 1;
            C26621j0 c26621j0 = this.f19347F;
            if (!c26621j0.request(i14)) {
                if (z4) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j7 = i13;
            C26616h c26616h = this.f19348G;
            byte bM79229s = c26616h.m79229s(j7);
            if (bM79229s != 10 && bM79229s != 32 && bM79229s != 13 && bM79229s != 9) {
                c26616h.skip(j7);
                if (bM79229s == 47) {
                    if (c26621j0.request(2L)) {
                        m14828J();
                        throw null;
                    }
                } else if (bM79229s == 35) {
                    m14828J();
                    throw null;
                }
                return bM79229s;
            }
            i13 = i14;
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final String m14834p0(C26624l c26624l) throws C4736b, EOFException {
        StringBuilder sb4 = null;
        while (true) {
            long jMo79206f0 = this.f19347F.mo79206f0(c26624l);
            if (jMo79206f0 == -1) {
                m14826x("Unterminated string");
                throw null;
            }
            C26616h c26616h = this.f19348G;
            if (c26616h.m79229s(jMo79206f0) != 92) {
                if (sb4 == null) {
                    String strM79188M0 = c26616h.m79188M0(jMo79206f0, AbstractC39397a.f169546a);
                    c26616h.readByte();
                    return strM79188M0;
                }
                sb4.append(c26616h.m79188M0(jMo79206f0, AbstractC39397a.f169546a));
                c26616h.readByte();
                return sb4.toString();
            }
            if (sb4 == null) {
                sb4 = new StringBuilder();
            }
            sb4.append(c26616h.m79188M0(jMo79206f0, AbstractC39397a.f169546a));
            c26616h.readByte();
            sb4.append(m14827F0());
        }
    }

    @Override // p049cj.AbstractC4737c
    /* JADX INFO: renamed from: s */
    public final void mo14825s() throws C4736b, EOFException {
        int iM14830T = this.f19349H;
        if (iM14830T == 0) {
            iM14830T = m14830T();
        }
        if (iM14830T == 14) {
            long jMo79206f0 = this.f19347F.mo79206f0(f19346N);
            C26616h c26616h = this.f19348G;
            if (jMo79206f0 == -1) {
                jMo79206f0 = c26616h.f105866x;
            }
            c26616h.skip(jMo79206f0);
        } else if (iM14830T == 13) {
            m14829M0(f19345M);
        } else if (iM14830T == 12) {
            m14829M0(f19344L);
        } else if (iM14830T != 15) {
            throw new C4735a("Expected a name but was " + AbstractC2875y.m8287C(mo14822i()) + " at path " + m14820b());
        }
        this.f19349H = 0;
        this.f19342y[this.f19340w - 1] = "null";
    }

    @Override // p049cj.AbstractC4737c
    public final void skipValue() throws C4736b, EOFException {
        int i13 = 0;
        do {
            int iM14830T = this.f19349H;
            if (iM14830T == 0) {
                iM14830T = m14830T();
            }
            if (iM14830T == 3) {
                m14823k(1);
            } else {
                if (iM14830T == 1) {
                    m14823k(3);
                } else if (iM14830T == 4) {
                    i13--;
                    if (i13 < 0) {
                        throw new C4735a("Expected a value but was " + AbstractC2875y.m8287C(mo14822i()) + " at path " + m14820b());
                    }
                    this.f19340w--;
                } else if (iM14830T == 2) {
                    i13--;
                    if (i13 < 0) {
                        throw new C4735a("Expected a value but was " + AbstractC2875y.m8287C(mo14822i()) + " at path " + m14820b());
                    }
                    this.f19340w--;
                } else {
                    C26616h c26616h = this.f19348G;
                    if (iM14830T == 14 || iM14830T == 10) {
                        long jMo79206f0 = this.f19347F.mo79206f0(f19346N);
                        if (jMo79206f0 == -1) {
                            jMo79206f0 = c26616h.f105866x;
                        }
                        c26616h.skip(jMo79206f0);
                    } else if (iM14830T == 9 || iM14830T == 13) {
                        m14829M0(f19345M);
                    } else if (iM14830T == 8 || iM14830T == 12) {
                        m14829M0(f19344L);
                    } else if (iM14830T == 17) {
                        c26616h.skip(this.f19351J);
                    } else if (iM14830T == 18) {
                        throw new C4735a("Expected a value but was " + AbstractC2875y.m8287C(mo14822i()) + " at path " + m14820b());
                    }
                }
                this.f19349H = 0;
            }
            i13++;
            this.f19349H = 0;
        } while (i13 != 0);
        int[] iArr = this.f19343z;
        int i14 = this.f19340w - 1;
        iArr[i14] = iArr[i14] + 1;
        this.f19342y[i14] = "null";
    }

    public final String toString() {
        return "JsonReader(" + this.f19347F + ")";
    }

    /* JADX INFO: renamed from: x0 */
    public final String m14835x0() {
        long jMo79206f0 = this.f19347F.mo79206f0(f19346N);
        C26616h c26616h = this.f19348G;
        if (jMo79206f0 == -1) {
            return c26616h.m79194S0();
        }
        c26616h.getClass();
        return c26616h.m79188M0(jMo79206f0, AbstractC39397a.f169546a);
    }
}
