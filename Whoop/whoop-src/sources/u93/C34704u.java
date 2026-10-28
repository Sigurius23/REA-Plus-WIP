package u93;

import androidx.health.platform.client.proto.C1533u;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kb3.C22340i;
import kb3.InterfaceC22343l;
import kb3.InterfaceC22345n;
import lb3.AbstractC23763c0;
import lb3.C23779i;
import lb3.InterfaceC23796q0;
import mb3.C25389f;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22711n;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import r93.AbstractC31150q;
import r93.AbstractC31152r;
import r93.AbstractC31167y0;
import r93.C31148p;
import r93.EnumC31106a0;
import r93.EnumC31120f;
import r93.InterfaceC31117e;
import r93.InterfaceC31155s0;
import s93.InterfaceC32307i;
import va3.C35850h;

/* JADX INFO: renamed from: u93.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C34704u extends AbstractC34684k {

    /* JADX INFO: renamed from: G */
    public final C23779i f146155G;

    /* JADX INFO: renamed from: H */
    public final C34702t f146156H;

    /* JADX INFO: renamed from: I */
    public final InterfaceC22343l f146157I;

    /* JADX INFO: renamed from: J */
    public final InterfaceC32307i f146158J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34704u(InterfaceC22345n interfaceC22345n, InterfaceC31117e interfaceC31117e, AbstractC23763c0 abstractC23763c0, C35850h c35850h, InterfaceC22343l interfaceC22343l, InterfaceC32307i interfaceC32307i, InterfaceC31155s0 interfaceC31155s0) {
        super(interfaceC22345n, interfaceC31117e, c35850h, interfaceC31155s0);
        if (interfaceC22345n == null) {
            m109615E(6);
            throw null;
        }
        if (interfaceC31117e == null) {
            m109615E(7);
            throw null;
        }
        if (abstractC23763c0 == null) {
            m109615E(8);
            throw null;
        }
        if (c35850h == null) {
            m109615E(9);
            throw null;
        }
        if (interfaceC22343l == null) {
            m109615E(10);
            throw null;
        }
        this.f146158J = interfaceC32307i;
        this.f146155G = new C23779i(this, Collections.EMPTY_LIST, Collections.singleton(abstractC23763c0), interfaceC22345n);
        this.f146156H = new C34702t(this, interfaceC22345n);
        this.f146157I = interfaceC22343l;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m109615E(int i13) {
        String str;
        int i14;
        switch (i13) {
            case 14:
            case 15:
            case 16:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 20:
            case 21:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i13) {
            case 14:
            case 15:
            case 16:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 20:
            case 21:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                i14 = 2;
                break;
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 20:
            case 21:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i13) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                objArr[1] = "getTypeConstructor";
                break;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                objArr[1] = "getKind";
                break;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i13) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 20:
            case 21:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i13) {
            case 14:
            case 15:
            case 16:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 20:
            case 21:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: X */
    public static C34704u m109616X(InterfaceC22345n interfaceC22345n, InterfaceC31117e interfaceC31117e, C35850h c35850h, C22340i c22340i, InterfaceC32307i interfaceC32307i, InterfaceC31155s0 interfaceC31155s0) {
        if (interfaceC22345n == null) {
            m109615E(0);
            throw null;
        }
        if (interfaceC31117e == null) {
            m109615E(1);
            throw null;
        }
        if (c35850h == null) {
            m109615E(2);
            throw null;
        }
        if (c22340i != null) {
            return new C34704u(interfaceC22345n, interfaceC31117e, interfaceC31117e.mo60594i(), c35850h, c22340i, interfaceC32307i, interfaceC31155s0);
        }
        m109615E(3);
        throw null;
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: I */
    public final AbstractC31167y0 mo60488I() {
        return null;
    }

    @Override // r93.InterfaceC31168z
    /* JADX INFO: renamed from: L */
    public final boolean mo60490L() {
        return false;
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: N */
    public final boolean mo60491N() {
        return false;
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: Q */
    public final boolean mo60492Q() {
        return false;
    }

    @Override // r93.InterfaceC31168z
    /* JADX INFO: renamed from: U */
    public final boolean mo60493U() {
        return false;
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: V */
    public final InterfaceC22712o mo60494V() {
        return C22711n.f89378b;
    }

    @Override // r93.InterfaceC31126h
    /* JADX INFO: renamed from: e */
    public final InterfaceC23796q0 mo60496e() {
        C23779i c23779i = this.f146155G;
        if (c23779i != null) {
            return c23779i;
        }
        m109615E(17);
        throw null;
    }

    @Override // s93.InterfaceC32299a
    public final InterfaceC32307i getAnnotations() {
        InterfaceC32307i interfaceC32307i = this.f146158J;
        if (interfaceC32307i != null) {
            return interfaceC32307i;
        }
        m109615E(21);
        throw null;
    }

    @Override // r93.InterfaceC31117e
    public final Collection getConstructors() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m109615E(16);
        throw null;
    }

    @Override // r93.InterfaceC31117e
    public final EnumC31120f getKind() {
        return EnumC31120f.f128331z;
    }

    @Override // r93.InterfaceC31117e, r93.InterfaceC31168z, r93.InterfaceC31144n
    public final AbstractC31152r getVisibility() {
        C31148p c31148p = AbstractC31150q.f128353e;
        if (c31148p != null) {
            return c31148p;
        }
        m109615E(20);
        throw null;
    }

    @Override // r93.InterfaceC31117e
    public final boolean isInline() {
        return false;
    }

    @Override // r93.InterfaceC31129i
    public final boolean isInner() {
        return false;
    }

    @Override // r93.InterfaceC31117e
    public final boolean isValue() {
        return false;
    }

    @Override // r93.InterfaceC31117e, r93.InterfaceC31129i
    /* JADX INFO: renamed from: j */
    public final List mo60497j() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m109615E(22);
        throw null;
    }

    @Override // r93.InterfaceC31117e, r93.InterfaceC31168z
    /* JADX INFO: renamed from: k */
    public final EnumC31106a0 mo60498k() {
        return EnumC31106a0.f128310x;
    }

    @Override // u93.AbstractC34669c0
    /* JADX INFO: renamed from: l */
    public final InterfaceC22712o mo60499l(C25389f c25389f) {
        C34702t c34702t = this.f146156H;
        if (c34702t != null) {
            return c34702t;
        }
        m109615E(14);
        throw null;
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: o0 */
    public final boolean mo60500o0() {
        return false;
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: s */
    public final C34682j mo60501s() {
        return null;
    }

    public final String toString() {
        return "enum entry " + getName();
    }
}
