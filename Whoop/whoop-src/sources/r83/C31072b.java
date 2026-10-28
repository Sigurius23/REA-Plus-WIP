package r83;

import c93.InterfaceC4351m;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import q83.InterfaceC30057d;
import s83.AbstractC32273g;

/* JADX INFO: renamed from: r83.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C31072b extends AbstractC32273g {

    /* JADX INFO: renamed from: w */
    public int f128117w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4351m f128118x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC30057d f128119y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31072b(InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d, InterfaceC30057d interfaceC30057d2) {
        super(interfaceC30057d);
        this.f128118x = interfaceC4351m;
        this.f128119y = interfaceC30057d2;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f128117w;
        if (i13 != 0) {
            if (i13 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f128117w = 2;
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        this.f128117w = 1;
        AbstractC34132o.m107864I(obj);
        InterfaceC4351m interfaceC4351m = this.f128118x;
        AbstractC22676k.m65748h(interfaceC4351m, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        AbstractC22681m0.m65774e(2, interfaceC4351m);
        return interfaceC4351m.invoke(this.f128119y, this);
    }
}
