package x30;

import a40.InterfaceC0356a;
import c93.InterfaceC4351m;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import l83.C23454a0;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: x30.j0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37899j0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ boolean f162274w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC0356a f162275x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f162276y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37899j0(InterfaceC0356a interfaceC0356a, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f162275x = interfaceC0356a;
        this.f162276y = interfaceC28601c1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C37899j0 c37899j0 = new C37899j0(this.f162275x, this.f162276y, interfaceC30057d);
        c37899j0.f162274w = ((Boolean) obj).booleanValue();
        return c37899j0;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        C37899j0 c37899j0 = (C37899j0) create(bool, (InterfaceC30057d) obj2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        c37899j0.invokeSuspend(c23454a0);
        return c23454a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        AbstractC34132o.m107864I(obj);
        if (this.f162274w) {
            PaymentAnalyticsEvent paymentAnalyticsEvent = PaymentAnalyticsEvent.TokenCreate;
            this.f162275x.mo991a();
            this.f162276y.setValue(Boolean.TRUE);
        }
        return C23454a0.f92919a;
    }
}
