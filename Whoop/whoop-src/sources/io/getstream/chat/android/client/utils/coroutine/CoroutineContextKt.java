package io.getstream.chat.android.client.utils.coroutine;

import bc3.C3023j1;
import bc3.InterfaceC3027k1;
import java.util.concurrent.CancellationException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;
import xb3.InterfaceC38174i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lq83/j;", "Lbc3/k1;", "exclusion", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Ll83/a0;", "cancelChildrenExcept", "(Lq83/j;Lbc3/k1;Ljava/util/concurrent/CancellationException;)V", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class CoroutineContextKt {
    public static final void cancelChildrenExcept(InterfaceC30063j interfaceC30063j, InterfaceC3027k1 interfaceC3027k1, CancellationException cancellationException) {
        InterfaceC38174i<InterfaceC3027k1> children;
        AbstractC22676k.m65750j(interfaceC30063j, "<this>");
        InterfaceC3027k1 interfaceC3027k2 = (InterfaceC3027k1) interfaceC30063j.get(C3023j1.f12041w);
        if (interfaceC3027k2 == null || (children = interfaceC3027k2.getChildren()) == null) {
            return;
        }
        for (InterfaceC3027k1 interfaceC3027k3 : children) {
            if (!AbstractC22676k.m65745e(interfaceC3027k1, interfaceC3027k3)) {
                interfaceC3027k3.cancel(cancellationException);
            }
        }
    }

    public static /* synthetic */ void cancelChildrenExcept$default(InterfaceC30063j interfaceC30063j, InterfaceC3027k1 interfaceC3027k1, CancellationException cancellationException, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            cancellationException = null;
        }
        cancelChildrenExcept(interfaceC30063j, interfaceC3027k1, cancellationException);
    }
}
