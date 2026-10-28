package p163g1;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.C13096w1;
import l83.C23454a0;
import p238j0.C21084j;
import p238j0.InterfaceC21083i;
import p505ts.AbstractC34132o;
import p668z1.C39967p;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: g1.o1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15097o1 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56545w;

    /* JADX INFO: renamed from: x */
    public int f56546x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC21083i f56547y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C39967p f56548z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15097o1(InterfaceC21083i interfaceC21083i, C39967p c39967p, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f56545w = i13;
        this.f56547y = interfaceC21083i;
        this.f56548z = c39967p;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f56545w) {
            case 0:
                return new C15097o1(this.f56547y, this.f56548z, interfaceC30057d, 0);
            case 1:
                return new C15097o1(this.f56547y, this.f56548z, interfaceC30057d, 1);
            case 2:
                return new C15097o1(this.f56547y, this.f56548z, interfaceC30057d, 2);
            default:
                return new C15097o1(this.f56547y, this.f56548z, interfaceC30057d, 3);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f56545w) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((C15097o1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f56545w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f56546x;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj);
                C13096w1 c13096w1 = ((C21084j) this.f56547y).f79947a;
                C15087n1 c15087n1 = new C15087n1(this.f56548z, 0);
                this.f56546x = 1;
                c13096w1.collect(c15087n1, this);
                return enumC31071a;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f56546x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj);
                C13096w1 c13096w2 = ((C21084j) this.f56547y).f79947a;
                C15087n1 c15087n2 = new C15087n1(this.f56548z, 1);
                this.f56546x = 1;
                c13096w2.collect(c15087n2, this);
                return enumC31071a2;
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f56546x;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj);
                C13096w1 c13096w3 = ((C21084j) this.f56547y).f79947a;
                C15087n1 c15087n3 = new C15087n1(this.f56548z, 2);
                this.f56546x = 1;
                c13096w3.collect(c15087n3, this);
                return enumC31071a3;
            default:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i16 = this.f56546x;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj);
                C13096w1 c13096w4 = ((C21084j) this.f56547y).f79947a;
                C15087n1 c15087n4 = new C15087n1(this.f56548z, 3);
                this.f56546x = 1;
                c13096w4.collect(c15087n4, this);
                return enumC31071a4;
        }
    }
}
