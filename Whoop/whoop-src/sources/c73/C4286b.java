package c73;

import a73.C0530e;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import p522uf.AbstractC34870c0;

/* JADX INFO: renamed from: c73.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C4286b implements LeadingMarginSpan {

    /* JADX INFO: renamed from: E */
    public final int f17389E;

    /* JADX INFO: renamed from: w */
    public final C0530e f17390w;

    /* JADX INFO: renamed from: x */
    public final Paint f17391x = AbstractC4292h.f17409c;

    /* JADX INFO: renamed from: y */
    public final RectF f17392y = AbstractC4292h.f17408b;

    /* JADX INFO: renamed from: z */
    public final Rect f17393z = AbstractC4292h.f17407a;

    public C4286b(C0530e c0530e, int i13) {
        this.f17390w = c0530e;
        this.f17389E = i13;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i13, int i14, int i15, int i16, int i17, CharSequence charSequence, int i18, int i19, boolean z4, Layout layout) {
        RectF rectF = this.f17392y;
        Rect rect = this.f17393z;
        if (z4 && AbstractC34870c0.m110003j0(charSequence, this, i18)) {
            Paint paint2 = this.f17391x;
            paint2.set(paint);
            C0530e c0530e = this.f17390w;
            c0530e.getClass();
            int i24 = c0530e.f1834a;
            paint2.setColor(paint2.getColor());
            int i25 = c0530e.f1836c;
            if (i25 != 0) {
                paint2.setStrokeWidth(i25);
            }
            int iSave = canvas.save();
            try {
                int iMin = Math.min(i24, (int) ((paint2.descent() - paint2.ascent()) + 0.5f)) / 2;
                int i26 = (i24 - iMin) / 2;
                if (i14 <= 0) {
                    i13 -= i24;
                }
                int i27 = i13 + i26;
                int i28 = i27 + iMin;
                int iDescent = (i16 + ((int) (((paint2.descent() + paint2.ascent()) / 2.0f) + 0.5f))) - (iMin / 2);
                int i29 = iMin + iDescent;
                int i34 = this.f17389E;
                if (i34 == 0 || i34 == 1) {
                    rectF.set(i27, iDescent, i28, i29);
                    paint2.setStyle(i34 == 0 ? Paint.Style.FILL : Paint.Style.STROKE);
                    canvas.drawOval(rectF, paint2);
                } else {
                    rect.set(i27, iDescent, i28, i29);
                    paint2.setStyle(Paint.Style.FILL);
                    canvas.drawRect(rect, paint2);
                }
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z4) {
        return this.f17390w.f1834a;
    }
}
