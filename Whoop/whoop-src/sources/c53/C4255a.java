package c53;

import bc3.AbstractC3006f0;
import bc3.C3004e2;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import d53.C11721b;
import d53.C11722c;
import e93.AbstractC12889b;
import hc3.C17171d;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o23.C27488r;
import p021av.C2088b;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;
import t33.AbstractC33529a;

/* JADX INFO: renamed from: c53.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C4255a implements InterfaceC2994c0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17296w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C17171d f17297x;

    public C4255a(CoroutineExceptionHandler exceptionHandler) {
        AbstractC22676k.m65750j(exceptionHandler, "exceptionHandler");
        this.f17297x = AbstractC3006f0.m8708b(AbstractC12889b.m36254T(AbstractC3006f0.m8710d(), AbstractC33529a.f139957b).plus(new C27488r()).plus(exceptionHandler));
    }

    @Override // bc3.InterfaceC2994c0
    public final InterfaceC30063j getCoroutineContext() {
        switch (this.f17296w) {
            case 0:
                break;
        }
        return this.f17297x.f65971w;
    }

    public C4255a(C4255a clientScope, InterfaceC30063j additionalContext) {
        C11721b c11721b = new C11721b();
        AbstractC22676k.m65750j(clientScope, "clientScope");
        AbstractC22676k.m65750j(additionalContext, "additionalContext");
        C17171d c17171dM8696B = AbstractC3006f0.m8696B(clientScope, c11721b);
        InterfaceC3027k1 interfaceC3027k1M8725s = AbstractC3006f0.m8725s(clientScope.f17297x.f65971w);
        this.f17297x = AbstractC3006f0.m8696B(AbstractC3006f0.m8696B(c17171dM8696B, new C11722c(new C3004e2(interfaceC3027k1M8725s), new C2088b(c11721b, 6))), additionalContext);
    }
}
