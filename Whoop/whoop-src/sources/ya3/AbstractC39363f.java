package ya3;

import androidx.health.platform.client.proto.C1533u;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import lb3.AbstractC23811y;
import lb3.InterfaceC23796q0;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import nb3.C26555l;
import r93.AbstractC31150q;
import r93.C31157t0;
import r93.EnumC31106a0;
import r93.EnumC31120f;
import r93.InterfaceC31108b;
import r93.InterfaceC31109b0;
import r93.InterfaceC31111c;
import r93.InterfaceC31117e;
import r93.InterfaceC31124g0;
import r93.InterfaceC31126h;
import r93.InterfaceC31129i;
import r93.InterfaceC31135k;
import r93.InterfaceC31136k0;
import r93.InterfaceC31138l;
import r93.InterfaceC31144n;
import r93.InterfaceC31149p0;
import u93.AbstractC34677g0;
import u93.AbstractC34685k0;
import u93.C34665a0;
import va3.AbstractC35852j;
import va3.C35847e;
import va3.C35848f;

/* JADX INFO: renamed from: ya3.f */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC39363f {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f169413a = 0;

    static {
        new C35847e("kotlin.jvm.JvmName");
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m125519a(int i13) {
        String str;
        int i14;
        switch (i13) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE /* 75 */:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i13) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE /* 75 */:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                i14 = 2;
                break;
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 60:
            case 63:
            case 81:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE /* 75 */:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                objArr[0] = "second";
                break;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 66:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 67:
            case 68:
            case 69:
            case 76:
            case 77:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 65:
                objArr[0] = "variable";
                break;
            case 70:
                objArr[0] = "f";
                break;
            case 72:
                objArr[0] = "current";
                break;
            case 73:
                objArr[0] = "result";
                break;
            case 74:
                objArr[0] = "memberDescriptor";
                break;
            case 78:
            case 79:
            case 80:
                objArr[0] = "annotated";
                break;
            case 84:
            case 86:
            case 89:
            case 91:
                objArr[0] = "scope";
                break;
            case 87:
            case 90:
            case 92:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i13) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 59:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 61:
            case 62:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 71:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE /* 75 */:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 82:
            case 83:
                objArr[1] = "getContainingSourceFile";
                break;
            case 85:
                objArr[1] = "getAllDescriptors";
                break;
            case 88:
                objArr[1] = "getFunctionByName";
                break;
            case 93:
                objArr[1] = "getPropertyByName";
                break;
            case 95:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i13) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE /* 75 */:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                objArr[2] = "areInSameModule";
                break;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 60:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 63:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 65:
            case 66:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 67:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 69:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 70:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 72:
            case 73:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 74:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 76:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 77:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 78:
                objArr[2] = "getJvmName";
                break;
            case 79:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 80:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "getContainingSourceFile";
                break;
            case 84:
                objArr[2] = "getAllDescriptors";
                break;
            case 86:
            case 87:
                objArr[2] = "getFunctionByName";
                break;
            case 89:
            case 90:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 91:
            case 92:
                objArr[2] = "getPropertyByName";
                break;
            case 94:
                objArr[2] = "getDirectMember";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i13) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE /* 75 */:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m125520b(InterfaceC31108b interfaceC31108b, LinkedHashSet linkedHashSet) {
        if (interfaceC31108b == null) {
            m125519a(72);
            throw null;
        }
        if (linkedHashSet.contains(interfaceC31108b)) {
            return;
        }
        Iterator it = interfaceC31108b.mo78660a().mo78673h().iterator();
        while (it.hasNext()) {
            InterfaceC31108b interfaceC31108bMo78660a = ((InterfaceC31108b) it.next()).mo78660a();
            m125520b(interfaceC31108bMo78660a, linkedHashSet);
            linkedHashSet.add(interfaceC31108bMo78660a);
        }
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC31109b0 m125521c(InterfaceC31135k interfaceC31135k) {
        if (interfaceC31135k == null) {
            m125519a(21);
            throw null;
        }
        InterfaceC31109b0 interfaceC31109b0M125522d = m125522d(interfaceC31135k);
        if (interfaceC31109b0M125522d != null) {
            return interfaceC31109b0M125522d;
        }
        m125519a(22);
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC31109b0 m125522d(InterfaceC31135k interfaceC31135k) {
        if (interfaceC31135k == null) {
            m125519a(23);
            throw null;
        }
        while (interfaceC31135k != null) {
            if (interfaceC31135k instanceof InterfaceC31109b0) {
                return (InterfaceC31109b0) interfaceC31135k;
            }
            if (interfaceC31135k instanceof InterfaceC31136k0) {
                return ((C34665a0) ((InterfaceC31136k0) interfaceC31135k)).f146032z;
            }
            interfaceC31135k = interfaceC31135k.mo60581g();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static C31157t0 m125523e(InterfaceC31135k interfaceC31135k) {
        if (interfaceC31135k == null) {
            m125519a(81);
            throw null;
        }
        if (interfaceC31135k instanceof InterfaceC31149p0) {
            interfaceC31135k = ((AbstractC34685k0) ((InterfaceC31149p0) interfaceC31135k)).m109573J0();
        }
        boolean z4 = interfaceC31135k instanceof InterfaceC31138l;
        C31157t0 c31157t0 = C31157t0.f128377a;
        if (z4) {
            ((InterfaceC31138l) interfaceC31135k).getSource().getClass();
        }
        return c31157t0;
    }

    /* JADX INFO: renamed from: f */
    public static C35848f m125524f(InterfaceC31135k interfaceC31135k) {
        if (interfaceC31135k != null) {
            C35847e c35847eM125525g = m125525g(interfaceC31135k);
            return c35847eM125525g != null ? c35847eM125525g.f152613a : m125524f(interfaceC31135k.mo60581g()).m113791a(interfaceC31135k.getName());
        }
        m125519a(2);
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public static C35847e m125525g(InterfaceC31135k interfaceC31135k) {
        if (interfaceC31135k == null) {
            m125519a(5);
            throw null;
        }
        if ((interfaceC31135k instanceof InterfaceC31109b0) || C26555l.m78685f(interfaceC31135k)) {
            return C35847e.f152612c;
        }
        if (interfaceC31135k instanceof InterfaceC31136k0) {
            return ((C34665a0) ((InterfaceC31136k0) interfaceC31135k)).f146028E;
        }
        if (interfaceC31135k instanceof InterfaceC31124g0) {
            return ((AbstractC34677g0) ((InterfaceC31124g0) interfaceC31135k)).f146067F;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static InterfaceC31135k m125526h(InterfaceC31135k interfaceC31135k, Class cls, boolean z4) {
        if (interfaceC31135k == null) {
            return null;
        }
        if (z4) {
            interfaceC31135k = interfaceC31135k.mo60581g();
        }
        while (interfaceC31135k != null) {
            if (cls.isInstance(interfaceC31135k)) {
                return interfaceC31135k;
            }
            interfaceC31135k = interfaceC31135k.mo60581g();
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static InterfaceC31117e m125527i(InterfaceC31117e interfaceC31117e) {
        if (interfaceC31117e == null) {
            m125519a(44);
            throw null;
        }
        for (AbstractC23811y abstractC23811y : interfaceC31117e.mo60496e().getSupertypes()) {
            if (abstractC23811y == null) {
                m125519a(45);
                throw null;
            }
            InterfaceC23796q0 interfaceC23796q0Mo69844i0 = abstractC23811y.mo69844i0();
            if (interfaceC23796q0Mo69844i0 == null) {
                m125519a(46);
                throw null;
            }
            InterfaceC31117e interfaceC31117e2 = (InterfaceC31117e) interfaceC23796q0Mo69844i0.mo1784d();
            if (interfaceC31117e2 == null) {
                m125519a(47);
                throw null;
            }
            if (interfaceC31117e2.getKind() != EnumC31120f.f128329x) {
                return interfaceC31117e2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m125528j(InterfaceC31135k interfaceC31135k) {
        return m125530l(interfaceC31135k, EnumC31120f.f128328w) && interfaceC31135k.getName().equals(AbstractC35852j.f152624a);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m125529k(InterfaceC31135k interfaceC31135k) {
        return m125530l(interfaceC31135k, EnumC31120f.f128326F) && ((InterfaceC31117e) interfaceC31135k).mo60491N();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m125530l(InterfaceC31135k interfaceC31135k, EnumC31120f enumC31120f) {
        return (interfaceC31135k instanceof InterfaceC31117e) && ((InterfaceC31117e) interfaceC31135k).getKind() == enumC31120f;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m125531m(InterfaceC31135k interfaceC31135k) {
        if (interfaceC31135k == null) {
            m125519a(1);
            throw null;
        }
        while (interfaceC31135k != null) {
            if (m125528j(interfaceC31135k) || ((interfaceC31135k instanceof InterfaceC31144n) && ((InterfaceC31144n) interfaceC31135k).getVisibility() == AbstractC31150q.f128354f)) {
                return true;
            }
            interfaceC31135k = interfaceC31135k.mo60581g();
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m125532n(AbstractC23811y abstractC23811y, InterfaceC31135k interfaceC31135k) {
        if (abstractC23811y == null) {
            m125519a(30);
            throw null;
        }
        if (interfaceC31135k == null) {
            m125519a(31);
            throw null;
        }
        InterfaceC31126h interfaceC31126hMo1784d = abstractC23811y.mo69844i0().mo1784d();
        if (interfaceC31126hMo1784d == null) {
            return false;
        }
        InterfaceC31135k interfaceC31135kMo78660a = interfaceC31126hMo1784d.mo78660a();
        return (interfaceC31135kMo78660a instanceof InterfaceC31126h) && (interfaceC31135k instanceof InterfaceC31126h) && ((InterfaceC31126h) interfaceC31135k).mo60496e().equals(((InterfaceC31126h) interfaceC31135kMo78660a).mo60496e());
    }

    /* JADX INFO: renamed from: o */
    public static boolean m125533o(InterfaceC31129i interfaceC31129i) {
        return (m125530l(interfaceC31129i, EnumC31120f.f128328w) || m125530l(interfaceC31129i, EnumC31120f.f128329x)) && ((InterfaceC31117e) interfaceC31129i).mo60498k() == EnumC31106a0.f128311y;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m125534p(AbstractC23811y abstractC23811y, InterfaceC31135k interfaceC31135k) {
        if (abstractC23811y == null) {
            m125519a(32);
            throw null;
        }
        if (interfaceC31135k == null) {
            m125519a(33);
            throw null;
        }
        if (m125532n(abstractC23811y, interfaceC31135k)) {
            return true;
        }
        Iterator it = abstractC23811y.mo69844i0().getSupertypes().iterator();
        while (it.hasNext()) {
            if (m125534p((AbstractC23811y) it.next(), interfaceC31135k)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m125535q(InterfaceC31135k interfaceC31135k) {
        return interfaceC31135k != null && (interfaceC31135k.mo60581g() instanceof InterfaceC31124g0);
    }

    /* JADX INFO: renamed from: r */
    public static InterfaceC31111c m125536r(InterfaceC31111c interfaceC31111c) {
        if (interfaceC31111c == null) {
            m125519a(58);
            throw null;
        }
        while (interfaceC31111c.getKind() == 2) {
            Collection collectionMo78673h = interfaceC31111c.mo78673h();
            if (collectionMo78673h.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + interfaceC31111c);
            }
            interfaceC31111c = (InterfaceC31111c) collectionMo78673h.iterator().next();
        }
        return interfaceC31111c;
    }
}
