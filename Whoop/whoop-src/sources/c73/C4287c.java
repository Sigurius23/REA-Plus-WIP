package c73;

import a73.C0530e;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import p507tx.AbstractC34235f;

/* JADX INFO: renamed from: c73.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C4287c extends MetricAffectingSpan implements LeadingMarginSpan {

    /* JADX INFO: renamed from: w */
    public final C0530e f17394w;

    /* JADX INFO: renamed from: x */
    public final Rect f17395x = AbstractC4292h.f17407a;

    /* JADX INFO: renamed from: y */
    public final Paint f17396y = AbstractC4292h.f17409c;

    public C4287c(C0530e c0530e) {
        this.f17394w = c0530e;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i13, int i14, int i15, int i16, int i17, CharSequence charSequence, int i18, int i19, boolean z4, Layout layout) {
        int width;
        Paint.Style style = Paint.Style.FILL;
        Paint paint2 = this.f17396y;
        paint2.setStyle(style);
        this.f17394w.getClass();
        paint2.setColor(AbstractC34235f.m108234t(paint.getColor(), 25));
        if (i14 > 0) {
            width = canvas.getWidth();
        } else {
            i13 -= canvas.getWidth();
            width = i13;
        }
        Rect rect = this.f17395x;
        rect.set(i13, i15, width, i17);
        canvas.drawRect(rect, paint2);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z4) {
        return this.f17394w.f1837d;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.f17394w.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        this.f17394w.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }
}
