package u93;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import lb3.C23758a1;
import r93.AbstractC31146o;
import r93.AbstractC31152r;
import r93.EnumC31106a0;
import r93.InterfaceC31105a;
import r93.InterfaceC31111c;
import r93.InterfaceC31117e;
import r93.InterfaceC31138l;
import r93.InterfaceC31142m0;
import r93.InterfaceC31145n0;
import r93.InterfaceC31151q0;
import r93.InterfaceC31155s0;
import r93.InterfaceC31162w;
import s93.InterfaceC32307i;
import va3.C35850h;

/* JADX INFO: renamed from: u93.k0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC34685k0 extends AbstractC34692o implements InterfaceC31142m0 {

    /* JADX INFO: renamed from: F */
    public boolean f146084F;

    /* JADX INFO: renamed from: G */
    public final boolean f146085G;

    /* JADX INFO: renamed from: H */
    public final EnumC31106a0 f146086H;

    /* JADX INFO: renamed from: I */
    public final InterfaceC31145n0 f146087I;

    /* JADX INFO: renamed from: J */
    public final boolean f146088J;

    /* JADX INFO: renamed from: K */
    public final int f146089K;

    /* JADX INFO: renamed from: L */
    public AbstractC31152r f146090L;

    /* JADX INFO: renamed from: M */
    public InterfaceC31162w f146091M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC34685k0(EnumC31106a0 enumC31106a0, AbstractC31152r abstractC31152r, InterfaceC31145n0 interfaceC31145n0, InterfaceC32307i interfaceC32307i, C35850h c35850h, boolean z4, boolean z13, boolean z14, int i13, InterfaceC31155s0 interfaceC31155s0) {
        super(interfaceC31145n0.mo60581g(), interfaceC32307i, c35850h, interfaceC31155s0);
        if (enumC31106a0 == null) {
            m109572r0(0);
            throw null;
        }
        if (abstractC31152r == null) {
            m109572r0(1);
            throw null;
        }
        if (interfaceC31145n0 == null) {
            m109572r0(2);
            throw null;
        }
        if (interfaceC32307i == null) {
            m109572r0(3);
            throw null;
        }
        if (interfaceC31155s0 == null) {
            m109572r0(5);
            throw null;
        }
        this.f146091M = null;
        this.f146086H = enumC31106a0;
        this.f146090L = abstractC31152r;
        this.f146087I = interfaceC31145n0;
        this.f146084F = z4;
        this.f146085G = z13;
        this.f146088J = z14;
        this.f146089K = i13;
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m109572r0(int i13) {
        String str;
        int i14;
        switch (i13) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i13) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i14 = 2;
                break;
            case 7:
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i13) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i13) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i13) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // r93.InterfaceC31108b
    /* JADX INFO: renamed from: B */
    public final InterfaceC31151q0 mo78667B() {
        return m109573J0().mo78667B();
    }

    /* JADX INFO: renamed from: J0 */
    public final InterfaceC31145n0 m109573J0() {
        InterfaceC31145n0 interfaceC31145n0 = this.f146087I;
        if (interfaceC31145n0 != null) {
            return interfaceC31145n0;
        }
        m109572r0(13);
        throw null;
    }

    /* JADX INFO: renamed from: K0 */
    public final ArrayList m109574K0(boolean z4) {
        ArrayList arrayList = new ArrayList(0);
        for (InterfaceC31145n0 interfaceC31145n0 : m109573J0().mo78673h()) {
            InterfaceC31111c getter = z4 ? interfaceC31145n0.getGetter() : interfaceC31145n0.getSetter();
            if (getter != null) {
                arrayList.add(getter);
            }
        }
        return arrayList;
    }

    @Override // r93.InterfaceC31168z
    /* JADX INFO: renamed from: L */
    public final boolean mo60490L() {
        return false;
    }

    @Override // r93.InterfaceC31108b
    /* JADX INFO: renamed from: S */
    public final boolean mo48179S() {
        return false;
    }

    @Override // r93.InterfaceC31168z
    /* JADX INFO: renamed from: U */
    public final boolean mo60493U() {
        return false;
    }

    @Override // r93.InterfaceC31162w
    /* JADX INFO: renamed from: Z */
    public final InterfaceC31162w mo95880Z() {
        return this.f146091M;
    }

    @Override // r93.InterfaceC31111c
    /* JADX INFO: renamed from: a0 */
    public final InterfaceC31111c mo78655a0(InterfaceC31117e interfaceC31117e, EnumC31106a0 enumC31106a0, AbstractC31146o abstractC31146o) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // r93.InterfaceC31108b
    /* JADX INFO: renamed from: c0 */
    public final List mo78671c0() {
        List listMo78671c0 = m109573J0().mo78671c0();
        if (listMo78671c0 != null) {
            return listMo78671c0;
        }
        m109572r0(14);
        throw null;
    }

    @Override // r93.InterfaceC31162w, r93.InterfaceC31159u0
    /* JADX INFO: renamed from: d */
    public final InterfaceC31162w mo60593d(C23758a1 c23758a1) {
        if (c23758a1 != null) {
            return this;
        }
        m109572r0(7);
        throw null;
    }

    @Override // r93.InterfaceC31162w
    /* JADX INFO: renamed from: f0 */
    public final boolean mo95881f0() {
        return false;
    }

    @Override // r93.InterfaceC31111c
    /* JADX INFO: renamed from: g0 */
    public final void mo78656g0(Collection collection) {
        if (collection != null) {
            return;
        }
        m109572r0(16);
        throw null;
    }

    @Override // r93.InterfaceC31111c
    public final int getKind() {
        int i13 = this.f146089K;
        if (i13 != 0) {
            return i13;
        }
        m109572r0(6);
        throw null;
    }

    @Override // r93.InterfaceC31108b
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m109572r0(9);
        throw null;
    }

    @Override // r93.InterfaceC31144n
    public final AbstractC31152r getVisibility() {
        AbstractC31152r abstractC31152r = this.f146090L;
        if (abstractC31152r != null) {
            return abstractC31152r;
        }
        m109572r0(11);
        throw null;
    }

    @Override // r93.InterfaceC31108b
    /* JADX INFO: renamed from: h0 */
    public final Object mo48190h0(InterfaceC31105a interfaceC31105a) {
        return null;
    }

    @Override // r93.InterfaceC31168z
    public final boolean isExternal() {
        return this.f146085G;
    }

    @Override // r93.InterfaceC31162w
    public final boolean isInfix() {
        return false;
    }

    @Override // r93.InterfaceC31162w
    public final boolean isInline() {
        return this.f146088J;
    }

    @Override // r93.InterfaceC31162w
    public final boolean isOperator() {
        return false;
    }

    @Override // r93.InterfaceC31162w
    public final boolean isSuspend() {
        return false;
    }

    @Override // r93.InterfaceC31162w
    /* JADX INFO: renamed from: j0 */
    public final boolean mo95882j0() {
        return false;
    }

    @Override // r93.InterfaceC31168z
    /* JADX INFO: renamed from: k */
    public final EnumC31106a0 mo60498k() {
        EnumC31106a0 enumC31106a0 = this.f146086H;
        if (enumC31106a0 != null) {
            return enumC31106a0;
        }
        m109572r0(10);
        throw null;
    }

    @Override // r93.InterfaceC31162w
    /* JADX INFO: renamed from: q */
    public final boolean mo60566q() {
        return false;
    }

    @Override // r93.InterfaceC31108b
    /* JADX INFO: renamed from: y */
    public final InterfaceC31151q0 mo78677y() {
        return m109573J0().mo78677y();
    }

    @Override // r93.InterfaceC31159u0
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC31138l mo60593d(C23758a1 c23758a1) {
        mo60593d(c23758a1);
        return this;
    }
}
