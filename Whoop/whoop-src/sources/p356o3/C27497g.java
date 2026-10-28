package p356o3;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import p448r3.AbstractC30895a;

/* JADX INFO: renamed from: o3.g */
/* JADX INFO: loaded from: classes.dex */
public final class C27497g implements LineHeightSpan {

    /* JADX INFO: renamed from: E */
    public final float f110738E;

    /* JADX INFO: renamed from: F */
    public final boolean f110739F;

    /* JADX INFO: renamed from: G */
    public int f110740G = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: H */
    public int f110741H = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: I */
    public int f110742I = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: J */
    public int f110743J = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: K */
    public int f110744K;

    /* JADX INFO: renamed from: L */
    public int f110745L;

    /* JADX INFO: renamed from: w */
    public final float f110746w;

    /* JADX INFO: renamed from: x */
    public final int f110747x;

    /* JADX INFO: renamed from: y */
    public final boolean f110748y;

    /* JADX INFO: renamed from: z */
    public final boolean f110749z;

    public C27497g(float f13, int i13, boolean z4, boolean z13, float f14, boolean z14) {
        this.f110746w = f13;
        this.f110747x = i13;
        this.f110748y = z4;
        this.f110749z = z13;
        this.f110738E = f14;
        this.f110739F = z14;
        if ((0.0f > f14 || f14 > 1.0f) && f14 != -1.0f) {
            AbstractC30895a.m95017c("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i13, int i14, int i15, int i16, Paint.FontMetricsInt fontMetricsInt) {
        int i17 = fontMetricsInt.descent;
        int i18 = fontMetricsInt.ascent;
        if (i17 - i18 <= 0) {
            return;
        }
        boolean z4 = i13 == 0;
        boolean z13 = i14 == this.f110747x;
        boolean z14 = this.f110749z;
        boolean z15 = this.f110748y;
        if (z4 && z13 && z15 && z14) {
            return;
        }
        if (this.f110740G == Integer.MIN_VALUE) {
            int i19 = i17 - i18;
            int iCeil = (int) Math.ceil(this.f110746w);
            int i24 = iCeil - i19;
            if (!this.f110739F || i24 > 0) {
                float fAbs = this.f110738E;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int iCeil2 = (int) (i24 <= 0 ? Math.ceil(i24 * fAbs) : Math.ceil((1.0f - fAbs) * i24));
                int i25 = fontMetricsInt.descent;
                int i26 = iCeil2 + i25;
                this.f110742I = i26;
                int i27 = i26 - iCeil;
                this.f110741H = i27;
                if (z15) {
                    i27 = fontMetricsInt.ascent;
                }
                this.f110740G = i27;
                if (z14) {
                    i26 = i25;
                }
                this.f110743J = i26;
                this.f110744K = fontMetricsInt.ascent - i27;
                this.f110745L = i26 - i25;
            } else {
                int i28 = fontMetricsInt.ascent;
                this.f110741H = i28;
                int i29 = fontMetricsInt.descent;
                this.f110742I = i29;
                this.f110740G = i28;
                this.f110743J = i29;
                this.f110744K = 0;
                this.f110745L = 0;
            }
        }
        fontMetricsInt.ascent = z4 ? this.f110740G : this.f110741H;
        fontMetricsInt.descent = z13 ? this.f110743J : this.f110742I;
    }
}
