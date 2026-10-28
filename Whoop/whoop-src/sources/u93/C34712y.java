package u93;

import fb3.C14342c;
import fb3.InterfaceC14343d;
import r93.InterfaceC31117e;
import r93.InterfaceC31135k;
import s93.C32305g;
import va3.AbstractC35852j;

/* JADX INFO: renamed from: u93.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C34712y extends AbstractC34670d {

    /* JADX INFO: renamed from: E */
    public final C14342c f146218E;

    /* JADX INFO: renamed from: z */
    public final InterfaceC31117e f146219z;

    public C34712y(InterfaceC31117e interfaceC31117e) {
        super(C32305g.f133684a, AbstractC35852j.f152627d);
        this.f146219z = interfaceC31117e;
        this.f146218E = new C14342c(interfaceC31117e);
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m109635r0(int i13) {
        String str = (i13 == 1 || i13 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 1 || i13 == 2) ? 2 : 3];
        if (i13 == 1 || i13 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i13 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i13 == 1) {
            objArr[1] = "getValue";
        } else if (i13 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i13 != 1 && i13 != 2) {
            if (i13 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i13 != 1 && i13 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // r93.InterfaceC31135k
    /* JADX INFO: renamed from: g */
    public final InterfaceC31135k mo60581g() {
        InterfaceC31117e interfaceC31117e = this.f146219z;
        if (interfaceC31117e != null) {
            return interfaceC31117e;
        }
        m109635r0(2);
        throw null;
    }

    @Override // r93.InterfaceC31151q0
    public final InterfaceC14343d getValue() {
        C14342c c14342c = this.f146218E;
        if (c14342c != null) {
            return c14342c;
        }
        m109635r0(1);
        throw null;
    }

    @Override // u93.AbstractC34690n, al.AbstractC0954a
    public final String toString() {
        return "class " + this.f146219z.getName() + "::this";
    }
}
