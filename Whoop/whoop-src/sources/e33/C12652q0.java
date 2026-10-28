package e33;

import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: e33.q0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12652q0 extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: w */
    public int f43228w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12662v0 f43229x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12652q0(C12662v0 c12662v0, InterfaceC30057d interfaceC30057d) {
        super(1, interfaceC30057d);
        this.f43229x = c12662v0;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        return new C12652q0(this.f43229x, interfaceC30057d);
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C12652q0) create((InterfaceC30057d) obj)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f43228w;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            this.f43228w = 1;
            if (this.f43229x.m35426p(this) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return C23454a0.f92919a;
    }
}
