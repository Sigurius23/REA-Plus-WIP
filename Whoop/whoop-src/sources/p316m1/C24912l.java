package p316m1;

import bc3.C3054r1;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p180h0.AbstractC16444q3;
import p292l1.C23203x4;
import p505ts.AbstractC34132o;
import p512u2.C34462h0;
import p512u2.InterfaceC34476v;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: m1.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C24912l extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C23203x4 f97573E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f97574w;

    /* JADX INFO: renamed from: x */
    public int f97575x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f97576y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC34476v f97577z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24912l(InterfaceC34476v interfaceC34476v, C23203x4 c23203x4, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f97574w = i13;
        this.f97577z = interfaceC34476v;
        this.f97573E = c23203x4;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f97574w) {
            case 0:
                C24912l c24912l = new C24912l(this.f97577z, this.f97573E, interfaceC30057d, 0);
                c24912l.f97576y = obj;
                return c24912l;
            default:
                C24912l c24912l2 = new C24912l(this.f97577z, this.f97573E, interfaceC30057d, 1);
                c24912l2.f97576y = obj;
                return c24912l2;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f97574w) {
            case 0:
                break;
        }
        return ((C24912l) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f97574w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f97575x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C24910k c24910k = new C24910k((InterfaceC2994c0) this.f97576y, this.f97573E, null);
                    this.f97575x = 1;
                    if (AbstractC16444q3.m46625g(this.f97577z, c24910k, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f97575x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C3054r1 c3054r1 = new C3054r1((InterfaceC2994c0) this.f97576y, this.f97573E, (InterfaceC30057d) null);
                    this.f97575x = 1;
                    if (((C34462h0) this.f97577z).m108934X0(c3054r1, this) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
        }
    }
}
