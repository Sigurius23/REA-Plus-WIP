package u93;

import ce3.C4515p;
import java.util.List;
import jb3.C21555o;
import kb3.C22340i;
import kb3.C22342k;
import kb3.InterfaceC22345n;
import lb3.AbstractC23763c0;
import lb3.EnumC23776g1;
import lb3.InterfaceC23796q0;
import r93.C31161v0;
import r93.InterfaceC31126h;
import r93.InterfaceC31135k;
import r93.InterfaceC31138l;
import r93.InterfaceC31141m;
import r93.InterfaceC31155s0;
import r93.InterfaceC31165x0;
import s93.InterfaceC32307i;
import va3.C35850h;

/* JADX INFO: renamed from: u93.i */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC34680i extends AbstractC34692o implements InterfaceC31165x0 {

    /* JADX INFO: renamed from: F */
    public final EnumC23776g1 f146073F;

    /* JADX INFO: renamed from: G */
    public final boolean f146074G;

    /* JADX INFO: renamed from: H */
    public final int f146075H;

    /* JADX INFO: renamed from: I */
    public final C22340i f146076I;

    /* JADX INFO: renamed from: J */
    public final C22340i f146077J;

    /* JADX INFO: renamed from: K */
    public final C22342k f146078K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC34680i(InterfaceC22345n interfaceC22345n, InterfaceC31135k interfaceC31135k, InterfaceC32307i interfaceC32307i, C35850h c35850h, EnumC23776g1 enumC23776g1, boolean z4, int i13, C31161v0 c31161v0) {
        super(interfaceC31135k, interfaceC32307i, c35850h, InterfaceC31155s0.f128370q);
        if (interfaceC22345n == null) {
            m109564r0(0);
            throw null;
        }
        if (interfaceC31135k == null) {
            m109564r0(1);
            throw null;
        }
        if (interfaceC32307i == null) {
            m109564r0(2);
            throw null;
        }
        if (c35850h == null) {
            m109564r0(3);
            throw null;
        }
        if (enumC23776g1 == null) {
            m109564r0(4);
            throw null;
        }
        if (c31161v0 == null) {
            m109564r0(6);
            throw null;
        }
        this.f146073F = enumC23776g1;
        this.f146074G = z4;
        this.f146075H = i13;
        C21555o c21555o = new C21555o(this, interfaceC22345n, c31161v0);
        C22342k c22342k = (C22342k) interfaceC22345n;
        this.f146076I = new C22340i(c22342k, c21555o);
        this.f146077J = new C22340i(c22342k, new C4515p(8, this, c35850h));
        this.f146078K = c22342k;
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m109564r0(int i13) {
        String str;
        int i14;
        switch (i13) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i13) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i14 = 2;
                break;
            case 12:
            default:
                i14 = 3;
                break;
        }
        Object[] objArr = new Object[i14];
        switch (i13) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i13) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i13) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i13) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // r93.InterfaceC31165x0
    /* JADX INFO: renamed from: D */
    public final boolean mo95861D() {
        return false;
    }

    @Override // u93.AbstractC34692o
    /* JADX INFO: renamed from: I0 */
    public final InterfaceC31138l mo78660a() {
        return this;
    }

    /* JADX INFO: renamed from: J0 */
    public List mo60482J0(List list) {
        return list;
    }

    /* JADX INFO: renamed from: K0 */
    public abstract List mo60483K0();

    @Override // r93.InterfaceC31135k
    /* JADX INFO: renamed from: T */
    public final Object mo78659T(InterfaceC31141m interfaceC31141m, Object obj) {
        return interfaceC31141m.visitTypeParameterDescriptor(this, obj);
    }

    @Override // u93.AbstractC34692o, u93.AbstractC34690n, r93.InterfaceC31135k
    /* JADX INFO: renamed from: a */
    public final InterfaceC31126h mo78660a() {
        return this;
    }

    @Override // r93.InterfaceC31165x0, r93.InterfaceC31126h
    /* JADX INFO: renamed from: e */
    public final InterfaceC23796q0 mo60496e() {
        InterfaceC23796q0 interfaceC23796q0 = (InterfaceC23796q0) this.f146076I.invoke();
        if (interfaceC23796q0 != null) {
            return interfaceC23796q0;
        }
        m109564r0(9);
        throw null;
    }

    @Override // r93.InterfaceC31165x0
    public final int getIndex() {
        return this.f146075H;
    }

    @Override // r93.InterfaceC31165x0
    public final List getUpperBounds() {
        List supertypes = ((C34678h) mo60496e()).getSupertypes();
        if (supertypes != null) {
            return supertypes;
        }
        m109564r0(8);
        throw null;
    }

    @Override // r93.InterfaceC31165x0
    public final EnumC23776g1 getVariance() {
        EnumC23776g1 enumC23776g1 = this.f146073F;
        if (enumC23776g1 != null) {
            return enumC23776g1;
        }
        m109564r0(7);
        throw null;
    }

    @Override // r93.InterfaceC31126h
    /* JADX INFO: renamed from: i */
    public final AbstractC23763c0 mo60594i() {
        AbstractC23763c0 abstractC23763c0 = (AbstractC23763c0) this.f146077J.invoke();
        if (abstractC23763c0 != null) {
            return abstractC23763c0;
        }
        m109564r0(10);
        throw null;
    }

    @Override // r93.InterfaceC31165x0
    public final boolean isReified() {
        return this.f146074G;
    }

    @Override // r93.InterfaceC31165x0
    /* JADX INFO: renamed from: z */
    public final InterfaceC22345n mo95862z() {
        C22342k c22342k = this.f146078K;
        if (c22342k != null) {
            return c22342k;
        }
        m109564r0(14);
        throw null;
    }

    @Override // u93.AbstractC34692o, u93.AbstractC34690n, r93.InterfaceC31135k
    /* JADX INFO: renamed from: a */
    public final InterfaceC31135k mo78660a() {
        return this;
    }

    @Override // u93.AbstractC34692o, u93.AbstractC34690n, r93.InterfaceC31135k
    /* JADX INFO: renamed from: a */
    public final InterfaceC31165x0 mo78660a() {
        return this;
    }
}
