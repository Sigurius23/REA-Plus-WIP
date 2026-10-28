package kr;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import hm.C17417d;
import java.util.BitSet;
import java.util.Objects;
import p006a4.AbstractC0354a;
import p258jr.C21890a;
import p657yq.C39707a;

/* JADX INFO: renamed from: kr.g */
/* JADX INFO: loaded from: classes6.dex */
public class C22788g extends Drawable implements InterfaceC22803v {

    /* JADX INFO: renamed from: X */
    public static final Paint f89728X;

    /* JADX INFO: renamed from: E */
    public boolean f89729E;

    /* JADX INFO: renamed from: F */
    public final Matrix f89730F;

    /* JADX INFO: renamed from: G */
    public final Path f89731G;

    /* JADX INFO: renamed from: H */
    public final Path f89732H;

    /* JADX INFO: renamed from: I */
    public final RectF f89733I;

    /* JADX INFO: renamed from: J */
    public final RectF f89734J;

    /* JADX INFO: renamed from: K */
    public final Region f89735K;

    /* JADX INFO: renamed from: L */
    public final Region f89736L;

    /* JADX INFO: renamed from: M */
    public C22792k f89737M;

    /* JADX INFO: renamed from: N */
    public final Paint f89738N;

    /* JADX INFO: renamed from: O */
    public final Paint f89739O;

    /* JADX INFO: renamed from: P */
    public final C21890a f89740P;

    /* JADX INFO: renamed from: Q */
    public final C17417d f89741Q;

    /* JADX INFO: renamed from: R */
    public final C22794m f89742R;

    /* JADX INFO: renamed from: S */
    public PorterDuffColorFilter f89743S;

    /* JADX INFO: renamed from: T */
    public PorterDuffColorFilter f89744T;

    /* JADX INFO: renamed from: U */
    public int f89745U;

    /* JADX INFO: renamed from: V */
    public final RectF f89746V;

    /* JADX INFO: renamed from: W */
    public boolean f89747W;

    /* JADX INFO: renamed from: w */
    public C22787f f89748w;

    /* JADX INFO: renamed from: x */
    public final AbstractC22801t[] f89749x;

    /* JADX INFO: renamed from: y */
    public final AbstractC22801t[] f89750y;

    /* JADX INFO: renamed from: z */
    public final BitSet f89751z;

