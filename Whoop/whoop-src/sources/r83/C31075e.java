package r83;

import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: r83.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C31075e extends AbstractC32269c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31075e(InterfaceC30063j interfaceC30063j, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30063j, interfaceC30057d);
        AbstractC22676k.m65748h(interfaceC30057d, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        AbstractC34132o.m107864I(obj);
        return obj;
    }
}
