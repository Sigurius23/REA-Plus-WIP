package u93;

import cb3.AbstractC4393e;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kb3.InterfaceC22345n;
import lb3.AbstractC23771f;
import lb3.AbstractC23811y;
import nb3.C26555l;
import nb3.EnumC26554k;
import o93.AbstractC27736h;
import r93.C31161v0;
import r93.InterfaceC31126h;
import r93.InterfaceC31165x0;
import ya3.C39360c;
import ya3.C39361d;

/* JADX INFO: renamed from: u93.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C34678h extends AbstractC23771f {

    /* JADX INFO: renamed from: y */
    public final C31161v0 f146069y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ AbstractC34680i f146070z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34678h(AbstractC34680i abstractC34680i, InterfaceC22345n interfaceC22345n, C31161v0 c31161v0) {
        super(interfaceC22345n);
        if (interfaceC22345n == null) {
            m109563k(0);
            throw null;
        }
        this.f146070z = abstractC34680i;
        this.f146069y = c31161v0;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m109563k(int i13) {
        String str = (i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4 || i13 == 5 || i13 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4 || i13 == 5 || i13 == 8) ? 2 : 3];
        switch (i13) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                break;
            case 6:
                objArr[0] = "type";
                break;
            case 7:
                objArr[0] = "supertypes";
                break;
            case 9:
                objArr[0] = "classifier";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i13 == 1) {
            objArr[1] = "computeSupertypes";
        } else if (i13 == 2) {
            objArr[1] = "getParameters";
        } else if (i13 == 3) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i13 == 4) {
            objArr[1] = "getBuiltIns";
        } else if (i13 == 5) {
            objArr[1] = "getSupertypeLoopChecker";
        } else if (i13 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
        } else {
            objArr[1] = "processSupertypesWithoutCycles";
        }
        switch (i13) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                break;
            case 6:
                objArr[2] = "reportSupertypeLoopError";
                break;
            case 7:
                objArr[2] = "processSupertypesWithoutCycles";
                break;
            case 9:
                objArr[2] = "isSameClassifier";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 1 && i13 != 2 && i13 != 3 && i13 != 4 && i13 != 5 && i13 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // lb3.AbstractC23771f
    /* JADX INFO: renamed from: a */
    public final Collection mo60484a() {
        List listMo60483K0 = this.f146070z.mo60483K0();
        if (listMo60483K0 != null) {
            return listMo60483K0;
        }
        m109563k(1);
        throw null;
    }

    @Override // lb3.InterfaceC23796q0
    /* JADX INFO: renamed from: c */
    public final AbstractC27736h mo1783c() {
        AbstractC27736h abstractC27736hM13807e = AbstractC4393e.m13807e(this.f146070z);
        if (abstractC27736hM13807e != null) {
            return abstractC27736hM13807e;
        }
        m109563k(4);
        throw null;
    }

    @Override // lb3.InterfaceC23796q0
    /* JADX INFO: renamed from: d */
    public final InterfaceC31126h mo1784d() {
        AbstractC34680i abstractC34680i = this.f146070z;
        if (abstractC34680i != null) {
            return abstractC34680i;
        }
        m109563k(3);
        throw null;
    }

    @Override // lb3.AbstractC23771f
    /* JADX INFO: renamed from: e */
    public final AbstractC23811y mo69826e() {
        return C26555l.m78682c(EnumC26554k.CYCLIC_UPPER_BOUNDS, new String[0]);
    }

    @Override // lb3.InterfaceC23796q0
    /* JADX INFO: renamed from: f */
    public final boolean mo1785f() {
        return true;
    }

    @Override // lb3.AbstractC23771f
    /* JADX INFO: renamed from: g */
    public final C31161v0 mo60485g() {
        C31161v0 c31161v0 = this.f146069y;
        if (c31161v0 != null) {
            return c31161v0;
        }
        m109563k(5);
        throw null;
    }

    @Override // lb3.InterfaceC23796q0
    public final List getParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m109563k(2);
        throw null;
    }

    @Override // lb3.AbstractC23771f
    /* JADX INFO: renamed from: i */
    public final boolean mo69827i(InterfaceC31126h interfaceC31126h) {
        if (!(interfaceC31126h instanceof InterfaceC31165x0)) {
            return false;
        }
        return C39361d.f169412a.m125518b(this.f146070z, (InterfaceC31165x0) interfaceC31126h, true, C39360c.f169410x);
    }

    @Override // lb3.AbstractC23771f
    /* JADX INFO: renamed from: j */
    public final List mo69860j(List list) {
        List listMo60482J0 = this.f146070z.mo60482J0(list);
        if (listMo60482J0 != null) {
            return listMo60482J0;
        }
        m109563k(8);
        throw null;
    }

    public final String toString() {
        return this.f146070z.getName().f152620w;
    }
}
