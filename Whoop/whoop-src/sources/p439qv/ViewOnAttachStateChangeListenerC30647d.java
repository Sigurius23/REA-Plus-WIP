package p439qv;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.InterfaceC1585g0;
import p444r.ViewOnKeyListenerC30808c0;
import p444r.ViewOnKeyListenerC30812f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qv.d */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewOnAttachStateChangeListenerC30647d implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f126061w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f126062x;

    public /* synthetic */ ViewOnAttachStateChangeListenerC30647d(Object obj, int i13) {
        this.f126061w = i13;
        this.f126062x = obj;
    }

    /* JADX INFO: renamed from: a */
    private final void m94204a(View view) {
    }

    /* JADX INFO: renamed from: b */
    private final void m94205b(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f126061w) {
            case 0:
                AbstractC22676k.m65750j(view, "view");
                ((C30648e) this.f126062x).m94206a(view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f126061w) {
            case 0:
                AbstractC22676k.m65750j(view, "view");
                C30648e c30648e = (C30648e) this.f126062x;
                if (c30648e.f126067y) {
                    c30648e.f126067y = false;
                    InterfaceC1585g0 interfaceC1585g0 = c30648e.f126068z;
                    if (interfaceC1585g0 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    EnumC1635w currentState = interfaceC1585g0.getLifecycle().getCurrentState();
                    EnumC1635w enumC1635w = EnumC1635w.f6327y;
                    if (currentState.compareTo(enumC1635w) >= 0) {
                        c30648e.f126066x.m4993i(enumC1635w);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ViewOnKeyListenerC30812f viewOnKeyListenerC30812f = (ViewOnKeyListenerC30812f) this.f126062x;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC30812f.f127034X;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC30812f.f127034X = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC30812f.f127034X.removeGlobalOnLayoutListener(viewOnKeyListenerC30812f.f127019I);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                ViewOnKeyListenerC30808c0 viewOnKeyListenerC30808c0 = (ViewOnKeyListenerC30808c0) this.f126062x;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC30808c0.f126999O;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC30808c0.f126999O = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC30808c0.f126999O.removeGlobalOnLayoutListener(viewOnKeyListenerC30808c0.f126993I);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
        }
    }
}
