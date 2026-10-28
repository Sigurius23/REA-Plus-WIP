package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import c93.InterfaceC4339a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p002a0.C0022g;
import p009a8.RunnableC0533c;
import p029b5.C2725d;
import p161g.C14894a;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p184h5.ViewTreeObserverOnPreDrawListenerC16921w;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;

/* JADX INFO: renamed from: androidx.fragment.app.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C1335q extends AbstractC1330o2 {

    /* JADX INFO: renamed from: c */
    public final ArrayList f5761c;

    /* JADX INFO: renamed from: d */
    public final C1334p2 f5762d;

    /* JADX INFO: renamed from: e */
    public final C1334p2 f5763e;

    /* JADX INFO: renamed from: f */
    public final AbstractC1314k2 f5764f;

    /* JADX INFO: renamed from: g */
    public final Object f5765g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f5766h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f5767i;

    /* JADX INFO: renamed from: j */
    public final C0022g f5768j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f5769k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f5770l;

    /* JADX INFO: renamed from: m */
    public final C0022g f5771m;

    /* JADX INFO: renamed from: n */
    public final C0022g f5772n;

    /* JADX INFO: renamed from: o */
    public final boolean f5773o;

    /* JADX INFO: renamed from: p */
    public final C2725d f5774p = new C2725d();

    /* JADX INFO: renamed from: q */
    public Object f5775q;

    public C1335q(ArrayList arrayList, C1334p2 c1334p2, C1334p2 c1334p3, AbstractC1314k2 abstractC1314k2, Object obj, ArrayList arrayList2, ArrayList arrayList3, C0022g c0022g, ArrayList arrayList4, ArrayList arrayList5, C0022g c0022g2, C0022g c0022g3, boolean z4) {
        this.f5761c = arrayList;
        this.f5762d = c1334p2;
        this.f5763e = c1334p3;
        this.f5764f = abstractC1314k2;
        this.f5765g = obj;
        this.f5766h = arrayList2;
        this.f5767i = arrayList3;
        this.f5768j = c0022g;
        this.f5769k = arrayList4;
        this.f5770l = arrayList5;
        this.f5771m = c0022g2;
        this.f5772n = c0022g3;
        this.f5773o = z4;
    }

    /* JADX INFO: renamed from: h */
    public static void m4204h(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = viewGroup.getChildAt(i13);
            if (childAt.getVisibility() == 0) {
                m4204h(childAt, arrayList);
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC1330o2
    /* JADX INFO: renamed from: b */
    public final boolean mo4197b() {
        Object obj;
        AbstractC1314k2 abstractC1314k2 = this.f5764f;
        if (!abstractC1314k2.mo4095l()) {
            return false;
        }
        ArrayList<C1339r> arrayList = this.f5761c;
        if (!arrayList.isEmpty()) {
            for (C1339r c1339r : arrayList) {
                if (Build.VERSION.SDK_INT < 34 || (obj = c1339r.f5779b) == null || !abstractC1314k2.mo4096m(obj)) {
                    return false;
                }
            }
        }
        Object obj2 = this.f5765g;
        return obj2 == null || abstractC1314k2.mo4096m(obj2);
    }

    @Override // androidx.fragment.app.AbstractC1330o2
    /* JADX INFO: renamed from: c */
    public final void mo4081c(ViewGroup container) {
        AbstractC22676k.m65750j(container, "container");
        this.f5774p.m7694a();
    }

    @Override // androidx.fragment.app.AbstractC1330o2
    /* JADX INFO: renamed from: d */
    public final void mo4082d(ViewGroup container) {
        AbstractC22676k.m65750j(container, "container");
        boolean zIsLaidOut = container.isLaidOut();
        ArrayList<C1339r> arrayList = this.f5761c;
        if (!zIsLaidOut) {
            for (C1339r c1339r : arrayList) {
                C1334p2 c1334p2 = c1339r.f5663a;
                if (AbstractC1329o1.m4132M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Completing operation " + c1334p2);
                }
                c1339r.f5663a.m4202c(this);
            }
            return;
        }
        Object obj = this.f5775q;
        AbstractC1314k2 abstractC1314k2 = this.f5764f;
        C1334p2 c1334p3 = this.f5763e;
        C1334p2 c1334p4 = this.f5762d;
        if (obj != null) {
            abstractC1314k2.mo4114c(obj);
            if (AbstractC1329o1.m4132M(2)) {
                Log.v("FragmentManager", "Ending execution of operations from " + c1334p4 + " to " + c1334p3);
                return;
            }
            return;
        }
        C23465k c23465kM4205i = m4205i(container, c1334p3, c1334p4);
        ArrayList arrayList2 = (ArrayList) c23465kM4205i.f92937w;
        Object obj2 = c23465kM4205i.f92938x;
        ArrayList<C1334p2> arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(((C1339r) it.next()).f5663a);
        }
        for (C1334p2 c1334p5 : arrayList3) {
            abstractC1314k2.mo4103u(c1334p5.f5751c, obj2, this.f5774p, new RunnableC1323n(c1334p5, this, 1));
        }
        m4207k(arrayList2, container, new C1327o(this, container, obj2));
        if (AbstractC1329o1.m4132M(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + c1334p4 + " to " + c1334p3);
        }
    }

    @Override // androidx.fragment.app.AbstractC1330o2
    /* JADX INFO: renamed from: e */
    public final void mo4086e(C14894a c14894a, ViewGroup container) {
        AbstractC22676k.m65750j(container, "container");
        Object obj = this.f5775q;
        if (obj != null) {
            this.f5764f.mo4117r(obj, c14894a.f55564c);
        }
    }

    @Override // androidx.fragment.app.AbstractC1330o2
    /* JADX INFO: renamed from: f */
    public final void mo4087f(ViewGroup container) {
        Object obj;
        AbstractC22676k.m65750j(container, "container");
        boolean zIsLaidOut = container.isLaidOut();
        ArrayList arrayList = this.f5761c;
        if (zIsLaidOut) {
            boolean zM4206j = m4206j();
            C1334p2 c1334p2 = this.f5763e;
            C1334p2 c1334p3 = this.f5762d;
            if (zM4206j && (obj = this.f5765g) != null && !mo4197b()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + c1334p3 + " and " + c1334p2 + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (mo4197b() && m4206j()) {
                C22669g0 c22669g0 = new C22669g0();
                C23465k c23465kM4205i = m4205i(container, c1334p2, c1334p3);
                ArrayList arrayList2 = (ArrayList) c23465kM4205i.f92937w;
                Object obj2 = c23465kM4205i.f92938x;
                ArrayList<C1334p2> arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((C1339r) it.next()).f5663a);
                }
                for (C1334p2 c1334p4 : arrayList3) {
                    RunnableC1319m runnableC1319m = new RunnableC1319m(c22669g0, 0);
                    AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = c1334p4.f5751c;
                    this.f5764f.mo4118v(obj2, this.f5774p, runnableC1319m, new RunnableC1323n(c1334p4, this, 0));
                }
                m4207k(arrayList2, container, new C1331p(this, container, obj2, c22669g0, 0));
            }
        } else {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C1334p2 c1334p5 = ((C1339r) it3.next()).f5663a;
                if (AbstractC1329o1.m4132M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Container " + container + " has not been laid out. Skipping onStart for operation " + c1334p5);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00b2  */
    /* JADX INFO: renamed from: i */
    public final C23465k m4205i(ViewGroup viewGroup, C1334p2 c1334p2, C1334p2 c1334p3) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Object obj;
        AbstractC1314k2 abstractC1314k2;
        ArrayList arrayList3;
        View view = new View(viewGroup.getContext());
        Rect rect = new Rect();
        ArrayList arrayList4 = this.f5761c;
        Iterator it = arrayList4.iterator();
        View view2 = null;
        boolean z4 = false;
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = this.f5767i;
            arrayList2 = this.f5766h;
            obj = this.f5765g;
            abstractC1314k2 = this.f5764f;
            if (!zHasNext) {
                break;
            }
            if (((C1339r) it.next()).f5781d == null || c1334p3 == null || c1334p2 == null || this.f5768j.isEmpty() || obj == null) {
                arrayList4 = arrayList4;
                it = it;
                z4 = z4;
            } else {
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = c1334p2.f5751c;
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m1 = c1334p3.f5751c;
                ArrayList arrayList5 = arrayList4;
                boolean z13 = this.f5773o;
                Iterator it3 = it;
                C0022g c0022g = this.f5771m;
                boolean z14 = z4;
                z4 = true;
                AbstractC1286d2.m4076a(abstractComponentCallbacksC1320m0, abstractComponentCallbacksC1320m1, z13, c0022g, true);
                ViewTreeObserverOnPreDrawListenerC16921w.m47614a(viewGroup, new RunnableC1283d(c1334p2, c1334p3, this, 1));
                arrayList2.addAll(c0022g.values());
                ArrayList arrayList6 = this.f5770l;
                if (!arrayList6.isEmpty()) {
                    Object obj2 = arrayList6.get(0);
                    AbstractC22676k.m65749i(obj2, "exitingNames[0]");
                    View view3 = (View) c0022g.get((String) obj2);
                    abstractC1314k2.mo4101s(view3, obj);
                    view2 = view3;
                }
                C0022g c0022g2 = this.f5772n;
                arrayList.addAll(c0022g2.values());
                ArrayList arrayList7 = this.f5769k;
                if (arrayList7.isEmpty()) {
                    z4 = z14;
                } else {
                    Object obj3 = arrayList7.get(0);
                    AbstractC22676k.m65749i(obj3, "enteringNames[0]");
                    View view4 = (View) c0022g2.get((String) obj3);
                    if (view4 != null) {
                        ViewTreeObserverOnPreDrawListenerC16921w.m47614a(viewGroup, new RunnableC0533c(abstractC1314k2, view4, rect));
                    } else {
                        z4 = z14;
                    }
                }
                abstractC1314k2.mo4104w(obj, view, arrayList2);
                Object obj4 = this.f5765g;
                abstractC1314k2.mo4100q(obj4, null, null, obj4, arrayList);
                arrayList4 = arrayList5;
                it = it3;
            }
        }
        ArrayList arrayList8 = arrayList4;
        boolean z15 = z4;
        ArrayList arrayList9 = arrayList;
        ArrayList arrayList10 = new ArrayList();
        Iterator it4 = arrayList8.iterator();
        Object objMo4098o = null;
        Object objMo4098o2 = null;
        while (it4.hasNext()) {
            C1339r c1339r = (C1339r) it4.next();
            arrayList9 = arrayList9;
            C1334p2 c1334p4 = c1339r.f5663a;
            it4 = it4;
            Object objMo4094h = abstractC1314k2.mo4094h(c1339r.f5779b);
            if (objMo4094h != null) {
                ArrayList arrayList11 = arrayList2;
                ArrayList arrayList12 = new ArrayList();
                Object obj5 = obj;
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m2 = c1334p4.f5751c;
                Object obj6 = objMo4098o2;
                View view5 = abstractComponentCallbacksC1320m2.mView;
                Object obj7 = objMo4098o;
                AbstractC22676k.m65749i(view5, "operation.fragment.mView");
                m4204h(view5, arrayList12);
                if (obj5 != null && (c1334p4 == c1334p3 || c1334p4 == c1334p2)) {
                    if (c1334p4 == c1334p3) {
                        arrayList12.removeAll(AbstractC25265s.m74103I1(arrayList11));
                    } else {
                        arrayList12.removeAll(AbstractC25265s.m74103I1(arrayList9));
                    }
                }
                if (arrayList12.isEmpty()) {
                    abstractC1314k2.mo4090a(view, objMo4094h);
                    arrayList3 = arrayList12;
                } else {
                    abstractC1314k2.mo4091b(objMo4094h, arrayList12);
                    abstractC1314k2.mo4100q(objMo4094h, objMo4094h, arrayList12, null, null);
                    arrayList3 = arrayList12;
                    if (c1334p4.f5749a == 3) {
                        c1334p4.f5757i = false;
                        ArrayList arrayList13 = new ArrayList(arrayList3);
                        arrayList13.remove(abstractComponentCallbacksC1320m2.mView);
                        abstractC1314k2.mo4099p(objMo4094h, abstractComponentCallbacksC1320m2.mView, arrayList13);
                        ViewTreeObserverOnPreDrawListenerC16921w.m47614a(viewGroup, new RunnableC1319m(arrayList3, 1));
                    }
                }
                if (c1334p4.f5749a == 2) {
                    arrayList10.addAll(arrayList3);
                    if (z15) {
                        abstractC1314k2.mo4102t(objMo4094h, rect);
                    }
                    if (AbstractC1329o1.m4132M(2)) {
                        Log.v("FragmentManager", "Entering Transition: " + objMo4094h);
                        Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                        for (Object transitioningViews : arrayList3) {
                            AbstractC22676k.m65749i(transitioningViews, "transitioningViews");
                            Log.v("FragmentManager", "View: " + ((View) transitioningViews));
                        }
                    }
                } else {
                    abstractC1314k2.mo4101s(view2, objMo4094h);
                    if (AbstractC1329o1.m4132M(2)) {
                        Log.v("FragmentManager", "Exiting Transition: " + objMo4094h);
                        Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                        for (Object transitioningViews2 : arrayList3) {
                            AbstractC22676k.m65749i(transitioningViews2, "transitioningViews");
                            Log.v("FragmentManager", "View: " + ((View) transitioningViews2));
                        }
                    }
                }
                if (c1339r.f5780c) {
                    objMo4098o = abstractC1314k2.mo4098o(obj7, objMo4094h);
                    arrayList2 = arrayList11;
                    obj = obj5;
                    objMo4098o2 = obj6;
                } else {
                    objMo4098o2 = abstractC1314k2.mo4098o(obj6, objMo4094h);
                    objMo4098o = obj7;
                    arrayList2 = arrayList11;
                    obj = obj5;
                }
            } else {
                objMo4098o = objMo4098o;
            }
        }
        Object objMo4097n = abstractC1314k2.mo4097n(objMo4098o, objMo4098o2, obj);
        if (AbstractC1329o1.m4132M(2)) {
            Log.v("FragmentManager", "Final merged transition: " + objMo4097n);
        }
        return new C23465k(arrayList10, objMo4097n);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m4206j() {
        ArrayList arrayList = this.f5761c;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C1339r) it.next()).f5663a.f5751c.mTransitioning) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final void m4207k(ArrayList arrayList, ViewGroup viewGroup, InterfaceC4339a interfaceC4339a) {
        AbstractC1286d2.m4079d(arrayList, 4);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f5767i;
        int size = arrayList3.size();
        for (int i13 = 0; i13 < size; i13++) {
            View view = (View) arrayList3.get(i13);
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            arrayList2.add(AbstractC16877h0.m47511f(view));
            AbstractC16877h0.m47518m(view, null);
        }
        boolean zM4132M = AbstractC1329o1.m4132M(2);
        ArrayList arrayList4 = this.f5766h;
        if (zM4132M) {
            Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
            Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
            for (Object sharedElementFirstOutViews : arrayList4) {
                AbstractC22676k.m65749i(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                View view2 = (View) sharedElementFirstOutViews;
                StringBuilder sb4 = new StringBuilder("View: ");
                sb4.append(view2);
                sb4.append(" Name: ");
                WeakHashMap weakHashMap2 = AbstractC16901p0.f64851a;
                sb4.append(AbstractC16877h0.m47511f(view2));
                Log.v("FragmentManager", sb4.toString());
            }
            Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
            for (Object sharedElementLastInViews : arrayList3) {
                AbstractC22676k.m65749i(sharedElementLastInViews, "sharedElementLastInViews");
                View view3 = (View) sharedElementLastInViews;
                StringBuilder sb5 = new StringBuilder("View: ");
                sb5.append(view3);
                sb5.append(" Name: ");
                WeakHashMap weakHashMap3 = AbstractC16901p0.f64851a;
                sb5.append(AbstractC16877h0.m47511f(view3));
                Log.v("FragmentManager", sb5.toString());
            }
        }
        interfaceC4339a.invoke();
        int size2 = arrayList3.size();
        ArrayList arrayList5 = new ArrayList();
        for (int i14 = 0; i14 < size2; i14++) {
            View view4 = (View) arrayList4.get(i14);
            WeakHashMap weakHashMap4 = AbstractC16901p0.f64851a;
            String strM47511f = AbstractC16877h0.m47511f(view4);
            arrayList5.add(strM47511f);
            if (strM47511f != null) {
                AbstractC16877h0.m47518m(view4, null);
                String str = (String) this.f5768j.get(strM47511f);
                for (int i15 = 0; i15 < size2; i15++) {
                    if (str.equals(arrayList2.get(i15))) {
                        AbstractC16877h0.m47518m((View) arrayList3.get(i15), strM47511f);
                        break;
                    }
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerC16921w.m47614a(viewGroup, new RunnableC1310j2(size2, arrayList3, arrayList2, arrayList4, arrayList5));
        AbstractC1286d2.m4079d(arrayList, 0);
        this.f5764f.mo4105x(this.f5765g, arrayList4, arrayList3);
    }
}
