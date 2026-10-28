package dq0;

import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.channel.ChannelClient;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.User;
import o23.InterfaceC27474d;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: dq0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\tJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\fH&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0004H&¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001fÀ\u0006\u0003"}, m65681d2 = {"Ldq0/b;", "", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "", "token", "Lo23/d;", "Lio/getstream/chat/android/models/ConnectionData;", "c", "(Lio/getstream/chat/android/models/User;Ljava/lang/String;)Lo23/d;", "a", "messageId", "Lio/getstream/chat/android/models/Message;", "d", "(Ljava/lang/String;)Lo23/d;", "getCurrentUser", "()Lio/getstream/chat/android/models/User;", "channelType", "channelId", "Ll83/a0;", "b", "(Ljava/lang/String;Ljava/lang/String;)Lo23/d;", "e", "()V", "message", "sendMessage", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)Lo23/d;", "cid", "Lio/getstream/chat/android/client/channel/ChannelClient;", "f", "(Ljava/lang/String;)Lio/getstream/chat/android/client/channel/ChannelClient;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC12284b {
    /* JADX INFO: renamed from: a */
    InterfaceC27474d mo34186a(User user, String token);

    /* JADX INFO: renamed from: b */
    InterfaceC27474d mo34187b(String channelType, String channelId);

    /* JADX INFO: renamed from: c */
    InterfaceC27474d mo34188c(User user, String token);

    /* JADX INFO: renamed from: d */
    InterfaceC27474d mo34189d(String messageId);

    /* JADX INFO: renamed from: e */
    void mo34190e();

    /* JADX INFO: renamed from: f */
    ChannelClient mo34191f(String cid);

    User getCurrentUser();

    InterfaceC27474d sendMessage(String channelType, String channelId, Message message);
}
