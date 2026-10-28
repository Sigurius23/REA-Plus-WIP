package bg;

import a00.C0072g;
import ab3.C0710b;
import ab3.C0717i;
import androidx.health.platform.client.proto.C1533u;
import aws.smithy.kotlin.runtime.identity.IdentityProviderException;
import c93.InterfaceC4339a;
import ce3.C4515p;
import e93.AbstractC12889b;
import ec3.InterfaceC13037f2;
import fb3.C14340a;
import fb3.InterfaceC14343d;
import ga3.AbstractC15625c;
import ga3.AbstractC15627e;
import ga3.C15631i;
import ga3.C15632j;
import hb3.C17122k;
import ja3.C21512h;
import ja3.C21519o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jb3.C21548h;
import jb3.C21561u;
import jh3.AbstractC21702c;
import kb3.InterfaceC22345n;
import l83.C23465k;
import l83.C23480z;
import lb3.AbstractC23763c0;
import lb3.AbstractC23791o;
import lb3.AbstractC23804u0;
import lb3.AbstractC23811y;
import lb3.C23758a1;
import lb3.C23778h0;
import lb3.EnumC23776g1;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import ma3.InterfaceC25372a;
import mb3.C25392i;
import n83.C26460c;
import o93.AbstractC27741m;
import p097ds.AbstractC12313p;
import p097ds.AbstractC12314q;
import p098dt.AbstractC12350b;
import p499t9.C33623c0;
import p613xf.InterfaceC38257c;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22665e0;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractC22706i;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22704g;
import qa3.C30122c0;
import qa3.C30145k;
import qa3.C30146k0;
import r93.EnumC31106a0;
import r93.InterfaceC31111c;
import r93.InterfaceC31117e;
import r93.InterfaceC31135k;
import r93.InterfaceC31145n0;
import r93.InterfaceC31151q0;
import r93.InterfaceC31155s0;
import s93.C32304f;
import s93.C32305g;
import s93.C32310l;
import s93.EnumC32313o;
import s93.InterfaceC32307i;
import u93.AbstractC34670d;
import u93.AbstractC34676g;
import u93.AbstractC34680i;
import u93.AbstractC34710x;
import u93.C34682j;
import u93.C34695p0;
import u93.C34697q0;
import u93.C34702t;
import u93.C34703t0;
import u93.C34707v0;
import ud3.C34804c0;
import ud3.C34810e0;
import va3.AbstractC35851i;
import va3.C35845c;
import va3.C35847e;
import va3.C35850h;
import ve.C35922g;
import wb3.AbstractC37056f;
import x93.C38115g;
import x93.C38127s;
import ya3.AbstractC39373p;
import z93.EnumC40212c;

