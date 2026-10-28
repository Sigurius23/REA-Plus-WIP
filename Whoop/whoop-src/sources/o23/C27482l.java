package o23;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: o23.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C27482l extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f110705w;

    /* JADX INFO: renamed from: x */
    public int f110706x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C27481k f110707y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27482l(C27481k c27481k, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f110705w = i13;
        this.f110707y = c27481k;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f110705w) {
            case 0:
                return new C27482l(this.f110707y, interfaceC30057d, 0);
            default:
                return new C27482l(this.f110707y, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f110705w) {
            case 0:
                break;
        }
        return ((C27482l) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.jvm.functions.Function1, s83.i] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f110705w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f110706x;
                C27481k c27481k = this.f110707y;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ?? r10 = c27481k.f110703c;
                    this.f110706x = 1;
                    if (r10.invoke(this) != enumC31071a) {
                    }
                    return enumC31071a;
                }
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC27474d interfaceC27474d = c27481k.f110702b;
                this.f110706x = 2;
                Object objAwait = interfaceC27474d.await(this);
                if (objAwait != enumC31071a) {
                    return objAwait;
                }
                return enumC31071a;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f110706x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                this.f110706x = 1;
                Object objAwait2 = this.f110707y.await(this);
                return objAwait2 == enumC31071a2 ? enumC31071a2 : objAwait2;
        }
    }
}
