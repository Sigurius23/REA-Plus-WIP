package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.whoop.android.R;
import g73.C15553a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p287kq.AbstractC22766a;
import p287kq.C22768c;
import p287kq.C22770e;
import p287kq.C22771f;
import p413q4.C29960e;
import p468rr.C31760b;
import p477s2.AbstractC32073e;
import pg3.C29205p;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: c */
    public final Rect f21369c;

    /* JADX INFO: renamed from: d */
    public final RectF f21370d;

    /* JADX INFO: renamed from: e */
    public final RectF f21371e;

    /* JADX INFO: renamed from: f */
    public final int[] f21372f;

    /* JADX INFO: renamed from: g */
    public float f21373g;

    /* JADX INFO: renamed from: h */
    public float f21374h;

    public FabTransformationBehavior() {
        this.f21369c = new Rect();
        this.f21370d = new RectF();
        this.f21371e = new RectF();
        this.f21372f = new int[2];
    }

    /* JADX INFO: renamed from: K */
    public static Pair m15920K(float f13, float f14, boolean z4, C29205p c29205p) {
        C22771f c22771fM65975d;
        C22771f c22771fM65975d2;
        if (f13 == 0.0f || f14 == 0.0f) {
            c22771fM65975d = ((C22770e) c29205p.f118204x).m65975d("translationXLinear");
            c22771fM65975d2 = ((C22770e) c29205p.f118204x).m65975d("translationYLinear");
        } else if ((!z4 || f14 >= 0.0f) && (z4 || f14 <= 0.0f)) {
            c22771fM65975d = ((C22770e) c29205p.f118204x).m65975d("translationXCurveDownwards");
            c22771fM65975d2 = ((C22770e) c29205p.f118204x).m65975d("translationYCurveDownwards");
        } else {
            c22771fM65975d = ((C22770e) c29205p.f118204x).m65975d("translationXCurveUpwards");
            c22771fM65975d2 = ((C22770e) c29205p.f118204x).m65975d("translationYCurveUpwards");
        }
        return new Pair(c22771fM65975d, c22771fM65975d2);
    }

    /* JADX INFO: renamed from: N */
    public static float m15921N(C29205p c29205p, C22771f c22771f, float f13) {
        long j7 = c22771f.f89681a;
        long j13 = c22771f.f89682b;
        C22771f c22771fM65975d = ((C22770e) c29205p.f118204x).m65975d("expansion");
        return AbstractC22766a.m65969a(f13, 0.0f, c22771f.m65977b().getInterpolation((((c22771fM65975d.f89681a + c22771fM65975d.f89682b) + 17) - j7) / j13));
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* JADX INFO: renamed from: J */
    public final AnimatorSet mo15919J(View view, View view2, boolean z4, boolean z13) {
        ObjectAnimator objectAnimatorOfFloat;
        int i13;
        float f13;
        ObjectAnimator objectAnimatorOfFloat2;
        ObjectAnimator objectAnimatorOfFloat3;
        ObjectAnimator objectAnimatorOfFloat4;
        C29205p c29205pMo15925P = mo15925P(view2.getContext(), z4);
        if (z4) {
            this.f21373g = view.getTranslationX();
            this.f21374h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        float fM47510e = AbstractC16877h0.m47510e(view2) - AbstractC16877h0.m47510e(view);
        if (z4) {
            if (!z13) {
                view2.setTranslationZ(-fM47510e);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fM47510e);
        }
        ((C22770e) c29205pMo15925P.f118204x).m65975d("elevation").m65976a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        float fM15922L = m15922L(view, view2, (C15553a) c29205pMo15925P.f118205y);
        float fM15923M = m15923M(view, view2, (C15553a) c29205pMo15925P.f118205y);
        Pair pairM15920K = m15920K(fM15922L, fM15923M, z4, c29205pMo15925P);
        C22771f c22771f = (C22771f) pairM15920K.first;
        C22771f c22771f2 = (C22771f) pairM15920K.second;
        RectF rectF = this.f21370d;
        if (z4) {
            if (!z13) {
                view2.setTranslationX(-fM15922L);
                view2.setTranslationY(-fM15923M);
            }
            i13 = 0;
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            f13 = 0.0f;
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float fM15921N = m15921N(c29205pMo15925P, c22771f, -fM15922L);
            float fM15921N2 = m15921N(c29205pMo15925P, c22771f2, -fM15923M);
            Rect rect = this.f21369c;
            view2.getWindowVisibleDisplayFrame(rect);
            rectF.set(rect);
            RectF rectF2 = this.f21371e;
            m15924O(view2, rectF2);
            rectF2.offset(fM15921N, fM15921N2);
            rectF2.intersect(rectF);
            rectF.set(rectF2);
        } else {
            i13 = 0;
            f13 = 0.0f;
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fM15922L);
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fM15923M);
        }
        c22771f.m65976a(objectAnimatorOfFloat2);
        c22771f2.m65976a(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat3);
        rectF.width();
        rectF.height();
        float fM15922L2 = m15922L(view, view2, (C15553a) c29205pMo15925P.f118205y);
        float fM15923M2 = m15923M(view, view2, (C15553a) c29205pMo15925P.f118205y);
        Pair pairM15920K2 = m15920K(fM15922L2, fM15923M2, z4, c29205pMo15925P);
        C22771f c22771f3 = (C22771f) pairM15920K2.first;
        C22771f c22771f4 = (C22771f) pairM15920K2.second;
        Property property = View.TRANSLATION_X;
        if (!z4) {
            fM15922L2 = this.f21373g;
        }
        float[] fArr = new float[1];
        fArr[i13] = fM15922L2;
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        if (!z4) {
            fM15923M2 = this.f21374h;
        }
        float[] fArr2 = new float[1];
        fArr2[i13] = fM15923M2;
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        c22771f3.m65976a(objectAnimatorOfFloat5);
        c22771f4.m65976a(objectAnimatorOfFloat6);
        arrayList.add(objectAnimatorOfFloat5);
        arrayList.add(objectAnimatorOfFloat6);
        boolean z14 = view2 instanceof ViewGroup;
        if (z14) {
            View viewFindViewById = view2.findViewById(R.id.mtrl_child_content_container);
            ViewGroup viewGroup = null;
            if (viewFindViewById != null) {
                if (viewFindViewById instanceof ViewGroup) {
                    viewGroup = (ViewGroup) viewFindViewById;
                }
            } else if (z14) {
                viewGroup = (ViewGroup) view2;
            }
            if (viewGroup != null) {
                if (z4) {
                    if (!z13) {
                        C22768c.f89677a.set(viewGroup, Float.valueOf(f13));
                    }
                    C22768c c22768c = C22768c.f89677a;
                    float[] fArr3 = new float[1];
                    fArr3[i13] = 1.0f;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, c22768c, fArr3);
                } else {
                    C22768c c22768c2 = C22768c.f89677a;
                    float[] fArr4 = new float[1];
                    fArr4[i13] = f13;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, c22768c2, fArr4);
                }
                ((C22770e) c29205pMo15925P.f118204x).m65975d("contentFade").m65976a(objectAnimatorOfFloat4);
                arrayList.add(objectAnimatorOfFloat4);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AbstractC32073e.m99727U(animatorSet, arrayList);
        animatorSet.addListener(new C31760b(z4, view2, view));
        int size = arrayList2.size();
        for (int i14 = i13; i14 < size; i14++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i14));
        }
        return animatorSet;
    }

    /* JADX INFO: renamed from: L */
    public final float m15922L(View view, View view2, C15553a c15553a) {
        RectF rectF = this.f21370d;
        m15924O(view, rectF);
        rectF.offset(this.f21373g, this.f21374h);
        RectF rectF2 = this.f21371e;
        m15924O(view2, rectF2);
        c15553a.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    /* JADX INFO: renamed from: M */
    public final float m15923M(View view, View view2, C15553a c15553a) {
        RectF rectF = this.f21370d;
        m15924O(view, rectF);
        rectF.offset(this.f21373g, this.f21374h);
        RectF rectF2 = this.f21371e;
        m15924O(view2, rectF2);
        c15553a.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    /* JADX INFO: renamed from: O */
    public final void m15924O(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f21372f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    /* JADX INFO: renamed from: P */
    public abstract C29205p mo15925P(Context context, boolean z4);

    @Override // com.google.android.material.transformation.ExpandableBehavior, p413q4.AbstractC29957b
    /* JADX INFO: renamed from: i */
    public final boolean mo15674i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // p413q4.AbstractC29957b
    /* JADX INFO: renamed from: k */
    public final void mo15713k(C29960e c29960e) {
        if (c29960e.f122371h == 0) {
            c29960e.f122371h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21369c = new Rect();
        this.f21370d = new RectF();
        this.f21371e = new RectF();
        this.f21372f = new int[2];
    }
}
