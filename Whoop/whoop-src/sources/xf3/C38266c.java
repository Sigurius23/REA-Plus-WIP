package xf3;

import ag3.AbstractC0865a;
import c93.InterfaceC4339a;
import ih0.AbstractC18489d0;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25258m;
import nf3.C26669a;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.error.NoBeanDefFoundException;
import p000.AbstractC11266d;
import p005a3.C0222l0;
import p005a3.C0237p;
import p108e4.AbstractC12682p;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p474s.C31983m2;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import rf3.AbstractC31363b;
import uf3.C34911a;
import v63.AbstractC35744b;
import vf3.C35953c;
import vf3.InterfaceC35951a;

/* JADX INFO: renamed from: xf3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C38266c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC35951a f164058a;

    /* JADX INFO: renamed from: b */
    public final String f164059b;

    /* JADX INFO: renamed from: c */
    public final boolean f164060c;

    /* JADX INFO: renamed from: d */
    public final C26669a f164061d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f164062e;

    /* JADX INFO: renamed from: f */
    public Object f164063f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f164064g;

    /* JADX INFO: renamed from: h */
    public final C25258m f164065h;

    /* JADX INFO: renamed from: i */
    public boolean f164066i;

    public C38266c(InterfaceC35951a scopeQualifier, String str, boolean z4, C26669a c26669a) {
        AbstractC22676k.m65750j(scopeQualifier, "scopeQualifier");
        this.f164058a = scopeQualifier;
        this.f164059b = str;
        this.f164060c = z4;
        this.f164061d = c26669a;
        this.f164062e = new ArrayList();
        this.f164064g = new ArrayList();
        this.f164065h = new C25258m();
    }

    /* JADX INFO: renamed from: a */
    public final Object m122602a(InterfaceC4339a interfaceC4339a, InterfaceC21461d clazz, InterfaceC35951a interfaceC35951a) {
        AbstractC22676k.m65750j(clazz, "clazz");
        C26669a c26669a = this.f164061d;
        if (!c26669a.f106048c.m92137D(1)) {
            return m122605d(interfaceC4339a, clazz, interfaceC35951a);
        }
        String str = "";
        if (interfaceC35951a != null) {
            String str2 = " with qualifier '" + interfaceC35951a + '\'';
            if (str2 != null) {
                str = str2;
            }
        }
        c26669a.f106048c.m92139r("+- '" + AbstractC0865a.m2111a(clazz) + '\'' + str);
        C23465k c23465kM113234g = AbstractC35744b.m113234g(new C38264a(this, interfaceC35951a, clazz, interfaceC4339a));
        Object obj = c23465kM113234g.f92937w;
        double dDoubleValue = ((Number) c23465kM113234g.f92938x).doubleValue();
        c26669a.f106048c.m92139r("|- '" + AbstractC0865a.m2111a(clazz) + "' in " + dDoubleValue + " ms");
        return obj;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: b */
    public final ArrayList m122603b(InterfaceC21461d clazz) {
        AbstractC22676k.m65750j(clazz, "clazz");
        C26669a c26669a = this.f164061d;
        C0237p c0237p = new C0237p(c26669a, this, (C34911a) null);
        C31983m2 c31983m2 = c26669a.f106047b;
        c31983m2.getClass();
        Collection collectionValues = ((ConcurrentHashMap) c31983m2.f132769x).values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (AbstractC22676k.m65745e(((AbstractC31363b) obj).f129023a.f124470a, ((C38266c) c0237p.f813y).f164058a)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            AbstractC31363b abstractC31363b = (AbstractC31363b) obj2;
            if (AbstractC22676k.m65745e(abstractC31363b.f129023a.f124471b, clazz) || abstractC31363b.f129023a.f124475f.contains(clazz)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((AbstractC31363b) it.next()).mo96459b(c0237p));
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = this.f164062e.iterator();
        while (it3.hasNext()) {
            AbstractC25265s.m74141p0(arrayList4, ((C38266c) it3.next()).m122603b(clazz));
        }
        return AbstractC25265s.m74129g1(arrayList3, arrayList4);
    }

    /* JADX INFO: renamed from: c */
    public final Object m122604c(InterfaceC4339a interfaceC4339a, InterfaceC21461d clazz, InterfaceC35951a interfaceC35951a) {
        C26669a c26669a = this.f164061d;
        AbstractC22676k.m65750j(clazz, "clazz");
        try {
            return m122602a(interfaceC4339a, clazz, interfaceC35951a);
        } catch (ClosedScopeException unused) {
            c26669a.f106048c.m92139r("|- Scope closed - no instance found for " + AbstractC0865a.m2111a(clazz) + " on scope " + this);
            return null;
        } catch (NoBeanDefFoundException unused2) {
            c26669a.f106048c.m92139r("|- No instance found for " + AbstractC0865a.m2111a(clazz) + " on scope " + this);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final Object m122605d(InterfaceC4339a interfaceC4339a, InterfaceC21461d clazz, InterfaceC35951a interfaceC35951a) throws ClosedScopeException, NoBeanDefFoundException {
        if (this.f164066i) {
            String msg = "Scope '" + this.f164059b + "' is closed";
            AbstractC22676k.m65750j(msg, "msg");
            throw new ClosedScopeException(msg);
        }
        Object objM122604c = null;
        C34911a c34911a = interfaceC4339a == null ? null : (C34911a) interfaceC4339a.invoke();
        C25258m c25258m = this.f164065h;
        C26669a c26669a = this.f164061d;
        if (c34911a != null) {
            c26669a.f106048c.m92138J(new C0222l0(c34911a, 21));
            c25258m.addFirst(c34911a);
        }
        C0237p c0237p = new C0237p(c26669a, this, c34911a);
        C31983m2 c31983m2 = c26669a.f106047b;
        c31983m2.getClass();
        AbstractC22676k.m65750j(clazz, "clazz");
        InterfaceC35951a scopeQualifier = this.f164058a;
        AbstractC22676k.m65750j(scopeQualifier, "scopeQualifier");
        AbstractC31363b abstractC31363b = (AbstractC31363b) ((ConcurrentHashMap) c31983m2.f132769x).get(AbstractC21598x.m60669Y(clazz, interfaceC35951a, scopeQualifier));
        Object objMo96459b = abstractC31363b == null ? null : abstractC31363b.mo96459b(c0237p);
        if (objMo96459b == null) {
            c26669a.f106048c.m92138J(new C38265b(clazz, interfaceC35951a, 0));
            C34911a c34911a2 = (C34911a) c25258m.m74017g();
            objMo96459b = c34911a2 == null ? null : c34911a2.m110111b(clazz);
            if (objMo96459b == null) {
                c26669a.f106048c.m92138J(new C38265b(clazz, interfaceC35951a, 1));
                Object obj = this.f164063f;
                objMo96459b = (obj != null && clazz.isInstance(obj)) ? this.f164063f : null;
                if (objMo96459b == null) {
                    c26669a.f106048c.m92138J(new C38265b(clazz, interfaceC35951a, 2));
                    Iterator it = this.f164062e.iterator();
                    while (it.hasNext() && (objM122604c = ((C38266c) it.next()).m122604c(interfaceC4339a, clazz, interfaceC35951a)) == null) {
                    }
                    objMo96459b = objM122604c;
                    if (objMo96459b == null) {
                        c25258m.clear();
                        AbstractC30060g abstractC30060g = c26669a.f106048c;
                        abstractC30060g.getClass();
                        AbstractC18489d0.m53382w(1, "lvl");
                        if (abstractC30060g.m92137D(1) && AbstractC12682p.m35482b(4, 1) <= 0) {
                            abstractC30060g.mo48820I(1, "| clear parameter stack");
                        }
                        String str = "";
                        if (interfaceC35951a != null) {
                            String str2 = " & qualifier:'" + interfaceC35951a + '\'';
                            if (str2 != null) {
                                str = str2;
                            }
                        }
                        String msg2 = "|- No definition found for class:'" + AbstractC0865a.m2111a(clazz) + '\'' + str + ". Check your definitions!";
                        AbstractC22676k.m65750j(msg2, "msg");
                        throw new NoBeanDefFoundException(msg2);
                    }
                }
            }
        }
        if (c34911a != null) {
            AbstractC30060g abstractC30060g2 = c26669a.f106048c;
            abstractC30060g2.getClass();
            AbstractC18489d0.m53382w(1, "lvl");
            if (abstractC30060g2.m92137D(1) && AbstractC12682p.m35482b(4, 1) <= 0) {
                abstractC30060g2.mo48820I(1, "| remove parameters from stack");
            }
            c25258m.m74024q();
        }
        return objMo96459b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38266c)) {
            return false;
        }
        C38266c c38266c = (C38266c) obj;
        return AbstractC22676k.m65745e(this.f164058a, c38266c.f164058a) && this.f164059b.equals(c38266c.f164059b) && this.f164060c == c38266c.f164060c && this.f164061d.equals(c38266c.f164061d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(((C35953c) this.f164058a).f153107a.hashCode() * 31, 31, this.f164059b);
        boolean z4 = this.f164060c;
        ?? r10 = z4;
        if (z4) {
            r10 = 1;
        }
        return this.f164061d.hashCode() + ((iM30450d + r10) * 31);
    }

    public final String toString() {
        return AbstractC25012a.m73376i(this.f164059b, "']", new StringBuilder("['"));
    }
}
