package bd3;

import java.nio.charset.CharacterCodingException;
import m83.AbstractC25260n;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import ro.C31624i;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: bd3.d0 */
/* JADX INFO: loaded from: classes3.dex */
public class C3117d0 extends AbstractC3110a {

    /* JADX INFO: renamed from: e */
    public final C31624i f12237e;

    /* JADX INFO: renamed from: f */
    public final char[] f12238f;

    /* JADX INFO: renamed from: g */
    public int f12239g = 128;

    /* JADX INFO: renamed from: h */
    public final C3116d f12240h;

    public C3117d0(C31624i c31624i, char[] cArr) throws CharacterCodingException {
        this.f12237e = c31624i;
        this.f12238f = cArr;
        this.f12240h = new C3116d(cArr);
        m8982E(0);
    }

    @Override // bd3.AbstractC3110a
    /* JADX INFO: renamed from: A */
    public final String mo8944A(int i13, int i14) {
        C3116d c3116d = this.f12240h;
        return AbstractC39421y.m125934z(c3116d.f12235w, i13, Math.min(i14, c3116d.f12236x));
    }

    /* JADX INFO: renamed from: E */
    public final void m8982E(int i13) throws CharacterCodingException {
        C3116d c3116d = this.f12240h;
        char[] cArr = c3116d.f12235w;
        if (i13 != 0) {
            int i14 = this.f12210a;
            AbstractC25260n.m74065f0(cArr, cArr, 0, i14, i14 + i13);
        }
        int i15 = c3116d.f12236x;
        while (i13 != i15) {
            C31624i c31624i = this.f12237e;
            c31624i.getClass();
            int iM8987a = ((C3128j) c31624i.f130665x).m8987a(cArr, i13, i15 - i13);
            if (iM8987a == -1) {
                c3116d.f12236x = Math.min(c3116d.f12235w.length, i13);
                this.f12239g = -1;
                break;
            }
            i13 += iM8987a;
        }
        this.f12210a = 0;
    }

