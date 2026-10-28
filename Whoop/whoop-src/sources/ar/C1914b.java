package ar;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import kr.AbstractC22793l;
import kr.C22792k;
import kr.C22794m;
import kr.InterfaceC22784c;
import p006a4.AbstractC0354a;
import p543v4.AbstractC35642a;

/* JADX INFO: renamed from: ar.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C1914b extends Drawable {

    /* JADX INFO: renamed from: b */
    public final Paint f7568b;

    /* JADX INFO: renamed from: h */
    public float f7574h;

    /* JADX INFO: renamed from: i */
    public int f7575i;

    /* JADX INFO: renamed from: j */
    public int f7576j;

    /* JADX INFO: renamed from: k */
    public int f7577k;

    /* JADX INFO: renamed from: l */
    public int f7578l;

    /* JADX INFO: renamed from: m */
    public int f7579m;

    /* JADX INFO: renamed from: o */
    public C22792k f7581o;

    /* JADX INFO: renamed from: p */
    public ColorStateList f7582p;

    /* JADX INFO: renamed from: a */
    public final C22794m f7567a = AbstractC22793l.f89778a;

    /* JADX INFO: renamed from: c */
    public final Path f7569c = new Path();

    /* JADX INFO: renamed from: d */
    public final Rect f7570d = new Rect();

    /* JADX INFO: renamed from: e */
    public final RectF f7571e = new RectF();

    /* JADX INFO: renamed from: f */
    public final RectF f7572f = new RectF();

    /* JADX INFO: renamed from: g */
    public final C1913a f7573g = new C1913a(this);

    /* JADX INFO: renamed from: n */
    public boolean f7580n = true;

    public C1914b(C22792k c22792k) {
        this.f7581o = c22792k;
        Paint paint = new Paint(1);
        this.f7568b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z4 = this.f7580n;
        Rect rect = this.f7570d;
        Paint paint = this.f7568b;
        if (z4) {
            copyBounds(rect);
            float fHeight = this.f7574h / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{AbstractC35642a.m112836e(this.f7575i, this.f7579m), AbstractC35642a.m112836e(this.f7576j, this.f7579m), AbstractC35642a.m112836e(AbstractC35642a.m112838g(this.f7576j, 0), this.f7579m), AbstractC35642a.m112836e(AbstractC35642a.m112838g(this.f7578l, 0), this.f7579m), AbstractC35642a.m112836e(this.f7578l, this.f7579m), AbstractC35642a.m112836e(this.f7577k, this.f7579m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP));
            this.f7580n = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.f7571e;
        rectF.set(rect);
        InterfaceC22784c interfaceC22784c = this.f7581o.f89770e;
        Rect bounds = getBounds();
        RectF rectF2 = this.f7572f;
        rectF2.set(bounds);
        float fMin = Math.min(interfaceC22784c.mo65993a(rectF2), rectF.width() / 2.0f);
        C22792k c22792k = this.f7581o;
        rectF2.set(getBounds());
        if (c22792k.m66028d(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, fMin, fMin, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f7573g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f7574h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        C22792k c22792k = this.f7581o;
        Rect bounds = getBounds();
        RectF rectF = this.f7572f;
        rectF.set(bounds);
        if (c22792k.m66028d(rectF)) {
            InterfaceC22784c interfaceC22784c = this.f7581o.f89770e;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), interfaceC22784c.mo65993a(rectF));
            return;
        }
        Rect rect = this.f7570d;
        copyBounds(rect);
        RectF rectF2 = this.f7571e;
        rectF2.set(rect);
        C22792k c22792k2 = this.f7581o;
        C22794m c22794m = this.f7567a;
        Path path = this.f7569c;
        c22794m.m66030a(c22792k2, 1.0f, rectF2, null, path);
        AbstractC0354a.m955B(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        C22792k c22792k = this.f7581o;
        Rect bounds = getBounds();
        RectF rectF = this.f7572f;
        rectF.set(bounds);
        if (!c22792k.m66028d(rectF)) {
            return true;
        }
        int iRound = Math.round(this.f7574h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f7582p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f7580n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f7582p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f7579m)) != this.f7579m) {
            this.f7580n = true;
            this.f7579m = colorForState;
        }
        if (this.f7580n) {
            invalidateSelf();
        }
        return this.f7580n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        this.f7568b.setAlpha(i13);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f7568b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
