package n00;

import c93.InterfaceC4352n;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: n00.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C26082j extends AbstractC32275i implements InterfaceC4352n {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ boolean f103289w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ boolean f103290x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ boolean f103291y;

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        C26082j c26082j = new C26082j(4, (InterfaceC30057d) obj4);
        c26082j.f103289w = zBooleanValue;
        c26082j.f103290x = zBooleanValue2;
        c26082j.f103291y = zBooleanValue3;
        return c26082j.invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        AbstractC34132o.m107864I(obj);
        return Boolean.valueOf(this.f103289w && this.f103290x && this.f103291y);
    }
}
