package ya3;

import androidx.health.platform.client.proto.C1533u;
import bd3.C3119e0;
import cb3.AbstractC4393e;
import fb3.C14340a;
import fb3.C14341b;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import lb3.AbstractC23763c0;
import lb3.AbstractC23791o;
import lb3.AbstractC23811y;
import lb3.C23784k0;
import lb3.C23806v0;
import lb3.EnumC23776g1;
import lb3.InterfaceC23796q0;
import o93.AbstractC27736h;
import o93.AbstractC27742n;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.AbstractC31150q;
import r93.AbstractC31152r;
import r93.C31148p;
import r93.EnumC31106a0;
import r93.EnumC31120f;
import r93.InterfaceC31108b;
import r93.InterfaceC31109b0;
import r93.InterfaceC31111c;
import r93.InterfaceC31117e;
import r93.InterfaceC31135k;
import r93.InterfaceC31145n0;
import r93.InterfaceC31155s0;
import r93.InterfaceC31162w;
import s93.C32305g;
import s93.InterfaceC32307i;
import u93.AbstractC34666b;
import u93.C34689m0;
import u93.C34691n0;
import u93.C34693o0;
import u93.C34695p0;
import u93.C34697q0;
import u93.C34709w0;
import va3.AbstractC35851i;
import va3.C35850h;

