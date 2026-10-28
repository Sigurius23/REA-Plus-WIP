package u93;

import cb3.AbstractC4393e;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import lb3.AbstractC23811y;
import r93.AbstractC31152r;
import r93.EnumC31106a0;
import r93.InterfaceC31107a1;
import r93.InterfaceC31141m;
import r93.InterfaceC31145n0;
import r93.InterfaceC31149p0;
import r93.InterfaceC31155s0;
import s93.InterfaceC32307i;
import va3.AbstractC35852j;
import va3.C35850h;

/* JADX INFO: renamed from: u93.o0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34693o0 extends AbstractC34685k0 implements InterfaceC31149p0 {

    /* JADX INFO: renamed from: N */
    public InterfaceC31107a1 f146137N;

    /* JADX INFO: renamed from: O */
    public final InterfaceC31149p0 f146138O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34693o0(InterfaceC31145n0 interfaceC31145n0, InterfaceC32307i interfaceC32307i, EnumC31106a0 enumC31106a0, AbstractC31152r abstractC31152r, boolean z4, boolean z13, boolean z14, int i13, InterfaceC31149p0 interfaceC31149p0, InterfaceC31155s0 interfaceC31155s0) {
        super(enumC31106a0, abstractC31152r, interfaceC31145n0, interfaceC32307i, C35850h.m113816g("<set-" + interfaceC31145n0.getName() + ">"), z4, z13, z14, i13, interfaceC31155s0);
        if (interfaceC31145n0 == null) {
            m109600r0(0);
            throw null;
        }
        if (interfaceC32307i == null) {
            m109600r0(1);
            throw null;
        }
        if (enumC31106a0 == null) {
            m109600r0(2);
            throw null;
        }
        if (abstractC31152r == null) {
            m109600r0(3);
            throw null;
        }
        if (i13 == 0) {
            m109600r0(4);
            throw null;
        }
        if (interfaceC31155s0 == null) {
            m109600r0(5);
            throw null;
        }
        this.f146138O = interfaceC31149p0 != null ? interfaceC31149p0 : this;
    }

    /* JADX INFO: renamed from: L0 */
    public static C34709w0 m109599L0(C34693o0 c34693o0, AbstractC23811y abstractC23811y, InterfaceC32307i interfaceC32307i) {
        if (abstractC23811y == null) {
            m109600r0(8);
            throw null;
        }
        if (interfaceC32307i != null) {
            return new C34709w0(c34693o0, null, 0, interfaceC32307i, AbstractC35852j.f152630g, abstractC23811y, false, false, false, null, InterfaceC31155s0.f128370q);
        }
        m109600r0(9);
        throw null;
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m109600r0(int i13) {
        String str;
        int i14;
        switch (i13) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i13) {
            case 10:
            case 11:
            case 12:
            case 13:
                i14 = 2;
                break;
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
            case 9:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i13) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i13) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i13) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // u93.AbstractC34692o, u93.AbstractC34690n, r93.InterfaceC31135k
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public final InterfaceC31149p0 mo78660a() {
        InterfaceC31149p0 interfaceC31149p0 = this.f146138O;
        if (interfaceC31149p0 != null) {
            return interfaceC31149p0;
        }
        m109600r0(13);
        throw null;
    }

    @Override // r93.InterfaceC31135k
    /* JADX INFO: renamed from: T */
    public final Object mo78659T(InterfaceC31141m interfaceC31141m, Object obj) {
        return interfaceC31141m.visitPropertySetterDescriptor(this, obj);
    }

    @Override // r93.InterfaceC31108b
    public final AbstractC23811y getReturnType() {
        return AbstractC4393e.m13807e(this).m83834x();
    }

    @Override // r93.InterfaceC31111c, r93.InterfaceC31108b
    /* JADX INFO: renamed from: h */
    public final Collection mo78673h() {
        return m109574K0(false);
    }

    @Override // r93.InterfaceC31108b
    /* JADX INFO: renamed from: v */
    public final List mo78676v() {
        InterfaceC31107a1 interfaceC31107a1 = this.f146137N;
        if (interfaceC31107a1 == null) {
            throw new IllegalStateException();
        }
        List listSingletonList = Collections.singletonList(interfaceC31107a1);
        if (listSingletonList != null) {
            return listSingletonList;
        }
        m109600r0(11);
        throw null;
    }
}
