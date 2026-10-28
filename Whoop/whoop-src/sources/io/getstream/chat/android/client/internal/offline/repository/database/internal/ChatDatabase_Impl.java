package io.getstream.chat.android.client.internal.offline.repository.database.internal;

import androidx.room.AbstractC1788g1;
import androidx.room.C1835v;
import androidx.room.InterfaceC1792h1;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelDao;
import io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelEntityKt;
import io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao;
import io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigEntityKt;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.attachment.internal.AttachmentDao;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.attachment.internal.AttachmentDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.attachment.internal.AttachmentEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.attachment.internal.ReplyAttachmentEntity;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DraftMessageEntityKt;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageEntityKt;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.PollDao;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.PollDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.PollKt;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageDao;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.ReplyMessageEntityKt;
import io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.QueryChannelsDao;
import io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.QueryChannelsDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.QueryChannelsEntityKt;
import io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionDao;
import io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionEntityKt;
import io.getstream.chat.android.client.internal.offline.repository.domain.syncState.internal.SyncStateDao;
import io.getstream.chat.android.client.internal.offline.repository.domain.syncState.internal.SyncStateDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.syncState.internal.SyncStateEntityKt;
import io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadDao;
import io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadEntityKt;
import io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadOrderDao;
import io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadOrderDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadOrderEntityKt;
import io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.UserDao;
import io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.UserDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.UserEntityKt;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.InterfaceC23462h;
import m83.C25271y;
import p325mb.AbstractC25380b;
import p325mb.InterfaceC25379a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J)\u0010\u000f\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u000e0\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\r0\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u001a\u0010\u0015\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\r\u0012\u0004\u0012\u00020\u00120\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00190=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001c0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001f0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010?R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\"0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010?R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020%0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010?R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020(0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010?R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020+0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010?R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020.0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010?R\u001a\u0010G\u001a\b\u0012\u0004\u0012\u0002010=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010?R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u0002040=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010?R\u001a\u0010I\u001a\b\u0012\u0004\u0012\u0002070=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010?R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020:0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010?¨\u0006K"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;", "Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;", "<init>", "()V", "Landroidx/room/g1;", "createOpenDelegate", "()Landroidx/room/g1;", "Landroidx/room/v;", "createInvalidationTracker", "()Landroidx/room/v;", "Ll83/a0;", "clearAllTables", "", "Lj93/d;", "", "getRequiredTypeConverterClasses", "()Ljava/util/Map;", "", "Lmb/a;", "getRequiredAutoMigrationSpecClasses", "()Ljava/util/Set;", "autoMigrationSpecs", "Lmb/b;", "createAutoMigrations", "(Ljava/util/Map;)Ljava/util/List;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao;", "queryChannelsDao", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;", "userDao", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;", "reactionDao", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;", "messageDao", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;", "replyMessageDao", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;", "channelStateDao", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao;", "channelConfigDao", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao;", "syncStateDao", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao;", "attachmentDao", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;", "pollDao", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;", "threadDao", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao;", "threadOrderDao", "()Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao;", "Ll83/h;", "_queryChannelsDao", "Ll83/h;", "_userDao", "_reactionDao", "_messageDao", "_replyMessageDao", "_channelDao", "_channelConfigDao", "_syncStateDao", "_attachmentDao", "_pollDao", "_threadDao", "_threadOrderDao", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChatDatabase_Impl extends ChatDatabase {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f73810a = 0;
    private final InterfaceC23462h _attachmentDao;
    private final InterfaceC23462h _channelConfigDao;
    private final InterfaceC23462h _channelDao;
    private final InterfaceC23462h _messageDao;
    private final InterfaceC23462h _pollDao;
    private final InterfaceC23462h _queryChannelsDao;
    private final InterfaceC23462h _reactionDao;
    private final InterfaceC23462h _replyMessageDao;
    private final InterfaceC23462h _syncStateDao;
    private final InterfaceC23462h _threadDao;
    private final InterfaceC23462h _threadOrderDao;
    private final InterfaceC23462h _userDao;

    public ChatDatabase_Impl() {
        final int i13 = 0;
        this._queryChannelsDao = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.internal.offline.repository.database.internal.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChatDatabase_Impl f73812x;

            {
                this.f73812x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i14 = i13;
                ChatDatabase_Impl chatDatabase_Impl = this.f73812x;
                switch (i14) {
                    case 0:
                        int i15 = ChatDatabase_Impl.f73810a;
                        return new QueryChannelsDao_Impl(chatDatabase_Impl);
                    case 1:
                        int i16 = ChatDatabase_Impl.f73810a;
                        return new AttachmentDao_Impl(chatDatabase_Impl);
                    case 2:
                        int i17 = ChatDatabase_Impl.f73810a;
                        return new PollDao_Impl(chatDatabase_Impl);
                    case 3:
                        int i18 = ChatDatabase_Impl.f73810a;
                        return new ThreadDao_Impl(chatDatabase_Impl);
                    case 4:
                        int i19 = ChatDatabase_Impl.f73810a;
                        return new ThreadOrderDao_Impl(chatDatabase_Impl);
                    case 5:
                        int i24 = ChatDatabase_Impl.f73810a;
                        return new UserDao_Impl(chatDatabase_Impl);
                    case 6:
                        int i25 = ChatDatabase_Impl.f73810a;
                        return new ReactionDao_Impl(chatDatabase_Impl);
                    case 7:
                        int i26 = ChatDatabase_Impl.f73810a;
                        return new MessageDao_Impl(chatDatabase_Impl);
                    case 8:
                        int i27 = ChatDatabase_Impl.f73810a;
                        return new ReplyMessageDao_Impl(chatDatabase_Impl);
                    case 9:
                        int i28 = ChatDatabase_Impl.f73810a;
                        return new ChannelDao_Impl(chatDatabase_Impl);
                    case 10:
                        int i29 = ChatDatabase_Impl.f73810a;
                        return new ChannelConfigDao_Impl(chatDatabase_Impl);
                    default:
                        int i34 = ChatDatabase_Impl.f73810a;
                        return new SyncStateDao_Impl(chatDatabase_Impl);
                }
            }
        });
        final int i14 = 5;
        this._userDao = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.internal.offline.repository.database.internal.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChatDatabase_Impl f73812x;

            {
                this.f73812x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i15 = i14;
                ChatDatabase_Impl chatDatabase_Impl = this.f73812x;
                switch (i15) {
                    case 0:
                        int i16 = ChatDatabase_Impl.f73810a;
                        return new QueryChannelsDao_Impl(chatDatabase_Impl);
                    case 1:
                        int i17 = ChatDatabase_Impl.f73810a;
                        return new AttachmentDao_Impl(chatDatabase_Impl);
                    case 2:
                        int i18 = ChatDatabase_Impl.f73810a;
                        return new PollDao_Impl(chatDatabase_Impl);
                    case 3:
                        int i19 = ChatDatabase_Impl.f73810a;
                        return new ThreadDao_Impl(chatDatabase_Impl);
                    case 4:
                        int i110 = ChatDatabase_Impl.f73810a;
                        return new ThreadOrderDao_Impl(chatDatabase_Impl);
                    case 5:
                        int i24 = ChatDatabase_Impl.f73810a;
                        return new UserDao_Impl(chatDatabase_Impl);
                    case 6:
                        int i25 = ChatDatabase_Impl.f73810a;
                        return new ReactionDao_Impl(chatDatabase_Impl);
                    case 7:
                        int i26 = ChatDatabase_Impl.f73810a;
                        return new MessageDao_Impl(chatDatabase_Impl);
                    case 8:
                        int i27 = ChatDatabase_Impl.f73810a;
                        return new ReplyMessageDao_Impl(chatDatabase_Impl);
                    case 9:
                        int i28 = ChatDatabase_Impl.f73810a;
                        return new ChannelDao_Impl(chatDatabase_Impl);
                    case 10:
                        int i29 = ChatDatabase_Impl.f73810a;
                        return new ChannelConfigDao_Impl(chatDatabase_Impl);
                    default:
                        int i34 = ChatDatabase_Impl.f73810a;
                        return new SyncStateDao_Impl(chatDatabase_Impl);
                }
            }
        });
        final int i15 = 6;
        this._reactionDao = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.internal.offline.repository.database.internal.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChatDatabase_Impl f73812x;

            {
                this.f73812x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i16 = i15;
                ChatDatabase_Impl chatDatabase_Impl = this.f73812x;
                switch (i16) {
                    case 0:
                        int i17 = ChatDatabase_Impl.f73810a;
                        return new QueryChannelsDao_Impl(chatDatabase_Impl);
                    case 1:
                        int i18 = ChatDatabase_Impl.f73810a;
                        return new AttachmentDao_Impl(chatDatabase_Impl);
                    case 2:
                        int i19 = ChatDatabase_Impl.f73810a;
                        return new PollDao_Impl(chatDatabase_Impl);
                    case 3:
                        int i110 = ChatDatabase_Impl.f73810a;
                        return new ThreadDao_Impl(chatDatabase_Impl);
                    case 4:
                        int i111 = ChatDatabase_Impl.f73810a;
                        return new ThreadOrderDao_Impl(chatDatabase_Impl);
                    case 5:
                        int i24 = ChatDatabase_Impl.f73810a;
                        return new UserDao_Impl(chatDatabase_Impl);
                    case 6:
                        int i25 = ChatDatabase_Impl.f73810a;
                        return new ReactionDao_Impl(chatDatabase_Impl);
                    case 7:
                        int i26 = ChatDatabase_Impl.f73810a;
                        return new MessageDao_Impl(chatDatabase_Impl);
                    case 8:
                        int i27 = ChatDatabase_Impl.f73810a;
                        return new ReplyMessageDao_Impl(chatDatabase_Impl);
                    case 9:
                        int i28 = ChatDatabase_Impl.f73810a;
                        return new ChannelDao_Impl(chatDatabase_Impl);
                    case 10:
                        int i29 = ChatDatabase_Impl.f73810a;
                        return new ChannelConfigDao_Impl(chatDatabase_Impl);
                    default:
                        int i34 = ChatDatabase_Impl.f73810a;
                        return new SyncStateDao_Impl(chatDatabase_Impl);
                }
            }
        });
        final int i16 = 7;
        this._messageDao = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.internal.offline.repository.database.internal.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChatDatabase_Impl f73812x;

            {
                this.f73812x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i17 = i16;
                ChatDatabase_Impl chatDatabase_Impl = this.f73812x;
                switch (i17) {
                    case 0:
                        int i18 = ChatDatabase_Impl.f73810a;
                        return new QueryChannelsDao_Impl(chatDatabase_Impl);
                    case 1:
                        int i19 = ChatDatabase_Impl.f73810a;
                        return new AttachmentDao_Impl(chatDatabase_Impl);
                    case 2:
                        int i110 = ChatDatabase_Impl.f73810a;
                        return new PollDao_Impl(chatDatabase_Impl);
                    case 3:
                        int i111 = ChatDatabase_Impl.f73810a;
                        return new ThreadDao_Impl(chatDatabase_Impl);
                    case 4:
                        int i112 = ChatDatabase_Impl.f73810a;
                        return new ThreadOrderDao_Impl(chatDatabase_Impl);
                    case 5:
                        int i24 = ChatDatabase_Impl.f73810a;
                        return new UserDao_Impl(chatDatabase_Impl);
                    case 6:
                        int i25 = ChatDatabase_Impl.f73810a;
                        return new ReactionDao_Impl(chatDatabase_Impl);
                    case 7:
                        int i26 = ChatDatabase_Impl.f73810a;
                        return new MessageDao_Impl(chatDatabase_Impl);
                    case 8:
                        int i27 = ChatDatabase_Impl.f73810a;
                        return new ReplyMessageDao_Impl(chatDatabase_Impl);
                    case 9:
                        int i28 = ChatDatabase_Impl.f73810a;
                        return new ChannelDao_Impl(chatDatabase_Impl);
                    case 10:
                        int i29 = ChatDatabase_Impl.f73810a;
                        return new ChannelConfigDao_Impl(chatDatabase_Impl);
                    default:
                        int i34 = ChatDatabase_Impl.f73810a;
                        return new SyncStateDao_Impl(chatDatabase_Impl);
                }
            }
        });
        final int i17 = 8;
        this._replyMessageDao = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.internal.offline.repository.database.internal.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChatDatabase_Impl f73812x;

            {
                this.f73812x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i18 = i17;
                ChatDatabase_Impl chatDatabase_Impl = this.f73812x;
                switch (i18) {
                    case 0:
                        int i19 = ChatDatabase_Impl.f73810a;
                        return new QueryChannelsDao_Impl(chatDatabase_Impl);
                    case 1:
                        int i110 = ChatDatabase_Impl.f73810a;
                        return new AttachmentDao_Impl(chatDatabase_Impl);
                    case 2:
                        int i111 = ChatDatabase_Impl.f73810a;
                        return new PollDao_Impl(chatDatabase_Impl);
                    case 3:
                        int i112 = ChatDatabase_Impl.f73810a;
                        return new ThreadDao_Impl(chatDatabase_Impl);
                    case 4:
                        int i113 = ChatDatabase_Impl.f73810a;
                        return new ThreadOrderDao_Impl(chatDatabase_Impl);
                    case 5:
                        int i24 = ChatDatabase_Impl.f73810a;
                        return new UserDao_Impl(chatDatabase_Impl);
                    case 6:
                        int i25 = ChatDatabase_Impl.f73810a;
                        return new ReactionDao_Impl(chatDatabase_Impl);
                    case 7:
                        int i26 = ChatDatabase_Impl.f73810a;
                        return new MessageDao_Impl(chatDatabase_Impl);
                    case 8:
                        int i27 = ChatDatabase_Impl.f73810a;
                        return new ReplyMessageDao_Impl(chatDatabase_Impl);
                    case 9:
                        int i28 = ChatDatabase_Impl.f73810a;
                        return new ChannelDao_Impl(chatDatabase_Impl);
                    case 10:
                        int i29 = ChatDatabase_Impl.f73810a;
                        return new ChannelConfigDao_Impl(chatDatabase_Impl);
                    default:
                        int i34 = ChatDatabase_Impl.f73810a;
                        return new SyncStateDao_Impl(chatDatabase_Impl);
                }
            }
        });
        final int i18 = 9;
        this._channelDao = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.internal.offline.repository.database.internal.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChatDatabase_Impl f73812x;

            {
                this.f73812x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i19 = i18;
                ChatDatabase_Impl chatDatabase_Impl = this.f73812x;
                switch (i19) {
                    case 0:
                        int i110 = ChatDatabase_Impl.f73810a;
                        return new QueryChannelsDao_Impl(chatDatabase_Impl);
                    case 1:
                        int i111 = ChatDatabase_Impl.f73810a;
                        return new AttachmentDao_Impl(chatDatabase_Impl);
                    case 2:
                        int i112 = ChatDatabase_Impl.f73810a;
                        return new PollDao_Impl(chatDatabase_Impl);
                    case 3:
                        int i113 = ChatDatabase_Impl.f73810a;
                        return new ThreadDao_Impl(chatDatabase_Impl);
                    case 4:
                        int i114 = ChatDatabase_Impl.f73810a;
                        return new ThreadOrderDao_Impl(chatDatabase_Impl);
                    case 5:
                        int i24 = ChatDatabase_Impl.f73810a;
                        return new UserDao_Impl(chatDatabase_Impl);
                    case 6:
                        int i25 = ChatDatabase_Impl.f73810a;
                        return new ReactionDao_Impl(chatDatabase_Impl);
                    case 7:
                        int i26 = ChatDatabase_Impl.f73810a;
                        return new MessageDao_Impl(chatDatabase_Impl);
                    case 8:
                        int i27 = ChatDatabase_Impl.f73810a;
                        return new ReplyMessageDao_Impl(chatDatabase_Impl);
                    case 9:
                        int i28 = ChatDatabase_Impl.f73810a;
                        return new ChannelDao_Impl(chatDatabase_Impl);
                    case 10:
                        int i29 = ChatDatabase_Impl.f73810a;
                        return new ChannelConfigDao_Impl(chatDatabase_Impl);
                    default:
                        int i34 = ChatDatabase_Impl.f73810a;
                        return new SyncStateDao_Impl(chatDatabase_Impl);
                }
            }
        });
        final int i19 = 10;
        this._channelConfigDao = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.internal.offline.repository.database.internal.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChatDatabase_Impl f73812x;

            {
                this.f73812x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i110 = i19;
                ChatDatabase_Impl chatDatabase_Impl = this.f73812x;
                switch (i110) {
                    case 0:
                        int i111 = ChatDatabase_Impl.f73810a;
                        return new QueryChannelsDao_Impl(chatDatabase_Impl);
                    case 1:
                        int i112 = ChatDatabase_Impl.f73810a;
                        return new AttachmentDao_Impl(chatDatabase_Impl);
                    case 2:
                        int i113 = ChatDatabase_Impl.f73810a;
                        return new PollDao_Impl(chatDatabase_Impl);
                    case 3:
                        int i114 = ChatDatabase_Impl.f73810a;
                        return new ThreadDao_Impl(chatDatabase_Impl);
                    case 4:
                        int i115 = ChatDatabase_Impl.f73810a;
                        return new ThreadOrderDao_Impl(chatDatabase_Impl);
                    case 5:
                        int i24 = ChatDatabase_Impl.f73810a;
                        return new UserDao_Impl(chatDatabase_Impl);
                    case 6:
                        int i25 = ChatDatabase_Impl.f73810a;
                        return new ReactionDao_Impl(chatDatabase_Impl);
                    case 7:
                        int i26 = ChatDatabase_Impl.f73810a;
                        return new MessageDao_Impl(chatDatabase_Impl);
                    case 8:
                        int i27 = ChatDatabase_Impl.f73810a;
                        return new ReplyMessageDao_Impl(chatDatabase_Impl);
                    case 9:
                        int i28 = ChatDatabase_Impl.f73810a;
                        return new ChannelDao_Impl(chatDatabase_Impl);
                    case 10:
                        int i29 = ChatDatabase_Impl.f73810a;
                        return new ChannelConfigDao_Impl(chatDatabase_Impl);
                    default:
                        int i34 = ChatDatabase_Impl.f73810a;
                        return new SyncStateDao_Impl(chatDatabase_Impl);
                }
            }
        });
        final int i24 = 11;
        this._syncStateDao = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.internal.offline.repository.database.internal.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChatDatabase_Impl f73812x;

            {
                this.f73812x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i110 = i24;
                ChatDatabase_Impl chatDatabase_Impl = this.f73812x;
                switch (i110) {
                    case 0:
                        int i111 = ChatDatabase_Impl.f73810a;
                        return new QueryChannelsDao_Impl(chatDatabase_Impl);
                    case 1:
                        int i112 = ChatDatabase_Impl.f73810a;
                        return new AttachmentDao_Impl(chatDatabase_Impl);
                    case 2:
                        int i113 = ChatDatabase_Impl.f73810a;
                        return new PollDao_Impl(chatDatabase_Impl);
                    case 3:
                        int i114 = ChatDatabase_Impl.f73810a;
                        return new ThreadDao_Impl(chatDatabase_Impl);
                    case 4:
                        int i115 = ChatDatabase_Impl.f73810a;
                        return new ThreadOrderDao_Impl(chatDatabase_Impl);
                    case 5:
                        int i25 = ChatDatabase_Impl.f73810a;
                        return new UserDao_Impl(chatDatabase_Impl);
                    case 6:
                        int i26 = ChatDatabase_Impl.f73810a;
                        return new ReactionDao_Impl(chatDatabase_Impl);
                    case 7:
                        int i27 = ChatDatabase_Impl.f73810a;
                        return new MessageDao_Impl(chatDatabase_Impl);
                    case 8:
                        int i28 = ChatDatabase_Impl.f73810a;
                        return new ReplyMessageDao_Impl(chatDatabase_Impl);
                    case 9:
                        int i29 = ChatDatabase_Impl.f73810a;
                        return new ChannelDao_Impl(chatDatabase_Impl);
                    case 10:
                        int i210 = ChatDatabase_Impl.f73810a;
                        return new ChannelConfigDao_Impl(chatDatabase_Impl);
                    default:
                        int i34 = ChatDatabase_Impl.f73810a;
                        return new SyncStateDao_Impl(chatDatabase_Impl);
                }
            }
        });
        final int i25 = 1;
        this._attachmentDao = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.internal.offline.repository.database.internal.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChatDatabase_Impl f73812x;

            {
                this.f73812x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i110 = i25;
                ChatDatabase_Impl chatDatabase_Impl = this.f73812x;
                switch (i110) {
                    case 0:
                        int i111 = ChatDatabase_Impl.f73810a;
                        return new QueryChannelsDao_Impl(chatDatabase_Impl);
                    case 1:
                        int i112 = ChatDatabase_Impl.f73810a;
                        return new AttachmentDao_Impl(chatDatabase_Impl);
                    case 2:
                        int i113 = ChatDatabase_Impl.f73810a;
                        return new PollDao_Impl(chatDatabase_Impl);
                    case 3:
                        int i114 = ChatDatabase_Impl.f73810a;
                        return new ThreadDao_Impl(chatDatabase_Impl);
                    case 4:
                        int i115 = ChatDatabase_Impl.f73810a;
                        return new ThreadOrderDao_Impl(chatDatabase_Impl);
                    case 5:
                        int i26 = ChatDatabase_Impl.f73810a;
                        return new UserDao_Impl(chatDatabase_Impl);
                    case 6:
                        int i27 = ChatDatabase_Impl.f73810a;
                        return new ReactionDao_Impl(chatDatabase_Impl);
                    case 7:
                        int i28 = ChatDatabase_Impl.f73810a;
                        return new MessageDao_Impl(chatDatabase_Impl);
                    case 8:
                        int i29 = ChatDatabase_Impl.f73810a;
                        return new ReplyMessageDao_Impl(chatDatabase_Impl);
                    case 9:
                        int i210 = ChatDatabase_Impl.f73810a;
                        return new ChannelDao_Impl(chatDatabase_Impl);
                    case 10:
                        int i211 = ChatDatabase_Impl.f73810a;
                        return new ChannelConfigDao_Impl(chatDatabase_Impl);
                    default:
                        int i34 = ChatDatabase_Impl.f73810a;
                        return new SyncStateDao_Impl(chatDatabase_Impl);
                }
            }
        });
        final int i26 = 2;
        this._pollDao = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.internal.offline.repository.database.internal.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChatDatabase_Impl f73812x;

            {
                this.f73812x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i110 = i26;
                ChatDatabase_Impl chatDatabase_Impl = this.f73812x;
                switch (i110) {
                    case 0:
                        int i111 = ChatDatabase_Impl.f73810a;
                        return new QueryChannelsDao_Impl(chatDatabase_Impl);
                    case 1:
                        int i112 = ChatDatabase_Impl.f73810a;
                        return new AttachmentDao_Impl(chatDatabase_Impl);
                    case 2:
                        int i113 = ChatDatabase_Impl.f73810a;
                        return new PollDao_Impl(chatDatabase_Impl);
                    case 3:
                        int i114 = ChatDatabase_Impl.f73810a;
                        return new ThreadDao_Impl(chatDatabase_Impl);
                    case 4:
                        int i115 = ChatDatabase_Impl.f73810a;
                        return new ThreadOrderDao_Impl(chatDatabase_Impl);
                    case 5:
                        int i27 = ChatDatabase_Impl.f73810a;
                        return new UserDao_Impl(chatDatabase_Impl);
                    case 6:
                        int i28 = ChatDatabase_Impl.f73810a;
                        return new ReactionDao_Impl(chatDatabase_Impl);
                    case 7:
                        int i29 = ChatDatabase_Impl.f73810a;
                        return new MessageDao_Impl(chatDatabase_Impl);
                    case 8:
                        int i210 = ChatDatabase_Impl.f73810a;
                        return new ReplyMessageDao_Impl(chatDatabase_Impl);
                    case 9:
                        int i211 = ChatDatabase_Impl.f73810a;
                        return new ChannelDao_Impl(chatDatabase_Impl);
                    case 10:
                        int i212 = ChatDatabase_Impl.f73810a;
                        return new ChannelConfigDao_Impl(chatDatabase_Impl);
                    default:
                        int i34 = ChatDatabase_Impl.f73810a;
                        return new SyncStateDao_Impl(chatDatabase_Impl);
                }
            }
        });
        final int i27 = 3;
        this._threadDao = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.internal.offline.repository.database.internal.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChatDatabase_Impl f73812x;

            {
                this.f73812x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i110 = i27;
                ChatDatabase_Impl chatDatabase_Impl = this.f73812x;
                switch (i110) {
                    case 0:
                        int i111 = ChatDatabase_Impl.f73810a;
                        return new QueryChannelsDao_Impl(chatDatabase_Impl);
                    case 1:
                        int i112 = ChatDatabase_Impl.f73810a;
                        return new AttachmentDao_Impl(chatDatabase_Impl);
                    case 2:
                        int i113 = ChatDatabase_Impl.f73810a;
                        return new PollDao_Impl(chatDatabase_Impl);
                    case 3:
                        int i114 = ChatDatabase_Impl.f73810a;
                        return new ThreadDao_Impl(chatDatabase_Impl);
                    case 4:
                        int i115 = ChatDatabase_Impl.f73810a;
                        return new ThreadOrderDao_Impl(chatDatabase_Impl);
                    case 5:
                        int i28 = ChatDatabase_Impl.f73810a;
                        return new UserDao_Impl(chatDatabase_Impl);
                    case 6:
                        int i29 = ChatDatabase_Impl.f73810a;
                        return new ReactionDao_Impl(chatDatabase_Impl);
                    case 7:
                        int i210 = ChatDatabase_Impl.f73810a;
                        return new MessageDao_Impl(chatDatabase_Impl);
                    case 8:
                        int i211 = ChatDatabase_Impl.f73810a;
                        return new ReplyMessageDao_Impl(chatDatabase_Impl);
                    case 9:
                        int i212 = ChatDatabase_Impl.f73810a;
                        return new ChannelDao_Impl(chatDatabase_Impl);
                    case 10:
                        int i213 = ChatDatabase_Impl.f73810a;
                        return new ChannelConfigDao_Impl(chatDatabase_Impl);
                    default:
                        int i34 = ChatDatabase_Impl.f73810a;
                        return new SyncStateDao_Impl(chatDatabase_Impl);
                }
            }
        });
        final int i28 = 4;
        this._threadOrderDao = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.internal.offline.repository.database.internal.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ChatDatabase_Impl f73812x;

            {
                this.f73812x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                int i110 = i28;
                ChatDatabase_Impl chatDatabase_Impl = this.f73812x;
                switch (i110) {
                    case 0:
                        int i111 = ChatDatabase_Impl.f73810a;
                        return new QueryChannelsDao_Impl(chatDatabase_Impl);
                    case 1:
                        int i112 = ChatDatabase_Impl.f73810a;
                        return new AttachmentDao_Impl(chatDatabase_Impl);
                    case 2:
                        int i113 = ChatDatabase_Impl.f73810a;
                        return new PollDao_Impl(chatDatabase_Impl);
                    case 3:
                        int i114 = ChatDatabase_Impl.f73810a;
                        return new ThreadDao_Impl(chatDatabase_Impl);
                    case 4:
                        int i115 = ChatDatabase_Impl.f73810a;
                        return new ThreadOrderDao_Impl(chatDatabase_Impl);
                    case 5:
                        int i29 = ChatDatabase_Impl.f73810a;
                        return new UserDao_Impl(chatDatabase_Impl);
                    case 6:
                        int i210 = ChatDatabase_Impl.f73810a;
                        return new ReactionDao_Impl(chatDatabase_Impl);
                    case 7:
                        int i211 = ChatDatabase_Impl.f73810a;
                        return new MessageDao_Impl(chatDatabase_Impl);
                    case 8:
                        int i212 = ChatDatabase_Impl.f73810a;
                        return new ReplyMessageDao_Impl(chatDatabase_Impl);
                    case 9:
                        int i213 = ChatDatabase_Impl.f73810a;
                        return new ChannelDao_Impl(chatDatabase_Impl);
                    case 10:
                        int i214 = ChatDatabase_Impl.f73810a;
                        return new ChannelConfigDao_Impl(chatDatabase_Impl);
                    default:
                        int i34 = ChatDatabase_Impl.f73810a;
                        return new SyncStateDao_Impl(chatDatabase_Impl);
                }
            }
        });
    }

    private static final AttachmentDao_Impl _attachmentDao$lambda$8(ChatDatabase_Impl chatDatabase_Impl) {
        return new AttachmentDao_Impl(chatDatabase_Impl);
    }

    private static final ChannelConfigDao_Impl _channelConfigDao$lambda$6(ChatDatabase_Impl chatDatabase_Impl) {
        return new ChannelConfigDao_Impl(chatDatabase_Impl);
    }

    private static final ChannelDao_Impl _channelDao$lambda$5(ChatDatabase_Impl chatDatabase_Impl) {
        return new ChannelDao_Impl(chatDatabase_Impl);
    }

    private static final MessageDao_Impl _messageDao$lambda$3(ChatDatabase_Impl chatDatabase_Impl) {
        return new MessageDao_Impl(chatDatabase_Impl);
    }

    private static final PollDao_Impl _pollDao$lambda$9(ChatDatabase_Impl chatDatabase_Impl) {
        return new PollDao_Impl(chatDatabase_Impl);
    }

    private static final QueryChannelsDao_Impl _queryChannelsDao$lambda$0(ChatDatabase_Impl chatDatabase_Impl) {
        return new QueryChannelsDao_Impl(chatDatabase_Impl);
    }

    private static final ReactionDao_Impl _reactionDao$lambda$2(ChatDatabase_Impl chatDatabase_Impl) {
        return new ReactionDao_Impl(chatDatabase_Impl);
    }

    private static final ReplyMessageDao_Impl _replyMessageDao$lambda$4(ChatDatabase_Impl chatDatabase_Impl) {
        return new ReplyMessageDao_Impl(chatDatabase_Impl);
    }

    private static final SyncStateDao_Impl _syncStateDao$lambda$7(ChatDatabase_Impl chatDatabase_Impl) {
        return new SyncStateDao_Impl(chatDatabase_Impl);
    }

    private static final ThreadDao_Impl _threadDao$lambda$10(ChatDatabase_Impl chatDatabase_Impl) {
        return new ThreadDao_Impl(chatDatabase_Impl);
    }

    private static final ThreadOrderDao_Impl _threadOrderDao$lambda$11(ChatDatabase_Impl chatDatabase_Impl) {
        return new ThreadOrderDao_Impl(chatDatabase_Impl);
    }

    private static final UserDao_Impl _userDao$lambda$1(ChatDatabase_Impl chatDatabase_Impl) {
        return new UserDao_Impl(chatDatabase_Impl);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.database.internal.ChatDatabase
    public final AttachmentDao attachmentDao() {
        return (AttachmentDao) this._attachmentDao.getValue();
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.database.internal.ChatDatabase
    public final ChannelConfigDao channelConfigDao() {
        return (ChannelConfigDao) this._channelConfigDao.getValue();
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.database.internal.ChatDatabase
    public final ChannelDao channelStateDao() {
        return (ChannelDao) this._channelDao.getValue();
    }

    @Override // androidx.room.AbstractC1848z0
    public final void clearAllTables() {
        performClear(true, QueryChannelsEntityKt.QUERY_CHANNELS_ENTITY_TABLE_NAME, MessageEntityKt.MESSAGE_ENTITY_TABLE_NAME, ReplyMessageEntityKt.REPLY_MESSAGE_ENTITY_TABLE_NAME, AttachmentEntity.ATTACHMENT_ENTITY_TABLE_NAME, ReplyAttachmentEntity.REPLY_ATTACHMENT_ENTITY_TABLE_NAME, UserEntityKt.USER_ENTITY_TABLE_NAME, ReactionEntityKt.REACTION_ENTITY_TABLE_NAME, ChannelEntityKt.CHANNEL_ENTITY_TABLE_NAME, ChannelConfigEntityKt.CHANNEL_CONFIG_INNER_ENTITY_TABLE_NAME, ChannelConfigEntityKt.COMMAND_INNER_ENTITY_TABLE_NAME, SyncStateEntityKt.SYNC_STATE_ENTITY_TABLE_NAME, PollKt.POLL_ENTITY_TABLE_NAME, ThreadEntityKt.THREAD_ENTITY_TABLE_NAME, ThreadOrderEntityKt.THREAD_ORDER_ENTITY_TABLE_NAME, DraftMessageEntityKt.DRAFT_MESSAGE_ENTITY_TABLE_NAME);
    }

    @Override // androidx.room.AbstractC1848z0
    public final List<AbstractC25380b> createAutoMigrations(Map<InterfaceC21461d, ? extends InterfaceC25379a> autoMigrationSpecs) {
        AbstractC22676k.m65750j(autoMigrationSpecs, "autoMigrationSpecs");
        return new ArrayList();
    }

    @Override // androidx.room.AbstractC1848z0
    public final C1835v createInvalidationTracker() {
        return new C1835v(this, new LinkedHashMap(), new LinkedHashMap(), QueryChannelsEntityKt.QUERY_CHANNELS_ENTITY_TABLE_NAME, MessageEntityKt.MESSAGE_ENTITY_TABLE_NAME, ReplyMessageEntityKt.REPLY_MESSAGE_ENTITY_TABLE_NAME, AttachmentEntity.ATTACHMENT_ENTITY_TABLE_NAME, ReplyAttachmentEntity.REPLY_ATTACHMENT_ENTITY_TABLE_NAME, UserEntityKt.USER_ENTITY_TABLE_NAME, ReactionEntityKt.REACTION_ENTITY_TABLE_NAME, ChannelEntityKt.CHANNEL_ENTITY_TABLE_NAME, ChannelConfigEntityKt.CHANNEL_CONFIG_INNER_ENTITY_TABLE_NAME, ChannelConfigEntityKt.COMMAND_INNER_ENTITY_TABLE_NAME, SyncStateEntityKt.SYNC_STATE_ENTITY_TABLE_NAME, PollKt.POLL_ENTITY_TABLE_NAME, ThreadEntityKt.THREAD_ENTITY_TABLE_NAME, ThreadOrderEntityKt.THREAD_ORDER_ENTITY_TABLE_NAME, DraftMessageEntityKt.DRAFT_MESSAGE_ENTITY_TABLE_NAME);
    }

    @Override // androidx.room.AbstractC1848z0
    public final AbstractC1788g1 createOpenDelegate() {
        return new ChatDatabase_Impl$createOpenDelegate$_openDelegate$1(this);
    }

    @Override // androidx.room.AbstractC1848z0
    public final Set<InterfaceC21461d> getRequiredAutoMigrationSpecClasses() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.AbstractC1848z0
    public final Map<InterfaceC21461d, List<InterfaceC21461d>> getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(QueryChannelsDao.class);
        QueryChannelsDao_Impl.INSTANCE.getClass();
        C25271y c25271y = C25271y.f99162w;
        linkedHashMap.put(orCreateKotlinClass, c25271y);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(UserDao.class);
        UserDao_Impl.INSTANCE.getClass();
        linkedHashMap.put(orCreateKotlinClass2, c25271y);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(ReactionDao.class);
        ReactionDao_Impl.INSTANCE.getClass();
        linkedHashMap.put(orCreateKotlinClass3, c25271y);
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(MessageDao.class);
        MessageDao_Impl.INSTANCE.getClass();
        linkedHashMap.put(orCreateKotlinClass4, c25271y);
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(ReplyMessageDao.class);
        ReplyMessageDao_Impl.INSTANCE.getClass();
        linkedHashMap.put(orCreateKotlinClass5, c25271y);
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(ChannelDao.class);
        ChannelDao_Impl.INSTANCE.getClass();
        linkedHashMap.put(orCreateKotlinClass6, c25271y);
        InterfaceC21461d orCreateKotlinClass7 = c22673i0.getOrCreateKotlinClass(ChannelConfigDao.class);
        ChannelConfigDao_Impl.INSTANCE.getClass();
        linkedHashMap.put(orCreateKotlinClass7, c25271y);
        InterfaceC21461d orCreateKotlinClass8 = c22673i0.getOrCreateKotlinClass(SyncStateDao.class);
        SyncStateDao_Impl.INSTANCE.getClass();
        linkedHashMap.put(orCreateKotlinClass8, c25271y);
        InterfaceC21461d orCreateKotlinClass9 = c22673i0.getOrCreateKotlinClass(AttachmentDao.class);
        AttachmentDao_Impl.INSTANCE.getClass();
        linkedHashMap.put(orCreateKotlinClass9, c25271y);
        InterfaceC21461d orCreateKotlinClass10 = c22673i0.getOrCreateKotlinClass(PollDao.class);
        PollDao_Impl.INSTANCE.getClass();
        linkedHashMap.put(orCreateKotlinClass10, c25271y);
        InterfaceC21461d orCreateKotlinClass11 = c22673i0.getOrCreateKotlinClass(ThreadDao.class);
        ThreadDao_Impl.INSTANCE.getClass();
        linkedHashMap.put(orCreateKotlinClass11, c25271y);
        InterfaceC21461d orCreateKotlinClass12 = c22673i0.getOrCreateKotlinClass(ThreadOrderDao.class);
        ThreadOrderDao_Impl.INSTANCE.getClass();
        linkedHashMap.put(orCreateKotlinClass12, c25271y);
        return linkedHashMap;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.database.internal.ChatDatabase
    public final MessageDao messageDao() {
        return (MessageDao) this._messageDao.getValue();
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.database.internal.ChatDatabase
    public final PollDao pollDao() {
        return (PollDao) this._pollDao.getValue();
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.database.internal.ChatDatabase
    public final QueryChannelsDao queryChannelsDao() {
        return (QueryChannelsDao) this._queryChannelsDao.getValue();
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.database.internal.ChatDatabase
    public final ReactionDao reactionDao() {
        return (ReactionDao) this._reactionDao.getValue();
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.database.internal.ChatDatabase
    public final ReplyMessageDao replyMessageDao() {
        return (ReplyMessageDao) this._replyMessageDao.getValue();
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.database.internal.ChatDatabase
    public final SyncStateDao syncStateDao() {
        return (SyncStateDao) this._syncStateDao.getValue();
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.database.internal.ChatDatabase
    public final ThreadDao threadDao() {
        return (ThreadDao) this._threadDao.getValue();
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.database.internal.ChatDatabase
    public final ThreadOrderDao threadOrderDao() {
        return (ThreadOrderDao) this._threadOrderDao.getValue();
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.database.internal.ChatDatabase
    public final UserDao userDao() {
        return (UserDao) this._userDao.getValue();
    }

    @Override // androidx.room.AbstractC1848z0
    public final InterfaceC1792h1 createOpenDelegate() {
        return new ChatDatabase_Impl$createOpenDelegate$_openDelegate$1(this);
    }
}
