package mq;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whoop.android.R;
import cr.AbstractC11075m;
import cr.C11073k;
import cr.InterfaceC11072j;
import hr.C17574d;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;
import kr.C22782a;
import kr.C22788g;
import kr.C22791j;
import kr.C22792k;
import p184h5.AbstractC16901p0;
import p287kq.AbstractC22766a;

/* JADX INFO: renamed from: mq.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C25873a extends Drawable implements InterfaceC11072j {

    /* JADX INFO: renamed from: E */
    public final C25875c f102010E;

    /* JADX INFO: renamed from: F */
    public float f102011F;

    /* JADX INFO: renamed from: G */
    public float f102012G;

    /* JADX INFO: renamed from: H */
    public final int f102013H;

    /* JADX INFO: renamed from: I */
    public float f102014I;

    /* JADX INFO: renamed from: J */
    public float f102015J;

    /* JADX INFO: renamed from: K */
    public float f102016K;

    /* JADX INFO: renamed from: L */
    public WeakReference f102017L;

    /* JADX INFO: renamed from: M */
    public WeakReference f102018M;

    /* JADX INFO: renamed from: w */
    public final WeakReference f102019w;

    /* JADX INFO: renamed from: x */
    public final C22788g f102020x;

    /* JADX INFO: renamed from: y */
    public final C11073k f102021y;

    /* JADX INFO: renamed from: z */
    public final Rect f102022z;

    public C25873a(Context context) {
        C17574d c17574d;
        WeakReference weakReference = new WeakReference(context);
        this.f102019w = weakReference;
        AbstractC11075m.m29869c(context, AbstractC11075m.f35033b, "Theme.MaterialComponents");
        this.f102022z = new Rect();
        C11073k c11073k = new C11073k(this);
        this.f102021y = c11073k;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = c11073k.f35025a;
        textPaint.setTextAlign(align);
        C25875c c25875c = new C25875c(context);
        this.f102010E = c25875c;
        boolean zM76476e = m76476e();
        C25874b c25874b = c25875c.f102054b;
        C22788g c22788g = new C22788g(C22792k.m66025a(context, zM76476e ? c25874b.f102025G.intValue() : c25874b.f102023E.intValue(), m76476e() ? c25874b.f102026H.intValue() : c25874b.f102024F.intValue(), new C22782a(0)).m66021a());
        this.f102020x = c22788g;
        m76478g();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && c11073k.f35031g != (c17574d = new C17574d(context2, c25874b.f102052z.intValue()))) {
            c11073k.m29866b(c17574d, context2);
            textPaint.setColor(c25874b.f102051y.intValue());
            invalidateSelf();
            m76480i();
            invalidateSelf();
        }
        int i13 = c25874b.f102030L;
        if (i13 != -2) {
            this.f102013H = ((int) Math.pow(10.0d, ((double) i13) - 1.0d)) - 1;
        } else {
            this.f102013H = c25874b.f102031M;
        }
        c11073k.f35029e = true;
        m76480i();
        invalidateSelf();
        c11073k.f35029e = true;
        m76478g();
        m76480i();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(c25874b.f102050x.intValue());
        if (c22788g.f89748w.f89712c != colorStateListValueOf) {
            c22788g.m66011m(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(c25874b.f102051y.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.f102017L;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.f102017L.get();
            WeakReference weakReference3 = this.f102018M;
            m76479h(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        m76480i();
        setVisible(c25874b.f102038T.booleanValue(), false);
    }

    @Override // cr.InterfaceC11072j
    /* JADX INFO: renamed from: a */
    public final void mo29864a() {
        invalidateSelf();
    }

    /* JADX INFO: renamed from: b */
    public final String m76473b() {
        C25875c c25875c = this.f102010E;
        C25874b c25874b = c25875c.f102054b;
        C25874b c25874b2 = c25875c.f102054b;
        String str = c25874b.f102028J;
        WeakReference weakReference = this.f102019w;
        if (str == null) {
            if (!m76477f()) {
                return null;
            }
            if (this.f102013H == -2 || m76475d() <= this.f102013H) {
                return NumberFormat.getInstance(c25874b2.f102032N).format(m76475d());
            }
            Context context = (Context) weakReference.get();
            return context == null ? "" : String.format(c25874b2.f102032N, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f102013H), "+");
        }
        int i13 = c25874b.f102030L;
        if (i13 == -2 || str == null || str.length() <= i13) {
            return str;
        }
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i13 - 1), "…");
    }

    /* JADX INFO: renamed from: c */
    public final FrameLayout m76474c() {
        WeakReference weakReference = this.f102018M;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final int m76475d() {
        int i13 = this.f102010E.f102054b.f102029K;
        if (i13 != -1) {
            return i13;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strM76473b;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f102020x.draw(canvas);
        if (!m76476e() || (strM76473b = m76473b()) == null) {
            return;
        }
        Rect rect = new Rect();
        C11073k c11073k = this.f102021y;
        c11073k.f35025a.getTextBounds(strM76473b, 0, strM76473b.length(), rect);
        float fExactCenterY = this.f102012G - rect.exactCenterY();
        canvas.drawText(strM76473b, this.f102011F, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), c11073k.f35025a);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m76476e() {
        return this.f102010E.f102054b.f102028J != null || m76477f();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m76477f() {
        C25874b c25874b = this.f102010E.f102054b;
        return c25874b.f102028J == null && c25874b.f102029K != -1;
    }

    /* JADX INFO: renamed from: g */
    public final void m76478g() {
        Context context = (Context) this.f102019w.get();
        if (context == null) {
            return;
        }
        boolean zM76476e = m76476e();
        C25875c c25875c = this.f102010E;
        this.f102020x.setShapeAppearanceModel(C22792k.m66025a(context, zM76476e ? c25875c.f102054b.f102025G.intValue() : c25875c.f102054b.f102023E.intValue(), m76476e() ? c25875c.f102054b.f102026H.intValue() : c25875c.f102054b.f102024F.intValue(), new C22782a(0)).m66021a());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f102010E.f102054b.f102027I;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f102022z.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f102022z.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: h */
    public final void m76479h(View view, FrameLayout frameLayout) {
        this.f102017L = new WeakReference(view);
        this.f102018M = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        m76480i();
        invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0220  */
    /* JADX WARN: Code duplicated, block: B:101:0x0238  */
    /* JADX WARN: Code duplicated, block: B:104:0x0241  */
    /* JADX WARN: Code duplicated, block: B:105:0x0259  */
    /* JADX WARN: Code duplicated, block: B:108:0x025e  */
    /* JADX WARN: Code duplicated, block: B:111:0x026b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0278  */
    /* JADX WARN: Code duplicated, block: B:117:0x0285  */
    /* JADX INFO: renamed from: i */
    public final void m76480i() {
        float y13;
        float x3;
        float y14;
        float x5;
        float height;
        float width;
        float f13;
        float f14;
        WeakReference weakReference = this.f102019w;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.f102017L;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.f102022z;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference3 = this.f102018M;
        ViewGroup viewGroup = weakReference3 != null ? (ViewGroup) weakReference3.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean zM76476e = m76476e();
        C25875c c25875c = this.f102010E;
        float f15 = zM76476e ? c25875c.f102056d : c25875c.f102055c;
        this.f102014I = f15;
        if (f15 != -1.0f) {
            this.f102015J = f15;
            this.f102016K = f15;
        } else {
            this.f102015J = Math.round((m76476e() ? c25875c.f102059g : c25875c.f102057e) / 2.0f);
            this.f102016K = Math.round((m76476e() ? c25875c.f102060h : c25875c.f102058f) / 2.0f);
        }
        if (m76476e()) {
            String strM76473b = m76473b();
            float f16 = this.f102015J;
            C11073k c11073k = this.f102021y;
            if (c11073k.f35029e) {
                c11073k.m29865a(strM76473b);
                f13 = c11073k.f35027c;
            } else {
                f13 = c11073k.f35027c;
            }
            this.f102015J = Math.max(f16, (f13 / 2.0f) + c25875c.f102054b.f102039U.intValue());
            float f17 = this.f102016K;
            if (c11073k.f35029e) {
                c11073k.m29865a(strM76473b);
                f14 = c11073k.f35028d;
            } else {
                f14 = c11073k.f35028d;
            }
            float fMax = Math.max(f17, (f14 / 2.0f) + c25875c.f102054b.f102040V.intValue());
            this.f102016K = fMax;
            this.f102015J = Math.max(this.f102015J, fMax);
        }
        C25874b c25874b = c25875c.f102054b;
        C25874b c25874b2 = c25875c.f102054b;
        int i13 = c25875c.f102063k;
        int iIntValue = c25874b.f102042X.intValue();
        if (m76476e()) {
            iIntValue = c25874b.f102044Z.intValue();
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                iIntValue = AbstractC22766a.m65971c(AbstractC22766a.m65970b(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f), iIntValue, iIntValue - c25874b.f102047c0.intValue());
            }
        }
        if (i13 == 0) {
            iIntValue -= Math.round(this.f102016K);
        }
        int iIntValue2 = c25874b.f102046b0.intValue() + iIntValue;
        int iIntValue3 = c25874b2.f102037S.intValue();
        if (iIntValue3 == 8388691 || iIntValue3 == 8388693) {
            this.f102012G = rect3.bottom - iIntValue2;
        } else {
            this.f102012G = rect3.top + iIntValue2;
        }
        int iIntValue4 = m76476e() ? c25874b.f102043Y.intValue() : c25874b.f102041W.intValue();
        if (i13 == 1) {
            iIntValue4 += m76476e() ? c25875c.f102062j : c25875c.f102061i;
        }
        int iIntValue5 = c25874b.f102045a0.intValue() + iIntValue4;
        int iIntValue6 = c25874b2.f102037S.intValue();
        if (iIntValue6 == 8388659 || iIntValue6 == 8388691) {
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            this.f102011F = view.getLayoutDirection() == 0 ? (rect3.left - this.f102015J) + iIntValue5 : (rect3.right + this.f102015J) - iIntValue5;
        } else {
            WeakHashMap weakHashMap2 = AbstractC16901p0.f64851a;
            this.f102011F = view.getLayoutDirection() == 0 ? (rect3.right + this.f102015J) - iIntValue5 : (rect3.left - this.f102015J) + iIntValue5;
        }
        if (c25874b.f102048d0.booleanValue()) {
            View viewM76474c = m76474c();
            if (viewM76474c != null) {
                FrameLayout frameLayoutM76474c = m76474c();
                if (frameLayoutM76474c == null || frameLayoutM76474c.getId() != R.id.mtrl_anchor_parent) {
                    y13 = 0.0f;
                    x3 = 0.0f;
                } else if (viewM76474c.getParent() instanceof View) {
                    y13 = viewM76474c.getY();
                    x3 = viewM76474c.getX();
                    viewM76474c = (View) viewM76474c.getParent();
                }
                y14 = viewM76474c.getY() + (this.f102012G - this.f102016K) + y13;
                x5 = viewM76474c.getX() + (this.f102011F - this.f102015J) + x3;
                if (viewM76474c.getParent() instanceof View) {
                    height = ((this.f102012G + this.f102016K) - (((View) viewM76474c.getParent()).getHeight() - viewM76474c.getY())) + y13;
                } else {
                    height = 0.0f;
                }
                if (viewM76474c.getParent() instanceof View) {
                    width = ((this.f102011F + this.f102015J) - (((View) viewM76474c.getParent()).getWidth() - viewM76474c.getX())) + x3;
                } else {
                    width = 0.0f;
                }
                if (y14 < 0.0f) {
                    this.f102012G = Math.abs(y14) + this.f102012G;
                }
                if (x5 < 0.0f) {
                    this.f102011F = Math.abs(x5) + this.f102011F;
                }
                if (height > 0.0f) {
                    this.f102012G -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.f102011F -= Math.abs(width);
                }
            } else if (view.getParent() instanceof View) {
                float y15 = view.getY();
                x3 = view.getX();
                View view2 = (View) view.getParent();
                y13 = y15;
                viewM76474c = view2;
                y14 = viewM76474c.getY() + (this.f102012G - this.f102016K) + y13;
                x5 = viewM76474c.getX() + (this.f102011F - this.f102015J) + x3;
                if (viewM76474c.getParent() instanceof View) {
                    height = ((this.f102012G + this.f102016K) - (((View) viewM76474c.getParent()).getHeight() - viewM76474c.getY())) + y13;
                } else {
                    height = 0.0f;
                }
                if (viewM76474c.getParent() instanceof View) {
                    width = ((this.f102011F + this.f102015J) - (((View) viewM76474c.getParent()).getWidth() - viewM76474c.getX())) + x3;
                } else {
                    width = 0.0f;
                }
                if (y14 < 0.0f) {
                    this.f102012G = Math.abs(y14) + this.f102012G;
                }
                if (x5 < 0.0f) {
                    this.f102011F = Math.abs(x5) + this.f102011F;
                }
                if (height > 0.0f) {
                    this.f102012G -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.f102011F -= Math.abs(width);
                }
            }
        }
        float f18 = this.f102011F;
        float f19 = this.f102012G;
        float f24 = this.f102015J;
        float f25 = this.f102016K;
        rect2.set((int) (f18 - f24), (int) (f19 - f25), (int) (f18 + f24), (int) (f19 + f25));
        float f26 = this.f102014I;
        C22788g c22788g = this.f102020x;
        if (f26 != -1.0f) {
            C22791j c22791jM66029e = c22788g.f89748w.f89710a.m66029e();
            c22791jM66029e.m66022b(f26);
            c22788g.setShapeAppearanceModel(c22791jM66029e.m66021a());
        }
        if (rect.equals(rect2)) {
            return;
        }
        c22788g.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, cr.InterfaceC11072j
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        C25875c c25875c = this.f102010E;
        c25875c.f102053a.f102027I = i13;
        c25875c.f102054b.f102027I = i13;
        this.f102021y.f35025a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
