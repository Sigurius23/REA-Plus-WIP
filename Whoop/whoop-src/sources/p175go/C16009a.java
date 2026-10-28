package p175go;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import ed3.C13117a;
import java.util.List;
import p309lo.AbstractC24567y;
import p621xn.AbstractC38467d;
import p621xn.C38465b;
import p621xn.InterfaceC38468e;
import p658yr.AbstractC39717d;

/* JADX INFO: renamed from: go.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C16009a extends AbstractC38467d {

    /* JADX INFO: renamed from: m */
    public final C13117a f60599m = new C13117a();

    /* JADX INFO: renamed from: n */
    public final boolean f60600n;

    /* JADX INFO: renamed from: o */
    public final int f60601o;

    /* JADX INFO: renamed from: p */
    public final int f60602p;

    /* JADX INFO: renamed from: q */
    public final String f60603q;

    /* JADX INFO: renamed from: r */
    public final float f60604r;

    /* JADX INFO: renamed from: s */
    public final int f60605s;

    public C16009a(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f60601o = 0;
            this.f60602p = -1;
            this.f60603q = "sans-serif";
            this.f60600n = false;
            this.f60604r = 0.85f;
            this.f60605s = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f60601o = bArr[24];
        this.f60602p = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f60603q = "Serif".equals(new String(bArr, 43, bArr.length - 43, AbstractC39717d.f170958c)) ? "serif" : "sans-serif";
        int i13 = bArr[25] * 20;
        this.f60605s = i13;
        boolean z4 = (bArr[0] & 32) != 0;
        this.f60600n = z4;
        if (z4) {
            this.f60604r = AbstractC24567y.m71676g(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i13, 0.0f, 0.95f);
        } else {
            this.f60604r = 0.85f;
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m45322h(SpannableStringBuilder spannableStringBuilder, int i13, int i14, int i15, int i16, int i17) {
        if (i13 != i14) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i13 >>> 8) | ((i13 & 255) << 24)), i15, i16, i17 | 33);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m45323i(SpannableStringBuilder spannableStringBuilder, int i13, int i14, int i15, int i16, int i17) {
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

    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    @Override // p621xn.AbstractC38467d
    /* JADX INFO: renamed from: f */
    public final InterfaceC38468e mo5527f(int i13, boolean z4, byte[] bArr) throws SubtitleDecoderException {
        String strM36712v;
        float f13;
        C13117a c13117a = this.f60599m;
        c13117a.m36687I(i13, bArr);
        int i14 = 2;
        if (c13117a.m36692a() < 2) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
        int iM36682D = c13117a.m36682D();
        int i15 = 8;
        int i16 = 1;
        if (iM36682D == 0) {
            strM36712v = "";
        } else if (c13117a.m36692a() >= 2) {
            byte[] bArr2 = c13117a.f45381a;
            int i17 = c13117a.f45382b;
            char c3 = (char) ((bArr2[i17 + 1] & 255) | ((bArr2[i17] & 255) << 8));
            if (c3 == 65279 || c3 == 65534) {
                strM36712v = c13117a.m36712v(iM36682D, AbstractC39717d.f170959d);
            } else {
                strM36712v = c13117a.m36712v(iM36682D, AbstractC39717d.f170958c);
            }
        } else {
            strM36712v = c13117a.m36712v(iM36682D, AbstractC39717d.f170958c);
        }
        if (strM36712v.isEmpty()) {
            return C16010b.f60606x;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strM36712v);
        m45323i(spannableStringBuilder, this.f60601o, 0, 0, spannableStringBuilder.length(), 16711680);
        m45322h(spannableStringBuilder, this.f60602p, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        int i18 = 0;
        String str = this.f60603q;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fM71676g = this.f60604r;
        while (c13117a.m36692a() >= i15) {
            int i19 = c13117a.f45382b;
            int iM36699i = c13117a.m36699i();
            int iM36699i2 = c13117a.m36699i();
            if (iM36699i2 != 1937013100) {
                f13 = fM71676g;
                if (iM36699i2 == 1952608120 && this.f60600n) {
                    i14 = 2;
                    if (c13117a.m36692a() < 2) {
                        throw new SubtitleDecoderException("Unexpected subtitle format.");
                    }
                    fM71676g = AbstractC24567y.m71676g(c13117a.m36682D() / this.f60605s, 0.0f, 0.95f);
                } else {
                    i14 = 2;
                }
                c13117a.m36689K(i19 + iM36699i);
                i15 = 8;
                i16 = 1;
                i18 = 0;
            } else {
                if (c13117a.m36692a() < i14) {
                    throw new SubtitleDecoderException("Unexpected subtitle format.");
                }
                int iM36682D2 = c13117a.m36682D();
                int i24 = i18;
                while (i24 < iM36682D2) {
                    if (c13117a.m36692a() < 12) {
                        throw new SubtitleDecoderException("Unexpected subtitle format.");
                    }
                    int iM36682D3 = c13117a.m36682D();
                    int iM36682D4 = c13117a.m36682D();
                    c13117a.m36690L(i14);
                    int i25 = iM36682D2;
                    int iM36715y = c13117a.m36715y();
                    c13117a.m36690L(i16);
                    int iM36699i3 = c13117a.m36699i();
                    if (iM36682D4 > spannableStringBuilder.length()) {
                        int length2 = spannableStringBuilder.length();
                        StringBuilder sb4 = new StringBuilder(68);
                        sb4.append("Truncating styl end (");
                        sb4.append(iM36682D4);
                        sb4.append(") to cueText.length() (");
                        sb4.append(length2);
                        sb4.append(").");
                        Log.w("Tx3gDecoder", sb4.toString());
                        iM36682D4 = spannableStringBuilder.length();
                    }
                    if (iM36682D3 >= iM36682D4) {
                        StringBuilder sb5 = new StringBuilder(60);
                        sb5.append("Ignoring styl with start (");
                        sb5.append(iM36682D3);
                        sb5.append(") >= end (");
                        sb5.append(iM36682D4);
                        sb5.append(").");
                        Log.w("Tx3gDecoder", sb5.toString());
                    } else {
                        m45323i(spannableStringBuilder, iM36715y, this.f60601o, iM36682D3, iM36682D4, 0);
                        m45322h(spannableStringBuilder, iM36699i3, this.f60602p, iM36682D3, iM36682D4, 0);
                    }
                    i24++;
                    iM36682D2 = i25;
                    fM71676g = fM71676g;
                    i14 = 2;
                    i16 = 1;
                }
                f13 = fM71676g;
            }
            fM71676g = f13;
            c13117a.m36689K(i19 + iM36699i);
            i15 = 8;
            i16 = 1;
            i18 = 0;
        }
        return new C16010b(new C38465b(spannableStringBuilder, null, null, null, fM71676g, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f));
    }
}
