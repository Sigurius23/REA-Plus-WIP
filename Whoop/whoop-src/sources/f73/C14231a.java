package f73;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import u00.C34377e;

/* JADX INFO: renamed from: f73.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C14231a extends Drawable {

    /* JADX INFO: renamed from: a */
    public final int f51987a;

    /* JADX INFO: renamed from: b */
    public final int f51988b;

    /* JADX INFO: renamed from: c */
    public final Paint f51989c = new Paint(1);

    /* JADX INFO: renamed from: d */
    public final RectF f51990d = new RectF();

    /* JADX INFO: renamed from: e */
    public final Paint f51991e;

    /* JADX INFO: renamed from: f */
    public final Path f51992f;

    /* JADX INFO: renamed from: g */
    public boolean f51993g;

    static {
        new C34377e(0.3888889f, 0.6944444f);
        new C34377e(0.8472222f, 0.2638889f);
    }

    public C14231a(int i13, int i14, int i15) {
        Paint paint = new Paint(1);
        this.f51991e = paint;
        this.f51992f = new Path();
        this.f51987a = i13;
        this.f51988b = i14;
        paint.setColor(i15);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint.Style style;
        int i13;
        if (this.f51993g) {
            style = Paint.Style.FILL_AND_STROKE;
            i13 = this.f51987a;
        } else {
            style = Paint.Style.STROKE;
            i13 = this.f51988b;
        }
        Paint paint = this.f51989c;
        paint.setStyle(style);
        paint.setColor(i13);
        Rect bounds = getBounds();
        float fWidth = bounds.width();
        RectF rectF = this.f51990d;
        float fWidth2 = (fWidth - rectF.width()) / 2.0f;
        float fHeight = (bounds.height() - rectF.height()) / 2.0f;
        float fWidth3 = rectF.width() / 8.0f;
        int iSave = canvas.save();
        try {
            canvas.translate(fWidth2, fHeight);
            canvas.drawRoundRect(rectF, fWidth3, fWidth3, paint);
            if (this.f51993g) {
                canvas.drawPath(this.f51992f, this.f51991e);
            }
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float fMin = Math.min(rect.width(), rect.height());
        float f13 = fMin / 8.0f;
        float f14 = fMin - f13;
        this.f51990d.set(0.0f, 0.0f, f14, f14);
        this.f51989c.setStrokeWidth(f13);
        this.f51991e.setStrokeWidth(f13);
        Path path = this.f51992f;
        path.reset();
        path.moveTo(0.15277778f * f14, 0.45833334f * f14);
        path.lineTo(0.3888889f * f14, 0.6944444f * f14);
        path.lineTo(0.8472222f * f14, f14 * 0.2638889f);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z4;
        int length = iArr != null ? iArr.length : 0;
        if (length <= 0) {
            z4 = false;
            break;
        }
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                z4 = false;
                break;
            }
            if (16842912 == iArr[i13]) {
                z4 = true;
                break;
            }
            i13++;
        }
        boolean z13 = z4 != this.f51993g;
        if (z13) {
            invalidateSelf();
            this.f51993g = z4;
        }
        return z13;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        this.f51989c.setAlpha(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f51989c.setColorFilter(colorFilter);
    }
}
