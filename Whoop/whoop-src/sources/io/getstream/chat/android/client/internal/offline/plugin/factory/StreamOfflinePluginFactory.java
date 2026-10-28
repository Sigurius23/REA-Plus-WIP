package io.getstream.chat.android.client.internal.offline.plugin.factory;

import android.content.Context;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.C3004e2;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4339a;
import com.whoop.service.network.model.UserState;
import ga1.C15621b;
import h00.C16513l0;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.internal.offline.plugin.OfflinePlugin;
import io.getstream.chat.android.client.internal.offline.plugin.listener.internal.CreateChannelListenerDatabase;
import io.getstream.chat.android.client.internal.offline.plugin.listener.internal.DeleteChannelListenerDatabase;
import io.getstream.chat.android.client.internal.offline.plugin.listener.internal.DeleteMessageForMeListenerDatabase;
import io.getstream.chat.android.client.internal.offline.plugin.listener.internal.DeleteMessageListenerDatabase;
import io.getstream.chat.android.client.internal.offline.plugin.listener.internal.DeleteReactionListenerDatabase;
import io.getstream.chat.android.client.internal.offline.plugin.listener.internal.DraftMessageListenerDatabase;
import io.getstream.chat.android.client.internal.offline.plugin.listener.internal.EditMessageListenerDatabase;
import io.getstream.chat.android.client.internal.offline.plugin.listener.internal.FetchCurrentUserListenerDatabase;
import io.getstream.chat.android.client.internal.offline.plugin.listener.internal.GetMessageListenerDatabase;
import io.getstream.chat.android.client.internal.offline.plugin.listener.internal.HideChannelListenerDatabase;
import io.getstream.chat.android.client.internal.offline.plugin.listener.internal.QueryChannelListenerDatabase;
import io.getstream.chat.android.client.internal.offline.plugin.listener.internal.QueryMembersListenerDatabase;
import io.getstream.chat.android.client.internal.offline.plugin.listener.internal.QueryThreadsListenerDatabase;
import io.getstream.chat.android.client.internal.offline.plugin.listener.internal.SendAttachmentsListenerDatabase;
import io.getstream.chat.android.client.internal.offline.plugin.listener.internal.SendMessageListenerDatabase;
import io.getstream.chat.android.client.internal.offline.plugin.listener.internal.SendReactionListenerDatabase;
import io.getstream.chat.android.client.internal.offline.plugin.listener.internal.ShuffleGiphyListenerDatabase;
import io.getstream.chat.android.client.internal.offline.plugin.listener.internal.ThreadQueryListenerDatabase;
import io.getstream.chat.android.client.internal.offline.repository.database.internal.ChatDatabase;
import io.getstream.chat.android.client.internal.offline.repository.factory.internal.DatabaseRepositoryFactory;
import io.getstream.chat.android.client.persistance.repository.RepositoryFacade;
import io.getstream.chat.android.client.persistance.repository.factory.RepositoryFactory;
import io.getstream.chat.android.client.plugin.Plugin;
import io.getstream.chat.android.client.plugin.factory.PluginFactory;
import io.getstream.chat.android.client.setup.state.ClientState;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.User;
import j93.InterfaceC21461d;
import java.util.Set;
import l83.InterfaceC23462h;
import m83.C25235a0;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30063j;

