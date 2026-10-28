package p531uq;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import cr.AbstractC11075m;
import cr.C11073k;
import cr.InterfaceC11072j;
import hm.C17417d;
import hr.C17574d;
import ir.AbstractC20858a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kr.C22787f;
import kr.C22788g;
import kr.C22791j;
import kr.C22792k;
import kr.C22794m;
import p287kq.C22770e;
import p479s4.AbstractC32121b;
import p543v4.AbstractC35642a;

/* JADX INFO: renamed from: uq.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C35159d extends C22788g implements Drawable.Callback, InterfaceC11072j {

    /* JADX INFO: renamed from: g1 */
    public static final int[] f149170g1 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: h1 */
    public static final ShapeDrawable f149171h1 = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: A0 */
    public float f149172A0;

    /* JADX INFO: renamed from: B0 */
    public float f149173B0;

    /* JADX INFO: renamed from: C0 */
    public float f149174C0;

    /* JADX INFO: renamed from: D0 */
    public float f149175D0;

    /* JADX INFO: renamed from: E0 */
    public float f149176E0;

    /* JADX INFO: renamed from: F0 */
    public final Context f149177F0;

    /* JADX INFO: renamed from: G0 */
    public final Paint f149178G0;

    /* JADX INFO: renamed from: H0 */
    public final Paint.FontMetrics f149179H0;

    /* JADX INFO: renamed from: I0 */
    public final RectF f149180I0;

    /* JADX INFO: renamed from: J0 */
    public final PointF f149181J0;

    /* JADX INFO: renamed from: K0 */
    public final Path f149182K0;

    /* JADX INFO: renamed from: L0 */
    public final C11073k f149183L0;

    /* JADX INFO: renamed from: M0 */
    public int f149184M0;

    /* JADX INFO: renamed from: N0 */
    public int f149185N0;

    /* JADX INFO: renamed from: O0 */
    public int f149186O0;

    /* JADX INFO: renamed from: P0 */
    public int f149187P0;

    /* JADX INFO: renamed from: Q0 */
    public int f149188Q0;

    /* JADX INFO: renamed from: R0 */
    public int f149189R0;

    /* JADX INFO: renamed from: S0 */
    public boolean f149190S0;

    /* JADX INFO: renamed from: T0 */
    public int f149191T0;

    /* JADX INFO: renamed from: U0 */
    public int f149192U0;

    /* JADX INFO: renamed from: V0 */
    public ColorFilter f149193V0;

    /* JADX INFO: renamed from: W0 */
    public PorterDuffColorFilter f149194W0;

    /* JADX INFO: renamed from: X0 */
    public ColorStateList f149195X0;

    /* JADX INFO: renamed from: Y */
    public ColorStateList f149196Y;

    /* JADX INFO: renamed from: Y0 */
    public PorterDuff.Mode f149197Y0;

    /* JADX INFO: renamed from: Z */
    public ColorStateList f149198Z;

    /* JADX INFO: renamed from: Z0 */
    public int[] f149199Z0;

    /* JADX INFO: renamed from: a0 */
    public float f149200a0;

    /* JADX INFO: renamed from: a1 */
    public ColorStateList f149201a1;

    /* JADX INFO: renamed from: b0 */
    public float f149202b0;

    /* JADX INFO: renamed from: b1 */
    public WeakReference f149203b1;

    /* JADX INFO: renamed from: c0 */
    public ColorStateList f149204c0;

    /* JADX INFO: renamed from: c1 */
    public TextUtils.TruncateAt f149205c1;

    /* JADX INFO: renamed from: d0 */
    public float f149206d0;

    /* JADX INFO: renamed from: d1 */
    public boolean f149207d1;

    /* JADX INFO: renamed from: e0 */
    public ColorStateList f149208e0;

    /* JADX INFO: renamed from: e1 */
    public int f149209e1;

    /* JADX INFO: renamed from: f0 */
    public CharSequence f149210f0;

    /* JADX INFO: renamed from: f1 */
    public boolean f149211f1;

    /* JADX INFO: renamed from: g0 */
    public boolean f149212g0;

    /* JADX INFO: renamed from: h0 */
    public Drawable f149213h0;

    /* JADX INFO: renamed from: i0 */
    public ColorStateList f149214i0;

    /* JADX INFO: renamed from: j0 */
    public float f149215j0;

    /* JADX INFO: renamed from: k0 */
    public boolean f149216k0;

    /* JADX INFO: renamed from: l0 */
    public boolean f149217l0;

    /* JADX INFO: renamed from: m0 */
    public Drawable f149218m0;

    /* JADX INFO: renamed from: n0 */
    public RippleDrawable f149219n0;

    /* JADX INFO: renamed from: o0 */
    public ColorStateList f149220o0;

    /* JADX INFO: renamed from: p0 */
    public float f149221p0;

    /* JADX INFO: renamed from: q0 */
    public SpannableStringBuilder f149222q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f149223r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f149224s0;

    /* JADX INFO: renamed from: t0 */
    public Drawable f149225t0;

    /* JADX INFO: renamed from: u0 */
    public ColorStateList f149226u0;

    /* JADX INFO: renamed from: v0 */
    public C22770e f149227v0;

    /* JADX INFO: renamed from: w0 */
    public C22770e f149228w0;

    /* JADX INFO: renamed from: x0 */
    public float f149229x0;

    /* JADX INFO: renamed from: y0 */
    public float f149230y0;

    /* JADX INFO: renamed from: z0 */
    public float f149231z0;

    public C35159d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.whoop.android.R.attr.chipStyle, com.whoop.android.R.style.Widget_MaterialComponents_Chip_Action);
        this.f149202b0 = -1.0f;
        this.f149178G0 = new Paint(1);
        this.f149179H0 = new Paint.FontMetrics();
        this.f149180I0 = new RectF();
        this.f149181J0 = new PointF();
        this.f149182K0 = new Path();
        this.f149192U0 = 255;
        this.f149197Y0 = PorterDuff.Mode.SRC_IN;
        this.f149203b1 = new WeakReference(null);
        m66009k(context);
        this.f149177F0 = context;
        C11073k c11073k = new C11073k(this);
        this.f149183L0 = c11073k;
        this.f149210f0 = "";
        c11073k.f35025a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f149170g1;
        setState(iArr);
        if (!Arrays.equals(this.f149199Z0, iArr)) {
            this.f149199Z0 = iArr;
            if (m111262b0()) {
                m111239E(getState(), iArr);
            }
        }
        this.f149207d1 = true;
        f149171h1.setTint(-1);
    }

    /* JADX INFO: renamed from: B */
    public static boolean m111234B(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: C */
    public static boolean m111235C(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX INFO: renamed from: c0 */
    public static void m111236c0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* JADX INFO: renamed from: A */
    public final float m111237A() {
        return this.f149211f1 ? m66007i() : this.f149202b0;
    }

    /* JADX INFO: renamed from: D */
    public final void m111238D() {
        InterfaceC35158c interfaceC35158c = (InterfaceC35158c) this.f149203b1.get();
        if (interfaceC35158c != null) {
            Chip chip = (Chip) interfaceC35158c;
            chip.m15729b(chip.f20881P);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX INFO: renamed from: E */
    public final boolean m111239E(int[] iArr, int[] iArr2) {
        int colorForState;
        boolean z4;
        boolean z13;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f149196Y;
        int iM66003d = m66003d(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f149184M0) : 0);
        boolean state = true;
        if (this.f149184M0 != iM66003d) {
            this.f149184M0 = iM66003d;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f149198Z;
        int iM66003d2 = m66003d(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f149185N0) : 0);
        if (this.f149185N0 != iM66003d2) {
            this.f149185N0 = iM66003d2;
            zOnStateChange = true;
        }
        int iM112836e = AbstractC35642a.m112836e(iM66003d2, iM66003d);
        if ((this.f149186O0 != iM112836e) | (this.f89748w.f89712c == null)) {
            this.f149186O0 = iM112836e;
            m66011m(ColorStateList.valueOf(iM112836e));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f149204c0;
        int colorForState2 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f149187P0) : 0;
        if (this.f149187P0 != colorForState2) {
            this.f149187P0 = colorForState2;
            zOnStateChange = true;
        }
        if (this.f149201a1 != null) {
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            for (int i13 : iArr) {
                if (i13 == 16842910) {
                    z15 = true;
                } else if (i13 == 16842908 || i13 == 16842919 || i13 == 16843623) {
                    z16 = true;
                }
            }
            if (z15 && z16) {
                z14 = true;
            }
            if (z14) {
                colorForState = this.f149201a1.getColorForState(iArr, this.f149188Q0);
            } else {
                colorForState = 0;
            }
        } else {
            colorForState = 0;
        }
        if (this.f149188Q0 != colorForState) {
            this.f149188Q0 = colorForState;
        }
        C17574d c17574d = this.f149183L0.f35031g;
        int colorForState3 = (c17574d == null || (colorStateList = c17574d.f68100j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f149189R0);
        if (this.f149189R0 != colorForState3) {
            this.f149189R0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z4 = false;
            break;
        }
        int length = state2.length;
        int i14 = 0;
        while (true) {
            if (i14 < length) {
                if (state2[i14] == 16842912) {
                    if (this.f149223r0) {
                        z4 = true;
                        break;
                    }
                } else {
                    i14++;
                }
            }
            z4 = false;
            break;
        }
        if (this.f149190S0 == z4 || this.f149225t0 == null) {
            z13 = false;
        } else {
            float fM111265y = m111265y();
            this.f149190S0 = z4;
            if (fM111265y != m111265y()) {
                zOnStateChange = true;
                z13 = true;
            } else {
                z13 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f149195X0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f149191T0) : 0;
        if (this.f149191T0 != colorForState4) {
            this.f149191T0 = colorForState4;
            ColorStateList colorStateList6 = this.f149195X0;
            PorterDuff.Mode mode = this.f149197Y0;
            this.f149194W0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (m111235C(this.f149213h0)) {
            state |= this.f149213h0.setState(iArr);
        }
        if (m111235C(this.f149225t0)) {
            state |= this.f149225t0.setState(iArr);
        }
        if (m111235C(this.f149218m0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f149218m0.setState(iArr3);
        }
        if (m111235C(this.f149219n0)) {
            state |= this.f149219n0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z13) {
            m111238D();
        }
        return state;
    }

    /* JADX INFO: renamed from: F */
    public final void m111240F(boolean z4) {
        if (this.f149223r0 != z4) {
            this.f149223r0 = z4;
            float fM111265y = m111265y();
            if (!z4 && this.f149190S0) {
                this.f149190S0 = false;
            }
            float fM111265y2 = m111265y();
            invalidateSelf();
            if (fM111265y != fM111265y2) {
                m111238D();
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m111241G(Drawable drawable) {
        if (this.f149225t0 != drawable) {
            float fM111265y = m111265y();
            this.f149225t0 = drawable;
            float fM111265y2 = m111265y();
            m111236c0(this.f149225t0);
            m111263w(this.f149225t0);
            invalidateSelf();
            if (fM111265y != fM111265y2) {
                m111238D();
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m111242H(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f149226u0 != colorStateList) {
            this.f149226u0 = colorStateList;
            if (this.f149224s0 && (drawable = this.f149225t0) != null && this.f149223r0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m111243I(boolean z4) {
        if (this.f149224s0 != z4) {
            boolean zM111260Z = m111260Z();
            this.f149224s0 = z4;
            boolean zM111260Z2 = m111260Z();
            if (zM111260Z != zM111260Z2) {
                if (zM111260Z2) {
                    m111263w(this.f149225t0);
                } else {
                    m111236c0(this.f149225t0);
                }
                invalidateSelf();
                m111238D();
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m111244J(float f13) {
        if (this.f149202b0 != f13) {
            this.f149202b0 = f13;
            C22791j c22791jM66029e = this.f89748w.f89710a.m66029e();
            c22791jM66029e.m66022b(f13);
            setShapeAppearanceModel(c22791jM66029e.m66021a());
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m111245K(Drawable drawable) {
        Drawable drawable2 = this.f149213h0;
        Drawable drawableM99995H = drawable2 != null ? AbstractC32121b.m99995H(drawable2) : null;
        if (drawableM99995H != drawable) {
            float fM111265y = m111265y();
            this.f149213h0 = drawable != null ? drawable.mutate() : null;
            float fM111265y2 = m111265y();
            m111236c0(drawableM99995H);
            if (m111261a0()) {
                m111263w(this.f149213h0);
            }
            invalidateSelf();
            if (fM111265y != fM111265y2) {
                m111238D();
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m111246L(float f13) {
        if (this.f149215j0 != f13) {
            float fM111265y = m111265y();
            this.f149215j0 = f13;
            float fM111265y2 = m111265y();
            invalidateSelf();
            if (fM111265y != fM111265y2) {
                m111238D();
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m111247M(ColorStateList colorStateList) {
        this.f149216k0 = true;
        if (this.f149214i0 != colorStateList) {
            this.f149214i0 = colorStateList;
            if (m111261a0()) {
                this.f149213h0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m111248N(boolean z4) {
        if (this.f149212g0 != z4) {
            boolean zM111261a0 = m111261a0();
            this.f149212g0 = z4;
            boolean zM111261a1 = m111261a0();
            if (zM111261a0 != zM111261a1) {
                if (zM111261a1) {
                    m111263w(this.f149213h0);
                } else {
                    m111236c0(this.f149213h0);
                }
                invalidateSelf();
                m111238D();
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m111249O(ColorStateList colorStateList) {
        if (this.f149204c0 != colorStateList) {
            this.f149204c0 = colorStateList;
            if (this.f149211f1) {
                m66015q(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m111250P(float f13) {
        if (this.f149206d0 != f13) {
            this.f149206d0 = f13;
            this.f149178G0.setStrokeWidth(f13);
            if (this.f149211f1) {
                m66017s(f13);
            }
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m111251Q(Drawable drawable) {
        Drawable drawable2 = this.f149218m0;
        Drawable drawableM99995H = drawable2 != null ? AbstractC32121b.m99995H(drawable2) : null;
        if (drawableM99995H != drawable) {
            float fM111266z = m111266z();
            this.f149218m0 = drawable != null ? drawable.mutate() : null;
            this.f149219n0 = new RippleDrawable(AbstractC20858a.m57613b(this.f149208e0), this.f149218m0, f149171h1);
            float fM111266z2 = m111266z();
            m111236c0(drawableM99995H);
            if (m111262b0()) {
                m111263w(this.f149218m0);
            }
            invalidateSelf();
            if (fM111266z != fM111266z2) {
                m111238D();
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m111252R(float f13) {
        if (this.f149175D0 != f13) {
            this.f149175D0 = f13;
            invalidateSelf();
            if (m111262b0()) {
                m111238D();
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m111253S(float f13) {
        if (this.f149221p0 != f13) {
            this.f149221p0 = f13;
            invalidateSelf();
            if (m111262b0()) {
                m111238D();
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m111254T(float f13) {
        if (this.f149174C0 != f13) {
            this.f149174C0 = f13;
            invalidateSelf();
            if (m111262b0()) {
                m111238D();
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m111255U(ColorStateList colorStateList) {
        if (this.f149220o0 != colorStateList) {
            this.f149220o0 = colorStateList;
            if (m111262b0()) {
                this.f149218m0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m111256V(boolean z4) {
        if (this.f149217l0 != z4) {
            boolean zM111262b0 = m111262b0();
            this.f149217l0 = z4;
            boolean zM111262b1 = m111262b0();
            if (zM111262b0 != zM111262b1) {
                if (zM111262b1) {
                    m111263w(this.f149218m0);
                } else {
                    m111236c0(this.f149218m0);
                }
                invalidateSelf();
                m111238D();
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m111257W(float f13) {
        if (this.f149231z0 != f13) {
            float fM111265y = m111265y();
            this.f149231z0 = f13;
            float fM111265y2 = m111265y();
            invalidateSelf();
            if (fM111265y != fM111265y2) {
                m111238D();
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m111258X(float f13) {
        if (this.f149230y0 != f13) {
            float fM111265y = m111265y();
            this.f149230y0 = f13;
            float fM111265y2 = m111265y();
            invalidateSelf();
            if (fM111265y != fM111265y2) {
                m111238D();
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m111259Y(ColorStateList colorStateList) {
        if (this.f149208e0 != colorStateList) {
            this.f149208e0 = colorStateList;
            this.f149201a1 = null;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m111260Z() {
        return this.f149224s0 && this.f149225t0 != null && this.f149190S0;
    }

    @Override // cr.InterfaceC11072j
    /* JADX INFO: renamed from: a */
    public final void mo29864a() {
        m111238D();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m111261a0() {
        return this.f149212g0 && this.f149213h0 != null;
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m111262b0() {
        return this.f149217l0 && this.f149218m0 != null;
    }

    @Override // kr.C22788g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i13;
        Canvas canvas2;
        int iSaveLayerAlpha;
        float f13;
        int i14;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i13 = this.f149192U0) == 0) {
            return;
        }
        if (i13 < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i13);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z4 = this.f149211f1;
        Paint paint = this.f149178G0;
        RectF rectF = this.f149180I0;
        if (!z4) {
            paint.setColor(this.f149184M0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m111237A(), m111237A(), paint);
        }
        if (!this.f149211f1) {
            paint.setColor(this.f149185N0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f149193V0;
            if (colorFilter == null) {
                colorFilter = this.f149194W0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m111237A(), m111237A(), paint);
        }
        if (this.f149211f1) {
            super.draw(canvas);
        }
        if (this.f149206d0 > 0.0f && !this.f149211f1) {
            paint.setColor(this.f149187P0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f149211f1) {
                ColorFilter colorFilter2 = this.f149193V0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f149194W0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f14 = bounds.left;
            float f15 = this.f149206d0 / 2.0f;
            rectF.set(f14 + f15, bounds.top + f15, bounds.right - f15, bounds.bottom - f15);
            float f16 = this.f149202b0 - (this.f149206d0 / 2.0f);
            canvas2.drawRoundRect(rectF, f16, f16, paint);
        }
        paint.setColor(this.f149188Q0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f149211f1) {
            RectF rectF2 = new RectF(bounds);
            C22787f c22787f = this.f89748w;
            C22792k c22792k = c22787f.f89710a;
            float f17 = c22787f.f89719j;
            C17417d c17417d = this.f89741Q;
            C22794m c22794m = this.f89742R;
            Path path = this.f149182K0;
            c22794m.m66030a(c22792k, f17, rectF2, c17417d, path);
            m66005f(canvas2, paint, path, this.f89748w.f89710a, m66006h());
        } else {
            canvas2.drawRoundRect(rectF, m111237A(), m111237A(), paint);
        }
        if (m111261a0()) {
            m111264x(bounds, rectF);
            float f18 = rectF.left;
            float f19 = rectF.top;
            canvas2.translate(f18, f19);
            this.f149213h0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f149213h0.draw(canvas2);
            canvas2.translate(-f18, -f19);
        }
        if (m111260Z()) {
            m111264x(bounds, rectF);
            float f24 = rectF.left;
            float f25 = rectF.top;
            canvas2.translate(f24, f25);
            this.f149225t0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f149225t0.draw(canvas2);
            canvas2.translate(-f24, -f25);
        }
        if (this.f149207d1 && this.f149210f0 != null) {
            PointF pointF = this.f149181J0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f149210f0;
            C11073k c11073k = this.f149183L0;
            if (charSequence != null) {
                float fM111265y = m111265y() + this.f149229x0 + this.f149172A0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fM111265y;
                } else {
                    pointF.x = bounds.right - fM111265y;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = c11073k.f35025a;
                Paint.FontMetrics fontMetrics = this.f149179H0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.f149210f0 != null) {
                float fM111265y2 = m111265y() + this.f149229x0 + this.f149172A0;
                float fM111266z = m111266z() + this.f149176E0 + this.f149173B0;
                if (getLayoutDirection() == 0) {
                    rectF.left = bounds.left + fM111265y2;
                    rectF.right = bounds.right - fM111266z;
                } else {
                    rectF.left = bounds.left + fM111266z;
                    rectF.right = bounds.right - fM111265y2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            C17574d c17574d = c11073k.f35031g;
            TextPaint textPaint2 = c11073k.f35025a;
            if (c17574d != null) {
                textPaint2.drawableState = getState();
                c11073k.f35031g.m50026e(this.f149177F0, textPaint2, c11073k.f35026b);
            }
            textPaint2.setTextAlign(align);
            String string = this.f149210f0.toString();
            if (c11073k.f35029e) {
                c11073k.m29865a(string);
                f13 = c11073k.f35027c;
            } else {
                f13 = c11073k.f35027c;
            }
            boolean z13 = Math.round(f13) > Math.round(rectF.width());
            if (z13) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i14 = iSave;
            } else {
                i14 = 0;
            }
            CharSequence charSequenceEllipsize = this.f149210f0;
            if (z13 && this.f149205c1 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.f149205c1);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z13) {
                canvas2.restoreToCount(i14);
            }
        }
        if (m111262b0()) {
            rectF.setEmpty();
            if (m111262b0()) {
                float f26 = this.f149176E0 + this.f149175D0;
                if (getLayoutDirection() == 0) {
                    float f27 = bounds.right - f26;
                    rectF.right = f27;
                    rectF.left = f27 - this.f149221p0;
                } else {
                    float f28 = bounds.left + f26;
                    rectF.left = f28;
                    rectF.right = f28 + this.f149221p0;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f29 = this.f149221p0;
                float f34 = fExactCenterY - (f29 / 2.0f);
                rectF.top = f34;
                rectF.bottom = f34 + f29;
            }
            float f35 = rectF.left;
            float f36 = rectF.top;
            canvas2.translate(f35, f36);
            this.f149218m0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f149219n0.setBounds(this.f149218m0.getBounds());
            this.f149219n0.jumpToCurrentState();
            this.f149219n0.draw(canvas2);
            canvas2.translate(-f35, -f36);
        }
        if (this.f149192U0 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // kr.C22788g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f149192U0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f149193V0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f149200a0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f13;
        float fM111265y = m111265y() + this.f149229x0 + this.f149172A0;
        String string = this.f149210f0.toString();
        C11073k c11073k = this.f149183L0;
        if (c11073k.f35029e) {
            c11073k.m29865a(string);
            f13 = c11073k.f35027c;
        } else {
            f13 = c11073k.f35027c;
        }
        return Math.min(Math.round(m111266z() + f13 + fM111265y + this.f149173B0 + this.f149176E0), this.f149209e1);
    }

    @Override // kr.C22788g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // kr.C22788g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f149211f1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f149200a0, this.f149202b0);
        } else {
            outline.setRoundRect(bounds, this.f149202b0);
            outline2 = outline;
        }
        outline2.setAlpha(this.f149192U0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // kr.C22788g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (m111234B(this.f149196Y) || m111234B(this.f149198Z) || m111234B(this.f149204c0)) {
            return true;
        }
        C17574d c17574d = this.f149183L0.f35031g;
        if (c17574d == null || (colorStateList = c17574d.f68100j) == null || !colorStateList.isStateful()) {
            return (this.f149224s0 && this.f149225t0 != null && this.f149223r0) || m111235C(this.f149213h0) || m111235C(this.f149225t0) || m111234B(this.f149195X0);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i13) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i13);
        if (m111261a0()) {
            zOnLayoutDirectionChanged |= this.f149213h0.setLayoutDirection(i13);
        }
        if (m111260Z()) {
            zOnLayoutDirectionChanged |= this.f149225t0.setLayoutDirection(i13);
        }
        if (m111262b0()) {
            zOnLayoutDirectionChanged |= this.f149218m0.setLayoutDirection(i13);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i13) {
        boolean zOnLevelChange = super.onLevelChange(i13);
        if (m111261a0()) {
            zOnLevelChange |= this.f149213h0.setLevel(i13);
        }
        if (m111260Z()) {
            zOnLevelChange |= this.f149225t0.setLevel(i13);
        }
        if (m111262b0()) {
            zOnLevelChange |= this.f149218m0.setLevel(i13);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // kr.C22788g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f149211f1) {
            super.onStateChange(iArr);
        }
        return m111239E(iArr, this.f149199Z0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j7);
        }
    }

    @Override // kr.C22788g, android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        if (this.f149192U0 != i13) {
            this.f149192U0 = i13;
            invalidateSelf();
        }
    }

    @Override // kr.C22788g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f149193V0 != colorFilter) {
            this.f149193V0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // kr.C22788g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f149195X0 != colorStateList) {
            this.f149195X0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // kr.C22788g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f149197Y0 != mode) {
            this.f149197Y0 = mode;
            ColorStateList colorStateList = this.f149195X0;
            this.f149194W0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z13) {
        boolean visible = super.setVisible(z4, z13);
        if (m111261a0()) {
            visible |= this.f149213h0.setVisible(z4, z13);
        }
        if (m111260Z()) {
            visible |= this.f149225t0.setVisible(z4, z13);
        }
        if (m111262b0()) {
            visible |= this.f149218m0.setVisible(z4, z13);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m111263w(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f149218m0) {
            if (drawable.isStateful()) {
                drawable.setState(this.f149199Z0);
            }
            drawable.setTintList(this.f149220o0);
            return;
        }
        Drawable drawable2 = this.f149213h0;
        if (drawable == drawable2 && this.f149216k0) {
            drawable2.setTintList(this.f149214i0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m111264x(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m111261a0() || m111260Z()) {
            float f13 = this.f149229x0 + this.f149230y0;
            Drawable drawable = this.f149190S0 ? this.f149225t0 : this.f149213h0;
            float intrinsicWidth = this.f149215j0;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f14 = rect.left + f13;
                rectF.left = f14;
                rectF.right = f14 + intrinsicWidth;
            } else {
                float f15 = rect.right - f13;
                rectF.right = f15;
                rectF.left = f15 - intrinsicWidth;
            }
            Drawable drawable2 = this.f149190S0 ? this.f149225t0 : this.f149213h0;
            float fCeil = this.f149215j0;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(AbstractC11075m.m29870d(this.f149177F0, 24));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    /* JADX INFO: renamed from: y */
    public final float m111265y() {
        if (!m111261a0() && !m111260Z()) {
            return 0.0f;
        }
        float f13 = this.f149230y0;
        Drawable drawable = this.f149190S0 ? this.f149225t0 : this.f149213h0;
        float intrinsicWidth = this.f149215j0;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f13 + this.f149231z0;
    }

    /* JADX INFO: renamed from: z */
    public final float m111266z() {
        if (m111262b0()) {
            return this.f149174C0 + this.f149221p0 + this.f149175D0;
        }
        return 0.0f;
    }
}
