package io.getstream.chat.android.client.internal.state.plugin.factory;

import b23.C2343i;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.C2986a0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p715kotlin.Metadata;
import q83.AbstractC30054a;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.factory.StreamStatePluginFactory$createStatePlugin$$inlined$CoroutineExceptionHandler$1 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"io/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory$createStatePlugin$$inlined$CoroutineExceptionHandler$1", "Lq83/a;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lq83/j;", "context", "", "exception", "Ll83/a0;", "handleException", "(Lq83/j;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class C19288x3c221bbd extends AbstractC30054a implements CoroutineExceptionHandler {
    public C19288x3c221bbd(C2986a0 c2986a0) {
        super(c2986a0);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(InterfaceC30063j context, Throwable exception) {
        C2343i c2343i = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e = C2343i.f9272d;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        if (interfaceC2339e.isLoggable(enumC2341g, "StreamStatePlugin")) {
            C2343i.f9271c.log(enumC2341g, "StreamStatePlugin", "[uncaughtCoroutineException] throwable: " + exception + ", context: " + context, exception);
        }
    }
}
