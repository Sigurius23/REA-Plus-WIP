package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import m83.AbstractC25265s;
import p161g.AbstractC14917t;
import p161g.C14894a;
import p189hb.C17073i;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.fragment.app.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1285d1 extends AbstractC14917t {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC1329o1 f5585d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1285d1(AbstractC1329o1 abstractC1329o1) {
        super(false);
        this.f5585d = abstractC1329o1;
    }

    @Override // p161g.AbstractC14917t
    /* JADX INFO: renamed from: c */
    public final void mo4072c() {
        boolean zM4132M = AbstractC1329o1.m4132M(3);
        AbstractC1329o1 abstractC1329o1 = this.f5585d;
        if (zM4132M) {
            Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + abstractC1329o1);
        }
        if (AbstractC1329o1.m4132M(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + abstractC1329o1.f5722h);
        }
        C1271a c1271a = abstractC1329o1.f5722h;
        if (c1271a != null) {
            c1271a.f5519u = false;
            c1271a.m4045i();
            C1271a c1271a2 = abstractC1329o1.f5722h;
            RunnableC1319m runnableC1319m = new RunnableC1319m(abstractC1329o1, 3);
            if (c1271a2.f5579s == null) {
                c1271a2.f5579s = new ArrayList();
            }
            c1271a2.f5579s.add(runnableC1319m);
            abstractC1329o1.f5722h.m4046j();
            abstractC1329o1.f5723i = true;
            abstractC1329o1.m4195z(true);
            abstractC1329o1.m4141G();
            abstractC1329o1.f5723i = false;
            abstractC1329o1.f5722h = null;
        }
    }

    @Override // p161g.AbstractC14917t
    /* JADX INFO: renamed from: d */
    public final void mo4073d() {
        boolean zM4132M = AbstractC1329o1.m4132M(3);
        AbstractC1329o1 abstractC1329o1 = this.f5585d;
        if (zM4132M) {
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + abstractC1329o1);
        }
        C1285d1 c1285d1 = abstractC1329o1.f5724j;
        ArrayList<C17073i> arrayList = abstractC1329o1.f5729o;
        abstractC1329o1.f5723i = true;
        abstractC1329o1.m4195z(true);
        abstractC1329o1.f5723i = false;
        if (abstractC1329o1.f5722h == null) {
            if (c1285d1.m43010g()) {
                if (AbstractC1329o1.m4132M(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                abstractC1329o1.m4150T();
                return;
            } else {
                if (AbstractC1329o1.m4132M(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                abstractC1329o1.f5721g.m43018d();
                return;
            }
        }
        if (!arrayList.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC1329o1.m4131H(abstractC1329o1.f5722h));
            for (C17073i c17073i : arrayList) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    c17073i.m48198a((AbstractComponentCallbacksC1320m0) it.next(), true);
                }
            }
        }
        Iterator it3 = abstractC1329o1.f5722h.f5563c.iterator();
        while (it3.hasNext()) {
            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = ((C1278b2) it3.next()).f5548b;
            if (abstractComponentCallbacksC1320m0 != null) {
                abstractComponentCallbacksC1320m0.mTransitioning = false;
            }
        }
        for (C1343s c1343s : abstractC1329o1.m4167f(new ArrayList(Collections.singletonList(abstractC1329o1.f5722h)), 0, 1)) {
            ArrayList arrayList2 = c1343s.f5792c;
            if (AbstractC1329o1.m4132M(3)) {
                Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
            }
            c1343s.m4224m(arrayList2);
            c1343s.m4217c(arrayList2);
        }
        Iterator it4 = abstractC1329o1.f5722h.f5563c.iterator();
        while (it4.hasNext()) {
            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m1 = ((C1278b2) it4.next()).f5548b;
            if (abstractComponentCallbacksC1320m1 != null && abstractComponentCallbacksC1320m1.mContainer == null) {
                abstractC1329o1.m4169g(abstractComponentCallbacksC1320m1).m4256k();
            }
        }
        abstractC1329o1.f5722h = null;
        abstractC1329o1.m4183n0();
        if (AbstractC1329o1.m4132M(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + c1285d1.m43010g() + " for  FragmentManager " + abstractC1329o1);
        }
    }

    @Override // p161g.AbstractC14917t
    /* JADX INFO: renamed from: e */
    public final void mo4074e(C14894a backEvent) {
        boolean zM4132M = AbstractC1329o1.m4132M(2);
        AbstractC1329o1 abstractC1329o1 = this.f5585d;
        if (zM4132M) {
            Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + abstractC1329o1);
        }
        if (abstractC1329o1.f5722h != null) {
            for (C1343s c1343s : abstractC1329o1.m4167f(new ArrayList(Collections.singletonList(abstractC1329o1.f5722h)), 0, 1)) {
                c1343s.getClass();
                AbstractC22676k.m65750j(backEvent, "backEvent");
                if (AbstractC1329o1.m4132M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.m42995a());
                }
                ArrayList arrayList = c1343s.f5792c;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC25265s.m74141p0(arrayList2, ((C1334p2) it.next()).f5759k);
                }
                List listM74093D1 = AbstractC25265s.m74093D1(AbstractC25265s.m74103I1(arrayList2));
                int size = listM74093D1.size();
                for (int i13 = 0; i13 < size; i13++) {
                    ((AbstractC1330o2) listM74093D1.get(i13)).mo4086e(backEvent, c1343s.f5790a);
                }
            }
            Iterator it3 = abstractC1329o1.f5729o.iterator();
            while (it3.hasNext()) {
                ((C17073i) it3.next()).getClass();
            }
        }
    }

    @Override // p161g.AbstractC14917t
    /* JADX INFO: renamed from: f */
    public final void mo4075f(C14894a c14894a) {
        boolean zM4132M = AbstractC1329o1.m4132M(3);
        AbstractC1329o1 abstractC1329o1 = this.f5585d;
        if (zM4132M) {
            Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + abstractC1329o1);
        }
        abstractC1329o1.m4192w();
        abstractC1329o1.m4193x(new C1321m1(abstractC1329o1), false);
    }
}
