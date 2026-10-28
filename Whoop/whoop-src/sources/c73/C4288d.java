package c73;

import a73.C0530e;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import p507tx.AbstractC34235f;

/* JADX INFO: renamed from: c73.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C4288d extends MetricAffectingSpan {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17397w;

    /* JADX INFO: renamed from: x */
    public final Object f17398x;

    public /* synthetic */ C4288d(Object obj, int i13) {
        this.f17397w = i13;
        this.f17398x = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f17397w) {
            case 0:
                C0530e c0530e = (C0530e) this.f17398x;
                c0530e.getClass();
                textPaint.setTypeface(Typeface.MONOSPACE);
                textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
                c0530e.getClass();
                textPaint.bgColor = AbstractC34235f.m108234t(textPaint.getColor(), 25);
                break;
            default:
                textPaint.setFontFeatureSettings((String) this.f17398x);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f17397w) {
            case 0:
                ((C0530e) this.f17398x).getClass();
                textPaint.setTypeface(Typeface.MONOSPACE);
                textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
                break;
            default:
                textPaint.setFontFeatureSettings((String) this.f17398x);
                break;
        }
    }
}
