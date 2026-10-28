package q93;

import cb3.AbstractC4393e;
import cb3.C4392d;
import ce3.C4515p;
import com.squareup.wire.AbstractC5583n;
import dc3.C11934s;
import e93.AbstractC12889b;
import fa3.C14328u;
import io.sentry.config.AbstractC20301a;
import j93.InterfaceC21493z;
import ja3.C21513i;
import ja3.C21519o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import jb3.C21548h;
import jb3.C21560t;
import kb3.C22336e;
import kb3.C22337f;
import kb3.C22338g;
import kb3.C22340i;
import kb3.C22342k;
import l83.C23465k;
import lb3.AbstractC23763c0;
import lb3.AbstractC23812y0;
import lb3.C23758a1;
import lb3.C23813z;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import m83.C25271y;
import o93.AbstractC27736h;
import o93.AbstractC27741m;
import p048ce.AbstractC4482w;
import p048ce.C4463d;
import p098dt.AbstractC12350b;
import p108e4.AbstractC12667a;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22693x;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22711n;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import pf.AbstractC29125c;
import q30.C29934u0;
import qa3.C30122c0;
import r80.AbstractC31061c;
import r93.AbstractC31146o;
import r93.AbstractC31150q;
import r93.AbstractC31152r;
import r93.AbstractC31166y;
import r93.EnumC31106a0;
import r93.EnumC31120f;
import r93.InterfaceC31107a1;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import r93.InterfaceC31135k;
import r93.InterfaceC31160v;
import r93.InterfaceC31162w;
import s93.AbstractC32306h;
import s93.InterfaceC32307i;
import t93.AbstractC33669e;
import t93.InterfaceC33666b;
import t93.InterfaceC33668d;
import u93.AbstractC34710x;
import u93.AbstractC34711x0;
import u93.C34673e0;
import u93.C34682j;
import u93.C34686l;
import u93.C34697q0;
import u93.C34708w;
import ub3.C34754h;
import va3.C35845c;
import va3.C35847e;
import va3.C35848f;
import va3.C35850h;
import wb3.AbstractC37056f;
import ya3.AbstractC39363f;
import ya3.C39371n;
import z93.EnumC40212c;

