package io.getstream.chat.android.client.internal.offline.repository.database.internal;

import android.content.Context;
import androidx.room.AbstractC1848z0;
import androidx.room.C1818p0;
import io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelDao;
import io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.attachment.internal.AttachmentDao;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.PollDao;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageDao;
import io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.QueryChannelsDao;
import io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionDao;
import io.getstream.chat.android.client.internal.offline.repository.domain.syncState.internal.SyncStateDao;
import io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadDao;
import io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadOrderDao;
import io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.UserDao;
import java.util.LinkedHashMap;
import java.util.Map;
import p249jc.AbstractC21598x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H&¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H&¢\u0006\u0004\b&\u0010'¨\u0006)"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;", "Landroidx/room/z0;", "<init>", "()V", "Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao;", "queryChannelsDao", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;", "userDao", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;", "reactionDao", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;", "messageDao", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;", "replyMessageDao", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;", "channelStateDao", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao;", "channelConfigDao", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao;", "syncStateDao", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao;", "attachmentDao", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;", "pollDao", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;", "threadDao", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao;", "threadOrderDao", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class ChatDatabase extends AbstractC1848z0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static volatile Map<String, ChatDatabase> INSTANCES = new LinkedHashMap();

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006R\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase$Companion;", "", "<init>", "()V", "INSTANCES", "", "", "Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;", "getDatabase", "context", "Landroid/content/Context;", "userId", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final ChatDatabase getDatabase(Context context, String userId) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(userId, "userId");
            if (!ChatDatabase.INSTANCES.containsKey(userId)) {
                synchronized (this) {
                    Context applicationContext = context.getApplicationContext();
                    AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
                    C1818p0 c1818p0M60645C = AbstractC21598x.m60645C(applicationContext, ChatDatabase.class, "stream_chat_database_".concat(userId));
                    c1818p0M60645C.f7157p = false;
                    c1818p0M60645C.f7158q = true;
                    c1818p0M60645C.f7145d.add(new ChatDatabase$Companion$getDatabase$1$db$1());
                    ChatDatabase.INSTANCES.put(userId, (ChatDatabase) c1818p0M60645C.m5450b());
                }
            }
            ChatDatabase chatDatabase = (ChatDatabase) ChatDatabase.INSTANCES.get(userId);
            if (chatDatabase != null) {
                return chatDatabase;
            }
            throw new IllegalStateException("DB not created");
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public abstract AttachmentDao attachmentDao();

    public abstract ChannelConfigDao channelConfigDao();

    public abstract ChannelDao channelStateDao();

    public abstract MessageDao messageDao();

    public abstract PollDao pollDao();

    public abstract QueryChannelsDao queryChannelsDao();

    public abstract ReactionDao reactionDao();

    public abstract ReplyMessageDao replyMessageDao();

    public abstract SyncStateDao syncStateDao();

    public abstract ThreadDao threadDao();

    public abstract ThreadOrderDao threadOrderDao();

    public abstract UserDao userDao();
}
