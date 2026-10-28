package dc3;

import androidx.lifecycle.C1591h2;
import bc3.C3033m;
import com.google.crypto.tink.internal.C5099k0;
import com.google.crypto.tink.internal.C5101l0;
import fa3.AbstractC14325r;
import fa3.C14326s;
import fa3.C14333z;
import fa3.EnumC14304b0;
import fa3.InterfaceC14302a0;
import ga3.AbstractC15625c;
import ge3.AbstractC15751g;
import gm.C15990r;
import hb3.C17109d;
import hb3.C17113f;
import hb3.C17115g;
import hb3.C17119i;
import hb3.C17122k;
import ia3.C18295a;
import ia3.C18297c;
import ia3.C18299e;
import ib3.C18344c;
import io.sentry.config.AbstractC20301a;
import j93.AbstractC21478l0;
import ja3.C21510f0;
import ja3.C21513i;
import ja3.C21519o;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jb3.AbstractC21557q;
import jb3.C21548h;
import ka3.C22309a;
import kb3.C22342k;
import l83.C23454a0;
import l83.C23461g;
import l83.C23465k;
import l83.InterfaceC23462h;
import lb3.AbstractC23763c0;
import lb3.AbstractC23767d1;
import lb3.AbstractC23771f;
import lb3.AbstractC23811y;
import lb3.C23758a1;
import lb3.C23768e;
import lb3.C23784k0;
import lb3.C23798r0;
import lb3.C23802t0;
import lb3.InterfaceC23796q0;
import m63.C25126d;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import mb3.C25389f;
import n83.C26466i;
import o93.AbstractC27736h;
import o93.AbstractC27742n;
import oa3.C27759b;
import oa3.C27761d;
import p031b9.AbstractC2875y;
import p249jc.AbstractC21598x;
import p249jc.C21567b;
import p581we.C37199o;
import p619xl.C38445a;
import p668z1.AbstractC39963l;
import p668z1.C39955e;
import p668z1.C39961j;
import p692zt.C41113q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22708k;
import pf.AbstractC29125c;
import q93.C30092p;
import q93.C30094r;
import qa3.C30123c1;
import qa3.C30144j1;
import qa3.C30145k;
import r93.C31161v0;
import r93.InterfaceC31117e;
import r93.InterfaceC31124g0;
import r93.InterfaceC31126h;
import r93.InterfaceC31138l;
import r93.InterfaceC31155s0;
import r93.InterfaceC31165x0;
import s93.AbstractC32303e;
import s93.AbstractC32306h;
import s93.C32305g;
import s93.C32308j;
import sa3.AbstractC32327a;
import sa3.C32334h;
import sa3.C32336j;
import sa3.InterfaceC32332f;
import t93.InterfaceC33667c;
import u93.C34664a;
import u93.C34665a0;
import u93.C34673e0;
import u93.C34681i0;
import u93.InterfaceC34683j0;
import va3.AbstractC35844b;
import va3.AbstractC35849g;
import va3.AbstractC35852j;
import va3.C35845c;
import va3.C35847e;
import va3.C35850h;
import w93.C36968a;
import w93.C36969b;
import wb3.AbstractC37056f;
import x93.AbstractC38109c;
import x93.C38108b0;
import x93.C38111d;
import z93.EnumC40212c;

