package p031b9;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p047c9.C4317h;
import p047c9.C4323n;
import p171g9.C15586c;
import p171g9.C15587d;
import p284ko.InterfaceC22625j0;
import p299l9.AbstractC23481a;
import p299l9.C23489c1;
import p299l9.C23503h0;
import p299l9.C23529u;
import p299l9.C23535x;
import p299l9.InterfaceC23482a0;
import p299l9.InterfaceC23491d0;
import p309lo.AbstractC24567y;
import p408q.C29662f;
import p465rm.AbstractC31558o1;
import p465rm.C31528e1;
import p465rm.C31568s0;
import p465rm.C31570t0;
import p465rm.C31581z;
import p516u8.AbstractC34609o0;
import p556vm.C36137d;
import p607x8.AbstractC38065t;
import p607x8.C38063r;
import p674z8.InterfaceC40178n;
import sm.C32711d;
import sm.C32713f;
import sn.AbstractC32721a;
import sn.C32747n;
import sn.C32753q;
import sn.C32762u0;
import sn.C32769y;
import sn.C32770z;
import sn.InterfaceC32757s;
import sn.InterfaceC32765w;

/* JADX INFO: renamed from: b9.b1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2819b1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11028a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f11029b;

    /* JADX INFO: renamed from: c */
    public final IdentityHashMap f11030c;

    /* JADX INFO: renamed from: d */
    public final HashMap f11031d;

    /* JADX INFO: renamed from: e */
    public final HashMap f11032e;

    /* JADX INFO: renamed from: f */
    public final HashSet f11033f;

    /* JADX INFO: renamed from: g */
    public boolean f11034g;

    /* JADX INFO: renamed from: h */
    public final Object f11035h;

    /* JADX INFO: renamed from: i */
    public final Handler.Callback f11036i;

    /* JADX INFO: renamed from: j */
    public final Object f11037j;

    /* JADX INFO: renamed from: k */
    public final Object f11038k;

    /* JADX INFO: renamed from: l */
    public Object f11039l;

    /* JADX INFO: renamed from: m */
    public Object f11040m;

    public C2819b1(C31581z c31581z, C32711d c32711d, Handler handler, C32713f c32713f) {
        this.f11028a = 1;
        this.f11035h = c32713f;
        this.f11036i = c31581z;
        this.f11039l = new C32762u0();
        this.f11030c = new IdentityHashMap();
        this.f11031d = new HashMap();
        this.f11029b = new ArrayList();
        C32770z c32770z = new C32770z(0);
        this.f11037j = c32770z;
        C32770z c32770z2 = new C32770z(1);
        this.f11038k = c32770z2;
        this.f11032e = new HashMap();
        this.f11033f = new HashSet();
        c32711d.getClass();
        C32769y c32769y = new C32769y();
        c32769y.f136273a = handler;
        c32769y.f136274b = c32711d;
        c32770z.f136277c.add(c32769y);
        C36137d c36137d = new C36137d();
        c36137d.f154642a = c32711d;
        c32770z2.f136277c.add(c36137d);
    }

    /* JADX INFO: renamed from: a */
    public AbstractC31558o1 m8023a(int i13, ArrayList arrayList, C32762u0 c32762u0) {
        if (!arrayList.isEmpty()) {
            this.f11039l = c32762u0;
            for (int i14 = i13; i14 < arrayList.size() + i13; i14++) {
                C31570t0 c31570t0 = (C31570t0) arrayList.get(i14 - i13);
                ArrayList arrayList2 = this.f11029b;
                if (i14 > 0) {
                    C31570t0 c31570t1 = (C31570t0) arrayList2.get(i14 - 1);
                    c31570t0.f130373d = c31570t1.f130370a.f136200o.f136120x.mo97137o() + c31570t1.f130373d;
                    c31570t0.f130374e = false;
                    c31570t0.f130372c.clear();
                } else {
                    c31570t0.f130373d = 0;
                    c31570t0.f130374e = false;
                    c31570t0.f130372c.clear();
                }
                int iMo97137o = c31570t0.f130370a.f136200o.f136120x.mo97137o();
                for (int i15 = i14; i15 < arrayList2.size(); i15++) {
                    ((C31570t0) arrayList2.get(i15)).f130373d += iMo97137o;
                }
                arrayList2.add(i14, c31570t0);
                this.f11031d.put(c31570t0.f130371b, c31570t0);
                if (this.f11034g) {
                    m8031i(c31570t0);
                    if (this.f11030c.isEmpty()) {
                        this.f11033f.add(c31570t0);
                    } else {
                        C31568s0 c31568s0 = (C31568s0) this.f11032e.get(c31570t0);
                        if (c31568s0 != null) {
                            c31568s0.f130365a.m102685b(c31568s0.f130366b);
                        }
                    }
                }
            }
        }
        return m8025c();
    }

    /* JADX INFO: renamed from: b */
    public AbstractC34609o0 m8024b(int i13, ArrayList arrayList, C23489c1 c23489c1) {
        if (!arrayList.isEmpty()) {
            this.f11039l = c23489c1;
            for (int i14 = i13; i14 < arrayList.size() + i13; i14++) {
                C2816a1 c2816a1 = (C2816a1) arrayList.get(i14 - i13);
                ArrayList arrayList2 = this.f11029b;
                if (i14 > 0) {
                    C2816a1 c2816a2 = (C2816a1) arrayList2.get(i14 - 1);
                    c2816a1.f11018d = c2816a2.f11015a.f93199o.f93108b.mo8139o() + c2816a2.f11018d;
                    c2816a1.f11019e = false;
                    c2816a1.f11017c.clear();
                } else {
                    c2816a1.f11018d = 0;
                    c2816a1.f11019e = false;
                    c2816a1.f11017c.clear();
                }
                int iMo8139o = c2816a1.f11015a.f93199o.f93108b.mo8139o();
                for (int i15 = i14; i15 < arrayList2.size(); i15++) {
                    ((C2816a1) arrayList2.get(i15)).f11018d += iMo8139o;
                }
                arrayList2.add(i14, c2816a1);
                this.f11031d.put(c2816a1.f11016b, c2816a1);
                if (this.f11034g) {
                    m8030h(c2816a1);
                    if (this.f11030c.isEmpty()) {
                        this.f11033f.add(c2816a1);
                    } else {
                        C2878z0 c2878z0 = (C2878z0) this.f11032e.get(c2816a1);
                        if (c2878z0 != null) {
                            c2878z0.f11436a.m68041b(c2878z0.f11437b);
                        }
                    }
                }
            }
        }
        return m8026d();
    }

    /* JADX INFO: renamed from: c */
    public AbstractC31558o1 m8025c() {
        ArrayList arrayList = this.f11029b;
        if (arrayList.isEmpty()) {
            return AbstractC31558o1.f130335w;
        }
        int iMo97137o = 0;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            C31570t0 c31570t0 = (C31570t0) arrayList.get(i13);
            c31570t0.f130373d = iMo97137o;
            iMo97137o += c31570t0.f130370a.f136200o.f136120x.mo97137o();
        }
        return new C31528e1(arrayList, (C32762u0) this.f11039l);
    }

    /* JADX INFO: renamed from: d */
    public AbstractC34609o0 m8026d() {
        ArrayList arrayList = this.f11029b;
        if (arrayList.isEmpty()) {
            return AbstractC34609o0.f145755a;
        }
        int iMo8139o = 0;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            C2816a1 c2816a1 = (C2816a1) arrayList.get(i13);
            c2816a1.f11018d = iMo8139o;
            iMo8139o += c2816a1.f11015a.f93199o.f93108b.mo8139o();
        }
        return new C2837h1(arrayList, (C23489c1) this.f11039l);
    }

    /* JADX INFO: renamed from: e */
    public final void m8027e() {
        switch (this.f11028a) {
            case 0:
                Iterator it = this.f11033f.iterator();
                while (it.hasNext()) {
                    C2816a1 c2816a1 = (C2816a1) it.next();
                    if (c2816a1.f11017c.isEmpty()) {
                        C2878z0 c2878z0 = (C2878z0) this.f11032e.get(c2816a1);
                        if (c2878z0 != null) {
                            c2878z0.f11436a.m68041b(c2878z0.f11437b);
                        }
                        it.remove();
                    }
                }
                break;
            default:
                Iterator it3 = this.f11033f.iterator();
                while (it3.hasNext()) {
                    C31570t0 c31570t0 = (C31570t0) it3.next();
                    if (c31570t0.f130372c.isEmpty()) {
                        C31568s0 c31568s0 = (C31568s0) this.f11032e.get(c31570t0);
                        if (c31568s0 != null) {
                            c31568s0.f130365a.m102685b(c31568s0.f130366b);
                        }
                        it3.remove();
                    }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m8028f(C2816a1 c2816a1) {
        if (c2816a1.f11019e && c2816a1.f11017c.isEmpty()) {
            C2878z0 c2878z0 = (C2878z0) this.f11032e.remove(c2816a1);
            c2878z0.getClass();
            C2876y0 c2876y0 = c2878z0.f11438c;
            AbstractC23481a abstractC23481a = c2878z0.f11436a;
            abstractC23481a.m68049n(c2878z0.f11437b);
            abstractC23481a.m68051q(c2876y0);
            abstractC23481a.m68050p(c2876y0);
            this.f11033f.remove(c2816a1);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m8029g(C31570t0 c31570t0) {
        if (c31570t0.f130374e && c31570t0.f130372c.isEmpty()) {
            C31568s0 c31568s0 = (C31568s0) this.f11032e.remove(c31570t0);
            c31568s0.getClass();
            C29662f c29662f = c31568s0.f130367c;
            AbstractC32721a abstractC32721a = c31568s0.f130365a;
            abstractC32721a.m102695l(c31568s0.f130366b);
            abstractC32721a.m102698o(c29662f);
            abstractC32721a.m102697n(c29662f);
            this.f11033f.remove(c31570t0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [b9.u0, l9.d0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: h */
    public void m8030h(C2816a1 c2816a1) {
        C23535x c23535x = c2816a1.f11015a;
        ?? r10 = new InterfaceC23491d0() { // from class: b9.u0
            @Override // p299l9.InterfaceC23491d0
            /* JADX INFO: renamed from: a */
            public final void mo8284a(AbstractC23481a abstractC23481a, AbstractC34609o0 abstractC34609o0) {
                C38063r c38063r = ((C2848l0) this.f11404a.f11036i).f11261H;
                c38063r.m121880d(2);
                c38063r.m121881e(22);
            }
        };
        C2876y0 c2876y0 = new C2876y0(this, c2816a1);
        this.f11032e.put(c2816a1, new C2878z0(c23535x, r10, c2876y0));
        int i13 = AbstractC38065t.f163031a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(looperMyLooper, null);
        c23535x.getClass();
        C15587d c15587d = c23535x.f92961c;
        c15587d.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = c15587d.f58539c;
        C23503h0 c23503h0 = new C23503h0();
        c23503h0.f93034a = handler;
        c23503h0.f93035b = c2876y0;
        copyOnWriteArrayList.add(c23503h0);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        new Handler(looperMyLooper2, null);
        C15587d c15587d2 = c23535x.f92962d;
        c15587d2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = c15587d2.f58539c;
        C15586c c15586c = new C15586c();
        c15586c.f58536a = c2876y0;
        copyOnWriteArrayList2.add(c15586c);
        c23535x.m68047j(r10, (InterfaceC40178n) this.f11040m, (C4323n) this.f11035h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [rm.r0, sn.w] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: i */
    public void m8031i(C31570t0 c31570t0) {
        C32753q c32753q = c31570t0.f130370a;
        ?? r10 = new InterfaceC32765w() { // from class: rm.r0
            @Override // sn.InterfaceC32765w
            /* JADX INFO: renamed from: a */
            public final void mo97193a(AbstractC32721a abstractC32721a, AbstractC31558o1 abstractC31558o1) {
                ((C31581z) this.f130360a.f11036i).f130483H.m71650c(22);
            }
        };
        C29662f c29662f = new C29662f(this, c31570t0);
        this.f11032e.put(c31570t0, new C31568s0(c32753q, r10, c29662f));
        int i13 = AbstractC24567y.f95875a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(looperMyLooper, null);
        c32753q.getClass();
        C32770z c32770z = c32753q.f136027c;
        c32770z.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = c32770z.f136277c;
        C32769y c32769y = new C32769y();
        c32769y.f136273a = handler;
        c32769y.f136274b = c29662f;
        copyOnWriteArrayList.add(c32769y);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        new Handler(looperMyLooper2, null);
        C32770z c32770z2 = c32753q.f136028d;
        c32770z2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = c32770z2.f136277c;
        C36137d c36137d = new C36137d();
        c36137d.f154642a = c29662f;
        copyOnWriteArrayList2.add(c36137d);
        c32753q.m102691h(r10, (InterfaceC22625j0) this.f11040m, (C32713f) this.f11035h);
    }

    /* JADX INFO: renamed from: j */
    public void m8032j(InterfaceC23482a0 interfaceC23482a0) {
        IdentityHashMap identityHashMap = this.f11030c;
        C2816a1 c2816a1 = (C2816a1) identityHashMap.remove(interfaceC23482a0);
        c2816a1.getClass();
        c2816a1.f11015a.mo36148m(interfaceC23482a0);
        c2816a1.f11017c.remove(((C23529u) interfaceC23482a0).f93163w);
        if (!identityHashMap.isEmpty()) {
            m8027e();
        }
        m8028f(c2816a1);
    }

    /* JADX INFO: renamed from: k */
    public void m8033k(InterfaceC32757s interfaceC32757s) {
        IdentityHashMap identityHashMap = this.f11030c;
        C31570t0 c31570t0 = (C31570t0) identityHashMap.remove(interfaceC32757s);
        c31570t0.getClass();
        c31570t0.f130370a.mo102694k(interfaceC32757s);
        c31570t0.f130372c.remove(((C32747n) interfaceC32757s).f136174w);
        if (!identityHashMap.isEmpty()) {
            m8027e();
        }
        m8029g(c31570t0);
    }

    /* JADX INFO: renamed from: l */
    public final void m8034l(int i13, int i14) {
        switch (this.f11028a) {
            case 0:
                for (int i15 = i14 - 1; i15 >= i13; i15--) {
                    ArrayList arrayList = this.f11029b;
                    C2816a1 c2816a1 = (C2816a1) arrayList.remove(i15);
                    this.f11031d.remove(c2816a1.f11016b);
                    int i16 = -c2816a1.f11015a.f93199o.f93108b.mo8139o();
                    for (int i17 = i15; i17 < arrayList.size(); i17++) {
                        ((C2816a1) arrayList.get(i17)).f11018d += i16;
                    }
                    c2816a1.f11019e = true;
                    if (this.f11034g) {
                        m8028f(c2816a1);
                    }
                }
                break;
            default:
                for (int i18 = i14 - 1; i18 >= i13; i18--) {
                    ArrayList arrayList2 = this.f11029b;
                    C31570t0 c31570t0 = (C31570t0) arrayList2.remove(i18);
                    this.f11031d.remove(c31570t0.f130371b);
                    int i19 = -c31570t0.f130370a.f136200o.f136120x.mo97137o();
                    for (int i24 = i18; i24 < arrayList2.size(); i24++) {
                        ((C31570t0) arrayList2.get(i24)).f130373d += i19;
                    }
                    c31570t0.f130374e = true;
                    if (this.f11034g) {
                        m8029g(c31570t0);
                    }
                }
                break;
        }
    }

    public C2819b1(C2848l0 c2848l0, C4317h c4317h, C38063r c38063r, C4323n c4323n) {
        this.f11028a = 0;
        this.f11035h = c4323n;
        this.f11036i = c2848l0;
        this.f11039l = new C23489c1();
        this.f11030c = new IdentityHashMap();
        this.f11031d = new HashMap();
        this.f11029b = new ArrayList();
        this.f11037j = c4317h;
        this.f11038k = c38063r;
        this.f11032e = new HashMap();
        this.f11033f = new HashSet();
    }
}
