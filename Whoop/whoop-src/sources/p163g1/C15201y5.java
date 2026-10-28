package p163g1;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p132f0.EnumC13840z0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: g1.y5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15201y5 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ float f57063E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC4339a f57064F;

    /* JADX INFO: renamed from: w */
    public int f57065w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15091n5 f57066x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f57067y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f57068z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15201y5(C15091n5 c15091n5, float f13, float f14, float f15, InterfaceC4339a interfaceC4339a, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f57066x = c15091n5;
        this.f57067y = f13;
        this.f57068z = f14;
        this.f57063E = f15;
        this.f57064F = interfaceC4339a;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        return new C15201y5(this.f57066x, this.f57067y, this.f57068z, this.f57063E, this.f57064F, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C15201y5) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f57065w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            this.f57065w = 1;
            float f13 = AbstractC15019g6.f56199a;
            C14964b6 c14964b6 = new C14964b6(this.f57067y, this.f57068z, this.f57063E, null);
            Object objMo29022a = this.f57066x.mo29022a(EnumC13840z0.f49374w, c14964b6, this);
            if (objMo29022a != enumC31071a) {
                objMo29022a = c23454a0;
            }
            if (objMo29022a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        InterfaceC4339a interfaceC4339a = this.f57064F;
        if (interfaceC4339a != null) {
            interfaceC4339a.invoke();
        }
        return c23454a0;
    }
}
