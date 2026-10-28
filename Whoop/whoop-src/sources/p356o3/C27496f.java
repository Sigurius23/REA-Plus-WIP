package p356o3;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: renamed from: o3.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C27496f implements LineHeightSpan {

    /* JADX INFO: renamed from: w */
    public final float f110737w;

    public C27496f(float f13) {
        this.f110737w = f13;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i13, int i14, int i15, int i16, Paint.FontMetricsInt fontMetricsInt) {
        int i17 = fontMetricsInt.descent - fontMetricsInt.ascent;
        if (i17 <= 0) {
            return;
        }
        int iCeil = (int) Math.ceil(this.f110737w);
        int iCeil2 = (int) Math.ceil(((double) fontMetricsInt.descent) * ((double) ((iCeil * 1.0f) / i17)));
        fontMetricsInt.descent = iCeil2;
        fontMetricsInt.ascent = iCeil2 - iCeil;
    }
}
