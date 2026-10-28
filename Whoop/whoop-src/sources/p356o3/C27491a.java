package p356o3;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: o3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C27491a extends MetricAffectingSpan {

    /* JADX INFO: renamed from: w */
    public final float f110733w;

    public C27491a(float f13) {
        this.f110733w = f13;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f110733w);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f110733w);
    }
}