/* JADX INFO: renamed from: q93.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C30092p implements InterfaceC33666b, InterfaceC33668d {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ InterfaceC21493z[] f122797h;

    /* JADX INFO: renamed from: a */
    public final C34673e0 f122798a;

    /* JADX INFO: renamed from: b */
    public final C22340i f122799b;

    /* JADX INFO: renamed from: c */
    public final AbstractC23763c0 f122800c;

    /* JADX INFO: renamed from: d */
    public final C22340i f122801d;

    /* JADX INFO: renamed from: e */
    public final C22336e f122802e;

    /* JADX INFO: renamed from: f */
    public final C22340i f122803f;

    /* JADX INFO: renamed from: g */
    public final C22336e f122804g;

    static {
        C22693x c22693x = new C22693x(C30092p.class, "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f122797h = new InterfaceC21493z[]{c22673i0.property1(c22693x), AbstractC31061c.m95632h(C30092p.class, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0, c22673i0), AbstractC31061c.m95632h(C30092p.class, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0, c22673i0)};
    }

    public C30092p(C34673e0 c34673e0, C22342k c22342k, C14328u c14328u) {
        this.f122798a = c34673e0;
        this.f122799b = new C22340i(c22342k, c14328u);
        C34686l c34686l = new C34686l(new C30091o(c34673e0, new C35847e("java.io")), C35850h.m113814e("Serializable"), EnumC31106a0.f128307E, EnumC31120f.f128329x, AbstractC37056f.m118958J(new C23813z(c22342k, new C30087k(this, 1))), c22342k);
        c34686l.m109576X(C22711n.f89378b, C25235a0.f99113w, null);
        this.f122800c = c34686l.mo60594i();
        this.f122801d = new C22340i(c22342k, new C4515p(this, c22342k, false, 7));
        this.f122802e = new C22336e(c22342k, new ConcurrentHashMap(3, 1.0f, 2), new C22337f(), 0);
        this.f122803f = new C22340i(c22342k, new C30087k(this, 0));
        this.f122804g = c22342k.m64223b(new C11934s(this, 13));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x0204  */
    /* JADX WARN: Code duplicated, block: B:69:0x0206  */
    /* JADX WARN: Code duplicated, block: B:71:0x0222  */
    @Override // t93.InterfaceC33666b
    /* JADX INFO: renamed from: a */
    public final Collection mo92216a(C35850h name, InterfaceC31117e classDescriptor) throws Throwable {
        List listM34570S;
        C34697q0 c34697q0;
        InterfaceC31135k interfaceC31135kMo60581g;
        boolean zBooleanValue;
        C34697q0 c34697q1;
        InterfaceC32307i interfaceC32307i;
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(classDescriptor, "classDescriptor");
        boolean zEquals = name.equals(C30077a.f122754b);
        InterfaceC21493z[] interfaceC21493zArr = f122797h;
        int i13 = 1;
        List<C34697q0> list = C25271y.f99162w;
        if (zEquals && (classDescriptor instanceof C21548h) && (AbstractC27736h.m83810b(classDescriptor, AbstractC27741m.f111855g) || AbstractC27736h.m83811s(classDescriptor) != null)) {
            C21548h c21548h = (C21548h) classDescriptor;
            List list2 = c21548h.f82629E.f123283Q;
            AbstractC22676k.m65749i(list2, "getFunctionList(...)");
            List list3 = list2;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    if (AbstractC12889b.m36240F(c21548h.f82636L.f65761b, ((C30122c0) it.next()).f123037F).equals(C30077a.f122754b)) {
                        return list;
                    }
                }
            }
            InterfaceC31160v interfaceC31160vMo78657l0 = ((C34697q0) AbstractC25265s.m74140o1(((AbstractC23763c0) AbstractC29125c.m88494C(this.f122801d, interfaceC21493zArr[1])).mo64128u().getContributedFunctions(name, EnumC40212c.f173637w))).mo78657l0();
            interfaceC31160vMo78657l0.mo68177l(c21548h);
            interfaceC31160vMo78657l0.mo68184w(AbstractC31150q.f128353e);
            interfaceC31160vMo78657l0.mo68178n(c21548h.mo60594i());
            interfaceC31160vMo78657l0.mo68181t(c21548h.mo95864q0());
            InterfaceC31162w interfaceC31162wBuild = interfaceC31160vMo78657l0.build();
            AbstractC22676k.m65747g(interfaceC31162wBuild);
            return AbstractC37056f.m118958J((C34697q0) interfaceC31162wBuild);
        }
        m92222g().getClass();
        C21513i c21513iM92221f = m92221f(classDescriptor);
        if (c21513iM92221f == null) {
            c34697q0 = null;
        } else {
            C35847e c35847eM13809g = AbstractC4393e.m13809g(c21513iM92221f);
            C30078b c30078b = C30078b.f122755f;
            C30078b builtIns = AbstractC4482w.m13978N();
            AbstractC22676k.m65750j(builtIns, "builtIns");
            InterfaceC31117e interfaceC31117eM92214b = C30081e.m92214b(c35847eM13809g, builtIns);
            boolean z4 = false;
            if (interfaceC31117eM92214b == null) {
                listM34570S = C25235a0.f99113w;
            } else {
                String str = C30080d.f122759a;
                C35847e c35847eM92212h = C30080d.m92212h(AbstractC4393e.m13810h(interfaceC31117eM92214b));
                listM34570S = c35847eM92212h == null ? AbstractC12350b.m34570S(interfaceC31117eM92214b) : AbstractC37056f.m118959K(interfaceC31117eM92214b, builtIns.m83822j(c35847eM92212h));
            }
            Iterable iterable = listM34570S;
            InterfaceC31117e interfaceC31117e = (InterfaceC31117e) AbstractC25265s.m74113Q0(iterable);
            if (interfaceC31117e == null) {
                c34697q0 = null;
            } else {
                int i14 = C34754h.f146410y;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    arrayList.add(AbstractC4393e.m13809g((InterfaceC31117e) it3.next()));
                }
                C34754h c34754h = new C34754h(0);
                c34754h.addAll(arrayList);
                String str2 = C30080d.f122759a;
                boolean zContainsKey = C30080d.f122768j.containsKey(AbstractC39363f.m125524f(classDescriptor));
                C35847e c35847eM13809g2 = AbstractC4393e.m13809g(c21513iM92221f);
                c34697q0 = null;
                C4463d c4463d = new C4463d(8, c21513iM92221f, interfaceC31117e);
                C22336e c22336e = this.f122802e;
                c22336e.getClass();
                Object objInvoke = c22336e.invoke(new C22338g(c35847eM13809g2, c4463d));
                if (objInvoke == null) {
                    C22336e.m64219a(3);
                    throw null;
                }
                InterfaceC22712o interfaceC22712oMo60489K = ((InterfaceC31117e) objInvoke).mo60489K();
                AbstractC22676k.m65749i(interfaceC22712oMo60489K, "getUnsubstitutedMemberScope(...)");
                Collection contributedFunctions = interfaceC22712oMo60489K.getContributedFunctions(name, EnumC40212c.f173637w);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : contributedFunctions) {
                    C34697q0 c34697q2 = (C34697q0) obj;
                    if (c34697q2.getKind() == 1) {
                        AbstractC31152r visibility = c34697q2.getVisibility();
                        visibility.getClass();
                        if (((AbstractC31146o) visibility).f128347a.f128346b && !AbstractC27736h.m83802D(c34697q2)) {
                            Collection collectionMo78673h = c34697q2.mo78673h();
                            if ((collectionMo78673h instanceof Collection) && collectionMo78673h.isEmpty()) {
                                interfaceC31135kMo60581g = c34697q2.mo60581g();
                                AbstractC22676k.m65748h(interfaceC31135kMo60581g, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                                if (C30095s.f122815e.contains(AbstractC12667a.m35446R((InterfaceC31117e) interfaceC31135kMo60581g, AbstractC20301a.m56347o(c34697q2, 3))) ^ zContainsKey) {
                                    zBooleanValue = true;
                                } else {
                                    Boolean boolM100569r = AbstractC32306h.m100569r(AbstractC37056f.m118958J(c34697q2), C30088l.f122790w, new C30089m(this));
                                    AbstractC22676k.m65749i(boolM100569r, "ifAny(...)");
                                    zBooleanValue = boolM100569r.booleanValue();
                                }
                                if (zBooleanValue) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                            } else {
                                Iterator it4 = collectionMo78673h.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        InterfaceC31135k interfaceC31135kMo60581g2 = ((InterfaceC31162w) it4.next()).mo60581g();
                                        AbstractC22676k.m65749i(interfaceC31135kMo60581g2, "getContainingDeclaration(...)");
                                        if (c34754h.contains(AbstractC4393e.m13809g(interfaceC31135kMo60581g2))) {
                                        }
                                    } else {
                                        interfaceC31135kMo60581g = c34697q2.mo60581g();
                                        AbstractC22676k.m65748h(interfaceC31135kMo60581g, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                                        if (C30095s.f122815e.contains(AbstractC12667a.m35446R((InterfaceC31117e) interfaceC31135kMo60581g, AbstractC20301a.m56347o(c34697q2, 3))) ^ zContainsKey) {
                                            zBooleanValue = true;
                                        } else {
                                            Boolean boolM100569r2 = AbstractC32306h.m100569r(AbstractC37056f.m118958J(c34697q2), C30088l.f122790w, new C30089m(this));
                                            AbstractC22676k.m65749i(boolM100569r2, "ifAny(...)");
                                            zBooleanValue = boolM100569r2.booleanValue();
                                        }
                                        if (zBooleanValue) {
                                            z4 = true;
                                        }
                                    }
                                    z4 = false;
                                }
                            }
                        }
                    }
                    if (z4) {
                        arrayList2.add(obj);
                    }
                    z4 = false;
                }
                list = arrayList2;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (C34697q0 c34697q3 : list) {
            InterfaceC31135k interfaceC31135kMo60581g3 = c34697q3.mo60581g();
            AbstractC22676k.m65748h(interfaceC31135kMo60581g3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            InterfaceC31162w interfaceC31162wMo60593d = c34697q3.mo60593d(new C23758a1(AbstractC5583n.m16794u((InterfaceC31117e) interfaceC31135kMo60581g3, classDescriptor)));
            AbstractC22676k.m65748h(interfaceC31162wMo60593d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
            InterfaceC31160v interfaceC31160vMo78657l1 = ((C34697q0) interfaceC31162wMo60593d).mo78657l0();
            interfaceC31160vMo78657l1.mo68177l(classDescriptor);
            interfaceC31160vMo78657l1.mo68181t(classDescriptor.mo95864q0());
            interfaceC31160vMo78657l1.mo68180s();
            InterfaceC31135k interfaceC31135kMo60581g4 = c34697q3.mo60581g();
            AbstractC22676k.m65748h(interfaceC31135kMo60581g4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Object objM100561i = AbstractC32306h.m100561i(AbstractC37056f.m118958J((InterfaceC31117e) interfaceC31135kMo60581g4), new C29934u0(this, 2), new C4392d(AbstractC20301a.m56347o(c34697q3, 3), new C22669g0(), i13));
            AbstractC22676k.m65749i(objM100561i, "dfs(...)");
            int iOrdinal = ((EnumC30090n) objM100561i).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        C35850h name2 = c34697q3.getName();
                        boolean zM65745e = AbstractC22676k.m65745e(name2, AbstractC30093q.f122805a);
                        C22336e c22336e2 = this.f122804g;
                        if (zM65745e) {
                            interfaceC32307i = (InterfaceC32307i) c22336e2.invoke(new C23465k(c34697q3.getName().m113817b(), "first"));
                        } else {
                            if (!AbstractC22676k.m65745e(name2, AbstractC30093q.f122806b)) {
                                throw new IllegalStateException(("Unexpected name: " + c34697q3.getName()).toString());
                            }
                            interfaceC32307i = (InterfaceC32307i) c22336e2.invoke(new C23465k(c34697q3.getName().m113817b(), "last"));
                        }
                        interfaceC31160vMo78657l1.mo68183v(interfaceC32307i);
                    } else if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c34697q1 = c34697q0;
                    } else {
                        interfaceC31160vMo78657l1.mo68183v((InterfaceC32307i) AbstractC29125c.m88494C(this.f122803f, interfaceC21493zArr[2]));
                    }
                }
                InterfaceC31162w interfaceC31162wBuild2 = interfaceC31160vMo78657l1.build();
                AbstractC22676k.m65747g(interfaceC31162wBuild2);
                c34697q1 = (C34697q0) interfaceC31162wBuild2;
            } else if (AbstractC31166y.m95884b(classDescriptor)) {
                c34697q1 = c34697q0;
            } else {
                interfaceC31160vMo78657l1.mo68173g();
                InterfaceC31162w interfaceC31162wBuild3 = interfaceC31160vMo78657l1.build();
                AbstractC22676k.m65747g(interfaceC31162wBuild3);
                c34697q1 = (C34697q0) interfaceC31162wBuild3;
            }
            if (c34697q1 != null) {
                arrayList3.add(c34697q1);
            }
        }
        return arrayList3;
    }

    @Override // t93.InterfaceC33666b
    /* JADX INFO: renamed from: b */
    public final Collection mo92217b(InterfaceC31117e interfaceC31117e) {
        C35848f c35848fM13810h = AbstractC4393e.m13810h(interfaceC31117e);
        LinkedHashSet linkedHashSet = C30095s.f122811a;
        C35848f c35848f = AbstractC27741m.f111855g;
        boolean zEquals = c35848fM13810h.equals(c35848f);
        boolean zIsAssignableFrom = false;
        AbstractC23763c0 abstractC23763c0 = this.f122800c;
        if (!zEquals) {
            HashMap map = AbstractC27741m.f111856g0;
            if (map.get(c35848fM13810h) == null) {
                if (c35848fM13810h.equals(c35848f) || map.get(c35848fM13810h) != null) {
                    zIsAssignableFrom = true;
                } else {
                    String str = C30080d.f122759a;
                    C35845c c35845cM92211g = C30080d.m92211g(c35848fM13810h);
                    if (c35845cM92211g != null) {
                        try {
                            zIsAssignableFrom = Serializable.class.isAssignableFrom(Class.forName(c35845cM92211g.m113773a().f152613a.f152616a));
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                }
                return zIsAssignableFrom ? AbstractC37056f.m118958J(abstractC23763c0) : C25271y.f99162w;
            }
        }
        return AbstractC37056f.m118959K((AbstractC23763c0) AbstractC29125c.m88494C(this.f122801d, f122797h[1]), abstractC23763c0);
    }

    @Override // t93.InterfaceC33666b
    /* JADX INFO: renamed from: c */
    public final Collection mo92218c(InterfaceC31117e interfaceC31117e) {
        if (interfaceC31117e.getKind() == EnumC31120f.f128328w) {
            m92222g().getClass();
            C21513i c21513iM92221f = m92221f(interfaceC31117e);
            if (c21513iM92221f != null) {
                C35847e c35847eM13809g = AbstractC4393e.m13809g(c21513iM92221f);
                C30078b c30078b = C30078b.f122755f;
                InterfaceC31117e interfaceC31117eM92214b = C30081e.m92214b(c35847eM13809g, AbstractC4482w.m13978N());
                if (interfaceC31117eM92214b != null) {
                    C23758a1 c23758a1 = new C23758a1(AbstractC5583n.m16794u(interfaceC31117eM92214b, c21513iM92221f));
                    List list = (List) c21513iM92221f.f82516Q.f82542q.invoke();
                    ArrayList<C34682j> arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        C34682j c34682j = (C34682j) next;
                        C34682j c34682j2 = c34682j;
                        AbstractC31152r visibility = c34682j2.getVisibility();
                        visibility.getClass();
                        if (((AbstractC31146o) visibility).f128347a.f128346b) {
                            Collection constructors = interfaceC31117eM92214b.getConstructors();
                            AbstractC22676k.m65749i(constructors, "getConstructors(...)");
                            Collection collection = constructors;
                            if (!(collection instanceof Collection) || !collection.isEmpty()) {
                                Iterator it3 = collection.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        C34682j c34682j3 = (C34682j) it3.next();
                                        AbstractC22676k.m65747g(c34682j3);
                                        if (C39371n.m125557j(c34682j3, c34682j.mo60593d(c23758a1)) == 1) {
                                        }
                                    }
                                }
                            }
                            if (c34682j2.mo78676v().size() == 1) {
                                List listMo78676v = c34682j2.mo78676v();
                                AbstractC22676k.m65749i(listMo78676v, "getValueParameters(...)");
                                InterfaceC31126h interfaceC31126hMo1784d = ((AbstractC34711x0) ((InterfaceC31107a1) AbstractC25265s.m74142p1(listMo78676v))).getType().mo69844i0().mo1784d();
                                if (AbstractC22676k.m65745e(interfaceC31126hMo1784d != null ? AbstractC4393e.m13810h(interfaceC31126hMo1784d) : null, AbstractC4393e.m13810h(interfaceC31117e))) {
                                }
                            }
                            if (!AbstractC27736h.m83802D(c34682j) && !C30095s.f122816f.contains(AbstractC12667a.m35446R(c21513iM92221f, AbstractC20301a.m56347o(c34682j, 3)))) {
                                arrayList.add(next);
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
                    for (C34682j c34682j4 : arrayList) {
                        C34682j c34682j5 = c34682j4;
                        c34682j5.getClass();
                        C34708w c34708wM109631P0 = c34682j5.m109631P0(C23758a1.f94121b);
                        c34708wM109631P0.f146183x = interfaceC31117e;
                        c34708wM109631P0.mo68178n(interfaceC31117e.mo60594i());
                        c34708wM109631P0.f146172O = true;
                        AbstractC23812y0 abstractC23812y0M69821f = c23758a1.m69821f();
                        if (abstractC23812y0M69821f == null) {
                            C34708w.m109624a(37);
                            throw null;
                        }
                        c34708wM109631P0.f146182w = abstractC23812y0M69821f;
                        if (!C30095s.f122817g.contains(AbstractC12667a.m35446R(c21513iM92221f, AbstractC20301a.m56347o(c34682j4, 3)))) {
                            c34708wM109631P0.mo68183v((InterfaceC32307i) AbstractC29125c.m88494C(this.f122803f, f122797h[2]));
                        }
                        AbstractC34710x abstractC34710xMo88262M0 = c34708wM109631P0.f146181X.mo88262M0(c34708wM109631P0);
                        AbstractC22676k.m65748h(abstractC34710xMo88262M0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
                        arrayList2.add((C34682j) abstractC34710xMo88262M0);
                    }
                    return arrayList2;
                }
            }
        }
        return C25271y.f99162w;
    }

    @Override // t93.InterfaceC33666b
    /* JADX INFO: renamed from: d */
    public final Collection mo92219d(InterfaceC31117e classDescriptor) {
        Set functionNames;
        AbstractC22676k.m65750j(classDescriptor, "classDescriptor");
        m92222g().getClass();
        C21513i c21513iM92221f = m92221f(classDescriptor);
        if (c21513iM92221f == null || (functionNames = c21513iM92221f.m60495X().getFunctionNames()) == null) {
            functionNames = C25235a0.f99113w;
        }
        return functionNames;
    }

    @Override // t93.InterfaceC33668d
    /* JADX INFO: renamed from: e */
    public final boolean mo92220e(InterfaceC31117e classDescriptor, C21560t c21560t) {
        AbstractC22676k.m65750j(classDescriptor, "classDescriptor");
        C21513i c21513iM92221f = m92221f(classDescriptor);
        if (c21513iM92221f == null || !c21560t.getAnnotations().mo52688J(AbstractC33669e.m106404a())) {
            return true;
        }
        m92222g().getClass();
        String strM56347o = AbstractC20301a.m56347o(c21560t, 3);
        C21519o c21519oM60495X = c21513iM92221f.m60495X();
        C35850h name = c21560t.getName();
        AbstractC22676k.m65749i(name, "getName(...)");
        Collection contributedFunctions = c21519oM60495X.getContributedFunctions(name, EnumC40212c.f173637w);
        if ((contributedFunctions instanceof Collection) && contributedFunctions.isEmpty()) {
            return false;
        }
        Iterator it = contributedFunctions.iterator();
        while (it.hasNext()) {
            if (AbstractC22676k.m65745e(AbstractC20301a.m56347o((C34697q0) it.next(), 3), strM56347o)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final C21513i m92221f(InterfaceC31117e interfaceC31117e) {
        C35847e c35847eM113773a;
        if (interfaceC31117e == null) {
            AbstractC27736h.m83809a(108);
            throw null;
        }
        if (!AbstractC27736h.m83810b(interfaceC31117e, AbstractC27741m.f111843a) && AbstractC27736h.m83808J(interfaceC31117e)) {
            C35848f c35848fM13810h = AbstractC4393e.m13810h(interfaceC31117e);
            if (c35848fM13810h.m113794d()) {
                String str = C30080d.f122759a;
                C35845c c35845cM92211g = C30080d.m92211g(c35848fM13810h);
                if (c35845cM92211g != null && (c35847eM113773a = c35845cM92211g.m113773a()) != null) {
                    C34673e0 c34673e0 = m92222g().f122784a;
                    EnumC40212c enumC40212c = EnumC40212c.f173637w;
                    InterfaceC31117e interfaceC31117eM95886d = AbstractC31166y.m95886d(c34673e0, c35847eM113773a);
                    if (interfaceC31117eM95886d instanceof C21513i) {
                        return (C21513i) interfaceC31117eM95886d;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final C30085i m92222g() {
        return (C30085i) AbstractC29125c.m88494C(this.f122799b, f122797h[0]);
    }
}
