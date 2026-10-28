package j00;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import n00.EnumC26076d;
import p027b3.C2463x1;
import p027b3.InterfaceC2464x2;
import p164g2.C15240l;
import p164g2.InterfaceC15237i;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: j00.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C21122y extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f80174w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC15237i f80175x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC2464x2 f80176y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28601c1 f80177z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21122y(InterfaceC15237i interfaceC15237i, InterfaceC2464x2 interfaceC2464x2, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f80174w = i13;
        this.f80175x = interfaceC15237i;
        this.f80176y = interfaceC2464x2;
        this.f80177z = interfaceC28601c1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f80174w) {
            case 0:
                return new C21122y(this.f80175x, this.f80176y, this.f80177z, interfaceC30057d, 0);
            default:
                return new C21122y(this.f80175x, this.f80176y, this.f80177z, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f80174w) {
            case 0:
                C21122y c21122y = (C21122y) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c21122y.invokeSuspend(c23454a0);
                return c23454a0;
            default:
                C21122y c21122y2 = (C21122y) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a1 = C23454a0.f92919a;
                c21122y2.invokeSuspend(c23454a1);
                return c23454a1;
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f80174w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        InterfaceC2464x2 interfaceC2464x2 = this.f80176y;
        InterfaceC15237i interfaceC15237i = this.f80175x;
        InterfaceC28601c1 interfaceC28601c1 = this.f80177z;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                if (((C21108k) interfaceC28601c1.getValue()).f80054k == EnumC26076d.f103266w && ((C21108k) interfaceC28601c1.getValue()).f80044a != null) {
                    ((C15240l) interfaceC15237i).m43339b(true);
                    if (interfaceC2464x2 != null) {
                        ((C2463x1) interfaceC2464x2).m7442a();
                    }
                }
                break;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                if (((C21108k) interfaceC28601c1.getValue()).f80054k == EnumC26076d.f103266w && ((C21108k) interfaceC28601c1.getValue()).f80044a != null) {
                    ((C15240l) interfaceC15237i).m43339b(true);
                    if (interfaceC2464x2 != null) {
                        ((C2463x1) interfaceC2464x2).m7442a();
                    }
                }
                break;
        }
        return c23454a0;
    }
}
