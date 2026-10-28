package io.getstream.chat.android.client.persistance.repository.factory;

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
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.User;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0001#J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007JY\u0010\u0010\u001a\u00020\u000f2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b2$\u0010\u000e\u001a \b\u0001\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u007f\u0010\u0018\u001a\u00020\u00172\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b2$\u0010\u000e\u001a \b\u0001\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b2$\u0010\u0016\u001a \b\u0001\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bH&¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010\u001b\u001a\u00020\u001a2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bH&¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010\u001e\u001a\u00020\u001d2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H&¢\u0006\u0004\b!\u0010\"ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006$À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;", "", "Lio/getstream/chat/android/client/persistance/repository/UserRepository;", "createUserRepository", "()Lio/getstream/chat/android/client/persistance/repository/UserRepository;", "Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;", "createChannelConfigRepository", "()Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;", "Lkotlin/Function2;", "", "Lq83/d;", "Lio/getstream/chat/android/models/User;", "getUser", "Lio/getstream/chat/android/models/Message;", "getMessage", "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;", "createChannelRepository", "(Lc93/m;Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;", "Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;", "createQueryChannelsRepository", "()Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;", "Lio/getstream/chat/android/models/Channel;", "getChannel", "Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;", "createThreadsRepository", "(Lc93/m;Lc93/m;Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;", "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;", "createMessageRepository", "(Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/MessageRepository;", "Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;", "createReactionRepository", "(Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;", "Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;", "createSyncStateRepository", "()Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;", "Provider", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface RepositoryFactory {

    /* JADX INFO: loaded from: classes5.dex */
    @InternalStreamChatApi
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory$Provider;", "", "createRepositoryFactory", "Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface Provider {
        RepositoryFactory createRepositoryFactory(User user);
    }

    ChannelConfigRepository createChannelConfigRepository();

    ChannelRepository createChannelRepository(InterfaceC4351m getUser, InterfaceC4351m getMessage);

    MessageRepository createMessageRepository(InterfaceC4351m getUser);

    QueryChannelsRepository createQueryChannelsRepository();

    ReactionRepository createReactionRepository(InterfaceC4351m getUser);

    SyncStateRepository createSyncStateRepository();

    ThreadsRepository createThreadsRepository(InterfaceC4351m getUser, InterfaceC4351m getMessage, InterfaceC4351m getChannel);

    UserRepository createUserRepository();
}
