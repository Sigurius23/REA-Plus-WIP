package o23;

import ac3.C0745a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import n23.AbstractC26205h;
import n23.C26198a;
import n23.C26203f;
import n23.C26204g;
import p505ts.AbstractC34132o;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: o23.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C27484n extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f110712w;

    /* JADX INFO: renamed from: x */
    public int f110713x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C27485o f110714y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27484n(C27485o c27485o, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f110712w = i13;
        this.f110714y = c27485o;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f110712w) {
            case 0:
                return new C27484n(this.f110714y, interfaceC30057d, 0);
            default:
                return new C27484n(this.f110714y, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f110712w) {
            case 0:
                break;
        }
        return ((C27484n) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f110712w) {
            case 0:
                C27485o c27485o = this.f110714y;
                C0745a c0745a = c27485o.f110717c;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f110713x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC27474d interfaceC27474d = c27485o.f110716b;
                    this.f110713x = 1;
                    obj = interfaceC27474d.await(this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                if (c0745a.m1812a()) {
                    obj = null;
                }
                AbstractC26205h c26204g = (AbstractC26205h) obj;
                if (c26204g != null) {
                    Function1 function1 = (Function1) c27485o.f110718d;
                    if (c26204g instanceof C26204g) {
                        c26204g = new C26204g(function1.invoke(((C26204g) c26204g).f103919a));
                    } else if (!(c26204g instanceof C26203f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    c26204g = null;
                }
                AbstractC26205h abstractC26205h = !c0745a.m1812a() ? c26204g : null;
                return abstractC26205h == null ? new C26203f(new C26198a("The call was canceled before complete its execution.")) : abstractC26205h;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f110713x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                this.f110713x = 1;
                Object objAwait = this.f110714y.await(this);
                return objAwait == enumC31071a2 ? enumC31071a2 : objAwait;
        }
    }
}
