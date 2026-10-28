package o23;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import p505ts.AbstractC34132o;
import p715kotlin.NoWhenBranchMatchedException;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: o23.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C27489s extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f110727w;

    /* JADX INFO: renamed from: x */
    public int f110728x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C27481k f110729y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27489s(C27481k c27481k, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f110727w = i13;
        this.f110729y = c27481k;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f110727w) {
            case 0:
                return new C27489s(this.f110729y, interfaceC30057d, 0);
            default:
                return new C27489s(this.f110729y, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f110727w) {
            case 0:
                break;
        }
        return ((C27489s) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.jvm.functions.Function1, s83.i] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f110727w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f110728x;
                C27481k c27481k = this.f110729y;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ?? r10 = c27481k.f110703c;
                    this.f110728x = 1;
                    obj = r10.invoke(this);
                    if (obj != enumC31071a) {
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
                AbstractC26205h abstractC26205h = (AbstractC26205h) obj;
                if (!(abstractC26205h instanceof C26204g)) {
                    if (abstractC26205h instanceof C26203f) {
                        return abstractC26205h;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC27474d interfaceC27474d = c27481k.f110702b;
                this.f110728x = 2;
                Object objAwait = interfaceC27474d.await(this);
                if (objAwait != enumC31071a) {
                    return objAwait;
                }
                return enumC31071a;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f110728x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                this.f110728x = 1;
                Object objAwait2 = this.f110729y.await(this);
                return objAwait2 == enumC31071a2 ? enumC31071a2 : objAwait2;
        }
    }
}
