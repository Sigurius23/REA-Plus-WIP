package io.getstream.chat.android.p226ui.viewmodel.channels.internal;

import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import ch.C4588i;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.state.ChatClientExtensions;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModel;", "Landroidx/lifecycle/w1;", "", "cid", "Lio/getstream/chat/android/client/ChatClient;", "chatClient", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;)V", "Lec3/l;", "Lio/getstream/chat/android/client/channel/state/ChannelState;", "observeChannelState", "()Lec3/l;", "Ljava/lang/String;", "Lio/getstream/chat/android/client/ChatClient;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "channelState", "Lec3/l;", "Landroidx/lifecycle/p0;", "Lio/getstream/chat/android/models/Channel;", "channel", "Landroidx/lifecycle/p0;", "getChannel", "()Landroidx/lifecycle/p0;", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelActionsViewModel extends AbstractC1637w1 {
    private static final Companion Companion = new Companion();
    private static final int DEFAULT_MESSAGE_LIMIT = 0;
    private final AbstractC1615p0 channel;
    private final InterfaceC13058l channelState;
    private final ChatClient chatClient;
    private final String cid;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModel$Companion;", "", "<init>", "()V", "DEFAULT_MESSAGE_LIMIT", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public /* synthetic */ ChannelActionsViewModel(String str, ChatClient chatClient, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? ChatClient.INSTANCE.instance() : chatClient);
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final InterfaceC13058l observeChannelState() {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11895b.m31996o("[observeChannelState] cid: ", this.cid, ", messageLimit: 0"), null);
        }
        return new C4588i(ChatClientExtensions.watchChannelAsState(this.chatClient, this.cid, 0, AbstractC1640x1.m5043b(this)), 2);
    }

    public final AbstractC1615p0 getChannel() {
        return this.channel;
    }

    public ChannelActionsViewModel(String cid, ChatClient chatClient) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        this.cid = cid;
        this.chatClient = chatClient;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:ChannelActionsVM");
        InterfaceC13058l interfaceC13058lObserveChannelState = observeChannelState();
        this.channelState = interfaceC13058lObserveChannelState;
        this.channel = AbstractC1613o1.m5012b(AbstractC13091v.m36590P(interfaceC13058lObserveChannelState, new ChannelActionsViewModel$special$$inlined$flatMapLatest$1(3, null)), null, 3);
    }
}
