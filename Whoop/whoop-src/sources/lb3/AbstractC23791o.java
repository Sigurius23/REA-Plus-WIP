package lb3;

import cb3.AbstractC4393e;
import dc3.C11934s;
import io.sentry.config.AbstractC20301a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import m83.AbstractC25267u;
import mb3.C25389f;
import nb3.C26552i;
import nb3.C26555l;
import nb3.EnumC26551h;
import p000.C31931s;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import r93.InterfaceC31135k;
import r93.InterfaceC31163w0;
import r93.InterfaceC31165x0;
import u93.AbstractC34669c0;
import u93.AbstractC34690n;
import u93.C34705u0;

/* JADX INFO: renamed from: lb3.o */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC23791o {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m69882a(int i13) {
        String str = i13 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i13 != 4 ? 3 : 2];
        switch (i13) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i13 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i13 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i13 == 4) {
            throw new IllegalStateException(str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC23773f1 m69883b(AbstractC23763c0 lowerBound, AbstractC23763c0 upperBound) {
        AbstractC22676k.m65750j(lowerBound, "lowerBound");
        AbstractC22676k.m65750j(upperBound, "upperBound");
        return lowerBound.equals(upperBound) ? lowerBound : new C23799s(lowerBound, upperBound);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final AbstractC23811y m69884c(AbstractC23811y abstractC23811y) {
        AbstractC22676k.m65750j(abstractC23811y, "<this>");
        if (abstractC23811y instanceof InterfaceC23770e1) {
            return ((InterfaceC23770e1) abstractC23811y).mo69858b();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final AbstractC23773f1 m69885d(AbstractC23773f1 abstractC23773f1, AbstractC23811y origin) {
        AbstractC22676k.m65750j(abstractC23773f1, "<this>");
        AbstractC22676k.m65750j(origin, "origin");
        return m69897p(abstractC23773f1, m69884c(origin));
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m69886e(AbstractC23811y abstractC23811y) {
        AbstractC22676k.m65750j(abstractC23811y, "<this>");
        AbstractC23773f1 abstractC23773f1Mo69863p0 = abstractC23811y.mo69863p0();
        if (abstractC23773f1Mo69863p0 instanceof C26552i) {
            return true;
        }
        return (abstractC23773f1Mo69863p0 instanceof AbstractC23797r) && (((AbstractC23797r) abstractC23773f1Mo69863p0).mo64129u0() instanceof C26552i);
    }

    /* JADX INFO: renamed from: f */
    public static final AbstractC23773f1 m69887f(AbstractC23773f1 abstractC23773f1, boolean z4) {
        AbstractC22676k.m65750j(abstractC23773f1, "<this>");
        C23785l c23785lM69839m = C23765d.m69839m(abstractC23773f1, z4);
        if (c23785lM69839m != null) {
            return c23785lM69839m;
        }
        AbstractC23763c0 abstractC23763c0M69888g = m69888g(abstractC23773f1);
        return abstractC23763c0M69888g != null ? abstractC23763c0M69888g : abstractC23773f1.mo64125r0(false);
    }

    /* JADX INFO: renamed from: g */
    public static final AbstractC23763c0 m69888g(AbstractC23773f1 abstractC23773f1) {
        C23809x c23809x;
        InterfaceC23796q0 interfaceC23796q0Mo69844i0 = abstractC23773f1.mo69844i0();
        C23809x c23809x2 = interfaceC23796q0Mo69844i0 instanceof C23809x ? (C23809x) interfaceC23796q0Mo69844i0 : null;
        if (c23809x2 != null) {
            LinkedHashSet<AbstractC23811y> linkedHashSet = c23809x2.f94205x;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(linkedHashSet, 10));
            boolean z4 = false;
            for (AbstractC23811y abstractC23811yM69887f : linkedHashSet) {
                if (AbstractC23767d1.m69849e(abstractC23811yM69887f)) {
                    abstractC23811yM69887f = m69887f(abstractC23811yM69887f.mo69863p0(), false);
                    z4 = true;
                }
                arrayList.add(abstractC23811yM69887f);
            }
            if (z4) {
                AbstractC23811y abstractC23811yM69887f2 = c23809x2.f94204w;
                if (abstractC23811yM69887f2 == null) {
                    abstractC23811yM69887f2 = null;
                } else if (AbstractC23767d1.m69849e(abstractC23811yM69887f2)) {
                    abstractC23811yM69887f2 = m69887f(abstractC23811yM69887f2.mo69863p0(), false);
                }
                arrayList.isEmpty();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
                linkedHashSet2.hashCode();
                c23809x = new C23809x(linkedHashSet2);
                c23809x.f94204w = abstractC23811yM69887f2;
            } else {
                c23809x = null;
            }
            if (c23809x != null) {
                return c23809x.m69912a();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final AbstractC23763c0 m69889h(C23784k0 attributes, InterfaceC31117e descriptor, List arguments) {
        AbstractC22676k.m65750j(attributes, "attributes");
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(arguments, "arguments");
        InterfaceC23796q0 interfaceC23796q0Mo60496e = descriptor.mo60496e();
        AbstractC22676k.m65749i(interfaceC23796q0Mo60496e, "getTypeConstructor(...)");
        return m69890i(arguments, attributes, interfaceC23796q0Mo60496e, false);
    }

    /* JADX INFO: renamed from: i */
    public static AbstractC23763c0 m69890i(List arguments, C23784k0 attributes, InterfaceC23796q0 constructor, boolean z4) {
        InterfaceC22712o interfaceC22712oM65739y;
        AbstractC34669c0 abstractC34669c0;
        InterfaceC22712o interfaceC22712oMo78653b;
        InterfaceC22712o interfaceC22712o;
        InterfaceC22712o interfaceC22712oMo60499l;
        AbstractC22676k.m65750j(attributes, "attributes");
        AbstractC22676k.m65750j(constructor, "constructor");
        AbstractC22676k.m65750j(arguments, "arguments");
        if (attributes.isEmpty() && arguments.isEmpty() && !z4 && constructor.mo1784d() != null) {
            InterfaceC31126h interfaceC31126hMo1784d = constructor.mo1784d();
            AbstractC22676k.m65747g(interfaceC31126hMo1784d);
            AbstractC23763c0 abstractC23763c0Mo60594i = interfaceC31126hMo1784d.mo60594i();
            AbstractC22676k.m65749i(abstractC23763c0Mo60594i, "getDefaultType(...)");
            return abstractC23763c0Mo60594i;
        }
        InterfaceC31135k interfaceC31135kMo1784d = constructor.mo1784d();
        if (interfaceC31135kMo1784d instanceof InterfaceC31165x0) {
            interfaceC22712oM65739y = ((InterfaceC31165x0) interfaceC31135kMo1784d).mo60594i().mo64128u();
        } else {
            if (interfaceC31135kMo1784d instanceof InterfaceC31117e) {
                AbstractC4393e.m13811i(AbstractC4393e.m13812j(interfaceC31135kMo1784d));
                boolean zIsEmpty = arguments.isEmpty();
                C25389f c25389f = C25389f.f99474a;
                if (zIsEmpty) {
                    InterfaceC31117e interfaceC31117e = (InterfaceC31117e) interfaceC31135kMo1784d;
                    abstractC34669c0 = interfaceC31117e instanceof AbstractC34669c0 ? (AbstractC34669c0) interfaceC31117e : null;
                    if (abstractC34669c0 == null || (interfaceC22712oMo60499l = abstractC34669c0.mo60499l(c25389f)) == null) {
                        interfaceC22712oM65739y = interfaceC31117e.mo60489K();
                        AbstractC22676k.m65749i(interfaceC22712oM65739y, "getUnsubstitutedMemberScope(...)");
                    } else {
                        interfaceC22712o = interfaceC22712oMo60499l;
                    }
                } else {
                    InterfaceC31117e interfaceC31117e2 = (InterfaceC31117e) interfaceC31135kMo1784d;
                    AbstractC23812y0 abstractC23812y0M69841f = AbstractC23800s0.f94190b.m69841f(constructor, arguments);
                    abstractC34669c0 = interfaceC31117e2 instanceof AbstractC34669c0 ? (AbstractC34669c0) interfaceC31117e2 : null;
                    if (abstractC34669c0 == null || (interfaceC22712oMo78653b = abstractC34669c0.mo78653b(abstractC23812y0M69841f, c25389f)) == null) {
                        interfaceC22712oM65739y = interfaceC31117e2.mo95863n(abstractC23812y0M69841f);
                        AbstractC22676k.m65749i(interfaceC22712oM65739y, "getMemberScope(...)");
                    } else {
                        interfaceC22712o = interfaceC22712oMo78653b;
                    }
                }
                return m69893l(attributes, constructor, arguments, z4, interfaceC22712o, new C11934s(arguments, attributes, constructor, z4));
            }
            if (interfaceC31135kMo1784d instanceof InterfaceC31163w0) {
                EnumC26551h enumC26551h = EnumC26551h.SCOPE_FOR_ABBREVIATION_TYPE;
                String str = ((AbstractC34690n) ((InterfaceC31163w0) interfaceC31135kMo1784d)).getName().f152620w;
                AbstractC22676k.m65749i(str, "toString(...)");
                interfaceC22712oM65739y = C26555l.m78680a(enumC26551h, true, str);
            } else {
                if (!(constructor instanceof C23809x)) {
                    throw new IllegalStateException("Unsupported classifier: " + interfaceC31135kMo1784d + " for constructor: " + constructor);
                }
                interfaceC22712oM65739y = AbstractC22674j.m65739y("member scope for intersection type", ((C23809x) constructor).f94205x);
            }
        }
        interfaceC22712o = interfaceC22712oM65739y;
        return m69893l(attributes, constructor, arguments, z4, interfaceC22712o, new C11934s(arguments, attributes, constructor, z4));
    }

    /* JADX INFO: renamed from: j */
    public static AbstractC23763c0 m69891j(AbstractC23763c0 baseType, InterfaceC23796q0 interfaceC23796q0) {
        C23784k0 annotations = baseType.mo69843Y();
        List arguments = baseType.mo69842X();
        boolean zMo69814k0 = baseType.mo69814k0();
        AbstractC22676k.m65750j(baseType, "baseType");
        AbstractC22676k.m65750j(annotations, "annotations");
        AbstractC22676k.m65750j(arguments, "arguments");
        return m69890i(arguments, annotations, interfaceC23796q0, zMo69814k0);
    }

    /* JADX INFO: renamed from: k */
    public static final AbstractC23763c0 m69892k(List arguments, InterfaceC22712o memberScope, C23784k0 attributes, InterfaceC23796q0 constructor, boolean z4) {
        AbstractC22676k.m65750j(attributes, "attributes");
        AbstractC22676k.m65750j(constructor, "constructor");
        AbstractC22676k.m65750j(arguments, "arguments");
        AbstractC22676k.m65750j(memberScope, "memberScope");
        C23766d0 c23766d0 = new C23766d0(constructor, arguments, z4, memberScope, new C31931s(arguments, memberScope, attributes, constructor, z4));
        return attributes.isEmpty() ? c23766d0 : new C23769e0(c23766d0, attributes);
    }

    /* JADX INFO: renamed from: l */
    public static final AbstractC23763c0 m69893l(C23784k0 attributes, InterfaceC23796q0 constructor, List arguments, boolean z4, InterfaceC22712o memberScope, Function1 function1) {
        AbstractC22676k.m65750j(attributes, "attributes");
        AbstractC22676k.m65750j(constructor, "constructor");
        AbstractC22676k.m65750j(arguments, "arguments");
        AbstractC22676k.m65750j(memberScope, "memberScope");
        C23766d0 c23766d0 = new C23766d0(constructor, arguments, z4, memberScope, function1);
        return attributes.isEmpty() ? c23766d0 : new C23769e0(c23766d0, attributes);
    }

    /* JADX INFO: renamed from: m */
    public static C23758a1 m69894m(List list, AbstractC23812y0 abstractC23812y0, InterfaceC31135k interfaceC31135k, ArrayList arrayList) {
        if (abstractC23812y0 == null) {
            m69882a(1);
            throw null;
        }
        if (interfaceC31135k == null) {
            m69882a(2);
            throw null;
        }
        if (arrayList == null) {
            m69882a(3);
            throw null;
        }
        C23758a1 c23758a1M69895n = m69895n(list, abstractC23812y0, interfaceC31135k, arrayList, null);
        if (c23758a1M69895n != null) {
            return c23758a1M69895n;
        }
        throw new AssertionError("Substitution failed");
    }

    /* JADX INFO: renamed from: n */
    public static C23758a1 m69895n(List list, AbstractC23812y0 abstractC23812y0, InterfaceC31135k interfaceC31135k, List list2, boolean[] zArr) {
        if (abstractC23812y0 == null) {
            m69882a(6);
            throw null;
        }
        if (interfaceC31135k == null) {
            m69882a(7);
            throw null;
        }
        if (list2 == null) {
            m69882a(8);
            throw null;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            InterfaceC31165x0 interfaceC31165x0 = (InterfaceC31165x0) it.next();
            C34705u0 c34705u0M109617M0 = C34705u0.m109617M0(interfaceC31135k, interfaceC31165x0.getAnnotations(), interfaceC31165x0.isReified(), interfaceC31165x0.getVariance(), interfaceC31165x0.getName(), i13, interfaceC31165x0.mo95862z());
            map.put(interfaceC31165x0.mo60496e(), new C23806v0(c34705u0M109617M0.mo60594i()));
            map2.put(interfaceC31165x0, c34705u0M109617M0);
            list2.add(c34705u0M109617M0);
            i13++;
        }
        C23798r0 c23798r0 = new C23798r0(map);
        C23758a1 c23758a1M69819e = C23758a1.m69819e(abstractC23812y0, c23798r0);
        C23758a1 c23758a1M69819e2 = C23758a1.m69819e(new C23810x0(abstractC23812y0), c23798r0);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            InterfaceC31165x0 interfaceC31165x1 = (InterfaceC31165x0) it3.next();
            C34705u0 c34705u0 = (C34705u0) map2.get(interfaceC31165x1);
            for (AbstractC23811y abstractC23811y : interfaceC31165x1.getUpperBounds()) {
                InterfaceC31126h interfaceC31126hMo1784d = abstractC23811y.mo69844i0().mo1784d();
                AbstractC23811y abstractC23811yM69823i = (((interfaceC31126hMo1784d instanceof InterfaceC31165x0) && AbstractC20301a.m56309H((InterfaceC31165x0) interfaceC31126hMo1784d)) ? c23758a1M69819e : c23758a1M69819e2).m69823i(abstractC23811y, EnumC23776g1.OUT_VARIANCE);
                if (abstractC23811yM69823i == null) {
                    return null;
                }
                if (abstractC23811yM69823i != abstractC23811y && zArr != null) {
                    zArr[0] = true;
                }
                c34705u0.m109620L0(abstractC23811yM69823i);
            }
            c34705u0.m109623Q0();
        }
        return c23758a1M69819e;
    }

    /* JADX INFO: renamed from: o */
    public static final AbstractC23763c0 m69896o(AbstractC23763c0 abstractC23763c0, AbstractC23763c0 abbreviatedType) {
        AbstractC22676k.m65750j(abstractC23763c0, "<this>");
        AbstractC22676k.m65750j(abbreviatedType, "abbreviatedType");
        return m69886e(abstractC23763c0) ? abstractC23763c0 : new C23756a(abstractC23763c0, abbreviatedType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static final AbstractC23773f1 m69897p(AbstractC23773f1 abstractC23773f1, AbstractC23811y abstractC23811y) {
        AbstractC22676k.m65750j(abstractC23773f1, "<this>");
        if (abstractC23773f1 instanceof InterfaceC23770e1) {
            return m69897p(((InterfaceC23770e1) abstractC23773f1).mo69857G(), abstractC23811y);
        }
        if (abstractC23811y == null || abstractC23811y.equals(abstractC23773f1)) {
            return abstractC23773f1;
        }
        if (abstractC23773f1 instanceof AbstractC23763c0) {
            return new C23772f0((AbstractC23763c0) abstractC23773f1, abstractC23811y);
        }
        if (abstractC23773f1 instanceof AbstractC23797r) {
            return new C23801t((AbstractC23797r) abstractC23773f1, abstractC23811y);
        }
        throw new NoWhenBranchMatchedException();
    }
}
