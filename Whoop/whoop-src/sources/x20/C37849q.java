package x20;

import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.C13084s1;
import l83.C23454a0;
import p000.C34292u;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: x20.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C37849q extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f162027w = 1;

    /* JADX INFO: renamed from: x */
    public int f162028x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f162029y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C37855w f162030z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37849q(long j7, C37855w c37855w, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f162029y = j7;
        this.f162030z = c37855w;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f162027w) {
            case 0:
                return new C37849q(this.f162030z, this.f162029y, interfaceC30057d);
            default:
                return new C37849q(this.f162029y, this.f162030z, interfaceC30057d);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f162027w) {
            case 0:
                break;
        }
        return ((C37849q) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f162027w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f162028x;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f162028x = 1;
                    Object objCollect = new C13084s1(new C37856x(this.f162029y, null)).collect(new C34292u(this.f162030z, 29), this);
                    if (objCollect != enumC31071a) {
                        objCollect = c23454a0;
                    }
                    if (objCollect == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a0;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f162028x;
                if (i14 != 0) {
                    if (i14 == 1) {
                        AbstractC34132o.m107864I(obj);
                    } else {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj);
                this.f162028x = 1;
                if (AbstractC3034m0.m8783c(this.f162029y, this) == enumC31071a2) {
                    return enumC31071a2;
                }
                this.f162028x = 2;
                if (C37855w.m121378g(this.f162030z, this) == enumC31071a2) {
                    return enumC31071a2;
                }
                return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37849q(C37855w c37855w, long j7, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f162030z = c37855w;
        this.f162029y = j7;
    }
}
