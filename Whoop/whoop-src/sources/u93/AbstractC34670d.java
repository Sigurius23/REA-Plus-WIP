package u93;

import fb3.C14344e;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import lb3.AbstractC23811y;
import lb3.C23758a1;
import lb3.EnumC23776g1;
import r93.AbstractC31150q;
import r93.AbstractC31152r;
import r93.C31148p;
import r93.InterfaceC31108b;
import r93.InterfaceC31117e;
import r93.InterfaceC31135k;
import r93.InterfaceC31141m;
import r93.InterfaceC31151q0;
import r93.InterfaceC31155s0;

/* JADX INFO: renamed from: u93.d */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC34670d extends AbstractC34690n implements InterfaceC31151q0 {
    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m109557r0(int i13) {
        String str;
        int i14;
        switch (i13) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i13) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                i14 = 2;
                break;
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i13) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i13) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i13) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // r93.InterfaceC31108b
    /* JADX INFO: renamed from: B */
    public final InterfaceC31151q0 mo78667B() {
        return null;
    }

    @Override // r93.InterfaceC31159u0
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public final AbstractC34670d mo60593d(C23758a1 c23758a1) {
        if (c23758a1 == null) {
            m109557r0(3);
            throw null;
        }
        if (!c23758a1.f94122a.mo69908e()) {
            AbstractC23811y abstractC23811yM69823i = mo60581g() instanceof InterfaceC31117e ? c23758a1.m69823i(getType(), EnumC23776g1.OUT_VARIANCE) : c23758a1.m69823i(getType(), EnumC23776g1.INVARIANT);
            if (abstractC23811yM69823i == null) {
                return null;
            }
            if (abstractC23811yM69823i != getType()) {
                return new C34695p0(mo60581g(), new C14344e(abstractC23811yM69823i), getAnnotations());
            }
        }
        return this;
    }

    @Override // r93.InterfaceC31108b
    /* JADX INFO: renamed from: S */
    public final boolean mo48179S() {
        return false;
    }

    @Override // r93.InterfaceC31135k
    /* JADX INFO: renamed from: T */
    public final Object mo78659T(InterfaceC31141m interfaceC31141m, Object obj) {
        return interfaceC31141m.visitReceiverParameterDescriptor(this, obj);
    }

    @Override // u93.AbstractC34690n, r93.InterfaceC31135k
    /* JADX INFO: renamed from: a */
    public final InterfaceC31108b mo78660a() {
        return this;
    }

    @Override // r93.InterfaceC31108b
    public final AbstractC23811y getReturnType() {
        return getType();
    }

    @Override // r93.InterfaceC31138l
    public final InterfaceC31155s0 getSource() {
        return InterfaceC31155s0.f128370q;
    }

    @Override // r93.InterfaceC31169z0
    public final AbstractC23811y getType() {
        AbstractC23811y type = getValue().getType();
        if (type != null) {
            return type;
        }
        m109557r0(6);
        throw null;
    }

    @Override // r93.InterfaceC31108b
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m109557r0(5);
        throw null;
    }

    @Override // r93.InterfaceC31144n
    public final AbstractC31152r getVisibility() {
        C31148p c31148p = AbstractC31150q.f128354f;
        if (c31148p != null) {
            return c31148p;
        }
        m109557r0(9);
        throw null;
    }

    @Override // r93.InterfaceC31108b
    /* JADX INFO: renamed from: h */
    public final Collection mo78673h() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        m109557r0(8);
        throw null;
    }

    @Override // r93.InterfaceC31108b
    /* JADX INFO: renamed from: v */
    public final List mo78676v() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m109557r0(7);
        throw null;
    }

    @Override // r93.InterfaceC31108b
    /* JADX INFO: renamed from: y */
    public final InterfaceC31151q0 mo78677y() {
        return null;
    }

    @Override // u93.AbstractC34690n, r93.InterfaceC31135k
    /* JADX INFO: renamed from: a */
    public final InterfaceC31135k mo78660a() {
        return this;
    }
}
