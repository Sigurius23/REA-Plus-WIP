package e73;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import c73.AbstractC4295k;
import c73.C4294j;
import g73.AbstractC15554b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p047c9.C4320k;
import p507tx.AbstractC34235f;
import p522uf.AbstractC34870c0;
import z63.C40135g;

/* JADX INFO: renamed from: e73.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C12806e extends ReplacementSpan {

    /* JADX INFO: renamed from: E */
    public final boolean f43832E;

    /* JADX INFO: renamed from: F */
    public final boolean f43833F;

    /* JADX INFO: renamed from: I */
    public int f43836I;

    /* JADX INFO: renamed from: J */
    public int f43837J;

    /* JADX INFO: renamed from: w */
    public final C4320k f43838w;

    /* JADX INFO: renamed from: x */
    public final List f43839x;

    /* JADX INFO: renamed from: y */
    public final ArrayList f43840y;

    /* JADX INFO: renamed from: G */
    public final Rect f43834G = new Rect();

    /* JADX INFO: renamed from: H */
    public final Paint f43835H = new Paint(1);

    /* JADX INFO: renamed from: z */
    public final TextPaint f43841z = new TextPaint();

    public C12806e(C4320k c4320k, ArrayList arrayList, boolean z4, boolean z13) {
        this.f43838w = c4320k;
        this.f43839x = arrayList;
        this.f43840y = new ArrayList(arrayList.size());
        this.f43832E = z4;
        this.f43833F = z13;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i13, int i14, float f13, int i15, int i16, int i17, Paint paint) {
        int width;
        boolean z4;
        Layout.Alignment alignment;
        Class<C4294j> cls = C4294j.class;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            C4294j[] c4294jArr = (C4294j[]) spanned.getSpans(0, spanned.length(), cls);
            Layout layout = (c4294jArr == null || c4294jArr.length <= 0) ? null : (Layout) c4294jArr[0].f17414a.get();
            if (layout != null) {
                width = layout.getWidth();
            } else {
                AbstractC4295k[] abstractC4295kArr = (AbstractC4295k[]) spanned.getSpans(0, spanned.length(), AbstractC4295k.class);
                if (abstractC4295kArr != null && abstractC4295kArr.length > 0) {
                    AbstractC4295k abstractC4295k = abstractC4295kArr[0];
                    throw null;
                }
                width = canvas.getWidth();
            }
        } else {
            width = canvas.getWidth();
        }
        int i18 = this.f43836I;
        boolean z13 = this.f43832E;
        ArrayList arrayList = this.f43840y;
        C4320k c4320k = this.f43838w;
        if (i18 != width) {
            this.f43836I = width;
            boolean z14 = paint instanceof TextPaint;
            TextPaint textPaint = this.f43841z;
            if (z14) {
                textPaint.set((TextPaint) paint);
            } else {
                textPaint.set(paint);
            }
            textPaint.setFakeBoldText(z13);
            List list = this.f43839x;
            int size = ((int) (((this.f43836I * 1.0f) / list.size()) + 0.5f)) - (c4320k.f17541x * 2);
            arrayList.clear();
            int size2 = list.size();
            int i19 = 0;
            while (i19 < size2) {
                C12805d c12805d = (C12805d) list.get(i19);
                List list2 = list;
                C40135g c40135g = c12805d.f43831b;
                int i24 = c12805d.f43830a;
                if (i24 != 1) {
                    alignment = i24 != 2 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                } else {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                }
                StaticLayout staticLayout = new StaticLayout(c40135g, textPaint, size, alignment, 1.0f, 0.0f, false);
                int i25 = size2;
                boolean z15 = z13;
                C4294j[] c4294jArr2 = (C4294j[]) c40135g.getSpans(0, c40135g.length(), cls);
                if (c4294jArr2 != null) {
                    int length = c4294jArr2.length;
                    int i26 = 0;
                    while (i26 < length) {
                        int i27 = i26;
                        c40135g.removeSpan(c4294jArr2[i27]);
                        i26 = i27 + 1;
                    }
                }
                c40135g.setSpan(new C4294j(staticLayout), 0, c40135g.length(), 18);
                AbstractC15554b[] abstractC15554bArr = (AbstractC15554b[]) c40135g.getSpans(0, c40135g.length(), AbstractC15554b.class);
                if (abstractC15554bArr != null && abstractC15554bArr.length > 0 && abstractC15554bArr.length > 0) {
                    AbstractC15554b abstractC15554b = abstractC15554bArr[0];
                    throw null;
                }
                arrayList.add(i19, staticLayout);
                i19++;
                size2 = i25;
                z13 = z15;
                cls = cls;
                list = list2;
            }
        }
        boolean z16 = z13;
        int i28 = c4320k.f17541x;
        int size3 = arrayList.size();
        int i29 = this.f43836I;
        int i34 = (int) (((i29 * 1.0f) / size3) + 0.5f);
        int i35 = i34 - (i29 / size3);
        Paint paint2 = this.f43835H;
        if (!z16 && this.f43833F) {
            paint2.setColor(AbstractC34235f.m108234t(paint2.getColor(), 22));
            paint2.setStyle(Paint.Style.FILL);
        } else {
            paint2.setColor(0);
            paint2.setStyle(Paint.Style.FILL);
        }
        int color = paint2.getColor();
        Rect rect = this.f43834G;
        if (color != 0) {
            int iSave = canvas.save();
            try {
                rect.set(0, 0, this.f43836I, i17 - i15);
                canvas.translate(f13, i15);
                canvas.drawRect(rect, paint2);
                canvas.restoreToCount(iSave);
            } catch (Throwable th3) {
                canvas.restoreToCount(iSave);
                throw th3;
            }
        }
        paint2.set(paint);
        paint2.setColor(AbstractC34235f.m108234t(paint2.getColor(), 75));
        paint2.setStyle(Paint.Style.FILL);
        int strokeWidth = c4320k.f17542y;
        if (strokeWidth == -1) {
            strokeWidth = (int) (paint2.getStrokeWidth() + 0.5f);
        }
        boolean z17 = strokeWidth > 0;
        int i36 = i17 - i15;
        int i37 = (i36 - this.f43837J) / 4;
        if (z17) {
            C12807f[] c12807fArr = (C12807f[]) ((Spanned) charSequence).getSpans(i13, i14, C12807f.class);
            if (c12807fArr == null || c12807fArr.length <= 0 || !AbstractC34870c0.m110003j0(charSequence, c12807fArr[0], i13)) {
                z4 = false;
            } else {
                rect.set((int) f13, i15, this.f43836I, i15 + strokeWidth);
                canvas.drawRect(rect, paint2);
                z4 = true;
            }
            rect.set((int) f13, i17 - strokeWidth, this.f43836I, i17);
            canvas.drawRect(rect, paint2);
        } else {
            z4 = false;
        }
        int i38 = strokeWidth / 2;
        int i39 = z4 ? strokeWidth : 0;
        int i44 = i36 - strokeWidth;
        int i45 = 0;
        int height = 0;
        while (i45 < size3) {
            Layout layout2 = (Layout) arrayList.get(i45);
            int iSave2 = canvas.save();
            int i46 = size3;
            try {
                canvas.translate(f13 + (i45 * i34), i15);
                if (z17) {
                    if (i45 == 0) {
                        rect.set(0, i39, strokeWidth, i44);
                    } else {
                        rect.set(-i38, i39, i38, i44);
                    }
                    canvas.drawRect(rect, paint2);
                    if (i45 == i46 - 1) {
                        rect.set((i34 - strokeWidth) - i35, i39, i34 - i35, i44);
                        canvas.drawRect(rect, paint2);
                    }
                }
                int i47 = i28;
                int i48 = i38;
                canvas.translate(i47, i47 + i37);
                layout2.draw(canvas);
                if (layout2.getHeight() > height) {
                    height = layout2.getHeight();
                }
                canvas.restoreToCount(iSave2);
                i45++;
                i38 = i48;
                i28 = i47;
                size3 = i46;
            } catch (Throwable th4) {
                canvas.restoreToCount(iSave2);
                throw th4;
            }
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i13, int i14, Paint.FontMetricsInt fontMetricsInt) {
        ArrayList arrayList = this.f43840y;
        if (arrayList.size() > 0 && fontMetricsInt != null) {
            Iterator it = arrayList.iterator();
            int i15 = 0;
            while (it.hasNext()) {
                int height = ((Layout) it.next()).getHeight();
                if (height > i15) {
                    i15 = height;
                }
            }
            this.f43837J = i15;
            int i16 = -((this.f43838w.f17541x * 2) + i15);
            fontMetricsInt.ascent = i16;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i16;
            fontMetricsInt.bottom = 0;
        }
        return this.f43836I;
    }
}
