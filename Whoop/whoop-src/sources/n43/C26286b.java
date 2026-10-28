package n43;

import c93.InterfaceC4353o;
import java.util.List;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import t23.InterfaceC33377d3;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: n43.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C26286b extends AbstractC32275i implements InterfaceC4353o {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ InterfaceC33377d3 f104495w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ List f104496x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ List f104497y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ boolean f104498z;

    @Override // c93.InterfaceC4353o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        C26286b c26286b = new C26286b(5, (InterfaceC30057d) obj5);
        c26286b.f104495w = (InterfaceC33377d3) obj;
        c26286b.f104496x = (List) obj2;
        c26286b.f104497y = (List) obj3;
        c26286b.f104498z = zBooleanValue;
        return c26286b.invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        AbstractC34132o.m107864I(obj);
        return AbstractC37056f.m118959K(this.f104495w, this.f104496x, this.f104497y, Boolean.valueOf(this.f104498z));
    }
}
