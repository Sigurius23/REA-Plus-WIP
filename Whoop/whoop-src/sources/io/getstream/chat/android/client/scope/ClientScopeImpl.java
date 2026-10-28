package io.getstream.chat.android.client.scope;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import e93.AbstractC12889b;
import io.getstream.chat.android.core.internal.coroutines.DispatcherProvider;
import o23.C27488r;
import p715kotlin.Metadata;
import q83.InterfaceC30063j;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m65681d2 = {"Lio/getstream/chat/android/client/scope/ClientScopeImpl;", "Lio/getstream/chat/android/client/scope/ClientScope;", "Lbc3/c0;", "<init>", "()V", "Lq83/j;", "getCoroutineContext", "()Lq83/j;", "coroutineContext", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class ClientScopeImpl implements ClientScope, InterfaceC2994c0 {
    private final /* synthetic */ InterfaceC2994c0 $$delegate_0 = AbstractC3006f0.m8708b(AbstractC12889b.m36254T(AbstractC3006f0.m8710d(), DispatcherProvider.INSTANCE.getIO()).plus(new C27488r()));

    @Override // io.getstream.chat.android.client.scope.ClientScope, bc3.InterfaceC2994c0
    public final InterfaceC30063j getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }
}
