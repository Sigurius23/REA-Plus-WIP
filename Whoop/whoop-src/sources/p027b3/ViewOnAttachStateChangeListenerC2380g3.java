package p027b3;

import android.view.View;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.InterfaceC1585g0;
import p390p1.C28688y1;
import p603x2.AbstractC37831a;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.jvm.internal.C22669g0;

/* JADX INFO: renamed from: b3.g3 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC2380g3 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9387w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ View f9388x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f9389y;

    public /* synthetic */ ViewOnAttachStateChangeListenerC2380g3(View view, int i13, Object obj) {
        this.f9387w = i13;
        this.f9388x = view;
        this.f9389y = obj;
    }

    /* JADX INFO: renamed from: a */
    private final void m7353a(View view) {
    }

    /* JADX INFO: renamed from: b */
    private final void m7354b(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f9387w) {
            case 0:
                AbstractC2346a abstractC2346a = (AbstractC2346a) this.f9388x;
                InterfaceC1585g0 interfaceC1585g0M5017g = AbstractC1613o1.m5017g(abstractC2346a);
                if (interfaceC1585g0M5017g != null) {
                    ((C22669g0) this.f9389y).f89336w = AbstractC2417o0.m7410b(abstractC2346a, interfaceC1585g0M5017g.getLifecycle());
                    abstractC2346a.removeOnAttachStateChangeListener(this);
                    return;
                } else {
                    AbstractC37831a.m121375c("View tree for " + abstractC2346a + " has no ViewTreeLifecycleOwner");
                    throw new KotlinNothingValueException();
                }
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f9387w) {
            case 0:
                break;
            default:
                this.f9388x.removeOnAttachStateChangeListener(this);
                ((C28688y1) this.f9389y).m87290v();
                break;
        }
    }
}
