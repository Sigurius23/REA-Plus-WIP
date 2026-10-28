package c73;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: c73.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C4289e extends MetricAffectingSpan {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17399w;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f17399w) {
            case 0:
                textPaint.setTextSkewX(-0.25f);
                break;
            default:
                textPaint.setFakeBoldText(true);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f17399w) {
            case 0:
                textPaint.setTextSkewX(-0.25f);
                break;
            default:
                textPaint.setFakeBoldText(true);
                break;
        }
    }
}
