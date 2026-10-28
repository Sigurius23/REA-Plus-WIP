package ec3;

import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: ec3.f0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13035f0 extends AbstractC32275i implements InterfaceC4352n {

    /* JADX INFO: renamed from: w */
    public int f45053w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Throwable f45054x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ long f45055y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4351m f45056z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13035f0(InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        super(4, interfaceC30057d);
        this.f45056z = interfaceC4351m;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        C13035f0 c13035f0 = new C13035f0(this.f45056z, (InterfaceC30057d) obj4);
        c13035f0.f45054x = (Throwable) obj2;
        c13035f0.f45055y = jLongValue;
        return c13035f0.invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f45053w;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            Throwable th3 = this.f45054x;
            if (this.f45055y < Long.MAX_VALUE) {
                this.f45053w = 1;
                obj = this.f45056z.invoke(th3, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        boolean z4 = ((Boolean) obj).booleanValue();
        return Boolean.valueOf(z4);
    }
}
