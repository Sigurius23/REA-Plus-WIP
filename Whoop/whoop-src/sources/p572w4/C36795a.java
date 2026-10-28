package p572w4;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.Gravity;

/* JADX INFO: renamed from: w4.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C36795a extends Drawable {

    /* JADX INFO: renamed from: a */
    public final Bitmap f157411a;

    /* JADX INFO: renamed from: b */
    public final int f157412b;

    /* JADX INFO: renamed from: e */
    public final BitmapShader f157415e;

    /* JADX INFO: renamed from: g */
    public float f157417g;

    /* JADX INFO: renamed from: k */
    public boolean f157421k;

    /* JADX INFO: renamed from: l */
    public final int f157422l;

    /* JADX INFO: renamed from: m */
    public final int f157423m;

    /* JADX INFO: renamed from: c */
    public final int f157413c = 119;

    /* JADX INFO: renamed from: d */
    public final Paint f157414d = new Paint(3);

    /* JADX INFO: renamed from: f */
    public final Matrix f157416f = new Matrix();

    /* JADX INFO: renamed from: h */
    public final Rect f157418h = new Rect();

    /* JADX INFO: renamed from: i */
    public final RectF f157419i = new RectF();

    /* JADX INFO: renamed from: j */
    public boolean f157420j = true;

    public C36795a(Resources resources, Bitmap bitmap) {
        this.f157412b = 160;
        if (resources != null) {
            this.f157412b = resources.getDisplayMetrics().densityDpi;
        }
        this.f157411a = bitmap;
        if (bitmap == null) {
            this.f157423m = -1;
            this.f157422l = -1;
            this.f157415e = null;
        } else {
            int i13 = this.f157412b;
            this.f157422l = bitmap.getScaledWidth(i13);
            this.f157423m = bitmap.getScaledHeight(i13);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f157415e = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m117918a(int i13, int i14, int i15, Rect rect, Rect rect2) {
        Gravity.apply(i13, i14, i15, rect, rect2, 0);
    }

    /* JADX INFO: renamed from: b */
    public final void m117919b() {
        if (this.f157420j) {
            boolean z4 = this.f157421k;
            Rect rect = this.f157418h;
            if (z4) {
                int iMin = Math.min(this.f157422l, this.f157423m);
                m117918a(this.f157413c, iMin, iMin, getBounds(), this.f157418h);
                int iMin2 = Math.min(rect.width(), rect.height());
                rect.inset(Math.max(0, (rect.width() - iMin2) / 2), Math.max(0, (rect.height() - iMin2) / 2));
                this.f157417g = iMin2 * 0.5f;
            } else {
                m117918a(this.f157413c, this.f157422l, this.f157423m, getBounds(), this.f157418h);
            }
            RectF rectF = this.f157419i;
            rectF.set(rect);
            BitmapShader bitmapShader = this.f157415e;
            if (bitmapShader != null) {
                float f13 = rectF.left;
                float f14 = rectF.top;
                Matrix matrix = this.f157416f;
                matrix.setTranslate(f13, f14);
                float fWidth = rectF.width();
                Bitmap bitmap = this.f157411a;
                matrix.preScale(fWidth / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.f157414d.setShader(bitmapShader);
            }
            this.f157420j = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f157411a;
        if (bitmap == null) {
            return;
        }
        m117919b();
        Paint paint = this.f157414d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f157418h, paint);
            return;
        }
        RectF rectF = this.f157419i;
        float f13 = this.f157417g;
        canvas.drawRoundRect(rectF, f13, f13, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f157414d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f157414d.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f157423m;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f157422l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Bitmap bitmap;
        return (this.f157413c != 119 || this.f157421k || (bitmap = this.f157411a) == null || bitmap.hasAlpha() || this.f157414d.getAlpha() < 255 || this.f157417g > 0.05f) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        m117919b();
        outline.setRoundRect(this.f157418h, this.f157417g);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f157421k) {
            this.f157417g = Math.min(this.f157423m, this.f157422l) / 2;
        }
        this.f157420j = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        Paint paint = this.f157414d;
        if (i13 != paint.getAlpha()) {
            paint.setAlpha(i13);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f157414d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z4) {
        this.f157414d.setDither(z4);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z4) {
        this.f157414d.setFilterBitmap(z4);
        invalidateSelf();
    }
}
