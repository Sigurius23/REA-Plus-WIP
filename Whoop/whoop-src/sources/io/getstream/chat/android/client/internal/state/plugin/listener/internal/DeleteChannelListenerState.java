package io.getstream.chat.android.client.internal.state.plugin.listener.internal;

import io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry;
import io.getstream.chat.android.client.plugin.listeners.DeleteChannelListener;
import io.getstream.chat.android.client.setup.state.ClientState;
import io.getstream.chat.android.models.User;
import l83.C23454a0;
import n23.AbstractC26205h;
import n23.C26198a;
import n23.C26203f;
import n23.C26204g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteChannelListenerState;", "Lio/getstream/chat/android/client/plugin/listeners/DeleteChannelListener;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "logic", "Lio/getstream/chat/android/client/setup/state/ClientState;", "clientState", "<init>", "(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;)V", "Lio/getstream/chat/android/models/User;", "currentUser", "", "channelType", "channelId", "Ll83/a0;", "onDeleteChannelRequest", "(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Ln23/h;", "Lio/getstream/chat/android/models/Channel;", "result", "onDeleteChannelResult", "(Ljava/lang/String;Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;", "onDeleteChannelPrecondition", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "Lio/getstream/chat/android/client/setup/state/ClientState;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DeleteChannelListenerState implements DeleteChannelListener {
    private final ClientState clientState;
    private final LogicRegistry logic;

    public DeleteChannelListenerState(LogicRegistry logic, ClientState clientState) {
        AbstractC22676k.m65750j(logic, "logic");
        AbstractC22676k.m65750j(clientState, "clientState");
        this.logic = logic;
        this.clientState = clientState;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.DeleteChannelListener
    public final Object onDeleteChannelPrecondition(User user, String str, String str2, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return user != null ? new C26204g(C23454a0.f92919a) : new C26203f(new C26198a("Current user is null!"));
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.DeleteChannelListener
    public final Object onDeleteChannelRequest(User user, String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.DeleteChannelListener
    public final Object onDeleteChannelResult(String str, String str2, AbstractC26205h abstractC26205h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }
}
