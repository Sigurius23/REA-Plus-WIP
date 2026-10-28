package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Iterator;
import m83.AbstractC25265s;
import p000.AbstractC30802r;
import p108e4.AbstractC12682p;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.fragment.app.p2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1334p2 {

    /* JADX INFO: renamed from: a */
    public int f5749a;

    /* JADX INFO: renamed from: b */
    public int f5750b;

    /* JADX INFO: renamed from: c */
    public final AbstractComponentCallbacksC1320m0 f5751c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f5752d;

    /* JADX INFO: renamed from: e */
    public boolean f5753e;

    /* JADX INFO: renamed from: f */
    public boolean f5754f;

    /* JADX INFO: renamed from: g */
    public boolean f5755g;

    /* JADX INFO: renamed from: h */
    public boolean f5756h;

    /* JADX INFO: renamed from: i */
    public boolean f5757i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f5758j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f5759k;

    /* JADX INFO: renamed from: l */
    public final C1366z1 f5760l;

    public C1334p2(int i13, int i14, C1366z1 c1366z1) {
        AbstractC18489d0.m53382w(i13, "finalState");
        AbstractC18489d0.m53382w(i14, "lifecycleImpact");
        AbstractComponentCallbacksC1320m0 fragment = c1366z1.f5852c;
        AbstractC22676k.m65749i(fragment, "fragmentStateManager.fragment");
        AbstractC18489d0.m53382w(i13, "finalState");
        AbstractC18489d0.m53382w(i14, "lifecycleImpact");
        AbstractC22676k.m65750j(fragment, "fragment");
        this.f5749a = i13;
        this.f5750b = i14;
        this.f5751c = fragment;
        this.f5752d = new ArrayList();
        this.f5757i = true;
        ArrayList arrayList = new ArrayList();
        this.f5758j = arrayList;
        this.f5759k = arrayList;
        this.f5760l = c1366z1;
    }

    /* JADX INFO: renamed from: a */
    public final void m4200a(ViewGroup container) {
        AbstractC22676k.m65750j(container, "container");
        this.f5756h = false;
        if (this.f5753e) {
            return;
        }
        this.f5753e = true;
        if (this.f5758j.isEmpty()) {
            m4201b();
            return;
        }
        Iterator it = AbstractC25265s.m74093D1(this.f5759k).iterator();
        while (it.hasNext()) {
            ((AbstractC1330o2) it.next()).m4196a(container);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4201b() {
        this.f5756h = false;
        if (!this.f5754f) {
            if (AbstractC1329o1.m4132M(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f5754f = true;
            Iterator it = this.f5752d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f5751c.mTransitioning = false;
        this.f5760l.m4256k();
    }

    /* JADX INFO: renamed from: c */
    public final void m4202c(AbstractC1330o2 effect) {
        AbstractC22676k.m65750j(effect, "effect");
        ArrayList arrayList = this.f5758j;
        if (arrayList.remove(effect) && arrayList.isEmpty()) {
            m4201b();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4203d(int i13, int i14) {
        AbstractC18489d0.m53382w(i13, "finalState");
        AbstractC18489d0.m53382w(i14, "lifecycleImpact");
        int iM35485e = AbstractC12682p.m35485e(i14);
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = this.f5751c;
        if (iM35485e == 0) {
            if (this.f5749a != 1) {
                if (AbstractC1329o1.m4132M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC1320m0 + " mFinalState = " + AbstractC30802r.m94751D(this.f5749a) + " -> " + AbstractC30802r.m94751D(i13) + '.');
                }
                this.f5749a = i13;
                return;
            }
            return;
        }
        if (iM35485e == 1) {
            if (this.f5749a == 1) {
                if (AbstractC1329o1.m4132M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC1320m0 + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + AbstractC30802r.m94750C(this.f5750b) + " to ADDING.");
                }
                this.f5749a = 2;
                this.f5750b = 2;
                this.f5757i = true;
                return;
            }
            return;
        }
        if (iM35485e != 2) {
            return;
        }
        if (AbstractC1329o1.m4132M(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + abstractComponentCallbacksC1320m0 + " mFinalState = " + AbstractC30802r.m94751D(this.f5749a) + " -> REMOVED. mLifecycleImpact  = " + AbstractC30802r.m94750C(this.f5750b) + " to REMOVING.");
        }
        this.f5749a = 1;
        this.f5750b = 3;
        this.f5757i = true;
    }

    public final String toString() {
        StringBuilder sbM53375p = AbstractC18489d0.m53375p("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        sbM53375p.append(AbstractC30802r.m94751D(this.f5749a));
        sbM53375p.append(" lifecycleImpact = ");
        sbM53375p.append(AbstractC30802r.m94750C(this.f5750b));
        sbM53375p.append(" fragment = ");
        sbM53375p.append(this.f5751c);
        sbM53375p.append('}');
        return sbM53375p.toString();
    }
}
