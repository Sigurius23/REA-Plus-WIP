package p356o3;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: o3.l */
/* JADX INFO: loaded from: classes.dex */
public final class C27502l extends MetricAffectingSpan {

    /* JADX INFO: renamed from: w */
    public final Typeface f110767w;

    public C27502l(Typeface typeface) {
        this.f110767w = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTypeface(this.f110767w);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTypeface(this.f110767w);
    }
}
