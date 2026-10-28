package p048ce;

import a33.C0352d;
import c93.InterfaceC4339a;
import ec3.InterfaceC13037f2;
import fa3.C14303b;
import fa3.C14327t;
import g40.C15378k0;
import g40.InterfaceC15361h1;
import ga3.C15624b;
import ia3.C18295a;
import ia3.InterfaceC18300f;
import j93.C21462d0;
import j93.EnumC21464e0;
import ja3.C21513i;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jb3.C21548h;
import jb3.C21561u;
import jh3.AbstractC21702c;
import kb3.InterfaceC22345n;
import l83.InterfaceC23462h;
import lb3.AbstractC23763c0;
import lb3.AbstractC23773f1;
import lb3.AbstractC23804u0;
import lb3.AbstractC23811y;
import lb3.C23758a1;
import lb3.C23813z;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import m93.C25336e;
import mb3.C25389f;
import mb3.C25392i;
import ob3.InterfaceC27797g;
import p031b9.AbstractC2875y;
import p035bp.AbstractC3511b;
import p319m4.AbstractC25012a;
import p613xf.InterfaceC38257c;
import p692zt.C41113q;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.reflect.jvm.internal.ConvertFromMetadataKt;
import qa3.C30172x;
import r93.EnumC31106a0;
import r93.InterfaceC31117e;
import r93.InterfaceC31135k;
import r93.InterfaceC31151q0;
import r93.InterfaceC31155s0;
import r93.InterfaceC31162w;
import r93.InterfaceC31163w0;
import s93.InterfaceC32307i;
import u93.AbstractC34670d;
import u93.AbstractC34676g;
import u93.AbstractC34692o;
import u93.AbstractC34710x;
import u93.C34682j;
import u93.C34703t0;
import ub3.C34752f;
import ud3.C34810e0;
import wb3.AbstractC37056f;
import wb3.C37057g;
import wb3.C37058h;
import x30.C37928t;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: ce.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C4463d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17983w;

    /* JADX INFO: renamed from: x */
    public final Object f17984x;

    /* JADX INFO: renamed from: y */
    public final Object f17985y;

    public /* synthetic */ C4463d(int i13, Object obj, Object obj2) {
        this.f17983w = i13;
        this.f17984x = obj;
        this.f17985y = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, l83.h] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, l83.h] */
    /* JADX WARN: Type inference failed for: r2v0, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, l83.h] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // c93.InterfaceC4339a
    public final Object invoke() throws IOException {
        C21462d0 c21462d0M121626I;
        int i13 = this.f17983w;
        ?? arrayList = C25271y.f99162w;
        Object obj = this.f17985y;
        Object obj2 = this.f17984x;
        switch (i13) {
            case 0:
                StringBuilder sb4 = new StringBuilder("Ignoring property under invalid ");
                C22669g0 c22669g0 = (C22669g0) obj;
                sb4.append(AbstractC37978j.m121653n((C4485z) c22669g0.f89336w));
                sb4.append(" '");
                return AbstractC3511b.m10386o(Integer.valueOf(((C4472m) obj2).f18002a), AbstractC25012a.m73377j(sb4, ((C4485z) c22669g0.f89336w).f18026a, '\''));
            case 1:
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((InterfaceC13037f2) it.next()).getValue());
                }
                for (InterfaceC15361h1 interfaceC15361h1 : AbstractC25265s.m74152u1(arrayList3, (C15378k0) ((C0352d) obj).f1238y)) {
                    if (interfaceC15361h1 != null) {
                        return interfaceC15361h1;
                    }
                }
                return null;
            case 2:
                AbstractC23763c0 abstractC23763c0Mo60594i = ((C18295a) ((C41113q) obj2).f177224x).f71237o.mo78661c().m83822j(((C15624b) obj).f58652a).mo60594i();
                AbstractC22676k.m65749i(abstractC23763c0Mo60594i, "getDefaultType(...)");
                return abstractC23763c0Mo60594i;
            case 3:
                C41113q c41113q = (C41113q) obj2;
                InterfaceC32307i additionalAnnotations = (InterfaceC32307i) obj;
                AbstractC22676k.m65750j(c41113q, "<this>");
                AbstractC22676k.m65750j(additionalAnnotations, "additionalAnnotations");
                return C14303b.m40908b(((C18295a) c41113q.f177224x).f71239q, (C14327t) c41113q.f177226z.getValue(), additionalAnnotations);
            case 4:
                C21548h c21548h = (C21548h) obj2;
                return AbstractC25265s.m74093D1(c21548h.f82636L.f65760a.f65739e.mo16015s(c21548h.f82645U, (C30172x) obj));
            case 5:
                InterfaceC27797g type = (InterfaceC27797g) ((C23813z) obj).f94211y.invoke();
                ((C25389f) obj2).getClass();
                AbstractC22676k.m65750j(type, "type");
                return (AbstractC23811y) type;
            case 6:
                StringBuilder sb5 = new StringBuilder();
                sb5.append('@');
                sb5.append(((Class) obj2).getCanonicalName());
                AbstractC25265s.m74109M0(((Map) obj).entrySet(), sb5, ", ", "(", ")", C25336e.f99362w, 48);
                return sb5.toString();
            case 7:
                C25389f c25389f = (C25389f) obj;
                List list = (List) ((C25392i) obj2).f99482E.getValue();
                ?? r10 = arrayList;
                if (list != null) {
                    r10 = list;
                }
                Iterable iterable = (Iterable) r10;
                ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((AbstractC23773f1) it3.next()).mo64124m0(c25389f));
                }
                return arrayList4;
            case 8:
                C21513i c21513i = (C21513i) obj2;
                C41113q c41113q2 = c21513i.f82509J;
                C18295a c18295a = (C18295a) c41113q2.f177224x;
                C41113q c41113q3 = new C41113q(new C18295a(c18295a.f71223a, c18295a.f71224b, c18295a.f71225c, c18295a.f71226d, c18295a.f71227e, c18295a.f71228f, c18295a.f71230h, c18295a.f71231i, c18295a.f71232j, c18295a.f71233k, c18295a.f71234l, c18295a.f71235m, c18295a.f71236n, c18295a.f71237o, c18295a.f71238p, c18295a.f71239q, c18295a.f71240r, c18295a.f71241s, c18295a.f71242t, c18295a.f71243u, c18295a.f71244v, c18295a.f71245w), (InterfaceC18300f) c41113q2.f177225y, (InterfaceC23462h) c41113q2.f177226z);
                InterfaceC31135k interfaceC31135kMo60581g = c21513i.mo60581g();
                AbstractC22676k.m65749i(interfaceC31135kMo60581g, "getContainingDeclaration(...)");
                return new C21513i(c41113q3, interfaceC31135kMo60581g, c21513i.f82507H, (InterfaceC31117e) obj);
            case 9:
                return "starting connection: addr=" + ((InetSocketAddress) obj2) + "; proxy=" + ((Proxy) obj);
            case 10:
                return "dns resolved: domain=" + ((String) obj2) + "; records=" + ((List) obj);
            case 11:
                return "proxy select end: url=" + ((C34810e0) obj2) + "; proxies=" + ((List) obj);
            case 12:
                C34752f c34752f = new C34752f();
                Iterator it4 = ((AbstractC34710x) obj).mo78673h().iterator();
                while (it4.hasNext()) {
                    c34752f.add(((InterfaceC31162w) it4.next()).mo60593d((C23758a1) obj2));
                }
                return c34752f;
            case 13:
                C34703t0 c34703t0 = (C34703t0) obj2;
                C34682j c34682j = (C34682j) obj;
                InterfaceC22345n interfaceC22345n = c34703t0.f146152e0;
                InterfaceC31163w0 interfaceC31163w0 = c34703t0.f146153f0;
                InterfaceC32307i annotations = c34682j.getAnnotations();
                C34682j c34682j2 = c34682j;
                int kind = c34682j2.getKind();
                AbstractC21702c.m61142m(kind, "getKind(...)");
                InterfaceC31135k interfaceC31135k = c34703t0.f146153f0;
                InterfaceC31155s0 source = ((AbstractC34692o) interfaceC31135k).getSource();
                AbstractC22676k.m65749i(source, "getSource(...)");
                C34703t0 c34703t1 = new C34703t0(interfaceC22345n, interfaceC31163w0, c34682j, c34703t0, annotations, kind, source);
                C34703t0.f146150h0.getClass();
                C21561u c21561u = (C21561u) interfaceC31135k;
                C23758a1 c23758a1M69818d = c21561u.m60589J0() == null ? null : C23758a1.m69818d(c21561u.m60590K0());
                if (c23758a1M69818d == null) {
                    return null;
                }
                InterfaceC31151q0 interfaceC31151q0 = c34682j2.f146197K;
                AbstractC34670d abstractC34670dMo60593d = interfaceC31151q0 != null ? ((AbstractC34670d) interfaceC31151q0).mo60593d(c23758a1M69818d) : null;
                List listMo78671c0 = c34682j2.mo78671c0();
                AbstractC22676k.m65749i(listMo78671c0, "getContextReceiverParameters(...)");
                List list2 = listMo78671c0;
                ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                Iterator it5 = list2.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(((AbstractC34670d) ((InterfaceC31151q0) it5.next())).mo60593d(c23758a1M69818d));
                }
                AbstractC34676g abstractC34676g = (AbstractC34676g) interfaceC31135k;
                List listMo60497j = abstractC34676g.mo60497j();
                List listMo78676v = c34703t0.mo78676v();
                AbstractC23811y abstractC23811y = c34703t0.f146194H;
                AbstractC22676k.m65747g(abstractC23811y);
                c34703t1.mo109605O0(null, abstractC34670dMo60593d, arrayList5, listMo60497j, listMo78676v, abstractC23811y, EnumC31106a0.f128310x, abstractC34676g.f146064G);
                return c34703t1;
            case 14:
                C37058h c37058h = (C37058h) obj2;
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) obj;
                List listMo69842X = c37058h.f158553x.mo69842X();
                if (!listMo69842X.isEmpty()) {
                    List list3 = listMo69842X;
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
                    int i14 = 0;
                    for (Object obj3 : list3) {
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        AbstractC23804u0 abstractC23804u0 = (AbstractC23804u0) obj3;
                        InterfaceC4339a interfaceC4339aConvertTypeArgumentToJavaType = interfaceC4339a == null ? null : ConvertFromMetadataKt.convertTypeArgumentToJavaType(new C37057g(c37058h, 1), i14);
                        if (abstractC23804u0.mo69869c()) {
                            c21462d0M121626I = C21462d0.f82423c;
                        } else {
                            AbstractC23811y abstractC23811yMo69868b = abstractC23804u0.mo69868b();
                            AbstractC22676k.m65749i(abstractC23811yMo69868b, "getType(...)");
                            C37058h c37058h2 = new C37058h(abstractC23811yMo69868b, interfaceC4339aConvertTypeArgumentToJavaType);
                            int iOrdinal = abstractC23804u0.mo69867a().ordinal();
                            if (iOrdinal == 0) {
                                C21462d0 c21462d0 = C21462d0.f82423c;
                                c21462d0M121626I = AbstractC37978j.m121626I(c37058h2);
                            } else if (iOrdinal == 1) {
                                C21462d0 c21462d1 = C21462d0.f82423c;
                                c21462d0M121626I = new C21462d0(EnumC21464e0.f82427x, c37058h2);
                            } else {
                                if (iOrdinal != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                C21462d0 c21462d2 = C21462d0.f82423c;
                                c21462d0M121626I = new C21462d0(EnumC21464e0.f82428y, c37058h2);
                            }
                        }
                        arrayList.add(c21462d0M121626I);
                        i14 = i15;
                    }
                }
                return arrayList;
            case 15:
                ArrayList arrayList6 = (ArrayList) obj2;
                ArrayList arrayList7 = new ArrayList(AbstractC25267u.m74163i0(arrayList6, 10));
                Iterator it6 = arrayList6.iterator();
                while (it6.hasNext()) {
                    arrayList7.add(((InterfaceC13037f2) it6.next()).getValue());
                }
                return (InterfaceC15361h1) AbstractC25265s.m74100H0(AbstractC25265s.m74092D0(AbstractC25265s.m74152u1(arrayList7, ((C37928t) obj).f162383a)));
            default:
                StringBuilder sb6 = new StringBuilder("unable to resolve identity from ");
                sb6.append((InterfaceC38257c) obj2);
                sb6.append(": ");
                return AbstractC2875y.m8298k((Exception) obj, sb6);
        }
    }

    public C4463d(AbstractC34710x abstractC34710x, C23758a1 c23758a1) {
        this.f17983w = 12;
        this.f17985y = abstractC34710x;
        this.f17984x = c23758a1;
    }
}
