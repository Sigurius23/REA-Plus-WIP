package t23;

import c43.C4207w;
import c93.InterfaceC4352n;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: t23.f2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33387f2 extends AbstractC32275i implements InterfaceC4352n {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ C4207w f139381w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ boolean f139382x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ boolean f139383y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C33392g2 f139384z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33387f2(C33392g2 c33392g2, InterfaceC30057d interfaceC30057d) {
        super(4, interfaceC30057d);
        this.f139384z = c33392g2;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        C33387f2 c33387f2 = new C33387f2(this.f139384z, (InterfaceC30057d) obj4);
        c33387f2.f139381w = (C4207w) obj;
        c33387f2.f139382x = zBooleanValue;
        c33387f2.f139383y = zBooleanValue2;
        return c33387f2.invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        AbstractC34132o.m107864I(obj);
        return new C33376d2(this.f139384z.f139422a, this.f139381w, this.f139382x, this.f139383y);
    }
}
