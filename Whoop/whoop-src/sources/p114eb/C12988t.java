package p114eb;

import android.util.Log;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.EnumC1635w;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import ec3.InterfaceC13037f2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import m83.AbstractC25265s;
import m83.C25235a0;
import m83.C25258m;
import m83.C25271y;
import p098dt.AbstractC12350b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: eb.t */
/* JADX INFO: loaded from: classes.dex */
public final class C12988t {

    /* JADX INFO: renamed from: a */
    public final ReentrantLock f44866a;

    /* JADX INFO: renamed from: b */
    public final C13045h2 f44867b;

    /* JADX INFO: renamed from: c */
    public final C13045h2 f44868c;

    /* JADX INFO: renamed from: d */
    public boolean f44869d;

    /* JADX INFO: renamed from: e */
    public final C13081r1 f44870e;

    /* JADX INFO: renamed from: f */
    public final C13081r1 f44871f;

    /* JADX INFO: renamed from: g */
    public final AbstractC12964i1 f44872g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractC12939a0 f44873h;

    public C12988t(AbstractC12939a0 abstractC12939a0, AbstractC12964i1 navigator) {
        AbstractC22676k.m65750j(navigator, "navigator");
        this.f44873h = abstractC12939a0;
        this.f44866a = new ReentrantLock(true);
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(C25271y.f99162w);
        this.f44867b = c13045h2M36593c;
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(C25235a0.f99113w);
        this.f44868c = c13045h2M36593c2;
        this.f44870e = AbstractC13091v.m36598h(c13045h2M36593c);
        this.f44871f = AbstractC13091v.m36598h(c13045h2M36593c2);
        this.f44872g = navigator;
    }

