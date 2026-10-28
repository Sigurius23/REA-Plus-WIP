package u93;

import androidx.health.platform.client.proto.C1533u;
import cb3.AbstractC4393e;
import java.util.ArrayList;
import java.util.List;
import kb3.InterfaceC22345n;
import lb3.AbstractC23791o;
import lb3.AbstractC23811y;
import lb3.EnumC23776g1;
import r93.C31161v0;
import r93.InterfaceC31135k;
import s93.C32305g;
import s93.InterfaceC32307i;
import va3.C35850h;
import ya3.AbstractC39363f;

/* JADX INFO: renamed from: u93.u0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C34705u0 extends AbstractC34680i {

    /* JADX INFO: renamed from: L */
    public final ArrayList f146159L;

    /* JADX INFO: renamed from: M */
    public boolean f146160M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34705u0(InterfaceC31135k interfaceC31135k, InterfaceC32307i interfaceC32307i, boolean z4, EnumC23776g1 enumC23776g1, C35850h c35850h, int i13, InterfaceC22345n interfaceC22345n) {
        super(interfaceC22345n, interfaceC31135k, interfaceC32307i, c35850h, enumC23776g1, z4, i13, C31161v0.f128379x);
        if (interfaceC31135k == null) {
            m109619r0(19);
            throw null;
        }
        if (interfaceC32307i == null) {
            m109619r0(20);
            throw null;
        }
        if (enumC23776g1 == null) {
            m109619r0(21);
            throw null;
        }
        if (c35850h == null) {
            m109619r0(22);
            throw null;
        }
        if (interfaceC22345n == null) {
            m109619r0(25);
            throw null;
        }
        this.f146159L = new ArrayList(1);
        this.f146160M = false;
    }

    /* JADX INFO: renamed from: M0 */
    public static C34705u0 m109617M0(InterfaceC31135k interfaceC31135k, InterfaceC32307i interfaceC32307i, boolean z4, EnumC23776g1 enumC23776g1, C35850h c35850h, int i13, InterfaceC22345n interfaceC22345n) {
        if (interfaceC31135k == null) {
            m109619r0(6);
            throw null;
        }
        if (interfaceC32307i == null) {
            m109619r0(7);
            throw null;
        }
        if (enumC23776g1 == null) {
            m109619r0(8);
            throw null;
        }
        if (c35850h == null) {
            m109619r0(9);
            throw null;
        }
        if (interfaceC22345n != null) {
            return new C34705u0(interfaceC31135k, interfaceC32307i, z4, enumC23776g1, c35850h, i13, interfaceC22345n);
        }
        m109619r0(11);
        throw null;
    }

    /* JADX INFO: renamed from: N0 */
    public static C34705u0 m109618N0(AbstractC34666b abstractC34666b, EnumC23776g1 enumC23776g1, C35850h c35850h, int i13, InterfaceC22345n interfaceC22345n) {
        if (interfaceC22345n == null) {
            m109619r0(4);
            throw null;
        }
        C34705u0 c34705u0M109617M0 = m109617M0(abstractC34666b, C32305g.f133684a, false, enumC23776g1, c35850h, i13, interfaceC22345n);
        c34705u0M109617M0.m109620L0(AbstractC4393e.m13807e(abstractC34666b).m83826n());
        c34705u0M109617M0.m109623Q0();
        return c34705u0M109617M0;
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m109619r0(int i13) {
        String str = (i13 == 5 || i13 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 5 || i13 == 28) ? 2 : 3];
        switch (i13) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                objArr[0] = "source";
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i13 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i13 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i13) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                objArr[2] = "createForFurtherModification";
                break;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 20:
            case 21:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 5 && i13 != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // u93.AbstractC34680i
    /* JADX INFO: renamed from: K0 */
    public final List mo60483K0() {
        if (!this.f146160M) {
            throw new IllegalStateException("Type parameter descriptor is not initialized: " + m109622P0());
        }
        ArrayList arrayList = this.f146159L;
        if (arrayList != null) {
            return arrayList;
        }
        m109619r0(28);
        throw null;
    }

    /* JADX INFO: renamed from: L0 */
    public final void m109620L0(AbstractC23811y abstractC23811y) {
        if (abstractC23811y == null) {
            m109619r0(26);
            throw null;
        }
        if (this.f146160M) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + m109622P0());
        }
        if (AbstractC23791o.m69886e(abstractC23811y)) {
            return;
        }
        this.f146159L.add(abstractC23811y);
    }

    /* JADX INFO: renamed from: O0 */
    public final boolean m109621O0() {
        return this.f146160M;
    }

    /* JADX INFO: renamed from: P0 */
    public final String m109622P0() {
        return getName() + " declared in " + AbstractC39363f.m125524f(mo60581g());
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m109623Q0() {
        if (!this.f146160M) {
            this.f146160M = true;
        } else {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + m109622P0());
        }
    }
}
