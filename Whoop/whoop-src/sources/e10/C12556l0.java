package e10;

import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: e10.l0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12556l0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public int f42882w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12568r0 f42883x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12556l0(C12568r0 c12568r0, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f42883x = c12568r0;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        return new C12556l0(this.f42883x, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C12556l0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f42882w;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            Duration.Companion companion = Duration.INSTANCE;
            long duration = DurationKt.toDuration(1, DurationUnit.SECONDS);
            this.f42882w = 1;
            if (AbstractC3034m0.m8783c(duration, this) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        C12568r0 c12568r0 = this.f42883x;
        C12558m0 c12558m0 = (C12558m0) c12568r0.f42915c.m5001b("AwaitingConfirmationResult");
        if (c12558m0 != null) {
            String str = c12558m0.f42888w;
            C12558m0 c12558m1 = c12568r0.f42920h;
            if (AbstractC22676k.m65745e(str, c12558m1 != null ? c12558m1.f42888w : null) && !c12558m0.f42890y) {
                c12568r0.m35249e(new C12559n(EnumC12557m.f42886y));
            }
        }
        return C23454a0.f92919a;
    }
}
