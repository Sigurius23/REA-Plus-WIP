package c73;

import a73.C0530e;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import p522uf.AbstractC34870c0;

/* JADX INFO: renamed from: c73.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C4293i implements LeadingMarginSpan {

    /* JADX INFO: renamed from: w */
    public final C0530e f17410w;

    /* JADX INFO: renamed from: x */
    public final String f17411x;

    /* JADX INFO: renamed from: y */
    public final Paint f17412y = AbstractC4292h.f17409c;

    /* JADX INFO: renamed from: z */
    public int f17413z;

    public C4293i(C0530e c0530e, String str) {
        this.f17410w = c0530e;
        this.f17411x = str;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i13, int i14, int i15, int i16, int i17, CharSequence charSequence, int i18, int i19, boolean z4, Layout layout) {
        int i24;
        if (z4 && AbstractC34870c0.m110003j0(charSequence, this, i18)) {
            Paint paint2 = this.f17412y;
            paint2.set(paint);
            C0530e c0530e = this.f17410w;
            c0530e.getClass();
            paint2.setColor(paint2.getColor());
            int i25 = c0530e.f1836c;
            if (i25 != 0) {
                paint2.setStrokeWidth(i25);
            }
            String str = this.f17411x;
            int iMeasureText = (int) (paint2.measureText(str) + 0.5f);
            int i26 = c0530e.f1834a;
            if (iMeasureText > i26) {
                this.f17413z = iMeasureText;
                i26 = iMeasureText;
            } else {
                this.f17413z = 0;
            }
            if (i14 > 0) {
                i24 = ((i26 * i14) + i13) - iMeasureText;
            } else {
                i24 = (i26 - iMeasureText) + (i14 * i26) + i13;
            }
            canvas.drawText(str, i24, i16, paint2);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z4) {
        return Math.max(this.f17413z, this.f17410w.f1834a);
    }
}
