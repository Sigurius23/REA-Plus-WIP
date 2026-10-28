package p356o3;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: o3.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C27500j extends MetricAffectingSpan {

    /* JADX INFO: renamed from: w */
    public final float f110764w;

    public C27500j(float f13) {
        this.f110764w = f13;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f110764w);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f110764w);
    }
}
