package p114eb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.core.app.TaskStackBuilder;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.InterfaceC1585g0;
import d13.AbstractC11478a;
import dc3.EnumC11916a;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13078q1;
import ec3.C13081r1;
import ec3.C13096w1;
import gb.C15646g0;
import ih0.AbstractC18489d0;
import io.sentry.hints.C20363j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import l83.C23470p;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25249h0;
import m83.C25253j0;
import m83.C25258m;
import m83.C25271y;
import p000.AbstractC11266d;
import p002a0.AbstractC0064z;
import p002a0.C0024g1;
import p002a0.C0030i1;
import p005a3.C0222l0;
import p024b0.AbstractC2177a;
import p026b2.C2320z;
import p027b3.C2390i3;
import p043c4.C3967k;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.AbstractC22681m0;
import p715kotlin.jvm.internal.C22659b0;
import p715kotlin.jvm.internal.C22665e0;
import q83.AbstractC30060g;
import se.AbstractC32417h;
import wb3.AbstractC37056f;
import xb3.AbstractC38176k;
import xb3.C38166a;
import xb3.C38180o;
import xb3.C38183r;

/* JADX INFO: renamed from: eb.a0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12939a0 {

    /* JADX INFO: renamed from: A */
    public final LinkedHashMap f44674A;

    /* JADX INFO: renamed from: B */
    public int f44675B;

    /* JADX INFO: renamed from: C */
    public final ArrayList f44676C;

    /* JADX INFO: renamed from: D */
    public final C23470p f44677D;

    /* JADX INFO: renamed from: E */
    public final C13096w1 f44678E;

    /* JADX INFO: renamed from: F */
    public final C13078q1 f44679F;

    /* JADX INFO: renamed from: a */
    public final Context f44680a;

    /* JADX INFO: renamed from: b */
    public final Activity f44681b;

    /* JADX INFO: renamed from: c */
    public C12985r0 f44682c;

    /* JADX INFO: renamed from: d */
    public Bundle f44683d;

    /* JADX INFO: renamed from: e */
    public Parcelable[] f44684e;

    /* JADX INFO: renamed from: f */
    public boolean f44685f;

    /* JADX INFO: renamed from: g */
    public final C25258m f44686g;

    /* JADX INFO: renamed from: h */
    public final C13045h2 f44687h;

    /* JADX INFO: renamed from: i */
    public final C13081r1 f44688i;

    /* JADX INFO: renamed from: j */
    public final C13045h2 f44689j;

    /* JADX INFO: renamed from: k */
    public final C13081r1 f44690k;

    /* JADX INFO: renamed from: l */
    public final LinkedHashMap f44691l;

    /* JADX INFO: renamed from: m */
    public final LinkedHashMap f44692m;

    /* JADX INFO: renamed from: n */
    public final LinkedHashMap f44693n;

    /* JADX INFO: renamed from: o */
    public final LinkedHashMap f44694o;

    /* JADX INFO: renamed from: p */
    public InterfaceC1585g0 f44695p;

    /* JADX INFO: renamed from: q */
    public C12942b0 f44696q;

    /* JADX INFO: renamed from: r */
    public final CopyOnWriteArrayList f44697r;

    /* JADX INFO: renamed from: s */
    public EnumC1635w f44698s;

    /* JADX INFO: renamed from: t */
    public final C2390i3 f44699t;

    /* JADX INFO: renamed from: u */
    public final C12998y f44700u;

    /* JADX INFO: renamed from: v */
    public final boolean f44701v;

    /* JADX INFO: renamed from: w */
    public final C12967j1 f44702w;

    /* JADX INFO: renamed from: x */
    public final LinkedHashMap f44703x;

    /* JADX INFO: renamed from: y */
    public AbstractC22680m f44704y;

    /* JADX INFO: renamed from: z */
    public C12994w f44705z;

    public AbstractC12939a0(Context context) {
        AbstractC22676k.m65750j(context, "context");
        this.f44680a = context;
        for (Object obj : AbstractC38176k.m122288x(context, C12944c.f44717y)) {
            if (((Context) obj) instanceof Activity) {
                this.f44681b = (Activity) obj;
                this.f44686g = new C25258m();
                C25271y c25271y = C25271y.f99162w;
                C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(c25271y);
                this.f44687h = c13045h2M36593c;
                this.f44688i = AbstractC13091v.m36598h(c13045h2M36593c);
                C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(c25271y);
                this.f44689j = c13045h2M36593c2;
                this.f44690k = AbstractC13091v.m36598h(c13045h2M36593c2);
                this.f44691l = new LinkedHashMap();
                this.f44692m = new LinkedHashMap();
                this.f44693n = new LinkedHashMap();
                this.f44694o = new LinkedHashMap();
                this.f44697r = new CopyOnWriteArrayList();
                this.f44698s = EnumC1635w.f6326x;
                this.f44699t = new C2390i3(this, 1);
                this.f44700u = new C12998y(this);
                this.f44701v = true;
                C12967j1 c12967j1 = new C12967j1();
                this.f44702w = c12967j1;
                this.f44703x = new LinkedHashMap();
                this.f44674A = new LinkedHashMap();
                c12967j1.m36450a(new C12989t0(c12967j1));
                c12967j1.m36450a(new C12947d(this.f44680a));
                this.f44676C = new ArrayList();
                this.f44677D = AbstractC30060g.m92088H(new C0222l0(this, 6));
                C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(1, 0, EnumC11916a.f38983x, 2);
                this.f44678E = c13096w1M36592b;
                this.f44679F = AbstractC13091v.m36597g(c13096w1M36592b);
            }
        }
        obj = null;
        this.f44681b = (Activity) obj;
        this.f44686g = new C25258m();
        C25271y c25271y2 = C25271y.f99162w;
        C13045h2 c13045h2M36593c3 = AbstractC13091v.m36593c(c25271y2);
        this.f44687h = c13045h2M36593c3;
        this.f44688i = AbstractC13091v.m36598h(c13045h2M36593c3);
        C13045h2 c13045h2M36593c4 = AbstractC13091v.m36593c(c25271y2);
        this.f44689j = c13045h2M36593c4;
        this.f44690k = AbstractC13091v.m36598h(c13045h2M36593c4);
        this.f44691l = new LinkedHashMap();
        this.f44692m = new LinkedHashMap();
        this.f44693n = new LinkedHashMap();
        this.f44694o = new LinkedHashMap();
        this.f44697r = new CopyOnWriteArrayList();
        this.f44698s = EnumC1635w.f6326x;
        this.f44699t = new C2390i3(this, 1);
        this.f44700u = new C12998y(this);
        this.f44701v = true;
        C12967j1 c12967j2 = new C12967j1();
        this.f44702w = c12967j2;
        this.f44703x = new LinkedHashMap();
        this.f44674A = new LinkedHashMap();
        c12967j2.m36450a(new C12989t0(c12967j2));
        c12967j2.m36450a(new C12947d(this.f44680a));
        this.f44676C = new ArrayList();
        this.f44677D = AbstractC30060g.m92088H(new C0222l0(this, 6));
        C13096w1 c13096w1M36592b2 = AbstractC13091v.m36592b(1, 0, EnumC11916a.f38983x, 2);
        this.f44678E = c13096w1M36592b2;
        this.f44679F = AbstractC13091v.m36597g(c13096w1M36592b2);
    }

    /* JADX INFO: renamed from: B */
    public static void m36371B(AbstractC12939a0 abstractC12939a0, String route, boolean z4) {
        abstractC12939a0.getClass();
        AbstractC22676k.m65750j(route, "route");
        if (abstractC12939a0.m36377D(route, z4, false)) {
            abstractC12939a0.m36389c();
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m36372F(AbstractC12939a0 abstractC12939a0, C12982q c12982q) {
        abstractC12939a0.m36378E(c12982q, false, new C25258m());
    }

    /* JADX INFO: renamed from: f */
    public static C12977n0 m36373f(int i13, C12977n0 c12977n0, C12977n0 c12977n1, boolean z4) {
        C12985r0 c12985r0;
        if (c12977n0.f44819H == i13 && (c12977n1 == null || (c12977n0.equals(c12977n1) && AbstractC22676k.m65745e(c12977n0.f44823x, c12977n1.f44823x)))) {
            return c12977n0;
        }
        if (c12977n0 instanceof C12985r0) {
            c12985r0 = (C12985r0) c12977n0;
        } else {
            C12985r0 c12985r1 = c12977n0.f44823x;
            AbstractC22676k.m65747g(c12985r1);
            c12985r0 = c12985r1;
        }
        return c12985r0.m36486r(i13, c12985r0, c12977n1, z4);
    }

    /* JADX INFO: renamed from: y */
    public static void m36374y(AbstractC12939a0 abstractC12939a0, String route, C12997x0 c12997x0, int i13) {
        if ((i13 & 2) != 0) {
            c12997x0 = null;
        }
        abstractC12939a0.getClass();
        AbstractC22676k.m65750j(route, "route");
        if (abstractC12939a0.f44682c == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + route + ". Navigation graph has not been set for NavController " + abstractC12939a0 + '.').toString());
        }
        C12985r0 c12985r0M36399n = abstractC12939a0.m36399n(abstractC12939a0.f44686g);
        C12972l0 c12972l0M36488u = c12985r0M36399n.m36488u(route, true, c12985r0M36399n);
        if (c12972l0M36488u == null) {
            StringBuilder sbM53375p = AbstractC18489d0.m53375p("Navigation destination that matches route ", route, " cannot be found in the navigation graph ");
            sbM53375p.append(abstractC12939a0.f44682c);
            throw new IllegalArgumentException(sbM53375p.toString());
        }
        C12977n0 c12977n0 = c12972l0M36488u.f44804w;
        Bundle bundleM36464c = c12977n0.m36464c(c12972l0M36488u.f44805x);
        if (bundleM36464c == null) {
            bundleM36464c = new Bundle();
        }
        Intent intent = new Intent();
        int i14 = C12977n0.f44815K;
        String str = c12977n0.f44820I;
        Uri uri = Uri.parse(str != null ? "android-app://androidx.navigation/".concat(str) : "");
        AbstractC22676k.m65746f(uri);
        intent.setDataAndType(uri, null);
        intent.setAction(null);
        bundleM36464c.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        abstractC12939a0.m36406u(c12977n0, bundleM36464c, c12997x0);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m36375A(int i13, boolean z4) {
        return m36376C(i13, z4, false) && m36389c();
    }

    /* JADX INFO: renamed from: C */
    public final boolean m36376C(int i13, boolean z4, boolean z13) {
        C12977n0 c12977n0;
        C25258m c25258m = this.f44686g;
        if (c25258m.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = AbstractC25265s.m74138n1(c25258m).iterator();
        do {
            if (!it.hasNext()) {
                c12977n0 = null;
                break;
            }
            c12977n0 = ((C12982q) it.next()).f44844x;
            AbstractC12964i1 abstractC12964i1Mo36434b = this.f44702w.mo36434b(c12977n0.f44822w);
            if (z4 || c12977n0.f44819H != i13) {
                arrayList.add(abstractC12964i1Mo36434b);
            }
        } while (c12977n0.f44819H != i13);
        if (c12977n0 != null) {
            return m36390d(arrayList, c12977n0, z4, z13);
        }
        int i14 = C12977n0.f44815K;
        Log.i("NavController", "Ignoring popBackStack to destination " + AbstractC34132o.m107895x(this.f44680a, i13) + " as it was not found on the current back stack");
        return false;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m36377D(String route, boolean z4, boolean z13) {
        boolean z14;
        Object objPrevious;
        Object objMo36411a;
        Object objMo36411a2;
        C25258m c25258m = this.f44686g;
        boolean z15 = false;
        if (c25258m.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = c25258m.listIterator(c25258m.mo74007a());
        while (true) {
            if (!listIterator.hasPrevious()) {
                z14 = z15;
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            C12982q c12982q = (C12982q) objPrevious;
            C12977n0 c12977n0 = c12982q.f44844x;
            Bundle bundleM36479a = c12982q.m36479a();
            c12977n0.getClass();
            AbstractC22676k.m65750j(route, "route");
            boolean z16 = true;
            if (AbstractC22676k.m65745e(c12977n0.f44820I, route)) {
                z14 = z15;
            } else {
                C12972l0 c12972l0M36469l = c12977n0.m36469l(route);
                if (c12977n0.equals(c12972l0M36469l != null ? c12972l0M36469l.f44804w : null)) {
                    Bundle bundle = c12972l0M36469l.f44805x;
                    if (bundleM36479a == null || bundle == null) {
                        z14 = z15;
                    } else {
                        Set<String> setKeySet = bundle.keySet();
                        AbstractC22676k.m65749i(setKeySet, "matchingArgs.keySet()");
                        Iterator<T> it = setKeySet.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                String key = (String) it.next();
                                if (bundleM36479a.containsKey(key)) {
                                    C12971l c12971l = (C12971l) c12972l0M36469l.f44804w.f44818G.get(key);
                                    AbstractC12958g1 abstractC12958g1 = c12971l != null ? c12971l.f44798a : null;
                                    z14 = z15;
                                    if (abstractC12958g1 != null) {
                                        AbstractC22676k.m65749i(key, "key");
                                        objMo36411a = abstractC12958g1.mo36411a(bundle, key);
                                    } else {
                                        objMo36411a = null;
                                    }
                                    if (abstractC12958g1 != null) {
                                        AbstractC22676k.m65749i(key, "key");
                                        objMo36411a2 = abstractC12958g1.mo36411a(bundleM36479a, key);
                                    } else {
                                        objMo36411a2 = null;
                                    }
                                    if (abstractC12958g1 == null || abstractC12958g1.mo36422f(objMo36411a, objMo36411a2)) {
                                        z15 = z14;
                                    }
                                } else {
                                    z14 = z15;
                                }
                            } else {
                                z14 = z15;
                            }
                        }
                    }
                    z16 = z14;
                } else {
                    z16 = z15;
                    z14 = z16;
                }
            }
            if (z4 || !z16) {
                arrayList.add(this.f44702w.mo36434b(c12982q.f44844x.f44822w));
            }
            if (z16) {
                break;
            }
            z15 = z14;
        }
        C12982q c12982q2 = (C12982q) objPrevious;
        C12977n0 c12977n1 = c12982q2 != null ? c12982q2.f44844x : null;
        if (c12977n1 != null) {
            return m36390d(arrayList, c12977n1, z4, z13);
        }
        Log.i("NavController", "Ignoring popBackStack to route " + route + " as it was not found on the current back stack");
        return z14;
    }

    /* JADX INFO: renamed from: E */
    public final void m36378E(C12982q c12982q, boolean z4, C25258m c25258m) {
        C12942b0 c12942b0;
        C13081r1 c13081r1;
        Set set;
        C25258m c25258m2 = this.f44686g;
        C12982q c12982q2 = (C12982q) c25258m2.last();
        if (!AbstractC22676k.m65745e(c12982q2, c12982q)) {
            throw new IllegalStateException(("Attempted to pop " + c12982q.f44844x + ", which is not the top of the back stack (" + c12982q2.f44844x + ')').toString());
        }
        AbstractC25265s.m74134l1(c25258m2);
        C12988t c12988t = (C12988t) this.f44703x.get(this.f44702w.mo36434b(c12982q2.f44844x.f44822w));
        boolean z13 = true;
        if ((c12988t == null || (c13081r1 = c12988t.f44871f) == null || (set = (Set) c13081r1.f45200w.getValue()) == null || !set.contains(c12982q2)) && !this.f44692m.containsKey(c12982q2)) {
            z13 = false;
        }
        EnumC1635w enumC1635w = c12982q2.f44837H.f6250d;
        EnumC1635w enumC1635w2 = EnumC1635w.f6327y;
        if (enumC1635w.compareTo(enumC1635w2) >= 0) {
            if (z4) {
                c12982q2.m36481c(enumC1635w2);
                c25258m.addFirst(new C12984r(c12982q2));
            }
            if (z13) {
                c12982q2.m36481c(enumC1635w2);
            } else {
                c12982q2.m36481c(EnumC1635w.f6325w);
                m36384L(c12982q2);
            }
        }
        if (z4 || z13 || (c12942b0 = this.f44696q) == null) {
            return;
        }
        String backStackEntryId = c12982q2.f44835F;
        AbstractC22676k.m65750j(backStackEntryId, "backStackEntryId");
        C1579e2 c1579e2 = (C1579e2) c12942b0.f44710w.remove(backStackEntryId);
        if (c1579e2 != null) {
            c1579e2.m4975a();
        }
    }

    /* JADX INFO: renamed from: G */
    public final ArrayList m36379G() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f44703x.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((C12988t) it.next()).f44871f.f45200w.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                C12982q c12982q = (C12982q) obj;
                if (!arrayList.contains(c12982q) && c12982q.f44841L.compareTo(EnumC1635w.f6328z) < 0) {
                    arrayList2.add(obj);
                }
            }
            AbstractC25265s.m74141p0(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : this.f44686g) {
            C12982q c12982q2 = (C12982q) obj2;
            if (!arrayList.contains(c12982q2) && c12982q2.f44841L.compareTo(EnumC1635w.f6328z) >= 0) {
                arrayList3.add(obj2);
            }
        }
        AbstractC25265s.m74141p0(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!(((C12982q) obj3).f44844x instanceof C12985r0)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    /* JADX INFO: renamed from: H */
    public final void m36380H(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.f44680a.getClassLoader());
        this.f44683d = bundle.getBundle("android-support-nav:controller:navigatorState");
        this.f44684e = bundle.getParcelableArray("android-support-nav:controller:backStack");
        LinkedHashMap linkedHashMap = this.f44694o;
        linkedHashMap.clear();
        int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i13 = 0;
            int i14 = 0;
            while (i13 < length) {
                this.f44693n.put(Integer.valueOf(intArray[i13]), stringArrayList.get(i14));
                i13++;
                i14++;
            }
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
        if (stringArrayList2 != null) {
            for (String id4 : stringArrayList2) {
                Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + id4);
                if (parcelableArray != null) {
                    AbstractC22676k.m65749i(id4, "id");
                    C25258m c25258m = new C25258m(parcelableArray.length);
                    C0030i1 c0030i1M65777h = AbstractC22681m0.m65777h(parcelableArray);
                    while (c0030i1M65777h.hasNext()) {
                        Parcelable parcelable = (Parcelable) c0030i1M65777h.next();
                        AbstractC22676k.m65748h(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        c25258m.addLast((C12984r) parcelable);
                    }
                    linkedHashMap.put(id4, c25258m);
                }
            }
        }
        this.f44685f = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
    }

    /* JADX INFO: renamed from: I */
    public final boolean m36381I(int i13, Bundle bundle, C12997x0 c12997x0) {
        C12977n0 c12977n0M36396k;
        C12982q c12982q;
        C12977n0 c12977n0;
        Integer numValueOf = Integer.valueOf(i13);
        LinkedHashMap linkedHashMap = this.f44693n;
        if (!linkedHashMap.containsKey(numValueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i13));
        Collection collectionValues = linkedHashMap.values();
        C13000z c13000z = new C13000z(str, 0);
        AbstractC22676k.m65750j(collectionValues, "<this>");
        AbstractC25265s.m74090C0(collectionValues, c13000z, true);
        C25258m<C12984r> c25258m = (C25258m) AbstractC22681m0.m65772c(this.f44694o).remove(str);
        ArrayList arrayList = new ArrayList();
        C12982q c12982q2 = (C12982q) this.f44686g.m74019l();
        if (c12982q2 == null || (c12977n0M36396k = c12982q2.f44844x) == null) {
            c12977n0M36396k = m36396k();
        }
        if (c25258m != null) {
            for (C12984r c12984r : c25258m) {
                C12977n0 c12977n0M36373f = m36373f(c12984r.f44851x, c12977n0M36396k, null, true);
                Context context = this.f44680a;
                if (c12977n0M36373f == null) {
                    int i14 = C12977n0.f44815K;
                    throw new IllegalStateException(("Restore State failed: destination " + AbstractC34132o.m107895x(context, c12984r.f44851x) + " cannot be found from the current destination " + c12977n0M36396k).toString());
                }
                arrayList.add(c12984r.m36483b(context, c12977n0M36373f, m36397l(), this.f44696q));
                c12977n0M36396k = c12977n0M36373f;
            }
        }
        ArrayList<List> arrayList2 = new ArrayList();
        ArrayList<C12982q> arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(((C12982q) obj).f44844x instanceof C12985r0)) {
                arrayList3.add(obj);
            }
        }
        for (C12982q c12982q3 : arrayList3) {
            List list = (List) AbstractC25265s.m74114R0(arrayList2);
            if (AbstractC22676k.m65745e((list == null || (c12982q = (C12982q) AbstractC25265s.m74112P0(list)) == null || (c12977n0 = c12982q.f44844x) == null) ? null : c12977n0.f44822w, c12982q3.f44844x.f44822w)) {
                list.add(c12982q3);
            } else {
                arrayList2.add(AbstractC37056f.m118964P(c12982q3));
            }
        }
        C22659b0 c22659b0 = new C22659b0();
        for (List list2 : arrayList2) {
            AbstractC12964i1 abstractC12964i1Mo36434b = this.f44702w.mo36434b(((C12982q) AbstractC25265s.m74096F0(list2)).f44844x.f44822w);
            this.f44704y = new C3967k(c22659b0, arrayList, new C22665e0(), this, bundle, 1);
            abstractC12964i1Mo36434b.mo36436d(list2, c12997x0);
            this.f44704y = null;
        }
        return c22659b0.f89329w;
    }

    /* JADX INFO: renamed from: J */
    public final Bundle m36382J() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : AbstractC25247g0.m74001j0(this.f44702w.f44788a).entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleMo36440h = ((AbstractC12964i1) entry.getValue()).mo36440h();
            if (bundleMo36440h != null) {
                arrayList.add(str);
                bundle2.putBundle(str, bundleMo36440h);
            }
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        C25258m c25258m = this.f44686g;
        if (!c25258m.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[c25258m.f99142y];
            Iterator<E> it = c25258m.iterator();
            int i13 = 0;
            while (it.hasNext()) {
                parcelableArr[i13] = new C12984r((C12982q) it.next());
                i13++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        LinkedHashMap linkedHashMap = this.f44693n;
        if (!linkedHashMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[linkedHashMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i14 = 0;
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                int iIntValue = ((Number) entry2.getKey()).intValue();
                String str2 = (String) entry2.getValue();
                iArr[i14] = iIntValue;
                arrayList2.add(str2);
                i14++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        LinkedHashMap linkedHashMap2 = this.f44694o;
        if (!linkedHashMap2.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                String str3 = (String) entry3.getKey();
                C25258m c25258m2 = (C25258m) entry3.getValue();
                arrayList3.add(str3);
                Parcelable[] parcelableArr2 = new Parcelable[c25258m2.f99142y];
                int i15 = 0;
                for (Object obj : c25258m2) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    parcelableArr2[i15] = (C12984r) obj;
                    i15 = i16;
                }
                bundle.putParcelableArray(AbstractC11266d.m30461o("android-support-nav:controller:backStackStates:", str3), parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (this.f44685f) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.f44685f);
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [eb.n0, eb.r0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r21v0, types: [eb.a0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v5, types: [eb.n0, eb.r0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v35, types: [eb.n0, eb.r0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [eb.n0, eb.r0] */
    /* JADX WARN: Type inference failed for: r6v16, types: [eb.n0, eb.r0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX INFO: renamed from: K */
    public final void m36383K(C12985r0 graph, Bundle bundle) {
        Activity activity;
        Intent intent;
        int[] intArray;
        C12985r0 c12985r0M36399n;
        C12972l0 c12972l0M36487t;
        ?? r10;
        boolean z4;
        String strM107895x;
        ?? r14;
        C12977n0 c12977n0M36486r;
        Bundle[] bundleArr;
        Context context;
        ?? r15;
        Bundle bundle2;
        C12977n0 c12977n0M36486r2;
        ?? r16;
        ArrayList<String> stringArrayList;
        AbstractC22676k.m65750j(graph, "graph");
        C0024g1 c0024g1 = graph.f44855L;
        C25258m<C12982q> c25258m = this.f44686g;
        if (!c25258m.isEmpty() && m36397l() == EnumC1635w.f6325w) {
            throw new IllegalStateException("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
        }
        int i13 = 0;
        if (AbstractC22676k.m65745e(this.f44682c, graph)) {
            int iM58g = c0024g1.m58g();
            for (int i14 = 0; i14 < iM58g; i14++) {
                C12977n0 c12977n0 = (C12977n0) c0024g1.m59h(i14);
                C12985r0 c12985r0 = this.f44682c;
                AbstractC22676k.m65747g(c12985r0);
                int iM56e = c12985r0.f44855L.m56e(i14);
                C12985r0 c12985r1 = this.f44682c;
                AbstractC22676k.m65747g(c12985r1);
                C0024g1 c0024g2 = c12985r1.f44855L;
                if (c0024g2.f55w) {
                    AbstractC0064z.m159a(c0024g2);
                }
                int iM6853a = AbstractC2177a.m6853a(c0024g2.f58z, iM56e, c0024g2.f56x);
                if (iM6853a >= 0) {
                    Object[] objArr = c0024g2.f57y;
                    Object obj = objArr[iM6853a];
                    objArr[iM6853a] = c12977n0;
                }
            }
            for (C12982q c12982q : c25258m) {
                int i15 = C12977n0.f44815K;
                C25253j0 c25253j0M74143q0 = AbstractC25265s.m74143q0(AbstractC38176k.m122276E(AbstractC34132o.m107896y(c12982q.f44844x)));
                C12977n0 c12977n0M36486r3 = this.f44682c;
                AbstractC22676k.m65747g(c12977n0M36486r3);
                Iterator it = c25253j0M74143q0.iterator();
                while (true) {
                    C25249h0 c25249h0 = (C25249h0) it;
                    if (c25249h0.hasNext()) {
                        C12977n0 c12977n1 = (C12977n0) c25249h0.next();
                        if ((!AbstractC22676k.m65745e(c12977n1, this.f44682c) || !AbstractC22676k.m65745e(c12977n0M36486r3, graph)) && (c12977n0M36486r3 instanceof C12985r0)) {
                            ?? r17 = (C12985r0) c12977n0M36486r3;
                            c12977n0M36486r3 = r17.m36486r(c12977n1.f44819H, r17, null, false);
                            AbstractC22676k.m65747g(c12977n0M36486r3);
                        }
                    }
                }
                AbstractC22676k.m65750j(c12977n0M36486r3, "<set-?>");
                c12982q.f44844x = c12977n0M36486r3;
            }
            return;
        }
        C12985r0 c12985r2 = this.f44682c;
        LinkedHashMap linkedHashMap = this.f44703x;
        boolean z13 = true;
        if (c12985r2 != null) {
            for (Integer id4 : new ArrayList(this.f44693n.keySet())) {
                AbstractC22676k.m65749i(id4, "id");
                int iIntValue = id4.intValue();
                Iterator it3 = linkedHashMap.values().iterator();
                while (it3.hasNext()) {
                    ((C12988t) it3.next()).f44869d = true;
                }
                boolean zM36381I = m36381I(iIntValue, null, AbstractC32417h.m101185P(C12992v.f44879x));
                Iterator it4 = linkedHashMap.values().iterator();
                while (it4.hasNext()) {
                    ((C12988t) it4.next()).f44869d = false;
                }
                if (zM36381I) {
                    m36376C(iIntValue, true, false);
                }
            }
            m36376C(c12985r2.f44819H, true, false);
        }
        this.f44682c = graph;
        Bundle bundle3 = this.f44683d;
        C12967j1 c12967j1 = this.f44702w;
        if (bundle3 != null && (stringArrayList = bundle3.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            for (String name : stringArrayList) {
                AbstractC22676k.m65749i(name, "name");
                AbstractC12964i1 abstractC12964i1Mo36434b = c12967j1.mo36434b(name);
                Bundle bundle4 = bundle3.getBundle(name);
                if (bundle4 != null) {
                    abstractC12964i1Mo36434b.mo36439g(bundle4);
                }
            }
        }
        Parcelable[] parcelableArr = this.f44684e;
        Context context2 = this.f44680a;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                AbstractC22676k.m65748h(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                C12984r c12984r = (C12984r) parcelable;
                int i16 = c12984r.f44851x;
                C12977n0 c12977n0M36391e = m36391e(i16, null);
                if (c12977n0M36391e == null) {
                    int i17 = C12977n0.f44815K;
                    StringBuilder sbM53375p = AbstractC18489d0.m53375p("Restoring the Navigation back stack failed: destination ", AbstractC34132o.m107895x(context2, i16), " cannot be found from the current destination ");
                    sbM53375p.append(m36394i());
                    throw new IllegalStateException(sbM53375p.toString());
                }
                C12982q c12982qM36483b = c12984r.m36483b(context2, c12977n0M36391e, m36397l(), this.f44696q);
                AbstractC12964i1 abstractC12964i1Mo36434b2 = c12967j1.mo36434b(c12977n0M36391e.f44822w);
                Object c12988t = linkedHashMap.get(abstractC12964i1Mo36434b2);
                if (c12988t == null) {
                    c12988t = new C12988t(this, abstractC12964i1Mo36434b2);
                    linkedHashMap.put(abstractC12964i1Mo36434b2, c12988t);
                }
                c25258m.addLast(c12982qM36483b);
                ((C12988t) c12988t).m36491a(c12982qM36483b);
                C12985r0 c12985r3 = c12982qM36483b.f44844x.f44823x;
                if (c12985r3 != null) {
                    m36400o(c12982qM36483b, m36392g(c12985r3.f44819H));
                }
            }
            m36386N();
            this.f44684e = null;
        }
        Collection collectionValues = AbstractC25247g0.m74001j0(c12967j1.f44788a).values();
        ArrayList<AbstractC12964i1> arrayList = new ArrayList();
        for (Object obj2 : collectionValues) {
            if (!((AbstractC12964i1) obj2).f44779b) {
                arrayList.add(obj2);
            }
        }
        for (AbstractC12964i1 abstractC12964i1 : arrayList) {
            Object c12988t2 = linkedHashMap.get(abstractC12964i1);
            if (c12988t2 == null) {
                c12988t2 = new C12988t(this, abstractC12964i1);
                linkedHashMap.put(abstractC12964i1, c12988t2);
            }
            abstractC12964i1.mo36437e((C12988t) c12988t2);
        }
        if (this.f44682c == null || !c25258m.isEmpty()) {
            m36389c();
            return;
        }
        if (!this.f44685f && (activity = this.f44681b) != null && (intent = activity.getIntent()) != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                try {
                    intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                } catch (Exception e5) {
                    Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e5);
                    intArray = null;
                }
            } else {
                intArray = null;
            }
            ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
            Bundle bundle5 = new Bundle();
            Bundle bundle6 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
            if (bundle6 != null) {
                bundle5.putAll(bundle6);
            }
            if ((intArray == null || intArray.length == 0) && (c12972l0M36487t = (c12985r0M36399n = m36399n(c25258m)).m36487t(new C12969k0(intent), true, c12985r0M36399n)) != null) {
                C12977n0 c12977n2 = c12972l0M36487t.f44804w;
                int[] iArrM36465d = c12977n2.m36465d(null);
                Bundle bundleM36464c = c12977n2.m36464c(c12972l0M36487t.f44805x);
                if (bundleM36464c != null) {
                    bundle5.putAll(bundleM36464c);
                }
                intArray = iArrM36465d;
                parcelableArrayList = null;
            }
            if (intArray != null && intArray.length != 0) {
                C12985r0 c12985r4 = this.f44682c;
                int length = intArray.length;
                int i18 = 0;
                while (true) {
                    if (i18 >= length) {
                        r10 = c12985r4;
                        z4 = z13;
                        strM107895x = null;
                        break;
                    }
                    z4 = z13;
                    int i19 = intArray[i18];
                    if (i18 == 0) {
                        C12985r0 c12985r5 = this.f44682c;
                        AbstractC22676k.m65747g(c12985r5);
                        c12977n0M36486r2 = c12985r5.f44819H == i19 ? this.f44682c : null;
                    } else {
                        AbstractC22676k.m65747g(r10);
                        c12977n0M36486r2 = r10.m36486r(i19, r10, null, false);
                    }
                    if (c12977n0M36486r2 == null) {
                        r10 = c12985r4;
                        r10 = c12985r4;
                        r10 = c12985r4;
                        int i24 = C12977n0.f44815K;
                        strM107895x = AbstractC34132o.m107895x(context2, i19);
                        break;
                    }
                    r10 = c12985r4;
                    r10 = c12985r4;
                    if (i18 == intArray.length - 1 || !(c12977n0M36486r2 instanceof C12985r0)) {
                        r10 = c12985r4;
                    } else {
                        while (true) {
                            r10 = c12985r4;
                            r16 = (C12985r0) c12977n0M36486r2;
                            AbstractC22676k.m65747g(r16);
                            if (!(r16.m36486r(r16.f44856M, r16, null, false) instanceof C12985r0)) {
                                break;
                            } else {
                                c12977n0M36486r2 = r16.m36486r(r16.f44856M, r16, null, false);
                            }
                        }
                        r10 = r16;
                    }
                    i18++;
                    z13 = z4;
                    r10 = r10;
                }
                if (strM107895x == null) {
                    bundle5.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                    int length2 = intArray.length;
                    Bundle[] bundleArr2 = new Bundle[length2];
                    for (int i25 = 0; i25 < length2; i25++) {
                        Bundle bundle7 = new Bundle();
                        bundle7.putAll(bundle5);
                        if (parcelableArrayList != null && (bundle2 = (Bundle) parcelableArrayList.get(i25)) != null) {
                            bundle7.putAll(bundle2);
                        }
                        bundleArr2[i25] = bundle7;
                    }
                    int flags = intent.getFlags();
                    int i26 = 268435456 & flags;
                    if (i26 != 0 && (flags & 32768) == 0) {
                        intent.addFlags(32768);
                        TaskStackBuilder taskStackBuilderAddNextIntentWithParentStack = TaskStackBuilder.create(context2).addNextIntentWithParentStack(intent);
                        AbstractC22676k.m65749i(taskStackBuilderAddNextIntentWithParentStack, "create(context).addNextI…ntWithParentStack(intent)");
                        taskStackBuilderAddNextIntentWithParentStack.startActivities();
                        activity.finish();
                        activity.overridePendingTransition(0, 0);
                        return;
                    }
                    if (i26 != 0) {
                        if (!c25258m.isEmpty()) {
                            C12985r0 c12985r6 = this.f44682c;
                            AbstractC22676k.m65747g(c12985r6);
                            m36376C(c12985r6.f44819H, z4, false);
                        }
                        while (i13 < intArray.length) {
                            int i27 = intArray[i13];
                            int i28 = i13 + 1;
                            Bundle bundle8 = bundleArr2[i13];
                            C12977n0 c12977n0M36391e2 = m36391e(i27, null);
                            if (c12977n0M36391e2 == null) {
                                int i29 = C12977n0.f44815K;
                                StringBuilder sbM53375p2 = AbstractC18489d0.m53375p("Deep Linking failed: destination ", AbstractC34132o.m107895x(context2, i27), " cannot be found from the current destination ");
                                sbM53375p2.append(m36394i());
                                throw new IllegalStateException(sbM53375p2.toString());
                            }
                            m36406u(c12977n0M36391e2, bundle8, AbstractC32417h.m101185P(new C2320z(7, c12977n0M36391e2, this)));
                            i13 = i28;
                        }
                        this.f44685f = true;
                        return;
                    }
                    C12985r0 c12985r7 = this.f44682c;
                    int length3 = intArray.length;
                    int i34 = 0;
                    while (i34 < length3) {
                        int i35 = intArray[i34];
                        Bundle bundle9 = bundleArr2[i34];
                        if (i34 == 0) {
                            c12977n0M36486r = this.f44682c;
                        } else {
                            AbstractC22676k.m65747g(r14);
                            c12977n0M36486r = r14.m36486r(i35, r14, null, false);
                        }
                        if (c12977n0M36486r == null) {
                            r14 = c12985r7;
                            r14 = c12985r7;
                            int i36 = C12977n0.f44815K;
                            throw new IllegalStateException("Deep Linking failed: destination " + AbstractC34132o.m107895x(context2, i35) + " cannot be found in graph " + r14);
                        }
                        r14 = c12985r7;
                        if (i34 == intArray.length - 1) {
                            r14 = c12985r7;
                            C12985r0 c12985r8 = this.f44682c;
                            AbstractC22676k.m65747g(c12985r8);
                            bundleArr = bundleArr2;
                            context = context2;
                            m36406u(c12977n0M36486r, bundle9, new C12997x0(false, false, c12985r8.f44819H, true, false, 0, 0, -1, -1));
                        } else if (c12977n0M36486r instanceof C12985r0) {
                            while (true) {
                                r14 = c12985r7;
                                r15 = (C12985r0) c12977n0M36486r;
                                AbstractC22676k.m65747g(r15);
                                if (!(r15.m36486r(r15.f44856M, r15, null, false) instanceof C12985r0)) {
                                    break;
                                } else {
                                    c12977n0M36486r = r15.m36486r(r15.f44856M, r15, null, false);
                                }
                            }
                            bundleArr = bundleArr2;
                            context = context2;
                            r14 = r15;
                        } else {
                            r14 = c12985r7;
                            bundleArr = bundleArr2;
                            context = context2;
                        }
                        context2 = context;
                        bundleArr2 = bundleArr;
                        length3 = length3;
                        i34++;
                        intArray = intArray;
                        r14 = r14;
                    }
                    r14 = c12985r7;
                    this.f44685f = true;
                    return;
                }
                Log.i("NavController", "Could not find destination " + strM107895x + " in the navigation graph, ignoring the deep link from " + intent);
            }
        }
        C12985r0 c12985r9 = this.f44682c;
        AbstractC22676k.m65747g(c12985r9);
        m36406u(c12985r9, bundle, null);
    }

    /* JADX INFO: renamed from: L */
    public final void m36384L(C12982q child) {
        AbstractC22676k.m65750j(child, "child");
        C12982q c12982q = (C12982q) this.f44691l.remove(child);
        if (c12982q == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f44692m;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(c12982q);
        Integer numValueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            C12988t c12988t = (C12988t) this.f44703x.get(this.f44702w.mo36434b(c12982q.f44844x.f44822w));
            if (c12988t != null) {
                c12988t.m36492b(c12982q);
            }
            linkedHashMap.remove(c12982q);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m36385M() {
        AtomicInteger atomicInteger;
        C13081r1 c13081r1;
        Set set;
        ArrayList<C12982q> arrayListM74097F1 = AbstractC25265s.m74097F1(this.f44686g);
        if (arrayListM74097F1.isEmpty()) {
            return;
        }
        C12977n0 c12977n0 = ((C12982q) AbstractC25265s.m74112P0(arrayListM74097F1)).f44844x;
        ArrayList arrayList = new ArrayList();
        if (c12977n0 instanceof InterfaceC12950e) {
            Iterator it = AbstractC25265s.m74138n1(arrayListM74097F1).iterator();
            while (it.hasNext()) {
                C12977n0 c12977n1 = ((C12982q) it.next()).f44844x;
                arrayList.add(c12977n1);
                if (!(c12977n1 instanceof InterfaceC12950e) && !(c12977n1 instanceof C12985r0)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (C12982q c12982q : AbstractC25265s.m74138n1(arrayListM74097F1)) {
            EnumC1635w enumC1635w = c12982q.f44841L;
            C12977n0 c12977n2 = c12982q.f44844x;
            if (c12977n0 != null && c12977n2.f44819H == c12977n0.f44819H) {
                EnumC1635w enumC1635w2 = EnumC1635w.f6323E;
                if (enumC1635w != enumC1635w2) {
                    C12988t c12988t = (C12988t) this.f44703x.get(this.f44702w.mo36434b(c12977n2.f44822w));
                    if (AbstractC22676k.m65745e((c12988t == null || (c13081r1 = c12988t.f44871f) == null || (set = (Set) c13081r1.f45200w.getValue()) == null) ? null : Boolean.valueOf(set.contains(c12982q)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.f44692m.get(c12982q)) != null && atomicInteger.get() == 0)) {
                        map.put(c12982q, EnumC1635w.f6328z);
                    } else {
                        map.put(c12982q, enumC1635w2);
                    }
                }
                C12977n0 c12977n3 = (C12977n0) AbstractC25265s.m74100H0(arrayList);
                if (c12977n3 != null && c12977n3.f44819H == c12977n2.f44819H) {
                    if (arrayList.isEmpty()) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    arrayList.remove(0);
                }
                c12977n0 = c12977n0.f44823x;
            } else if (arrayList.isEmpty() || c12977n2.f44819H != ((C12977n0) AbstractC25265s.m74096F0(arrayList)).f44819H) {
                c12982q.m36481c(EnumC1635w.f6327y);
            } else {
                if (arrayList.isEmpty()) {
                    throw new NoSuchElementException("List is empty.");
                }
                C12977n0 c12977n4 = (C12977n0) arrayList.remove(0);
                if (enumC1635w == EnumC1635w.f6323E) {
                    c12982q.m36481c(EnumC1635w.f6328z);
                } else {
                    EnumC1635w enumC1635w3 = EnumC1635w.f6328z;
                    if (enumC1635w != enumC1635w3) {
                        map.put(c12982q, enumC1635w3);
                    }
                }
                C12985r0 c12985r0 = c12977n4.f44823x;
                if (c12985r0 != null && !arrayList.contains(c12985r0)) {
                    arrayList.add(c12985r0);
                }
            }
        }
        for (C12982q c12982q2 : arrayListM74097F1) {
            EnumC1635w enumC1635w4 = (EnumC1635w) map.get(c12982q2);
            if (enumC1635w4 != null) {
                c12982q2.m36481c(enumC1635w4);
            } else {
                c12982q2.m36482d();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    /* JADX INFO: renamed from: N */
    public final void m36386N() {
        boolean z4;
        if (this.f44701v) {
            z4 = m36395j() > 1;
        }
        this.f44700u.m43013j(z4);
    }

    /* JADX INFO: renamed from: a */
    public final void m36387a(C12977n0 c12977n0, Bundle bundle, C12982q c12982q, List list) {
        Object objPrevious;
        Object objPrevious2;
        C12977n0 c12977n1 = c12982q.f44844x;
        boolean z4 = c12977n1 instanceof InterfaceC12950e;
        C25258m c25258m = this.f44686g;
        if (!z4) {
            while (!c25258m.isEmpty() && (((C12982q) c25258m.last()).f44844x instanceof InterfaceC12950e) && m36376C(((C12982q) c25258m.last()).f44844x.f44819H, true, false)) {
            }
        }
        C25258m<C12982q> c25258m2 = new C25258m();
        boolean z13 = c12977n0 instanceof C12985r0;
        Context context = this.f44680a;
        Object obj = null;
        if (z13) {
            C12977n0 c12977n2 = c12977n1;
            do {
                AbstractC22676k.m65747g(c12977n2);
                c12977n2 = c12977n2.f44823x;
                if (c12977n2 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious2 = null;
                            break;
                        }
                        objPrevious2 = listIterator.previous();
                    } while (!AbstractC22676k.m65745e(((C12982q) objPrevious2).f44844x, c12977n2));
                    C12982q c12982qM56531o = (C12982q) objPrevious2;
                    if (c12982qM56531o == null) {
                        c12982qM56531o = C20363j.m56531o(context, c12977n2, bundle, m36397l(), this.f44696q);
                    }
                    c25258m2.addFirst(c12982qM56531o);
                    if (!c25258m.isEmpty() && ((C12982q) c25258m.last()).f44844x == c12977n2) {
                        m36372F(this, (C12982q) c25258m.last());
                    }
                }
                if (c12977n2 == null) {
                    break;
                }
            } while (c12977n2 != c12977n0);
        }
        C12977n0 c12977n3 = c25258m2.isEmpty() ? c12977n1 : ((C12982q) c25258m2.first()).f44844x;
        while (c12977n3 != null && m36391e(c12977n3.f44819H, c12977n3) != c12977n3) {
            c12977n3 = c12977n3.f44823x;
            if (c12977n3 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator2.previous();
                } while (!AbstractC22676k.m65745e(((C12982q) objPrevious).f44844x, c12977n3));
                C12982q c12982qM56531o2 = (C12982q) objPrevious;
                if (c12982qM56531o2 == null) {
                    c12982qM56531o2 = C20363j.m56531o(context, c12977n3, c12977n3.m36464c(bundle2), m36397l(), this.f44696q);
                }
                c25258m2.addFirst(c12982qM56531o2);
            }
        }
        if (!c25258m2.isEmpty()) {
            c12977n1 = ((C12982q) c25258m2.first()).f44844x;
        }
        while (!c25258m.isEmpty() && (((C12982q) c25258m.last()).f44844x instanceof C12985r0)) {
            C12977n0 c12977n4 = ((C12982q) c25258m.last()).f44844x;
            AbstractC22676k.m65748h(c12977n4, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((C12985r0) c12977n4).f44855L.m55d(c12977n1.f44819H) != null) {
                break;
            } else {
                m36372F(this, (C12982q) c25258m.last());
            }
        }
        C12982q c12982q2 = (C12982q) c25258m.m74017g();
        if (c12982q2 == null) {
            c12982q2 = (C12982q) c25258m2.m74017g();
        }
        if (!AbstractC22676k.m65745e(c12982q2 != null ? c12982q2.f44844x : null, this.f44682c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (listIterator3.hasPrevious()) {
                Object objPrevious3 = listIterator3.previous();
                C12977n0 c12977n5 = ((C12982q) objPrevious3).f44844x;
                C12985r0 c12985r0 = this.f44682c;
                AbstractC22676k.m65747g(c12985r0);
                if (AbstractC22676k.m65745e(c12977n5, c12985r0)) {
                    obj = objPrevious3;
                    break;
                }
            }
            C12982q c12982qM56531o3 = (C12982q) obj;
            if (c12982qM56531o3 == null) {
                C12985r0 c12985r1 = this.f44682c;
                AbstractC22676k.m65747g(c12985r1);
                C12985r0 c12985r2 = this.f44682c;
                AbstractC22676k.m65747g(c12985r2);
                c12982qM56531o3 = C20363j.m56531o(context, c12985r1, c12985r2.m36464c(bundle), m36397l(), this.f44696q);
            }
            c25258m2.addFirst(c12982qM56531o3);
        }
        for (C12982q c12982q3 : c25258m2) {
            Object obj2 = this.f44703x.get(this.f44702w.mo36434b(c12982q3.f44844x.f44822w));
            if (obj2 == null) {
                throw new IllegalStateException(AbstractC25012a.m73376i(c12977n0.f44822w, " should already be created", new StringBuilder("NavigatorBackStack for ")).toString());
            }
            ((C12988t) obj2).m36491a(c12982q3);
        }
        c25258m.addAll(c25258m2);
        c25258m.addLast(c12982q);
        for (C12982q c12982q4 : AbstractC25265s.m74128f1(c12982q, c25258m2)) {
            C12985r0 c12985r3 = c12982q4.f44844x.f44823x;
            if (c12985r3 != null) {
                m36400o(c12982q4, m36392g(c12985r3.f44819H));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m36388b(InterfaceC12990u interfaceC12990u) {
        this.f44697r.add(interfaceC12990u);
        C25258m c25258m = this.f44686g;
        if (c25258m.isEmpty()) {
            return;
        }
        C12982q c12982q = (C12982q) c25258m.last();
        interfaceC12990u.mo36501a(this, c12982q.f44844x, c12982q.m36479a());
    }

    /* JADX INFO: renamed from: c */
    public final boolean m36389c() {
        C25258m c25258m;
        while (true) {
            c25258m = this.f44686g;
            if (c25258m.isEmpty() || !(((C12982q) c25258m.last()).f44844x instanceof C12985r0)) {
                break;
            }
            m36372F(this, (C12982q) c25258m.last());
        }
        C12982q c12982q = (C12982q) c25258m.m74019l();
        ArrayList arrayList = this.f44676C;
        if (c12982q != null) {
            arrayList.add(c12982q);
        }
        this.f44675B++;
        m36385M();
        int i13 = this.f44675B - 1;
        this.f44675B = i13;
        if (i13 == 0) {
            ArrayList<C12982q> arrayListM74097F1 = AbstractC25265s.m74097F1(arrayList);
            arrayList.clear();
            for (C12982q c12982q2 : arrayListM74097F1) {
                Iterator it = this.f44697r.iterator();
                while (it.hasNext()) {
                    ((InterfaceC12990u) it.next()).mo36501a(this, c12982q2.f44844x, c12982q2.m36479a());
                }
                this.f44678E.mo36564a(c12982q2);
            }
            ArrayList arrayListM74097F2 = AbstractC25265s.m74097F1(c25258m);
            C13045h2 c13045h2 = this.f44687h;
            c13045h2.getClass();
            c13045h2.m36571k(null, arrayListM74097F2);
            ArrayList arrayListM36379G = m36379G();
            C13045h2 c13045h3 = this.f44689j;
            c13045h3.getClass();
            c13045h3.m36571k(null, arrayListM36379G);
        }
        return c12982q != null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m36390d(ArrayList arrayList, C12977n0 c12977n0, boolean z4, boolean z13) {
        AbstractC12939a0 abstractC12939a0;
        boolean z14;
        C22659b0 c22659b0 = new C22659b0();
        C25258m c25258m = new C25258m();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                abstractC12939a0 = this;
                z14 = z13;
                break;
            }
            AbstractC12964i1 abstractC12964i1 = (AbstractC12964i1) it.next();
            C22659b0 c22659b1 = new C22659b0();
            C12982q c12982q = (C12982q) this.f44686g.last();
            abstractC12939a0 = this;
            z14 = z13;
            abstractC12939a0.f44705z = new C12994w(c22659b1, c22659b0, abstractC12939a0, z14, c25258m);
            abstractC12964i1.mo36441i(c12982q, z14);
            abstractC12939a0.f44705z = null;
            if (!c22659b1.f89329w) {
                break;
            }
            z13 = z14;
        }
        if (z14) {
            LinkedHashMap linkedHashMap = abstractC12939a0.f44693n;
            if (!z4) {
                Iterator it3 = new C38180o(AbstractC38176k.m122288x(c12977n0, C12992v.f44880y), new C12996x(this, 0)).iterator();
                while (true) {
                    C38183r c38183r = (C38183r) it3;
                    if (!c38183r.hasNext()) {
                        break;
                    }
                    Integer numValueOf = Integer.valueOf(((C12977n0) c38183r.next()).f44819H);
                    C12984r c12984r = (C12984r) c25258m.m74017g();
                    linkedHashMap.put(numValueOf, c12984r != null ? c12984r.f44850w : null);
                }
            }
            if (!c25258m.isEmpty()) {
                C12984r c12984r2 = (C12984r) c25258m.first();
                int i13 = c12984r2.f44851x;
                String str = c12984r2.f44850w;
                Iterator it4 = new C38180o(AbstractC38176k.m122288x(m36391e(i13, null), C12992v.f44881z), new C12996x(this, 1)).iterator();
                while (true) {
                    C38183r c38183r2 = (C38183r) it4;
                    if (!c38183r2.hasNext()) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((C12977n0) c38183r2.next()).f44819H), str);
                }
                if (linkedHashMap.values().contains(str)) {
                    abstractC12939a0.f44694o.put(str, c25258m);
                }
            }
        }
        m36386N();
        return c22659b0.f89329w;
    }

    /* JADX INFO: renamed from: e */
    public final C12977n0 m36391e(int i13, C12977n0 c12977n0) {
        C12977n0 c12977n1;
        C12985r0 c12985r0 = this.f44682c;
        if (c12985r0 == null) {
            return null;
        }
        if (c12985r0.f44819H == i13) {
            if (c12977n0 == null) {
                return c12985r0;
            }
            if (AbstractC22676k.m65745e(c12985r0, c12977n0) && c12977n0.f44823x == null) {
                return this.f44682c;
            }
        }
        C12982q c12982q = (C12982q) this.f44686g.m74019l();
        if (c12982q == null || (c12977n1 = c12982q.f44844x) == null) {
            c12977n1 = this.f44682c;
            AbstractC22676k.m65747g(c12977n1);
        }
        return m36373f(i13, c12977n1, c12977n0, false);
    }

    /* JADX INFO: renamed from: g */
    public final C12982q m36392g(int i13) {
        Object objPrevious;
        C25258m c25258m = this.f44686g;
        ListIterator<E> listIterator = c25258m.listIterator(c25258m.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((C12982q) objPrevious).f44844x.f44819H != i13);
        C12982q c12982q = (C12982q) objPrevious;
        if (c12982q != null) {
            return c12982q;
        }
        StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        sbM30466t.append(m36394i());
        throw new IllegalArgumentException(sbM30466t.toString().toString());
    }

    /* JADX INFO: renamed from: h */
    public final C12982q m36393h() {
        return (C12982q) this.f44686g.m74019l();
    }

    /* JADX INFO: renamed from: i */
    public final C12977n0 m36394i() {
        C12982q c12982qM36393h = m36393h();
        if (c12982qM36393h != null) {
            return c12982qM36393h.f44844x;
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final int m36395j() {
        int i13 = 0;
        C25258m c25258m = this.f44686g;
        if (c25258m != null && c25258m.isEmpty()) {
            return 0;
        }
        Iterator<E> it = c25258m.iterator();
        while (it.hasNext()) {
            if (!(((C12982q) it.next()).f44844x instanceof C12985r0) && (i13 = i13 + 1) < 0) {
                AbstractC37056f.m118976c0();
                throw null;
            }
        }
        return i13;
    }

    /* JADX INFO: renamed from: k */
    public final C12985r0 m36396k() {
        C12985r0 c12985r0 = this.f44682c;
        if (c12985r0 == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        AbstractC22676k.m65748h(c12985r0, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return c12985r0;
    }

    /* JADX INFO: renamed from: l */
    public final EnumC1635w m36397l() {
        return this.f44695p == null ? EnumC1635w.f6327y : this.f44698s;
    }

    /* JADX INFO: renamed from: m */
    public final C12982q m36398m() {
        Object next;
        Iterator it = AbstractC25265s.m74138n1(this.f44686g).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it3 = ((C38166a) AbstractC38176k.m122278n(it)).iterator();
        while (it3.hasNext()) {
            next = it3.next();
            if (!(((C12982q) next).f44844x instanceof C12985r0)) {
                return (C12982q) next;
            }
        }
        next = null;
        return (C12982q) next;
    }

    /* JADX INFO: renamed from: n */
    public final C12985r0 m36399n(C25258m c25258m) {
        C12977n0 c12977n0;
        C12982q c12982q = (C12982q) c25258m.m74019l();
        if (c12982q == null || (c12977n0 = c12982q.f44844x) == null) {
            c12977n0 = this.f44682c;
            AbstractC22676k.m65747g(c12977n0);
        }
        if (c12977n0 instanceof C12985r0) {
            return (C12985r0) c12977n0;
        }
        C12985r0 c12985r0 = c12977n0.f44823x;
        AbstractC22676k.m65747g(c12985r0);
        return c12985r0;
    }

    /* JADX INFO: renamed from: o */
    public final void m36400o(C12982q c12982q, C12982q c12982q2) {
        this.f44691l.put(c12982q, c12982q2);
        LinkedHashMap linkedHashMap = this.f44692m;
        if (linkedHashMap.get(c12982q2) == null) {
            linkedHashMap.put(c12982q2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(c12982q2);
        AbstractC22676k.m65747g(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0037  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x006f, please report this as an issue */
    /* JADX INFO: renamed from: p */
    public final void m36401p(int i13, Bundle bundle, C12997x0 c12997x0) {
        int i14;
        Bundle bundle2;
        C12977n0 c12977n0M36391e;
        Context context;
        String strM107895x;
        boolean z4;
        String str;
        int i15;
        C25258m c25258m = this.f44686g;
        C12977n0 c12977n0 = c25258m.isEmpty() ? this.f44682c : ((C12982q) c25258m.last()).f44844x;
        if (c12977n0 == null) {
            throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
        }
        C12956g c12956gM36466e = c12977n0.m36466e(i13);
        if (c12956gM36466e != null) {
            if (c12997x0 == null) {
                c12997x0 = c12956gM36466e.f44753b;
            }
            i14 = c12956gM36466e.f44752a;
            Bundle bundle3 = c12956gM36466e.f44754c;
            if (bundle3 != null) {
                bundle2 = new Bundle();
                bundle2.putAll(bundle3);
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putAll(bundle);
            }
            if (i14 == 0 && c12997x0 != null) {
                z4 = c12997x0.f44906d;
                str = c12997x0.f44912j;
                i15 = c12997x0.f44905c;
                if (i15 == -1 || str != null) {
                    if (str != null) {
                        m36371B(this, str, z4);
                        return;
                    } else {
                        if (i15 != -1) {
                            m36375A(i15, z4);
                            return;
                        }
                        return;
                    }
                }
            }
            if (i14 != 0) {
                throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
            }
            c12977n0M36391e = m36391e(i14, null);
            if (c12977n0M36391e == null) {
                m36406u(c12977n0M36391e, bundle2, c12997x0);
                return;
            }
            int i16 = C12977n0.f44815K;
            context = this.f44680a;
            strM107895x = AbstractC34132o.m107895x(context, i14);
            if (c12956gM36466e == null) {
                throw new IllegalArgumentException("Navigation action/destination " + strM107895x + " cannot be found from the current destination " + c12977n0);
            }
            StringBuilder sbM53375p = AbstractC18489d0.m53375p("Navigation destination ", strM107895x, " referenced from action ");
            sbM53375p.append(AbstractC34132o.m107895x(context, i13));
            sbM53375p.append(" cannot be found from the current destination ");
            sbM53375p.append(c12977n0);
            throw new IllegalArgumentException(sbM53375p.toString().toString());
        }
        i14 = i13;
        bundle2 = null;
        if (bundle != null) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putAll(bundle);
        }
        if (i14 == 0) {
            z4 = c12997x0.f44906d;
            str = c12997x0.f44912j;
            i15 = c12997x0.f44905c;
            if (i15 == -1) {
            }
            if (str != null) {
                m36371B(this, str, z4);
                return;
            } else {
                if (i15 != -1) {
                    m36375A(i15, z4);
                    return;
                }
                return;
            }
        }
        if (i14 != 0) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
        }
        c12977n0M36391e = m36391e(i14, null);
        if (c12977n0M36391e == null) {
            m36406u(c12977n0M36391e, bundle2, c12997x0);
            return;
        }
        int i17 = C12977n0.f44815K;
        context = this.f44680a;
        strM107895x = AbstractC34132o.m107895x(context, i14);
        if (c12956gM36466e == null) {
            throw new IllegalArgumentException("Navigation action/destination " + strM107895x + " cannot be found from the current destination " + c12977n0);
        }
        StringBuilder sbM53375p2 = AbstractC18489d0.m53375p("Navigation destination ", strM107895x, " referenced from action ");
        sbM53375p2.append(AbstractC34132o.m107895x(context, i13));
        sbM53375p2.append(" cannot be found from the current destination ");
        sbM53375p2.append(c12977n0);
        throw new IllegalArgumentException(sbM53375p2.toString().toString());
    }

    /* JADX INFO: renamed from: q */
    public final void m36402q(Uri uri) {
        m36404s(AbstractC11478a.m30854f(uri, "deepLink", uri, null, null));
    }

    /* JADX INFO: renamed from: r */
    public final void m36403r(Uri uri, C12997x0 c12997x0) {
        m36409x(AbstractC11478a.m30854f(uri, "deepLink", uri, null, null), c12997x0);
    }

    /* JADX INFO: renamed from: s */
    public final void m36404s(C12969k0 request) {
        AbstractC22676k.m65750j(request, "request");
        m36405t(request, null);
    }

    /* JADX INFO: renamed from: t */
    public final void m36405t(C12969k0 request, C12997x0 c12997x0) {
        AbstractC22676k.m65750j(request, "request");
        m36409x(request, c12997x0);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:56:0x0108 A[LOOP:4: B:54:0x0102->B:56:0x0108, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x0152  */
    /* JADX WARN: Code duplicated, block: B:62:0x015e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0175 A[LOOP:6: B:65:0x016f->B:67:0x0175, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x018a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0190  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:95:0x0167 A[SYNTHETIC] */
    /* JADX INFO: renamed from: u */
    public final void m36406u(C12977n0 c12977n0, Bundle bundle, C12997x0 c12997x0) {
        boolean z4;
        C12967j1 c12967j1;
        C22659b0 c22659b0;
        boolean z13;
        int iNextIndex;
        C12977n0 c12977n1;
        C25258m<C12982q> c25258m;
        C12985r0 c12985r0;
        boolean zM36376C;
        LinkedHashMap linkedHashMap = this.f44703x;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((C12988t) it.next()).f44869d = true;
        }
        C22659b0 c22659b1 = new C22659b0();
        if (c12997x0 != null) {
            boolean z14 = c12997x0.f44907e;
            boolean z15 = c12997x0.f44906d;
            String str = c12997x0.f44912j;
            if (str != null) {
                zM36376C = m36377D(str, z15, z14);
            } else {
                int i13 = c12997x0.f44905c;
                if (i13 != -1) {
                    zM36376C = m36376C(i13, z15, z14);
                } else {
                    z4 = false;
                }
            }
            z4 = zM36376C;
        } else {
            z4 = false;
        }
        Bundle bundleM36464c = c12977n0.m36464c(bundle);
        if (c12997x0 == null || !c12997x0.f44904b) {
            c12967j1 = this.f44702w;
            if (c12997x0 == null && c12997x0.f44903a) {
                C12982q c12982qM36393h = m36393h();
                C25258m c25258m2 = this.f44686g;
                ListIterator listIterator = c25258m2.listIterator(c25258m2.mo74007a());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (((C12982q) listIterator.previous()).f44844x == c12977n0) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                if (iNextIndex == -1) {
                    c22659b0 = c22659b1;
                    z13 = false;
                } else if (c12977n0 instanceof C12985r0) {
                    int i14 = C12985r0.f44854P;
                    List listM122276E = AbstractC38176k.m122276E(AbstractC38176k.m122272A(AbstractC38176k.m122288x((C12985r0) c12977n0, C12992v.f44876F), C12992v.f44875E));
                    if (c25258m2.f99142y - iNextIndex == listM122276E.size()) {
                        List listSubList = c25258m2.subList(iNextIndex, c25258m2.f99142y);
                        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listSubList, 10));
                        Iterator it3 = listSubList.iterator();
                        while (it3.hasNext()) {
                            arrayList.add(Integer.valueOf(((C12982q) it3.next()).f44844x.f44819H));
                        }
                        if (arrayList.equals(listM122276E)) {
                            c25258m = new C25258m();
                            while (AbstractC37056f.m118951C(c25258m2) >= iNextIndex) {
                                C12982q c12982q = (C12982q) AbstractC25265s.m74134l1(c25258m2);
                                m36384L(c12982q);
                                C12982q c12982q2 = new C12982q(c12982q.f44843w, c12982q.f44844x, c12982q.f44844x.m36464c(bundle), c12982q.f44846z, c12982q.f44834E, c12982q.f44835F, c12982q.f44836G);
                                c12982q2.f44846z = c12982q.f44846z;
                                c12982q2.m36481c(c12982q.f44841L);
                                c25258m.addFirst(c12982q2);
                                c22659b1 = c22659b1;
                            }
                            c22659b0 = c22659b1;
                            for (C12982q c12982q3 : c25258m) {
                                c12985r0 = c12982q3.f44844x.f44823x;
                                if (c12985r0 != null) {
                                    m36400o(c12982q3, m36392g(c12985r0.f44819H));
                                }
                                c25258m2.addLast(c12982q3);
                            }
                            for (C12982q c12982q4 : c25258m) {
                                c12967j1.mo36434b(c12982q4.f44844x.f44822w).mo36438f(c12982q4);
                            }
                            z13 = true;
                        }
                    }
                    c22659b0 = c22659b1;
                    z13 = false;
                } else if (c12982qM36393h == null || (c12977n1 = c12982qM36393h.f44844x) == null || c12977n0.f44819H != c12977n1.f44819H) {
                    c22659b0 = c22659b1;
                    z13 = false;
                } else {
                    c25258m = new C25258m();
                    while (AbstractC37056f.m118951C(c25258m2) >= iNextIndex) {
                        C12982q c12982q5 = (C12982q) AbstractC25265s.m74134l1(c25258m2);
                        m36384L(c12982q5);
                        C12982q c12982q6 = new C12982q(c12982q5.f44843w, c12982q5.f44844x, c12982q5.f44844x.m36464c(bundle), c12982q5.f44846z, c12982q5.f44834E, c12982q5.f44835F, c12982q5.f44836G);
                        c12982q6.f44846z = c12982q5.f44846z;
                        c12982q6.m36481c(c12982q5.f44841L);
                        c25258m.addFirst(c12982q6);
                        c22659b1 = c22659b1;
                    }
                    c22659b0 = c22659b1;
                    while (r1.hasNext()) {
                        c12985r0 = c12982q3.f44844x.f44823x;
                        if (c12985r0 != null) {
                            m36400o(c12982q3, m36392g(c12985r0.f44819H));
                        }
                        c25258m2.addLast(c12982q3);
                    }
                    while (r0.hasNext()) {
                        c12967j1.mo36434b(c12982q4.f44844x.f44822w).mo36438f(c12982q4);
                    }
                    z13 = true;
                }
            } else {
                c22659b0 = c22659b1;
                z13 = false;
            }
            if (z13) {
                c22659b1 = c22659b0;
            } else {
                C12982q c12982qM56531o = C20363j.m56531o(this.f44680a, c12977n0, bundleM36464c, m36397l(), this.f44696q);
                AbstractC12964i1 abstractC12964i1Mo36434b = c12967j1.mo36434b(c12977n0.f44822w);
                List listM118958J = AbstractC37056f.m118958J(c12982qM56531o);
                c22659b1 = c22659b0;
                this.f44704y = new C15646g0(c22659b1, this, c12977n0, bundleM36464c, 2);
                abstractC12964i1Mo36434b.mo36436d(listM118958J, c12997x0);
                this.f44704y = null;
            }
        } else if (this.f44693n.containsKey(Integer.valueOf(c12977n0.f44819H))) {
            c22659b1.f89329w = m36381I(c12977n0.f44819H, bundleM36464c, c12997x0);
            z13 = false;
        } else {
            c12967j1 = this.f44702w;
            if (c12997x0 == null) {
                c22659b0 = c22659b1;
                z13 = false;
            } else {
                c22659b0 = c22659b1;
                z13 = false;
            }
            if (z13) {
                C12982q c12982qM56531o2 = C20363j.m56531o(this.f44680a, c12977n0, bundleM36464c, m36397l(), this.f44696q);
                AbstractC12964i1 abstractC12964i1Mo36434b2 = c12967j1.mo36434b(c12977n0.f44822w);
                List listM118958J2 = AbstractC37056f.m118958J(c12982qM56531o2);
                c22659b1 = c22659b0;
                this.f44704y = new C15646g0(c22659b1, this, c12977n0, bundleM36464c, 2);
                abstractC12964i1Mo36434b2.mo36436d(listM118958J2, c12997x0);
                this.f44704y = null;
            } else {
                c22659b1 = c22659b0;
            }
        }
        m36386N();
        Iterator it4 = linkedHashMap.values().iterator();
        while (it4.hasNext()) {
            ((C12988t) it4.next()).f44869d = false;
        }
        if (z4 || c22659b1.f89329w || z13) {
            m36389c();
        } else {
            m36385M();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m36407v(InterfaceC12981p0 directions) {
        AbstractC22676k.m65750j(directions, "directions");
        m36401p(directions.mo19186a(), directions.getArguments(), null);
    }

    /* JADX INFO: renamed from: w */
    public final void m36408w(String route, Function1 function1) {
        AbstractC22676k.m65750j(route, "route");
        m36374y(this, route, AbstractC32417h.m101185P(function1), 4);
    }

    /* JADX INFO: renamed from: x */
    public final void m36409x(C12969k0 request, C12997x0 c12997x0) {
        AbstractC22676k.m65750j(request, "request");
        if (this.f44682c == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + request + ". Navigation graph has not been set for NavController " + this + '.').toString());
        }
        C12985r0 c12985r0M36399n = m36399n(this.f44686g);
        C12972l0 c12972l0M36487t = c12985r0M36399n.m36487t(request, true, c12985r0M36399n);
        if (c12972l0M36487t == null) {
            throw new IllegalArgumentException("Navigation destination that matches request " + request + " cannot be found in the navigation graph " + this.f44682c);
        }
        C12977n0 c12977n0 = c12972l0M36487t.f44804w;
        Bundle bundleM36464c = c12977n0.m36464c(c12972l0M36487t.f44805x);
        if (bundleM36464c == null) {
            bundleM36464c = new Bundle();
        }
        Intent intent = new Intent();
        intent.setDataAndType(request.f44793a, request.f44795c);
        intent.setAction(request.f44794b);
        bundleM36464c.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        m36406u(c12977n0, bundleM36464c, c12997x0);
    }

    /* JADX INFO: renamed from: z */
    public final boolean m36410z() {
        if (this.f44686g.isEmpty()) {
            return false;
        }
        C12977n0 c12977n0M36394i = m36394i();
        AbstractC22676k.m65747g(c12977n0M36394i);
        return m36375A(c12977n0M36394i.f44819H, true);
    }
}
