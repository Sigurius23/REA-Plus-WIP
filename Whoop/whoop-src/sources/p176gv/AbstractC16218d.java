package p176gv;

import android.animation.Animator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import b30.C2606q3;
import com.mapbox.maps.threading.AnimationThreadController;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import m83.AbstractC25260n;
import p157fv.C14796b;
import p157fv.C14797c;
import p157fv.C14803i;
import p157fv.EnumC14804j;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gv.d */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC16218d extends ValueAnimator {

    /* JADX INFO: renamed from: E */
    public boolean f61602E;

    /* JADX INFO: renamed from: F */
    public C14796b f61603F;

    /* JADX INFO: renamed from: G */
    public C2606q3 f61604G;

    /* JADX INFO: renamed from: H */
    public final CopyOnWriteArraySet f61605H;

    /* JADX INFO: renamed from: I */
    public final CopyOnWriteArraySet f61606I;

    /* JADX INFO: renamed from: J */
    public boolean f61607J;

    /* JADX INFO: renamed from: K */
    public boolean f61608K;

    /* JADX INFO: renamed from: L */
    public boolean f61609L;

    /* JADX INFO: renamed from: w */
    public final TypeEvaluator f61610w;

    /* JADX INFO: renamed from: x */
    public String f61611x;

    /* JADX INFO: renamed from: y */
    public final Object f61612y;

    /* JADX INFO: renamed from: z */
    public final Object[] f61613z;

    public AbstractC16218d(TypeEvaluator evaluator, C14803i c14803i) {
        AbstractC22676k.m65750j(evaluator, "evaluator");
        this.f61610w = evaluator;
        this.f61611x = c14803i.f54956c;
        this.f61612y = c14803i.f54955b;
        Object[] objArr = c14803i.f54954a;
        this.f61613z = objArr;
        this.f61605H = new CopyOnWriteArraySet();
        this.f61606I = new CopyOnWriteArraySet();
        Object obj = objArr[0];
        setObjectValues(obj, obj);
        super.setEvaluator(evaluator);
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new C16216b(this, animatorListener));
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new C16217c(this, animatorUpdateListener));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new C14797c(this, 2));
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        if (getDuration() == 0 && getStartDelay() == 0) {
            Object objM74029E0 = AbstractC25260n.m74029E0(this.f61613z);
            AbstractC22676k.m65748h(objM74029E0, "null cannot be cast to non-null type kotlin.Any");
            return objM74029E0;
        }
        Object animatedValue = super.getAnimatedValue();
        AbstractC22676k.m65749i(animatedValue, "super.getAnimatedValue()");
        return animatedValue;
    }

    /* JADX INFO: renamed from: i */
    public final void m45917i(C2606q3 c2606q3) {
        super.removeAllListeners();
        this.f61602E = true;
        this.f61604G = c2606q3;
        super.addListener(c2606q3);
        Iterator it = this.f61606I.iterator();
        while (it.hasNext()) {
            super.addListener((Animator.AnimatorListener) it.next());
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m45918j(C14796b c14796b) {
        super.removeAllUpdateListeners();
        this.f61603F = c14796b;
        super.addUpdateListener(c14796b);
        Iterator it = this.f61605H.iterator();
        while (it.hasNext()) {
            super.addUpdateListener((ValueAnimator.AnimatorUpdateListener) it.next());
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract EnumC14804j mo45908k();

    /* JADX INFO: renamed from: l */
    public final void m45919l() {
        super.removeListener(this.f61604G);
        this.f61604G = null;
        this.f61602E = false;
    }

    /* JADX INFO: renamed from: n */
    public final void m45920n() {
        super.removeUpdateListener(this.f61603F);
        this.f61603F = null;
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new C14797c(this, 3));
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new C14797c(this, 4));
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new C16216b(animatorListener, this));
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new C16217c(animatorUpdateListener, this));
    }

    @Override // android.animation.ValueAnimator
    public final void setObjectValues(Object... values) {
        AbstractC22676k.m65750j(values, "values");
        super.setObjectValues(Arrays.copyOf(values, values.length));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void start() {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new C14797c(this, 5));
    }
}