    /* JADX INFO: renamed from: a */
    public final void m36491a(C12982q backStackEntry) {
        AbstractC22676k.m65750j(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f44866a;
        reentrantLock.lock();
        try {
            C13045h2 c13045h2 = this.f44867b;
            ArrayList arrayListM74128f1 = AbstractC25265s.m74128f1(backStackEntry, (Collection) c13045h2.getValue());
            c13045h2.getClass();
            c13045h2.m36571k(null, arrayListM74128f1);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    /* JADX INFO: renamed from: b */
    public final void m36492b(C12982q entry) {
        C12942b0 c12942b0;
        C1579e2 c1579e2;
        AbstractC22676k.m65750j(entry, "entry");
        String backStackEntryId = entry.f44835F;
        AbstractC12939a0 abstractC12939a0 = this.f44873h;
        C13045h2 c13045h2 = abstractC12939a0.f44689j;
        LinkedHashMap linkedHashMap = abstractC12939a0.f44674A;
        boolean zM65745e = AbstractC22676k.m65745e(linkedHashMap.get(entry), Boolean.TRUE);
        C13045h2 c13045h3 = this.f44868c;
        c13045h3.m36571k(null, AbstractC12350b.m34604y(entry, (Set) c13045h3.getValue()));
        linkedHashMap.remove(entry);
        C25258m c25258m = abstractC12939a0.f44686g;
        if (c25258m.contains(entry)) {
            if (this.f44869d) {
                return;
            }
            abstractC12939a0.m36385M();
            C13045h2 c13045h4 = abstractC12939a0.f44687h;
            ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(c25258m);
            c13045h4.getClass();
            c13045h4.m36571k(null, arrayListM74097F1);
            ArrayList arrayListM36379G = abstractC12939a0.m36379G();
            c13045h2.getClass();
            c13045h2.m36571k(null, arrayListM36379G);
            return;
        }
        abstractC12939a0.m36384L(entry);
        if (entry.f44837H.f6250d.compareTo(EnumC1635w.f6327y) >= 0) {
            entry.m36481c(EnumC1635w.f6325w);
        }
        if (c25258m == null || !c25258m.isEmpty()) {
            Iterator it = c25258m.iterator();
            while (it.hasNext()) {
                if (AbstractC22676k.m65745e(((C12982q) it.next()).f44835F, backStackEntryId)) {
                }
            }
            if (!zM65745e && (c12942b0 = abstractC12939a0.f44696q) != null) {
                AbstractC22676k.m65750j(backStackEntryId, "backStackEntryId");
                c1579e2 = (C1579e2) c12942b0.f44710w.remove(backStackEntryId);
                if (c1579e2 != null) {
                    c1579e2.m4975a();
                }
            }
        } else if (!zM65745e) {
            AbstractC22676k.m65750j(backStackEntryId, "backStackEntryId");
            c1579e2 = (C1579e2) c12942b0.f44710w.remove(backStackEntryId);
            if (c1579e2 != null) {
                c1579e2.m4975a();
            }
        }
        abstractC12939a0.m36385M();
        ArrayList arrayListM36379G2 = abstractC12939a0.m36379G();
        c13045h2.getClass();
        c13045h2.m36571k(null, arrayListM36379G2);
    }

    /* JADX INFO: renamed from: c */
    public final void m36493c(C12982q c12982q) {
        int iNextIndex;
        ReentrantLock reentrantLock = this.f44866a;
        reentrantLock.lock();
        try {
            ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1((Collection) this.f44870e.f45200w.getValue());
            ListIterator listIterator = arrayListM74097F1.listIterator(arrayListM74097F1.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                } else if (AbstractC22676k.m65745e(((C12982q) listIterator.previous()).f44835F, c12982q.f44835F)) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            arrayListM74097F1.set(iNextIndex, c12982q);
            C13045h2 c13045h2 = this.f44867b;
            c13045h2.getClass();
            c13045h2.m36571k(null, arrayListM74097F1);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m36494d(C12982q popUpTo, boolean z4) {
        AbstractC22676k.m65750j(popUpTo, "popUpTo");
        AbstractC12939a0 abstractC12939a0 = this.f44873h;
        AbstractC12964i1 abstractC12964i1Mo36434b = abstractC12939a0.f44702w.mo36434b(popUpTo.f44844x.f44822w);
        abstractC12939a0.f44674A.put(popUpTo, Boolean.valueOf(z4));
        if (!abstractC12964i1Mo36434b.equals(this.f44872g)) {
            Object obj = abstractC12939a0.f44703x.get(abstractC12964i1Mo36434b);
            AbstractC22676k.m65747g(obj);
            ((C12988t) obj).m36494d(popUpTo, z4);
            return;
        }
        C12994w c12994w = abstractC12939a0.f44705z;
        if (c12994w != null) {
            c12994w.invoke(popUpTo);
            m36495e(popUpTo, z4);
            return;
        }
        C12986s c12986s = new C12986s(this, popUpTo, z4, 0);
        C25258m c25258m = abstractC12939a0.f44686g;
        int iIndexOf = c25258m.indexOf(popUpTo);
        if (iIndexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
            return;
        }
        int i13 = iIndexOf + 1;
        if (i13 != c25258m.f99142y) {
            abstractC12939a0.m36376C(((C12982q) c25258m.get(i13)).f44844x.f44819H, true, false);
        }
        AbstractC12939a0.m36372F(abstractC12939a0, popUpTo);
        c12986s.invoke();
        abstractC12939a0.m36386N();
        abstractC12939a0.m36389c();
    }

    /* JADX INFO: renamed from: e */
    public final void m36495e(C12982q popUpTo, boolean z4) {
        AbstractC22676k.m65750j(popUpTo, "popUpTo");
        ReentrantLock reentrantLock = this.f44866a;
        reentrantLock.lock();
        try {
            C13045h2 c13045h2 = this.f44867b;
            Iterable iterable = (Iterable) c13045h2.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (AbstractC22676k.m65745e((C12982q) obj, popUpTo)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            c13045h2.getClass();
            c13045h2.m36571k(null, arrayList);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m36496f(C12982q popUpTo, boolean z4) {
        Object objPrevious;
        AbstractC22676k.m65750j(popUpTo, "popUpTo");
        C13045h2 c13045h2 = this.f44868c;
        Iterable iterable = (Iterable) c13045h2.getValue();
        boolean z13 = iterable instanceof Collection;
        C13081r1 c13081r1 = this.f44870e;
        if (!z13 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((C12982q) it.next()) == popUpTo) {
                    Iterable iterable2 = (Iterable) c13081r1.f45200w.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it3 = iterable2.iterator();
                    while (it3.hasNext()) {
                        if (((C12982q) it3.next()) == popUpTo) {
                            break;
                        }
                    }
                    return;
                }
            }
        }
        c13045h2.m36571k(null, AbstractC12350b.m34555D(popUpTo, (Set) c13045h2.getValue()));
        InterfaceC13037f2 interfaceC13037f2 = c13081r1.f45200w;
        InterfaceC13037f2 interfaceC13037f3 = c13081r1.f45200w;
        List list = (List) interfaceC13037f2.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            C12982q c12982q = (C12982q) objPrevious;
            if (!AbstractC22676k.m65745e(c12982q, popUpTo) && ((List) interfaceC13037f3.getValue()).lastIndexOf(c12982q) < ((List) interfaceC13037f3.getValue()).lastIndexOf(popUpTo)) {
                break;
            }
        }
        C12982q c12982q2 = (C12982q) objPrevious;
        if (c12982q2 != null) {
            c13045h2.m36571k(null, AbstractC12350b.m34555D(c12982q2, (Set) c13045h2.getValue()));
        }
        m36494d(popUpTo, z4);
    }

    /* JADX INFO: renamed from: g */
    public final void m36497g(C12982q entry) {
        AbstractC22676k.m65750j(entry, "entry");
        C13045h2 c13045h2 = this.f44868c;
        c13045h2.m36571k(null, AbstractC12350b.m34555D(entry, (Set) c13045h2.getValue()));
        if (!this.f44873h.f44686g.contains(entry)) {
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }
        entry.m36481c(EnumC1635w.f6328z);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    /* JADX INFO: renamed from: h */
    public final void m36498h(C12982q backStackEntry) {
        AbstractC22676k.m65750j(backStackEntry, "backStackEntry");
        AbstractC12939a0 abstractC12939a0 = this.f44873h;
        AbstractC12964i1 abstractC12964i1Mo36434b = abstractC12939a0.f44702w.mo36434b(backStackEntry.f44844x.f44822w);
        if (!abstractC12964i1Mo36434b.equals(this.f44872g)) {
            Object obj = abstractC12939a0.f44703x.get(abstractC12964i1Mo36434b);
            if (obj != null) {
                ((C12988t) obj).m36498h(backStackEntry);
                return;
            } else {
                throw new IllegalStateException(AbstractC25012a.m73376i(backStackEntry.f44844x.f44822w, " should already be created", new StringBuilder("NavigatorBackStack for ")).toString());
            }
        }
        ?? r10 = abstractC12939a0.f44704y;
        if (r10 != 0) {
            r10.invoke(backStackEntry);
            m36491a(backStackEntry);
        } else {
            Log.i("NavController", "Ignoring add of destination " + backStackEntry.f44844x + " outside of the call to navigate(). ");
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m36499i(C12982q backStackEntry) {
        AbstractC22676k.m65750j(backStackEntry, "backStackEntry");
        C13045h2 c13045h2 = this.f44868c;
        Iterable iterable = (Iterable) c13045h2.getValue();
        boolean z4 = iterable instanceof Collection;
        C13081r1 c13081r1 = this.f44870e;
        if (!z4 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((C12982q) it.next()) == backStackEntry) {
                    Iterable iterable2 = (Iterable) c13081r1.f45200w.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it3 = iterable2.iterator();
                        while (it3.hasNext()) {
                            if (((C12982q) it3.next()) == backStackEntry) {
                                return;
                            }
                        }
                        break;
                    }
                    break;
                }
            }
        }
        C12982q c12982q = (C12982q) AbstractC25265s.m74114R0((List) c13081r1.f45200w.getValue());
        if (c12982q != null) {
            LinkedHashSet linkedHashSetM34555D = AbstractC12350b.m34555D(c12982q, (Set) c13045h2.getValue());
            c13045h2.getClass();
            c13045h2.m36571k(null, linkedHashSetM34555D);
        }
        LinkedHashSet linkedHashSetM34555D2 = AbstractC12350b.m34555D(backStackEntry, (Set) c13045h2.getValue());
        c13045h2.getClass();
        c13045h2.m36571k(null, linkedHashSetM34555D2);
        m36498h(backStackEntry);
    }
}
