package p356o3;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: o3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C27494d extends MetricAffectingSpan {

    /* JADX INFO: renamed from: w */
    public final float f110735w;

    public C27494d(float f13) {
        this.f110735w = f13;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f110735w);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f110735w);
    }
}
