package r83;

import c93.InterfaceC4351m;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: r83.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C31073c extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public int f128120w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4351m f128121x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC30057d f128122y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31073c(InterfaceC30057d interfaceC30057d, InterfaceC30063j interfaceC30063j, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d2) {
        super(interfaceC30063j, interfaceC30057d);
        this.f128121x = interfaceC4351m;
        this.f128122y = interfaceC30057d2;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f128120w;
        if (i13 != 0) {
            if (i13 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f128120w = 2;
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        this.f128120w = 1;
        AbstractC34132o.m107864I(obj);
        InterfaceC4351m interfaceC4351m = this.f128121x;
        AbstractC22676k.m65748h(interfaceC4351m, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        AbstractC22681m0.m65774e(2, interfaceC4351m);
        return interfaceC4351m.invoke(this.f128122y, this);
    }
}
