package io.getstream.chat.android.client.api.event;

import ec3.InterfaceC13037f2;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.setup.state.ClientState;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u00020\u000b2\u001a\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00070\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;", "", "Lio/getstream/chat/android/client/setup/state/ClientState;", "clientState", "<init>", "(Lio/getstream/chat/android/client/setup/state/ClientState;)V", "Lec3/f2;", "", "", "Lio/getstream/chat/android/models/Channel;", "channels", "Lio/getstream/chat/android/client/api/event/ChatEventHandler;", "chatEventHandler", "(Lec3/f2;)Lio/getstream/chat/android/client/api/event/ChatEventHandler;", "Lio/getstream/chat/android/client/setup/state/ClientState;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public class ChatEventHandlerFactory {
    private final ClientState clientState;

    /* JADX WARN: Multi-variable type inference failed */
    public ChatEventHandlerFactory() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final ChatEventHandler chatEventHandler(InterfaceC13037f2 channels) {
        AbstractC22676k.m65750j(channels, "channels");
        return new DefaultChatEventHandler(channels, this.clientState);
    }

    public ChatEventHandlerFactory(ClientState clientState) {
        AbstractC22676k.m65750j(clientState, "clientState");
        this.clientState = clientState;
    }

    public /* synthetic */ ChatEventHandlerFactory(ClientState clientState, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? ChatClient.INSTANCE.instance().getClientState() : clientState);
    }
}
