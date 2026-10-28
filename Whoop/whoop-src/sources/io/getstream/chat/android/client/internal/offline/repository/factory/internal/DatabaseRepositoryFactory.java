package io.getstream.chat.android.client.internal.offline.repository.factory.internal;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.C19383k;
import io.getstream.chat.android.client.internal.offline.repository.database.internal.ChatDatabase;
import io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.DatabaseChannelRepository;
import io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.DatabaseChannelConfigRepository;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.DatabaseMessageRepository;
import io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.DatabaseQueryChannelsRepository;
import io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.DatabaseReactionRepository;
import io.getstream.chat.android.client.internal.offline.repository.domain.syncState.internal.DatabaseSyncStateRepository;
import io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.DatabaseThreadsRepository;
import io.getstream.chat.android.client.internal.offline.repository.domain.user.internal.DatabaseUserRepository;
import io.getstream.chat.android.client.persistance.repository.ChannelConfigRepository;
import io.getstream.chat.android.client.persistance.repository.ChannelRepository;
import io.getstream.chat.android.client.persistance.repository.MessageRepository;
import io.getstream.chat.android.client.persistance.repository.QueryChannelsRepository;
import io.getstream.chat.android.client.persistance.repository.ReactionRepository;
import io.getstream.chat.android.client.persistance.repository.SyncStateRepository;
import io.getstream.chat.android.client.persistance.repository.ThreadsRepository;
import io.getstream.chat.android.client.persistance.repository.UserRepository;
import io.getstream.chat.android.client.persistance.repository.factory.RepositoryFactory;
import io.getstream.chat.android.models.User;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015JY\u0010\u001d\u001a\u00020\u001c2\"\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00162$\u0010\u001b\u001a \b\u0001\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u007f\u0010%\u001a\u00020$2\"\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00162$\u0010\u001b\u001a \b\u0001\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00162$\u0010#\u001a \b\u0001\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0016H\u0016¢\u0006\u0004\b%\u0010&J3\u0010(\u001a\u00020'2\"\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0016H\u0016¢\u0006\u0004\b(\u0010)J3\u0010+\u001a\u00020*2\"\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0016H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00102R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00103R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00104R*\u00107\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001806\u0012\u0004\u0012\u00020\u0018058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u00069"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;", "Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;", "Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;", "database", "Lio/getstream/chat/android/models/User;", "currentUser", "Lbc3/c0;", "scope", "", "", "ignoredChannelTypes", "Lkotlin/Function0;", "", "now", "<init>", "(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;Lio/getstream/chat/android/models/User;Lbc3/c0;Ljava/util/Set;Lc93/a;)V", "Lio/getstream/chat/android/client/persistance/repository/UserRepository;", "createUserRepository", "()Lio/getstream/chat/android/client/persistance/repository/UserRepository;", "Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;", "createChannelConfigRepository", "()Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;", "Lkotlin/Function2;", "Lq83/d;", "", "getUser", "Lio/getstream/chat/android/models/Message;", "getMessage", "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;", "createChannelRepository", "(Lc93/m;Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;", "Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;", "createQueryChannelsRepository", "()Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;", "Lio/getstream/chat/android/models/Channel;", "getChannel", "Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;", "createThreadsRepository", "(Lc93/m;Lc93/m;Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;", "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;", "createMessageRepository", "(Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/MessageRepository;", "Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;", "createReactionRepository", "(Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;", "Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;", "createSyncStateRepository", "()Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;", "Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;", "Lio/getstream/chat/android/models/User;", "Lbc3/c0;", "Ljava/util/Set;", "Lc93/a;", "", "Ljava/lang/Class;", "repositoriesCache", "Ljava/util/Map;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DatabaseRepositoryFactory implements RepositoryFactory {
    private final User currentUser;
    private final ChatDatabase database;
    private final Set<String> ignoredChannelTypes;
    private final InterfaceC4339a now;
    private Map<Class<? extends Object>, Object> repositoriesCache;
    private final InterfaceC2994c0 scope;

    public DatabaseRepositoryFactory(ChatDatabase database, User currentUser, InterfaceC2994c0 scope, Set<String> ignoredChannelTypes, InterfaceC4339a now) {
        AbstractC22676k.m65750j(database, "database");
        AbstractC22676k.m65750j(currentUser, "currentUser");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(ignoredChannelTypes, "ignoredChannelTypes");
        AbstractC22676k.m65750j(now, "now");
        this.database = database;
        this.currentUser = currentUser;
        this.scope = scope;
        this.ignoredChannelTypes = ignoredChannelTypes;
        this.now = now;
        this.repositoriesCache = new LinkedHashMap();
    }

    @Override // io.getstream.chat.android.client.persistance.repository.factory.RepositoryFactory
    public final ChannelConfigRepository createChannelConfigRepository() {
        Object obj = this.repositoriesCache.get(ChannelConfigRepository.class);
        DatabaseChannelConfigRepository databaseChannelConfigRepository = obj instanceof DatabaseChannelConfigRepository ? (DatabaseChannelConfigRepository) obj : null;
        if (databaseChannelConfigRepository != null) {
            return databaseChannelConfigRepository;
        }
        DatabaseChannelConfigRepository databaseChannelConfigRepository2 = new DatabaseChannelConfigRepository(this.database.channelConfigDao());
        this.repositoriesCache.put(ChannelConfigRepository.class, databaseChannelConfigRepository2);
        return databaseChannelConfigRepository2;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.factory.RepositoryFactory
    public final ChannelRepository createChannelRepository(InterfaceC4351m getUser, InterfaceC4351m getMessage) {
        AbstractC22676k.m65750j(getUser, "getUser");
        AbstractC22676k.m65750j(getMessage, "getMessage");
        Object obj = this.repositoriesCache.get(ChannelRepository.class);
        DatabaseChannelRepository databaseChannelRepository = obj instanceof DatabaseChannelRepository ? (DatabaseChannelRepository) obj : null;
        MessageRepository messageRepositoryCreateMessageRepository = createMessageRepository(getUser);
        if (databaseChannelRepository != null) {
            return databaseChannelRepository;
        }
        DatabaseChannelRepository databaseChannelRepository2 = new DatabaseChannelRepository(this.scope, this.database.channelStateDao(), getUser, getMessage, new DatabaseRepositoryFactory$createChannelRepository$1$1(messageRepositoryCreateMessageRepository), this.now, 0, 64, null);
        this.repositoriesCache.put(ChannelRepository.class, databaseChannelRepository2);
        return databaseChannelRepository2;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.factory.RepositoryFactory
    public final MessageRepository createMessageRepository(InterfaceC4351m getUser) {
        AbstractC22676k.m65750j(getUser, "getUser");
        Object obj = this.repositoriesCache.get(MessageRepository.class);
        DatabaseMessageRepository databaseMessageRepository = obj instanceof DatabaseMessageRepository ? (DatabaseMessageRepository) obj : null;
        if (databaseMessageRepository != null) {
            return databaseMessageRepository;
        }
        DatabaseMessageRepository databaseMessageRepository2 = new DatabaseMessageRepository(this.scope, this.database.messageDao(), this.database.replyMessageDao(), this.database.pollDao(), getUser, this.currentUser, this.ignoredChannelTypes, 1000);
        this.repositoriesCache.put(MessageRepository.class, databaseMessageRepository2);
        return databaseMessageRepository2;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.factory.RepositoryFactory
    public final QueryChannelsRepository createQueryChannelsRepository() {
        Object obj = this.repositoriesCache.get(QueryChannelsRepository.class);
        QueryChannelsRepository queryChannelsRepository = obj instanceof QueryChannelsRepository ? (QueryChannelsRepository) obj : null;
        if (queryChannelsRepository != null) {
            return queryChannelsRepository;
        }
        DatabaseQueryChannelsRepository databaseQueryChannelsRepository = new DatabaseQueryChannelsRepository(this.database.queryChannelsDao());
        this.repositoriesCache.put(QueryChannelsRepository.class, databaseQueryChannelsRepository);
        return databaseQueryChannelsRepository;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.factory.RepositoryFactory
    public final ReactionRepository createReactionRepository(InterfaceC4351m getUser) {
        AbstractC22676k.m65750j(getUser, "getUser");
        Object obj = this.repositoriesCache.get(ReactionRepository.class);
        DatabaseReactionRepository databaseReactionRepository = obj instanceof DatabaseReactionRepository ? (DatabaseReactionRepository) obj : null;
        if (databaseReactionRepository != null) {
            return databaseReactionRepository;
        }
        DatabaseReactionRepository databaseReactionRepository2 = new DatabaseReactionRepository(this.database.reactionDao(), getUser);
        this.repositoriesCache.put(ReactionRepository.class, databaseReactionRepository2);
        return databaseReactionRepository2;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.factory.RepositoryFactory
    public final SyncStateRepository createSyncStateRepository() {
        Object obj = this.repositoriesCache.get(SyncStateRepository.class);
        DatabaseSyncStateRepository databaseSyncStateRepository = obj instanceof DatabaseSyncStateRepository ? (DatabaseSyncStateRepository) obj : null;
        if (databaseSyncStateRepository != null) {
            return databaseSyncStateRepository;
        }
        DatabaseSyncStateRepository databaseSyncStateRepository2 = new DatabaseSyncStateRepository(this.database.syncStateDao());
        this.repositoriesCache.put(SyncStateRepository.class, databaseSyncStateRepository2);
        return databaseSyncStateRepository2;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.factory.RepositoryFactory
    public final ThreadsRepository createThreadsRepository(InterfaceC4351m getUser, InterfaceC4351m getMessage, InterfaceC4351m getChannel) {
        AbstractC22676k.m65750j(getUser, "getUser");
        AbstractC22676k.m65750j(getMessage, "getMessage");
        AbstractC22676k.m65750j(getChannel, "getChannel");
        Object obj = this.repositoriesCache.get(ThreadsRepository.class);
        ThreadsRepository threadsRepository = obj instanceof ThreadsRepository ? (ThreadsRepository) obj : null;
        MessageRepository messageRepositoryCreateMessageRepository = createMessageRepository(getUser);
        if (threadsRepository != null) {
            return threadsRepository;
        }
        DatabaseThreadsRepository databaseThreadsRepository = new DatabaseThreadsRepository(this.database.threadDao(), this.database.threadOrderDao(), getUser, getMessage, getChannel, new DatabaseRepositoryFactory$createThreadsRepository$1$1(messageRepositoryCreateMessageRepository), 0, 64, null);
        this.repositoriesCache.put(ThreadsRepository.class, databaseThreadsRepository);
        return databaseThreadsRepository;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.factory.RepositoryFactory
    public final UserRepository createUserRepository() {
        Object obj = this.repositoriesCache.get(UserRepository.class);
        DatabaseUserRepository databaseUserRepository = obj instanceof DatabaseUserRepository ? (DatabaseUserRepository) obj : null;
        if (databaseUserRepository != null) {
            return databaseUserRepository;
        }
        DatabaseUserRepository databaseUserRepository2 = new DatabaseUserRepository(this.scope, this.database.userDao(), 1000);
        this.repositoriesCache.put(UserRepository.class, databaseUserRepository2);
        return databaseUserRepository2;
    }

    public /* synthetic */ DatabaseRepositoryFactory(ChatDatabase chatDatabase, User user, InterfaceC2994c0 interfaceC2994c0, Set set, InterfaceC4339a interfaceC4339a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(chatDatabase, user, interfaceC2994c0, set, (i13 & 16) != 0 ? new C19383k(2) : interfaceC4339a);
    }
}
