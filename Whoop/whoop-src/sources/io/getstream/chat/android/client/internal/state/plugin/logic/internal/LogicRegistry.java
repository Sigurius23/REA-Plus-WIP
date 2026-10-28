package io.getstream.chat.android.client.internal.state.plugin.logic.internal;

import androidx.profileinstaller.ProfileVerifier;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import ec3.C13045h2;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.models.QueryChannelsRequest;
import io.getstream.chat.android.client.api.models.QueryThreadsRequest;
import io.getstream.chat.android.client.api.state.StateRegistry;
import io.getstream.chat.android.client.channel.ChannelMessagesUpdateLogic;
import io.getstream.chat.android.client.channel.state.ChannelStateLogicProvider;
import io.getstream.chat.android.client.extensions.StringExtensionsKt;
import io.getstream.chat.android.client.internal.state.plugin.QueryChannelsIdentifier;
import io.getstream.chat.android.client.internal.state.plugin.QueryChannelsIdentifierKt;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogicImpl;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelMessagesUpdateLogicImpl;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.SearchLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy.ChannelLogicLegacyImpl;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy.ChannelStateLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.thread.internal.ThreadLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.thread.internal.ThreadStateLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsDatabaseLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsStateLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.querythreads.internal.QueryThreadsDatabaseLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.querythreads.internal.QueryThreadsLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.querythreads.internal.QueryThreadsStateLogic;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateImpl;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateLegacyImpl;
import io.getstream.chat.android.client.internal.state.plugin.state.global.internal.MutableGlobalState;
import io.getstream.chat.android.client.internal.state.plugin.state.querychannels.internal.QueryChannelsMutableState;
import io.getstream.chat.android.client.persistance.repository.RepositoryFacade;
import io.getstream.chat.android.client.setup.state.ClientState;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Thread;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import l83.C23465k;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 d2\u00020\u0001:\u0001dBW\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b \u0010%J\u001d\u0010(\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0016¢\u0006\u0004\b(\u0010\u001bJ\u001f\u0010,\u001a\u00020)2\u0006\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0016H\u0000¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u0004\u0018\u00010\u00192\u0006\u0010-\u001a\u00020\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u0004\u0018\u0001002\u0006\u0010-\u001a\u00020\u0016¢\u0006\u0004\b1\u00102J\u001a\u00103\u001a\u0004\u0018\u0001002\u0006\u0010-\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u0004\u0018\u00010\u00192\u0006\u00105\u001a\u000200¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u0004\u0018\u0001082\u0006\u0010-\u001a\u00020\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u0004\u0018\u0001082\u0006\u00105\u001a\u000200¢\u0006\u0004\b;\u0010<J\u001f\u0010>\u001a\u00020=2\u0006\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0016H\u0016¢\u0006\u0004\b>\u0010?J\u0015\u0010C\u001a\u00020B2\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bC\u0010DJ%\u0010C\u001a\u00020B2\b\u0010F\u001a\u0004\u0018\u00010E2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020H0G¢\u0006\u0004\bC\u0010JJ\u0013\u0010L\u001a\b\u0012\u0004\u0012\u00020B0K¢\u0006\u0004\bL\u0010MJ\u0015\u0010N\u001a\u0002082\u0006\u0010-\u001a\u00020\u0016¢\u0006\u0004\bN\u0010:J\u0013\u0010O\u001a\b\u0012\u0004\u0012\u00020\u001f0K¢\u0006\u0004\bO\u0010MJ\u001d\u0010P\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0016¢\u0006\u0004\bP\u0010QJ\u0013\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00190K¢\u0006\u0004\bR\u0010MJ\u0015\u0010S\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u0016¢\u0006\u0004\bS\u0010TJ\r\u0010U\u001a\u00020)¢\u0006\u0004\bU\u0010VR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010WR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010XR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010YR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010ZR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010[R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\\R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010]R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010^R\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010ZR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001f0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010`R,\u0010b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160a\u0012\u0004\u0012\u00020\u00190_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010`R6\u0010c\u001a$\u0012\u001a\u0012\u0018\u0012\u0006\u0012\u0004\u0018\u00010E\u0012\f\u0012\n\u0012\u0004\u0012\u00020H\u0018\u00010G0a\u0012\u0004\u0012\u00020B0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010`R \u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u0002080_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010`¨\u0006e"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "Lio/getstream/chat/android/client/channel/state/ChannelStateLogicProvider;", "Lio/getstream/chat/android/client/api/state/StateRegistry;", "stateRegistry", "Lio/getstream/chat/android/client/setup/state/ClientState;", "clientState", "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;", "mutableGlobalState", "", "userPresence", "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;", "repos", "Lio/getstream/chat/android/client/ChatClient;", "client", "Lbc3/c0;", "coroutineScope", "Lkotlin/Function0;", "", "now", "useLegacyChannelLogic", "<init>", "(Lio/getstream/chat/android/client/api/state/StateRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;ZLio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;Lc93/a;Z)V", "", "type", "id", "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;", "legacyChannelLogic", "(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;", "channelLogic", "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;", "identifier", "Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;", "queryChannels$stream_chat_android_client_release", "(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;)Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;", "queryChannels", "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;", "queryChannelsRequest", "(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;", "channelType", "channelId", "channel", "Ll83/a0;", "removeChannel$stream_chat_android_client_release", "(Ljava/lang/String;Ljava/lang/String;)V", "removeChannel", "messageId", "channelFromMessageId", "(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;", "Lio/getstream/chat/android/models/Message;", "getMessageById", "(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;", "getMessageByIdFromDb", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "message", "channelFromMessage", "(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;", "threadFromMessageId", "(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;", "threadFromMessage", "(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;", "Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;", "channelStateLogic", "(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;", "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;", "query", "Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;", "threads", "(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;)Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;", "Lio/getstream/chat/android/models/FilterObject;", "filter", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/Thread;", "sort", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;", "", "getActiveQueryThreadsLogic", "()Ljava/util/List;", "thread", "getActiveQueryChannelsLogic", "isActiveChannel", "(Ljava/lang/String;Ljava/lang/String;)Z", "getActiveChannelsLogic", "isActiveThread", "(Ljava/lang/String;)Z", "clear", "()V", "Lio/getstream/chat/android/client/api/state/StateRegistry;", "Lio/getstream/chat/android/client/setup/state/ClientState;", "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;", "Z", "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;", "Lio/getstream/chat/android/client/ChatClient;", "Lbc3/c0;", "Lc93/a;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ll83/k;", "channels", "queryThreads", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class LogicRegistry implements ChannelStateLogicProvider {
    private static final int MESSAGE_LIMIT = 30;
    private final ConcurrentHashMap<C23465k, ChannelLogic> channels;
    private final ChatClient client;
    private final ClientState clientState;
    private final InterfaceC2994c0 coroutineScope;
    private final MutableGlobalState mutableGlobalState;
    private final InterfaceC4339a now;
    private final ConcurrentHashMap<QueryChannelsIdentifier, QueryChannelsLogic> queryChannels;
    private final ConcurrentHashMap<C23465k, QueryThreadsLogic> queryThreads;
    private final RepositoryFacade repos;
    private final StateRegistry stateRegistry;
    private final ConcurrentHashMap<String, ThreadLogic> threads;
    private final boolean useLegacyChannelLogic;
    private final boolean userPresence;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry$getMessageByIdFromDb$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry", m100430f = "LogicRegistry.kt", m100431l = {151}, m100432m = "getMessageByIdFromDb")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193201 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C193201(InterfaceC30057d<? super C193201> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LogicRegistry.this.getMessageByIdFromDb(null, this);
        }
    }

    public LogicRegistry(StateRegistry stateRegistry, ClientState clientState, MutableGlobalState mutableGlobalState, boolean z4, RepositoryFacade repos, ChatClient client, InterfaceC2994c0 coroutineScope, InterfaceC4339a now, boolean z13) {
        AbstractC22676k.m65750j(stateRegistry, "stateRegistry");
        AbstractC22676k.m65750j(clientState, "clientState");
        AbstractC22676k.m65750j(mutableGlobalState, "mutableGlobalState");
        AbstractC22676k.m65750j(repos, "repos");
        AbstractC22676k.m65750j(client, "client");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(now, "now");
        this.stateRegistry = stateRegistry;
        this.clientState = clientState;
        this.mutableGlobalState = mutableGlobalState;
        this.userPresence = z4;
        this.repos = repos;
        this.client = client;
        this.coroutineScope = coroutineScope;
        this.now = now;
        this.useLegacyChannelLogic = z13;
        this.queryChannels = new ConcurrentHashMap<>();
        this.channels = new ConcurrentHashMap<>();
        this.queryThreads = new ConcurrentHashMap<>();
        this.threads = new ConcurrentHashMap<>();
    }

    private final ChannelLogic channelLogic(String type, String id4) {
        ConcurrentHashMap<C23465k, ChannelLogic> concurrentHashMap = this.channels;
        C23465k c23465k = new C23465k(type, id4);
        ChannelLogic channelLogic = concurrentHashMap.get(c23465k);
        if (channelLogic == null) {
            ChannelStateImpl channelStateImplChannelState$stream_chat_android_client_release = this.stateRegistry.channelState$stream_chat_android_client_release(type, id4);
            ChannelLogicImpl channelLogicImpl = new ChannelLogicImpl(AbstractC18489d0.m53370k(type, ":", id4), new ChannelMessagesUpdateLogicImpl(channelStateImplChannelState$stream_chat_android_client_release), this.repos, channelStateImplChannelState$stream_chat_android_client_release, this.mutableGlobalState, this.userPresence, this.coroutineScope, new C19321a(this, 0), this.now);
            ChannelLogic channelLogicPutIfAbsent = concurrentHashMap.putIfAbsent(c23465k, channelLogicImpl);
            channelLogic = channelLogicPutIfAbsent == null ? channelLogicImpl : channelLogicPutIfAbsent;
        }
        return channelLogic;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String channelLogic$lambda$10$lambda$9(LogicRegistry logicRegistry) {
        User user = (User) ((C13045h2) logicRegistry.clientState.getUser()).getValue();
        if (user != null) {
            return user.getId();
        }
        return null;
    }

    private final ChannelLogic legacyChannelLogic(String type, String id4) {
        ConcurrentHashMap<C23465k, ChannelLogic> concurrentHashMap = this.channels;
        C23465k c23465k = new C23465k(type, id4);
        ChannelLogic channelLogic = concurrentHashMap.get(c23465k);
        if (channelLogic == null) {
            ChannelStateLegacyImpl channelStateLegacyImplLegacyChannelState$stream_chat_android_client_release = this.stateRegistry.legacyChannelState$stream_chat_android_client_release(type, id4);
            ChannelLogicLegacyImpl channelLogicLegacyImpl = new ChannelLogicLegacyImpl(this.repos, this.userPresence, new ChannelStateLogic(this.clientState, channelStateLegacyImplLegacyChannelState$stream_chat_android_client_release, this.mutableGlobalState, new SearchLogic(channelStateLegacyImplLegacyChannelState$stream_chat_android_client_release), null, this.now, this.coroutineScope, 16, null), this.coroutineScope, new C19321a(this, 1));
            ChannelLogic channelLogicPutIfAbsent = concurrentHashMap.putIfAbsent(c23465k, channelLogicLegacyImpl);
            channelLogic = channelLogicPutIfAbsent == null ? channelLogicLegacyImpl : channelLogicPutIfAbsent;
        }
        return channelLogic;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String legacyChannelLogic$lambda$8$lambda$7(LogicRegistry logicRegistry) {
        User user = (User) ((C13045h2) logicRegistry.clientState.getUser()).getValue();
        if (user != null) {
            return user.getId();
        }
        return null;
    }

    public final ChannelLogic channel(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.useLegacyChannelLogic ? legacyChannelLogic(channelType, channelId) : channelLogic(channelType, channelId);
    }

    public final ChannelLogic channelFromMessage(Message message) {
        AbstractC22676k.m65750j(message, "message");
        if (message.getParentId() != null && !message.getShowInChannel()) {
            return null;
        }
        C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(message.getCid());
        return channel((String) c23465kCidToTypeAndId.f92937w, (String) c23465kCidToTypeAndId.f92938x);
    }

    public final ChannelLogic channelFromMessageId(String messageId) {
        Object next;
        AbstractC22676k.m65750j(messageId, "messageId");
        Collection<ChannelLogic> collectionValues = this.channels.values();
        AbstractC22676k.m65749i(collectionValues, "<get-values>(...)");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((ChannelLogic) next).getMessage(messageId) != null) {
                return (ChannelLogic) next;
            }
        }
        next = null;
        return (ChannelLogic) next;
    }

    @Override // io.getstream.chat.android.client.channel.state.ChannelStateLogicProvider
    public final ChannelMessagesUpdateLogic channelStateLogic(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return channel(channelType, channelId).getMessagesUpdateLogic();
    }

    public final void clear() {
        this.queryChannels.clear();
        this.channels.clear();
        this.queryThreads.clear();
        this.threads.clear();
        this.mutableGlobalState.destroy();
    }

    public final List<ChannelLogic> getActiveChannelsLogic() {
        Collection<ChannelLogic> collectionValues = this.channels.values();
        AbstractC22676k.m65749i(collectionValues, "<get-values>(...)");
        return AbstractC25265s.m74093D1(collectionValues);
    }

    public final List<QueryChannelsLogic> getActiveQueryChannelsLogic() {
        Collection<QueryChannelsLogic> collectionValues = this.queryChannels.values();
        AbstractC22676k.m65749i(collectionValues, "<get-values>(...)");
        return AbstractC25265s.m74093D1(collectionValues);
    }

    public final List<QueryThreadsLogic> getActiveQueryThreadsLogic() {
        Collection<QueryThreadsLogic> collectionValues = this.queryThreads.values();
        AbstractC22676k.m65749i(collectionValues, "<get-values>(...)");
        return AbstractC25265s.m74093D1(collectionValues);
    }

    public final Message getMessageById(String messageId) {
        Message message;
        AbstractC22676k.m65750j(messageId, "messageId");
        ChannelLogic channelLogicChannelFromMessageId = channelFromMessageId(messageId);
        if (channelLogicChannelFromMessageId != null && (message = channelLogicChannelFromMessageId.getMessage(messageId)) != null) {
            return message;
        }
        ThreadLogic threadLogicThreadFromMessageId = threadFromMessageId(messageId);
        if (threadLogicThreadFromMessageId != null) {
            return threadLogicThreadFromMessageId.getMessage$stream_chat_android_client_release(messageId);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object getMessageByIdFromDb(String str, InterfaceC30057d<? super Message> interfaceC30057d) {
        C193201 c193201;
        if (interfaceC30057d instanceof C193201) {
            c193201 = (C193201) interfaceC30057d;
            int i13 = c193201.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c193201.label = i13 - Integer.MIN_VALUE;
            } else {
                c193201 = new C193201(interfaceC30057d);
            }
        } else {
            c193201 = new C193201(interfaceC30057d);
        }
        Object objSelectMessage = c193201.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c193201.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objSelectMessage);
            RepositoryFacade repositoryFacade = this.repos;
            c193201.L$0 = null;
            c193201.label = 1;
            objSelectMessage = repositoryFacade.selectMessage(str, c193201);
            if (objSelectMessage == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objSelectMessage);
        }
        Message message = (Message) objSelectMessage;
        if (message != null) {
            return message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false);
        }
        return null;
    }

    public final boolean isActiveChannel(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.channels.containsKey(new C23465k(channelType, channelId));
    }

    public final boolean isActiveThread(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.threads.containsKey(messageId);
    }

    public final QueryChannelsLogic queryChannels$stream_chat_android_client_release(QueryChannelsIdentifier identifier) {
        AbstractC22676k.m65750j(identifier, "identifier");
        ConcurrentHashMap<QueryChannelsIdentifier, QueryChannelsLogic> concurrentHashMap = this.queryChannels;
        QueryChannelsLogic queryChannelsLogic = concurrentHashMap.get(identifier);
        if (queryChannelsLogic == null) {
            QueryChannelsStateLogic queryChannelsStateLogic = new QueryChannelsStateLogic((QueryChannelsMutableState) this.stateRegistry.queryChannels(identifier), this.stateRegistry, this, this.coroutineScope);
            RepositoryFacade repositoryFacade = this.repos;
            QueryChannelsLogic queryChannelsLogic2 = new QueryChannelsLogic(identifier, this.client, queryChannelsStateLogic, new QueryChannelsDatabaseLogic(repositoryFacade, repositoryFacade, repositoryFacade, repositoryFacade));
            QueryChannelsLogic queryChannelsLogicPutIfAbsent = concurrentHashMap.putIfAbsent(identifier, queryChannelsLogic2);
            queryChannelsLogic = queryChannelsLogicPutIfAbsent == null ? queryChannelsLogic2 : queryChannelsLogicPutIfAbsent;
        }
        return queryChannelsLogic;
    }

    public final void removeChannel$stream_chat_android_client_release(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        this.channels.remove(new C23465k(channelType, channelId));
    }

    public final ThreadLogic thread(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        ConcurrentHashMap<String, ThreadLogic> concurrentHashMap = this.threads;
        ThreadLogic threadLogic = concurrentHashMap.get(messageId);
        if (threadLogic == null) {
            threadLogic = new ThreadLogic(new ThreadStateLogic(this.stateRegistry.mutableThread$stream_chat_android_client_release(messageId)));
            AbstractC3006f0.m8732z(this.coroutineScope, null, null, new LogicRegistry$thread$1$1$1(this, messageId, threadLogic, null), 3);
            ThreadLogic threadLogicPutIfAbsent = concurrentHashMap.putIfAbsent(messageId, threadLogic);
            if (threadLogicPutIfAbsent != null) {
                threadLogic = threadLogicPutIfAbsent;
            }
        }
        return threadLogic;
    }

    public final ThreadLogic threadFromMessage(Message message) {
        AbstractC22676k.m65750j(message, "message");
        String parentId = message.getParentId();
        if (parentId != null) {
            return thread(parentId);
        }
        return null;
    }

    public final ThreadLogic threadFromMessageId(String messageId) {
        Object next;
        AbstractC22676k.m65750j(messageId, "messageId");
        Collection<ThreadLogic> collectionValues = this.threads.values();
        AbstractC22676k.m65749i(collectionValues, "<get-values>(...)");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((ThreadLogic) next).getMessage$stream_chat_android_client_release(messageId) != null) {
                return (ThreadLogic) next;
            }
        }
        next = null;
        return (ThreadLogic) next;
    }

    public final QueryThreadsLogic threads(QueryThreadsRequest query) {
        AbstractC22676k.m65750j(query, "query");
        return threads(query.getFilter(), query.getSort());
    }

    public final QueryThreadsLogic threads(FilterObject filter, QuerySorter<Thread> sort) {
        QueryThreadsLogic queryThreadsLogicPutIfAbsent;
        AbstractC22676k.m65750j(sort, "sort");
        ConcurrentHashMap<C23465k, QueryThreadsLogic> concurrentHashMap = this.queryThreads;
        C23465k c23465k = new C23465k(filter, sort);
        QueryThreadsLogic queryThreadsLogic = concurrentHashMap.get(c23465k);
        if (queryThreadsLogic == null && (queryThreadsLogicPutIfAbsent = concurrentHashMap.putIfAbsent(c23465k, (queryThreadsLogic = new QueryThreadsLogic(new QueryThreadsStateLogic(this.stateRegistry.mutableQueryThreads$stream_chat_android_client_release(filter, sort), this.mutableGlobalState), new QueryThreadsDatabaseLogic(this.repos))))) != null) {
            queryThreadsLogic = queryThreadsLogicPutIfAbsent;
        }
        return queryThreadsLogic;
    }

    public final QueryChannelsLogic queryChannels$stream_chat_android_client_release(QueryChannelsRequest queryChannelsRequest) {
        AbstractC22676k.m65750j(queryChannelsRequest, "queryChannelsRequest");
        return queryChannels$stream_chat_android_client_release(QueryChannelsIdentifierKt.getIdentifier(queryChannelsRequest));
    }
}
