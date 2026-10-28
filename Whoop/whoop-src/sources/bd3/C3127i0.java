package bd3;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: bd3.i0 */
/* JADX INFO: loaded from: classes5.dex */
public class C3127i0 extends AbstractC3110a {

    /* JADX INFO: renamed from: e */
    public final String f12267e;

    public C3127i0(String source) {
        AbstractC22676k.m65750j(source, "source");
        this.f12267e = source;
    }

    @Override // bd3.AbstractC3110a
    /* JADX INFO: renamed from: c */
    public boolean mo8950c() {
        int i13 = this.f12210a;
        if (i13 == -1) {
            return false;
        }
        while (true) {
            String str = this.f12267e;
            if (i13 >= str.length()) {
                this.f12210a = i13;
                return false;
            }
            char cCharAt = str.charAt(i13);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f12210a = i13;
                return AbstractC3110a.m8943u(cCharAt);
            }
            i13++;
        }
    }

    @Override // bd3.AbstractC3110a
    /* JADX INFO: renamed from: e */
    public final String mo8952e() {
        mo8955h('\"');
        int i13 = this.f12210a;
        String str = this.f12267e;
        int iM125887f0 = AbstractC39414r.m125887f0(str, '\"', i13, false, 4);
        if (iM125887f0 == -1) {
            m8959l();
            int i14 = this.f12210a;
            AbstractC3110a.m8942r(this, AbstractC11895b.m31996o("Expected quotation mark '\"', but had '", (i14 == str.length() || i14 < 0) ? "EOF" : String.valueOf(str.charAt(i14)), "' instead"), i14, null, 4);
            throw null;
        }
        for (int i15 = i13; i15 < iM125887f0; i15++) {
            if (str.charAt(i15) == '\\') {
                return m8958k(str, this.f12210a, i15);
            }
        }
        this.f12210a = iM125887f0 + 1;
        String strSubstring = str.substring(i13, iM125887f0);
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Override // bd3.AbstractC3110a
    /* JADX INFO: renamed from: f */
    public byte mo8953f() {
        String str;
        int i13 = this.f12210a;
        while (true) {
            str = this.f12267e;
            if (i13 == -1 || i13 >= str.length()) {
                break;
            }
            int i14 = i13 + 1;
            char cCharAt = str.charAt(i13);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f12210a = i14;
                return AbstractC3138q.m9012h(cCharAt);
            }
            i13 = i14;
        }
        this.f12210a = str.length();
        return (byte) 10;
    }

    @Override // bd3.AbstractC3110a
    /* JADX INFO: renamed from: h */
    public void mo8955h(char c3) {
        int i13 = this.f12210a;
        if (i13 == -1) {
            m8947D(c3);
            throw null;
        }
        while (true) {
            String str = this.f12267e;
            if (i13 >= str.length()) {
                this.f12210a = -1;
                m8947D(c3);
                throw null;
            }
            int i14 = i13 + 1;
            char cCharAt = str.charAt(i13);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f12210a = i14;
                if (cCharAt == c3) {
                    return;
                }
                m8947D(c3);
                throw null;
            }
            i13 = i14;
        }
    }

    @Override // bd3.AbstractC3110a
    /* JADX INFO: renamed from: t */
    public final CharSequence mo8966t() {
        return this.f12267e;
    }

    @Override // bd3.AbstractC3110a
    /* JADX INFO: renamed from: v */
    public final String mo8967v(String keyToMatch, boolean z4) {
        AbstractC22676k.m65750j(keyToMatch, "keyToMatch");
        int i13 = this.f12210a;
        try {
            if (mo8953f() == 6 && AbstractC22676k.m65745e(m8969x(z4), keyToMatch)) {
                this.f12212c = null;
                if (mo8953f() == 5) {
                    return m8969x(z4);
                }
            }
            return null;
        } finally {
            this.f12210a = i13;
            this.f12212c = null;
        }
    }

    @Override // bd3.AbstractC3110a
    /* JADX INFO: renamed from: y */
    public final int mo8970y(int i13) {
        if (i13 < this.f12267e.length()) {
            return i13;
        }
        return -1;
    }

    @Override // bd3.AbstractC3110a
    /* JADX INFO: renamed from: z */
    public int mo8971z() {
        char cCharAt;
        int i13 = this.f12210a;
        if (i13 == -1) {
            return i13;
        }
        while (true) {
            String str = this.f12267e;
            if (i13 >= str.length() || !((cCharAt = str.charAt(i13)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i13++;
        }
        this.f12210a = i13;
        return i13;
    }
}