    static {
        Paint paint = new Paint(1);
        f89728X = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C22788g() {
        this(new C22792k());
    }

    /* JADX INFO: renamed from: b */
    public final void m66001b(RectF rectF, Path path) {
        C22787f c22787f = this.f89748w;
        this.f89742R.m66030a(c22787f.f89710a, c22787f.f89719j, rectF, this.f89741Q, path);
        if (this.f89748w.f89718i != 1.0f) {
            Matrix matrix = this.f89730F;
            matrix.reset();
            float f13 = this.f89748w.f89718i;
            matrix.setScale(f13, f13, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f89746V, true);
    }

    /* JADX INFO: renamed from: c */
    public final PorterDuffColorFilter m66002c(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z4) {
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z4) {
                colorForState = m66003d(colorForState);
            }
            this.f89745U = colorForState;
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (!z4) {
            return null;
        }
        int color = paint.getColor();
        int iM66003d = m66003d(color);
        this.f89745U = iM66003d;
        if (iM66003d != color) {
            return new PorterDuffColorFilter(iM66003d, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final int m66003d(int i13) {
        C22787f c22787f = this.f89748w;
        float f13 = c22787f.f89723n + 0.0f + c22787f.f89722m;
        C39707a c39707a = c22787f.f89711b;
        return c39707a != null ? c39707a.m127046a(f13, i13) : i13;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        PorterDuffColorFilter porterDuffColorFilter = this.f89743S;
        Paint paint = this.f89738N;
        paint.setColorFilter(porterDuffColorFilter);
        int alpha = paint.getAlpha();
        int i13 = this.f89748w.f89721l;
        paint.setAlpha(((i13 + (i13 >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.f89744T;
        Paint paint2 = this.f89739O;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setStrokeWidth(this.f89748w.f89720k);
        int alpha2 = paint2.getAlpha();
        int i14 = this.f89748w.f89721l;
        paint2.setAlpha(((i14 + (i14 >>> 7)) * alpha2) >>> 8);
        boolean z4 = this.f89729E;
        Path path = this.f89731G;
        if (z4) {
            float f13 = -(m66008j() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            C22792k c22792k = this.f89748w.f89710a;
            C22791j c22791jM66029e = c22792k.m66029e();
            InterfaceC22784c c22783b = c22792k.f89770e;
            if (!(c22783b instanceof C22789h)) {
                c22783b = new C22783b(f13, c22783b);
            }
            c22791jM66029e.f89757e = c22783b;
            InterfaceC22784c c22783b2 = c22792k.f89771f;
            if (!(c22783b2 instanceof C22789h)) {
                c22783b2 = new C22783b(f13, c22783b2);
            }
            c22791jM66029e.f89758f = c22783b2;
            InterfaceC22784c c22783b3 = c22792k.f89773h;
            if (!(c22783b3 instanceof C22789h)) {
                c22783b3 = new C22783b(f13, c22783b3);
            }
            c22791jM66029e.f89760h = c22783b3;
            InterfaceC22784c c22783b4 = c22792k.f89772g;
            if (!(c22783b4 instanceof C22789h)) {
                c22783b4 = new C22783b(f13, c22783b4);
            }
            c22791jM66029e.f89759g = c22783b4;
            C22792k c22792kM66021a = c22791jM66029e.m66021a();
            this.f89737M = c22792kM66021a;
            float f14 = this.f89748w.f89719j;
            RectF rectFM66006h = m66006h();
            RectF rectF = this.f89734J;
            rectF.set(rectFM66006h);
            float strokeWidth = m66008j() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f89742R.m66030a(c22792kM66021a, f14, rectF, null, this.f89732H);
            m66001b(m66006h(), path);
            this.f89729E = false;
        }
        C22787f c22787f = this.f89748w;
        c22787f.getClass();
        if (c22787f.f89724o > 0) {
            int i15 = Build.VERSION.SDK_INT;
            if (!this.f89748w.f89710a.m66028d(m66006h()) && !path.isConvex() && i15 < 29) {
                canvas.save();
                C22787f c22787f2 = this.f89748w;
                int iSin = (int) (Math.sin(Math.toRadians(c22787f2.f89726q)) * ((double) c22787f2.f89725p));
                C22787f c22787f3 = this.f89748w;
                canvas.translate(iSin, (int) (Math.cos(Math.toRadians(c22787f3.f89726q)) * ((double) c22787f3.f89725p)));
                if (this.f89747W) {
                    RectF rectF2 = this.f89746V;
                    int iWidth = (int) (rectF2.width() - getBounds().width());
                    int iHeight = (int) (rectF2.height() - getBounds().height());
                    if (iWidth < 0 || iHeight < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f89748w.f89724o * 2) + ((int) rectF2.width()) + iWidth, (this.f89748w.f89724o * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f15 = (getBounds().left - this.f89748w.f89724o) - iWidth;
                    float f16 = (getBounds().top - this.f89748w.f89724o) - iHeight;
                    canvas2.translate(-f15, -f16);
                    m66004e(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f15, f16, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    m66004e(canvas);
                    canvas.restore();
                }
            }
        }
        C22787f c22787f4 = this.f89748w;
        Paint.Style style = c22787f4.f89727r;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            m66005f(canvas, paint, path, c22787f4.f89710a, m66006h());
        }
        if (m66008j()) {
            mo15848g(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    /* JADX INFO: renamed from: e */
    public final void m66004e(Canvas canvas) {
        if (this.f89751z.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i13 = this.f89748w.f89725p;
        Path path = this.f89731G;
        C21890a c21890a = this.f89740P;
        if (i13 != 0) {
            canvas.drawPath(path, c21890a.f84582a);
        }
        for (int i14 = 0; i14 < 4; i14++) {
            AbstractC22801t abstractC22801t = this.f89749x[i14];
            int i15 = this.f89748w.f89724o;
            Matrix matrix = AbstractC22801t.f89807b;
            abstractC22801t.mo66032a(matrix, c21890a, i15, canvas);
            this.f89750y[i14].mo66032a(matrix, c21890a, this.f89748w.f89724o, canvas);
        }
        if (this.f89747W) {
            C22787f c22787f = this.f89748w;
            int iSin = (int) (Math.sin(Math.toRadians(c22787f.f89726q)) * ((double) c22787f.f89725p));
            C22787f c22787f2 = this.f89748w;
            int iCos = (int) (Math.cos(Math.toRadians(c22787f2.f89726q)) * ((double) c22787f2.f89725p));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f89728X);
            canvas.translate(iSin, iCos);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m66005f(Canvas canvas, Paint paint, Path path, C22792k c22792k, RectF rectF) {
        if (!c22792k.m66028d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fMo65993a = c22792k.f89771f.mo65993a(rectF) * this.f89748w.f89719j;
            canvas.drawRoundRect(rectF, fMo65993a, fMo65993a, paint);
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo15848g(Canvas canvas) {
        C22792k c22792k = this.f89737M;
        RectF rectFM66006h = m66006h();
        RectF rectF = this.f89734J;
        rectF.set(rectFM66006h);
        boolean zM66008j = m66008j();
        Paint paint = this.f89739O;
        float strokeWidth = zM66008j ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        m66005f(canvas, paint, this.f89732H, c22792k, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f89748w.f89721l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f89748w;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f89748w.getClass();
        if (this.f89748w.f89710a.m66028d(m66006h())) {
            outline.setRoundRect(getBounds(), m66007i() * this.f89748w.f89719j);
        } else {
            RectF rectFM66006h = m66006h();
            Path path = this.f89731G;
            m66001b(rectFM66006h, path);
            AbstractC0354a.m955B(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f89748w.f89717h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f89735K;
        region.set(bounds);
        RectF rectFM66006h = m66006h();
        Path path = this.f89731G;
        m66001b(rectFM66006h, path);
        Region region2 = this.f89736L;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    /* JADX INFO: renamed from: h */
    public final RectF m66006h() {
        Rect bounds = getBounds();
        RectF rectF = this.f89733I;
        rectF.set(bounds);
        return rectF;
    }

    /* JADX INFO: renamed from: i */
    public final float m66007i() {
        return this.f89748w.f89710a.f89770e.mo65993a(m66006h());
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f89729E = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f89748w.f89715f;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f89748w.f89714e;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f89748w.f89713d;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.f89748w.f89712c;
        return colorStateList4 != null && colorStateList4.isStateful();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m66008j() {
        Paint.Style style = this.f89748w.f89727r;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f89739O.getStrokeWidth() > 0.0f;
    }

    /* JADX INFO: renamed from: k */
    public final void m66009k(Context context) {
        this.f89748w.f89711b = new C39707a(context);
        m66020v();
    }

    /* JADX INFO: renamed from: l */
    public final void m66010l(float f13) {
        C22787f c22787f = this.f89748w;
        if (c22787f.f89723n != f13) {
            c22787f.f89723n = f13;
            m66020v();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m66011m(ColorStateList colorStateList) {
        C22787f c22787f = this.f89748w;
        if (c22787f.f89712c != colorStateList) {
            c22787f.f89712c = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f89748w = new C22787f(this.f89748w);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final void m66012n(float f13) {
        C22787f c22787f = this.f89748w;
        if (c22787f.f89719j != f13) {
            c22787f.f89719j = f13;
            this.f89729E = true;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m66013o(Paint.Style style) {
        this.f89748w.f89727r = style;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f89729E = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z4 = m66018t(iArr) || m66019u();
        if (z4) {
            invalidateSelf();
        }
        return z4;
    }

    /* JADX INFO: renamed from: p */
    public final void m66014p() {
        this.f89740P.m62150a(-12303292);
        this.f89748w.getClass();
        super.invalidateSelf();
    }

    /* JADX INFO: renamed from: q */
    public final void m66015q(ColorStateList colorStateList) {
        C22787f c22787f = this.f89748w;
        if (c22787f.f89713d != colorStateList) {
            c22787f.f89713d = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m66016r(int i13) {
        this.f89748w.f89714e = ColorStateList.valueOf(i13);
        m66019u();
        super.invalidateSelf();
    }

    /* JADX INFO: renamed from: s */
    public final void m66017s(float f13) {
        this.f89748w.f89720k = f13;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i13) {
        C22787f c22787f = this.f89748w;
        if (c22787f.f89721l != i13) {
            c22787f.f89721l = i13;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f89748w.getClass();
        super.invalidateSelf();
    }

    @Override // kr.InterfaceC22803v
    public final void setShapeAppearanceModel(C22792k c22792k) {
        this.f89748w.f89710a = c22792k;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i13) {
        setTintList(ColorStateList.valueOf(i13));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f89748w.f89715f = colorStateList;
        m66019u();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C22787f c22787f = this.f89748w;
        if (c22787f.f89716g != mode) {
            c22787f.f89716g = mode;
            m66019u();
            super.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m66018t(int[] iArr) {
        boolean z4;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f89748w.f89712c == null || color2 == (colorForState2 = this.f89748w.f89712c.getColorForState(iArr, (color2 = (paint2 = this.f89738N).getColor())))) {
            z4 = false;
        } else {
            paint2.setColor(colorForState2);
            z4 = true;
        }
        if (this.f89748w.f89713d == null || color == (colorForState = this.f89748w.f89713d.getColorForState(iArr, (color = (paint = this.f89739O).getColor())))) {
            return z4;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m66019u() {
        PorterDuffColorFilter porterDuffColorFilter = this.f89743S;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f89744T;
        C22787f c22787f = this.f89748w;
        this.f89743S = m66002c(c22787f.f89715f, c22787f.f89716g, this.f89738N, true);
        C22787f c22787f2 = this.f89748w;
        this.f89744T = m66002c(c22787f2.f89714e, c22787f2.f89716g, this.f89739O, false);
        this.f89748w.getClass();
        return (Objects.equals(porterDuffColorFilter, this.f89743S) && Objects.equals(porterDuffColorFilter2, this.f89744T)) ? false : true;
    }

    /* JADX INFO: renamed from: v */
    public final void m66020v() {
        C22787f c22787f = this.f89748w;
        float f13 = c22787f.f89723n + 0.0f;
        c22787f.f89724o = (int) Math.ceil(0.75f * f13);
        this.f89748w.f89725p = (int) Math.ceil(f13 * 0.25f);
        m66019u();
        super.invalidateSelf();
    }

    public C22788g(Context context, AttributeSet attributeSet, int i13, int i14) {
        this(C22792k.m66026b(context, attributeSet, i13, i14).m66021a());
    }

    public C22788g(C22792k c22792k) {
        this(new C22787f(c22792k));
    }

    public C22788g(C22787f c22787f) {
        C22794m c22794m;
        this.f89749x = new AbstractC22801t[4];
        this.f89750y = new AbstractC22801t[4];
        this.f89751z = new BitSet(8);
        this.f89730F = new Matrix();
        this.f89731G = new Path();
        this.f89732H = new Path();
        this.f89733I = new RectF();
        this.f89734J = new RectF();
        this.f89735K = new Region();
        this.f89736L = new Region();
        Paint paint = new Paint(1);
        this.f89738N = paint;
        Paint paint2 = new Paint(1);
        this.f89739O = paint2;
        this.f89740P = new C21890a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c22794m = AbstractC22793l.f89778a;
        } else {
            c22794m = new C22794m();
        }
        this.f89742R = c22794m;
        this.f89746V = new RectF();
        this.f89747W = true;
        this.f89748w = c22787f;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m66019u();
        m66018t(getState());
        this.f89741Q = new C17417d(this, 27);
    }
}
