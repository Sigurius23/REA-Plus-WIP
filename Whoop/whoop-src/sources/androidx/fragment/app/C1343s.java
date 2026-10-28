package androidx.fragment.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.SharedElementCallback;
import com.whoop.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import l83.C23465k;
import m83.AbstractC25265s;
import p000.AbstractC30802r;
import p002a0.C0006a1;
import p002a0.C0022g;
import p031b9.AbstractC2875y;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.fragment.app.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1343s {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f5790a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f5791b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f5792c;

    /* JADX INFO: renamed from: d */
    public boolean f5793d;

    /* JADX INFO: renamed from: e */
    public boolean f5794e;

    /* JADX INFO: renamed from: f */
    public boolean f5795f;

    public C1343s(ViewGroup container) {
        AbstractC22676k.m65750j(container, "container");
        this.f5790a = container;
        this.f5791b = new ArrayList();
        this.f5792c = new ArrayList();
    }

    /* JADX INFO: renamed from: f */
    public static void m4212f(C0022g c0022g, View view) {
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        String strM47511f = AbstractC16877h0.m47511f(view);
        if (strM47511f != null) {
            c0022g.put(strM47511f, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = viewGroup.getChildAt(i13);
                if (childAt.getVisibility() == 0) {
                    m4212f(c0022g, childAt);
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static final C1343s m4213j(ViewGroup container, AbstractC1329o1 fragmentManager) {
        AbstractC22676k.m65750j(container, "container");
        AbstractC22676k.m65750j(fragmentManager, "fragmentManager");
        AbstractC22676k.m65749i(fragmentManager.m4144K(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = container.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C1343s) {
            return (C1343s) tag;
        }
        C1343s c1343s = new C1343s(container);
        container.setTag(R.id.special_effects_controller_view_tag, c1343s);
        return c1343s;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m4214k(ArrayList arrayList) {
        boolean z4;
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            z4 = true;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                C1334p2 c1334p2 = (C1334p2) it.next();
                if (!c1334p2.f5759k.isEmpty()) {
                    ArrayList arrayList2 = c1334p2.f5759k;
                    if (arrayList2 != null && arrayList2.isEmpty()) {
                        break;
                    }
                    Iterator it3 = arrayList2.iterator();
                    do {
                        if (!it3.hasNext()) {
                            break;
                        }
                    } while (((AbstractC1330o2) it3.next()).mo4197b());
                }
                z4 = false;
            }
        }
        if (z4) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                AbstractC25265s.m74141p0(arrayList3, ((C1334p2) it4.next()).f5759k);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m4215a(C1334p2 operation) {
        AbstractC22676k.m65750j(operation, "operation");
        if (operation.f5757i) {
            int i13 = operation.f5749a;
            View viewRequireView = operation.f5751c.requireView();
            AbstractC22676k.m65749i(viewRequireView, "operation.fragment.requireView()");
            AbstractC30802r.m94752a(i13, viewRequireView, this.f5790a);
            operation.f5757i = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:176:0x04e7 A[LOOP:18: B:174:0x04e1->B:176:0x04e7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0117  */
    /* JADX INFO: renamed from: b */
    public final void m4216b(boolean z4, ArrayList arrayList) {
        int i13;
        Object next;
        Object objPrevious;
        boolean z13;
        ArrayList<C1295g> arrayList2;
        boolean z14;
        int i14;
        C1335q c1335q;
        boolean z15;
        Iterator it;
        String str;
        Object obj;
        String str2;
        String strM4077b;
        Iterator it3 = arrayList.iterator();
        while (true) {
            i13 = 2;
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            C1334p2 c1334p2 = (C1334p2) next;
            View view = c1334p2.f5751c.mView;
            AbstractC22676k.m65749i(view, "operation.fragment.mView");
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    if (c1334p2.f5749a != 2) {
                        break;
                    }
                } else {
                    if (visibility != 4 && visibility != 8) {
                        throw new IllegalArgumentException(AbstractC2875y.m8295h(visibility, "Unknown visibility "));
                    }
                }
            }
        }
        C1334p2 c1334p3 = (C1334p2) next;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            C1334p2 c1334p4 = (C1334p2) objPrevious;
            View view2 = c1334p4.f5751c.mView;
            AbstractC22676k.m65749i(view2, "operation.fragment.mView");
            if (view2.getAlpha() != 0.0f || view2.getVisibility() != 0) {
                int visibility2 = view2.getVisibility();
                if (visibility2 == 0) {
                    continue;
                } else if (visibility2 != 4 && visibility2 != 8) {
                    throw new IllegalArgumentException(AbstractC2875y.m8295h(visibility2, "Unknown visibility "));
                }
            }
            if (c1334p4.f5749a == 2) {
                break;
            }
        }
        C1334p2 c1334p5 = (C1334p2) objPrevious;
        if (AbstractC1329o1.m4132M(2)) {
            Log.v("FragmentManager", "Executing operations from " + c1334p3 + " to " + c1334p5);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = ((C1334p2) AbstractC25265s.m74112P0(arrayList)).f5751c;
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            C1304i0 c1304i0 = ((C1334p2) it4.next()).f5751c.mAnimationInfo;
            C1304i0 c1304i1 = abstractComponentCallbacksC1320m0.mAnimationInfo;
            c1304i0.f5629b = c1304i1.f5629b;
            c1304i0.f5630c = c1304i1.f5630c;
            c1304i0.f5631d = c1304i1.f5631d;
            c1304i0.f5632e = c1304i1.f5632e;
        }
        Iterator it5 = arrayList.iterator();
        while (true) {
            z13 = false;
            int i15 = 1;
            if (!it5.hasNext()) {
                break;
            }
            C1334p2 c1334p6 = (C1334p2) it5.next();
            arrayList3.add(new C1295g(c1334p6, z4));
            if (z4) {
                if (c1334p6 == c1334p3) {
                    z13 = true;
                }
            } else if (c1334p6 == c1334p5) {
                z13 = true;
            }
            arrayList4.add(new C1339r(c1334p6, z4, z13));
            c1334p6.f5752d.add(new RunnableC1326n2(this, c1334p6, i15));
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : arrayList4) {
            if (!((C1339r) obj2).m4119a()) {
                arrayList5.add(obj2);
            }
        }
        ArrayList<C1339r> arrayList6 = new ArrayList();
        for (Object obj3 : arrayList5) {
            if (((C1339r) obj3).m4209b() != null) {
                arrayList6.add(obj3);
            }
        }
        AbstractC1314k2 abstractC1314k2 = null;
        for (C1339r c1339r : arrayList6) {
            AbstractC1314k2 abstractC1314k2M4209b = c1339r.m4209b();
            if (abstractC1314k2 != null && abstractC1314k2M4209b != abstractC1314k2) {
                StringBuilder sb4 = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                sb4.append(c1339r.f5663a.f5751c);
                sb4.append(" returned Transition ");
                throw new IllegalArgumentException(AbstractC2875y.m8303p(sb4, " which uses a different Transition type than other Fragments.", c1339r.f5779b).toString());
            }
            abstractC1314k2 = abstractC1314k2M4209b;
        }
        if (abstractC1314k2 == null) {
            arrayList2 = arrayList3;
            z14 = false;
            z15 = true;
            i14 = 2;
        } else {
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            C0022g c0022g = new C0022g(0);
            ArrayList<String> arrayList9 = new ArrayList<>();
            ArrayList<String> arrayList10 = new ArrayList<>();
            C0022g c0022g2 = new C0022g(0);
            ArrayList<String> sharedElementTargetNames = arrayList9;
            C0022g c0022g3 = new C0022g(0);
            Iterator it6 = arrayList6.iterator();
            Object obj4 = null;
            while (it6.hasNext()) {
                Object obj5 = ((C1339r) it6.next()).f5781d;
                if (obj5 == null || c1334p3 == null) {
                    i13 = i13;
                } else {
                    i13 = i13;
                    AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m1 = c1334p3.f5751c;
                    if (c1334p5 != null) {
                        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m2 = c1334p5.f5751c;
                        Object objMo4106y = abstractC1314k2.mo4106y(abstractC1314k2.mo4094h(obj5));
                        arrayList10 = abstractComponentCallbacksC1320m2.getSharedElementSourceNames();
                        AbstractC22676k.m65749i(arrayList10, "lastIn.fragment.sharedElementSourceNames");
                        ArrayList<String> sharedElementSourceNames = abstractComponentCallbacksC1320m1.getSharedElementSourceNames();
                        AbstractC22676k.m65749i(sharedElementSourceNames, "firstOut.fragment.sharedElementSourceNames");
                        ArrayList<String> sharedElementTargetNames2 = abstractComponentCallbacksC1320m1.getSharedElementTargetNames();
                        arrayList7 = arrayList7;
                        AbstractC22676k.m65749i(sharedElementTargetNames2, "firstOut.fragment.sharedElementTargetNames");
                        int size = sharedElementTargetNames2.size();
                        arrayList8 = arrayList8;
                        int i16 = 0;
                        while (i16 < size) {
                            int i17 = size;
                            int iIndexOf = arrayList10.indexOf(sharedElementTargetNames2.get(i16));
                            if (iIndexOf != -1) {
                                arrayList10.set(iIndexOf, sharedElementSourceNames.get(i16));
                            }
                            i16++;
                            size = i17;
                        }
                        sharedElementTargetNames = abstractComponentCallbacksC1320m2.getSharedElementTargetNames();
                        AbstractC22676k.m65749i(sharedElementTargetNames, "lastIn.fragment.sharedElementTargetNames");
                        C23465k c23465k = !z4 ? new C23465k(abstractComponentCallbacksC1320m1.getExitTransitionCallback(), abstractComponentCallbacksC1320m2.getEnterTransitionCallback()) : new C23465k(abstractComponentCallbacksC1320m1.getEnterTransitionCallback(), abstractComponentCallbacksC1320m2.getExitTransitionCallback());
                        SharedElementCallback sharedElementCallback = (SharedElementCallback) c23465k.f92937w;
                        SharedElementCallback sharedElementCallback2 = (SharedElementCallback) c23465k.f92938x;
                        int size2 = arrayList10.size();
                        int i18 = 0;
                        while (true) {
                            str = "enteringNames[i]";
                            obj = objMo4106y;
                            if (i18 >= size2) {
                                break;
                            }
                            int i19 = size2;
                            String str3 = arrayList10.get(i18);
                            AbstractC22676k.m65749i(str3, "exitingNames[i]");
                            String str4 = sharedElementTargetNames.get(i18);
                            AbstractC22676k.m65749i(str4, "enteringNames[i]");
                            c0022g.put(str3, str4);
                            i18++;
                            objMo4106y = obj;
                            size2 = i19;
                        }
                        if (AbstractC1329o1.m4132M(i13)) {
                            Log.v("FragmentManager", ">>> entering view names <<<");
                            Iterator<String> it7 = sharedElementTargetNames.iterator();
                            while (true) {
                                Iterator<String> it8 = it7;
                                if (!it7.hasNext()) {
                                    break;
                                }
                                Log.v("FragmentManager", "Name: " + it8.next());
                                it7 = it8;
                                str = str;
                            }
                            str2 = str;
                            Log.v("FragmentManager", ">>> exiting view names <<<");
                            for (Iterator<String> it9 = arrayList10.iterator(); it9.hasNext(); it9 = it9) {
                                Log.v("FragmentManager", "Name: " + it9.next());
                            }
                        } else {
                            str2 = "enteringNames[i]";
                        }
                        View view3 = abstractComponentCallbacksC1320m1.mView;
                        AbstractC22676k.m65749i(view3, "firstOut.fragment.mView");
                        m4212f(c0022g2, view3);
                        c0022g2.m45n(arrayList10);
                        if (sharedElementCallback != null) {
                            if (AbstractC1329o1.m4132M(i13)) {
                                Log.v("FragmentManager", "Executing exit callback for operation " + c1334p3);
                            }
                            sharedElementCallback.onMapSharedElements(arrayList10, c0022g2);
                            int size3 = arrayList10.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i24 = size3 - 1;
                                    String str5 = arrayList10.get(size3);
                                    AbstractC22676k.m65749i(str5, "exitingNames[i]");
                                    String str6 = str5;
                                    View view4 = (View) c0022g2.get(str6);
                                    if (view4 == null) {
                                        c0022g.remove(str6);
                                    } else {
                                        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                                        if (!str6.equals(AbstractC16877h0.m47511f(view4))) {
                                            c0022g.put(AbstractC16877h0.m47511f(view4), (String) c0022g.remove(str6));
                                        }
                                    }
                                    if (i24 < 0) {
                                        break;
                                    } else {
                                        size3 = i24;
                                    }
                                }
                            }
                        } else {
                            c0022g.m45n(c0022g2.keySet());
                        }
                        View view5 = abstractComponentCallbacksC1320m2.mView;
                        AbstractC22676k.m65749i(view5, "lastIn.fragment.mView");
                        m4212f(c0022g3, view5);
                        c0022g3.m45n(sharedElementTargetNames);
                        c0022g3.m45n(c0022g.values());
                        if (sharedElementCallback2 != null) {
                            if (AbstractC1329o1.m4132M(i13)) {
                                Log.v("FragmentManager", "Executing enter callback for operation " + c1334p5);
                            }
                            sharedElementCallback2.onMapSharedElements(sharedElementTargetNames, c0022g3);
                            int size4 = sharedElementTargetNames.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i25 = size4 - 1;
                                    String str7 = sharedElementTargetNames.get(size4);
                                    String str8 = str2;
                                    AbstractC22676k.m65749i(str7, str8);
                                    String str9 = str7;
                                    View view6 = (View) c0022g3.get(str9);
                                    if (view6 == null) {
                                        String strM4077b2 = AbstractC1286d2.m4077b(c0022g, str9);
                                        if (strM4077b2 != null) {
                                            c0022g.remove(strM4077b2);
                                        }
                                    } else {
                                        WeakHashMap weakHashMap2 = AbstractC16901p0.f64851a;
                                        if (!str9.equals(AbstractC16877h0.m47511f(view6)) && (strM4077b = AbstractC1286d2.m4077b(c0022g, str9)) != null) {
                                            c0022g.put(strM4077b, AbstractC16877h0.m47511f(view6));
                                        }
                                    }
                                    if (i25 < 0) {
                                        break;
                                    }
                                    size4 = i25;
                                    str2 = str8;
                                }
                            }
                        } else {
                            AbstractC1286d2.m4078c(c0022g, c0022g3);
                        }
                        int i26 = 6;
                        AbstractC25265s.m74090C0(c0022g2.entrySet(), new C0006a1(c0022g.keySet(), i26), false);
                        AbstractC25265s.m74090C0(c0022g3.entrySet(), new C0006a1(c0022g.values(), i26), false);
                        if (c0022g.isEmpty()) {
                            Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + c1334p3 + " and " + c1334p5 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                            arrayList7.clear();
                            arrayList8.clear();
                            obj4 = null;
                        } else {
                            obj4 = obj;
                        }
                        z13 = false;
                    }
                }
                z13 = z13;
                i13 = i13;
                arrayList7 = arrayList7;
                arrayList8 = arrayList8;
            }
            arrayList2 = arrayList3;
            AbstractC1314k2 abstractC1314k3 = abstractC1314k2;
            ArrayList arrayList11 = arrayList7;
            ArrayList arrayList12 = arrayList8;
            z14 = z13;
            i14 = i13;
            if (obj4 != null) {
                ArrayList<String> arrayList13 = arrayList10;
                z15 = true;
                c1335q = new C1335q(arrayList6, c1334p3, c1334p5, abstractC1314k3, obj4, arrayList11, arrayList12, c0022g, sharedElementTargetNames, arrayList13, c0022g2, c0022g3, z4);
                it = arrayList6.iterator();
                while (it.hasNext()) {
                    ((C1339r) it.next()).f5663a.f5758j.add(c1335q);
                }
            } else {
                if (!arrayList6.isEmpty()) {
                    Iterator it10 = arrayList6.iterator();
                    while (true) {
                        if (it10.hasNext()) {
                            if (((C1339r) it10.next()).f5779b != null) {
                                ArrayList<String> arrayList14 = arrayList10;
                                z15 = true;
                                c1335q = new C1335q(arrayList6, c1334p3, c1334p5, abstractC1314k3, obj4, arrayList11, arrayList12, c0022g, sharedElementTargetNames, arrayList14, c0022g2, c0022g3, z4);
                                it = arrayList6.iterator();
                                while (it.hasNext()) {
                                    ((C1339r) it.next()).f5663a.f5758j.add(c1335q);
                                }
                            }
                        }
                    }
                }
                z15 = true;
            }
        }
        ArrayList<C1295g> arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        Iterator it11 = arrayList2.iterator();
        while (it11.hasNext()) {
            AbstractC25265s.m74141p0(arrayList16, ((C1295g) it11.next()).f5663a.f5759k);
        }
        boolean zIsEmpty = arrayList16.isEmpty();
        boolean z16 = z14;
        for (C1295g c1295g : arrayList2) {
            Context context = this.f5790a.getContext();
            C1334p2 c1334p7 = c1295g.f5663a;
            AbstractC22676k.m65749i(context, "context");
            C1344s0 c1344s0M4084b = c1295g.m4084b(context);
            if (c1344s0M4084b != null) {
                if (c1344s0M4084b.f5797b == null) {
                    arrayList15.add(c1295g);
                } else {
                    AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m3 = c1334p7.f5751c;
                    if (c1334p7.f5759k.isEmpty()) {
                        if (c1334p7.f5749a == 3) {
                            c1334p7.f5757i = z14;
                        }
                        c1334p7.f5758j.add(new C1303i(c1295g));
                        z16 = z15;
                    } else if (AbstractC1329o1.m4132M(i14)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + abstractComponentCallbacksC1320m3 + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        for (C1295g c1295g2 : arrayList15) {
            C1334p2 c1334p8 = c1295g2.f5663a;
            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m4 = c1334p8.f5751c;
            if (zIsEmpty) {
                if (!z16) {
                    c1334p8.f5758j.add(new C1291f(c1295g2));
                } else if (AbstractC1329o1.m4132M(i14)) {
                    Log.v(r3, "Ignoring Animation set on " + abstractComponentCallbacksC1320m4 + " as Animations cannot run alongside Animators.");
                }
            } else if (AbstractC1329o1.m4132M(i14)) {
                Log.v(r3, "Ignoring Animation set on " + abstractComponentCallbacksC1320m4 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4217c(List operations) {
        AbstractC22676k.m65750j(operations, "operations");
        List list = operations;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList, ((C1334p2) it.next()).f5759k);
        }
        List listM74093D1 = AbstractC25265s.m74093D1(AbstractC25265s.m74103I1(arrayList));
        int size = listM74093D1.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((AbstractC1330o2) listM74093D1.get(i13)).mo4082d(this.f5790a);
        }
        int size2 = operations.size();
        for (int i14 = 0; i14 < size2; i14++) {
            m4215a((C1334p2) operations.get(i14));
        }
        List listM74093D2 = AbstractC25265s.m74093D1(list);
        int size3 = listM74093D2.size();
        for (int i15 = 0; i15 < size3; i15++) {
            C1334p2 c1334p2 = (C1334p2) listM74093D2.get(i15);
            if (c1334p2.f5759k.isEmpty()) {
                c1334p2.m4201b();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4218d(int i13, int i14, C1366z1 c1366z1) {
        synchronized (this.f5791b) {
            try {
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = c1366z1.f5852c;
                AbstractC22676k.m65749i(abstractComponentCallbacksC1320m0, "fragmentStateManager.fragment");
                C1334p2 c1334p2M4220g = m4220g(abstractComponentCallbacksC1320m0);
                if (c1334p2M4220g == null) {
                    AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m1 = c1366z1.f5852c;
                    c1334p2M4220g = abstractComponentCallbacksC1320m1.mTransitioning ? m4221h(abstractComponentCallbacksC1320m1) : null;
                }
                if (c1334p2M4220g != null) {
                    c1334p2M4220g.m4203d(i13, i14);
                    return;
                }
                C1334p2 c1334p2 = new C1334p2(i13, i14, c1366z1);
                this.f5791b.add(c1334p2);
                c1334p2.f5752d.add(new RunnableC1326n2(this, c1334p2, 0));
                c1334p2.f5752d.add(new RunnableC1326n2(this, c1334p2, 2));
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m4219e() {
        boolean z4;
        if (this.f5795f) {
            return;
        }
        if (!this.f5790a.isAttachedToWindow()) {
            m4222i();
            this.f5794e = false;
            return;
        }
        synchronized (this.f5791b) {
            try {
                ArrayList<C1334p2> arrayListM74097F1 = AbstractC25265s.m74097F1(this.f5792c);
                this.f5792c.clear();
                Iterator it = arrayListM74097F1.iterator();
                while (true) {
                    z4 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    C1334p2 c1334p2 = (C1334p2) it.next();
                    if (this.f5791b.isEmpty() || !c1334p2.f5751c.mTransitioning) {
                        z4 = false;
                    }
                    c1334p2.f5755g = z4;
                }
                for (C1334p2 c1334p3 : arrayListM74097F1) {
                    if (this.f5793d) {
                        if (AbstractC1329o1.m4132M(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + c1334p3);
                        }
                        c1334p3.m4201b();
                    } else {
                        if (AbstractC1329o1.m4132M(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + c1334p3);
                        }
                        c1334p3.m4200a(this.f5790a);
                    }
                    this.f5793d = false;
                    if (!c1334p3.f5754f) {
                        this.f5792c.add(c1334p3);
                    }
                }
                if (!this.f5791b.isEmpty()) {
                    m4225n();
                    ArrayList arrayListM74097F2 = AbstractC25265s.m74097F1(this.f5791b);
                    if (arrayListM74097F2.isEmpty()) {
                        return;
                    }
                    this.f5791b.clear();
                    this.f5792c.addAll(arrayListM74097F2);
                    if (AbstractC1329o1.m4132M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    m4216b(this.f5794e, arrayListM74097F2);
                    boolean zM4214k = m4214k(arrayListM74097F2);
                    Iterator it3 = arrayListM74097F2.iterator();
                    boolean z13 = true;
                    while (it3.hasNext()) {
                        if (!((C1334p2) it3.next()).f5751c.mTransitioning) {
                            z13 = false;
                        }
                    }
                    if (!z13 || zM4214k) {
                        z4 = false;
                    }
                    this.f5793d = z4;
                    if (AbstractC1329o1.m4132M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + zM4214k + " \ntransition = " + z13);
                    }
                    if (!z13) {
                        m4224m(arrayListM74097F2);
                        m4217c(arrayListM74097F2);
                    } else if (zM4214k) {
                        m4224m(arrayListM74097F2);
                        int size = arrayListM74097F2.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            m4215a((C1334p2) arrayListM74097F2.get(i13));
                        }
                    }
                    this.f5794e = false;
                    if (AbstractC1329o1.m4132M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final C1334p2 m4220g(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        Object next;
        Iterator it = this.f5791b.iterator();
        while (it.hasNext()) {
            next = it.next();
            C1334p2 c1334p2 = (C1334p2) next;
            if (AbstractC22676k.m65745e(c1334p2.f5751c, abstractComponentCallbacksC1320m0) && !c1334p2.f5753e) {
                return (C1334p2) next;
            }
        }
        next = null;
        return (C1334p2) next;
    }

    /* JADX INFO: renamed from: h */
    public final C1334p2 m4221h(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        Object next;
        Iterator it = this.f5792c.iterator();
        while (it.hasNext()) {
            next = it.next();
            C1334p2 c1334p2 = (C1334p2) next;
            if (AbstractC22676k.m65745e(c1334p2.f5751c, abstractComponentCallbacksC1320m0) && !c1334p2.f5753e) {
                return (C1334p2) next;
            }
        }
        next = null;
        return (C1334p2) next;
    }

    /* JADX INFO: renamed from: i */
    public final void m4222i() {
        if (AbstractC1329o1.m4132M(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.f5790a.isAttachedToWindow();
        synchronized (this.f5791b) {
            try {
                m4225n();
                m4224m(this.f5791b);
                ArrayList<C1334p2> arrayListM74097F1 = AbstractC25265s.m74097F1(this.f5792c);
                Iterator it = arrayListM74097F1.iterator();
                while (it.hasNext()) {
                    ((C1334p2) it.next()).f5755g = false;
                }
                for (C1334p2 c1334p2 : arrayListM74097F1) {
                    if (AbstractC1329o1.m4132M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f5790a + " is not attached to window. ") + "Cancelling running operation " + c1334p2);
                    }
                    c1334p2.m4200a(this.f5790a);
                }
                ArrayList<C1334p2> arrayListM74097F2 = AbstractC25265s.m74097F1(this.f5791b);
                Iterator it3 = arrayListM74097F2.iterator();
                while (it3.hasNext()) {
                    ((C1334p2) it3.next()).f5755g = false;
                }
                for (C1334p2 c1334p3 : arrayListM74097F2) {
                    if (AbstractC1329o1.m4132M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f5790a + " is not attached to window. ") + "Cancelling pending operation " + c1334p3);
                    }
                    c1334p3.m4200a(this.f5790a);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m4223l() {
        Object objPrevious;
        synchronized (this.f5791b) {
            try {
                m4225n();
                ArrayList arrayList = this.f5791b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    C1334p2 c1334p2 = (C1334p2) objPrevious;
                    View view = c1334p2.f5751c.mView;
                    AbstractC22676k.m65749i(view, "operation.fragment.mView");
                    char c3 = 4;
                    if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                        int visibility = view.getVisibility();
                        if (visibility == 0) {
                            c3 = 2;
                        } else if (visibility != 4) {
                            if (visibility != 8) {
                                throw new IllegalArgumentException("Unknown visibility " + visibility);
                            }
                            c3 = 3;
                        }
                    }
                    if (c1334p2.f5749a == 2 && c3 != 2) {
                        break;
                    }
                }
                C1334p2 c1334p3 = (C1334p2) objPrevious;
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = c1334p3 != null ? c1334p3.f5751c : null;
                this.f5795f = abstractComponentCallbacksC1320m0 != null ? abstractComponentCallbacksC1320m0.isPostponed() : false;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m4224m(List list) {
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            C1334p2 c1334p2 = (C1334p2) list.get(i13);
            C1366z1 c1366z1 = c1334p2.f5760l;
            if (!c1334p2.f5756h) {
                c1334p2.f5756h = true;
                int i14 = c1334p2.f5750b;
                if (i14 == 2) {
                    AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = c1366z1.f5852c;
                    AbstractC22676k.m65749i(abstractComponentCallbacksC1320m0, "fragmentStateManager.fragment");
                    View viewFindFocus = abstractComponentCallbacksC1320m0.mView.findFocus();
                    if (viewFindFocus != null) {
                        abstractComponentCallbacksC1320m0.setFocusedView(viewFindFocus);
                        if (AbstractC1329o1.m4132M(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC1320m0);
                        }
                    }
                    View viewRequireView = c1334p2.f5751c.requireView();
                    AbstractC22676k.m65749i(viewRequireView, "this.fragment.requireView()");
                    if (viewRequireView.getParent() == null) {
                        c1366z1.m4247b();
                        viewRequireView.setAlpha(0.0f);
                    }
                    if (viewRequireView.getAlpha() == 0.0f && viewRequireView.getVisibility() == 0) {
                        viewRequireView.setVisibility(4);
                    }
                    viewRequireView.setAlpha(abstractComponentCallbacksC1320m0.getPostOnViewCreatedAlpha());
                } else if (i14 == 3) {
                    AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m1 = c1366z1.f5852c;
                    AbstractC22676k.m65749i(abstractComponentCallbacksC1320m1, "fragmentStateManager.fragment");
                    View viewRequireView2 = abstractComponentCallbacksC1320m1.requireView();
                    AbstractC22676k.m65749i(viewRequireView2, "fragment.requireView()");
                    if (AbstractC1329o1.m4132M(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewRequireView2.findFocus() + " on view " + viewRequireView2 + " for Fragment " + abstractComponentCallbacksC1320m1);
                    }
                    viewRequireView2.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList, ((C1334p2) it.next()).f5759k);
        }
        List listM74093D1 = AbstractC25265s.m74093D1(AbstractC25265s.m74103I1(arrayList));
        int size2 = listM74093D1.size();
        for (int i15 = 0; i15 < size2; i15++) {
            ((AbstractC1330o2) listM74093D1.get(i15)).m4198g(this.f5790a);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m4225n() {
        for (C1334p2 c1334p2 : this.f5791b) {
            int i13 = 2;
            if (c1334p2.f5750b == 2) {
                View viewRequireView = c1334p2.f5751c.requireView();
                AbstractC22676k.m65749i(viewRequireView, "fragment.requireView()");
                int visibility = viewRequireView.getVisibility();
                if (visibility != 0) {
                    i13 = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            throw new IllegalArgumentException(AbstractC2875y.m8295h(visibility, "Unknown visibility "));
                        }
                        i13 = 3;
                    }
                }
                c1334p2.m4203d(i13, 1);
            }
        }
    }
}
