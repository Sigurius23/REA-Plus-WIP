package p027b3;

import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.InterfaceC1585g0;
import c93.InterfaceC4339a;
import p005a3.C0222l0;
import p005a3.C0226m0;
import p392p3.InterfaceC28769g;
import p603x2.AbstractC37831a;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30062i;

/* JADX INFO: renamed from: b3.h2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2384h2 implements InterfaceC30062i, InterfaceC2385h3, InterfaceC28769g {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ C2384h2 f9433w = new C2384h2();

    /* JADX INFO: renamed from: x */
    public static final C2384h2 f9434x = new C2384h2();

    /* JADX INFO: renamed from: y */
    public static final C2420o3 f9435y = new C2420o3();

    @Override // p027b3.InterfaceC2385h3
    /* JADX INFO: renamed from: a */
    public InterfaceC4339a mo7388a(AbstractC2346a abstractC2346a) {
        if (!abstractC2346a.isAttachedToWindow()) {
            C22669g0 c22669g0 = new C22669g0();
            ViewOnAttachStateChangeListenerC2380g3 viewOnAttachStateChangeListenerC2380g3 = new ViewOnAttachStateChangeListenerC2380g3(abstractC2346a, 0, c22669g0);
            abstractC2346a.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC2380g3);
            c22669g0.f89336w = new C0226m0(2, abstractC2346a, viewOnAttachStateChangeListenerC2380g3);
            return new C0222l0(c22669g0, 4);
        }
        InterfaceC1585g0 interfaceC1585g0M5017g = AbstractC1613o1.m5017g(abstractC2346a);
        if (interfaceC1585g0M5017g != null) {
            return AbstractC2417o0.m7410b(abstractC2346a, interfaceC1585g0M5017g.getLifecycle());
        }
        AbstractC37831a.m121375c("View tree for " + abstractC2346a + " has no ViewTreeLifecycleOwner");
        throw new KotlinNothingValueException();
    }
}
