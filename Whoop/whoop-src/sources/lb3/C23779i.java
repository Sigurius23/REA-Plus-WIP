package lb3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kb3.InterfaceC22345n;
import r93.C31161v0;
import r93.InterfaceC31117e;
import u93.AbstractC34669c0;
import ya3.AbstractC39363f;

/* JADX INFO: renamed from: lb3.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C23779i extends AbstractC23759b {

    /* JADX INFO: renamed from: E */
    public final Collection f94160E;

    /* JADX INFO: renamed from: y */
    public final AbstractC34669c0 f94161y;

    /* JADX INFO: renamed from: z */
    public final List f94162z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23779i(AbstractC34669c0 abstractC34669c0, List list, Collection collection, InterfaceC22345n interfaceC22345n) {
        super(interfaceC22345n);
        if (list == null) {
            m69872k(1);
            throw null;
        }
        if (collection == null) {
            m69872k(2);
            throw null;
        }
        if (interfaceC22345n == null) {
            m69872k(3);
            throw null;
        }
        this.f94161y = abstractC34669c0;
        this.f94162z = Collections.unmodifiableList(new ArrayList(list));
        this.f94160E = Collections.unmodifiableCollection(collection);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m69872k(int i13) {
        String str = (i13 == 4 || i13 == 5 || i13 == 6 || i13 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 4 || i13 == 5 || i13 == 6 || i13 == 7) ? 2 : 3];
        switch (i13) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i13 == 4) {
            objArr[1] = "getParameters";
        } else if (i13 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i13 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i13 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i13 != 4 && i13 != 5 && i13 != 6 && i13 != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i13 != 4 && i13 != 5 && i13 != 6 && i13 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // lb3.AbstractC23771f
    /* JADX INFO: renamed from: a */
    public final Collection mo60484a() {
        Collection collection = this.f94160E;
        if (collection != null) {
            return collection;
        }
        m69872k(6);
        throw null;
    }

    @Override // lb3.InterfaceC23796q0
    /* JADX INFO: renamed from: f */
    public final boolean mo1785f() {
        return true;
    }

    @Override // lb3.AbstractC23771f
    /* JADX INFO: renamed from: g */
    public final C31161v0 mo60485g() {
        return C31161v0.f128379x;
    }

    @Override // lb3.InterfaceC23796q0
    public final List getParameters() {
        List list = this.f94162z;
        if (list != null) {
            return list;
        }
        m69872k(4);
        throw null;
    }

    @Override // lb3.AbstractC23759b
    /* JADX INFO: renamed from: l */
    public final InterfaceC31117e mo1784d() {
        AbstractC34669c0 abstractC34669c0 = this.f94161y;
        if (abstractC34669c0 != null) {
            return abstractC34669c0;
        }
        m69872k(5);
        throw null;
    }

    public final String toString() {
        return AbstractC39363f.m125524f(this.f94161y).f152616a;
    }
}
