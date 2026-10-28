package p189hb;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.fragment.app.C1271a;
import androidx.fragment.app.C1317l1;
import androidx.fragment.app.C1325n1;
import androidx.fragment.app.InterfaceC1351u1;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.C1579e2;
import c93.InterfaceC4339a;
import e93.AbstractC12889b;
import j93.InterfaceC21461d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import l83.C23465k;
import m83.AbstractC25265s;
import p005a3.C0226m0;
import p005a3.C0227m1;
import p024b0.C2178b;
import p027b3.C2390i3;
import p040c0.C3743h;
import p114eb.AbstractC12964i1;
import p114eb.C12977n0;
import p114eb.C12982q;
import p114eb.C12988t;
import p114eb.C12997x0;
import p114eb.C13000z;
import p114eb.InterfaceC12961h1;
import p249jc.AbstractC21598x;
import p298l8.C23418a;
import p298l8.C23421d;
import p692zt.C41113q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import xb3.AbstractC38176k;

/* JADX INFO: renamed from: hb.f */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12961h1("fragment")
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, m65681d2 = {"Lhb/f;", "Leb/i1;", "Lhb/g;", "a", "navigation-fragment_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public class C17070f extends AbstractC12964i1 {

    /* JADX INFO: renamed from: c */
    public final Context f65603c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1329o1 f65604d;

    /* JADX INFO: renamed from: e */
    public final int f65605e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashSet f65606f = new LinkedHashSet();

    /* JADX INFO: renamed from: g */
    public final ArrayList f65607g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final C2390i3 f65608h = new C2390i3(this, 2);

    /* JADX INFO: renamed from: i */
    public final C0227m1 f65609i = new C0227m1(this, 14);

    /* JADX INFO: renamed from: hb.f$a */
    public static final class a extends AbstractC1637w1 {

        /* JADX INFO: renamed from: w */
        public WeakReference f65610w;

        @Override // androidx.lifecycle.AbstractC1637w1
        public final void onCleared() {
            super.onCleared();
            WeakReference weakReference = this.f65610w;
            if (weakReference == null) {
                AbstractC22676k.m65757q("completeTransition");
                throw null;
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) weakReference.get();
            if (interfaceC4339a != null) {
                interfaceC4339a.invoke();
            }
        }
    }

    public C17070f(Context context, AbstractC1329o1 abstractC1329o1, int i13) {
        this.f65603c = context;
        this.f65604d = abstractC1329o1;
        this.f65605e = i13;
    }

    /* JADX INFO: renamed from: k */
    public static void m48193k(C17070f c17070f, String str, int i13) {
        boolean z4 = (i13 & 2) == 0;
        boolean z13 = (i13 & 4) != 0;
        ArrayList arrayList = c17070f.f65607g;
        if (z13) {
            AbstractC25265s.m74132j1(arrayList, new C13000z(str, 1));
        }
        arrayList.add(new C23465k(str, Boolean.valueOf(z4)));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m48194n() {
        return Log.isLoggable("FragmentManager", 2) || Log.isLoggable("FragmentNavigator", 2);
    }

    @Override // p114eb.AbstractC12964i1
    /* JADX INFO: renamed from: a */
    public final C12977n0 mo36423a() {
        return new C17071g(this);
    }

    @Override // p114eb.AbstractC12964i1
    /* JADX INFO: renamed from: d */
    public final void mo36436d(List list, C12997x0 c12997x0) {
        AbstractC1329o1 abstractC1329o1 = this.f65604d;
        if (abstractC1329o1.m4147Q()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C12982q c12982q = (C12982q) it.next();
            boolean zIsEmpty = ((List) m36435b().f44870e.f45200w.getValue()).isEmpty();
            if (c12997x0 == null || zIsEmpty || !c12997x0.f44904b || !this.f65606f.remove(c12982q.f44835F)) {
                C1271a c1271aM48196m = m48196m(c12982q, c12997x0);
                String str = c12982q.f44835F;
                if (!zIsEmpty) {
                    C12982q c12982q2 = (C12982q) AbstractC25265s.m74114R0((List) m36435b().f44870e.f45200w.getValue());
                    if (c12982q2 != null) {
                        m48193k(this, c12982q2.f44835F, 6);
                    }
                    m48193k(this, str, 6);
                    c1271aM48196m.m4067c(str);
                }
                c1271aM48196m.m4046j();
                if (m48194n()) {
                    Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry " + c12982q);
                }
                m36435b().m36499i(c12982q);
            } else {
                abstractC1329o1.m4193x(new C1325n1(abstractC1329o1, c12982q.f44835F, 0), false);
                m36435b().m36499i(c12982q);
            }
        }
    }

    @Override // p114eb.AbstractC12964i1
    /* JADX INFO: renamed from: e */
    public final void mo36437e(final C12988t c12988t) {
        super.mo36437e(c12988t);
        if (m48194n()) {
            Log.v("FragmentNavigator", "onAttach");
        }
        InterfaceC1351u1 interfaceC1351u1 = new InterfaceC1351u1() { // from class: hb.e
            @Override // androidx.fragment.app.InterfaceC1351u1
            /* JADX INFO: renamed from: a */
            public final void mo4085a(AbstractC1329o1 abstractC1329o1, AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
                Object objPrevious;
                AbstractC22676k.m65750j(abstractC1329o1, "<anonymous parameter 0>");
                C12988t c12988t2 = c12988t;
                List list = (List) c12988t2.f44870e.f45200w.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                } while (!AbstractC22676k.m65745e(((C12982q) objPrevious).f44835F, abstractComponentCallbacksC1320m0.getTag()));
                C12982q c12982q = (C12982q) objPrevious;
                boolean zM48194n = C17070f.m48194n();
                C17070f c17070f = this;
                if (zM48194n) {
                    Log.v("FragmentNavigator", "Attaching fragment " + abstractComponentCallbacksC1320m0 + " associated with entry " + c12982q + " to FragmentManager " + c17070f.f65604d);
                }
                if (c12982q != null) {
                    abstractComponentCallbacksC1320m0.getViewLifecycleOwnerLiveData().observe(abstractComponentCallbacksC1320m0, new C17075k(new C3743h(c17070f, abstractComponentCallbacksC1320m0, c12982q, 3)));
                    abstractComponentCallbacksC1320m0.getLifecycle().mo4986a(c17070f.f65608h);
                    c17070f.m48195l(abstractComponentCallbacksC1320m0, c12982q, c12988t2);
                }
            }
        };
        AbstractC1329o1 abstractC1329o1 = this.f65604d;
        abstractC1329o1.f5731q.add(interfaceC1351u1);
        abstractC1329o1.f5729o.add(new C17073i(c12988t, this));
    }

    @Override // p114eb.AbstractC12964i1
    /* JADX INFO: renamed from: f */
    public final void mo36438f(C12982q c12982q) {
        String str = c12982q.f44835F;
        AbstractC1329o1 abstractC1329o1 = this.f65604d;
        if (abstractC1329o1.m4147Q()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        C1271a c1271aM48196m = m48196m(c12982q, null);
        List list = (List) m36435b().f44870e.f45200w.getValue();
        if (list.size() > 1) {
            C12982q c12982q2 = (C12982q) AbstractC25265s.m74102I0(AbstractC37056f.m118951C(list) - 1, list);
            if (c12982q2 != null) {
                m48193k(this, c12982q2.f44835F, 6);
            }
            m48193k(this, str, 4);
            abstractC1329o1.m4193x(new C1317l1(abstractC1329o1, str, -1, 1), false);
            m48193k(this, str, 2);
            c1271aM48196m.m4067c(str);
        }
        c1271aM48196m.m4046j();
        m36435b().m36493c(c12982q);
    }

    @Override // p114eb.AbstractC12964i1
    /* JADX INFO: renamed from: g */
    public final void mo36439g(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f65606f;
            linkedHashSet.clear();
            AbstractC25265s.m74141p0(linkedHashSet, stringArrayList);
        }
    }

    @Override // p114eb.AbstractC12964i1
    /* JADX INFO: renamed from: h */
    public final Bundle mo36440h() {
        LinkedHashSet linkedHashSet = this.f65606f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return AbstractC12889b.m36273g(new C23465k("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    @Override // p114eb.AbstractC12964i1
    /* JADX INFO: renamed from: i */
    public final void mo36441i(C12982q popUpTo, boolean z4) {
        AbstractC22676k.m65750j(popUpTo, "popUpTo");
        AbstractC1329o1 abstractC1329o1 = this.f65604d;
        if (abstractC1329o1.m4147Q()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) m36435b().f44870e.f45200w.getValue();
        int iIndexOf = list.indexOf(popUpTo);
        List listSubList = list.subList(iIndexOf, list.size());
        C12982q c12982q = (C12982q) AbstractC25265s.m74096F0(list);
        C12982q c12982q2 = (C12982q) AbstractC25265s.m74102I0(iIndexOf - 1, list);
        if (c12982q2 != null) {
            m48193k(this, c12982q2.f44835F, 6);
        }
        List list2 = listSubList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            C12982q c12982q3 = (C12982q) obj;
            if (AbstractC38176k.m122279o(AbstractC38176k.m122272A(AbstractC25265s.m74145r0(this.f65607g), C17074j.f65615w), c12982q3.f44835F) || !AbstractC22676k.m65745e(c12982q3.f44835F, c12982q.f44835F)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m48193k(this, ((C12982q) it.next()).f44835F, 4);
        }
        if (z4) {
            for (C12982q c12982q4 : AbstractC25265s.m74138n1(list2)) {
                if (AbstractC22676k.m65745e(c12982q4, c12982q)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + c12982q4);
                } else {
                    abstractC1329o1.m4193x(new C1325n1(abstractC1329o1, c12982q4.f44835F, 1), false);
                    this.f65606f.add(c12982q4.f44835F);
                }
            }
        } else {
            abstractC1329o1.m4193x(new C1317l1(abstractC1329o1, popUpTo.f44835F, -1, 1), false);
        }
        if (m48194n()) {
            Log.v("FragmentNavigator", "Calling popWithTransition via popBackStack() on entry " + popUpTo + " with savedState " + z4);
        }
        m36435b().m36496f(popUpTo, z4);
    }

    /* JADX INFO: renamed from: l */
    public final void m48195l(AbstractComponentCallbacksC1320m0 fragment, C12982q c12982q, C12988t c12988t) {
        AbstractC22676k.m65750j(fragment, "fragment");
        C1579e2 viewModelStore = fragment.getViewModelStore();
        AbstractC22676k.m65749i(viewModelStore, "fragment.viewModelStore");
        C2178b c2178b = new C2178b(2);
        c2178b.m6855a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(a.class), C17072h.f65612w);
        C23421d c23421dM6857c = c2178b.m6857c();
        C23418a defaultCreationExtras = C23418a.f92771b;
        AbstractC22676k.m65750j(defaultCreationExtras, "defaultCreationExtras");
        C41113q c41113q = new C41113q(viewModelStore, c23421dM6857c, defaultCreationExtras);
        InterfaceC21461d modelClass = AbstractC21598x.m60666V(a.class);
        AbstractC22676k.m65750j(modelClass, "modelClass");
        String qualifiedName = modelClass.getQualifiedName();
        if (qualifiedName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        ((a) c41113q.m133475w("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), modelClass)).f65610w = new WeakReference(new C0226m0(c12982q, c12988t, this, fragment));
    }

    /* JADX INFO: renamed from: m */
    public final C1271a m48196m(C12982q c12982q, C12997x0 c12997x0) {
        C12977n0 c12977n0 = c12982q.f44844x;
        AbstractC22676k.m65748h(c12977n0, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle bundleM36479a = c12982q.m36479a();
        String strM48197p = ((C17071g) c12977n0).m48197p();
        char cCharAt = strM48197p.charAt(0);
        Context context = this.f65603c;
        if (cCharAt == '.') {
            strM48197p = context.getPackageName() + strM48197p;
        }
        AbstractC1329o1 abstractC1329o1 = this.f65604d;
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0Mo4083a = abstractC1329o1.m4143J().mo4083a(context.getClassLoader(), strM48197p);
        AbstractC22676k.m65749i(abstractComponentCallbacksC1320m0Mo4083a, "fragmentManager.fragment…t.classLoader, className)");
        abstractComponentCallbacksC1320m0Mo4083a.setArguments(bundleM36479a);
        C1271a c1271a = new C1271a(abstractC1329o1);
        int i13 = c12997x0 != null ? c12997x0.f44908f : -1;
        int i14 = c12997x0 != null ? c12997x0.f44909g : -1;
        int i15 = c12997x0 != null ? c12997x0.f44910h : -1;
        int i16 = c12997x0 != null ? c12997x0.f44911i : -1;
        if (i13 != -1 || i14 != -1 || i15 != -1 || i16 != -1) {
            if (i13 == -1) {
                i13 = 0;
            }
            if (i14 == -1) {
                i14 = 0;
            }
            if (i15 == -1) {
                i15 = 0;
            }
            c1271a.m4069f(i13, i14, i15, i16 != -1 ? i16 : 0);
        }
        c1271a.m4068e(this.f65605e, abstractComponentCallbacksC1320m0Mo4083a, c12982q.f44835F);
        c1271a.m4051o(abstractComponentCallbacksC1320m0Mo4083a);
        c1271a.f5578r = true;
        return c1271a;
    }
}