    /* JADX INFO: renamed from: F */
    public final void m8983F() {
        C3124h c3124h = C3124h.f12263z;
        c3124h.getClass();
        char[] array = this.f12238f;
        AbstractC22676k.m65750j(array, "array");
        if (array.length == 16384) {
            c3124h.m3869G(array);
        } else {
            throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + array.length).toString());
        }
    }

    @Override // bd3.AbstractC3110a
    /* JADX INFO: renamed from: b */
    public final void mo8949b(int i13, int i14) {
        this.f12213d.append(this.f12240h.f12235w, i13, i14 - i13);
    }

    @Override // bd3.AbstractC3110a
    /* JADX INFO: renamed from: c */
    public boolean mo8950c() throws CharacterCodingException {
        mo8962o();
        int i13 = this.f12210a;
        while (true) {
            int iMo8970y = mo8970y(i13);
            if (iMo8970y == -1) {
                this.f12210a = iMo8970y;
                return false;
            }
            char c3 = this.f12240h.f12235w[iMo8970y];
            if (c3 != ' ' && c3 != '\n' && c3 != '\r' && c3 != '\t') {
                this.f12210a = iMo8970y;
                return AbstractC3110a.m8943u(c3);
            }
            i13 = iMo8970y + 1;
        }
    }

    @Override // bd3.AbstractC3110a
    /* JADX INFO: renamed from: e */
    public final String mo8952e() throws CharacterCodingException {
        mo8955h('\"');
        int i13 = this.f12210a;
        C3116d c3116d = this.f12240h;
        int i14 = c3116d.f12236x;
        char[] cArr = c3116d.f12235w;
        int i15 = i13;
        while (true) {
            if (i15 >= i14) {
                i15 = -1;
                break;
            }
            if (cArr[i15] == '\"') {
                break;
            }
            i15++;
        }
        if (i15 == -1) {
            int iMo8970y = mo8970y(i13);
            if (iMo8970y != -1) {
                return m8958k(c3116d, this.f12210a, iMo8970y);
            }
            int i16 = this.f12210a;
            int i17 = i16 - 1;
            AbstractC3110a.m8942r(this, AbstractC11895b.m31996o("Expected quotation mark '\"', but had '", (i16 == c3116d.f12236x || i17 < 0) ? "EOF" : String.valueOf(c3116d.f12235w[i17]), "' instead"), i17, null, 4);
            throw null;
        }
        for (int i18 = i13; i18 < i15; i18++) {
            if (cArr[i18] == '\\') {
                return m8958k(c3116d, this.f12210a, i18);
            }
        }
        this.f12210a = i15 + 1;
        return AbstractC39421y.m125934z(cArr, i13, Math.min(i15, c3116d.f12236x));
    }

    @Override // bd3.AbstractC3110a
    /* JADX INFO: renamed from: f */
    public byte mo8953f() throws CharacterCodingException {
        mo8962o();
        int i13 = this.f12210a;
        while (true) {
            int iMo8970y = mo8970y(i13);
            if (iMo8970y == -1) {
                this.f12210a = iMo8970y;
                return (byte) 10;
            }
            int i14 = iMo8970y + 1;
            byte bM9012h = AbstractC3138q.m9012h(this.f12240h.f12235w[iMo8970y]);
            if (bM9012h != 3) {
                this.f12210a = i14;
                return bM9012h;
            }
            i13 = i14;
        }
    }

    @Override // bd3.AbstractC3110a
    /* JADX INFO: renamed from: h */
    public void mo8955h(char c3) throws CharacterCodingException {
        mo8962o();
        int i13 = this.f12210a;
        while (true) {
            int iMo8970y = mo8970y(i13);
            if (iMo8970y == -1) {
                this.f12210a = iMo8970y;
                m8947D(c3);
                throw null;
            }
            int i14 = iMo8970y + 1;
            char c7 = this.f12240h.f12235w[iMo8970y];
            if (c7 != ' ' && c7 != '\n' && c7 != '\r' && c7 != '\t') {
                this.f12210a = i14;
                if (c7 == c3) {
                    return;
                }
                m8947D(c3);
                throw null;
            }
            i13 = i14;
        }
    }

    @Override // bd3.AbstractC3110a
    /* JADX INFO: renamed from: o */
    public final void mo8962o() throws CharacterCodingException {
        int i13 = this.f12240h.f12236x - this.f12210a;
        if (i13 > this.f12239g) {
            return;
        }
        m8982E(i13);
    }

    @Override // bd3.AbstractC3110a
    /* JADX INFO: renamed from: t */
    public final CharSequence mo8966t() {
        return this.f12240h;
    }

    @Override // bd3.AbstractC3110a
    /* JADX INFO: renamed from: v */
    public final String mo8967v(String keyToMatch, boolean z4) {
        AbstractC22676k.m65750j(keyToMatch, "keyToMatch");
        return null;
    }

    @Override // bd3.AbstractC3110a
    /* JADX INFO: renamed from: y */
    public final int mo8970y(int i13) throws CharacterCodingException {
        C3116d c3116d = this.f12240h;
        if (i13 < c3116d.f12236x) {
            return i13;
        }
        this.f12210a = i13;
        mo8962o();
        return (this.f12210a != 0 || c3116d.length() == 0) ? -1 : 0;
    }

    @Override // bd3.AbstractC3110a
    /* JADX INFO: renamed from: z */
    public int mo8971z() throws CharacterCodingException {
        int iMo8970y;
        char c3;
        int i13 = this.f12210a;
        while (true) {
            iMo8970y = mo8970y(i13);
            if (iMo8970y == -1 || !((c3 = this.f12240h.f12235w[iMo8970y]) == ' ' || c3 == '\n' || c3 == '\r' || c3 == '\t')) {
                break;
            }
            i13 = iMo8970y + 1;
        }
        this.f12210a = iMo8970y;
        return iMo8970y;
    }
}
