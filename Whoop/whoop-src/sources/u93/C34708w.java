package u93;

import androidx.health.platform.client.proto.C1533u;
import ha3.C17062e;
import java.util.LinkedHashMap;
import java.util.List;
import lb3.AbstractC23811y;
import lb3.AbstractC23812y0;
import m83.C25271y;
import r93.AbstractC31152r;
import r93.EnumC31106a0;
import r93.InterfaceC31135k;
import r93.InterfaceC31151q0;
import r93.InterfaceC31160v;
import r93.InterfaceC31162w;
import s93.InterfaceC32307i;
import va3.C35850h;

/* JADX INFO: renamed from: u93.w */
/* JADX INFO: loaded from: classes5.dex */
public final class C34708w implements InterfaceC31160v {

    /* JADX INFO: renamed from: E */
    public InterfaceC31162w f146162E;

    /* JADX INFO: renamed from: F */
    public int f146163F;

    /* JADX INFO: renamed from: G */
    public List f146164G;

    /* JADX INFO: renamed from: H */
    public final List f146165H;

    /* JADX INFO: renamed from: I */
    public InterfaceC31151q0 f146166I;

    /* JADX INFO: renamed from: J */
    public InterfaceC31151q0 f146167J;

    /* JADX INFO: renamed from: K */
    public AbstractC23811y f146168K;

    /* JADX INFO: renamed from: L */
    public C35850h f146169L;

    /* JADX INFO: renamed from: M */
    public boolean f146170M;

    /* JADX INFO: renamed from: N */
    public boolean f146171N;

    /* JADX INFO: renamed from: O */
    public boolean f146172O;

    /* JADX INFO: renamed from: P */
    public boolean f146173P;

    /* JADX INFO: renamed from: Q */
    public boolean f146174Q;

    /* JADX INFO: renamed from: R */
    public C25271y f146175R;

    /* JADX INFO: renamed from: S */
    public InterfaceC32307i f146176S;

    /* JADX INFO: renamed from: T */
    public boolean f146177T;

    /* JADX INFO: renamed from: U */
    public final LinkedHashMap f146178U;

    /* JADX INFO: renamed from: V */
    public Boolean f146179V;

    /* JADX INFO: renamed from: W */
    public boolean f146180W;

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ AbstractC34710x f146181X;

    /* JADX INFO: renamed from: w */
    public AbstractC23812y0 f146182w;

    /* JADX INFO: renamed from: x */
    public InterfaceC31135k f146183x;

    /* JADX INFO: renamed from: y */
    public EnumC31106a0 f146184y;

    /* JADX INFO: renamed from: z */
    public AbstractC31152r f146185z;

