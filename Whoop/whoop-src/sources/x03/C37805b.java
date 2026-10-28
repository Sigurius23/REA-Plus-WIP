package x03;

import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import java.util.Iterator;
import m83.AbstractC25265s;
import p320m5.C25067k;
import p329n0.C26061n;
import p329n0.C26062o;
import p329n0.C26068u;
import p329n0.InterfaceC26054g;
import p390p1.AbstractC28683x;
import p390p1.C28612f0;
import p390p1.C28633k1;
import p715kotlin.jvm.internal.AbstractC22676k;
import xb3.AbstractC38176k;
import xb3.C38184s;

/* JADX INFO: renamed from: x03.b */
/* JADX INFO: loaded from: classes11.dex */
public final class C37805b {

    /* JADX INFO: renamed from: a */
    public final C26068u f161917a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4351m f161918b;

    /* JADX INFO: renamed from: c */
    public final C28633k1 f161919c;

    /* JADX INFO: renamed from: d */
    public final C28612f0 f161920d;

    public C37805b(C26068u lazyListState, InterfaceC4351m snapOffsetForItem) {
        AbstractC22676k.m65750j(lazyListState, "lazyListState");
        AbstractC22676k.m65750j(snapOffsetForItem, "snapOffsetForItem");
        this.f161917a = lazyListState;
        this.f161918b = snapOffsetForItem;
        this.f161919c = AbstractC28683x.m87272z(0);
        this.f161920d = AbstractC28683x.m87264r(new C25067k(this, 14));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: a */
    public final boolean m121318a() {
        C26068u c26068u = this.f161917a;
        InterfaceC26054g interfaceC26054g = (InterfaceC26054g) AbstractC25265s.m74114R0(c26068u.m77565h().f103177k);
        if (interfaceC26054g == null) {
            return false;
        }
        C26062o c26062o = (C26062o) interfaceC26054g;
        return c26062o.f103184a < c26068u.m77565h().f103180n - 1 || c26062o.f103198o + c26062o.f103199p > this.f161917a.m77565h().f103179m - ((Number) this.f161919c.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: b */
    public final boolean m121319b() {
        InterfaceC26054g interfaceC26054g = (InterfaceC26054g) AbstractC25265s.m74100H0(this.f161917a.m77565h().f103177k);
        if (interfaceC26054g == null) {
            return false;
        }
        C26062o c26062o = (C26062o) interfaceC26054g;
        return c26062o.f103184a > 0 || c26062o.f103198o < 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m121320c(int i13) {
        Object objInvoke;
        C38184s c38184sM122272A = AbstractC38176k.m122272A(AbstractC25265s.m74145r0((Iterable) this.f161917a.m77565h().f103177k), C37804a.f161916w);
        Iterator it = c38184sM122272A.f163498a.iterator();
        do {
            if (!it.hasNext()) {
                objInvoke = null;
                break;
            }
            objInvoke = c38184sM122272A.f163499b.invoke(it.next());
        } while (((C37806c) objInvoke).m121323a() != i13);
        C37806c c37806c = (C37806c) objInvoke;
        InterfaceC4351m interfaceC4351m = this.f161918b;
        if (c37806c != null) {
            return ((C26062o) c37806c.f161921a).f103198o - ((Number) interfaceC4351m.invoke(this, c37806c)).intValue();
        }
        C37806c c37806cM121322e = m121322e();
        if (c37806cM121322e == null) {
            return 0;
        }
        return (((C26062o) c37806cM121322e.f161921a).f103198o + AbstractC12889b.m36258X(m121321d() * (i13 - c37806cM121322e.m121323a()))) - ((Number) interfaceC4351m.invoke(this, c37806cM121322e)).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: d */
    public final float m121321d() {
        Object next;
        C26068u c26068u = this.f161917a;
        C26061n c26061nM77565h = c26068u.m77565h();
        if (c26061nM77565h.f103177k.isEmpty()) {
            return -1.0f;
        }
        ?? r10 = c26061nM77565h.f103177k;
        Iterable iterable = (Iterable) r10;
        Iterator it = iterable.iterator();
        Object next2 = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int i13 = ((C26062o) ((InterfaceC26054g) next)).f103198o;
                do {
                    Object next3 = it.next();
                    int i14 = ((C26062o) ((InterfaceC26054g) next3)).f103198o;
                    if (i13 > i14) {
                        next = next3;
                        i13 = i14;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        InterfaceC26054g interfaceC26054g = (InterfaceC26054g) next;
        if (interfaceC26054g == null) {
            return -1.0f;
        }
        Iterator it3 = iterable.iterator();
        if (it3.hasNext()) {
            next2 = it3.next();
            if (it3.hasNext()) {
                C26062o c26062o = (C26062o) ((InterfaceC26054g) next2);
                int i15 = c26062o.f103198o + c26062o.f103199p;
                do {
                    Object next4 = it3.next();
                    C26062o c26062o2 = (C26062o) ((InterfaceC26054g) next4);
                    int i16 = c26062o2.f103198o + c26062o2.f103199p;
                    if (i15 < i16) {
                        next2 = next4;
                        i15 = i16;
                    }
                } while (it3.hasNext());
            }
        }
        InterfaceC26054g interfaceC26054g2 = (InterfaceC26054g) next2;
        if (interfaceC26054g2 == null) {
            return -1.0f;
        }
        C26062o c26062o3 = (C26062o) interfaceC26054g;
        C26062o c26062o4 = (C26062o) interfaceC26054g2;
        int iMax = Math.max(c26062o3.f103198o + c26062o3.f103199p, c26062o4.f103198o + c26062o4.f103199p) - Math.min(c26062o3.f103198o, c26062o4.f103198o);
        if (iMax == 0) {
            return -1.0f;
        }
        C26061n c26061nM77565h2 = c26068u.m77565h();
        int i17 = 0;
        if (c26061nM77565h2.f103177k.size() >= 2) {
            ?? r14 = c26061nM77565h2.f103177k;
            C26062o c26062o5 = (C26062o) ((InterfaceC26054g) r14.get(0));
            i17 = ((C26062o) ((InterfaceC26054g) r14.get(1))).f103198o - (c26062o5.f103199p + c26062o5.f103198o);
        }
        return (iMax + i17) / r10.size();
    }

    /* JADX INFO: renamed from: e */
    public final C37806c m121322e() {
        return (C37806c) this.f161920d.getValue();
    }
}
