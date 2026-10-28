package p666z;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: z.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C39917a extends Drawable {

    /* JADX INFO: renamed from: a */
    public float f172325a;

    /* JADX INFO: renamed from: b */
    public final Paint f172326b;

    /* JADX INFO: renamed from: c */
    public final RectF f172327c;

    /* JADX INFO: renamed from: d */
    public final Rect f172328d;

    /* JADX INFO: renamed from: e */
    public float f172329e;

    /* JADX INFO: renamed from: h */
    public ColorStateList f172332h;

    /* JADX INFO: renamed from: i */
    public PorterDuffColorFilter f172333i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f172334j;

    /* JADX INFO: renamed from: f */
    public boolean f172330f = false;

    /* JADX INFO: renamed from: g */
    public boolean f172331g = true;

    /* JADX INFO: renamed from: k */
    public PorterDuff.Mode f172335k = PorterDuff.Mode.SRC_IN;

    public C39917a(ColorStateList colorStateList, float f13) {
        this.f172325a = f13;
        Paint paint = new Paint(5);
        this.f172326b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f172332h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f172332h.getDefaultColor()));
        this.f172327c = new RectF();
        this.f172328d = new Rect();
    }

    /* JADX INFO: renamed from: a */
    public final PorterDuffColorFilter m128080a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* JADX INFO: renamed from: b */
    public final void m128081b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        float f13 = rect.left;
        float f14 = rect.top;
        float f15 = rect.right;
        float f16 = rect.bottom;
        RectF rectF = this.f172327c;
        rectF.set(f13, f14, f15, f16);
        Rect rect2 = this.f172328d;
        rect2.set(rect);
        if (this.f172330f) {
            rect2.inset((int) Math.ceil(AbstractC39918b.m128082a(this.f172329e, this.f172325a, this.f172331g)), (int) Math.ceil(AbstractC39918b.m128083b(this.f172329e, this.f172325a, this.f172331g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z4;
        PorterDuffColorFilter porterDuffColorFilter = this.f172333i;
        Paint paint = this.f172326b;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z4 = false;
        } else {
            paint.setColorFilter(this.f172333i);
            z4 = true;
        }
        RectF rectF = this.f172327c;
        float f13 = this.f172325a;
        canvas.drawRoundRect(rectF, f13, f13, paint);
        if (z4) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f172328d, this.f172325a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f172334j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f172332h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m128081b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f172332h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f172326b;
        boolean z4 = colorForState != paint.getColor();
        if (z4) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f172334j;
        if (colorStateList2 == null || (mode = this.f172335k) == null) {
            return z4;
        }
        this.f172333i = m128080a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        this.f172326b.setAlpha(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f172326b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f172334j = colorStateList;
        this.f172333i = m128080a(colorStateList, this.f172335k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f172335k = mode;
        this.f172333i = m128080a(this.f172334j, mode);
        invalidateSelf();
    }
}
