package u93;

import fb3.InterfaceC14343d;
import p004a2.AbstractC0152a;
import r93.InterfaceC31135k;
import s93.InterfaceC32307i;
import va3.AbstractC35852j;
import va3.C35850h;

/* JADX INFO: renamed from: u93.p0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C34695p0 extends AbstractC34670d {

    /* JADX INFO: renamed from: E */
    public final AbstractC0152a f146139E;

    /* JADX INFO: renamed from: z */
    public final InterfaceC31135k f146140z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34695p0(InterfaceC31135k interfaceC31135k, AbstractC0152a abstractC0152a, InterfaceC32307i interfaceC32307i) {
        this(interfaceC31135k, abstractC0152a, interfaceC32307i, AbstractC35852j.f152627d);
        if (interfaceC31135k == null) {
            m109602r0(0);
            throw null;
        }
        if (interfaceC32307i != null) {
        } else {
            m109602r0(2);
            throw null;
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m109602r0(int i13) {
        String str = (i13 == 7 || i13 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 7 || i13 == 8) ? 2 : 3];
        switch (i13) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i13 == 7) {
            objArr[1] = "getValue";
        } else if (i13 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i13) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 7 && i13 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // r93.InterfaceC31135k
    /* JADX INFO: renamed from: g */
    public final InterfaceC31135k mo60581g() {
        InterfaceC31135k interfaceC31135k = this.f146140z;
        if (interfaceC31135k != null) {
            return interfaceC31135k;
        }
        m109602r0(8);
        throw null;
    }

    @Override // r93.InterfaceC31151q0
    public final InterfaceC14343d getValue() {
        AbstractC0152a abstractC0152a = this.f146139E;
        if (abstractC0152a != null) {
            return abstractC0152a;
        }
        m109602r0(7);
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34695p0(InterfaceC31135k interfaceC31135k, AbstractC0152a abstractC0152a, InterfaceC32307i interfaceC32307i, C35850h c35850h) {
        super(interfaceC32307i, c35850h);
        if (interfaceC31135k == null) {
            m109602r0(3);
            throw null;
        }
        if (interfaceC32307i == null) {
            m109602r0(5);
            throw null;
        }
        if (c35850h != null) {
            this.f146140z = interfaceC31135k;
            this.f146139E = abstractC0152a;
            return;
        }
        m109602r0(6);
        throw null;
    }
}
