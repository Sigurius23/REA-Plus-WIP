package sn;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p284ko.C22631o;
import p284ko.InterfaceC22625j0;
import p309lo.AbstractC24543a;
import p465rm.AbstractC31558o1;
import p465rm.C31545k0;
import p556vm.C36137d;
import p556vm.InterfaceC36138e;
import sm.C32713f;

/* JADX INFO: renamed from: sn.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC32721a {

    /* JADX INFO: renamed from: a */
    public final ArrayList f136025a = new ArrayList(1);

    /* JADX INFO: renamed from: b */
    public final HashSet f136026b = new HashSet(1);

    /* JADX INFO: renamed from: c */
    public final C32770z f136027c = new C32770z(0);

    /* JADX INFO: renamed from: d */
    public final C32770z f136028d = new C32770z(1);

    /* JADX INFO: renamed from: e */
    public Looper f136029e;

    /* JADX INFO: renamed from: f */
    public AbstractC31558o1 f136030f;

    /* JADX INFO: renamed from: g */
    public C32713f f136031g;

    /* JADX INFO: renamed from: a */
    public abstract InterfaceC32757s mo102684a(C32763v c32763v, C22631o c22631o, long j7);

    /* JADX INFO: renamed from: b */
    public final void m102685b(InterfaceC32765w interfaceC32765w) {
        HashSet hashSet = this.f136026b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(interfaceC32765w);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        mo102686c();
    }

    /* JADX INFO: renamed from: c */
    public void mo102686c() {
    }

    /* JADX INFO: renamed from: d */
    public final void m102687d(InterfaceC32765w interfaceC32765w) {
        this.f136029e.getClass();
        HashSet hashSet = this.f136026b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(interfaceC32765w);
        if (zIsEmpty) {
            mo102688e();
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo102688e() {
    }

    /* JADX INFO: renamed from: f */
    public abstract C31545k0 mo102689f();

    /* JADX INFO: renamed from: g */
    public abstract void mo102690g();

    /* JADX INFO: renamed from: h */
    public final void m102691h(InterfaceC32765w interfaceC32765w, InterfaceC22625j0 interfaceC22625j0, C32713f c32713f) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f136029e;
        AbstractC24543a.m71569e(looper == null || looper == looperMyLooper);
        this.f136031g = c32713f;
        AbstractC31558o1 abstractC31558o1 = this.f136030f;
        this.f136025a.add(interfaceC32765w);
        if (this.f136029e == null) {
            this.f136029e = looperMyLooper;
            this.f136026b.add(interfaceC32765w);
            mo102692i(interfaceC22625j0);
        } else if (abstractC31558o1 != null) {
            m102687d(interfaceC32765w);
            interfaceC32765w.mo97193a(this, abstractC31558o1);
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo102692i(InterfaceC22625j0 interfaceC22625j0);

    /* JADX INFO: renamed from: j */
    public final void m102693j(AbstractC31558o1 abstractC31558o1) {
        this.f136030f = abstractC31558o1;
        Iterator it = this.f136025a.iterator();
        while (it.hasNext()) {
            ((InterfaceC32765w) it.next()).mo97193a(this, abstractC31558o1);
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo102694k(InterfaceC32757s interfaceC32757s);

    /* JADX INFO: renamed from: l */
    public final void m102695l(InterfaceC32765w interfaceC32765w) {
        ArrayList arrayList = this.f136025a;
        arrayList.remove(interfaceC32765w);
        if (!arrayList.isEmpty()) {
            m102685b(interfaceC32765w);
            return;
        }
        this.f136029e = null;
        this.f136030f = null;
        this.f136031g = null;
        this.f136026b.clear();
        mo102696m();
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo102696m();

    /* JADX INFO: renamed from: n */
    public final void m102697n(InterfaceC36138e interfaceC36138e) {
        CopyOnWriteArrayList<C36137d> copyOnWriteArrayList = this.f136028d.f136277c;
        for (C36137d c36137d : copyOnWriteArrayList) {
            if (c36137d.f154642a == interfaceC36138e) {
                copyOnWriteArrayList.remove(c36137d);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m102698o(InterfaceC32722a0 interfaceC32722a0) {
        CopyOnWriteArrayList<C32769y> copyOnWriteArrayList = this.f136027c.f136277c;
        for (C32769y c32769y : copyOnWriteArrayList) {
            if (c32769y.f136274b == interfaceC32722a0) {
                copyOnWriteArrayList.remove(c32769y);
            }
        }
    }
}
