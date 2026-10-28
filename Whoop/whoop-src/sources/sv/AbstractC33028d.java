package sv;

import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.mapbox.maps.threading.AnimationThreadController;
import java.util.Arrays;
import p087db.C11845e;
import p470rv.InterfaceC31836p;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sv.d */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC33028d extends ValueAnimator {

    /* JADX INFO: renamed from: E */
    public static final LinearInterpolator f137566E = new LinearInterpolator();

    /* JADX INFO: renamed from: w */
    public Function1 f137567w;

    /* JADX INFO: renamed from: x */
    public final ValueAnimator f137568x;

    /* JADX INFO: renamed from: y */
    public InterfaceC31836p f137569y;

    /* JADX INFO: renamed from: z */
    public boolean f137570z;

    public AbstractC33028d(TypeEvaluator typeEvaluator) {
        setObjectValues(new Object[0]);
        super.setEvaluator(typeEvaluator);
        super.addUpdateListener(new C11845e(this, 11));
        setDuration(1000L);
        setInterpolator(f137566E);
        ValueAnimator valueAnimatorClone = clone();
        this.f137568x = valueAnimatorClone;
        valueAnimatorClone.setDuration(getDuration());
    }

    /* JADX INFO: renamed from: a */
    public final void m104296a(Object[] targets, Function1 function1) {
        AbstractC22676k.m65750j(targets, "targets");
        m104297b();
        if (function1 == null) {
            setObjectValues(Arrays.copyOf(targets, targets.length));
            AnimationThreadController.INSTANCE.postOnAnimatorThread(new C33027c(this, 0));
        } else {
            ValueAnimator valueAnimator = this.f137568x;
            function1.invoke(valueAnimator);
            valueAnimator.setObjectValues(Arrays.copyOf(targets, targets.length));
            AnimationThreadController.INSTANCE.postOnAnimatorThread(new C33027c(this, 1));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m104297b() {
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new C33027c(this, 2));
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo104295c(Object obj, float f13);

    @Override // android.animation.ValueAnimator
    public final void setObjectValues(Object... values) {
        AbstractC22676k.m65750j(values, "values");
        super.setObjectValues(Arrays.copyOf(values, values.length));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final ValueAnimator clone() {
        ValueAnimator valueAnimatorClone = super.clone();
        AbstractC22676k.m65749i(valueAnimatorClone, "super.clone()");
        return valueAnimatorClone;
    }
}
