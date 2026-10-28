package c73;

import a73.C0530e;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import p507tx.AbstractC34235f;

/* JADX INFO: renamed from: c73.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C4285a implements LeadingMarginSpan {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17385w;

    /* JADX INFO: renamed from: x */
    public final C0530e f17386x;

    /* JADX INFO: renamed from: y */
    public final Rect f17387y;

    /* JADX INFO: renamed from: z */
    public final Paint f17388z;

    public C4285a(C0530e c0530e, int i13) {
        this.f17385w = i13;
        switch (i13) {
            case 1:
                this.f17387y = AbstractC4292h.f17407a;
                this.f17388z = AbstractC4292h.f17409c;
                this.f17386x = c0530e;
                break;
            default:
                this.f17387y = AbstractC4292h.f17407a;
                this.f17388z = AbstractC4292h.f17409c;
                this.f17386x = c0530e;
                break;
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i13, int i14, int i15, int i16, int i17, CharSequence charSequence, int i18, int i19, boolean z4, Layout layout) {
        int width;
        switch (this.f17385w) {
            case 0:
                C0530e c0530e = this.f17386x;
                int i24 = c0530e.f1835b;
                if (i24 == 0) {
                    i24 = (int) ((c0530e.f1834a * 0.25f) + 0.5f);
                }
                Paint paint2 = this.f17388z;
                paint2.set(paint);
                c0530e.getClass();
                int iM108234t = AbstractC34235f.m108234t(paint2.getColor(), 25);
                paint2.setStyle(Paint.Style.FILL);
                paint2.setColor(iM108234t);
                int i25 = i14 * i24;
                int i26 = i13 + i25;
                int i27 = i25 + i26;
                int iMin = Math.min(i26, i27);
                int iMax = Math.max(i26, i27);
                Rect rect = this.f17387y;
                rect.set(iMin, i15, iMax, i17);
                canvas.drawRect(rect, paint2);
                break;
            default:
                int i28 = ((i17 - i15) / 2) + i15;
                Paint paint3 = this.f17388z;
                paint3.set(paint);
                C0530e c0530e2 = this.f17386x;
                c0530e2.getClass();
                paint3.setColor(AbstractC34235f.m108234t(paint3.getColor(), 25));
                paint3.setStyle(Paint.Style.FILL);
                int i29 = c0530e2.f1839f;
                if (i29 >= 0) {
                    paint3.setStrokeWidth(i29);
                }
                int strokeWidth = (int) ((((int) (paint3.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
                if (i14 > 0) {
                    width = canvas.getWidth();
                } else {
                    width = i13;
                    i13 -= canvas.getWidth();
                }
                int i34 = i28 - strokeWidth;
                int i35 = i28 + strokeWidth;
                Rect rect2 = this.f17387y;
                rect2.set(i13, i34, width, i35);
                canvas.drawRect(rect2, paint3);
                break;
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z4) {
        switch (this.f17385w) {
            case 0:
                return this.f17386x.f1834a;
            default:
                return 0;
        }
    }
}
