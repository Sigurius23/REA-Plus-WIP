package p028b4;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import l83.C23454a0;
import p005a3.AbstractC0201g;
import p095dp.AbstractC12240d;
import p164g2.C15228a;
import p164g2.InterfaceC15239k;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: b4.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C2707r extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10671w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ViewTreeObserverOnGlobalFocusChangeListenerC2708s f10672x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2707r(ViewTreeObserverOnGlobalFocusChangeListenerC2708s viewTreeObserverOnGlobalFocusChangeListenerC2708s, int i13) {
        super(1);
        this.f10671w = i13;
        this.f10672x = viewTreeObserverOnGlobalFocusChangeListenerC2708s;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f10671w) {
            case 0:
                C15228a c15228a = (C15228a) obj;
                ViewTreeObserverOnGlobalFocusChangeListenerC2708s viewTreeObserverOnGlobalFocusChangeListenerC2708s = this.f10672x;
                View viewM7586e = AbstractC2703n.m7586e(viewTreeObserverOnGlobalFocusChangeListenerC2708s);
                if (!viewM7586e.isFocused() && !viewM7586e.hasFocus()) {
                    if (!AbstractC21598x.m60693o0(viewM7586e, AbstractC21598x.m60705u0(c15228a.f57222a), AbstractC2703n.m7585d(AbstractC0201g.m517q(viewTreeObserverOnGlobalFocusChangeListenerC2708s).getFocusOwner(), AbstractC12240d.m34057W(viewTreeObserverOnGlobalFocusChangeListenerC2708s), viewM7586e))) {
                        c15228a.f57223b = true;
                    }
                }
                return C23454a0.f92919a;
            default:
                C15228a c15228a2 = (C15228a) obj;
                ViewTreeObserverOnGlobalFocusChangeListenerC2708s viewTreeObserverOnGlobalFocusChangeListenerC2708s2 = this.f10672x;
                View viewM7586e2 = AbstractC2703n.m7586e(viewTreeObserverOnGlobalFocusChangeListenerC2708s2);
                if (viewM7586e2.hasFocus()) {
                    InterfaceC15239k focusOwner = AbstractC0201g.m517q(viewTreeObserverOnGlobalFocusChangeListenerC2708s2).getFocusOwner();
                    View viewM34057W = AbstractC12240d.m34057W(viewTreeObserverOnGlobalFocusChangeListenerC2708s2);
                    if (viewM7586e2 instanceof ViewGroup) {
                        Rect rectM7585d = AbstractC2703n.m7585d(focusOwner, viewM34057W, viewM7586e2);
                        Integer numM60705u0 = AbstractC21598x.m60705u0(c15228a2.f57222a);
                        int iIntValue = numM60705u0 != null ? numM60705u0.intValue() : 130;
                        FocusFinder focusFinder = FocusFinder.getInstance();
                        View view = viewTreeObserverOnGlobalFocusChangeListenerC2708s2.f10673O;
                        View viewFindNextFocus = view != null ? focusFinder.findNextFocus((ViewGroup) viewM34057W, view, iIntValue) : focusFinder.findNextFocusFromRect((ViewGroup) viewM34057W, rectM7585d, iIntValue);
                        if (viewFindNextFocus != null && AbstractC2703n.m7584c(viewM7586e2, viewFindNextFocus)) {
                            viewFindNextFocus.requestFocus(iIntValue, rectM7585d);
                            c15228a2.f57223b = true;
                        } else if (!viewM34057W.requestFocus()) {
                            throw new IllegalStateException("host view did not take focus");
                        }
                    } else if (!viewM34057W.requestFocus()) {
                        throw new IllegalStateException("host view did not take focus");
                    }
                }
                return C23454a0.f92919a;
        }
    }
}
