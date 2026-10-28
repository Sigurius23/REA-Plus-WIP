package ar;

import a33.C0352d;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.whoop.android.R;
import ir.AbstractC20858a;
import java.util.ArrayList;
import kr.C22788g;
import kr.C22792k;
import kr.InterfaceC22803v;
import p186h8.C16999a;
import p287kq.AbstractC22766a;
import p287kq.C22769d;
import p287kq.C22770e;
import p477s2.AbstractC32073e;
import p558vp.AbstractC36259c;
import ro.C31624i;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ar.k */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC1923k {

    /* JADX INFO: renamed from: a */
    public C22792k f7617a;

    /* JADX INFO: renamed from: b */
    public C22788g f7618b;

    /* JADX INFO: renamed from: c */
    public Drawable f7619c;

    /* JADX INFO: renamed from: d */
    public C1914b f7620d;

    /* JADX INFO: renamed from: e */
    public LayerDrawable f7621e;

    /* JADX INFO: renamed from: f */
    public boolean f7622f;

    /* JADX INFO: renamed from: h */
    public float f7624h;

    /* JADX INFO: renamed from: i */
    public float f7625i;

    /* JADX INFO: renamed from: j */
    public float f7626j;

    /* JADX INFO: renamed from: k */
    public int f7627k;

    /* JADX INFO: renamed from: l */
    public Animator f7628l;

    /* JADX INFO: renamed from: m */
    public C22770e f7629m;

    /* JADX INFO: renamed from: n */
    public C22770e f7630n;

    /* JADX INFO: renamed from: o */
    public float f7631o;

    /* JADX INFO: renamed from: q */
    public int f7633q;

    /* JADX INFO: renamed from: s */
    public final FloatingActionButton f7635s;

    /* JADX INFO: renamed from: t */
    public final C31624i f7636t;

    /* JADX INFO: renamed from: y */
    public ViewTreeObserverOnPreDrawListenerC1919g f7641y;

    /* JADX INFO: renamed from: z */
    public static final C16999a f7616z = AbstractC22766a.f89674c;

    /* JADX INFO: renamed from: A */
    public static final int f7606A = R.attr.motionDurationLong2;

    /* JADX INFO: renamed from: B */
    public static final int f7607B = R.attr.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: C */
    public static final int f7608C = R.attr.motionDurationMedium1;

    /* JADX INFO: renamed from: D */
    public static final int f7609D = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    /* JADX INFO: renamed from: E */
    public static final int[] f7610E = {android.R.attr.state_pressed, android.R.attr.state_enabled};

    /* JADX INFO: renamed from: F */
    public static final int[] f7611F = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};

    /* JADX INFO: renamed from: G */
    public static final int[] f7612G = {android.R.attr.state_focused, android.R.attr.state_enabled};

    /* JADX INFO: renamed from: H */
    public static final int[] f7613H = {android.R.attr.state_hovered, android.R.attr.state_enabled};

    /* JADX INFO: renamed from: I */
    public static final int[] f7614I = {android.R.attr.state_enabled};

    /* JADX INFO: renamed from: J */
    public static final int[] f7615J = new int[0];

    /* JADX INFO: renamed from: g */
    public boolean f7623g = true;

    /* JADX INFO: renamed from: p */
    public float f7632p = 1.0f;

    /* JADX INFO: renamed from: r */
    public int f7634r = 0;

    /* JADX INFO: renamed from: u */
    public final Rect f7637u = new Rect();

    /* JADX INFO: renamed from: v */
    public final RectF f7638v = new RectF();

    /* JADX INFO: renamed from: w */
    public final RectF f7639w = new RectF();

    /* JADX INFO: renamed from: x */
    public final Matrix f7640x = new Matrix();

    public AbstractC1923k(FloatingActionButton floatingActionButton, C31624i c31624i) {
        this.f7635s = floatingActionButton;
        this.f7636t = c31624i;
        C0352d c0352d = new C0352d(12);
        C1925m c1925m = (C1925m) this;
        c0352d.m930b(f7610E, m5876d(new C1921i(c1925m, 1)));
        c0352d.m930b(f7611F, m5876d(new C1921i(c1925m, 0)));
        c0352d.m930b(f7612G, m5876d(new C1921i(c1925m, 0)));
        c0352d.m930b(f7613H, m5876d(new C1921i(c1925m, 0)));
        c0352d.m930b(f7614I, m5876d(new C1921i(c1925m, 2)));
        c0352d.m930b(f7615J, m5876d(new C1920h(c1925m)));
        this.f7631o = floatingActionButton.getRotation();
    }

    /* JADX INFO: renamed from: d */
    public static ValueAnimator m5876d(AbstractC1922j abstractC1922j) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f7616z);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(abstractC1922j);
        valueAnimator.addUpdateListener(abstractC1922j);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* JADX INFO: renamed from: a */
    public final void m5877a(float f13, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f7635s.getDrawable();
        if (drawable == null || this.f7633q == 0) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        RectF rectF = this.f7638v;
        rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        float f14 = this.f7633q;
        RectF rectF2 = this.f7639w;
        rectF2.set(0.0f, 0.0f, f14, f14);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f15 = this.f7633q / 2.0f;
        matrix.postScale(f13, f13, f15, f15);
    }

    /* JADX INFO: renamed from: b */
    public final AnimatorSet m5878b(C22770e c22770e, float f13, float f14, float f15) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f13};
        FloatingActionButton floatingActionButton = this.f7635s;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        c22770e.m65975d("opacity").m65976a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f14);
        c22770e.m65975d("scale").m65976a(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f14);
        c22770e.m65975d("scale").m65976a(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        Matrix matrix = this.f7640x;
        m5877a(f15, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(floatingActionButton, new C22769d(), new C1917e(this), new Matrix(matrix));
        c22770e.m65975d("iconScale").m65976a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        AbstractC32073e.m99727U(animatorSet, arrayList);
        return animatorSet;
    }

    /* JADX INFO: renamed from: c */
    public final AnimatorSet m5879c(float f13, float f14, float f15, int i13, int i14) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.f7635s;
        valueAnimatorOfFloat.addUpdateListener(new C1918f(this, floatingActionButton.getAlpha(), f13, floatingActionButton.getScaleX(), f14, floatingActionButton.getScaleY(), this.f7632p, f15, new Matrix(this.f7640x)));
        arrayList.add(valueAnimatorOfFloat);
        AbstractC32073e.m99727U(animatorSet, arrayList);
        animatorSet.setDuration(AbstractC36259c.m115697k0(floatingActionButton.getContext(), i13, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(AbstractC36259c.m115699l0(floatingActionButton.getContext(), i14, AbstractC22766a.f89673b));
        return animatorSet;
    }

    /* JADX INFO: renamed from: e */
    public abstract float mo5880e();

    /* JADX INFO: renamed from: f */
    public void mo5881f(Rect rect) {
        int iMax = this.f7622f ? Math.max((this.f7627k - this.f7635s.getSizeDimension()) / 2, 0) : 0;
        float fMo5880e = this.f7623g ? mo5880e() + this.f7626j : 0.0f;
        int iMax2 = Math.max(iMax, (int) Math.ceil(fMo5880e));
        int iMax3 = Math.max(iMax, (int) Math.ceil(fMo5880e * 1.5f));
        rect.set(iMax2, iMax3, iMax2, iMax3);
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo5882g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i13);

    /* JADX INFO: renamed from: h */
    public abstract void mo5883h();

    /* JADX INFO: renamed from: i */
    public abstract void mo5884i();

    /* JADX INFO: renamed from: j */
    public abstract void mo5885j(int[] iArr);

    /* JADX INFO: renamed from: k */
    public abstract void mo5886k(float f13, float f14, float f15);

    /* JADX INFO: renamed from: l */
    public final void m5887l() {
    }

    /* JADX INFO: renamed from: m */
    public void mo5888m(ColorStateList colorStateList) {
        Drawable drawable = this.f7619c;
        if (drawable != null) {
            drawable.setTintList(AbstractC20858a.m57613b(colorStateList));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m5889n(C22792k c22792k) {
        this.f7617a = c22792k;
        C22788g c22788g = this.f7618b;
        if (c22788g != null) {
            c22788g.setShapeAppearanceModel(c22792k);
        }
        Object obj = this.f7619c;
        if (obj instanceof InterfaceC22803v) {
            ((InterfaceC22803v) obj).setShapeAppearanceModel(c22792k);
        }
        C1914b c1914b = this.f7620d;
        if (c1914b != null) {
            c1914b.f7581o = c22792k;
            c1914b.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: o */
    public abstract boolean mo5890o();

    /* JADX INFO: renamed from: p */
    public abstract void mo5891p();

    /* JADX INFO: renamed from: q */
    public final void m5892q() {
        Rect rect = this.f7637u;
        mo5881f(rect);
        AbstractC37056f.m118993q(this.f7621e, "Didn't initialize content background");
        boolean zMo5890o = mo5890o();
        C31624i c31624i = this.f7636t;
        if (zMo5890o) {
            super/*android.view.View*/.setBackgroundDrawable(new InsetDrawable((Drawable) this.f7621e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            LayerDrawable layerDrawable = this.f7621e;
            if (layerDrawable != null) {
                super/*android.view.View*/.setBackgroundDrawable(layerDrawable);
            } else {
                c31624i.getClass();
            }
        }
        int i13 = rect.left;
        int i14 = rect.top;
        int i15 = rect.right;
        int i16 = rect.bottom;
        FloatingActionButton floatingActionButton = (FloatingActionButton) c31624i.f130665x;
        floatingActionButton.f20990L.set(i13, i14, i15, i16);
        int i17 = floatingActionButton.f20987I;
        floatingActionButton.setPadding(i13 + i17, i14 + i17, i15 + i17, i16 + i17);
    }
}