/* JADX INFO: renamed from: ya3.p */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC39373p {

    /* JADX INFO: renamed from: a */
    public static final C3119e0 f169425a = new C3119e0("ResolutionAnchorProvider");

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m125569a(int i13) {
        String str = (i13 == 12 || i13 == 23 || i13 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 12 || i13 == 23 || i13 == 25) ? 2 : 3];
        switch (i13) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i13 == 12) {
            objArr[1] = "createSetter";
        } else if (i13 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i13 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i13) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 12 && i13 != 23 && i13 != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: d */
    public static C34695p0 m125570d(InterfaceC31108b interfaceC31108b, AbstractC23811y abstractC23811y, C35850h c35850h, InterfaceC32307i interfaceC32307i, int i13) {
        if (interfaceC31108b == null) {
            m125569a(32);
            throw null;
        }
        if (interfaceC32307i == null) {
            m125569a(33);
            throw null;
        }
        if (abstractC23811y == null) {
            return null;
        }
        return new C34695p0(interfaceC31108b, new C14340a(interfaceC31108b, abstractC23811y, c35850h), interfaceC32307i, AbstractC35851i.m113819a(i13));
    }

    /* JADX INFO: renamed from: e */
    public static C34691n0 m125571e(InterfaceC31145n0 interfaceC31145n0, InterfaceC32307i interfaceC32307i) {
        if (interfaceC31145n0 != null) {
            return m125577k(interfaceC31145n0, interfaceC32307i, true, interfaceC31145n0.getSource());
        }
        m125569a(13);
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public static C34693o0 m125572f(InterfaceC31145n0 interfaceC31145n0, InterfaceC32307i interfaceC32307i) {
        if (interfaceC31145n0 == null) {
            m125569a(0);
            throw null;
        }
        InterfaceC31155s0 source = interfaceC31145n0.getSource();
        if (source != null) {
            return m125578l(interfaceC31145n0, interfaceC32307i, C32305g.f133684a, true, interfaceC31145n0.getVisibility(), source);
        }
        m125569a(6);
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public static C34689m0 m125573g(AbstractC34666b abstractC34666b) {
        if (abstractC34666b == null) {
            m125569a(26);
            throw null;
        }
        InterfaceC31109b0 interfaceC31109b0M125521c = AbstractC39363f.m125521c(abstractC34666b);
        InterfaceC31117e interfaceC31117eM125515a = AbstractC39375r.m125583d(interfaceC31109b0M125521c).m125515a(interfaceC31109b0M125521c);
        if (interfaceC31117eM125515a == null) {
            return null;
        }
        EnumC31106a0 enumC31106a0 = EnumC31106a0.f128310x;
        C31148p c31148p = AbstractC31150q.f128353e;
        C34689m0 c34689m0M109586K0 = C34689m0.m109586K0(abstractC34666b, enumC31106a0, c31148p, false, AbstractC27742n.f111877b, 4, abstractC34666b.getSource());
        C34691n0 c34691n0 = new C34691n0(c34689m0M109586K0, C32305g.f133684a, enumC31106a0, c31148p, false, false, false, 4, null, abstractC34666b.getSource());
        c34689m0M109586K0.m109590N0(c34691n0, null, null, null);
        C23784k0.f94165x.getClass();
        C23784k0 attributes = C23784k0.f94166y;
        InterfaceC23796q0 constructor = interfaceC31117eM125515a.mo60496e();
        List arguments = Collections.singletonList(new C23806v0(abstractC34666b.mo60594i()));
        AbstractC22676k.m65750j(attributes, "attributes");
        AbstractC22676k.m65750j(constructor, "constructor");
        AbstractC22676k.m65750j(arguments, "arguments");
        AbstractC23763c0 abstractC23763c0M69890i = AbstractC23791o.m69890i(arguments, attributes, constructor, false);
        List list = Collections.EMPTY_LIST;
        c34689m0M109586K0.m109592Q0(abstractC23763c0M69890i, list, null, null, list);
        c34691n0.m109597M0(c34689m0M109586K0.getReturnType());
        return c34689m0M109586K0;
    }

    /* JADX INFO: renamed from: h */
    public static C34697q0 m125574h(AbstractC34666b abstractC34666b) {
        if (abstractC34666b == null) {
            m125569a(24);
            throw null;
        }
        C34697q0 c34697q0M109603U0 = C34697q0.m109603U0(abstractC34666b, AbstractC27742n.f111878c, 4, abstractC34666b.getSource());
        C34709w0 c34709w0 = new C34709w0(c34697q0M109603U0, null, 0, C32305g.f133684a, C35850h.m113814e("value"), AbstractC4393e.m13807e(abstractC34666b).m83832v(), false, false, false, null, abstractC34666b.getSource());
        List list = Collections.EMPTY_LIST;
        return c34697q0M109603U0.mo109605O0(null, null, list, list, Collections.singletonList(c34709w0), abstractC34666b.mo60594i(), EnumC31106a0.f128310x, AbstractC31150q.f128353e);
    }

    /* JADX INFO: renamed from: i */
    public static C34697q0 m125575i(AbstractC34666b abstractC34666b) {
        if (abstractC34666b == null) {
            m125569a(22);
            throw null;
        }
        C34697q0 c34697q0M109603U0 = C34697q0.m109603U0(abstractC34666b, AbstractC27742n.f111876a, 4, abstractC34666b.getSource());
        List list = Collections.EMPTY_LIST;
        AbstractC27736h abstractC27736hM13807e = AbstractC4393e.m13807e(abstractC34666b);
        EnumC23776g1 enumC23776g1 = EnumC23776g1.INVARIANT;
        return c34697q0M109603U0.mo109605O0(null, null, list, list, list, abstractC27736hM13807e.m83820h(abstractC34666b.mo60594i()), EnumC31106a0.f128310x, AbstractC31150q.f128353e);
    }

    /* JADX INFO: renamed from: j */
    public static C34695p0 m125576j(InterfaceC31108b interfaceC31108b, AbstractC23811y abstractC23811y, InterfaceC32307i interfaceC32307i) {
        if (abstractC23811y == null) {
            return null;
        }
        return new C34695p0(interfaceC31108b, new C14341b(interfaceC31108b, abstractC23811y), interfaceC32307i);
    }

    /* JADX INFO: renamed from: k */
    public static C34691n0 m125577k(InterfaceC31145n0 interfaceC31145n0, InterfaceC32307i interfaceC32307i, boolean z4, InterfaceC31155s0 interfaceC31155s0) {
        if (interfaceC31145n0 == null) {
            m125569a(17);
            throw null;
        }
        if (interfaceC32307i == null) {
            m125569a(18);
            throw null;
        }
        if (interfaceC31155s0 != null) {
            return new C34691n0(interfaceC31145n0, interfaceC32307i, interfaceC31145n0.mo60498k(), interfaceC31145n0.getVisibility(), z4, false, false, 1, null, interfaceC31155s0);
        }
        m125569a(19);
        throw null;
    }

    /* JADX INFO: renamed from: l */
    public static C34693o0 m125578l(InterfaceC31145n0 interfaceC31145n0, InterfaceC32307i interfaceC32307i, InterfaceC32307i interfaceC32307i2, boolean z4, AbstractC31152r abstractC31152r, InterfaceC31155s0 interfaceC31155s0) {
        if (interfaceC31145n0 == null) {
            m125569a(7);
            throw null;
        }
        if (interfaceC32307i == null) {
            m125569a(8);
            throw null;
        }
        if (interfaceC32307i2 == null) {
            m125569a(9);
            throw null;
        }
        if (abstractC31152r == null) {
            m125569a(10);
            throw null;
        }
        if (interfaceC31155s0 == null) {
            m125569a(11);
            throw null;
        }
        C34693o0 c34693o0 = new C34693o0(interfaceC31145n0, interfaceC32307i, interfaceC31145n0.mo60498k(), abstractC31152r, z4, false, false, 1, null, interfaceC31155s0);
        c34693o0.f146137N = C34693o0.m109599L0(c34693o0, interfaceC31145n0.getType(), interfaceC32307i2);
        return c34693o0;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m125579m(InterfaceC31162w interfaceC31162w) {
        if (interfaceC31162w.getKind() != 4) {
            return false;
        }
        InterfaceC31135k interfaceC31135kMo60581g = interfaceC31162w.mo60581g();
        int i13 = AbstractC39363f.f169413a;
        return AbstractC39363f.m125530l(interfaceC31135kMo60581g, EnumC31120f.f128330y);
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo43949b(InterfaceC31111c interfaceC31111c);

    /* JADX INFO: renamed from: c */
    public abstract void mo43950c(InterfaceC31111c interfaceC31111c, InterfaceC31111c interfaceC31111c2);

    /* JADX INFO: renamed from: n */
    public void mo43951n(InterfaceC31111c member, Collection collection) {
        AbstractC22676k.m65750j(member, "member");
        member.mo78656g0(collection);
    }
}
