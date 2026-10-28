package p441qx;

import androidx.health.platform.client.proto.C1533u;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonEncodingException;
import com.squareup.moshi.JsonReader;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import live.hms.video.factories.MediaConstraintsFactory;
import ne3.C26616h;
import ne3.C26621j0;
import ne3.C26622k;
import ne3.C26624l;
import ne3.InterfaceC26620j;
import p031b9.AbstractC2875y;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: qx.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C30742x extends JsonReader {

    /* JADX INFO: renamed from: M */
    public static final C26624l f126553M;

    /* JADX INFO: renamed from: N */
    public static final C26624l f126554N;

    /* JADX INFO: renamed from: O */
    public static final C26624l f126555O;

    /* JADX INFO: renamed from: P */
    public static final C26624l f126556P;

    /* JADX INFO: renamed from: Q */
    public static final C26624l f126557Q;

    /* JADX INFO: renamed from: G */
    public final InterfaceC26620j f126558G;

    /* JADX INFO: renamed from: H */
    public final C26616h f126559H;

    /* JADX INFO: renamed from: I */
    public int f126560I;

    /* JADX INFO: renamed from: J */
    public long f126561J;

    /* JADX INFO: renamed from: K */
    public int f126562K;

    /* JADX INFO: renamed from: L */
    public String f126563L;

    static {
        C26622k c26622k = C26624l.f105882z;
        f126553M = C26622k.m79241b("'\\");
        f126554N = C26622k.m79241b("\"\\");
        f126555O = C26622k.m79241b("{}[]:, \n\t\r\f/\\;#=");
        f126556P = C26622k.m79241b("\n\r");
        f126557Q = C26622k.m79241b("*/");
    }

    public C30742x(InterfaceC26620j interfaceC26620j) {
        this.f126560I = 0;
        if (interfaceC26620j == null) {
            throw new NullPointerException("source == null");
        }
        this.f126558G = interfaceC26620j;
        this.f126559H = interfaceC26620j.mo79205f();
        m16736x(6);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0152  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:155:0x01e0 A[DONT_INVERT, PHI: r3
      0x01e0: PHI (r3v9 int) = (r3v8 int), (r3v12 int) binds: [B:141:0x01b8, B:147:0x01c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:156:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:169:0x0200  */
    /* JADX WARN: Code duplicated, block: B:171:0x0204  */
    /* JADX WARN: Code duplicated, block: B:174:0x0209  */
    /* JADX WARN: Code duplicated, block: B:179:0x0216 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:180:0x0217  */
    /* JADX WARN: Code duplicated, block: B:182:0x0223  */
    /* JADX WARN: Code duplicated, block: B:184:0x022b  */
    /* JADX WARN: Code duplicated, block: B:194:0x0248  */
    /* JADX WARN: Code duplicated, block: B:203:0x025c  */
    /* JADX WARN: Code duplicated, block: B:205:0x0267  */
    /* JADX WARN: Code duplicated, block: B:245:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:93:0x0134 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:0x0135  */
    /* JADX WARN: Code duplicated, block: B:98:0x0149  */
    /* JADX INFO: renamed from: F0 */
    public final int m94404F0() throws EOFException, JsonEncodingException {
        int i13;
        int iM94408T0;
        int i14;
        int i15;
        String str;
        String str2;
        long j7;
        char cM79229s;
        int i16;
        int i17;
        int i18;
        long j13;
        int i19;
        long j14;
        int i24;
        int i25;
        byte bM79229s;
        int i26;
        int[] iArr = this.f22078x;
        int i27 = 1;
        int i28 = this.f22077w - 1;
        int i29 = iArr[i28];
        InterfaceC26620j interfaceC26620j = this.f126558G;
        long j15 = 0;
        C26616h c26616h = this.f126559H;
        if (i29 == 1) {
            iArr[i28] = 2;
        } else if (i29 == 2) {
            int iM94408T1 = m94408T0(true);
            c26616h.readByte();
            if (iM94408T1 != 44) {
                if (iM94408T1 != 59) {
                    if (iM94408T1 == 93) {
                        this.f126560I = 4;
                        return 4;
                    }
                    m16733o0("Unterminated array");
                    throw null;
                }
                m94413x0();
            }
        } else {
            if (i29 == 3 || i29 == 5) {
                iArr[i28] = 4;
                if (i29 == 5) {
                    int iM94408T2 = m94408T0(true);
                    c26616h.readByte();
                    if (iM94408T2 != 44) {
                        if (iM94408T2 != 59) {
                            if (iM94408T2 == 125) {
                                this.f126560I = 2;
                                return 2;
                            }
                            m16733o0("Unterminated object");
                            throw null;
                        }
                        m94413x0();
                    }
                }
                int iM94408T3 = m94408T0(true);
                if (iM94408T3 == 34) {
                    c26616h.readByte();
                    this.f126560I = 13;
                    return 13;
                }
                if (iM94408T3 == 39) {
                    c26616h.readByte();
                    m94413x0();
                    this.f126560I = 12;
                    return 12;
                }
                if (iM94408T3 != 125) {
                    m94413x0();
                    if (m94407S0((char) iM94408T3)) {
                        this.f126560I = 14;
                        return 14;
                    }
                    m16733o0("Expected name");
                    throw null;
                }
                if (i29 == 5) {
                    m16733o0("Expected name");
                    throw null;
                }
                c26616h.readByte();
                this.f126560I = 2;
                return 2;
            }
            if (i29 != 4) {
                if (i29 == 6) {
                    iArr[i28] = 7;
                } else if (i29 == 7) {
                    i13 = 0;
                    if (m94408T0(false) == -1) {
                        this.f126560I = 18;
                        return 18;
                    }
                    m94413x0();
                } else {
                    i13 = 0;
                    if (i29 == 9) {
                        throw null;
                    }
                    if (i29 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                iM94408T0 = m94408T0(true);
                if (iM94408T0 != 34) {
                    c26616h.readByte();
                    this.f126560I = 9;
                    return 9;
                }
                if (iM94408T0 != 39) {
                    m94413x0();
                    c26616h.readByte();
                    this.f126560I = 8;
                    return 8;
                }
                if (iM94408T0 != 44 || iM94408T0 == 59) {
                    i14 = 1;
                } else {
                    if (iM94408T0 == 91) {
                        c26616h.readByte();
                        this.f126560I = 3;
                        return 3;
                    }
                    if (iM94408T0 != 93) {
                        if (iM94408T0 == 123) {
                            c26616h.readByte();
                            this.f126560I = 1;
                            return 1;
                        }
                        byte bM79229s2 = c26616h.m79229s(0L);
                        if (bM79229s2 == 116 || bM79229s2 == 84) {
                            i15 = 5;
                            str2 = MediaConstraintsFactory.kValueTrue;
                            str = "TRUE";
                        } else {
                            if (bM79229s2 != 102 && bM79229s2 != 70) {
                                if (bM79229s2 == 110 || bM79229s2 == 78) {
                                    i15 = 7;
                                    str2 = "null";
                                    str = "NULL";
                                } else {
                                    i15 = i13;
                                    j7 = 0;
                                }
                                if (i15 != 0) {
                                    return i15;
                                }
                                i16 = i13;
                                i17 = i16;
                                int i34 = i17;
                                i18 = 1;
                                j13 = j7;
                                while (true) {
                                    i19 = i17 + 1;
                                    j14 = j13;
                                    if (interfaceC26620j.request(i19)) {
                                        bM79229s = c26616h.m79229s(i17);
                                        if (bM79229s != 43) {
                                            if (bM79229s != 69 || bM79229s == 101) {
                                                if (i16 != 2 || i16 == 4) {
                                                    i16 = 5;
                                                    i17 = i19;
                                                    j13 = j14;
                                                    i27 = 1;
                                                } else {
                                                    i25 = i13;
                                                }
                                            } else if (bM79229s == 45) {
                                                i26 = 6;
                                                if (i16 == 0) {
                                                    i16 = 1;
                                                    i34 = 1;
                                                } else {
                                                    if (i16 != 5) {
                                                        i25 = i13;
                                                    }
                                                    i16 = i26;
                                                }
                                                i17 = i19;
                                                j13 = j14;
                                                i27 = 1;
                                            } else if (bM79229s != 46) {
                                                if (bM79229s >= 48 && bM79229s <= 57) {
                                                    if (i16 == i27 || i16 == 0) {
                                                        j14 = -(bM79229s - 48);
                                                        i16 = 2;
                                                    } else if (i16 == 2) {
                                                        if (j14 != j7) {
                                                            long j16 = (10 * j14) - ((long) (bM79229s - 48));
                                                            i18 &= (j14 > -922337203685477580L || (j14 == -922337203685477580L && j16 < j14)) ? 1 : i13;
                                                            j14 = j16;
                                                        }
                                                    } else if (i16 == 3) {
                                                        i16 = 4;
                                                    } else if (i16 == 5 || i16 == 6) {
                                                        i16 = 7;
                                                    }
                                                    i17 = i19;
                                                    j13 = j14;
                                                    i27 = 1;
                                                } else if (!m94407S0(bM79229s)) {
                                                }
                                                i25 = i13;
                                            } else if (i16 == 2) {
                                                i16 = 3;
                                                i17 = i19;
                                                j13 = j14;
                                                i27 = 1;
                                            } else {
                                                i25 = i13;
                                            }
                                            if (i25 != 0) {
                                                return i25;
                                            }
                                            if (m94407S0(c26616h.m79229s(j7))) {
                                                m16733o0("Expected value");
                                                throw null;
                                            }
                                            m94413x0();
                                            this.f126560I = 10;
                                            return 10;
                                        }
                                        i26 = 6;
                                        if (i16 != 5) {
                                            i25 = i13;
                                            if (i25 != 0) {
                                                return i25;
                                            }
                                            if (m94407S0(c26616h.m79229s(j7))) {
                                                m16733o0("Expected value");
                                                throw null;
                                            }
                                            m94413x0();
                                            this.f126560I = 10;
                                            return 10;
                                        }
                                        i16 = i26;
                                        i17 = i19;
                                        j13 = j14;
                                        i27 = 1;
                                    }
                                    i24 = 2;
                                    if (i16 != 2) {
                                        if (i16 != i24 || i16 == 4 || i16 == 7) {
                                            this.f126562K = i17;
                                            i25 = 17;
                                            this.f126560I = 17;
                                        } else {
                                            i25 = i13;
                                        }
                                    } else if (i18 != 0 || ((j14 == Long.MIN_VALUE && i34 == 0) || (j14 == j7 && i34 != 0))) {
                                        i24 = 2;
                                        if (i16 != i24) {
                                        }
                                        this.f126562K = i17;
                                        i25 = 17;
                                        this.f126560I = 17;
                                    } else {
                                        this.f126561J = i34 != 0 ? j14 : -j14;
                                        c26616h.skip(i17);
                                        i25 = 16;
                                        this.f126560I = 16;
                                    }
                                    if (i25 != 0) {
                                        return i25;
                                    }
                                    if (m94407S0(c26616h.m79229s(j7))) {
                                        m16733o0("Expected value");
                                        throw null;
                                    }
                                    m94413x0();
                                    this.f126560I = 10;
                                    return 10;
                                }
                            }
                            i15 = 6;
                            str2 = MediaConstraintsFactory.kValueFalse;
                            str = "FALSE";
                        }
                        int length = str2.length();
                        int i35 = 1;
                        while (true) {
                            if (i35 >= length) {
                                j7 = j15;
                                if (!interfaceC26620j.request(length + 1) || !m94407S0(c26616h.m79229s(length))) {
                                    c26616h.skip(length);
                                    this.f126560I = i15;
                                    break;
                                }
                            } else {
                                int i36 = i35 + 1;
                                j7 = j15;
                                if (interfaceC26620j.request(i36) && ((cM79229s = c26616h.m79229s(i35)) == str2.charAt(i35) || cM79229s == str.charAt(i35))) {
                                    i35 = i36;
                                    j15 = j7;
                                }
                            }
                            i15 = i13;
                            break;
                        }
                        if (i15 != 0) {
                            return i15;
                        }
                        i16 = i13;
                        i17 = i16;
                        int i37 = i17;
                        i18 = 1;
                        j13 = j7;
                        while (true) {
                            i19 = i17 + 1;
                            j14 = j13;
                            if (interfaceC26620j.request(i19)) {
                                bM79229s = c26616h.m79229s(i17);
                                if (bM79229s != 43) {
                                    if (bM79229s != 69) {
                                        if (i16 != 2) {
                                        }
                                        i16 = 5;
                                        i17 = i19;
                                        j13 = j14;
                                        i27 = 1;
                                    } else {
                                        if (i16 != 2) {
                                        }
                                        i16 = 5;
                                        i17 = i19;
                                        j13 = j14;
                                        i27 = 1;
                                    }
                                    if (i25 != 0) {
                                        return i25;
                                    }
                                    if (m94407S0(c26616h.m79229s(j7))) {
                                        m16733o0("Expected value");
                                        throw null;
                                    }
                                    m94413x0();
                                    this.f126560I = 10;
                                    return 10;
                                }
                                i26 = 6;
                                if (i16 != 5) {
                                    i25 = i13;
                                    if (i25 != 0) {
                                        return i25;
                                    }
                                    if (m94407S0(c26616h.m79229s(j7))) {
                                        m16733o0("Expected value");
                                        throw null;
                                    }
                                    m94413x0();
                                    this.f126560I = 10;
                                    return 10;
                                }
                                i16 = i26;
                                i17 = i19;
                                j13 = j14;
                                i27 = 1;
                            }
                            i24 = 2;
                            if (i16 != 2) {
                                if (i16 != i24) {
                                }
                                this.f126562K = i17;
                                i25 = 17;
                                this.f126560I = 17;
                            } else {
                                if (i18 != 0) {
                                }
                                i24 = 2;
                                if (i16 != i24) {
                                }
                                this.f126562K = i17;
                                i25 = 17;
                                this.f126560I = 17;
                            }
                            if (i25 != 0) {
                                return i25;
                            }
                            if (m94407S0(c26616h.m79229s(j7))) {
                                m16733o0("Expected value");
                                throw null;
                            }
                            m94413x0();
                            this.f126560I = 10;
                            return 10;
                        }
                    }
                    i14 = 1;
                    if (i29 == 1) {
                        c26616h.readByte();
                        this.f126560I = 4;
                        return 4;
                    }
                }
                if (i29 == i14 && i29 != 2) {
                    m16733o0("Unexpected value");
                    throw null;
                }
                m94413x0();
                this.f126560I = 7;
                return 7;
            }
            iArr[i28] = 5;
            int iM94408T4 = m94408T0(true);
            c26616h.readByte();
            if (iM94408T4 != 58) {
                if (iM94408T4 != 61) {
                    m16733o0("Expected ':'");
                    throw null;
                }
                m94413x0();
                if (interfaceC26620j.request(1L) && c26616h.m79229s(0L) == 62) {
                    c26616h.readByte();
                }
            }
        }
        i13 = 0;
        iM94408T0 = m94408T0(true);
        if (iM94408T0 != 34) {
            c26616h.readByte();
            this.f126560I = 9;
            return 9;
        }
        if (iM94408T0 != 39) {
            m94413x0();
            c26616h.readByte();
            this.f126560I = 8;
            return 8;
        }
        if (iM94408T0 != 44) {
            i14 = 1;
        } else {
            i14 = 1;
        }
        if (i29 == i14) {
        }
        m94413x0();
        this.f126560I = 7;
        return 7;
    }

    /* JADX INFO: renamed from: M0 */
    public final int m94405M0(String str, C30740v c30740v) {
        int length = c30740v.f126540a.length;
        for (int i13 = 0; i13 < length; i13++) {
            if (str.equals(c30740v.f126540a[i13])) {
                this.f126560I = 0;
                this.f22079y[this.f22077w - 1] = str;
                return i13;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: R0 */
    public final int m94406R0(String str, C30740v c30740v) {
        int length = c30740v.f126540a.length;
        for (int i13 = 0; i13 < length; i13++) {
            if (str.equals(c30740v.f126540a[i13])) {
                this.f126560I = 0;
                int[] iArr = this.f22080z;
                int i14 = this.f22077w - 1;
                iArr[i14] = iArr[i14] + 1;
                return i13;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: S0 */
    public final boolean m94407S0(int i13) throws JsonEncodingException {
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
        m94413x0();
        return false;
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: T */
    public final int mo16725T(C30740v c30740v) throws EOFException, JsonEncodingException {
        int iM94404F0 = this.f126560I;
        if (iM94404F0 == 0) {
            iM94404F0 = m94404F0();
        }
        if (iM94404F0 < 12 || iM94404F0 > 15) {
            return -1;
        }
        if (iM94404F0 == 15) {
            return m94405M0(this.f126563L, c30740v);
        }
        int iMo79198Y0 = this.f126558G.mo79198Y0(c30740v.f126541b);
        if (iMo79198Y0 != -1) {
            this.f126560I = 0;
            this.f22079y[this.f22077w - 1] = c30740v.f126540a[iMo79198Y0];
            return iMo79198Y0;
        }
        String str = this.f22079y[this.f22077w - 1];
        String strNextName = nextName();
        int iM94405M0 = m94405M0(strNextName, c30740v);
        if (iM94405M0 == -1) {
            this.f126560I = 15;
            this.f126563L = strNextName;
            this.f22079y[this.f22077w - 1] = str;
        }
        return iM94405M0;
    }

    /* JADX INFO: renamed from: T0 */
    public final int m94408T0(boolean z4) throws EOFException, JsonEncodingException {
        InterfaceC26620j interfaceC26620j;
        long j7;
        C26616h c26616h;
        byte bM79229s;
        while (true) {
            int i13 = 0;
            while (true) {
                int i14 = i13 + 1;
                interfaceC26620j = this.f126558G;
                if (!interfaceC26620j.request(i14)) {
                    if (z4) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                j7 = i13;
                c26616h = this.f126559H;
                bM79229s = c26616h.m79229s(j7);
                if (bM79229s == 10 || bM79229s == 32 || bM79229s == 13 || bM79229s == 9) {
                    i13 = i14;
                }
            }
            c26616h.skip(j7);
            C26624l c26624l = f126556P;
            if (bM79229s == 47) {
                if (interfaceC26620j.request(2L)) {
                    m94413x0();
                    byte bM79229s2 = c26616h.m79229s(1L);
                    if (bM79229s2 == 42) {
                        c26616h.readByte();
                        c26616h.readByte();
                        C26624l c26624l2 = f126557Q;
                        long jMo79184I0 = interfaceC26620j.mo79184I0(c26624l2);
                        boolean z13 = jMo79184I0 != -1;
                        c26616h.skip(z13 ? jMo79184I0 + ((long) c26624l2.f105883w.length) : c26616h.f105866x);
                        if (!z13) {
                            m16733o0("Unterminated comment");
                            throw null;
                        }
                    } else if (bM79229s2 == 47) {
                        c26616h.readByte();
                        c26616h.readByte();
                        long jMo79206f0 = interfaceC26620j.mo79206f0(c26624l);
                        c26616h.skip(jMo79206f0 != -1 ? jMo79206f0 + 1 : c26616h.f105866x);
                    }
                }
                return bM79229s;
            }
            if (bM79229s != 35) {
                return bM79229s;
            }
            m94413x0();
            long jMo79206f1 = interfaceC26620j.mo79206f0(c26624l);
            c26616h.skip(jMo79206f1 != -1 ? jMo79206f1 + 1 : c26616h.f105866x);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final String m94409X0(C26624l c26624l) throws EOFException, JsonEncodingException {
        StringBuilder sb4 = null;
        while (true) {
            long jMo79206f0 = this.f126558G.mo79206f0(c26624l);
            if (jMo79206f0 == -1) {
                m16733o0("Unterminated string");
                throw null;
            }
            C26616h c26616h = this.f126559H;
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
            sb4.append(m94411k1());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: a0 */
    public final int mo16726a0(C30740v c30740v) throws EOFException, JsonEncodingException {
        int iM94404F0 = this.f126560I;
        if (iM94404F0 == 0) {
            iM94404F0 = m94404F0();
        }
        if (iM94404F0 < 8 || iM94404F0 > 11) {
            return -1;
        }
        if (iM94404F0 == 11) {
            return m94406R0(this.f126563L, c30740v);
        }
        int iMo79198Y0 = this.f126558G.mo79198Y0(c30740v.f126541b);
        if (iMo79198Y0 != -1) {
            this.f126560I = 0;
            int[] iArr = this.f22080z;
            int i13 = this.f22077w - 1;
            iArr[i13] = iArr[i13] + 1;
            return iMo79198Y0;
        }
        String strNextString = nextString();
        int iM94406R0 = m94406R0(strNextString, c30740v);
        if (iM94406R0 == -1) {
            this.f126560I = 11;
            this.f126563L = strNextString;
            int[] iArr2 = this.f22080z;
            int i14 = this.f22077w - 1;
            iArr2[i14] = iArr2[i14] - 1;
        }
        return iM94406R0;
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: b0 */
    public final void mo16728b0() throws EOFException, JsonEncodingException {
        if (this.f22076F) {
            EnumC30741w enumC30741wMo16731k = mo16731k();
            nextName();
            throw new JsonDataException("Cannot skip unexpected " + enumC30741wMo16731k + " at " + m16727b());
        }
        int iM94404F0 = this.f126560I;
        if (iM94404F0 == 0) {
            iM94404F0 = m94404F0();
        }
        if (iM94404F0 == 14) {
            long jMo79206f0 = this.f126558G.mo79206f0(f126555O);
            C26616h c26616h = this.f126559H;
            if (jMo79206f0 == -1) {
                jMo79206f0 = c26616h.f105866x;
            }
            c26616h.skip(jMo79206f0);
        } else if (iM94404F0 == 13) {
            m94412l1(f126554N);
        } else if (iM94404F0 == 12) {
            m94412l1(f126553M);
        } else if (iM94404F0 != 15) {
            throw new JsonDataException("Expected a name but was " + mo16731k() + " at path " + m16727b());
        }
        this.f126560I = 0;
        this.f22079y[this.f22077w - 1] = "null";
    }

    @Override // com.squareup.moshi.JsonReader
    public final void beginArray() throws EOFException, JsonEncodingException {
        int iM94404F0 = this.f126560I;
        if (iM94404F0 == 0) {
            iM94404F0 = m94404F0();
        }
        if (iM94404F0 == 3) {
            m16736x(1);
            this.f22080z[this.f22077w - 1] = 0;
            this.f126560I = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + mo16731k() + " at path " + m16727b());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final void beginObject() throws EOFException, JsonEncodingException {
        int iM94404F0 = this.f126560I;
        if (iM94404F0 == 0) {
            iM94404F0 = m94404F0();
        }
        if (iM94404F0 == 1) {
            m16736x(3);
            this.f126560I = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_OBJECT but was " + mo16731k() + " at path " + m16727b());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f126560I = 0;
        this.f22078x[0] = 8;
        this.f22077w = 1;
        this.f126559H.m79200b();
        this.f126558G.close();
    }

    @Override // com.squareup.moshi.JsonReader
    public final void endArray() throws EOFException, JsonEncodingException {
        int iM94404F0 = this.f126560I;
        if (iM94404F0 == 0) {
            iM94404F0 = m94404F0();
        }
        if (iM94404F0 != 4) {
            throw new JsonDataException("Expected END_ARRAY but was " + mo16731k() + " at path " + m16727b());
        }
        int i13 = this.f22077w;
        this.f22077w = i13 - 1;
        int[] iArr = this.f22080z;
        int i14 = i13 - 2;
        iArr[i14] = iArr[i14] + 1;
        this.f126560I = 0;
    }

    @Override // com.squareup.moshi.JsonReader
    public final void endObject() throws EOFException, JsonEncodingException {
        int iM94404F0 = this.f126560I;
        if (iM94404F0 == 0) {
            iM94404F0 = m94404F0();
        }
        if (iM94404F0 != 2) {
            throw new JsonDataException("Expected END_OBJECT but was " + mo16731k() + " at path " + m16727b());
        }
        int i13 = this.f22077w;
        int i14 = i13 - 1;
        this.f22077w = i14;
        this.f22079y[i14] = null;
        int[] iArr = this.f22080z;
        int i15 = i13 - 2;
        iArr[i15] = iArr[i15] + 1;
        this.f126560I = 0;
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: h */
    public final boolean mo16729h() throws EOFException, JsonEncodingException {
        int iM94404F0 = this.f126560I;
        if (iM94404F0 == 0) {
            iM94404F0 = m94404F0();
        }
        if (iM94404F0 == 5) {
            this.f126560I = 0;
            int[] iArr = this.f22080z;
            int i13 = this.f22077w - 1;
            iArr[i13] = iArr[i13] + 1;
            return true;
        }
        if (iM94404F0 == 6) {
            this.f126560I = 0;
            int[] iArr2 = this.f22080z;
            int i14 = this.f22077w - 1;
            iArr2[i14] = iArr2[i14] + 1;
            return false;
        }
        throw new JsonDataException("Expected a boolean but was " + mo16731k() + " at path " + m16727b());
    }

    @Override // com.squareup.moshi.JsonReader
    public final boolean hasNext() throws EOFException, JsonEncodingException {
        int iM94404F0 = this.f126560I;
        if (iM94404F0 == 0) {
            iM94404F0 = m94404F0();
        }
        return (iM94404F0 == 2 || iM94404F0 == 4 || iM94404F0 == 18) ? false : true;
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: i */
    public final void mo16730i() throws EOFException, JsonEncodingException {
        int iM94404F0 = this.f126560I;
        if (iM94404F0 == 0) {
            iM94404F0 = m94404F0();
        }
        if (iM94404F0 == 7) {
            this.f126560I = 0;
            int[] iArr = this.f22080z;
            int i13 = this.f22077w - 1;
            iArr[i13] = iArr[i13] + 1;
            return;
        }
        throw new JsonDataException("Expected null but was " + mo16731k() + " at path " + m16727b());
    }

    /* JADX INFO: renamed from: j1 */
    public final String m94410j1() {
        long jMo79206f0 = this.f126558G.mo79206f0(f126555O);
        C26616h c26616h = this.f126559H;
        if (jMo79206f0 == -1) {
            return c26616h.m79194S0();
        }
        c26616h.getClass();
        return c26616h.m79188M0(jMo79206f0, AbstractC39397a.f169546a);
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: k */
    public final EnumC30741w mo16731k() throws EOFException, JsonEncodingException {
        int iM94404F0 = this.f126560I;
        if (iM94404F0 == 0) {
            iM94404F0 = m94404F0();
        }
        switch (iM94404F0) {
            case 1:
                return EnumC30741w.f126551y;
            case 2:
                return EnumC30741w.f126552z;
            case 3:
                return EnumC30741w.f126549w;
            case 4:
                return EnumC30741w.f126550x;
            case 5:
            case 6:
                return EnumC30741w.f126545H;
            case 7:
                return EnumC30741w.f126546I;
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumC30741w.f126543F;
            case 12:
            case 13:
            case 14:
            case 15:
                return EnumC30741w.f126542E;
            case 16:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return EnumC30741w.f126544G;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return EnumC30741w.f126547J;
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final char m94411k1() throws EOFException, JsonEncodingException {
        int i13;
        InterfaceC26620j interfaceC26620j = this.f126558G;
        if (!interfaceC26620j.request(1L)) {
            m16733o0("Unterminated escape sequence");
            throw null;
        }
        C26616h c26616h = this.f126559H;
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
            if (this.f22075E) {
                return (char) b;
            }
            m16733o0("Invalid escape sequence: \\" + ((char) b));
            throw null;
        }
        if (!interfaceC26620j.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + m16727b());
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
                    m16733o0("\\u".concat(c26616h.m79188M0(4L, AbstractC39397a.f169546a)));
                    throw null;
                }
                i13 = bM79229s - 55;
            }
            c3 = (char) (i13 + c7);
        }
        c26616h.skip(4L);
        return c3;
    }

    /* JADX INFO: renamed from: l1 */
    public final void m94412l1(C26624l c26624l) throws EOFException, JsonEncodingException {
        while (true) {
            long jMo79206f0 = this.f126558G.mo79206f0(c26624l);
            if (jMo79206f0 == -1) {
                m16733o0("Unterminated string");
                throw null;
            }
            C26616h c26616h = this.f126559H;
            if (c26616h.m79229s(jMo79206f0) != 92) {
                c26616h.skip(jMo79206f0 + 1);
                return;
            } else {
                c26616h.skip(jMo79206f0 + 1);
                m94411k1();
            }
        }
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: m */
    public final JsonReader mo16732m() {
        return new C30742x(this);
    }

    @Override // com.squareup.moshi.JsonReader
    public final double nextDouble() throws EOFException, JsonEncodingException {
        int iM94404F0 = this.f126560I;
        if (iM94404F0 == 0) {
            iM94404F0 = m94404F0();
        }
        if (iM94404F0 == 16) {
            this.f126560I = 0;
            int[] iArr = this.f22080z;
            int i13 = this.f22077w - 1;
            iArr[i13] = iArr[i13] + 1;
            return this.f126561J;
        }
        if (iM94404F0 == 17) {
            long j7 = this.f126562K;
            C26616h c26616h = this.f126559H;
            c26616h.getClass();
            this.f126563L = c26616h.m79188M0(j7, AbstractC39397a.f169546a);
        } else if (iM94404F0 == 9) {
            this.f126563L = m94409X0(f126554N);
        } else if (iM94404F0 == 8) {
            this.f126563L = m94409X0(f126553M);
        } else if (iM94404F0 == 10) {
            this.f126563L = m94410j1();
        } else if (iM94404F0 != 11) {
            throw new JsonDataException("Expected a double but was " + mo16731k() + " at path " + m16727b());
        }
        this.f126560I = 11;
        try {
            double d3 = Double.parseDouble(this.f126563L);
            if (!this.f22075E && (Double.isNaN(d3) || Double.isInfinite(d3))) {
                StringBuilder sbM8306s = AbstractC2875y.m8306s("JSON forbids NaN and infinities: ", d3, " at path ");
                sbM8306s.append(m16727b());
                throw new JsonEncodingException(sbM8306s.toString());
            }
            this.f126563L = null;
            this.f126560I = 0;
            int[] iArr2 = this.f22080z;
            int i14 = this.f22077w - 1;
            iArr2[i14] = iArr2[i14] + 1;
            return d3;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.f126563L + " at path " + m16727b());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final int nextInt() throws EOFException, JsonEncodingException {
        int iM94404F0 = this.f126560I;
        if (iM94404F0 == 0) {
            iM94404F0 = m94404F0();
        }
        if (iM94404F0 == 16) {
            long j7 = this.f126561J;
            int i13 = (int) j7;
            if (j7 == i13) {
                this.f126560I = 0;
                int[] iArr = this.f22080z;
                int i14 = this.f22077w - 1;
                iArr[i14] = iArr[i14] + 1;
                return i13;
            }
            throw new JsonDataException("Expected an int but was " + this.f126561J + " at path " + m16727b());
        }
        if (iM94404F0 == 17) {
            long j13 = this.f126562K;
            C26616h c26616h = this.f126559H;
            c26616h.getClass();
            this.f126563L = c26616h.m79188M0(j13, AbstractC39397a.f169546a);
        } else if (iM94404F0 == 9 || iM94404F0 == 8) {
            String strM94409X0 = iM94404F0 == 9 ? m94409X0(f126554N) : m94409X0(f126553M);
            this.f126563L = strM94409X0;
            try {
                int i15 = Integer.parseInt(strM94409X0);
                this.f126560I = 0;
                int[] iArr2 = this.f22080z;
                int i16 = this.f22077w - 1;
                iArr2[i16] = iArr2[i16] + 1;
                return i15;
            } catch (NumberFormatException unused) {
            }
        } else if (iM94404F0 != 11) {
            throw new JsonDataException("Expected an int but was " + mo16731k() + " at path " + m16727b());
        }
        this.f126560I = 11;
        try {
            double d3 = Double.parseDouble(this.f126563L);
            int i17 = (int) d3;
            if (i17 != d3) {
                throw new JsonDataException("Expected an int but was " + this.f126563L + " at path " + m16727b());
            }
            this.f126563L = null;
            this.f126560I = 0;
            int[] iArr3 = this.f22080z;
            int i18 = this.f22077w - 1;
            iArr3[i18] = iArr3[i18] + 1;
            return i17;
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.f126563L + " at path " + m16727b());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final long nextLong() throws EOFException, JsonEncodingException {
        int iM94404F0 = this.f126560I;
        if (iM94404F0 == 0) {
            iM94404F0 = m94404F0();
        }
        if (iM94404F0 == 16) {
            this.f126560I = 0;
            int[] iArr = this.f22080z;
            int i13 = this.f22077w - 1;
            iArr[i13] = iArr[i13] + 1;
            return this.f126561J;
        }
        if (iM94404F0 == 17) {
            long j7 = this.f126562K;
            C26616h c26616h = this.f126559H;
            c26616h.getClass();
            this.f126563L = c26616h.m79188M0(j7, AbstractC39397a.f169546a);
        } else if (iM94404F0 == 9 || iM94404F0 == 8) {
            String strM94409X0 = iM94404F0 == 9 ? m94409X0(f126554N) : m94409X0(f126553M);
            this.f126563L = strM94409X0;
            try {
                long j13 = Long.parseLong(strM94409X0);
                this.f126560I = 0;
                int[] iArr2 = this.f22080z;
                int i14 = this.f22077w - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return j13;
            } catch (NumberFormatException unused) {
            }
        } else if (iM94404F0 != 11) {
            throw new JsonDataException("Expected a long but was " + mo16731k() + " at path " + m16727b());
        }
        this.f126560I = 11;
        try {
            long jLongValueExact = new BigDecimal(this.f126563L).longValueExact();
            this.f126563L = null;
            this.f126560I = 0;
            int[] iArr3 = this.f22080z;
            int i15 = this.f22077w - 1;
            iArr3[i15] = iArr3[i15] + 1;
            return jLongValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new JsonDataException("Expected a long but was " + this.f126563L + " at path " + m16727b());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final String nextName() throws EOFException, JsonEncodingException {
        String strM94409X0;
        int iM94404F0 = this.f126560I;
        if (iM94404F0 == 0) {
            iM94404F0 = m94404F0();
        }
        if (iM94404F0 == 14) {
            strM94409X0 = m94410j1();
        } else if (iM94404F0 == 13) {
            strM94409X0 = m94409X0(f126554N);
        } else if (iM94404F0 == 12) {
            strM94409X0 = m94409X0(f126553M);
        } else {
            if (iM94404F0 != 15) {
                throw new JsonDataException("Expected a name but was " + mo16731k() + " at path " + m16727b());
            }
            strM94409X0 = this.f126563L;
            this.f126563L = null;
        }
        this.f126560I = 0;
        this.f22079y[this.f22077w - 1] = strM94409X0;
        return strM94409X0;
    }

    @Override // com.squareup.moshi.JsonReader
    public final String nextString() throws EOFException, JsonEncodingException {
        String strM79188M0;
        int iM94404F0 = this.f126560I;
        if (iM94404F0 == 0) {
            iM94404F0 = m94404F0();
        }
        if (iM94404F0 == 10) {
            strM79188M0 = m94410j1();
        } else if (iM94404F0 == 9) {
            strM79188M0 = m94409X0(f126554N);
        } else if (iM94404F0 == 8) {
            strM79188M0 = m94409X0(f126553M);
        } else if (iM94404F0 == 11) {
            strM79188M0 = this.f126563L;
            this.f126563L = null;
        } else if (iM94404F0 == 16) {
            strM79188M0 = Long.toString(this.f126561J);
        } else {
            if (iM94404F0 != 17) {
                throw new JsonDataException("Expected a string but was " + mo16731k() + " at path " + m16727b());
            }
            long j7 = this.f126562K;
            C26616h c26616h = this.f126559H;
            c26616h.getClass();
            strM79188M0 = c26616h.m79188M0(j7, AbstractC39397a.f169546a);
        }
        this.f126560I = 0;
        int[] iArr = this.f22080z;
        int i13 = this.f22077w - 1;
        iArr[i13] = iArr[i13] + 1;
        return strM79188M0;
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: s */
    public final void mo16735s() {
        if (hasNext()) {
            this.f126563L = nextName();
            this.f126560I = 11;
        }
    }

    @Override // com.squareup.moshi.JsonReader
    public final void skipValue() throws EOFException, JsonEncodingException {
        if (this.f22076F) {
            throw new JsonDataException("Cannot skip unexpected " + mo16731k() + " at " + m16727b());
        }
        int i13 = 0;
        do {
            int iM94404F0 = this.f126560I;
            if (iM94404F0 == 0) {
                iM94404F0 = m94404F0();
            }
            if (iM94404F0 == 3) {
                m16736x(1);
            } else {
                if (iM94404F0 == 1) {
                    m16736x(3);
                } else if (iM94404F0 == 4) {
                    i13--;
                    if (i13 < 0) {
                        throw new JsonDataException("Expected a value but was " + mo16731k() + " at path " + m16727b());
                    }
                    this.f22077w--;
                } else if (iM94404F0 == 2) {
                    i13--;
                    if (i13 < 0) {
                        throw new JsonDataException("Expected a value but was " + mo16731k() + " at path " + m16727b());
                    }
                    this.f22077w--;
                } else {
                    C26616h c26616h = this.f126559H;
                    if (iM94404F0 == 14 || iM94404F0 == 10) {
                        long jMo79206f0 = this.f126558G.mo79206f0(f126555O);
                        if (jMo79206f0 == -1) {
                            jMo79206f0 = c26616h.f105866x;
                        }
                        c26616h.skip(jMo79206f0);
                    } else if (iM94404F0 == 9 || iM94404F0 == 13) {
                        m94412l1(f126554N);
                    } else if (iM94404F0 == 8 || iM94404F0 == 12) {
                        m94412l1(f126553M);
                    } else if (iM94404F0 == 17) {
                        c26616h.skip(this.f126562K);
                    } else if (iM94404F0 == 18) {
                        throw new JsonDataException("Expected a value but was " + mo16731k() + " at path " + m16727b());
                    }
                }
                this.f126560I = 0;
            }
            i13++;
            this.f126560I = 0;
        } while (i13 != 0);
        int[] iArr = this.f22080z;
        int i14 = this.f22077w - 1;
        iArr[i14] = iArr[i14] + 1;
        this.f22079y[i14] = "null";
    }

    public final String toString() {
        return "JsonReader(" + this.f126558G + ")";
    }

    /* JADX INFO: renamed from: x0 */
    public final void m94413x0() throws JsonEncodingException {
        if (this.f22075E) {
            return;
        }
        m16733o0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    public C30742x(C30742x c30742x) {
        super(c30742x);
        this.f126560I = 0;
        C26621j0 c26621j0Peek = c30742x.f126558G.peek();
        this.f126558G = c26621j0Peek;
        this.f126559H = c26621j0Peek.f105872x;
        this.f126560I = c30742x.f126560I;
        this.f126561J = c30742x.f126561J;
        this.f126562K = c30742x.f126562K;
        this.f126563L = c30742x.f126563L;
        try {
            c26621j0Peek.mo79207g0(c30742x.f126559H.f105866x);
        } catch (IOException unused) {
            throw new AssertionError();
        }
    }
}
