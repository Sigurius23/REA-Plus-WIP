package p330n1;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: n1.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C26111k extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f103447w;

    /* JADX INFO: renamed from: x */
    public int f103448x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C26114n f103449y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26111k(C26114n c26114n, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f103447w = i13;
        this.f103449y = c26114n;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f103447w) {
            case 0:
                return new C26111k(this.f103449y, interfaceC30057d, 0);
            case 1:
                return new C26111k(this.f103449y, interfaceC30057d, 1);
            default:
                return new C26111k(this.f103449y, interfaceC30057d, 2);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f103447w) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C26111k) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f103447w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f103448x;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C26114n c26114n = this.f103449y;
                    C26115o c26115o = c26114n.f103460T;
                    float f13 = c26114n.f103457Q ? 1.0f : 0.0f;
                    this.f103448x = 1;
                    Object objM30551g = c26115o.f103466a.m30551g(new Float(f13), this);
                    if (objM30551g != enumC31071a) {
                        objM30551g = c23454a0;
                    }
                    if (objM30551g == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a0;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f103448x;
                C23454a0 c23454a1 = C23454a0.f92919a;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C26114n c26114n2 = this.f103449y;
                    if (!c26114n2.f103460T.f103466a.m30550f()) {
                        C26115o c26115o2 = c26114n2.f103460T;
                        float fM87022x = c26114n2.f103463W.m87022x() / c26114n2.m77675d1();
                        this.f103448x = 1;
                        Object objM30551g2 = c26115o2.f103466a.m30551g(new Float(fM87022x), this);
                        if (objM30551g2 != enumC31071a2) {
                            objM30551g2 = c23454a1;
                        }
                        if (objM30551g2 == enumC31071a2) {
                            return enumC31071a2;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a1;
            default:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f103448x;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C26114n c26114n3 = this.f103449y;
                    if (c26114n3.f103457Q) {
                        this.f103448x = 2;
                        if (C26114n.m77672a1(c26114n3, this) == enumC31071a3) {
                            return enumC31071a3;
                        }
                    } else {
                        this.f103448x = 1;
                        if (c26114n3.m77673b1(this) == enumC31071a3) {
                            return enumC31071a3;
                        }
                    }
                } else {
                    if (i15 != 1 && i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
        }
    }
}
