package io.getstream.chat.android.client.internal.state.plugin.factory;

import android.content.Context;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.C2986a0;
import bc3.C3004e2;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import com.whoop.service.network.model.UserState;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13058l;
import io.getstream.chat.android.client.C19085d;
import io.getstream.chat.android.client.C19383k;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.ChatEventListener;
import io.getstream.chat.android.client.api.ChatClientConfig;
import io.getstream.chat.android.client.api.MessageBufferConfig;
import io.getstream.chat.android.client.api.state.StateRegistry;
import io.getstream.chat.android.client.internal.state.errorhandler.StateErrorHandlerFactory;
import io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandler;
import io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential;
import io.getstream.chat.android.client.internal.state.plugin.internal.StatePlugin;
import io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry;
import io.getstream.chat.android.client.internal.state.plugin.state.global.internal.MutableGlobalState;
import io.getstream.chat.android.client.internal.state.sync.internal.SyncManager;
import io.getstream.chat.android.client.persistance.repository.RepositoryFacade;
import io.getstream.chat.android.client.plugin.Plugin;
import io.getstream.chat.android.client.plugin.factory.PluginFactory;
import io.getstream.chat.android.client.setup.state.ClientState;
import io.getstream.chat.android.client.utils.observable.Disposable;
import io.getstream.chat.android.client.utils.observable.SubscriptionImpl;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.core.internal.coroutines.DispatcherProvider;
import io.getstream.chat.android.models.User;
import j93.InterfaceC21461d;
import kotlinx.coroutines.CoroutineExceptionHandler;
import l83.InterfaceC23462h;
import p708hb2.C17095c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;

