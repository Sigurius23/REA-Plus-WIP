package p439qv;

import android.view.View;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.C1593i0;
import androidx.lifecycle.InterfaceC1585g0;
import com.mapbox.maps.MapView;
import cu2.C11138r;
import java.lang.ref.WeakReference;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qv.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C30648e implements InterfaceC1585g0 {

    /* JADX INFO: renamed from: E */
    public final C11138r f126063E;

    /* JADX INFO: renamed from: F */
    public final ViewOnAttachStateChangeListenerC30647d f126064F;

    /* JADX INFO: renamed from: w */
    public final WeakReference f126065w;

    /* JADX INFO: renamed from: x */
    public final C1593i0 f126066x;

    /* JADX INFO: renamed from: y */
    public boolean f126067y;

    /* JADX INFO: renamed from: z */
    public InterfaceC1585g0 f126068z;

    public C30648e(MapView view) {
        AbstractC22676k.m65750j(view, "view");
        this.f126065w = new WeakReference(view);
        this.f126066x = new C1593i0(this);
        this.f126063E = new C11138r(this, 1);
        ViewOnAttachStateChangeListenerC30647d viewOnAttachStateChangeListenerC30647d = new ViewOnAttachStateChangeListenerC30647d(this, 0);
        this.f126064F = viewOnAttachStateChangeListenerC30647d;
        view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC30647d);
        if (view.isAttachedToWindow()) {
            m94206a(view);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m94206a(View view) {
        AbstractC1638x lifecycle;
        if (this.f126067y) {
            return;
        }
        InterfaceC1585g0 interfaceC1585g0 = this.f126068z;
        C11138r c11138r = this.f126063E;
        if (interfaceC1585g0 != null && (lifecycle = interfaceC1585g0.getLifecycle()) != null) {
            lifecycle.mo4988d(c11138r);
        }
        InterfaceC1585g0 interfaceC1585g0M5017g = AbstractC1613o1.m5017g(view);
        if (interfaceC1585g0M5017g == null) {
            throw new IllegalStateException("Please ensure that the hosting activity/fragment is a valid LifecycleOwner");
        }
        this.f126066x.m4993i(interfaceC1585g0M5017g.getLifecycle().getCurrentState());
        interfaceC1585g0M5017g.getLifecycle().mo4986a(c11138r);
        this.f126068z = interfaceC1585g0M5017g;
        this.f126067y = true;
    }

    @Override // androidx.lifecycle.InterfaceC1585g0
    public final AbstractC1638x getLifecycle() {
        return this.f126066x;
    }
}
