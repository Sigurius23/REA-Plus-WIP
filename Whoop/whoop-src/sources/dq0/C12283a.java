package dq0;

import c93.InterfaceC4339a;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.channel.ChannelClient;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.User;
import o23.C27478h;
import o23.InterfaceC27474d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: dq0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\n2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010#¨\u0006$"}, m65681d2 = {"Ldq0/a;", "Ldq0/b;", "Lio/getstream/chat/android/client/ChatClient;", "chatClient", "<init>", "(Lio/getstream/chat/android/client/ChatClient;)V", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "", "token", "Lo23/d;", "Lio/getstream/chat/android/models/ConnectionData;", "c", "(Lio/getstream/chat/android/models/User;Ljava/lang/String;)Lo23/d;", "a", "messageId", "Lio/getstream/chat/android/models/Message;", "d", "(Ljava/lang/String;)Lo23/d;", "getCurrentUser", "()Lio/getstream/chat/android/models/User;", "channelType", "channelId", "Ll83/a0;", "b", "(Ljava/lang/String;Ljava/lang/String;)Lo23/d;", "e", "()V", "message", "sendMessage", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)Lo23/d;", "cid", "Lio/getstream/chat/android/client/channel/ChannelClient;", "f", "(Ljava/lang/String;)Lio/getstream/chat/android/client/channel/ChannelClient;", "Lio/getstream/chat/android/client/ChatClient;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12283a implements InterfaceC12284b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ChatClient chatClient;

    public C12283a(ChatClient chatClient) {
        AbstractC22676k.m65750j(chatClient, "chatClient");
        this.chatClient = chatClient;
    }

    @Override // dq0.InterfaceC12284b
    /* JADX INFO: renamed from: a */
    public InterfaceC27474d mo34186a(User user, String token) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(token, "token");
        return ChatClient.switchUser$default(this.chatClient, user, token, (Long) null, (InterfaceC4339a) null, 12, (Object) null);
    }

    @Override // dq0.InterfaceC12284b
    /* JADX INFO: renamed from: b */
    public InterfaceC27474d mo34187b(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.chatClient.markRead(channelType, channelId);
    }

    @Override // dq0.InterfaceC12284b
    /* JADX INFO: renamed from: c */
    public InterfaceC27474d mo34188c(User user, String token) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(token, "token");
        return ChatClient.connectUser$default(this.chatClient, user, token, (Long) null, 4, (Object) null);
    }

    @Override // dq0.InterfaceC12284b
    /* JADX INFO: renamed from: d */
    public InterfaceC27474d mo34189d(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return ChatClient.deleteMessage$default(this.chatClient, messageId, false, 2, null);
    }

    @Override // dq0.InterfaceC12284b
    /* JADX INFO: renamed from: e */
    public void mo34190e() {
        ((C27478h) ChatClient.disconnect$default(this.chatClient, true, false, 2, null)).enqueue();
    }

    @Override // dq0.InterfaceC12284b
    /* JADX INFO: renamed from: f */
    public ChannelClient mo34191f(String cid) {
        AbstractC22676k.m65750j(cid, "cid");
        return this.chatClient.channel(cid);
    }

    @Override // dq0.InterfaceC12284b
    public User getCurrentUser() {
        return this.chatClient.getCurrentUser();
    }

    @Override // dq0.InterfaceC12284b
    public InterfaceC27474d sendMessage(String channelType, String channelId, Message message) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(message, "message");
        return ChatClient.sendMessage$default(this.chatClient, channelType, channelId, message, false, 8, null);
    }
}