/* JADX INFO: renamed from: bg.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C3215j implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f12574w;

    /* JADX INFO: renamed from: x */
    public final Object f12575x;

    public /* synthetic */ C3215j(Object obj, int i13) {
        this.f12574w = i13;
        this.f12575x = obj;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0123  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [r93.b, r93.w, u93.t0, u93.x] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [r93.q0] */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r25v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r25v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v35 */
    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        C0717i c0717i;
        EnumC32313o enumC32313o;
        C0710b c0710bM43956a;
        int iHashCode;
        C23758a1 c23758a1M69818d;
        C23758a1 c23758a1;
        List list;
        C23758a1 c23758a2;
        C23758a1 c23758a3;
        ?? r10;
        int i13 = this.f12574w;
        C25272z c25272z = C25272z.f99163w;
        int i14 = 10;
        C23758a1 c23758a4 = null;
        Object obj = this.f12575x;
        switch (i13) {
            case 0:
                C3216k c3216k = (C3216k) obj;
                int length = c3216k.f12579a.length / 2;
                short[] sArr = new short[length];
                for (int i15 = 0; i15 < length; i15++) {
                    byte[] bArr = c3216k.f12579a;
                    int i16 = i15 * 2;
                    if (i16 > bArr.length - 2) {
                        throw new IllegalStateException("Check failed.");
                    }
                    sArr[i15] = (short) ((bArr[i16 + 1] & 255) | ((bArr[i16] & 255) << 8));
                }
                return new C23480z(sArr);
            case 1:
                Object obj2 = AbstractC15627e.f58661a;
                InterfaceC25372a interfaceC25372a = ((C15631i) obj).f58655d;
                C38127s c38127s = interfaceC25372a instanceof C38127s ? (C38127s) interfaceC25372a : null;
                if (c38127s == null || (enumC32313o = (EnumC32313o) AbstractC15627e.f58662b.get(C35850h.m113814e(c38127s.f163237b.name()).m113817b())) == null) {
                    c0717i = null;
                } else {
                    C35847e topLevelFqName = AbstractC27741m.f111871v;
                    AbstractC22676k.m65750j(topLevelFqName, "topLevelFqName");
                    c0717i = new C0717i(new C35845c(topLevelFqName.m113789b(), topLevelFqName.f152613a.m113796g()), C35850h.m113814e(enumC32313o.name()));
                }
                Map mapM73989X = c0717i != null ? AbstractC25247g0.m73989X(new C23465k(AbstractC15625c.f58658c, c0717i)) : null;
                return mapM73989X == null ? c25272z : mapM73989X;
            case 2:
                InterfaceC25372a interfaceC25372a2 = ((C15632j) obj).f58655d;
                if (interfaceC25372a2 instanceof C38115g) {
                    Object obj3 = AbstractC15627e.f58661a;
                    c0710bM43956a = AbstractC15627e.m43956a(((C38115g) interfaceC25372a2).m122099a());
                } else if (interfaceC25372a2 instanceof C38127s) {
                    Object obj4 = AbstractC15627e.f58661a;
                    c0710bM43956a = AbstractC15627e.m43956a(AbstractC37056f.m118958J(interfaceC25372a2));
                } else {
                    c0710bM43956a = null;
                }
                Map mapM73989X2 = c0710bM43956a != null ? AbstractC25247g0.m73989X(new C23465k(AbstractC15625c.f58657b, c0710bM43956a)) : null;
                return mapM73989X2 == null ? c25272z : mapM73989X2;
            case 3:
                C21519o c21519o = (C21519o) obj;
                return AbstractC12350b.m34556E(c21519o.getFunctionNames(), c21519o.getVariableNames());
            case 4:
                C22704g c22704g = null;
                HashSet hashSet = new HashSet();
                C21548h c21548h = (C21548h) ((C0072g) obj).f221E;
                C21512h c21512h = c21548h.f82638N;
                C17122k c17122k = c21548h.f82636L;
                C30145k c30145k = c21548h.f82629E;
                Iterator it = c21512h.getSupertypes().iterator();
                while (it.hasNext()) {
                    C22704g c22704g2 = c22704g;
                    for (InterfaceC31135k interfaceC31135k : AbstractC12350b.m34599t(((AbstractC23811y) it.next()).mo64128u(), c22704g2, 3)) {
                        if ((interfaceC31135k instanceof C34697q0) || (interfaceC31135k instanceof InterfaceC31145n0)) {
                            hashSet.add(((InterfaceC31111c) interfaceC31135k).getName());
                        }
                    }
                    c22704g = c22704g2;
                }
                List list2 = c30145k.f123283Q;
                AbstractC22676k.m65749i(list2, "getFunctionList(...)");
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    hashSet.add(AbstractC12889b.m36240F(c17122k.f65761b, ((C30122c0) it3.next()).f123037F));
                }
                List list3 = c30145k.f123284R;
                AbstractC22676k.m65749i(list3, "getPropertyList(...)");
                Iterator it4 = list3.iterator();
                while (it4.hasNext()) {
                    hashSet.add(AbstractC12889b.m36240F(c17122k.f65761b, ((C30146k0) it4.next()).f123305F));
                }
                return AbstractC12350b.m34556E(hashSet, hashSet);
            case 5:
                return AbstractC22706i.accessor$GivenFunctionsMemberScope$lambda0((AbstractC22706i) obj);
            case 6:
                return AbstractC12314q.m34316H(((C23778h0) obj).f94158a);
            case 7:
                int iHashCode2 = 0;
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof boolean[]) {
                        iHashCode = Arrays.hashCode((boolean[]) value);
                    } else if (value instanceof char[]) {
                        iHashCode = Arrays.hashCode((char[]) value);
                    } else if (value instanceof byte[]) {
                        iHashCode = Arrays.hashCode((byte[]) value);
                    } else if (value instanceof short[]) {
                        iHashCode = Arrays.hashCode((short[]) value);
                    } else if (value instanceof int[]) {
                        iHashCode = Arrays.hashCode((int[]) value);
                    } else if (value instanceof float[]) {
                        iHashCode = Arrays.hashCode((float[]) value);
                    } else if (value instanceof long[]) {
                        iHashCode = Arrays.hashCode((long[]) value);
                    } else if (value instanceof double[]) {
                        iHashCode = Arrays.hashCode((double[]) value);
                    } else {
                        iHashCode = value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode();
                    }
                    iHashCode2 += iHashCode ^ (str.hashCode() * 127);
                }
                return Integer.valueOf(iHashCode2);
            case 8:
                InterfaceC4339a interfaceC4339a = ((C25392i) obj).f99484x;
                if (interfaceC4339a != null) {
                    return (List) interfaceC4339a.invoke();
                }
                return null;
            case 9:
                return "dns query: domain=" + ((String) obj);
            case 10:
                return "proxy select start: url=" + ((C34810e0) obj);
            case 11:
                return "TLS connect end: handshake=" + ((C34804c0) obj);
            case 12:
                C32310l c32310l = (C32310l) obj;
                return c32310l.f133687a.m83822j(c32310l.f133688b).mo60594i();
            case 13:
                return "retrying request, attempt " + ((C22665e0) obj).f89334w;
            case 14:
                AbstractC34676g abstractC34676g = (AbstractC34676g) obj;
                C21561u c21561u = (C21561u) abstractC34676g;
                InterfaceC31117e interfaceC31117eM60589J0 = c21561u.m60589J0();
                C25271y c25271y = C25271y.f99162w;
                if (interfaceC31117eM60589J0 == null) {
                    return c25271y;
                }
                Collection<C34682j> constructors = interfaceC31117eM60589J0.getConstructors();
                AbstractC22676k.m65749i(constructors, "getConstructors(...)");
                ArrayList arrayList = new ArrayList();
                for (C34682j c34682j : constructors) {
                    C33623c0 c33623c0 = C34703t0.f146150h0;
                    InterfaceC22345n storageManager = abstractC34676g.f146063F;
                    AbstractC22676k.m65747g(c34682j);
                    c33623c0.getClass();
                    AbstractC22676k.m65750j(storageManager, "storageManager");
                    if (c21561u.m60589J0() == null) {
                        c23758a1 = c23758a4;
                    } else {
                        c23758a1M69818d = C23758a1.m69818d(c21561u.m60590K0());
                    }
                    if (c23758a1 == null) {
                        c23758a1 = c23758a1M69818d;
                        c23758a3 = c23758a4;
                        r10 = c23758a4;
                    } else {
                        c23758a1 = c23758a1M69818d;
                        C23758a1 c23758a5 = c23758a1;
                        C34682j c34682jMo60593d = c34682j.mo60593d(c23758a5);
                        if (c34682jMo60593d == null) {
                            c23758a1 = c23758a1M69818d;
                            c23758a3 = c23758a4;
                            r10 = c23758a4;
                        } else {
                            InterfaceC32307i annotations = c34682j.getAnnotations();
                            C34682j c34682j2 = c34682j;
                            int kind = c34682j2.getKind();
                            AbstractC21702c.m61142m(kind, "getKind(...)");
                            InterfaceC31155s0 source = abstractC34676g.getSource();
                            AbstractC22676k.m65749i(source, "getSource(...)");
                            ?? c34703t0 = new C34703t0(storageManager, abstractC34676g, c34682jMo60593d, null, annotations, kind, source);
                            List listMo78676v = c34682j2.mo78676v();
                            if (listMo78676v == null) {
                                ?? r25 = c23758a4;
                                AbstractC34710x.m109629r0(28);
                                throw r25;
                            }
                            ArrayList arrayListM109628N0 = AbstractC34710x.m109628N0(c34703t0, listMo78676v, c23758a5, false, false, null);
                            if (arrayListM109628N0 == null) {
                                c23758a1 = c23758a1M69818d;
                                c23758a3 = c23758a4;
                                r10 = c23758a4;
                            } else {
                                AbstractC23763c0 abstractC23763c0M69896o = AbstractC23791o.m69896o(AbstractC12313p.m34261M(c34682jMo60593d.f146194H.mo69863p0()), c21561u.mo60594i());
                                InterfaceC31151q0 interfaceC31151q0 = c34682j2.f146197K;
                                C32304f c32304f = C32305g.f133684a;
                                ?? M125576j = interfaceC31151q0 != null ? AbstractC39373p.m125576j(c34703t0, c23758a5.m69822g(((AbstractC34670d) interfaceC31151q0).getType(), EnumC23776g1.INVARIANT), c32304f) : c23758a4;
                                InterfaceC31117e interfaceC31117eM60589J1 = c21561u.m60589J0();
                                if (interfaceC31117eM60589J1 != null) {
                                    List listMo78671c0 = c34682j2.mo78671c0();
                                    AbstractC22676k.m65749i(listMo78671c0, "getContextReceiverParameters(...)");
                                    List list4 = listMo78671c0;
                                    ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list4, i14));
                                    int i17 = 0;
                                    C23758a1 c23758a6 = c23758a4;
                                    for (Object obj5 : list4) {
                                        int i18 = i17 + 1;
                                        if (i17 < 0) {
                                            ?? r26 = c23758a6;
                                            AbstractC37056f.m118977d0();
                                            throw r26;
                                        }
                                        AbstractC34670d abstractC34670d = (AbstractC34670d) ((InterfaceC31151q0) obj5);
                                        C23758a1 c23758a7 = c23758a6;
                                        AbstractC23811y abstractC23811yM69822g = c23758a5.m69822g(abstractC34670d.getType(), EnumC23776g1.INVARIANT);
                                        InterfaceC14343d value2 = abstractC34670d.getValue();
                                        AbstractC22676k.m65748h(value2, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver");
                                        arrayList2.add(new C34695p0(interfaceC31117eM60589J1, new C14340a(interfaceC31117eM60589J1, abstractC23811yM69822g, ((C14340a) value2).m40963Q()), c32304f, AbstractC35851i.m113819a(i17)));
                                        i17 = i18;
                                        c23758a6 = c23758a7;
                                    }
                                    list = arrayList2;
                                    c23758a2 = c23758a6;
                                } else {
                                    list = c25271y;
                                    c23758a2 = c23758a4;
                                }
                                c23758a3 = c23758a2;
                                c34703t0.mo109605O0(M125576j, null, list, abstractC34676g.mo60497j(), arrayListM109628N0, abstractC23763c0M69896o, EnumC31106a0.f128310x, abstractC34676g.f146064G);
                                r10 = c34703t0;
                            }
                        }
                    }
                    if (r10 != 0) {
                        arrayList.add(r10);
                    }
                    c23758a4 = c23758a3;
                    i14 = 10;
                }
                return arrayList;
            case 15:
                StringBuilder sb4 = new StringBuilder("Scope for type parameter ");
                C4515p c4515p = (C4515p) obj;
                sb4.append(((C35850h) c4515p.f18181x).m113817b());
                return AbstractC22674j.m65739y(sb4.toString(), ((AbstractC34680i) c4515p.f18182y).getUpperBounds());
            case 16:
                C34702t c34702t = (C34702t) obj;
                HashSet hashSet2 = new HashSet();
                for (C35850h c35850h : (Set) c34702t.f146149e.f146157I.invoke()) {
                    EnumC40212c enumC40212c = EnumC40212c.f173633F;
                    hashSet2.addAll(c34702t.getContributedFunctions(c35850h, enumC40212c));
                    hashSet2.addAll(c34702t.getContributedVariables(c35850h, enumC40212c));
                }
                return hashSet2;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return (List) ((C34707v0) obj).f146161M.getValue();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C26460c c26460c = (C26460c) obj;
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(c26460c, 10));
                Iterator it5 = c26460c.iterator();
                while (it5.hasNext()) {
                    arrayList3.add(((InterfaceC13037f2) it5.next()).getValue());
                }
                return AbstractC25265s.m74093D1(arrayList3);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return "Attempting to resolve identity from " + ((InterfaceC38257c) obj);
            case 20:
                String message = "No identity could be resolved from the chain: " + ((C35922g) obj);
                AbstractC22676k.m65750j(message, "message");
                return new IdentityProviderException(message, null);
            default:
                AbstractC23811y abstractC23811yMo69868b = ((AbstractC23804u0) obj).mo69868b();
                AbstractC22676k.m65749i(abstractC23811yMo69868b, "getType(...)");
                return abstractC23811yMo69868b;
        }
    }
}