    public C34708w(AbstractC34710x abstractC34710x, AbstractC23812y0 abstractC23812y0, InterfaceC31135k interfaceC31135k, EnumC31106a0 enumC31106a0, AbstractC31152r abstractC31152r, int i13, List list, List list2, InterfaceC31151q0 interfaceC31151q0, AbstractC23811y abstractC23811y) {
        if (abstractC23812y0 == null) {
            m109624a(0);
            throw null;
        }
        if (interfaceC31135k == null) {
            m109624a(1);
            throw null;
        }
        if (enumC31106a0 == null) {
            m109624a(2);
            throw null;
        }
        if (abstractC31152r == null) {
            m109624a(3);
            throw null;
        }
        if (i13 == 0) {
            m109624a(4);
            throw null;
        }
        if (list == null) {
            m109624a(5);
            throw null;
        }
        if (list2 == null) {
            m109624a(6);
            throw null;
        }
        if (abstractC23811y == null) {
            m109624a(7);
            throw null;
        }
        this.f146181X = abstractC34710x;
        this.f146162E = null;
        this.f146167J = abstractC34710x.f146197K;
        this.f146170M = true;
        this.f146171N = false;
        this.f146172O = false;
        this.f146173P = false;
        this.f146174Q = abstractC34710x.f146206T;
        this.f146175R = null;
        this.f146176S = null;
        this.f146177T = abstractC34710x.f146207U;
        this.f146178U = new LinkedHashMap();
        this.f146179V = null;
        this.f146180W = false;
        this.f146182w = abstractC23812y0;
        this.f146183x = interfaceC31135k;
        this.f146184y = enumC31106a0;
        this.f146185z = abstractC31152r;
        this.f146163F = i13;
        this.f146164G = list;
        this.f146165H = list2;
        this.f146166I = interfaceC31151q0;
        this.f146168K = abstractC23811y;
        this.f146169L = null;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m109624a(int i13) {
        String str;
        int i14;
        switch (i13) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case 20:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 12:
            case 14:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 21:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i13) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case 20:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                i14 = 2;
                break;
            case 10:
            case 12:
            case 14:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 21:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
                objArr[0] = "newOwner";
                break;
            case 2:
                objArr[0] = "newModality";
                break;
            case 3:
                objArr[0] = "newVisibility";
                break;
            case 4:
            case 14:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "newValueParameterDescriptors";
                break;
            case 6:
                objArr[0] = "newContextReceiverParameters";
                break;
            case 7:
                objArr[0] = "newReturnType";
                break;
            case 8:
                objArr[0] = "owner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case 20:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 10:
                objArr[0] = "modality";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                objArr[0] = "name";
                break;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 21:
                objArr[0] = "parameters";
                break;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                objArr[0] = "type";
                break;
            case 25:
                objArr[0] = "contextReceiverParameters";
                break;
            case 35:
                objArr[0] = "additionalAnnotations";
                break;
            case 37:
            default:
                objArr[0] = "substitution";
                break;
            case 39:
                objArr[0] = "userDataKey";
                break;
        }
        switch (i13) {
            case 9:
                objArr[1] = "setOwner";
                break;
            case 10:
            case 12:
            case 14:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 21:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 11:
                objArr[1] = "setModality";
                break;
            case 13:
                objArr[1] = "setVisibility";
                break;
            case 15:
                objArr[1] = "setKind";
                break;
            case 16:
                objArr[1] = "setCopyOverrides";
                break;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                objArr[1] = "setName";
                break;
            case 20:
                objArr[1] = "setValueParameters";
                break;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                objArr[1] = "setTypeParameters";
                break;
            case 24:
                objArr[1] = "setReturnType";
                break;
            case 26:
                objArr[1] = "setContextReceiverParameters";
                break;
            case 27:
                objArr[1] = "setExtensionReceiverParameter";
                break;
            case 28:
                objArr[1] = "setDispatchReceiverParameter";
                break;
            case 29:
                objArr[1] = "setOriginal";
                break;
            case 30:
                objArr[1] = "setSignatureChange";
                break;
            case 31:
                objArr[1] = "setPreserveSourceElement";
                break;
            case 32:
                objArr[1] = "setDropOriginalInContainingParts";
                break;
            case 33:
                objArr[1] = "setHiddenToOvercomeSignatureClash";
                break;
            case 34:
                objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                break;
            case 36:
                objArr[1] = "setAdditionalAnnotations";
                break;
            case 38:
                objArr[1] = "setSubstitution";
                break;
            case 40:
                objArr[1] = "putUserData";
                break;
            case 41:
                objArr[1] = "getSubstitution";
                break;
            case 42:
                objArr[1] = "setJustForTypeSubstitution";
                break;
        }
        switch (i13) {
            case 8:
                objArr[2] = "setOwner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case 20:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                break;
            case 10:
                objArr[2] = "setModality";
                break;
            case 12:
                objArr[2] = "setVisibility";
                break;
            case 14:
                objArr[2] = "setKind";
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                objArr[2] = "setName";
                break;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                objArr[2] = "setValueParameters";
                break;
            case 21:
                objArr[2] = "setTypeParameters";
                break;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                objArr[2] = "setReturnType";
                break;
            case 25:
                objArr[2] = "setContextReceiverParameters";
                break;
            case 35:
                objArr[2] = "setAdditionalAnnotations";
                break;
            case 37:
                objArr[2] = "setSubstitution";
                break;
            case 39:
                objArr[2] = "putUserData";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i13) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
            case 20:
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                throw new IllegalStateException(str2);
            case 10:
            case 12:
            case 14:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 21:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // r93.InterfaceC31160v
    /* JADX INFO: renamed from: b */
    public final InterfaceC31160v mo68170b(List list) {
        this.f146164G = list;
        return this;
    }

