package u93;

import androidx.health.platform.client.proto.C1533u;
import cb3.AbstractC4393e;
import java.util.Collections;
import java.util.List;
import kb3.C22340i;
import kb3.C22342k;
import kb3.InterfaceC22345n;
import lb3.AbstractC23763c0;
import lb3.AbstractC23812y0;
import lb3.C23758a1;
import mb3.C25389f;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22717t;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import r93.InterfaceC31135k;
import r93.InterfaceC31141m;
import r93.InterfaceC31151q0;
import va3.C35850h;
import ya3.AbstractC39363f;

/* JADX INFO: renamed from: u93.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC34666b extends AbstractC34669c0 {

    /* JADX INFO: renamed from: w */
    public final C35850h f146033w;

    /* JADX INFO: renamed from: x */
    public final C22340i f146034x;

    /* JADX INFO: renamed from: y */
    public final C22340i f146035y;

    /* JADX INFO: renamed from: z */
    public final C22340i f146036z;

    public AbstractC34666b(InterfaceC22345n interfaceC22345n, C35850h c35850h) {
        if (interfaceC22345n == null) {
            m109553E(0);
            throw null;
        }
        if (c35850h == null) {
            m109553E(1);
            throw null;
        }
        this.f146033w = c35850h;
        C22342k c22342k = (C22342k) interfaceC22345n;
        this.f146034x = new C22340i(c22342k, new C34664a(this, 0));
        this.f146035y = new C22340i(c22342k, new C34664a(this, 1));
        this.f146036z = new C22340i(c22342k, new C34664a(this, 2));
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m109553E(int i13) {
        String str = (i13 == 2 || i13 == 3 || i13 == 4 || i13 == 5 || i13 == 6 || i13 == 9 || i13 == 12 || i13 == 14 || i13 == 16 || i13 == 17 || i13 == 19 || i13 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 2 || i13 == 3 || i13 == 4 || i13 == 5 || i13 == 6 || i13 == 9 || i13 == 12 || i13 == 14 || i13 == 16 || i13 == 17 || i13 == 19 || i13 == 20) ? 2 : 3];
        switch (i13) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i13 == 2) {
            objArr[1] = "getName";
        } else if (i13 == 3) {
            objArr[1] = "getOriginal";
        } else if (i13 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i13 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i13 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i13 == 9 || i13 == 12 || i13 == 14 || i13 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i13 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i13 == 19) {
            objArr[1] = "substitute";
        } else if (i13 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i13) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 2 && i13 != 3 && i13 != 4 && i13 != 5 && i13 != 6 && i13 != 9 && i13 != 12 && i13 != 14 && i13 != 16 && i13 != 17 && i13 != 19 && i13 != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // r93.InterfaceC31159u0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public InterfaceC31117e mo60593d(C23758a1 c23758a1) {
        if (c23758a1 != null) {
            return c23758a1.f94122a.mo69908e() ? this : new C34667b0(this, c23758a1);
        }
        m109553E(18);
        throw null;
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: H */
    public InterfaceC22712o mo60487H() {
        InterfaceC22712o interfaceC22712o = (InterfaceC22712o) this.f146035y.invoke();
        if (interfaceC22712o != null) {
            return interfaceC22712o;
        }
        m109553E(4);
        throw null;
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: K */
    public InterfaceC22712o mo60489K() {
        AbstractC4393e.m13811i(AbstractC39363f.m125521c(this));
        InterfaceC22712o interfaceC22712oMo60499l = mo60499l(C25389f.f99474a);
        if (interfaceC22712oMo60499l != null) {
            return interfaceC22712oMo60499l;
        }
        m109553E(17);
        throw null;
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: M */
    public List mo60578M() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m109553E(6);
        throw null;
    }

    @Override // r93.InterfaceC31135k
    /* JADX INFO: renamed from: T */
    public final Object mo78659T(InterfaceC31141m interfaceC31141m, Object obj) {
        return interfaceC31141m.visitClassDescriptor(this, obj);
    }

    @Override // u93.AbstractC34669c0, r93.InterfaceC31117e, r93.InterfaceC31135k
    /* JADX INFO: renamed from: a */
    public final InterfaceC31126h mo78660a() {
        return this;
    }

    @Override // u93.AbstractC34669c0
    /* JADX INFO: renamed from: b */
    public InterfaceC22712o mo78653b(AbstractC23812y0 abstractC23812y0, C25389f c25389f) {
        if (!abstractC23812y0.mo69908e()) {
            return new C22717t(mo60499l(c25389f), new C23758a1(abstractC23812y0));
        }
        InterfaceC22712o interfaceC22712oMo60499l = mo60499l(c25389f);
        if (interfaceC22712oMo60499l != null) {
            return interfaceC22712oMo60499l;
        }
        m109553E(12);
        throw null;
    }

    @Override // r93.InterfaceC31135k
    public final C35850h getName() {
        C35850h c35850h = this.f146033w;
        if (c35850h != null) {
            return c35850h;
        }
        m109553E(2);
        throw null;
    }

    @Override // r93.InterfaceC31117e, r93.InterfaceC31126h
    /* JADX INFO: renamed from: i */
    public final AbstractC23763c0 mo60594i() {
        AbstractC23763c0 abstractC23763c0 = (AbstractC23763c0) this.f146034x.invoke();
        if (abstractC23763c0 != null) {
            return abstractC23763c0;
        }
        m109553E(20);
        throw null;
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: n */
    public final InterfaceC22712o mo95863n(AbstractC23812y0 abstractC23812y0) {
        AbstractC4393e.m13811i(AbstractC39363f.m125521c(this));
        InterfaceC22712o interfaceC22712oMo78653b = mo78653b(abstractC23812y0, C25389f.f99474a);
        if (interfaceC22712oMo78653b != null) {
            return interfaceC22712oMo78653b;
        }
        m109553E(16);
        throw null;
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: q0 */
    public final InterfaceC31151q0 mo95864q0() {
        InterfaceC31151q0 interfaceC31151q0 = (InterfaceC31151q0) this.f146036z.invoke();
        if (interfaceC31151q0 != null) {
            return interfaceC31151q0;
        }
        m109553E(5);
        throw null;
    }

    @Override // u93.AbstractC34669c0, r93.InterfaceC31135k
    /* JADX INFO: renamed from: a */
    public final InterfaceC31135k mo78660a() {
        return this;
    }

    @Override // u93.AbstractC34669c0, r93.InterfaceC31117e, r93.InterfaceC31135k
    /* JADX INFO: renamed from: a */
    public final InterfaceC31117e mo78660a() {
        return this;
    }
}
