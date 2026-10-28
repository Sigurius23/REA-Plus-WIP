package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p029b5.C2725d;

/* JADX INFO: renamed from: androidx.fragment.app.i2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1306i2 extends AbstractC1314k2 {
    /* JADX INFO: renamed from: z */
    public static boolean m4088z(Transition transition) {
        return (AbstractC1314k2.m4113k(transition.getTargetIds()) && AbstractC1314k2.m4113k(transition.getTargetNames()) && AbstractC1314k2.m4113k(transition.getTargetTypes())) ? false : true;
    }

    /* JADX INFO: renamed from: A */
    public final void m4089A(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i13 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i13 < transitionCount) {
                m4089A(transitionSet.getTransitionAt(i13), arrayList, arrayList2);
                i13++;
            }
            return;
        }
        if (m4088z(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i13 < size) {
            transition.addTarget((View) arrayList2.get(i13));
            i13++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget((View) arrayList.get(size2));
        }
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: a */
    public final void mo4090a(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: b */
    public final void mo4091b(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i13 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i13 < transitionCount) {
                mo4091b(transitionSet.getTransitionAt(i13), arrayList);
                i13++;
            }
            return;
        }
        if (m4088z(transition) || !AbstractC1314k2.m4113k(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i13 < size) {
            transition.addTarget((View) arrayList.get(i13));
            i13++;
        }
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: e */
    public final void mo4092e(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: g */
    public final boolean mo4093g(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: h */
    public final Object mo4094h(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: l */
    public final boolean mo4095l() {
        if (!AbstractC1329o1.m4132M(4)) {
            return false;
        }
        Log.i("FragmentManager", "Predictive back not available using Framework Transitions. Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
        return false;
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: m */
    public final boolean mo4096m(Object obj) {
        if (!AbstractC1329o1.m4132M(2)) {
            return false;
        }
        Log.v("FragmentManager", "Predictive back not available for framework transition " + obj + ". Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
        return false;
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: n */
    public final Object mo4097n(Object obj, Object obj2, Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: o */
    public final Object mo4098o(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: p */
    public final void mo4099p(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new C1294f2(view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: q */
    public final void mo4100q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).addListener(new C1298g2(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: s */
    public final void mo4101s(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            AbstractC1314k2.m4112j(view, rect);
            ((Transition) obj).setEpicenterCallback(new C1290e2(0, rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: t */
    public final void mo4102t(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new C1290e2(1, rect));
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: u */
    public final void mo4103u(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, Object obj, C2725d c2725d, Runnable runnable) {
        ((Transition) obj).addListener(new C1302h2(runnable));
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: w */
    public final void mo4104w(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            AbstractC1314k2.m4111f((View) arrayList.get(i13), targets);
        }
        targets.add(view);
        arrayList.add(view);
        mo4091b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: x */
    public final void mo4105x(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            m4089A(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC1314k2
    /* JADX INFO: renamed from: y */
    public final Object mo4106y(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }
}
