package lb3;

import androidx.health.platform.client.proto.C1533u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ka3.C22309a;
import m83.AbstractC25265s;
import nb3.C26552i;
import nb3.C26555l;
import nb3.EnumC26554k;
import p097ds.AbstractC12313p;
import p097ds.AbstractC12314q;
import p715kotlin.jvm.functions.Function1;
import r93.InterfaceC31117e;
import r93.InterfaceC31165x0;
import ub3.AbstractC34756j;
import ub3.C34754h;

/* JADX INFO: renamed from: lb3.d1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC23767d1 {

    /* JADX INFO: renamed from: a */
    public static final C26552i f94137a = C26555l.m78682c(EnumC26554k.DONT_CARE, new String[0]);

    /* JADX INFO: renamed from: b */
    public static final C26552i f94138b = C26555l.m78682c(EnumC26554k.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);

    /* JADX INFO: renamed from: c */
    public static final C23764c1 f94139c = new C23764c1("NO_EXPECTED_TYPE");

    /* JADX INFO: renamed from: d */
    public static final C23764c1 f94140d = new C23764c1("UNIT_EXPECTED_TYPE");

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:75:0x010b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0120  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m69845a(int i13) {
        String str;
        int i14;
        if (i13 != 4 && i13 != 9 && i13 != 11 && i13 != 15 && i13 != 17 && i13 != 19 && i13 != 26 && i13 != 35 && i13 != 48 && i13 != 53 && i13 != 6 && i13 != 7) {
            switch (i13) {
                case 56:
                case 57:
                case 58:
                case 59:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i13 != 4 && i13 != 9 && i13 != 11 && i13 != 15 && i13 != 17 && i13 != 19 && i13 != 26 && i13 != 35 && i13 != 48 && i13 != 53 && i13 != 6 && i13 != 7) {
            switch (i13) {
                case 56:
                case 57:
                case 58:
                case 59:
                    i14 = 2;
                    break;
                default:
                    i14 = 3;
                    break;
            }
        } else {
            i14 = 2;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 5:
            case 8:
            case 10:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 25:
            case 27:
            case 28:
            case 29:
            case 30:
            case 38:
            case 40:
            default:
                objArr[0] = "type";
                break;
            case 12:
                objArr[0] = "typeConstructor";
                break;
            case 13:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case 16:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case 31:
            case 33:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case 34:
                objArr[0] = "projections";
                break;
            case 36:
                objArr[0] = "a";
                break;
            case 37:
                objArr[0] = "b";
                break;
            case 39:
                objArr[0] = "typeParameters";
                break;
            case 41:
                objArr[0] = "typeParameterConstructors";
                break;
            case 42:
                objArr[0] = "specialType";
                break;
            case 43:
            case 44:
                objArr[0] = "isSpecialType";
                break;
            case 45:
            case 46:
                objArr[0] = "parameterDescriptor";
                break;
            case 47:
            case 51:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 49:
            case 50:
                objArr[0] = "supertypes";
                break;
            case 52:
            case 55:
                objArr[0] = "expectedType";
                break;
            case 54:
                objArr[0] = "literalTypeConstructor";
                break;
        }
        if (i13 == 4) {
            objArr[1] = "makeNullableAsSpecified";
        } else if (i13 == 9) {
            objArr[1] = "makeNullableIfNeeded";
        } else if (i13 == 11 || i13 == 15) {
            objArr[1] = "makeUnsubstitutedType";
        } else if (i13 == 17) {
            objArr[1] = "getDefaultTypeProjections";
        } else if (i13 == 19) {
            objArr[1] = "getImmediateSupertypes";
        } else if (i13 == 26) {
            objArr[1] = "getAllSupertypes";
        } else if (i13 == 35) {
            objArr[1] = "substituteProjectionsForParameters";
        } else if (i13 == 48) {
            objArr[1] = "getDefaultPrimitiveNumberType";
        } else if (i13 != 53) {
            if (i13 != 6 && i13 != 7) {
                switch (i13) {
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        objArr[1] = "getPrimitiveNumberType";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                }
            } else {
                objArr[1] = "makeNullableIfNeeded";
            }
        } else {
            objArr[1] = "getPrimitiveNumberType";
        }
        switch (i13) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 12:
            case 13:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case 21:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case 28:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case 33:
            case 34:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 36:
            case 37:
                objArr[2] = "equalTypes";
                break;
            case 38:
            case 39:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 40:
            case 41:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 42:
            case 43:
            case 44:
                objArr[2] = "contains";
                break;
            case 45:
            case 46:
                objArr[2] = "makeStarProjection";
                break;
            case 47:
            case 49:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 50:
                objArr[2] = "findByFqName";
                break;
            case 51:
            case 52:
            case 54:
            case 55:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 60:
                objArr[2] = "isTypeParameter";
                break;
            case 61:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 63:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 4 && i13 != 9 && i13 != 11 && i13 != 15 && i13 != 17 && i13 != 19 && i13 != 26 && i13 != 35 && i13 != 48 && i13 != 53 && i13 != 6 && i13 != 7) {
            switch (i13) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m69846b(AbstractC23811y abstractC23811y) {
        if (abstractC23811y == null) {
            m69845a(28);
            throw null;
        }
        if (abstractC23811y.mo69814k0()) {
            return true;
        }
        return AbstractC12313p.m34258J(abstractC23811y) && m69846b(AbstractC12313p.m34300r(abstractC23811y).f94188y);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m69847c(AbstractC23811y abstractC23811y, Function1 function1, C34754h c34754h) {
        if (abstractC23811y == null) {
            return false;
        }
        AbstractC23773f1 abstractC23773f1Mo69863p0 = abstractC23811y.mo69863p0();
        if (m69856l(abstractC23811y)) {
            return ((Boolean) function1.invoke(abstractC23773f1Mo69863p0)).booleanValue();
        }
        if (c34754h != null && c34754h.contains(abstractC23811y)) {
            return false;
        }
        if (((Boolean) function1.invoke(abstractC23773f1Mo69863p0)).booleanValue()) {
            return true;
        }
        if (c34754h == null) {
            int i13 = C34754h.f146410y;
            c34754h = AbstractC34756j.m109753c();
        }
        c34754h.add(abstractC23811y);
        AbstractC23797r abstractC23797r = abstractC23773f1Mo69863p0 instanceof AbstractC23797r ? (AbstractC23797r) abstractC23773f1Mo69863p0 : null;
        if (abstractC23797r != null && (m69847c(abstractC23797r.f94187x, function1, c34754h) || m69847c(abstractC23797r.f94188y, function1, c34754h))) {
            return true;
        }
        if ((abstractC23773f1Mo69863p0 instanceof C23785l) && m69847c(((C23785l) abstractC23773f1Mo69863p0).f94167x, function1, c34754h)) {
            return true;
        }
        InterfaceC23796q0 interfaceC23796q0Mo69844i0 = abstractC23811y.mo69844i0();
        if (interfaceC23796q0Mo69844i0 instanceof C23809x) {
            Iterator it = ((C23809x) interfaceC23796q0Mo69844i0).f94205x.iterator();
            while (it.hasNext()) {
                if (m69847c((AbstractC23811y) it.next(), function1, c34754h)) {
                    return true;
                }
            }
            return false;
        }
        for (AbstractC23804u0 abstractC23804u0 : abstractC23811y.mo69842X()) {
            if (!abstractC23804u0.mo69869c() && m69847c(abstractC23804u0.mo69868b(), function1, c34754h)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static List m69848d(List list) {
        if (list == null) {
            m69845a(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C23806v0(((InterfaceC31165x0) it.next()).mo60594i()));
        }
        return AbstractC25265s.m74093D1(arrayList);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m69849e(AbstractC23811y abstractC23811y) {
        if (abstractC23811y == null) {
            m69845a(27);
            throw null;
        }
        if (!abstractC23811y.mo69814k0() && (!AbstractC12313p.m34258J(abstractC23811y) || !m69849e(AbstractC12313p.m34300r(abstractC23811y).f94188y))) {
            if (!(abstractC23811y.mo69863p0() instanceof C23785l)) {
                if (m69850f(abstractC23811y)) {
                    if (!(abstractC23811y.mo69844i0().mo1784d() instanceof InterfaceC31117e)) {
                        C23758a1 c23758a1M69818d = C23758a1.m69818d(abstractC23811y);
                        Collection<AbstractC23811y> supertypes = abstractC23811y.mo69844i0().getSupertypes();
                        ArrayList arrayList = new ArrayList(supertypes.size());
                        for (AbstractC23811y abstractC23811y2 : supertypes) {
                            if (abstractC23811y2 == null) {
                                m69845a(21);
                                throw null;
                            }
                            AbstractC23811y abstractC23811yM69823i = c23758a1M69818d.m69823i(abstractC23811y2, EnumC23776g1.INVARIANT);
                            AbstractC23811y abstractC23811yM69852h = abstractC23811yM69823i != null ? m69852h(abstractC23811yM69823i, abstractC23811y.mo69814k0()) : null;
                            if (abstractC23811yM69852h != null) {
                                arrayList.add(abstractC23811yM69852h);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (m69849e((AbstractC23811y) it.next())) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                InterfaceC23796q0 interfaceC23796q0Mo69844i0 = abstractC23811y.mo69844i0();
                if (interfaceC23796q0Mo69844i0 instanceof C23809x) {
                    Iterator it3 = ((C23809x) interfaceC23796q0Mo69844i0).f94205x.iterator();
                    while (it3.hasNext()) {
                        if (m69849e((AbstractC23811y) it3.next())) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m69850f(AbstractC23811y abstractC23811y) {
        if (abstractC23811y == null) {
            m69845a(60);
            throw null;
        }
        if ((abstractC23811y.mo69844i0().mo1784d() instanceof InterfaceC31165x0 ? (InterfaceC31165x0) abstractC23811y.mo69844i0().mo1784d() : null) != null) {
            return true;
        }
        abstractC23811y.mo69844i0();
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static AbstractC23773f1 m69851g(AbstractC23811y abstractC23811y, boolean z4) {
        if (abstractC23811y == null) {
            m69845a(3);
            throw null;
        }
        AbstractC23773f1 abstractC23773f1Mo64125r0 = abstractC23811y.mo69863p0().mo64125r0(z4);
        if (abstractC23773f1Mo64125r0 != null) {
            return abstractC23773f1Mo64125r0;
        }
        m69845a(4);
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public static AbstractC23811y m69852h(AbstractC23811y abstractC23811y, boolean z4) {
        if (abstractC23811y != null) {
            return z4 ? m69851g(abstractC23811y, true) : abstractC23811y;
        }
        m69845a(8);
        throw null;
    }

    /* JADX INFO: renamed from: i */
    public static AbstractC23763c0 m69853i(AbstractC23763c0 abstractC23763c0, boolean z4) {
        if (abstractC23763c0 == null) {
            m69845a(5);
            throw null;
        }
        if (!z4) {
            return abstractC23763c0;
        }
        AbstractC23763c0 abstractC23763c0Mo64125r0 = abstractC23763c0.mo64125r0(true);
        if (abstractC23763c0Mo64125r0 != null) {
            return abstractC23763c0Mo64125r0;
        }
        m69845a(6);
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public static C23778h0 m69854j(InterfaceC31165x0 interfaceC31165x0) {
        if (interfaceC31165x0 != null) {
            return new C23778h0(interfaceC31165x0);
        }
        m69845a(45);
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public static AbstractC23804u0 m69855k(InterfaceC31165x0 interfaceC31165x0, C22309a c22309a) {
        if (interfaceC31165x0 != null) {
            return c22309a.m64111d() == EnumC23761b1.f94123w ? new C23806v0(AbstractC12314q.m34316H(interfaceC31165x0)) : new C23778h0(interfaceC31165x0);
        }
        m69845a(46);
        throw null;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m69856l(AbstractC23811y abstractC23811y) {
        if (abstractC23811y != null) {
            return abstractC23811y == f94139c || abstractC23811y == f94140d;
        }
        m69845a(0);
        throw null;
    }
}
