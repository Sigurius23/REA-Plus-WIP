package io.getstream.chat.android.client.internal.offline.plugin.listener.internal;

import io.getstream.chat.android.client.persistance.repository.ChannelRepository;
import io.getstream.chat.android.client.persistance.repository.UserRepository;
import io.getstream.chat.android.client.plugin.listeners.DeleteChannelListener;
import io.getstream.chat.android.client.setup.state.ClientState;
import io.getstream.chat.android.models.User;
import l83.C23454a0;
import n23.AbstractC26205h;
import n23.C26204g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ*\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J0\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteChannelListenerDatabase;", "Lio/getstream/chat/android/client/plugin/listeners/DeleteChannelListener;", "Lio/getstream/chat/android/client/setup/state/ClientState;", "clientState", "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;", "channelRepository", "Lio/getstream/chat/android/client/persistance/repository/UserRepository;", "userRepository", "<init>", "(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;Lio/getstream/chat/android/client/persistance/repository/UserRepository;)V", "Lio/getstream/chat/android/models/User;", "currentUser", "", "channelType", "channelId", "Ll83/a0;", "onDeleteChannelRequest", "(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Ln23/h;", "Lio/getstream/chat/android/models/Channel;", "result", "onDeleteChannelResult", "(Ljava/lang/String;Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;", "onDeleteChannelPrecondition", "Lio/getstream/chat/android/client/setup/state/ClientState;", "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;", "Lio/getstream/chat/android/client/persistance/repository/UserRepository;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DeleteChannelListenerDatabase implements DeleteChannelListener {
    private final ChannelRepository channelRepository;
    private final ClientState clientState;
    private final UserRepository userRepository;

    public DeleteChannelListenerDatabase(ClientState clientState, ChannelRepository channelRepository, UserRepository userRepository) {
        AbstractC22676k.m65750j(clientState, "clientState");
        AbstractC22676k.m65750j(channelRepository, "channelRepository");
        AbstractC22676k.m65750j(userRepository, "userRepository");
        this.clientState = clientState;
        this.channelRepository = channelRepository;
        this.userRepository = userRepository;
    }

    @Override // io.getstream.chat.android.client.plugin.listeners.DeleteChannelListener
    public final Object onDeleteChannelPrecondition(User user, String str, String str2, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return new C26204g(C23454a0.f92919a);
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
