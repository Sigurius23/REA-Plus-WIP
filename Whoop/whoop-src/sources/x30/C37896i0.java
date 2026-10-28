package x30;

import c93.InterfaceC4352n;
import g40.C15431u3;
import g40.InterfaceC15421s3;
import l83.C23454a0;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: x30.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37896i0 extends AbstractC32275i implements InterfaceC4352n {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ InterfaceC15421s3 f162259w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ String f162260x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ boolean f162261y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28601c1 f162262z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37896i0(InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d interfaceC30057d) {
        super(4, interfaceC30057d);
        this.f162262z = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        C37896i0 c37896i0 = new C37896i0(this.f162262z, (InterfaceC30057d) obj4);
        c37896i0.f162259w = (InterfaceC15421s3) obj;
        c37896i0.f162260x = (String) obj2;
        c37896i0.f162261y = zBooleanValue;
        return c37896i0.invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        AbstractC34132o.m107864I(obj);
        return Boolean.valueOf((this.f162259w instanceof C15431u3) && !this.f162261y && !((Boolean) this.f162262z.getValue()).booleanValue() && this.f162260x.length() == 16);
    }
}
