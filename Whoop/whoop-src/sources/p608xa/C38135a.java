package p608xa;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p576w8.C36932b;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import p607x8.InterfaceC38049d;
import p690zr.AbstractC41023g0;
import p690zr.C41017e0;
import p690zr.C41060w0;
import qa.C30096a;
import qa.C30106k;
import qa.InterfaceC30107l;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: xa.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C38135a implements InterfaceC30107l {

    /* JADX INFO: renamed from: E */
    public final String f163244E;

    /* JADX INFO: renamed from: F */
    public final float f163245F;

    /* JADX INFO: renamed from: G */
    public final int f163246G;

    /* JADX INFO: renamed from: w */
    public final C38059n f163247w = new C38059n();

    /* JADX INFO: renamed from: x */
    public final boolean f163248x;

    /* JADX INFO: renamed from: y */
    public final int f163249y;

    /* JADX INFO: renamed from: z */
    public final int f163250z;

    public C38135a(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f163249y = 0;
            this.f163250z = -1;
            this.f163244E = "sans-serif";
            this.f163248x = false;
            this.f163245F = 0.85f;
            this.f163246G = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f163249y = bArr[24];
        this.f163250z = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f163244E = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i13 = bArr[25] * 20;
        this.f163246G = i13;
        boolean z4 = (bArr[0] & 32) != 0;
        this.f163248x = z4;
        if (z4) {
            this.f163245F = AbstractC38065t.m121913f(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i13, 0.0f, 0.95f);
        } else {
            this.f163245F = 0.85f;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m122131a(SpannableStringBuilder spannableStringBuilder, int i13, int i14, int i15, int i16, int i17) {
        if (i13 != i14) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i13 >>> 8) | ((i13 & 255) << 24)), i15, i16, i17 | 33);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m122132b(SpannableStringBuilder spannableStringBuilder, int i13, int i14, int i15, int i16, int i17) {
        if (i13 != i14) {
            int i18 = i17 | 33;
            boolean z4 = (i13 & 1) != 0;
            boolean z13 = (i13 & 2) != 0;
            if (z4) {
                if (z13) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i15, i16, i18);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i15, i16, i18);
                }
            } else if (z13) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i15, i16, i18);
            }
            boolean z14 = (i13 & 4) != 0;
            if (z14) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i15, i16, i18);
            }
            if (z14 || z4 || z13) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i15, i16, i18);
        }
    }

    @Override // qa.InterfaceC30107l
    /* JADX INFO: renamed from: c0 */
    public final int mo91110c0() {
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qa.InterfaceC30107l
    /* JADX INFO: renamed from: k */
    public final void mo91120k(byte[] bArr, int i13, int i14, C30106k c30106k, InterfaceC38049d interfaceC38049d) {
        String strM121865r;
        int i15;
        C38059n c38059n = this.f163247w;
        c38059n.m121844D(i13 + i14, bArr);
        c38059n.m121846F(i13);
        int i16 = 1;
        int i17 = 0;
        int i18 = 2;
        AbstractC35849g.m113802d(c38059n.m121848a() >= 2);
        int iM121873z = c38059n.m121873z();
        if (iM121873z == 0) {
            strM121865r = "";
        } else {
            int i19 = c38059n.f163018b;
            Charset charsetM121842B = c38059n.m121842B();
            int i24 = iM121873z - (c38059n.f163018b - i19);
            if (charsetM121842B == null) {
                charsetM121842B = StandardCharsets.UTF_8;
            }
            strM121865r = c38059n.m121865r(i24, charsetM121842B);
        }
        if (strM121865r.isEmpty()) {
            C41017e0 c41017e0 = AbstractC41023g0.f176998x;
            interfaceC38049d.accept(new C30096a(C41060w0.f177067E, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strM121865r);
        m122132b(spannableStringBuilder, this.f163249y, 0, 0, spannableStringBuilder.length(), 16711680);
        m122131a(spannableStringBuilder, this.f163250z, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f163244E;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fM121913f = this.f163245F;
        while (c38059n.m121848a() >= 8) {
            int i25 = c38059n.f163018b;
            int iM121854g = c38059n.m121854g();
            int iM121854g2 = c38059n.m121854g();
            if (iM121854g2 == 1937013100) {
                AbstractC35849g.m113802d(c38059n.m121848a() >= i18 ? i16 : i17);
                int iM121873z2 = c38059n.m121873z();
                int i26 = i17;
                while (i26 < iM121873z2) {
                    AbstractC35849g.m113802d(c38059n.m121848a() >= 12 ? i16 : i17);
                    int iM121873z3 = c38059n.m121873z();
                    int iM121873z4 = c38059n.m121873z();
                    c38059n.m121847G(i18);
                    int i27 = i26;
                    int iM121867t = c38059n.m121867t();
                    c38059n.m121847G(i16);
                    int iM121854g3 = c38059n.m121854g();
                    if (iM121873z4 > spannableStringBuilder.length()) {
                        StringBuilder sbM30466t = AbstractC11266d.m30466t(iM121873z4, "Truncating styl end (", ") to cueText.length() (");
                        sbM30466t.append(spannableStringBuilder.length());
                        sbM30466t.append(").");
                        AbstractC38046a.m121826u("Tx3gParser", sbM30466t.toString());
                        iM121873z4 = spannableStringBuilder.length();
                    }
                    if (iM121873z3 >= iM121873z4) {
                        AbstractC38046a.m121826u("Tx3gParser", AbstractC25012a.m73372e(iM121873z3, iM121873z4, "Ignoring styl with start (", ") >= end (", ")."));
                    } else {
                        int i28 = iM121873z4;
                        m122132b(spannableStringBuilder, iM121867t, this.f163249y, iM121873z3, i28, 0);
                        m122131a(spannableStringBuilder, iM121854g3, this.f163250z, iM121873z3, i28, 0);
                    }
                    i26 = i27 + 1;
                    i16 = 1;
                    i17 = 0;
                    i18 = 2;
                }
                i15 = i18;
            } else if (iM121854g2 == 1952608120 && this.f163248x) {
                i15 = 2;
                AbstractC35849g.m113802d(c38059n.m121848a() >= 2);
                fM121913f = AbstractC38065t.m121913f(c38059n.m121873z() / this.f163246G, 0.0f, 0.95f);
            } else {
                i15 = 2;
            }
            c38059n.m121846F(i25 + iM121854g);
            i18 = i15;
            i16 = 1;
            i17 = 0;
        }
        interfaceC38049d.accept(new C30096a(AbstractC41023g0.m133256r(new C36932b(spannableStringBuilder, null, null, null, fM121913f, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f)), -9223372036854775807L, -9223372036854775807L));
    }
}
