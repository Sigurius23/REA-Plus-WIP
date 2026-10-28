package cr;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewGroup;
import hr.C17571a;
import hr.C17574d;
import java.util.WeakHashMap;
import p031b9.AbstractC2875y;
import p079d2.AbstractC11480b;
import p137f5.AbstractC14087f;
import p184h5.AbstractC16901p0;
import p186h8.C16999a;
import p287kq.AbstractC22766a;
import p463rj.AbstractC31479j;
import p463rj.AbstractC31484o;

/* JADX INFO: renamed from: cr.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C11065c {

    /* JADX INFO: renamed from: A */
    public Typeface f34934A;

    /* JADX INFO: renamed from: B */
    public Typeface f34935B;

    /* JADX INFO: renamed from: C */
    public Typeface f34936C;

    /* JADX INFO: renamed from: D */
    public C17571a f34937D;

    /* JADX INFO: renamed from: E */
    public C17571a f34938E;

    /* JADX INFO: renamed from: G */
    public CharSequence f34940G;

    /* JADX INFO: renamed from: H */
    public CharSequence f34941H;

    /* JADX INFO: renamed from: I */
    public boolean f34942I;

    /* JADX INFO: renamed from: K */
    public Bitmap f34944K;

    /* JADX INFO: renamed from: L */
    public float f34945L;

    /* JADX INFO: renamed from: M */
    public float f34946M;

    /* JADX INFO: renamed from: N */
    public float f34947N;

    /* JADX INFO: renamed from: O */
    public float f34948O;

    /* JADX INFO: renamed from: P */
    public float f34949P;

    /* JADX INFO: renamed from: Q */
    public int f34950Q;

    /* JADX INFO: renamed from: R */
    public int[] f34951R;

    /* JADX INFO: renamed from: S */
    public boolean f34952S;

    /* JADX INFO: renamed from: T */
    public final TextPaint f34953T;

    /* JADX INFO: renamed from: U */
    public final TextPaint f34954U;

    /* JADX INFO: renamed from: V */
    public TimeInterpolator f34955V;

    /* JADX INFO: renamed from: W */
    public TimeInterpolator f34956W;

    /* JADX INFO: renamed from: X */
    public float f34957X;

    /* JADX INFO: renamed from: Y */
    public float f34958Y;

    /* JADX INFO: renamed from: Z */
    public float f34959Z;

    /* JADX INFO: renamed from: a */
    public final ViewGroup f34960a;

    /* JADX INFO: renamed from: a0 */
    public ColorStateList f34961a0;

    /* JADX INFO: renamed from: b */
    public float f34962b;

    /* JADX INFO: renamed from: b0 */
    public float f34963b0;

    /* JADX INFO: renamed from: c */
    public boolean f34964c;

    /* JADX INFO: renamed from: c0 */
    public float f34965c0;

    /* JADX INFO: renamed from: d */
    public float f34966d;

    /* JADX INFO: renamed from: d0 */
    public float f34967d0;

    /* JADX INFO: renamed from: e */
    public float f34968e;

    /* JADX INFO: renamed from: e0 */
    public ColorStateList f34969e0;

    /* JADX INFO: renamed from: f */
    public int f34970f;

    /* JADX INFO: renamed from: f0 */
    public float f34971f0;

    /* JADX INFO: renamed from: g */
    public final Rect f34972g;

    /* JADX INFO: renamed from: g0 */
    public float f34973g0;

    /* JADX INFO: renamed from: h */
    public final Rect f34974h;

    /* JADX INFO: renamed from: h0 */
    public float f34975h0;

    /* JADX INFO: renamed from: i */
    public final RectF f34976i;

    /* JADX INFO: renamed from: i0 */
    public StaticLayout f34977i0;

    /* JADX INFO: renamed from: j0 */
    public float f34979j0;

    /* JADX INFO: renamed from: k0 */
    public float f34981k0;

    /* JADX INFO: renamed from: l0 */
    public float f34983l0;

    /* JADX INFO: renamed from: m0 */
    public CharSequence f34985m0;

    /* JADX INFO: renamed from: n */
    public ColorStateList f34986n;

    /* JADX INFO: renamed from: o */
    public ColorStateList f34988o;

    /* JADX INFO: renamed from: p */
    public int f34990p;

    /* JADX INFO: renamed from: q */
    public float f34992q;

    /* JADX INFO: renamed from: r */
    public float f34994r;

    /* JADX INFO: renamed from: s */
    public float f34995s;

    /* JADX INFO: renamed from: t */
    public float f34996t;

    /* JADX INFO: renamed from: u */
    public float f34997u;

    /* JADX INFO: renamed from: v */
    public float f34998v;

    /* JADX INFO: renamed from: w */
    public Typeface f34999w;

    /* JADX INFO: renamed from: x */
    public Typeface f35000x;

    /* JADX INFO: renamed from: y */
    public Typeface f35001y;

    /* JADX INFO: renamed from: z */
    public Typeface f35002z;

    /* JADX INFO: renamed from: j */
    public int f34978j = 16;

    /* JADX INFO: renamed from: k */
    public int f34980k = 16;

    /* JADX INFO: renamed from: l */
    public float f34982l = 15.0f;

    /* JADX INFO: renamed from: m */
    public float f34984m = 15.0f;

    /* JADX INFO: renamed from: F */
    public TextUtils.TruncateAt f34939F = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: J */
    public boolean f34943J = true;

    /* JADX INFO: renamed from: n0 */
    public int f34987n0 = 1;

    /* JADX INFO: renamed from: o0 */
    public float f34989o0 = 0.0f;

    /* JADX INFO: renamed from: p0 */
    public float f34991p0 = 1.0f;

    /* JADX INFO: renamed from: q0 */
    public int f34993q0 = 1;

    public C11065c(ViewGroup viewGroup) {
        this.f34960a = viewGroup;
        TextPaint textPaint = new TextPaint(129);
        this.f34953T = textPaint;
        this.f34954U = new TextPaint(textPaint);
        this.f34974h = new Rect();
        this.f34972g = new Rect();
        this.f34976i = new RectF();
        float f13 = this.f34966d;
        this.f34968e = AbstractC2875y.m8288a(1.0f, f13, 0.5f, f13);
        m29848h(viewGroup.getContext().getResources().getConfiguration());
    }

    /* JADX INFO: renamed from: a */
    public static int m29841a(float f13, int i13, int i14) {
        float f14 = 1.0f - f13;
        return Color.argb(Math.round((Color.alpha(i14) * f13) + (Color.alpha(i13) * f14)), Math.round((Color.red(i14) * f13) + (Color.red(i13) * f14)), Math.round((Color.green(i14) * f13) + (Color.green(i13) * f14)), Math.round((Color.blue(i14) * f13) + (Color.blue(i13) * f14)));
    }

    /* JADX INFO: renamed from: g */
    public static float m29842g(float f13, float f14, float f15, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f15 = timeInterpolator.getInterpolation(f15);
        }
        return AbstractC22766a.m65969a(f13, f14, f15);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m29843b(CharSequence charSequence) {
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        boolean z4 = this.f34960a.getLayoutDirection() == 1;
        if (this.f34943J) {
            return (z4 ? AbstractC14087f.f50620d : AbstractC14087f.f50619c).m16444f(charSequence.length(), charSequence);
        }
        return z4;
    }

    /* JADX INFO: renamed from: c */
    public final void m29844c(float f13, boolean z4) {
        float f14;
        float f15;
        Typeface typeface;
        boolean z13;
        Layout.Alignment alignment;
        if (this.f34940G == null) {
            return;
        }
        float fWidth = this.f34974h.width();
        float fWidth2 = this.f34972g.width();
        if (Math.abs(f13 - 1.0f) < 1.0E-5f) {
            f14 = this.f34984m;
            f15 = this.f34971f0;
            this.f34945L = 1.0f;
            typeface = this.f34999w;
        } else {
            float f16 = this.f34982l;
            float f17 = this.f34973g0;
            Typeface typeface2 = this.f35002z;
            if (Math.abs(f13 - 0.0f) < 1.0E-5f) {
                this.f34945L = 1.0f;
            } else {
                this.f34945L = m29842g(this.f34982l, this.f34984m, f13, this.f34956W) / this.f34982l;
            }
            float f18 = this.f34984m / this.f34982l;
            fWidth = (z4 || this.f34964c || fWidth2 * f18 <= fWidth) ? fWidth2 : Math.min(fWidth / f18, fWidth2);
            f14 = f16;
            f15 = f17;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f34953T;
        if (fWidth > 0.0f) {
            boolean z14 = this.f34946M != f14;
            boolean z15 = this.f34975h0 != f15;
            boolean z16 = this.f34936C != typeface;
            StaticLayout staticLayout = this.f34977i0;
            boolean z17 = z14 || z15 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z16 || this.f34952S;
            this.f34946M = f14;
            this.f34975h0 = f15;
            this.f34936C = typeface;
            this.f34952S = false;
            textPaint.setLinearText(this.f34945L != 1.0f);
            z13 = z17;
        } else {
            z13 = false;
        }
        if (this.f34941H == null || z13) {
            textPaint.setTextSize(this.f34946M);
            textPaint.setTypeface(this.f34936C);
            textPaint.setLetterSpacing(this.f34975h0);
            boolean zM29843b = m29843b(this.f34940G);
            this.f34942I = zM29843b;
            int i13 = this.f34987n0;
            if (i13 <= 1 || (zM29843b && !this.f34964c)) {
                i13 = 1;
            }
            if (i13 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f34978j, zM29843b ? 1 : 0) & 7;
                if (absoluteGravity == 1) {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                } else if (absoluteGravity != 5) {
                    alignment = this.f34942I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                } else {
                    alignment = this.f34942I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                }
            }
            C11070h c11070h = new C11070h(this.f34940G, textPaint, (int) fWidth);
            c11070h.f35022l = this.f34939F;
            c11070h.f35021k = zM29843b;
            c11070h.f35015e = alignment;
            c11070h.f35020j = false;
            c11070h.f35016f = i13;
            float f19 = this.f34989o0;
            float f24 = this.f34991p0;
            c11070h.f35017g = f19;
            c11070h.f35018h = f24;
            c11070h.f35019i = this.f34993q0;
            StaticLayout staticLayoutM29860a = c11070h.m29860a();
            staticLayoutM29860a.getClass();
            this.f34977i0 = staticLayoutM29860a;
            this.f34941H = staticLayoutM29860a.getText();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m29845d(Canvas canvas) {
        int iSave = canvas.save();
        if (this.f34941H != null) {
            RectF rectF = this.f34976i;
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            float f13 = this.f34946M;
            TextPaint textPaint = this.f34953T;
            textPaint.setTextSize(f13);
            float f14 = this.f34997u;
            float f15 = this.f34998v;
            float f16 = this.f34945L;
            if (f16 != 1.0f && !this.f34964c) {
                canvas.scale(f16, f16, f14, f15);
            }
            if (this.f34987n0 <= 1 || ((this.f34942I && !this.f34964c) || (this.f34964c && this.f34962b <= this.f34968e))) {
                canvas.translate(f14, f15);
                this.f34977i0.draw(canvas);
            } else {
                float lineStart = this.f34997u - this.f34977i0.getLineStart(0);
                int alpha = textPaint.getAlpha();
                canvas.translate(lineStart, f15);
                if (!this.f34964c) {
                    textPaint.setAlpha((int) (this.f34983l0 * alpha));
                    if (Build.VERSION.SDK_INT >= 31) {
                        textPaint.setShadowLayer(this.f34947N, this.f34948O, this.f34949P, AbstractC31484o.m96961m(this.f34950Q, textPaint.getAlpha()));
                    }
                    this.f34977i0.draw(canvas);
                }
                if (!this.f34964c) {
                    textPaint.setAlpha((int) (this.f34981k0 * alpha));
                }
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 31) {
                    textPaint.setShadowLayer(this.f34947N, this.f34948O, this.f34949P, AbstractC31484o.m96961m(this.f34950Q, textPaint.getAlpha()));
                }
                int lineBaseline = this.f34977i0.getLineBaseline(0);
                CharSequence charSequence = this.f34985m0;
                float f17 = lineBaseline;
                canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f17, textPaint);
                if (i13 >= 31) {
                    textPaint.setShadowLayer(this.f34947N, this.f34948O, this.f34949P, this.f34950Q);
                }
                if (!this.f34964c) {
                    String strTrim = this.f34985m0.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(this.f34977i0.getLineEnd(0), str.length()), 0.0f, f17, (Paint) textPaint);
                }
                canvas = canvas;
            }
            canvas.restoreToCount(iSave);
        }
    }

    /* JADX INFO: renamed from: e */
    public final float m29846e() {
        float f13 = this.f34984m;
        TextPaint textPaint = this.f34954U;
        textPaint.setTextSize(f13);
        textPaint.setTypeface(this.f34999w);
        textPaint.setLetterSpacing(this.f34971f0);
        return -textPaint.ascent();
    }

    /* JADX INFO: renamed from: f */
    public final int m29847f(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f34951R;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* JADX INFO: renamed from: h */
    public final void m29848h(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f35001y;
            if (typeface != null) {
                this.f35000x = AbstractC11480b.m30886l(configuration, typeface);
            }
            Typeface typeface2 = this.f34935B;
            if (typeface2 != null) {
                this.f34934A = AbstractC11480b.m30886l(configuration, typeface2);
            }
            Typeface typeface3 = this.f35000x;
            if (typeface3 == null) {
                typeface3 = this.f35001y;
            }
            this.f34999w = typeface3;
            Typeface typeface4 = this.f34934A;
            if (typeface4 == null) {
                typeface4 = this.f34935B;
            }
            this.f35002z = typeface4;
            m29849i(true);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m29849i(boolean z4) {
        float fMeasureText;
        float f13;
        StaticLayout staticLayout;
        ViewGroup viewGroup = this.f34960a;
        if ((viewGroup.getHeight() <= 0 || viewGroup.getWidth() <= 0) && !z4) {
            return;
        }
        m29844c(1.0f, z4);
        CharSequence charSequence = this.f34941H;
        TextPaint textPaint = this.f34953T;
        if (charSequence != null && (staticLayout = this.f34977i0) != null) {
            this.f34985m0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f34939F);
        }
        CharSequence charSequence2 = this.f34985m0;
        if (charSequence2 != null) {
            this.f34979j0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f34979j0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f34980k, this.f34942I ? 1 : 0);
        int i13 = absoluteGravity & 112;
        Rect rect = this.f34974h;
        if (i13 == 48) {
            this.f34994r = rect.top;
        } else if (i13 != 80) {
            this.f34994r = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f34994r = textPaint.ascent() + rect.bottom;
        }
        int i14 = absoluteGravity & 8388615;
        if (i14 == 1) {
            this.f34996t = rect.centerX() - (this.f34979j0 / 2.0f);
        } else if (i14 != 5) {
            this.f34996t = rect.left;
        } else {
            this.f34996t = rect.right - this.f34979j0;
        }
        m29844c(0.0f, z4);
        StaticLayout staticLayout2 = this.f34977i0;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.f34977i0;
        if (staticLayout3 == null || this.f34987n0 <= 1) {
            CharSequence charSequence3 = this.f34941H;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f34977i0;
        this.f34990p = staticLayout4 != null ? staticLayout4.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f34978j, this.f34942I ? 1 : 0);
        int i15 = absoluteGravity2 & 112;
        Rect rect2 = this.f34972g;
        if (i15 == 48) {
            this.f34992q = rect2.top;
        } else if (i15 != 80) {
            this.f34992q = rect2.centerY() - (height / 2.0f);
        } else {
            this.f34992q = textPaint.descent() + (rect2.bottom - height);
        }
        int i16 = absoluteGravity2 & 8388615;
        if (i16 == 1) {
            this.f34995s = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i16 != 5) {
            this.f34995s = rect2.left;
        } else {
            this.f34995s = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.f34944K;
        if (bitmap != null) {
            bitmap.recycle();
            this.f34944K = null;
        }
        m29857q(this.f34962b);
        float f14 = this.f34962b;
        boolean z13 = this.f34964c;
        RectF rectF = this.f34976i;
        if (z13) {
            if (f14 < this.f34968e) {
                rect = rect2;
            }
            rectF.set(rect);
        } else {
            rectF.left = m29842g(rect2.left, rect.left, f14, this.f34955V);
            rectF.top = m29842g(this.f34992q, this.f34994r, f14, this.f34955V);
            rectF.right = m29842g(rect2.right, rect.right, f14, this.f34955V);
            rectF.bottom = m29842g(rect2.bottom, rect.bottom, f14, this.f34955V);
        }
        if (!this.f34964c) {
            this.f34997u = m29842g(this.f34995s, this.f34996t, f14, this.f34955V);
            this.f34998v = m29842g(this.f34992q, this.f34994r, f14, this.f34955V);
            m29857q(f14);
            f13 = f14;
        } else if (f14 < this.f34968e) {
            this.f34997u = this.f34995s;
            this.f34998v = this.f34992q;
            m29857q(0.0f);
            f13 = 0.0f;
        } else {
            this.f34997u = this.f34996t;
            this.f34998v = this.f34994r - Math.max(0, this.f34970f);
            m29857q(1.0f);
            f13 = 1.0f;
        }
        C16999a c16999a = AbstractC22766a.f89673b;
        this.f34981k0 = 1.0f - m29842g(0.0f, 1.0f, 1.0f - f14, c16999a);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        viewGroup.postInvalidateOnAnimation();
        this.f34983l0 = m29842g(1.0f, 0.0f, f14, c16999a);
        viewGroup.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f34988o;
        ColorStateList colorStateList2 = this.f34986n;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(m29841a(f13, m29847f(colorStateList2), m29847f(this.f34988o)));
        } else {
            textPaint.setColor(m29847f(colorStateList));
        }
        int i17 = Build.VERSION.SDK_INT;
        float f15 = this.f34971f0;
        float f16 = this.f34973g0;
        if (f15 != f16) {
            textPaint.setLetterSpacing(m29842g(f16, f15, f14, c16999a));
        } else {
            textPaint.setLetterSpacing(f15);
        }
        this.f34947N = AbstractC22766a.m65969a(this.f34963b0, this.f34957X, f14);
        this.f34948O = AbstractC22766a.m65969a(this.f34965c0, this.f34958Y, f14);
        this.f34949P = AbstractC22766a.m65969a(this.f34967d0, this.f34959Z, f14);
        int iM29841a = m29841a(f14, m29847f(this.f34969e0), m29847f(this.f34961a0));
        this.f34950Q = iM29841a;
        textPaint.setShadowLayer(this.f34947N, this.f34948O, this.f34949P, iM29841a);
        if (this.f34964c) {
            int alpha = textPaint.getAlpha();
            float f17 = this.f34968e;
            textPaint.setAlpha((int) ((f14 <= f17 ? AbstractC22766a.m65970b(1.0f, 0.0f, this.f34966d, f17, f14) : AbstractC22766a.m65970b(0.0f, 1.0f, f17, 1.0f, f14)) * alpha));
            if (i17 >= 31) {
                textPaint.setShadowLayer(this.f34947N, this.f34948O, this.f34949P, AbstractC31484o.m96961m(this.f34950Q, textPaint.getAlpha()));
            }
        }
        viewGroup.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: j */
    public final void m29850j(ColorStateList colorStateList) {
        if (this.f34988o == colorStateList && this.f34986n == colorStateList) {
            return;
        }
        this.f34988o = colorStateList;
        this.f34986n = colorStateList;
        m29849i(false);
    }

    /* JADX INFO: renamed from: k */
    public final void m29851k(int i13) {
        ViewGroup viewGroup = this.f34960a;
        C17574d c17574d = new C17574d(viewGroup.getContext(), i13);
        ColorStateList colorStateList = c17574d.f68100j;
        if (colorStateList != null) {
            this.f34988o = colorStateList;
        }
        float f13 = c17574d.f68101k;
        if (f13 != 0.0f) {
            this.f34984m = f13;
        }
        ColorStateList colorStateList2 = c17574d.f68091a;
        if (colorStateList2 != null) {
            this.f34961a0 = colorStateList2;
        }
        this.f34958Y = c17574d.f68095e;
        this.f34959Z = c17574d.f68096f;
        this.f34957X = c17574d.f68097g;
        this.f34971f0 = c17574d.f68099i;
        C17571a c17571a = this.f34938E;
        if (c17571a != null) {
            c17571a.f68084c = true;
        }
        C11064b c11064b = new C11064b(this, 0);
        c17574d.m50022a();
        this.f34938E = new C17571a(c11064b, c17574d.f68104n);
        c17574d.m50024c(viewGroup.getContext(), this.f34938E);
        m29849i(false);
    }

    /* JADX INFO: renamed from: l */
    public final void m29852l(int i13) {
        if (this.f34980k != i13) {
            this.f34980k = i13;
            m29849i(false);
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m29853m(Typeface typeface) {
        C17571a c17571a = this.f34938E;
        if (c17571a != null) {
            c17571a.f68084c = true;
        }
        if (this.f35001y == typeface) {
            return false;
        }
        this.f35001y = typeface;
        Typeface typefaceM30886l = AbstractC11480b.m30886l(this.f34960a.getContext().getResources().getConfiguration(), typeface);
        this.f35000x = typefaceM30886l;
        if (typefaceM30886l == null) {
            typefaceM30886l = this.f35001y;
        }
        this.f34999w = typefaceM30886l;
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final void m29854n(int i13) {
        ViewGroup viewGroup = this.f34960a;
        C17574d c17574d = new C17574d(viewGroup.getContext(), i13);
        ColorStateList colorStateList = c17574d.f68100j;
        if (colorStateList != null) {
            this.f34986n = colorStateList;
        }
        float f13 = c17574d.f68101k;
        if (f13 != 0.0f) {
            this.f34982l = f13;
        }
        ColorStateList colorStateList2 = c17574d.f68091a;
        if (colorStateList2 != null) {
            this.f34969e0 = colorStateList2;
        }
        this.f34965c0 = c17574d.f68095e;
        this.f34967d0 = c17574d.f68096f;
        this.f34963b0 = c17574d.f68097g;
        this.f34973g0 = c17574d.f68099i;
        C17571a c17571a = this.f34937D;
        if (c17571a != null) {
            c17571a.f68084c = true;
        }
        C11064b c11064b = new C11064b(this, 1);
        c17574d.m50022a();
        this.f34937D = new C17571a(c11064b, c17574d.f68104n);
        c17574d.m50024c(viewGroup.getContext(), this.f34937D);
        m29849i(false);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m29855o(Typeface typeface) {
        C17571a c17571a = this.f34937D;
        if (c17571a != null) {
            c17571a.f68084c = true;
        }
        if (this.f34935B == typeface) {
            return false;
        }
        this.f34935B = typeface;
        Typeface typefaceM30886l = AbstractC11480b.m30886l(this.f34960a.getContext().getResources().getConfiguration(), typeface);
        this.f34934A = typefaceM30886l;
        if (typefaceM30886l == null) {
            typefaceM30886l = this.f34935B;
        }
        this.f35002z = typefaceM30886l;
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m29856p(float f13) {
        float f14;
        float fM96938q = AbstractC31479j.m96938q(f13, 0.0f, 1.0f);
        if (fM96938q != this.f34962b) {
            this.f34962b = fM96938q;
            boolean z4 = this.f34964c;
            Rect rect = this.f34974h;
            Rect rect2 = this.f34972g;
            RectF rectF = this.f34976i;
            if (z4) {
                if (fM96938q < this.f34968e) {
                    rect = rect2;
                }
                rectF.set(rect);
            } else {
                rectF.left = m29842g(rect2.left, rect.left, fM96938q, this.f34955V);
                rectF.top = m29842g(this.f34992q, this.f34994r, fM96938q, this.f34955V);
                rectF.right = m29842g(rect2.right, rect.right, fM96938q, this.f34955V);
                rectF.bottom = m29842g(rect2.bottom, rect.bottom, fM96938q, this.f34955V);
            }
            if (!this.f34964c) {
                this.f34997u = m29842g(this.f34995s, this.f34996t, fM96938q, this.f34955V);
                this.f34998v = m29842g(this.f34992q, this.f34994r, fM96938q, this.f34955V);
                m29857q(fM96938q);
                f14 = fM96938q;
            } else if (fM96938q < this.f34968e) {
                this.f34997u = this.f34995s;
                this.f34998v = this.f34992q;
                m29857q(0.0f);
                f14 = 0.0f;
            } else {
                this.f34997u = this.f34996t;
                this.f34998v = this.f34994r - Math.max(0, this.f34970f);
                m29857q(1.0f);
                f14 = 1.0f;
            }
            C16999a c16999a = AbstractC22766a.f89673b;
            this.f34981k0 = 1.0f - m29842g(0.0f, 1.0f, 1.0f - fM96938q, c16999a);
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            ViewGroup viewGroup = this.f34960a;
            viewGroup.postInvalidateOnAnimation();
            this.f34983l0 = m29842g(1.0f, 0.0f, fM96938q, c16999a);
            viewGroup.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f34988o;
            ColorStateList colorStateList2 = this.f34986n;
            TextPaint textPaint = this.f34953T;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(m29841a(f14, m29847f(colorStateList2), m29847f(this.f34988o)));
            } else {
                textPaint.setColor(m29847f(colorStateList));
            }
            int i13 = Build.VERSION.SDK_INT;
            float f15 = this.f34971f0;
            float f16 = this.f34973g0;
            if (f15 != f16) {
                textPaint.setLetterSpacing(m29842g(f16, f15, fM96938q, c16999a));
            } else {
                textPaint.setLetterSpacing(f15);
            }
            this.f34947N = AbstractC22766a.m65969a(this.f34963b0, this.f34957X, fM96938q);
            this.f34948O = AbstractC22766a.m65969a(this.f34965c0, this.f34958Y, fM96938q);
            this.f34949P = AbstractC22766a.m65969a(this.f34967d0, this.f34959Z, fM96938q);
            int iM29841a = m29841a(fM96938q, m29847f(this.f34969e0), m29847f(this.f34961a0));
            this.f34950Q = iM29841a;
            textPaint.setShadowLayer(this.f34947N, this.f34948O, this.f34949P, iM29841a);
            if (this.f34964c) {
                int alpha = textPaint.getAlpha();
                float f17 = this.f34968e;
                textPaint.setAlpha((int) ((fM96938q <= f17 ? AbstractC22766a.m65970b(1.0f, 0.0f, this.f34966d, f17, fM96938q) : AbstractC22766a.m65970b(0.0f, 1.0f, f17, 1.0f, fM96938q)) * alpha));
                if (i13 >= 31) {
                    textPaint.setShadowLayer(this.f34947N, this.f34948O, this.f34949P, AbstractC31484o.m96961m(this.f34950Q, textPaint.getAlpha()));
                }
            }
            viewGroup.postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m29857q(float f13) {
        m29844c(f13, false);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        this.f34960a.postInvalidateOnAnimation();
    }
}
