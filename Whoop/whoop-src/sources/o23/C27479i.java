package o23;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import e53.C12745d;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: o23.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C27479i extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f110693w;

    /* JADX INFO: renamed from: x */
    public int f110694x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C27480j f110695y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27479i(C27480j c27480j, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f110693w = i13;
        this.f110695y = c27480j;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f110693w) {
            case 0:
                return new C27479i(this.f110695y, interfaceC30057d, 0);
            default:
                return new C27479i(this.f110695y, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f110693w) {
            case 0:
                break;
        }
        return ((C27479i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f110693w) {
            case 0:
                C27480j c27480j = this.f110695y;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f110694x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC27474d interfaceC27474d = (InterfaceC27474d) c27480j.f110696a.invoke();
                    c27480j.f110700e.m1815b(interfaceC27474d);
                    this.f110694x = 1;
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
                C12745d c12745d = c27480j.f110699d;
                Object obj2 = c12745d.f43626a;
                c12745d.f43626a = null;
                if (obj2 != null) {
                    c27480j.f110697b.invoke();
                }
                return obj;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f110694x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C27480j c27480j2 = this.f110695y;
                this.f110694x = 1;
                Object objAwait = c27480j2.await(this);
                return objAwait == enumC31071a2 ? enumC31071a2 : objAwait;
        }
    }
}
