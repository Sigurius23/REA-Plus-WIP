package io.getstream.chat.android.p226ui.common.feature.channel.header;

import bc3.InterfaceC2994c0;
import ch.C4588i;
import ec3.AbstractC13091v;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.state.ChatClientExtensions;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.p226ui.common.state.messages.list.ChannelHeaderViewState;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController;", "", "", "cid", "Lbc3/c0;", "scope", "Lio/getstream/chat/android/client/ChatClient;", "chatClient", "Lec3/l;", "Lio/getstream/chat/android/client/channel/state/ChannelState;", "channelState", "<init>", "(Ljava/lang/String;Lbc3/c0;Lio/getstream/chat/android/client/ChatClient;Lec3/l;)V", "Lbc3/c0;", "Lio/getstream/chat/android/client/ChatClient;", "Lec3/f2;", "Lio/getstream/chat/android/ui/common/state/messages/list/ChannelHeaderViewState;", "state", "Lec3/f2;", "getState", "()Lec3/f2;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelHeaderViewController {
    public static final int $stable = 8;
    private final ChatClient chatClient;
    private final InterfaceC2994c0 scope;
    private final InterfaceC13037f2 state;

    public ChannelHeaderViewController(String cid, InterfaceC2994c0 scope, ChatClient chatClient, InterfaceC13058l channelState) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(channelState, "channelState");
        this.scope = scope;
        this.chatClient = chatClient;
        this.state = AbstractC13091v.m36587M(AbstractC13091v.m36590P(channelState, new ChannelHeaderViewController$special$$inlined$flatMapLatest$1(null, this)), scope, C13105z1.m36630a(2, 5000L), ChannelHeaderViewState.Loading.INSTANCE);
    }

    public final InterfaceC13037f2 getState() {
        return this.state;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChannelHeaderViewController(String str, InterfaceC2994c0 interfaceC2994c0, ChatClient chatClient, InterfaceC13058l interfaceC13058l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        chatClient = (i13 & 4) != 0 ? ChatClient.INSTANCE.instance() : chatClient;
        this(str, interfaceC2994c0, chatClient, (i13 & 8) != 0 ? new C4588i(ChatClientExtensions.watchChannelAsState(chatClient, str, 0, interfaceC2994c0), 2) : interfaceC13058l);
    }
}
