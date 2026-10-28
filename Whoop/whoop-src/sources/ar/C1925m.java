package ar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.whoop.android.R;
import ir.AbstractC20858a;
import java.util.ArrayList;
import kr.C22788g;
import kr.C22792k;
import p479s4.AbstractC32122c;

/* JADX INFO: renamed from: ar.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C1925m extends AbstractC1923k {

    /* JADX INFO: renamed from: K */
    public StateListAnimator f7642K;

    @Override // ar.AbstractC1923k
    /* JADX INFO: renamed from: e */
    public final float mo5880e() {
        return this.f7635s.getElevation();
    }

    @Override // ar.AbstractC1923k
    /* JADX INFO: renamed from: f */
    public final void mo5881f(Rect rect) {
        if (((FloatingActionButton) this.f7636t.f130665x).f20989K) {
            super.mo5881f(rect);
            return;
        }
        if (this.f7622f) {
            FloatingActionButton floatingActionButton = this.f7635s;
            int sizeDimension = floatingActionButton.getSizeDimension();
            int i13 = this.f7627k;
            if (sizeDimension < i13) {
                int sizeDimension2 = (i13 - floatingActionButton.getSizeDimension()) / 2;
                rect.set(sizeDimension2, sizeDimension2, sizeDimension2, sizeDimension2);
                return;
            }
        }
        rect.set(0, 0, 0, 0);
    }

    @Override // ar.AbstractC1923k
    /* JADX INFO: renamed from: g */
    public final void mo5882g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i13) {
        Drawable layerDrawable;
        C22792k c22792k = this.f7617a;
        c22792k.getClass();
        C1924l c1924l = new C1924l(c22792k);
        this.f7618b = c1924l;
        c1924l.setTintList(colorStateList);
        if (mode != null) {
            this.f7618b.setTintMode(mode);
        }
        C22788g c22788g = this.f7618b;
        FloatingActionButton floatingActionButton = this.f7635s;
        c22788g.m66009k(floatingActionButton.getContext());
        if (i13 > 0) {
            Context context = floatingActionButton.getContext();
            C22792k c22792k2 = this.f7617a;
            c22792k2.getClass();
            C1914b c1914b = new C1914b(c22792k2);
            int color = AbstractC32122c.getColor(context, R.color.design_fab_stroke_top_outer_color);
            int color2 = AbstractC32122c.getColor(context, R.color.design_fab_stroke_top_inner_color);
            int color3 = AbstractC32122c.getColor(context, R.color.design_fab_stroke_end_inner_color);
            int color4 = AbstractC32122c.getColor(context, R.color.design_fab_stroke_end_outer_color);
            c1914b.f7575i = color;
            c1914b.f7576j = color2;
            c1914b.f7577k = color3;
            c1914b.f7578l = color4;
            float f13 = i13;
            if (c1914b.f7574h != f13) {
                c1914b.f7574h = f13;
                c1914b.f7568b.setStrokeWidth(f13 * 1.3333f);
                c1914b.f7580n = true;
                c1914b.invalidateSelf();
            }
            if (colorStateList != null) {
                c1914b.f7579m = colorStateList.getColorForState(c1914b.getState(), c1914b.f7579m);
            }
            c1914b.f7582p = colorStateList;
            c1914b.f7580n = true;
            c1914b.invalidateSelf();
            this.f7620d = c1914b;
            C1914b c1914b2 = this.f7620d;
            c1914b2.getClass();
            C22788g c22788g2 = this.f7618b;
            c22788g2.getClass();
            layerDrawable = new LayerDrawable(new Drawable[]{c1914b2, c22788g2});
        } else {
            this.f7620d = null;
            layerDrawable = this.f7618b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC20858a.m57613b(colorStateList2), layerDrawable, null);
        this.f7619c = rippleDrawable;
        this.f7621e = rippleDrawable;
    }

    @Override // ar.AbstractC1923k
    /* JADX INFO: renamed from: h */
    public final void mo5883h() {
    }

    @Override // ar.AbstractC1923k
    /* JADX INFO: renamed from: i */
    public final void mo5884i() {
        m5892q();
    }

    @Override // ar.AbstractC1923k
    /* JADX INFO: renamed from: j */
    public final void mo5885j(int[] iArr) {
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // ar.AbstractC1923k
    /* JADX INFO: renamed from: k */
    public final void mo5886k(float f13, float f14, float f15) {
        FloatingActionButton floatingActionButton = this.f7635s;
        if (floatingActionButton.getStateListAnimator() == this.f7642K) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(AbstractC1923k.f7610E, m5893r(f13, f15));
            stateListAnimator.addState(AbstractC1923k.f7611F, m5893r(f13, f14));
            stateListAnimator.addState(AbstractC1923k.f7612G, m5893r(f13, f14));
            stateListAnimator.addState(AbstractC1923k.f7613H, m5893r(f13, f14));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f13).setDuration(0L));
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(AbstractC1923k.f7616z);
            stateListAnimator.addState(AbstractC1923k.f7614I, animatorSet);
            stateListAnimator.addState(AbstractC1923k.f7615J, m5893r(0.0f, 0.0f));
            this.f7642K = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (mo5890o()) {
            m5892q();
        }
    }

    @Override // ar.AbstractC1923k
    /* JADX INFO: renamed from: m */
    public final void mo5888m(ColorStateList colorStateList) {
        Drawable drawable = this.f7619c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(AbstractC20858a.m57613b(colorStateList));
        } else {
            super.mo5888m(colorStateList);
        }
    }

    @Override // ar.AbstractC1923k
    /* JADX INFO: renamed from: o */
    public final boolean mo5890o() {
        if (((FloatingActionButton) this.f7636t.f130665x).f20989K) {
            return true;
        }
        return this.f7622f && this.f7635s.getSizeDimension() < this.f7627k;
    }

    @Override // ar.AbstractC1923k
    /* JADX INFO: renamed from: p */
    public final void mo5891p() {
    }

    /* JADX INFO: renamed from: r */
    public final AnimatorSet m5893r(float f13, float f14) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f13};
        FloatingActionButton floatingActionButton = this.f7635s;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f14).setDuration(100L));
        animatorSet.setInterpolator(AbstractC1923k.f7616z);
        return animatorSet;
    }
}