    @Override // r93.InterfaceC31160v
    public final InterfaceC31162w build() {
        return this.f146181X.mo88262M0(this);
    }

    @Override // r93.InterfaceC31160v
    /* JADX INFO: renamed from: d */
    public final InterfaceC31160v mo68171d(C35850h c35850h) {
        if (c35850h != null) {
            this.f146169L = c35850h;
            return this;
        }
        m109624a(17);
        throw null;
    }

    @Override // r93.InterfaceC31160v
    /* JADX INFO: renamed from: f */
    public final InterfaceC31160v mo68172f(int i13) {
        if (i13 != 0) {
            this.f146163F = i13;
            return this;
        }
        m109624a(14);
        throw null;
    }

    @Override // r93.InterfaceC31160v
    /* JADX INFO: renamed from: g */
    public final InterfaceC31160v mo68173g() {
        this.f146177T = true;
        return this;
    }

    @Override // r93.InterfaceC31160v
    /* JADX INFO: renamed from: h */
    public final InterfaceC31160v mo68174h() {
        this.f146170M = false;
        return this;
    }

    @Override // r93.InterfaceC31160v
    /* JADX INFO: renamed from: i */
    public final InterfaceC31160v mo68175i() {
        this.f146175R = C25271y.f99162w;
        return this;
    }

    @Override // r93.InterfaceC31160v
    /* JADX INFO: renamed from: k */
    public final InterfaceC31160v mo68176k() {
        this.f146174Q = true;
        return this;
    }

    @Override // r93.InterfaceC31160v
    /* JADX INFO: renamed from: l */
    public final InterfaceC31160v mo68177l(InterfaceC31135k interfaceC31135k) {
        if (interfaceC31135k != null) {
            this.f146183x = interfaceC31135k;
            return this;
        }
        m109624a(8);
        throw null;
    }

    @Override // r93.InterfaceC31160v
    /* JADX INFO: renamed from: n */
    public final InterfaceC31160v mo68178n(AbstractC23811y abstractC23811y) {
        if (abstractC23811y != null) {
            this.f146168K = abstractC23811y;
            return this;
        }
        m109624a(23);
        throw null;
    }

    @Override // r93.InterfaceC31160v
    /* JADX INFO: renamed from: p */
    public final InterfaceC31160v mo68179p(EnumC31106a0 enumC31106a0) {
        if (enumC31106a0 != null) {
            this.f146184y = enumC31106a0;
            return this;
        }
        m109624a(10);
        throw null;
    }

    @Override // r93.InterfaceC31160v
    /* JADX INFO: renamed from: s */
    public final InterfaceC31160v mo68180s() {
        this.f146172O = true;
        return this;
    }

    @Override // r93.InterfaceC31160v
    /* JADX INFO: renamed from: t */
    public final InterfaceC31160v mo68181t(InterfaceC31151q0 interfaceC31151q0) {
        this.f146167J = interfaceC31151q0;
        return this;
    }

    @Override // r93.InterfaceC31160v
    /* JADX INFO: renamed from: u */
    public final InterfaceC31160v mo68182u() {
        this.f146178U.put(C17062e.f65588h0, Boolean.TRUE);
        return this;
    }

    @Override // r93.InterfaceC31160v
    /* JADX INFO: renamed from: v */
    public final InterfaceC31160v mo68183v(InterfaceC32307i interfaceC32307i) {
        if (interfaceC32307i != null) {
            this.f146176S = interfaceC32307i;
            return this;
        }
        m109624a(35);
        throw null;
    }

    @Override // r93.InterfaceC31160v
    /* JADX INFO: renamed from: w */
    public final InterfaceC31160v mo68184w(AbstractC31152r abstractC31152r) {
        if (abstractC31152r != null) {
            this.f146185z = abstractC31152r;
            return this;
        }
        m109624a(12);
        throw null;
    }

    @Override // r93.InterfaceC31160v
    /* JADX INFO: renamed from: z */
    public final InterfaceC31160v mo68187z() {
        this.f146171N = true;
        return this;
    }
}