/* JADX INFO: renamed from: dc3.s */
/* JADX INFO: loaded from: classes5.dex */
public final class C11934s implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f39039w;

    /* JADX INFO: renamed from: x */
    public final Object f39040x;

    public /* synthetic */ C11934s(Object obj, int i13) {
        this.f39039w = i13;
        this.f39040x = obj;
    }

    /* JADX WARN: Code duplicated, block: B:173:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:276:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object, l83.h] */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object next;
        Object next2;
        InterfaceC31124g0 interfaceC31124g0;
        C17122k c17122kM48363a;
        InterfaceC31124g0 interfaceC31124g1;
        long j7;
        int i13 = 0;
        switch (this.f39039w) {
            case 0:
                C3033m c3033m = (C3033m) this.f39040x;
                C23454a0 c23454a0 = C23454a0.f92919a;
                c3033m.resumeWith(c23454a0);
                return c23454a0;
            case 1:
                C23461g c23461g = (C23461g) this.f39040x;
                C35847e it = (C35847e) obj;
                AbstractC22676k.m65750j(it, "it");
                C35847e c35847e = AbstractC14325r.f52289a;
                InterfaceC14302a0.f52223i.getClass();
                C37199o configuredReportLevels = C14333z.f52340b;
                AbstractC22676k.m65750j(configuredReportLevels, "configuredReportLevels");
                EnumC14304b0 enumC14304b0 = (EnumC14304b0) ((C1591h2) configuredReportLevels.f159041x).invoke(it);
                if (enumC14304b0 != null) {
                    return enumC14304b0;
                }
                C37199o c37199o = AbstractC14325r.f52291c;
                c37199o.getClass();
                C14326s c14326s = (C14326s) ((C1591h2) c37199o.f159041x).invoke(it);
                if (c14326s == null) {
                    return EnumC14304b0.IGNORE;
                }
                C23461g c23461g2 = c14326s.f52295b;
                return (c23461g2 == null || c23461g2.f92932y - c23461g.f92932y > 0) ? c14326s.f52294a : c14326s.f52296c;
            case 2:
                C37199o c37199o2 = (C37199o) this.f39040x;
                C35847e c35847e2 = (C35847e) obj;
                AbstractC22676k.m65747g(c35847e2);
                ?? r10 = c37199o2.f159040w;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : r10.entrySet()) {
                    C35847e packageName = (C35847e) entry.getKey();
                    if (!c35847e2.equals(packageName)) {
                        AbstractC22676k.m65750j(packageName, "packageName");
                        if (AbstractC22676k.m65745e(c35847e2.f152613a.m113793c() ? null : c35847e2.m113789b(), packageName)) {
                        }
                    }
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                if (linkedHashMap.isEmpty()) {
                    linkedHashMap = null;
                }
                if (linkedHashMap == null) {
                    return null;
                }
                Iterator it3 = linkedHashMap.entrySet().iterator();
                if (it3.hasNext()) {
                    next = it3.next();
                    if (it3.hasNext()) {
                        int length = AbstractC35849g.m113811m((C35847e) ((Map.Entry) next).getKey(), c35847e2).f152613a.f152616a.length();
                        do {
                            Object next3 = it3.next();
                            int length2 = AbstractC35849g.m113811m((C35847e) ((Map.Entry) next3).getKey(), c35847e2).f152613a.f152616a.length();
                            if (length > length2) {
                                next = next3;
                                length = length2;
                            }
                        } while (it3.hasNext());
                    }
                } else {
                    next = null;
                }
                Map.Entry entry2 = (Map.Entry) next;
                if (entry2 != null) {
                    return entry2.getValue();
                }
                return null;
            case 3:
                C30094r c30094r = (C30094r) this.f39040x;
                C35847e fqName = (C35847e) obj;
                AbstractC22676k.m65750j(fqName, "fqName");
                C18344c c18344cM92225c = c30094r.m92225c(fqName);
                if (c18344cM92225c == null) {
                    return null;
                }
                C17119i c17119i = c30094r.f122809c;
                if (c17119i != null) {
                    c18344cM92225c.m52851K0(c17119i);
                    return c18344cM92225c;
                }
                AbstractC22676k.m65757q("components");
                throw null;
            case 4:
                C17115g c17115g = (C17115g) this.f39040x;
                C17113f key = (C17113f) obj;
                AbstractC22676k.m65750j(key, "key");
                C35845c c35845c = key.f65720a;
                C17119i c17119i2 = c17115g.f65724a;
                Iterator it4 = c17119i2.f65745k.iterator();
                while (it4.hasNext()) {
                    InterfaceC31117e interfaceC31117eMo88261c = ((InterfaceC33667c) it4.next()).mo88261c(c35845c);
                    if (interfaceC31117eMo88261c != null) {
                        return interfaceC31117eMo88261c;
                    }
                }
                if (C17115g.f65723c.contains(c35845c)) {
                    return null;
                }
                C17109d c17109dMo2333x = key.f65721b;
                if (c17109dMo2333x == null && (c17109dMo2333x = c17119i2.f65738d.mo2333x(c35845c)) == null) {
                    return null;
                }
                InterfaceC32332f interfaceC32332f = c17109dMo2333x.f65713a;
                C30145k c30145k = c17109dMo2333x.f65714b;
                AbstractC32327a abstractC32327a = c17109dMo2333x.f65715c;
                InterfaceC31155s0 interfaceC31155s0 = c17109dMo2333x.f65716d;
                C35845c c35845cM113776e = c35845c.m113776e();
                if (c35845cM113776e != null) {
                    InterfaceC31117e interfaceC31117eM48354a = c17115g.m48354a(c35845cM113776e, null);
                    C21548h c21548h = interfaceC31117eM48354a instanceof C21548h ? (C21548h) interfaceC31117eM48354a : null;
                    if (c21548h == null) {
                        return null;
                    }
                    if (!c21548h.m60579X().m60587f().contains(c35845c.m113777f())) {
                        return null;
                    }
                    c17122kM48363a = c21548h.f82636L;
                } else {
                    Iterator it5 = AbstractC21478l0.m60412R(c17119i2.f65740f, c35845c.f152609a).iterator();
                    do {
                        if (it5.hasNext()) {
                            next2 = it5.next();
                            interfaceC31124g1 = (InterfaceC31124g0) next2;
                            if (interfaceC31124g1 instanceof C18344c) {
                            }
                        } else {
                            next2 = null;
                        }
                        interfaceC31124g0 = (InterfaceC31124g0) next2;
                        if (interfaceC31124g0 == null) {
                            return null;
                        }
                        C30123c1 c30123c1 = c30145k.f123293a0;
                        AbstractC22676k.m65749i(c30123c1, "getTypeTable(...)");
                        C32334h c32334h = new C32334h(c30123c1);
                        C32336j c32336j = C32336j.f133837b;
                        C30144j1 c30144j1 = c30145k.f123295c0;
                        AbstractC22676k.m65749i(c30144j1, "getVersionRequirementTable(...)");
                        c17122kM48363a = c17119i2.m48363a(interfaceC31124g0, interfaceC32332f, c32334h, AbstractC29125c.m88541r(c30144j1), abstractC32327a, null);
                    } while (!((AbstractC21557q) ((C18344c) interfaceC31124g1).mo52852u()).m60587f().contains(c35845c.m113777f()));
                    interfaceC31124g0 = (InterfaceC31124g0) next2;
                    if (interfaceC31124g0 == null) {
                        return null;
                    }
                    C30123c1 c30123c2 = c30145k.f123293a0;
                    AbstractC22676k.m65749i(c30123c2, "getTypeTable(...)");
                    C32334h c32334h2 = new C32334h(c30123c2);
                    C32336j c32336j2 = C32336j.f133837b;
                    C30144j1 c30144j2 = c30145k.f123295c0;
                    AbstractC22676k.m65749i(c30144j2, "getVersionRequirementTable(...)");
                    c17122kM48363a = c17119i2.m48363a(interfaceC31124g0, interfaceC32332f, c32334h2, AbstractC29125c.m88541r(c30144j2), abstractC32327a, null);
                }
                return new C21548h(c17122kM48363a, c30145k, interfaceC32332f, abstractC32327a, interfaceC31155s0);
            case 5:
                C18297c c18297c = (C18297c) this.f39040x;
                C38111d annotation = (C38111d) obj;
                AbstractC22676k.m65750j(annotation, "annotation");
                C35850h c35850h = AbstractC15625c.f58656a;
                return AbstractC15625c.m43955b(annotation, c18297c.f71249w, c18297c.f71251y);
            case 6:
                C18299e c18299e = (C18299e) this.f39040x;
                C38108b0 typeParameter = (C38108b0) obj;
                AbstractC22676k.m65750j(typeParameter, "typeParameter");
                LinkedHashMap linkedHashMap2 = c18299e.f71258d;
                InterfaceC31138l interfaceC31138l = c18299e.f71256b;
                Integer num = (Integer) linkedHashMap2.get(typeParameter);
                if (num == null) {
                    return null;
                }
                int iIntValue = num.intValue();
                C41113q c41113q = c18299e.f71255a;
                AbstractC22676k.m65750j(c41113q, "<this>");
                return new C21510f0(AbstractC15751g.m44462o(new C41113q((C18295a) c41113q.f177224x, c18299e, (InterfaceC23462h) c41113q.f177226z), interfaceC31138l.getAnnotations()), typeParameter, c18299e.f71257c + iIntValue, interfaceC31138l);
            case 7:
                C21513i c21513i = (C21513i) this.f39040x;
                AbstractC22676k.m65750j((C25389f) obj, "it");
                return new C21519o(c21513i.f82509J, c21513i, c21513i.f82507H, c21513i.f82508I != null, c21513i.f82516Q);
            case 8:
                AbstractC23771f abstractC23771f = (AbstractC23771f) this.f39040x;
                C23768e supertypes = (C23768e) obj;
                AbstractC22676k.m65750j(supertypes, "supertypes");
                C31161v0 c31161v0Mo60485g = abstractC23771f.mo60485g();
                List superTypes = supertypes.f94141a;
                c31161v0Mo60485g.getClass();
                AbstractC22676k.m65750j(superTypes, "superTypes");
                if (superTypes.isEmpty()) {
                    AbstractC23811y abstractC23811yMo69826e = abstractC23771f.mo69826e();
                    List listM118958J = abstractC23811yMo69826e != null ? AbstractC37056f.m118958J(abstractC23811yMo69826e) : null;
                    if (listM118958J == null) {
                        listM118958J = C25271y.f99162w;
                    }
                    superTypes = listM118958J;
                }
                List listM74093D1 = superTypes instanceof List ? (List) superTypes : null;
                if (listM74093D1 == null) {
                    listM74093D1 = AbstractC25265s.m74093D1(superTypes);
                }
                List listMo69860j = abstractC23771f.mo69860j(listM74093D1);
                AbstractC22676k.m65750j(listMo69860j, "<set-?>");
                supertypes.f94142b = listMo69860j;
                return C23454a0.f92919a;
            case 9:
                InterfaceC23796q0 interfaceC23796q0 = (InterfaceC23796q0) this.f39040x;
                C25389f refiner = (C25389f) obj;
                AbstractC22676k.m65750j(refiner, "refiner");
                interfaceC23796q0.mo1784d();
                return null;
            case 10:
                C5101l0 c5101l0 = (C5101l0) this.f39040x;
                C23802t0 c23802t0 = (C23802t0) obj;
                InterfaceC31165x0 interfaceC31165x0M69910b = c23802t0.m69910b();
                C22309a c22309aM69909a = c23802t0.m69909a();
                Set setM64112e = c22309aM69909a.m64112e();
                if (setM64112e != null && setM64112e.contains(interfaceC31165x0M69910b.mo78660a())) {
                    return c5101l0.m16035N(c22309aM69909a);
                }
                AbstractC23763c0 abstractC23763c0Mo60594i = interfaceC31165x0M69910b.mo60594i();
                AbstractC22676k.m65749i(abstractC23763c0Mo60594i, "getDefaultType(...)");
                LinkedHashSet<InterfaceC31165x0> linkedHashSetM56352v = AbstractC20301a.m56352v(abstractC23763c0Mo60594i, setM64112e);
                int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(linkedHashSetM56352v, 10));
                if (iM73988W < 16) {
                    iM73988W = 16;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iM73988W);
                for (InterfaceC31165x0 interfaceC31165x0 : linkedHashSetM56352v) {
                    linkedHashMap3.put(interfaceC31165x0.mo60496e(), (setM64112e == null || !setM64112e.contains(interfaceC31165x0)) ? C21567b.m60605k(interfaceC31165x0, c22309aM69909a, c5101l0, c5101l0.m16037P(interfaceC31165x0, c22309aM69909a.m64117j(interfaceC31165x0M69910b))) : AbstractC23767d1.m69855k(interfaceC31165x0, c22309aM69909a));
                }
                C23758a1 c23758a1 = new C23758a1(new C23798r0(linkedHashMap3));
                List upperBounds = interfaceC31165x0M69910b.getUpperBounds();
                AbstractC22676k.m65749i(upperBounds, "getUpperBounds(...)");
                C26466i c26466iM16063k0 = c5101l0.m16063k0(c23758a1, upperBounds, c22309aM69909a);
                if (c26466iM16063k0.f105120w.isEmpty()) {
                    return c5101l0.m16035N(c22309aM69909a);
                }
                if (c26466iM16063k0.f105120w.f105108I == 1) {
                    return (AbstractC23811y) AbstractC25265s.m74140o1(c26466iM16063k0);
                }
                throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
            case 11:
                C35850h c35850h2 = (C35850h) obj;
                C34673e0 c34673e0M83824l = ((AbstractC27736h) this.f39040x).m83824l();
                C35847e c35847e3 = AbstractC27742n.f111886k;
                C22708k c22708k = ((C34665a0) c34673e0M83824l.mo78658F(c35847e3)).f146031H;
                if (c22708k == null) {
                    AbstractC27736h.m83809a(11);
                    throw null;
                }
                InterfaceC31126h contributedClassifier = c22708k.getContributedClassifier(c35850h2, EnumC40212c.f173637w);
                if (contributedClassifier == null) {
                    throw new AssertionError("Built-in class " + c35847e3.m113788a(c35850h2) + " is not found");
                }
                if (contributedClassifier instanceof InterfaceC31117e) {
                    return (InterfaceC31117e) contributedClassifier;
                }
                throw new AssertionError("Must be a class descriptor " + c35850h2 + ", but was " + contributedClassifier);
            case 12:
                C5099k0 c5099k0 = (C5099k0) this.f39040x;
                C36969b kotlinClass = (C36969b) obj;
                AbstractC22676k.m65750j(kotlinClass, "kotlinClass");
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                C38445a c38445a = new C38445a(c5099k0, map, map2);
                Class klass = kotlinClass.f158227a;
                AbstractC22676k.m65750j(klass, "klass");
                Method[] declaredMethods = klass.getDeclaredMethods();
                AbstractC22676k.m65749i(declaredMethods, "getDeclaredMethods(...)");
                int length3 = declaredMethods.length;
                int i14 = 0;
                while (i14 < length3) {
                    Method method = declaredMethods[i14];
                    C27759b c27759bM123173J = c38445a.m123173J(C35850h.m113814e(method.getName()), AbstractC32306h.m100571t(method));
                    Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                    AbstractC22676k.m65749i(declaredAnnotations, "getDeclaredAnnotations(...)");
                    int length4 = declaredAnnotations.length;
                    for (int i15 = i13; i15 < length4; i15++) {
                        Annotation annotation2 = declaredAnnotations[i15];
                        AbstractC22676k.m65747g(annotation2);
                        AbstractC35844b.m113767h(c27759bM123173J, annotation2);
                    }
                    Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                    AbstractC22676k.m65749i(parameterAnnotations, "getParameterAnnotations(...)");
                    Annotation[][] annotationArr = parameterAnnotations;
                    int length5 = annotationArr.length;
                    int i16 = 0;
                    while (i16 < length5) {
                        Annotation[] annotationArr2 = annotationArr[i16];
                        AbstractC22676k.m65747g(annotationArr2);
                        int length6 = annotationArr2.length;
                        Class cls = klass;
                        int i17 = 0;
                        while (i17 < length6) {
                            int i18 = i17;
                            Annotation annotation3 = annotationArr2[i18];
                            Annotation[][] annotationArr3 = annotationArr;
                            Class clsM60663S = AbstractC21598x.m60663S(AbstractC21598x.m60655K(annotation3));
                            Method[] methodArr = declaredMethods;
                            int i19 = length3;
                            C25126d c25126dM83858X = c27759bM123173J.m83858X(i16, AbstractC38109c.m122089a(clsM60663S), new C36968a(annotation3));
                            if (c25126dM83858X != null) {
                                AbstractC35844b.m113768i(c25126dM83858X, annotation3, clsM60663S);
                            }
                            i17 = i18 + 1;
                            declaredMethods = methodArr;
                            annotationArr = annotationArr3;
                            length3 = i19;
                        }
                        i16++;
                        klass = cls;
                    }
                    c27759bM123173J.m45156V();
                    i14++;
                    i13 = 0;
                }
                Class cls2 = klass;
                Constructor<?>[] declaredConstructors = cls2.getDeclaredConstructors();
                AbstractC22676k.m65749i(declaredConstructors, "getDeclaredConstructors(...)");
                int length7 = declaredConstructors.length;
                int i24 = 0;
                while (i24 < length7) {
                    Constructor<?> constructor = declaredConstructors[i24];
                    C35850h c35850h3 = AbstractC35852j.f152628e;
                    AbstractC22676k.m65747g(constructor);
                    C27759b c27759bM123173J2 = c38445a.m123173J(c35850h3, AbstractC32306h.m100556d(constructor));
                    Annotation[] declaredAnnotations2 = constructor.getDeclaredAnnotations();
                    AbstractC22676k.m65749i(declaredAnnotations2, "getDeclaredAnnotations(...)");
                    for (Annotation annotation4 : declaredAnnotations2) {
                        AbstractC22676k.m65747g(annotation4);
                        AbstractC35844b.m113767h(c27759bM123173J2, annotation4);
                    }
                    Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
                    AbstractC22676k.m65747g(parameterAnnotations2);
                    if (parameterAnnotations2.length != 0) {
                        int length8 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                        int length9 = parameterAnnotations2.length;
                        int i25 = 0;
                        while (i25 < length9) {
                            Annotation[] annotationArr4 = parameterAnnotations2[i25];
                            AbstractC22676k.m65747g(annotationArr4);
                            int length10 = annotationArr4.length;
                            Constructor<?>[] constructorArr = declaredConstructors;
                            int i26 = 0;
                            while (i26 < length10) {
                                int i27 = i26;
                                Annotation annotation5 = annotationArr4[i27];
                                int i28 = length7;
                                Class clsM60663S2 = AbstractC21598x.m60663S(AbstractC21598x.m60655K(annotation5));
                                int i29 = i24;
                                int i34 = length8;
                                Annotation[][] annotationArr5 = parameterAnnotations2;
                                C25126d c25126dM83858X2 = c27759bM123173J2.m83858X(i25 + length8, AbstractC38109c.m122089a(clsM60663S2), new C36968a(annotation5));
                                if (c25126dM83858X2 != null) {
                                    AbstractC35844b.m113768i(c25126dM83858X2, annotation5, clsM60663S2);
                                }
                                i26 = i27 + 1;
                                i24 = i29;
                                length7 = i28;
                                length8 = i34;
                                parameterAnnotations2 = annotationArr5;
                            }
                            i25++;
                            declaredConstructors = constructorArr;
                        }
                    }
                    Constructor<?>[] constructorArr2 = declaredConstructors;
                    int i35 = length7;
                    int i36 = i24;
                    c27759bM123173J2.m45156V();
                    i24 = i36 + 1;
                    declaredConstructors = constructorArr2;
                    length7 = i35;
                }
                Field[] declaredFields = cls2.getDeclaredFields();
                AbstractC22676k.m65749i(declaredFields, "getDeclaredFields(...)");
                for (Field field : declaredFields) {
                    C15990r c15990rM123172I = c38445a.m123172I(C35850h.m113814e(field.getName()), AbstractC32306h.m100564l(field));
                    Annotation[] declaredAnnotations3 = field.getDeclaredAnnotations();
                    AbstractC22676k.m65749i(declaredAnnotations3, "getDeclaredAnnotations(...)");
                    for (Annotation annotation6 : declaredAnnotations3) {
                        AbstractC22676k.m65747g(annotation6);
                        AbstractC35844b.m113767h(c15990rM123172I, annotation6);
                    }
                    c15990rM123172I.m45156V();
                }
                return new C27761d(map, map2, map3);
            case 13:
                C30092p c30092p = (C30092p) this.f39040x;
                C23465k c23465k = (C23465k) obj;
                AbstractC22676k.m65750j(c23465k, "<destruct>");
                String str = (String) c23465k.f92937w;
                String str2 = (String) c23465k.f92938x;
                List listM118958J2 = AbstractC37056f.m118958J(AbstractC32303e.m100551a(c30092p.f122798a.f146045E, AbstractC2875y.m8300m("'", str, "()' member of List is redundant in Kotlin and might be removed soon. Please use '", str2, "()' stdlib extension instead"), str2 + "()", "HIDDEN"));
                return listM118958J2.isEmpty() ? C32305g.f133684a : new C32308j(listM118958J2, i13);
            case 14:
                C34664a c34664a = (C34664a) this.f39040x;
                ((C25389f) obj).getClass();
                return (AbstractC23763c0) c34664a.f146026x.f146034x.invoke();
            case 15:
                C34673e0 c34673e0 = (C34673e0) this.f39040x;
                C35847e fqName2 = (C35847e) obj;
                AbstractC22676k.m65750j(fqName2, "fqName");
                InterfaceC34683j0 interfaceC34683j0 = c34673e0.f146047G;
                C22342k storageManager = c34673e0.f146053z;
                ((C34681i0) interfaceC34683j0).getClass();
                AbstractC22676k.m65750j(storageManager, "storageManager");
                return new C34665a0(c34673e0, fqName2, storageManager);
            default:
                C39961j c39961j = (C39961j) obj;
                synchronized (AbstractC39963l.f172462c) {
                    j7 = AbstractC39963l.f172464e;
                    AbstractC39963l.f172464e = ((long) 1) + j7;
                }
                return new C39955e(j7, c39961j, (Function1) this.f39040x);
        }
    }

    public C11934s(List list, C23784k0 c23784k0, InterfaceC23796q0 interfaceC23796q0, boolean z4) {
        this.f39039w = 9;
        this.f39040x = interfaceC23796q0;
    }
}
