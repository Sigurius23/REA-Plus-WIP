package ec3;

import kotlinx.coroutines.TimeoutCancellationException;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.time.Duration;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: ec3.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C13085t extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ long f45212w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13085t(long j7, InterfaceC30057d interfaceC30057d) {
        super(1, interfaceC30057d);
        this.f45212w = j7;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        return new C13085t(this.f45212w, interfaceC30057d);
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((C13085t) create((InterfaceC30057d) obj)).invokeSuspend(C23454a0.f92919a);
        throw null;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        AbstractC34132o.m107864I(obj);
        throw new TimeoutCancellationException("Timed out waiting for " + ((Object) Duration.m134302toStringimpl(this.f45212w)), null);
    }
}
