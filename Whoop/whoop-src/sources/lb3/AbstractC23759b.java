package lb3;

import cb3.AbstractC4393e;
import kb3.InterfaceC22345n;
import o93.AbstractC27736h;
import o93.AbstractC27741m;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31109b0;
import r93.InterfaceC31117e;
import r93.InterfaceC31124g0;
import r93.InterfaceC31126h;
import r93.InterfaceC31135k;
import u93.AbstractC34677g0;
import va3.C35850h;

/* JADX INFO: renamed from: lb3.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC23759b extends AbstractC23771f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC23759b(InterfaceC22345n interfaceC22345n) {
        super(interfaceC22345n);
        if (interfaceC22345n != null) {
        } else {
            m69825k(0);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m69825k(int i13) {
        String str = (i13 == 1 || i13 == 3 || i13 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 1 || i13 == 3 || i13 == 4) ? 2 : 3];
        if (i13 == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else if (i13 == 2) {
            objArr[0] = "classifier";
        } else if (i13 == 3 || i13 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else {
            objArr[0] = "storageManager";
        }
        if (i13 == 1) {
            objArr[1] = "getBuiltIns";
        } else if (i13 == 3 || i13 == 4) {
            objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (i13 != 1) {
            if (i13 == 2) {
                objArr[2] = "isSameClassifier";
            } else if (i13 != 3 && i13 != 4) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i13 != 1 && i13 != 3 && i13 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // lb3.InterfaceC23796q0
    /* JADX INFO: renamed from: c */
    public final AbstractC27736h mo1783c() {
        AbstractC27736h abstractC27736hM13807e = AbstractC4393e.m13807e(mo1784d());
        if (abstractC27736hM13807e != null) {
            return abstractC27736hM13807e;
        }
        m69825k(1);
        throw null;
    }

    @Override // lb3.AbstractC23771f
    /* JADX INFO: renamed from: e */
    public final AbstractC23811y mo69826e() {
        InterfaceC31117e interfaceC31117eMo1784d = mo1784d();
        if (interfaceC31117eMo1784d == null) {
            AbstractC27736h.m83809a(107);
            throw null;
        }
        C35850h c35850h = AbstractC27736h.f111789e;
        if (AbstractC27736h.m83810b(interfaceC31117eMo1784d, AbstractC27741m.f111843a) || AbstractC27736h.m83810b(interfaceC31117eMo1784d, AbstractC27741m.f111845b)) {
            return null;
        }
        return mo1783c().m83817e();
    }

    @Override // lb3.AbstractC23771f
    /* JADX INFO: renamed from: i */
    public final boolean mo69827i(InterfaceC31126h interfaceC31126h) {
        boolean z4;
        if (interfaceC31126h instanceof InterfaceC31117e) {
            InterfaceC31117e first = mo1784d();
            AbstractC22676k.m65750j(first, "first");
            if (!AbstractC22676k.m65745e(first.getName(), interfaceC31126h.getName())) {
                z4 = false;
                break;
            }
            InterfaceC31135k interfaceC31135kMo60581g = first.mo60581g();
            InterfaceC31135k interfaceC31135kMo60581g2 = interfaceC31126h.mo60581g();
            while (true) {
                if (interfaceC31135kMo60581g != null && interfaceC31135kMo60581g2 != null) {
                    if (!(interfaceC31135kMo60581g instanceof InterfaceC31109b0)) {
                        if (!(interfaceC31135kMo60581g2 instanceof InterfaceC31109b0)) {
                            if (interfaceC31135kMo60581g instanceof InterfaceC31124g0) {
                                if (!(interfaceC31135kMo60581g2 instanceof InterfaceC31124g0) || !AbstractC22676k.m65745e(((AbstractC34677g0) ((InterfaceC31124g0) interfaceC31135kMo60581g)).f146067F, ((AbstractC34677g0) ((InterfaceC31124g0) interfaceC31135kMo60581g2)).f146067F)) {
                                    break;
                                }
                            } else if (!(interfaceC31135kMo60581g2 instanceof InterfaceC31124g0) && AbstractC22676k.m65745e(interfaceC31135kMo60581g.getName(), interfaceC31135kMo60581g2.getName())) {
                                interfaceC31135kMo60581g = interfaceC31135kMo60581g.mo60581g();
                                interfaceC31135kMo60581g2 = interfaceC31135kMo60581g2.mo60581g();
                            }
                        }
                        z4 = false;
                        break;
                    }
                    z4 = interfaceC31135kMo60581g2 instanceof InterfaceC31109b0;
                    break;
                }
                z4 = true;
                break;
            }
            if (z4) {
                return true;
            }
        }
        return false;
    }

    @Override // lb3.InterfaceC23796q0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public abstract InterfaceC31117e mo1784d();
}
