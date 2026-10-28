package io.getstream.chat.android.client.persistance.repository.noop;

import c93.InterfaceC4351m;
import com.whoop.service.network.model.UserState;
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
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001&B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u007f\u0010\u0018\u001a\u00020\u00172\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\r2$\u0010\u0014\u001a \b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\r2$\u0010\u0016\u001a \b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010\u001e\u001a\u00020\u001d2\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ3\u0010!\u001a\u00020 2\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\rH\u0016¢\u0006\u0004\b!\u0010\"JY\u0010$\u001a\u00020#2\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\r2$\u0010\u0014\u001a \b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\rH\u0016¢\u0006\u0004\b$\u0010%¨\u0006'"}, m65681d2 = {"Lio/getstream/chat/android/client/persistance/repository/noop/NoOpRepositoryFactory;", "Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;", "<init>", "()V", "Lio/getstream/chat/android/client/persistance/repository/UserRepository;", "createUserRepository", "()Lio/getstream/chat/android/client/persistance/repository/UserRepository;", "Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;", "createChannelConfigRepository", "()Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;", "Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;", "createQueryChannelsRepository", "()Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;", "Lkotlin/Function2;", "", "Lq83/d;", "Lio/getstream/chat/android/models/User;", "", "getUser", "Lio/getstream/chat/android/models/Message;", "getMessage", "Lio/getstream/chat/android/models/Channel;", "getChannel", "Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;", "createThreadsRepository", "(Lc93/m;Lc93/m;Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;", "Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;", "createSyncStateRepository", "()Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;", "Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;", "createReactionRepository", "(Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;", "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;", "createMessageRepository", "(Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/MessageRepository;", "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;", "createChannelRepository", "(Lc93/m;Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;", "Provider", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class NoOpRepositoryFactory implements RepositoryFactory {
    public static final NoOpRepositoryFactory INSTANCE = new NoOpRepositoryFactory();

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/client/persistance/repository/noop/NoOpRepositoryFactory$Provider;", "Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory$Provider;", "<init>", "()V", "createRepositoryFactory", "Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Provider implements RepositoryFactory.Provider {
        public static final Provider INSTANCE = new Provider();

        private Provider() {
        }

        @Override // io.getstream.chat.android.client.persistance.repository.factory.RepositoryFactory.Provider
        public final RepositoryFactory createRepositoryFactory(User user) {
            AbstractC22676k.m65750j(user, "user");
            return NoOpRepositoryFactory.INSTANCE;
        }
    }

    private NoOpRepositoryFactory() {
    }

    @Override // io.getstream.chat.android.client.persistance.repository.factory.RepositoryFactory
    public final ChannelConfigRepository createChannelConfigRepository() {
        return NoOpChannelConfigRepository.INSTANCE;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.factory.RepositoryFactory
    public final ChannelRepository createChannelRepository(InterfaceC4351m getUser, InterfaceC4351m getMessage) {
        AbstractC22676k.m65750j(getUser, "getUser");
        AbstractC22676k.m65750j(getMessage, "getMessage");
        return NoOpChannelRepository.INSTANCE;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.factory.RepositoryFactory
    public final MessageRepository createMessageRepository(InterfaceC4351m getUser) {
        AbstractC22676k.m65750j(getUser, "getUser");
        return NoOpMessageRepository.INSTANCE;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.factory.RepositoryFactory
    public final QueryChannelsRepository createQueryChannelsRepository() {
        return NoOpQueryChannelsRepository.INSTANCE;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.factory.RepositoryFactory
    public final ReactionRepository createReactionRepository(InterfaceC4351m getUser) {
        AbstractC22676k.m65750j(getUser, "getUser");
        return NoOpReactionRepository.INSTANCE;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.factory.RepositoryFactory
    public final SyncStateRepository createSyncStateRepository() {
        return NoOpSyncStateRepository.INSTANCE;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.factory.RepositoryFactory
    public final ThreadsRepository createThreadsRepository(InterfaceC4351m getUser, InterfaceC4351m getMessage, InterfaceC4351m getChannel) {
        AbstractC22676k.m65750j(getUser, "getUser");
        AbstractC22676k.m65750j(getMessage, "getMessage");
        AbstractC22676k.m65750j(getChannel, "getChannel");
        return NoOpThreadsRepository.INSTANCE;
    }

    @Override // io.getstream.chat.android.client.persistance.repository.factory.RepositoryFactory
    public final UserRepository createUserRepository() {
        return NoOpUserRepository.INSTANCE;
    }
}
