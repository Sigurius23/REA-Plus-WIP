package u93;

import androidx.health.platform.client.proto.C1533u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kb3.InterfaceC22345n;
import lb3.C23779i;
import lb3.InterfaceC23796q0;
import mb3.C25389f;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22711n;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import r93.AbstractC31152r;
import r93.AbstractC31167y0;
import r93.EnumC31106a0;
import r93.EnumC31120f;
import r93.InterfaceC31155s0;
import s93.C32305g;
import s93.InterfaceC32307i;
import va3.C35850h;

/* JADX INFO: renamed from: u93.f0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C34675f0 extends AbstractC34684k {

    /* JADX INFO: renamed from: G */
    public final EnumC31120f f146055G;

    /* JADX INFO: renamed from: H */
    public EnumC31106a0 f146056H;

    /* JADX INFO: renamed from: I */
    public AbstractC31152r f146057I;

    /* JADX INFO: renamed from: J */
    public C23779i f146058J;

    /* JADX INFO: renamed from: K */
    public ArrayList f146059K;

    /* JADX INFO: renamed from: L */
    public final ArrayList f146060L;

    /* JADX INFO: renamed from: M */
    public final InterfaceC22345n f146061M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34675f0(C34696q c34696q, C35850h c35850h, InterfaceC22345n interfaceC22345n) {
        super(interfaceC22345n, c34696q, c35850h, InterfaceC31155s0.f128370q);
        EnumC31120f enumC31120f = EnumC31120f.f128329x;
        if (interfaceC22345n == null) {
            m109560E(4);
            throw null;
        }
        this.f146060L = new ArrayList();
        this.f146061M = interfaceC22345n;
        this.f146055G = enumC31120f;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m109560E(int i13) {
        String str;
        int i14;
        switch (i13) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i13) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                i14 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i13) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                objArr[1] = "getStaticScope";
                break;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i13) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i13) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
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
        C23779i c23779i = this.f146058J;
        if (c23779i != null) {
            return c23779i;
        }
        m109560E(11);
        throw null;
    }

    @Override // s93.InterfaceC32299a
    public final InterfaceC32307i getAnnotations() {
        return C32305g.f133684a;
    }

    @Override // r93.InterfaceC31117e
    public final Collection getConstructors() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        m109560E(13);
        throw null;
    }

    @Override // r93.InterfaceC31117e
    public final EnumC31120f getKind() {
        EnumC31120f enumC31120f = this.f146055G;
        if (enumC31120f != null) {
            return enumC31120f;
        }
        m109560E(8);
        throw null;
    }

    @Override // r93.InterfaceC31117e, r93.InterfaceC31168z, r93.InterfaceC31144n
    public final AbstractC31152r getVisibility() {
        AbstractC31152r abstractC31152r = this.f146057I;
        if (abstractC31152r != null) {
            return abstractC31152r;
        }
        m109560E(10);
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
        ArrayList arrayList = this.f146059K;
        if (arrayList != null) {
            return arrayList;
        }
        m109560E(15);
        throw null;
    }

    @Override // r93.InterfaceC31117e, r93.InterfaceC31168z
    /* JADX INFO: renamed from: k */
    public final EnumC31106a0 mo60498k() {
        EnumC31106a0 enumC31106a0 = this.f146056H;
        if (enumC31106a0 != null) {
            return enumC31106a0;
        }
        m109560E(7);
        throw null;
    }

    @Override // u93.AbstractC34669c0
    /* JADX INFO: renamed from: l */
    public final InterfaceC22712o mo60499l(C25389f c25389f) {
        return C22711n.f89378b;
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
        return AbstractC34690n.m109593H0(this);
    }
}