/* JADX INFO: loaded from: classes5.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0017*\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010$R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/plugin/factory/StreamOfflinePluginFactory;", "Lio/getstream/chat/android/client/plugin/factory/PluginFactory;", "Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory$Provider;", "Landroid/content/Context;", "appContext", "", "", "ignoredChannelTypes", "Lkotlin/Function0;", "", "now", "<init>", "(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;", "createOfflinePlugin", "(Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;", "context", "Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;", "createDatabase", "(Landroid/content/Context;Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;", "", "T", "Lj93/d;", "klass", "resolveDependency", "(Lj93/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;", "createRepositoryFactory", "(Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;", "Lio/getstream/chat/android/client/plugin/Plugin;", "get", "(Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/client/plugin/Plugin;", "Landroid/content/Context;", "Ljava/util/Set;", "Lc93/a;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StreamOfflinePluginFactory implements PluginFactory, RepositoryFactory.Provider {
    private final Context appContext;
    private final Set<String> ignoredChannelTypes;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final InterfaceC4339a now;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamOfflinePluginFactory(Context appContext) {
        this(appContext, null, null, 6, null);
        AbstractC22676k.m65750j(appContext, "appContext");
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C3004e2 m54674a(InterfaceC3027k1 interfaceC3027k1) {
        return (C3004e2) createRepositoryFactory$lambda$2(interfaceC3027k1);
    }

    private final ChatDatabase createDatabase(Context context, User user) {
        return ChatDatabase.INSTANCE.getDatabase(context, user.getId());
    }

    private final OfflinePlugin createOfflinePlugin(User user) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[createOfflinePlugin] user.id: " + user.getId(), null);
        }
        ChatClient.Companion companion = ChatClient.INSTANCE;
        companion.getClass();
        ChatClient.OFFLINE_SUPPORT_ENABLED = true;
        ChatClient chatClientInstance = companion.instance();
        ClientState clientState = chatClientInstance.getClientState();
        RepositoryFacade repositoryFacade = chatClientInstance.getRepositoryFacade();
        return new OfflinePlugin(user, new QueryChannelListenerDatabase(repositoryFacade), new ThreadQueryListenerDatabase(repositoryFacade, repositoryFacade), new EditMessageListenerDatabase(repositoryFacade, repositoryFacade, clientState), new HideChannelListenerDatabase(repositoryFacade, repositoryFacade), new DeleteReactionListenerDatabase(clientState, repositoryFacade, repositoryFacade), new SendReactionListenerDatabase(clientState, repositoryFacade, repositoryFacade, repositoryFacade, this.ignoredChannelTypes), new DeleteMessageListenerDatabase(clientState, repositoryFacade, repositoryFacade), new DeleteMessageForMeListenerDatabase(clientState, repositoryFacade), new ShuffleGiphyListenerDatabase(repositoryFacade, repositoryFacade), new SendMessageListenerDatabase(repositoryFacade, repositoryFacade), new SendAttachmentsListenerDatabase(repositoryFacade, repositoryFacade), new QueryMembersListenerDatabase(repositoryFacade, repositoryFacade), new CreateChannelListenerDatabase(clientState, repositoryFacade, repositoryFacade), new DeleteChannelListenerDatabase(clientState, repositoryFacade, repositoryFacade), new GetMessageListenerDatabase(repositoryFacade), new FetchCurrentUserListenerDatabase(repositoryFacade), new QueryThreadsListenerDatabase(repositoryFacade), new DraftMessageListenerDatabase(repositoryFacade), null, 524288, null);
    }

    private static final InterfaceC30063j createRepositoryFactory$lambda$2(InterfaceC3027k1 it) {
        AbstractC22676k.m65750j(it, "it");
        return new C3004e2(it);
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    @Override // io.getstream.chat.android.client.persistance.repository.factory.RepositoryFactory.Provider
    public final RepositoryFactory createRepositoryFactory(User user) {
        AbstractC22676k.m65750j(user, "user");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC11895b.m31996o("[createRepositoryFactory] user.id: '", user.getId(), "'"), null);
        }
        return new DatabaseRepositoryFactory(createDatabase(this.appContext, user), user, ChatClient.INSTANCE.instance().inheritScope(new C16513l0(2)), this.ignoredChannelTypes, this.now);
    }

    @Override // io.getstream.chat.android.client.plugin.factory.PluginFactory
    public final Plugin get(User user) {
        AbstractC22676k.m65750j(user, "user");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[get] user.id: " + user.getId(), null);
        }
        return createOfflinePlugin(user);
    }

    @Override // io.getstream.chat.android.client.plugin.DependencyResolver
    @InternalStreamChatApi
    public final <T> T resolveDependency(InterfaceC21461d klass) {
        AbstractC22676k.m65750j(klass, "klass");
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamOfflinePluginFactory(Context appContext, Set<String> ignoredChannelTypes) {
        this(appContext, ignoredChannelTypes, null, 4, null);
        AbstractC22676k.m65750j(appContext, "appContext");
        AbstractC22676k.m65750j(ignoredChannelTypes, "ignoredChannelTypes");
    }

    public StreamOfflinePluginFactory(Context appContext, Set<String> ignoredChannelTypes, InterfaceC4339a now) {
        AbstractC22676k.m65750j(appContext, "appContext");
        AbstractC22676k.m65750j(ignoredChannelTypes, "ignoredChannelTypes");
        AbstractC22676k.m65750j(now, "now");
        this.appContext = appContext;
        this.ignoredChannelTypes = ignoredChannelTypes;
        this.now = now;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:OfflinePluginFactory");
    }

    public /* synthetic */ StreamOfflinePluginFactory(Context context, Set set, InterfaceC4339a interfaceC4339a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? C25235a0.f99113w : set, (i13 & 4) != 0 ? new C15621b(8) : interfaceC4339a);
    }
}