/* JADX INFO: loaded from: classes5.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u000b\u0010\u0011J\u0089\u0001\u0010(\u001a\u00020'2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u001c\u0010 \u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001c2\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0!2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)J)\u0010-\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010**\u00020\u001f2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+H\u0017¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020/2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006:"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;", "Lio/getstream/chat/android/client/plugin/factory/PluginFactory;", "Lio/getstream/chat/android/client/api/ChatClientConfig;", "config", "Landroid/content/Context;", "appContext", "<init>", "(Lio/getstream/chat/android/client/api/ChatClientConfig;Landroid/content/Context;)V", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;", "createStatePlugin", "(Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;", "Lbc3/c0;", "scope", "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;", "mutableGlobalState", "(Lio/getstream/chat/android/models/User;Lbc3/c0;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;)Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;", "Lio/getstream/chat/android/client/ChatClient;", "client", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "logicRegistry", "Lio/getstream/chat/android/client/api/state/StateRegistry;", "stateRegistry", "Lio/getstream/chat/android/client/setup/state/ClientState;", "clientState", "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;", "repos", "Lkotlin/Function1;", "Lq83/d;", "Ll83/a0;", "", "sideEffect", "Lec3/l;", "", "Lio/getstream/chat/android/client/events/ChatEvent;", "syncedEvents", "Lio/getstream/chat/android/client/api/MessageBufferConfig;", "bufferConfig", "Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandler;", "createEventHandler", "(Lio/getstream/chat/android/models/User;Lbc3/c0;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/api/state/StateRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lkotlin/jvm/functions/Function1;Lec3/l;Lio/getstream/chat/android/client/api/MessageBufferConfig;)Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandler;", "T", "Lj93/d;", "klass", "resolveDependency", "(Lj93/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/plugin/Plugin;", "get", "(Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/client/plugin/Plugin;", "Lio/getstream/chat/android/client/api/ChatClientConfig;", "Landroid/content/Context;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StreamStatePluginFactory implements PluginFactory {
    private final Context appContext;
    private final ChatClientConfig config;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;

    public StreamStatePluginFactory(ChatClientConfig config, Context appContext) {
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(appContext, "appContext");
        this.config = config;
        this.appContext = appContext;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:StatePluginFactory");
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ SubscriptionImpl m54787b(ChatClient chatClient, ChatEventListener chatEventListener) {
        return (SubscriptionImpl) createEventHandler$lambda$6(chatClient, chatEventListener);
    }

    private final EventHandler createEventHandler(User user, InterfaceC2994c0 scope, ChatClient client, LogicRegistry logicRegistry, StateRegistry stateRegistry, ClientState clientState, MutableGlobalState mutableGlobalState, RepositoryFacade repos, Function1 sideEffect, InterfaceC13058l syncedEvents, MessageBufferConfig bufferConfig) {
        return new EventHandlerSequential(user.getId(), new C19085d(client, 1), logicRegistry, stateRegistry, clientState, mutableGlobalState, repos, sideEffect, syncedEvents, bufferConfig, scope);
    }

    private static final Disposable createEventHandler$lambda$6(ChatClient chatClient, ChatEventListener listener) {
        AbstractC22676k.m65750j(listener, "listener");
        return chatClient.subscribe(listener);
    }

    private final StatePlugin createStatePlugin(User user, InterfaceC2994c0 scope, MutableGlobalState mutableGlobalState) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[createStatePlugin] user.id: " + user.getId(), null);
        }
        ChatClient chatClientInstance = ChatClient.INSTANCE.instance();
        RepositoryFacade repositoryFacade = chatClientInstance.getRepositoryFacade();
        ClientState clientState = chatClientInstance.getClientState();
        StateRegistry stateRegistry = new StateRegistry(clientState.getUser(), repositoryFacade.observeLatestUsers(), mutableGlobalState.getActiveLiveLocations(), AbstractC3006f0.m8725s(scope.getCoroutineContext()), this.config.getNow(), scope, this.config.getMessageLimitConfig(), mutableGlobalState.getMuted(), this.config.getUseLegacyChannelLogic());
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(Boolean.TRUE);
        LogicRegistry logicRegistry = new LogicRegistry(stateRegistry, clientState, mutableGlobalState, this.config.getUserPresence(), repositoryFacade, chatClientInstance, scope, this.config.getNow(), this.config.getUseLegacyChannelLogic());
        chatClientInstance.setLogicRegistry(logicRegistry);
        SyncManager syncManager = new SyncManager(user.getId(), chatClientInstance, clientState, mutableGlobalState, repositoryFacade, logicRegistry, stateRegistry, this.config.getUserPresence(), this.config.isAutomaticSyncOnReconnectEnabled(), this.config.getSyncMaxThreshold(), new C19383k(4), chatClientInstance.getServerClockOffset(), scope, null, null, 24576, null);
        return new StatePlugin(new StateErrorHandlerFactory(scope, logicRegistry, clientState, repositoryFacade), logicRegistry, repositoryFacade, clientState, stateRegistry, syncManager, createEventHandler(user, scope, chatClientInstance, logicRegistry, stateRegistry, clientState, mutableGlobalState, repositoryFacade, new StreamStatePluginFactory$createStatePlugin$eventHandler$1(syncManager), syncManager.getSyncedEvents(), this.config.getMessageLimitConfig().getMessageBufferConfig()), mutableGlobalState, c13045h2M36593c, this.config);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC30063j createStatePlugin$lambda$3(CoroutineExceptionHandler coroutineExceptionHandler, InterfaceC3027k1 parentJob) {
        AbstractC22676k.m65750j(parentJob, "parentJob");
        return AbstractC12889b.m36254T(new C3004e2(parentJob), DispatcherProvider.INSTANCE.getIO()).plus(coroutineExceptionHandler);
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
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
        return createStatePlugin(user);
    }

    @Override // io.getstream.chat.android.client.plugin.DependencyResolver
    @InternalStreamChatApi
    public final <T> T resolveDependency(InterfaceC21461d klass) {
        AbstractC22676k.m65750j(klass, "klass");
        if (!klass.equals(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ChatClientConfig.class))) {
            return null;
        }
        T t14 = (T) this.config;
        AbstractC22676k.m65748h(t14, "null cannot be cast to non-null type T of io.getstream.chat.android.client.internal.state.plugin.factory.StreamStatePluginFactory.resolveDependency");
        return t14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final StatePlugin createStatePlugin(User user) {
        return createStatePlugin(user, ChatClient.INSTANCE.instance().inheritScope(new C17095c(new C19288x3c221bbd(C2986a0.f11990w), 17)), new MutableGlobalState(user.getId(), null, 2, 0 == true ? 1 : 0));
    }
}
