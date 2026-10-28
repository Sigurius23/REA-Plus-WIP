package p157fv;

import android.animation.Animator;
import android.animation.ValueAnimator;
import b30.C2606q3;
import c93.InterfaceC4339a;
import com.mapbox.maps.MapboxLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import p176gv.AbstractC16218d;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: fv.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C14797c extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f54919w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC16218d f54920x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14797c(AbstractC16218d abstractC16218d, int i13) {
        super(0);
        this.f54919w = i13;
        this.f54920x = abstractC16218d;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f54919w) {
            case 0:
                this.f54920x.cancel();
                break;
            case 1:
                this.f54920x.cancel();
                break;
            case 2:
                AbstractC16218d abstractC16218d = this.f54920x;
                abstractC16218d.f61607J = true;
                super/*android.animation.ValueAnimator*/.cancel();
                break;
            case 3:
                AbstractC16218d abstractC16218d2 = this.f54920x;
                super/*android.animation.Animator*/.removeAllListeners();
                C2606q3 c2606q3 = abstractC16218d2.f61604G;
                if (c2606q3 != null) {
                    super/*android.animation.Animator*/.addListener(c2606q3);
                }
                abstractC16218d2.f61606I.clear();
                break;
            case 4:
                AbstractC16218d abstractC16218d3 = this.f54920x;
                super/*android.animation.ValueAnimator*/.removeAllUpdateListeners();
                C14796b c14796b = abstractC16218d3.f61603F;
                if (c14796b != null) {
                    super/*android.animation.ValueAnimator*/.addUpdateListener(c14796b);
                }
                abstractC16218d3.f61605H.clear();
                break;
            default:
                AbstractC16218d abstractC16218d4 = this.f54920x;
                if (abstractC16218d4.f61602E) {
                    abstractC16218d4.f61607J = false;
                    if (abstractC16218d4.getDuration() == 0 && abstractC16218d4.getStartDelay() == 0) {
                        ArrayList<Animator.AnimatorListener> listeners = abstractC16218d4.getListeners();
                        AbstractC22676k.m65749i(listeners, "listeners");
                        List listM74093D1 = AbstractC25265s.m74093D1(listeners);
                        Iterator it = listM74093D1.iterator();
                        while (it.hasNext()) {
                            ((Animator.AnimatorListener) it.next()).onAnimationStart(abstractC16218d4);
                        }
                        C14796b c14796b2 = abstractC16218d4.f61603F;
                        if (c14796b2 != null) {
                            c14796b2.onAnimationUpdate(abstractC16218d4);
                        }
                        for (ValueAnimator.AnimatorUpdateListener animatorUpdateListener : abstractC16218d4.f61605H) {
                            if (animatorUpdateListener != null) {
                                animatorUpdateListener.onAnimationUpdate(abstractC16218d4);
                            }
                        }
                        Iterator it3 = listM74093D1.iterator();
                        while (it3.hasNext()) {
                            ((Animator.AnimatorListener) it3.next()).onAnimationEnd(abstractC16218d4);
                        }
                    } else {
                        super/*android.animation.ValueAnimator*/.start();
                    }
                } else {
                    MapboxLogger.logW("Mbgl-CameraAnimator", "Animation " + abstractC16218d4.mo45908k() + " was not registered and will not run. Register it with registerAnimation() method.");
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
