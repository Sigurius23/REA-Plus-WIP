package p163g1;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: g1.f7 */
/* JADX INFO: loaded from: classes.dex */
public final class C15009f7 extends AbstractC32275i implements Function3 {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ InterfaceC2994c0 f56144w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ float f56145x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C15093n7 f56146y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15009f7(C15093n7 c15093n7, InterfaceC30057d interfaceC30057d) {
        super(3, interfaceC30057d);
        this.f56146y = c15093n7;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        C15009f7 c15009f7 = new C15009f7(this.f56146y, (InterfaceC30057d) obj3);
        c15009f7.f56144w = (InterfaceC2994c0) obj;
        c15009f7.f56145x = fFloatValue;
        C23454a0 c23454a0 = C23454a0.f92919a;
        c15009f7.invokeSuspend(c23454a0);
        return c23454a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        AbstractC34132o.m107864I(obj);
        AbstractC3006f0.m8732z(this.f56144w, null, null, new C15065l(this.f56146y, this.f56145x, null, 1), 3);
        return C23454a0.f92919a;
    }
}
