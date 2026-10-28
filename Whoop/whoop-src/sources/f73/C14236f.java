package f73;

import a73.C0530e;
import android.R;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import p522uf.AbstractC34870c0;

/* JADX INFO: renamed from: f73.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C14236f implements LeadingMarginSpan {

    /* JADX INFO: renamed from: w */
    public final C0530e f51999w;

    /* JADX INFO: renamed from: x */
    public final C14231a f52000x;

    /* JADX INFO: renamed from: y */
    public final boolean f52001y;

    /* JADX INFO: renamed from: z */
    public static final int[] f51998z = {R.attr.state_checked};

    /* JADX INFO: renamed from: E */
    public static final int[] f51997E = new int[0];

    public C14236f(C0530e c0530e, C14231a c14231a, boolean z4) {
        this.f51999w = c0530e;
        this.f52000x = c14231a;
        this.f52001y = z4;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i13, int i14, int i15, int i16, int i17, CharSequence charSequence, int i18, int i19, boolean z4, Layout layout) {
        C14231a c14231a = this.f52000x;
        if (z4 && AbstractC34870c0.m110003j0(charSequence, this, i18)) {
            float fDescent = paint.descent();
            float fAscent = paint.ascent();
            int iSave = canvas.save();
            try {
                int i24 = this.f51999w.f1834a;
                int i25 = (int) ((fDescent - fAscent) + 0.5f);
                int i26 = (int) ((i24 * 0.75f) + 0.5f);
                int i27 = (int) ((i25 * 0.75f) + 0.5f);
                c14231a.setBounds(0, 0, i26, i27);
                c14231a.setState(this.f52001y ? f51998z : f51997E);
                canvas.translate(i14 > 0 ? i13 + ((i24 - i26) / 2) : (i13 - ((i24 - i26) / 2)) - i26, ((int) (i16 + fAscent + 0.5f)) + ((i25 - i27) / 2));
                c14231a.draw(canvas);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z4) {
        return this.f51999w.f1834a;
    }
}
