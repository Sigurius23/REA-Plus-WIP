package p249jc;

import bc3.AbstractC3034m0;
import c93.InterfaceC4352n;
import l83.C23454a0;
import p218ic.C18389w;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: jc.m */
/* JADX INFO: loaded from: classes.dex */
public final class C21587m extends AbstractC32275i implements InterfaceC4352n {

    /* JADX INFO: renamed from: w */
    public int f82779w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Throwable f82780x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ long f82781y;

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        C21587m c21587m = new C21587m(4, (InterfaceC30057d) obj4);
        c21587m.f82780x = (Throwable) obj2;
        c21587m.f82781y = jLongValue;
        return c21587m.invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f82779w;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            Throwable th3 = this.f82780x;
            long j7 = this.f82781y;
            C18389w.m52886d().m52890c(AbstractC21588n.f82782a, "Cannot check for unfinished work", th3);
            long jMin = Math.min(j7 * ((long) 30000), AbstractC21588n.f82783b);
            this.f82779w = 1;
            if (AbstractC3034m0.m8782b(jMin, this) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return Boolean.TRUE;
    }
}
