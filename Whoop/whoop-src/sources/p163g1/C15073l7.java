package p163g1;

import c93.InterfaceC4351m;
import l83.C23454a0;
import p180h0.InterfaceC16392g1;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: g1.l7 */
/* JADX INFO: loaded from: classes.dex */
public final class C15073l7 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f56434w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f56435x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C15093n7 f56436y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15073l7(float f13, C15093n7 c15093n7, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f56435x = f13;
        this.f56436y = c15093n7;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C15073l7 c15073l7 = new C15073l7(this.f56435x, this.f56436y, interfaceC30057d);
        c15073l7.f56434w = obj;
        return c15073l7;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C15073l7 c15073l7 = (C15073l7) create((InterfaceC16392g1) obj, (InterfaceC30057d) obj2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        c15073l7.invokeSuspend(c23454a0);
        return c23454a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        AbstractC34132o.m107864I(obj);
        ((InterfaceC16392g1) this.f56434w).mo29024a(this.f56435x - this.f56436y.f56514g.m87022x());
        return C23454a0.f92919a;
    }
}
