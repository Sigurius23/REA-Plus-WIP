package bd3;

import ae3.C0803k;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p108e4.AbstractC12682p;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: bd3.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3110a {

    /* JADX INFO: renamed from: a */
    public int f12210a;

    /* JADX INFO: renamed from: b */
    public final C0803k f12211b;

    /* JADX INFO: renamed from: c */
    public String f12212c;

    /* JADX INFO: renamed from: d */
    public final StringBuilder f12213d;

    public AbstractC3110a() {
        C0803k c0803k = new C0803k(1);
        c0803k.f2965c = new Object[8];
        int[] iArr = new int[8];
        for (int i13 = 0; i13 < 8; i13++) {
            iArr[i13] = -1;
        }
        c0803k.f2966d = iArr;
        c0803k.f2964b = -1;
        this.f12211b = c0803k;
        this.f12213d = new StringBuilder();
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m8942r(AbstractC3110a abstractC3110a, String str, int i13, String str2, int i14) {
        if ((i14 & 2) != 0) {
            i13 = abstractC3110a.f12210a;
        }
        if ((i14 & 4) != 0) {
            str2 = "";
        }
        abstractC3110a.m8964q(i13, str, str2);
        throw null;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m8943u(char c3) {
        return (c3 == ',' || c3 == ':' || c3 == ']' || c3 == '}') ? false : true;
    }

    /* JADX INFO: renamed from: A */
    public String mo8944A(int i13, int i14) {
        return mo8966t().subSequence(i13, i14).toString();
    }

    /* JADX INFO: renamed from: B */
    public final boolean m8945B() {
        int iMo8971z = mo8971z();
        CharSequence charSequenceMo8966t = mo8966t();
        if (iMo8971z >= charSequenceMo8966t.length() || iMo8971z == -1 || charSequenceMo8966t.charAt(iMo8971z) != ',') {
            return false;
        }
        this.f12210a++;
        return true;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m8946C(boolean z4) {
        int iMo8970y = mo8970y(mo8971z());
        int length = mo8966t().length() - iMo8970y;
        if (length >= 4 && iMo8970y != -1) {
            for (int i13 = 0; i13 < 4; i13++) {
                if ("null".charAt(i13) == mo8966t().charAt(iMo8970y + i13)) {
                }
            }
            if (length <= 4 || AbstractC3138q.m9012h(mo8966t().charAt(iMo8970y + 4)) != 0) {
                if (z4) {
                    this.f12210a = iMo8970y + 4;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: D */
    public final void m8947D(char c3) {
        int i13 = this.f12210a;
        if (i13 > 0 && c3 == '\"') {
            try {
                this.f12210a = i13 - 1;
                String strM8959l = m8959l();
                this.f12210a = i13;
                if (AbstractC22676k.m65745e(strM8959l, "null")) {
                    m8964q(this.f12210a - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th3) {
                this.f12210a = i13;
                throw th3;
            }
        }
        String strM9028x = AbstractC3138q.m9028x(AbstractC3138q.m9012h(c3));
        int i14 = this.f12210a;
        int i15 = i14 - 1;
        m8942r(this, AbstractC2875y.m8300m("Expected ", strM9028x, ", but had '", (i14 == mo8966t().length() || i15 < 0) ? "EOF" : String.valueOf(mo8966t().charAt(i15)), "' instead"), i15, null, 4);
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final int m8948a(int i13, CharSequence charSequence) {
        int i14 = i13 + 4;
        if (i14 < charSequence.length()) {
            this.f12213d.append((char) (m8965s(i13 + 3, charSequence) + (m8965s(i13, charSequence) << 12) + (m8965s(i13 + 1, charSequence) << 8) + (m8965s(i13 + 2, charSequence) << 4)));
            return i14;
        }
        this.f12210a = i13;
        mo8962o();
        if (this.f12210a + 4 < charSequence.length()) {
            return m8948a(this.f12210a, charSequence);
        }
        m8942r(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public void mo8949b(int i13, int i14) {
        this.f12213d.append(mo8966t(), i13, i14);
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo8950c();

    /* JADX INFO: renamed from: d */
    public final void m8951d(int i13, String str) {
        if (mo8966t().length() - i13 < str.length()) {
            m8942r(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i14 = 0; i14 < length; i14++) {
            if (str.charAt(i14) != (mo8966t().charAt(i13 + i14) | ' ')) {
                m8942r(this, "Expected valid boolean literal prefix, but had '" + m8959l() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f12210a = str.length() + i13;
    }

    /* JADX INFO: renamed from: e */
    public abstract String mo8952e();

    /* JADX INFO: renamed from: f */
    public abstract byte mo8953f();

    /* JADX INFO: renamed from: g */
    public final byte m8954g(byte b) {
        byte bMo8953f = mo8953f();
        if (bMo8953f == b) {
            return bMo8953f;
        }
        String strM9028x = AbstractC3138q.m9028x(b);
        int i13 = this.f12210a;
        int i14 = i13 - 1;
        m8942r(this, AbstractC2875y.m8300m("Expected ", strM9028x, ", but had '", (i13 == mo8966t().length() || i14 < 0) ? "EOF" : String.valueOf(mo8966t().charAt(i14)), "' instead"), i14, null, 4);
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo8955h(char c3);

    /* JADX INFO: renamed from: i */
    public final long m8956i() {
        boolean z4;
        boolean z13;
        double dPow;
        int iMo8970y = mo8970y(mo8971z());
        int i13 = 0;
        if (iMo8970y >= mo8966t().length() || iMo8970y == -1) {
            m8942r(this, "EOF", 0, null, 6);
            throw null;
        }
        if (mo8966t().charAt(iMo8970y) == '\"') {
            iMo8970y++;
            if (iMo8970y == mo8966t().length()) {
                m8942r(this, "EOF", 0, null, 6);
                throw null;
            }
            z4 = true;
        } else {
            z4 = false;
        }
        int i14 = iMo8970y;
        int i15 = 0;
        boolean z14 = false;
        boolean z15 = false;
        long j7 = 0;
        long j13 = 0;
        while (true) {
            if (i14 == mo8966t().length()) {
                z4 = z4;
                z13 = z14;
                break;
            }
            char cCharAt = mo8966t().charAt(i14);
            if ((cCharAt != 'e' && cCharAt != 'E') || z14) {
                z4 = z4;
                if (cCharAt == '-' && z14) {
                    if (i14 == iMo8970y) {
                        m8942r(this, "Unexpected symbol '-' in numeric literal", i13, null, 6);
                        throw null;
                    }
                    i14++;
                    i15 = i13;
                } else if (cCharAt != '+' || !z14) {
                    z13 = z14;
                    if (cCharAt != '-') {
                        if (AbstractC3138q.m9012h(cCharAt) != 0) {
                            break;
                        }
                        i14++;
                        int i16 = cCharAt - '0';
                        if (i16 < 0 || i16 >= 10) {
                            m8942r(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i13, null, 6);
                            throw null;
                        }
                        if (z13) {
                            j7 = (j7 * ((long) 10)) + ((long) i16);
                            z14 = z13;
                        } else {
                            j13 = (j13 * ((long) 10)) - ((long) i16);
                            if (j13 > 0) {
                                m8942r(this, "Numeric value overflow", 0, null, 6);
                                throw null;
                            }
                            z4 = z4;
                            z14 = z13;
                            i13 = 0;
                        }
                    } else {
                        if (i14 != iMo8970y) {
                            m8942r(this, "Unexpected symbol '-' in numeric literal", i13, null, 6);
                            throw null;
                        }
                        i14++;
                        z4 = z4;
                        z14 = z13;
                        z15 = true;
                    }
                } else {
                    if (i14 == iMo8970y) {
                        m8942r(this, "Unexpected symbol '+' in numeric literal", i13, null, 6);
                        throw null;
                    }
                    i14++;
                    z4 = z4;
                    i15 = 1;
                }
            } else {
                if (i14 == iMo8970y) {
                    m8942r(this, "Unexpected symbol " + cCharAt + " in numeric literal", i13, null, 6);
                    throw null;
                }
                i14++;
                i15 = 1;
                z14 = true;
            }
        }
        boolean z16 = i14 != iMo8970y;
        if (iMo8970y == i14 || (z15 && iMo8970y == i14 - 1)) {
            m8942r(this, "Expected numeric literal", 0, null, 6);
            throw null;
        }
        if (z4) {
            if (!z16) {
                m8942r(this, "EOF", 0, null, 6);
                throw null;
            }
            if (mo8966t().charAt(i14) != '\"') {
                m8942r(this, "Expected closing quotation mark", 0, null, 6);
                throw null;
            }
            i14++;
        }
        this.f12210a = i14;
        if (z13) {
            double d3 = j13;
            if (i15 == 0) {
                dPow = Math.pow(10.0d, -j7);
            } else {
                if (i15 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                dPow = Math.pow(10.0d, j7);
            }
            double d14 = d3 * dPow;
            if (d14 > 9.223372036854776E18d || d14 < -9.223372036854776E18d) {
                m8942r(this, "Numeric value overflow", 0, null, 6);
                throw null;
            }
            if (Math.floor(d14) != d14) {
                m8942r(this, "Can't convert " + d14 + " to Long", 0, null, 6);
                throw null;
            }
            j13 = (long) d14;
        }
        if (z15) {
            return j13;
        }
        if (j13 != Long.MIN_VALUE) {
            return -j13;
        }
        m8942r(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public final String m8957j() {
        String str = this.f12212c;
        if (str == null) {
            return mo8952e();
        }
        AbstractC22676k.m65747g(str);
        this.f12212c = null;
        return str;
    }

    /* JADX INFO: renamed from: k */
    public final String m8958k(CharSequence source, int i13, int i14) {
        AbstractC22676k.m65750j(source, "source");
        char cCharAt = source.charAt(i14);
        boolean z4 = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                mo8949b(i13, i14);
                int iMo8970y = mo8970y(i14 + 1);
                if (iMo8970y == -1) {
                    m8942r(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                    throw null;
                }
                int iM8948a = iMo8970y + 1;
                char cCharAt2 = mo8966t().charAt(iMo8970y);
                if (cCharAt2 == 'u') {
                    iM8948a = m8948a(iM8948a, mo8966t());
                } else {
                    char c3 = cCharAt2 < 'u' ? C3126i.f12265a[cCharAt2] : (char) 0;
                    if (c3 == 0) {
                        m8942r(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                        throw null;
                    }
                    this.f12213d.append(c3);
                }
                i13 = mo8970y(iM8948a);
                if (i13 == -1) {
                    m8942r(this, "Unexpected EOF", i13, null, 4);
                    throw null;
                }
            } else {
                i14++;
                if (i14 >= source.length()) {
                    mo8949b(i13, i14);
                    i13 = mo8970y(i14);
                    if (i13 == -1) {
                        m8942r(this, "Unexpected EOF", i13, null, 4);
                        throw null;
                    }
                } else {
                    continue;
                }
                cCharAt = source.charAt(i14);
            }
            i14 = i13;
            z4 = true;
            cCharAt = source.charAt(i14);
        }
        String strMo8944A = !z4 ? mo8944A(i13, i14) : m8961n(i13, i14);
        this.f12210a = i14 + 1;
        return strMo8944A;
    }

    /* JADX INFO: renamed from: l */
    public final String m8959l() {
        String str = this.f12212c;
        if (str != null) {
            AbstractC22676k.m65747g(str);
            this.f12212c = null;
            return str;
        }
        int iMo8971z = mo8971z();
        if (iMo8971z >= mo8966t().length() || iMo8971z == -1) {
            m8942r(this, "EOF", iMo8971z, null, 4);
            throw null;
        }
        byte bM9012h = AbstractC3138q.m9012h(mo8966t().charAt(iMo8971z));
        if (bM9012h == 1) {
            return m8957j();
        }
        if (bM9012h != 0) {
            m8942r(this, "Expected beginning of the string, but got " + mo8966t().charAt(iMo8971z), 0, null, 6);
            throw null;
        }
        boolean z4 = false;
        while (AbstractC3138q.m9012h(mo8966t().charAt(iMo8971z)) == 0) {
            iMo8971z++;
            if (iMo8971z >= mo8966t().length()) {
                mo8949b(this.f12210a, iMo8971z);
                int iMo8970y = mo8970y(iMo8971z);
                if (iMo8970y == -1) {
                    this.f12210a = iMo8971z;
                    return m8961n(0, 0);
                }
                iMo8971z = iMo8970y;
                z4 = true;
            }
        }
        String strMo8944A = !z4 ? mo8944A(this.f12210a, iMo8971z) : m8961n(this.f12210a, iMo8971z);
        this.f12210a = iMo8971z;
        return strMo8944A;
    }

    /* JADX INFO: renamed from: m */
    public final String m8960m() {
        String strM8959l = m8959l();
        if (!AbstractC22676k.m65745e(strM8959l, "null") || mo8966t().charAt(this.f12210a - 1) == '\"') {
            return strM8959l;
        }
        m8942r(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public final String m8961n(int i13, int i14) {
        mo8949b(i13, i14);
        StringBuilder sb4 = this.f12213d;
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        sb4.setLength(0);
        return string;
    }

    /* JADX INFO: renamed from: o */
    public void mo8962o() {
    }

    /* JADX INFO: renamed from: p */
    public final void m8963p() {
        if (mo8953f() == 10) {
            return;
        }
        m8942r(this, "Expected EOF after parsing, but had " + mo8966t().charAt(this.f12210a - 1) + " instead", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: q */
    public final void m8964q(int i13, String message, String hint) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(hint, "hint");
        String strConcat = hint.length() == 0 ? "" : "\n".concat(hint);
        StringBuilder sbM35484d = AbstractC12682p.m35484d(message, " at path: ");
        sbM35484d.append(this.f12211b.m1945c());
        sbM35484d.append(strConcat);
        throw AbstractC3138q.m9008d(mo8966t(), i13, sbM35484d.toString());
    }

    /* JADX INFO: renamed from: s */
    public final int m8965s(int i13, CharSequence charSequence) {
        char cCharAt = charSequence.charAt(i13);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        m8942r(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: t */
    public abstract CharSequence mo8966t();

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("JsonReader(source='");
        sb4.append((Object) mo8966t());
        sb4.append("', currentPosition=");
        return AbstractC11895b.m31999r(sb4, this.f12210a, ')');
    }

    /* JADX INFO: renamed from: v */
    public abstract String mo8967v(String str, boolean z4);

    /* JADX INFO: renamed from: w */
    public byte m8968w() {
        CharSequence charSequenceMo8966t = mo8966t();
        int i13 = this.f12210a;
        while (true) {
            int iMo8970y = mo8970y(i13);
            if (iMo8970y == -1) {
                this.f12210a = iMo8970y;
                return (byte) 10;
            }
            char cCharAt = charSequenceMo8966t.charAt(iMo8970y);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f12210a = iMo8970y;
                return AbstractC3138q.m9012h(cCharAt);
            }
            i13 = iMo8970y + 1;
        }
    }

    /* JADX INFO: renamed from: x */
    public final String m8969x(boolean z4) {
        String strM8957j;
        byte bM8968w = m8968w();
        if (z4) {
            if (bM8968w != 1 && bM8968w != 0) {
                return null;
            }
            strM8957j = m8959l();
        } else {
            if (bM8968w != 1) {
                return null;
            }
            strM8957j = m8957j();
        }
        this.f12212c = strM8957j;
        return strM8957j;
    }

    /* JADX INFO: renamed from: y */
    public abstract int mo8970y(int i13);

    /* JADX INFO: renamed from: z */
    public abstract int mo8971z();
}
