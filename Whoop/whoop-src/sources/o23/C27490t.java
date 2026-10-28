package o23;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: o23.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C27490t extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f110730w;

    /* JADX INFO: renamed from: x */
    public int f110731x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C27485o f110732y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27490t(C27485o c27485o, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f110730w = i13;
        this.f110732y = c27485o;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f110730w) {
            case 0:
                return new C27490t(this.f110732y, interfaceC30057d, 0);
            case 1:
                return new C27490t(this.f110732y, interfaceC30057d, 1);
            default:
                return new C27490t(this.f110732y, interfaceC30057d, 2);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f110730w) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((C27490t) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f110730w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f110731x;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC27474d interfaceC27474d = this.f110732y.f110716b;
                this.f110731x = 1;
                Object objAwait = interfaceC27474d.await(this);
                return objAwait == enumC31071a ? enumC31071a : objAwait;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f110731x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC27474d interfaceC27474d2 = (InterfaceC27474d) this.f110732y.f110718d;
                this.f110731x = 1;
                Object objAwait2 = interfaceC27474d2.await(this);
                return objAwait2 == enumC31071a2 ? enumC31071a2 : objAwait2;
            default:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f110731x;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                this.f110731x = 1;
                Object objAwait3 = this.f110732y.await(this);
                return objAwait3 == enumC31071a3 ? enumC31071a3 : objAwait3;
        }
    }
}
