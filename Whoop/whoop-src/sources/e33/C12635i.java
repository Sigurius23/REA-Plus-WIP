package e33;

import l83.C23454a0;
import l83.C23468n;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: e33.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C12635i extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: w */
    public int f43145w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12645n f43146x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12635i(C12645n c12645n, InterfaceC30057d interfaceC30057d) {
        super(1, interfaceC30057d);
        this.f43146x = c12645n;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        return new C12635i(this.f43146x, interfaceC30057d);
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C12635i) create((InterfaceC30057d) obj)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f43145w;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            this.f43145w = 1;
            if (this.f43146x.m35404t("negotiate on PeerConnection.IceConnectionState.DISCONNECTED", true, this) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            ((C23468n) obj).getClass();
        }
        return C23454a0.f92919a;
    }
}
