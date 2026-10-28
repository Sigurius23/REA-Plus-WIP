package lb3;

import androidx.health.platform.client.proto.C1533u;
import io.sentry.config.AbstractC20301a;
import java.util.ArrayList;
import java.util.List;
import ka3.C22316h;
import mb3.C25392i;
import nb3.C26555l;
import nb3.EnumC26554k;
import o93.AbstractC27736h;
import o93.AbstractC27741m;
import ob3.InterfaceC27804n;
import p088dc.AbstractC11894a;
import p095dp.AbstractC12240d;
import p097ds.AbstractC12313p;
import p108e4.AbstractC12682p;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22674j;
import r93.InterfaceC31165x0;
import s93.C32308j;
import s93.C32312n;
import s93.InterfaceC32307i;
import se.AbstractC32410a;
import ub3.AbstractC34756j;
import za3.InterfaceC40247b;

/* JADX INFO: renamed from: lb3.a1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23758a1 implements InterfaceC27804n {

    /* JADX INFO: renamed from: b */
    public static final C23758a1 f94121b = new C23758a1(AbstractC23812y0.f94209a);

    /* JADX INFO: renamed from: a */
    public final AbstractC23812y0 f94122a;

    public C23758a1(AbstractC23812y0 abstractC23812y0) {
        this.f94122a = abstractC23812y0;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m69815a(int i13) {
        String str;
        int i14;
        if (i13 != 1 && i13 != 2 && i13 != 8 && i13 != 34 && i13 != 37) {
            switch (i13) {
                default:
                    switch (i13) {
                        default:
                            switch (i13) {
                                default:
                                    switch (i13) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        case 20:
                        case 21:
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        case 24:
                        case 25:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i13 != 1 && i13 != 2 && i13 != 8 && i13 != 34 && i13 != 37) {
            switch (i13) {
                case 11:
                case 12:
                case 13:
                    i14 = 2;
                    break;
                default:
                    switch (i13) {
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        case 20:
                        case 21:
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        case 24:
                        case 25:
                            i14 = 2;
                            break;
                        default:
                            switch (i13) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    i14 = 2;
                                    break;
                                default:
                                    switch (i13) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            i14 = 2;
                                            break;
                                        default:
                                            i14 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i14 = 2;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 20:
            case 21:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 7:
            default:
                objArr[0] = "substitution";
                break;
            case 9:
            case 14:
                objArr[0] = "type";
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case 28:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case 35:
            case 38:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
        }
        if (i13 == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i13 == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i13 == 8) {
            objArr[1] = "getSubstitution";
        } else if (i13 == 34) {
            objArr[1] = "filterOutUnsafeVariance";
        } else if (i13 != 37) {
            switch (i13) {
                case 11:
                case 12:
                case 13:
                    objArr[1] = "safeSubstitute";
                    break;
                default:
                    switch (i13) {
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        case 20:
                        case 21:
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        case 24:
                        case 25:
                            objArr[1] = "unsafeSubstitute";
                            break;
                        default:
                            switch (i13) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                    break;
                                default:
                                    switch (i13) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            objArr[1] = "combine";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "combine";
        }
        switch (i13) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 20:
            case 21:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 5:
            case 6:
            default:
                objArr[2] = "create";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case 16:
                objArr[2] = "substitute";
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case 28:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case 38:
            case 39:
                objArr[2] = "combine";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 1 && i13 != 2 && i13 != 8 && i13 != 34 && i13 != 37) {
            switch (i13) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i13) {
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        case 20:
                        case 21:
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i13) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i13) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b */
    public static EnumC23776g1 m69816b(EnumC23776g1 enumC23776g1, EnumC23776g1 enumC23776g2) {
        if (enumC23776g1 == null) {
            m69815a(38);
            throw null;
        }
        if (enumC23776g2 == null) {
            m69815a(39);
            throw null;
        }
        EnumC23776g1 enumC23776g3 = EnumC23776g1.INVARIANT;
        if (enumC23776g1 == enumC23776g3) {
            if (enumC23776g2 != null) {
                return enumC23776g2;
            }
            m69815a(40);
            throw null;
        }
        if (enumC23776g2 == enumC23776g3) {
            if (enumC23776g1 != null) {
                return enumC23776g1;
            }
            m69815a(41);
            throw null;
        }
        if (enumC23776g1 == enumC23776g2) {
            if (enumC23776g2 != null) {
                return enumC23776g2;
            }
            m69815a(42);
            throw null;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + enumC23776g1 + "' and projection kind '" + enumC23776g2 + "' cannot be combined");
    }

    /* JADX INFO: renamed from: c */
    public static int m69817c(EnumC23776g1 enumC23776g1, EnumC23776g1 enumC23776g2) {
        EnumC23776g1 enumC23776g3 = EnumC23776g1.IN_VARIANCE;
        if (enumC23776g1 == enumC23776g3 && enumC23776g2 == EnumC23776g1.OUT_VARIANCE) {
            return 3;
        }
        return (enumC23776g1 == EnumC23776g1.OUT_VARIANCE && enumC23776g2 == enumC23776g3) ? 2 : 1;
    }

    /* JADX INFO: renamed from: d */
    public static C23758a1 m69818d(AbstractC23811y abstractC23811y) {
        if (abstractC23811y == null) {
            m69815a(6);
            throw null;
        }
        return new C23758a1(AbstractC23800s0.f94190b.m69841f(abstractC23811y.mo69844i0(), abstractC23811y.mo69842X()));
    }

    /* JADX INFO: renamed from: e */
    public static C23758a1 m69819e(AbstractC23812y0 abstractC23812y0, AbstractC23812y0 abstractC23812y1) {
        if (abstractC23812y0 == null) {
            m69815a(3);
            throw null;
        }
        if (abstractC23812y1 == null) {
            m69815a(4);
            throw null;
        }
        if (abstractC23812y0.mo69908e()) {
            abstractC23812y0 = abstractC23812y1;
        } else if (!abstractC23812y1.mo69908e()) {
            abstractC23812y0 = new C23793p(abstractC23812y0, abstractC23812y1);
        }
        return new C23758a1(abstractC23812y0);
    }

    /* JADX INFO: renamed from: h */
    public static String m69820h(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th3) {
            if (AbstractC34756j.m109754d(th3)) {
                throw th3;
            }
            return AbstractC36095b.m114681i("[Exception while computing toString(): ", "]", th3);
        }
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC23812y0 m69821f() {
        AbstractC23812y0 abstractC23812y0 = this.f94122a;
        if (abstractC23812y0 != null) {
            return abstractC23812y0;
        }
        m69815a(8);
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC23811y m69822g(AbstractC23811y abstractC23811y, EnumC23776g1 enumC23776g1) {
        if (abstractC23811y == null) {
            m69815a(9);
            throw null;
        }
        if (this.f94122a.mo69908e()) {
            return abstractC23811y;
        }
        try {
            AbstractC23811y abstractC23811yMo69868b = m69824j(new C23806v0(abstractC23811y, enumC23776g1), null, 0).mo69868b();
            if (abstractC23811yMo69868b != null) {
                return abstractC23811yMo69868b;
            }
            m69815a(12);
            throw null;
        } catch (C23814z0 e5) {
            return C26555l.m78682c(EnumC26554k.UNABLE_TO_SUBSTITUTE_TYPE, e5.getMessage());
        }
    }

    /* JADX INFO: renamed from: i */
    public final AbstractC23811y m69823i(AbstractC23811y abstractC23811y, EnumC23776g1 enumC23776g1) {
        if (abstractC23811y == null) {
            m69815a(14);
            throw null;
        }
        if (enumC23776g1 == null) {
            m69815a(15);
            throw null;
        }
        AbstractC23804u0 c23806v0 = new C23806v0(m69821f().mo69902f(abstractC23811y, enumC23776g1), enumC23776g1);
        AbstractC23812y0 abstractC23812y0 = this.f94122a;
        if (!abstractC23812y0.mo69908e()) {
            try {
                c23806v0 = m69824j(c23806v0, null, 0);
            } catch (C23814z0 unused) {
                c23806v0 = null;
            }
        }
        if (abstractC23812y0.mo69899a() || abstractC23812y0.mo69900b()) {
            c23806v0 = AbstractC12240d.m34079p(c23806v0, abstractC23812y0.mo69900b());
        }
        if (c23806v0 == null) {
            return null;
        }
        return c23806v0.mo69868b();
    }

    /* JADX WARN: Code duplicated, block: B:104:0x021c  */
    /* JADX WARN: Multi-variable type inference failed */
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
    /* JADX INFO: renamed from: j */
    public final AbstractC23804u0 m69824j(AbstractC23804u0 abstractC23804u0, InterfaceC31165x0 interfaceC31165x0, int i13) throws C23814z0 {
        C23758a1 c23758a1;
        AbstractC23811y abstractC23811yM69823i = null;
        if (abstractC23804u0 == null) {
            m69815a(18);
            throw null;
        }
        AbstractC23812y0 abstractC23812y0 = this.f94122a;
        if (i13 > 100) {
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + m69820h(abstractC23804u0) + "; substitution: " + m69820h(abstractC23812y0));
        }
        if (!abstractC23804u0.mo69869c()) {
            AbstractC23811y abstractC23811yMo69868b = abstractC23804u0.mo69868b();
            int i14 = 1;
            if (abstractC23811yMo69868b instanceof InterfaceC23770e1) {
                InterfaceC23770e1 interfaceC23770e1 = (InterfaceC23770e1) abstractC23811yMo69868b;
                AbstractC23773f1 abstractC23773f1Mo69857G = interfaceC23770e1.mo69857G();
                AbstractC23811y abstractC23811yMo69858b = interfaceC23770e1.mo69858b();
                AbstractC23804u0 abstractC23804u0M69824j = m69824j(new C23806v0(abstractC23773f1Mo69857G, abstractC23804u0.mo69867a()), interfaceC31165x0, i13 + 1);
                return abstractC23804u0M69824j.mo69869c() ? abstractC23804u0M69824j : new C23806v0(AbstractC23791o.m69897p(abstractC23804u0M69824j.mo69868b().mo69863p0(), m69823i(abstractC23811yMo69858b, abstractC23804u0.mo69867a())), abstractC23804u0M69824j.mo69867a());
            }
            AbstractC11894a.m31938F(abstractC23811yMo69868b);
            if (!(abstractC23811yMo69868b.mo69863p0() instanceof C22316h)) {
                AbstractC23804u0 abstractC23804u0Mo64119d = abstractC23812y0.mo64119d(abstractC23811yMo69868b);
                if (abstractC23804u0Mo64119d == null) {
                    abstractC23804u0Mo64119d = null;
                } else if (abstractC23811yMo69868b.getAnnotations().mo52688J(AbstractC27741m.f111874y)) {
                    InterfaceC23796q0 interfaceC23796q0Mo69844i0 = abstractC23804u0Mo64119d.mo69868b().mo69844i0();
                    if (interfaceC23796q0Mo69844i0 instanceof C25392i) {
                        AbstractC23804u0 abstractC23804u0Mo74523b = ((C25392i) interfaceC23796q0Mo69844i0).mo74523b();
                        EnumC23776g1 enumC23776g1Mo69867a = abstractC23804u0Mo74523b.mo69867a();
                        if (m69817c(abstractC23804u0.mo69867a(), enumC23776g1Mo69867a) == 3) {
                            abstractC23804u0Mo64119d = new C23806v0(abstractC23804u0Mo74523b.mo69868b());
                        } else if (interfaceC31165x0 != null && m69817c(interfaceC31165x0.getVariance(), enumC23776g1Mo69867a) == 3) {
                            abstractC23804u0Mo64119d = new C23806v0(abstractC23804u0Mo74523b.mo69868b());
                        }
                    }
                }
                EnumC23776g1 enumC23776g1Mo69867a2 = abstractC23804u0.mo69867a();
                if (abstractC23804u0Mo64119d == null && AbstractC12313p.m34258J(abstractC23811yMo69868b) && !AbstractC22674j.m65704L(abstractC23811yMo69868b)) {
                    AbstractC23797r abstractC23797rM34300r = AbstractC12313p.m34300r(abstractC23811yMo69868b);
                    AbstractC23763c0 abstractC23763c0 = abstractC23797rM34300r.f94188y;
                    AbstractC23763c0 abstractC23763c1 = abstractC23797rM34300r.f94187x;
                    int i15 = i13 + 1;
                    AbstractC23804u0 abstractC23804u0M69824j2 = m69824j(new C23806v0(abstractC23763c1, enumC23776g1Mo69867a2), interfaceC31165x0, i15);
                    AbstractC23804u0 abstractC23804u0M69824j3 = m69824j(new C23806v0(abstractC23763c0, enumC23776g1Mo69867a2), interfaceC31165x0, i15);
                    EnumC23776g1 enumC23776g1Mo69867a3 = abstractC23804u0M69824j2.mo69867a();
                    if (abstractC23804u0M69824j2.mo69868b() != abstractC23763c1 || abstractC23804u0M69824j3.mo69868b() != abstractC23763c0) {
                        return new C23806v0(AbstractC23791o.m69883b(AbstractC32410a.m101050t(abstractC23804u0M69824j2.mo69868b()), AbstractC32410a.m101050t(abstractC23804u0M69824j3.mo69868b())), enumC23776g1Mo69867a3);
                    }
                } else if (!AbstractC27736h.m83804F(abstractC23811yMo69868b) && !AbstractC23791o.m69886e(abstractC23811yMo69868b)) {
                    if (abstractC23804u0Mo64119d != null) {
                        int iM69817c = m69817c(enumC23776g1Mo69867a2, abstractC23804u0Mo64119d.mo69867a());
                        if (!(abstractC23811yMo69868b.mo69844i0() instanceof InterfaceC40247b)) {
                            int iM35485e = AbstractC12682p.m35485e(iM69817c);
                            if (iM35485e == 1) {
                                return new C23806v0(abstractC23811yMo69868b.mo69844i0().mo1783c().m83828p(), EnumC23776g1.OUT_VARIANCE);
                            }
                            if (iM35485e == 2) {
                                throw new C23814z0("Out-projection in in-position");
                            }
                        }
                        InterfaceC23781j interfaceC23781jM65696D = AbstractC22674j.m65696D(abstractC23811yMo69868b);
                        if (abstractC23804u0Mo64119d.mo69869c()) {
                            return abstractC23804u0Mo64119d;
                        }
                        AbstractC23811y abstractC23811yMo69875l = interfaceC23781jM65696D != null ? interfaceC23781jM65696D.mo69875l(abstractC23804u0Mo64119d.mo69868b()) : AbstractC23767d1.m69852h(abstractC23804u0Mo64119d.mo69868b(), abstractC23811yMo69868b.mo69814k0());
                        if (!abstractC23811yMo69868b.getAnnotations().isEmpty()) {
                            InterfaceC32307i interfaceC32307iMo69901c = abstractC23812y0.mo69901c(abstractC23811yMo69868b.getAnnotations());
                            if (interfaceC32307iMo69901c == null) {
                                m69815a(33);
                                throw null;
                            }
                            if (interfaceC32307iMo69901c.mo52688J(AbstractC27741m.f111874y)) {
                                interfaceC32307iMo69901c = new C32312n(interfaceC32307iMo69901c, new C23807w(i14));
                            }
                            abstractC23811yMo69875l = AbstractC20301a.m56320S(abstractC23811yMo69875l, new C32308j(new InterfaceC32307i[]{abstractC23811yMo69875l.getAnnotations(), interfaceC32307iMo69901c}));
                        }
                        if (iM69817c == 1) {
                            enumC23776g1Mo69867a2 = m69816b(enumC23776g1Mo69867a2, abstractC23804u0Mo64119d.mo69867a());
                        }
                        return new C23806v0(abstractC23811yMo69875l, enumC23776g1Mo69867a2);
                    }
                    AbstractC23811y abstractC23811yMo69868b2 = abstractC23804u0.mo69868b();
                    EnumC23776g1 enumC23776g1Mo69867a4 = abstractC23804u0.mo69867a();
                    if (!(abstractC23811yMo69868b2.mo69844i0().mo1784d() instanceof InterfaceC31165x0)) {
                        AbstractC23773f1 abstractC23773f1Mo69863p0 = abstractC23811yMo69868b2.mo69863p0();
                        C23756a c23756a = abstractC23773f1Mo69863p0 instanceof C23756a ? (C23756a) abstractC23773f1Mo69863p0 : null;
                        AbstractC23763c0 abstractC23763c0M69813z0 = c23756a != null ? c23756a.m69813z0() : null;
                        if (abstractC23763c0M69813z0 != null) {
                            if (abstractC23812y0 instanceof C23803u) {
                                C23803u c23803u = (C23803u) abstractC23812y0;
                                if (c23803u.f94197d) {
                                    c23758a1 = new C23758a1(new C23803u(c23803u.f94195b, c23803u.f94196c, false));
                                } else {
                                    c23758a1 = this;
                                }
                            } else {
                                c23758a1 = this;
                            }
                            abstractC23811yM69823i = c23758a1.m69823i(abstractC23763c0M69813z0, EnumC23776g1.INVARIANT);
                        }
                        List parameters = abstractC23811yMo69868b2.mo69844i0().getParameters();
                        List listMo69842X = abstractC23811yMo69868b2.mo69842X();
                        ArrayList arrayList = new ArrayList(parameters.size());
                        boolean z4 = false;
                        for (int i16 = 0; i16 < parameters.size(); i16++) {
                            InterfaceC31165x0 interfaceC31165x1 = (InterfaceC31165x0) parameters.get(i16);
                            AbstractC23804u0 abstractC23804u1 = (AbstractC23804u0) listMo69842X.get(i16);
                            AbstractC23804u0 abstractC23804u0M69824j4 = m69824j(abstractC23804u1, interfaceC31165x1, i13 + 1);
                            int iM35485e2 = AbstractC12682p.m35485e(m69817c(interfaceC31165x1.getVariance(), abstractC23804u0M69824j4.mo69867a()));
                            if (iM35485e2 == 0) {
                                EnumC23776g1 variance = interfaceC31165x1.getVariance();
                                EnumC23776g1 enumC23776g1 = EnumC23776g1.INVARIANT;
                                if (variance != enumC23776g1 && !abstractC23804u0M69824j4.mo69869c()) {
                                    abstractC23804u0M69824j4 = new C23806v0(abstractC23804u0M69824j4.mo69868b(), enumC23776g1);
                                }
                            } else if (iM35485e2 == 1 || iM35485e2 == 2) {
                                abstractC23804u0M69824j4 = AbstractC23767d1.m69854j(interfaceC31165x1);
                            }
                            if (abstractC23804u0M69824j4 != abstractC23804u1) {
                                z4 = true;
                            }
                            arrayList.add(abstractC23804u0M69824j4);
                        }
                        if (z4) {
                            listMo69842X = arrayList;
                        }
                        AbstractC23811y abstractC23811yM101012U = AbstractC32410a.m101012U(abstractC23811yMo69868b2, listMo69842X, abstractC23812y0.mo69901c(abstractC23811yMo69868b2.getAnnotations()));
                        if ((abstractC23811yM101012U instanceof AbstractC23763c0) && (abstractC23811yM69823i instanceof AbstractC23763c0)) {
                            abstractC23811yM101012U = AbstractC23791o.m69896o((AbstractC23763c0) abstractC23811yM101012U, (AbstractC23763c0) abstractC23811yM69823i);
                        }
                        return new C23806v0(abstractC23811yM101012U, enumC23776g1Mo69867a4);
                    }
                }
            }
        }
        return abstractC23804u0;
    }
}
