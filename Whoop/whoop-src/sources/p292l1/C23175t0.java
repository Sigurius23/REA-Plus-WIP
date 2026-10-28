package p292l1;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p180h0.InterfaceC16413k2;
import p329n0.C26068u;
import p390p1.C28621h1;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: l1.t0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23175t0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f91673w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C26068u f91674x;

    /* JADX INFO: renamed from: y */
    public int f91675y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f91676z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23175t0(int i13, C26068u c26068u, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f91674x = c26068u;
        this.f91676z = i13;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f91673w) {
            case 0:
                return new C23175t0(this.f91676z, this.f91674x, interfaceC30057d);
            default:
                return new C23175t0(this.f91674x, this.f91675y, this.f91676z, interfaceC30057d);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f91673w) {
            case 0:
                return ((C23175t0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                C23175t0 c23175t0 = (C23175t0) create((InterfaceC16413k2) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c23175t0.invokeSuspend(c23454a0);
                return c23454a0;
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f91673w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        int i14 = this.f91676z;
        C26068u c26068u = this.f91674x;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i15 = this.f91675y;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                if (c26068u.f103226i.mo9765b() || ((C28621h1) c26068u.f103222e.f91958b).m87024x() == i14) {
                    return c23454a0;
                }
                this.f91675y = 1;
                return c26068u.m77567j(i14, 0, this) == enumC31071a ? enumC31071a : c23454a0;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                c26068u.m77568k(this.f91675y, i14);
                return c23454a0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23175t0(C26068u c26068u, int i13, int i14, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f91674x = c26068u;
        this.f91675y = i13;
        this.f91676z = i14;
    }
}
