package p444r;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import p474s.C31935a2;
import p474s.C31965i0;
import p474s.C31977l0;

/* JADX INFO: renamed from: r.d */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC30809d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f127008w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f127009x;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC30809d(Object obj, int i13) {
        this.f127008w = i13;
        this.f127009x = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f127008w) {
            case 0:
                ViewOnKeyListenerC30812f viewOnKeyListenerC30812f = (ViewOnKeyListenerC30812f) this.f127009x;
                ArrayList arrayList = viewOnKeyListenerC30812f.f127018H;
                if (viewOnKeyListenerC30812f.mo94784a() && arrayList.size() > 0 && !((C30811e) arrayList.get(0)).f127012a.f132870Y) {
                    View view = viewOnKeyListenerC30812f.f127025O;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((C30811e) it.next()).f127012a.mo94785c();
                        }
                    } else {
                        viewOnKeyListenerC30812f.dismiss();
                    }
                    break;
                }
                break;
            case 1:
                ViewOnKeyListenerC30808c0 viewOnKeyListenerC30808c0 = (ViewOnKeyListenerC30808c0) this.f127009x;
                C31935a2 c31935a2 = viewOnKeyListenerC30808c0.f126992H;
                if (viewOnKeyListenerC30808c0.mo94784a() && !c31935a2.f132870Y) {
                    View view2 = viewOnKeyListenerC30808c0.f126997M;
                    if (view2 != null && view2.isShown()) {
                        c31935a2.mo94785c();
                    } else {
                        viewOnKeyListenerC30808c0.dismiss();
                    }
                    break;
                }
                break;
            case 2:
                C31977l0 c31977l0 = (C31977l0) this.f127009x;
                if (!c31977l0.getInternalPopup().mo99431a()) {
                    c31977l0.f132753F.mo99439j(c31977l0.getTextDirection(), c31977l0.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c31977l0.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            default:
                C31965i0 c31965i0 = (C31965i0) this.f127009x;
                C31977l0 c31977l1 = c31965i0.f132712g0;
                c31965i0.getClass();
                if (c31977l1.isAttachedToWindow() && c31977l1.getGlobalVisibleRect(c31965i0.f132710e0)) {
                    c31965i0.m99454q();
                    c31965i0.mo94785c();
                } else {
                    c31965i0.dismiss();
                }
                break;
        }
    }
}
