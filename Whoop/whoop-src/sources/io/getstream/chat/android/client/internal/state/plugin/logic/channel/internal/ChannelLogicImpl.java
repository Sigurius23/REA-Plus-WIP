package io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import com.mapbox.common.HttpHeaders;
import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.models.Pagination;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.api.models.WatchChannelRequest;
import io.getstream.chat.android.client.channel.ChannelMessagesUpdateLogic;
import io.getstream.chat.android.client.errors.ChatErrorKt;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.extensions.MessageExtensionsKt;
import io.getstream.chat.android.client.extensions.StringExtensionsKt;
import io.getstream.chat.android.client.extensions.internal.MessageKt;
import io.getstream.chat.android.client.internal.state.model.querychannels.pagination.internal.MapperKt;
import io.getstream.chat.android.client.internal.state.model.querychannels.pagination.internal.QueryChannelPaginationRequest;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateImpl;
import io.getstream.chat.android.client.internal.state.plugin.state.global.internal.MutableGlobalState;
import io.getstream.chat.android.client.persistance.repository.RepositoryFacade;
import io.getstream.chat.android.client.query.pagination.AnyChannelPaginationRequest;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ChannelData;
import io.getstream.chat.android.models.ChannelKt;
import io.getstream.chat.android.models.Config;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.PendingMessage;
import io.getstream.chat.android.models.PushPreference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kc3.C22365e;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010 \u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016¢\u0006\u0004\b \u0010!J&\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b$\u0010%J&\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0096@¢\u0006\u0004\b'\u0010(J(\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\b\u0010&\u001a\u0004\u0018\u00010\u00022\u0006\u0010#\u001a\u00020\"H\u0096@¢\u0006\u0004\b)\u0010(J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010&\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00182\u0006\u0010/\u001a\u00020,H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00182\u0006\u0010/\u001a\u00020,H\u0016¢\u0006\u0004\b2\u00101J\u0017\u00103\u001a\u00020\u00182\u0006\u0010/\u001a\u00020,H\u0016¢\u0006\u0004\b3\u00101J\u001d\u00107\u001a\u00020\u00182\f\u00106\u001a\b\u0012\u0004\u0012\u00020504H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00182\u0006\u00109\u001a\u00020\fH\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020\u00182\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00182\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b@\u0010?J\u0017\u0010C\u001a\u00020\u00182\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ\u0019\u0010E\u001a\u00020\u00182\b\u0010/\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\bE\u00101J\u000f\u0010F\u001a\u00020\fH\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\fH\u0016¢\u0006\u0004\bH\u0010GJ\u0011\u0010I\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\bI\u0010JJ\u0019\u0010K\u001a\u00020\u00182\b\u0010=\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\bK\u0010?J\u0019\u0010L\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\bL\u0010MJ@\u0010T\u001a\u00020\u00182\u0006\u0010N\u001a\u00020\u001e2\u0006\u0010O\u001a\u00020\"2\u0006\u0010P\u001a\u00020\f2\u0006\u0010Q\u001a\u00020\f2\u0006\u0010R\u001a\u00020\f2\u0006\u0010S\u001a\u00020\fH\u0096@¢\u0006\u0004\bT\u0010UJ\u001d\u0010X\u001a\u00020\u00182\f\u0010W\u001a\b\u0012\u0004\u0012\u00020V04H\u0016¢\u0006\u0004\bX\u00108J\u0017\u0010Z\u001a\u00020\u00182\u0006\u0010Y\u001a\u00020VH\u0016¢\u0006\u0004\bZ\u0010[J\u001e\u0010^\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010]\u001a\u00020\\H\u0082@¢\u0006\u0004\b^\u0010_J\u001f\u0010`\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010N\u001a\u00020\u001eH\u0002¢\u0006\u0004\b`\u0010aJ\"\u0010b\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010]\u001a\u00020\u0016H\u0082@¢\u0006\u0004\bb\u0010cJ+\u0010f\u001a\u00020\f2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020,042\f\u0010e\u001a\b\u0012\u0004\u0012\u00020,04H\u0002¢\u0006\u0004\bf\u0010gR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010h\u001a\u0004\bi\u0010jR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010k\u001a\u0004\bl\u0010mR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010nR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010oR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010pR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010qR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010rR\u0014\u0010t\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010u¨\u0006v"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;", "", "cid", "Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;", "messagesUpdateLogic", "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;", "repository", "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;", "state", "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;", "mutableGlobalState", "", "userPresence", "Lbc3/c0;", "coroutineScope", "Lkotlin/Function0;", "getCurrentUserId", "", "now", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;ZLbc3/c0;Lc93/a;Lc93/a;)V", "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;", "query", "Ll83/a0;", "updateStateFromDatabase", "(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;", "setPaginationDirection", "(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)V", "Ln23/h;", "Lio/getstream/chat/android/models/Channel;", "result", "onQueryChannelResult", "(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Ln23/h;)V", "", MapboxMap.QFE_LIMIT, "watch", "(IZLq83/d;)Ljava/lang/Object;", "messageId", "loadAfter", "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "loadBefore", "loadAround", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/Message;", "getMessage", "(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;", "message", "upsertMessage", "(Lio/getstream/chat/android/models/Message;)V", "updateLastMessageAt", "deleteMessage", "", "Lio/getstream/chat/android/models/Member;", QueryChannelRequest.KEY_MEMBERS, "upsertMembers", "(Ljava/util/List;)V", "hidden", "setHidden", "(Z)V", "Ljava/util/Date;", HttpHeaders.DATE, "hideMessagesBefore", "(Ljava/util/Date;)V", "removeMessagesBefore", "Lio/getstream/chat/android/models/PushPreference;", "preference", "setPushPreference", "(Lio/getstream/chat/android/models/PushPreference;)V", "setRepliedMessage", "markRead", "()Z", "typingEventsEnabled", "getLastStartTypingEvent", "()Ljava/util/Date;", "setLastStartTypingEvent", "setKeystrokeParentMessageId", "(Ljava/lang/String;)V", "channel", "messageLimit", "shouldRefreshMessages", "scrollUpdate", "isNotificationUpdate", "isChannelsStateUpdate", "updateDataForChannel", "(Lio/getstream/chat/android/models/Channel;IZZZZLq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/events/ChatEvent;", "events", "handleEvents", NotificationCompat.CATEGORY_EVENT, "handleEvent", "(Lio/getstream/chat/android/client/events/ChatEvent;)V", "Lio/getstream/chat/android/client/api/models/WatchChannelRequest;", "request", "queryChannel", "(Lio/getstream/chat/android/client/api/models/WatchChannelRequest;Lq83/d;)Ljava/lang/Object;", "updateMessages", "(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lio/getstream/chat/android/models/Channel;)V", "fetchOfflineChannel", "(Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;", "currentMessages", "incomingMessages", "hasGap", "(Ljava/util/List;Ljava/util/List;)Z", "Ljava/lang/String;", "getCid", "()Ljava/lang/String;", "Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;", "getMessagesUpdateLogic", "()Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;", "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;", "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;", "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;", "Z", "Lbc3/c0;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;", "eventHandler", "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelLogicImpl implements ChannelLogic {
    private final String cid;
    private final InterfaceC2994c0 coroutineScope;
    private final ChannelEventHandlerImpl eventHandler;
    private final ChannelMessagesUpdateLogic messagesUpdateLogic;
    private final MutableGlobalState mutableGlobalState;
    private final RepositoryFacade repository;
    private final ChannelStateImpl state;
    private final boolean userPresence;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogicImpl$fetchOfflineChannel$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogicImpl", m100430f = "ChannelLogicImpl.kt", m100431l = {408, 411}, m100432m = "fetchOfflineChannel")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192971 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C192971(InterfaceC30057d<? super C192971> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelLogicImpl.this.fetchOfflineChannel(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogicImpl$updateDataForChannel$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogicImpl", m100430f = "ChannelLogicImpl.kt", m100431l = {302}, m100432m = "updateDataForChannel")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192981 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        boolean Z$0;
        boolean Z$1;
        boolean Z$2;
        boolean Z$3;
        int label;
        /* synthetic */ Object result;

        public C192981(InterfaceC30057d<? super C192981> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelLogicImpl.this.updateDataForChannel(null, 0, false, false, false, false, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogicImpl$updateStateFromDatabase$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogicImpl", m100430f = "ChannelLogicImpl.kt", m100431l = {92, 93, 94}, m100432m = "updateStateFromDatabase")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193001 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C193001(InterfaceC30057d<? super C193001> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelLogicImpl.this.updateStateFromDatabase(null, this);
        }
    }

    public ChannelLogicImpl(String cid, ChannelMessagesUpdateLogic messagesUpdateLogic, RepositoryFacade repository, ChannelStateImpl state, MutableGlobalState mutableGlobalState, boolean z4, InterfaceC2994c0 coroutineScope, InterfaceC4339a getCurrentUserId, InterfaceC4339a now) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(messagesUpdateLogic, "messagesUpdateLogic");
        AbstractC22676k.m65750j(repository, "repository");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(mutableGlobalState, "mutableGlobalState");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(getCurrentUserId, "getCurrentUserId");
        AbstractC22676k.m65750j(now, "now");
        this.cid = cid;
        this.messagesUpdateLogic = messagesUpdateLogic;
        this.repository = repository;
        this.state = state;
        this.mutableGlobalState = mutableGlobalState;
        this.userPresence = z4;
        this.coroutineScope = coroutineScope;
        this.eventHandler = new ChannelEventHandlerImpl(cid, state, mutableGlobalState, coroutineScope, getCurrentUserId, now);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object fetchOfflineChannel(String str, QueryChannelRequest queryChannelRequest, InterfaceC30057d<? super Channel> interfaceC30057d) {
        C192971 c192971;
        QueryChannelRequest queryChannelRequest2;
        Channel channel;
        String str2 = str;
        if (interfaceC30057d instanceof C192971) {
            c192971 = (C192971) interfaceC30057d;
            int i13 = c192971.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c192971.label = i13 - Integer.MIN_VALUE;
            } else {
                c192971 = new C192971(interfaceC30057d);
            }
        } else {
            c192971 = new C192971(interfaceC30057d);
        }
        Object objSelectChannel = c192971.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c192971.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objSelectChannel);
            RepositoryFacade repositoryFacade = this.repository;
            c192971.L$0 = str2;
            queryChannelRequest2 = queryChannelRequest;
            c192971.L$1 = queryChannelRequest2;
            c192971.label = 1;
            objSelectChannel = repositoryFacade.selectChannel(str2, c192971);
            if (objSelectChannel != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            QueryChannelRequest queryChannelRequest3 = (QueryChannelRequest) c192971.L$1;
            String str3 = (String) c192971.L$0;
            AbstractC34132o.m107864I(objSelectChannel);
            queryChannelRequest2 = queryChannelRequest3;
            str2 = str3;
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Channel channel2 = (Channel) c192971.L$2;
            AbstractC34132o.m107864I(objSelectChannel);
            channel = channel2;
        }
        return Channel.copy$default(channel, null, null, null, null, 0, false, null, null, null, null, 0, (List) objSelectChannel, null, null, null, null, null, 0, null, null, null, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, -2049, 7, null);
        Channel channel3 = (Channel) objSelectChannel;
        if (channel3 == null) {
            return null;
        }
        RepositoryFacade repositoryFacade2 = this.repository;
        AnyChannelPaginationRequest anyChannelPaginationRequest = MapperKt.toAnyChannelPaginationRequest(queryChannelRequest2);
        c192971.L$0 = null;
        c192971.L$1 = null;
        c192971.L$2 = channel3;
        c192971.label = 2;
        Object objSelectMessagesForChannel = repositoryFacade2.selectMessagesForChannel(str2, anyChannelPaginationRequest, c192971);
        if (objSelectMessagesForChannel != enumC31071a) {
            channel = channel3;
            objSelectChannel = objSelectMessagesForChannel;
            return Channel.copy$default(channel, null, null, null, null, 0, false, null, null, null, null, 0, (List) objSelectChannel, null, null, null, null, null, 0, null, null, null, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, -2049, 7, null);
        }
        return enumC31071a;
    }

    private final boolean hasGap(List<Message> currentMessages, List<Message> incomingMessages) {
        Object obj;
        List<Message> list = currentMessages;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                Date createdAtOrDefault = MessageExtensionsKt.getCreatedAtOrDefault((Message) next, MessageKt.getNEVER());
                do {
                    Object next2 = it.next();
                    Date createdAtOrDefault2 = MessageExtensionsKt.getCreatedAtOrDefault((Message) next2, MessageKt.getNEVER());
                    if (createdAtOrDefault.compareTo(createdAtOrDefault2) < 0) {
                        next = next2;
                        createdAtOrDefault = createdAtOrDefault2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Message message = (Message) obj;
        Message message2 = (Message) AbstractC25265s.m74100H0(incomingMessages);
        if (currentMessages.isEmpty() || message == null || message2 == null) {
            return false;
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                if (AbstractC22676k.m65745e(((Message) it3.next()).getId(), message2.getId())) {
                    return false;
                }
            }
        }
        return MessageExtensionsKt.getCreatedAtOrDefault(message2, MessageKt.getNEVER()).after(MessageExtensionsKt.getCreatedAtOrDefault(message, MessageKt.getNEVER()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChannelData onQueryChannelResult$lambda$0(ChannelData channelData, ChannelLogicImpl channelLogicImpl, ChannelData channelData2) {
        return channelData.getOwnCapabilities().isEmpty() ? ChannelData.copy$default(channelData, null, null, null, null, null, 0, false, null, null, null, 0, null, null, ((ChannelData) channelLogicImpl.state.getChannelData().getValue()).getOwnCapabilities(), null, null, null, null, null, null, 1040383, null) : channelData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object queryChannel(WatchChannelRequest watchChannelRequest, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        this.state.getPaginationManager().begin(watchChannelRequest);
        C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(this.cid);
        return ChatClient.INSTANCE.instance().queryChannel((String) c23465kCidToTypeAndId.f92937w, (String) c23465kCidToTypeAndId.f92938x, watchChannelRequest, true).await(interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChannelData updateDataForChannel$lambda$6(ChannelData channelData, ChannelLogicImpl channelLogicImpl, ChannelData channelData2) {
        return channelData.getOwnCapabilities().isEmpty() ? ChannelData.copy$default(channelData, null, null, null, null, null, 0, false, null, null, null, 0, null, null, ((ChannelData) channelLogicImpl.state.getChannelData().getValue()).getOwnCapabilities(), null, null, null, null, null, null, 1040383, null) : channelData;
    }

    private final void updateMessages(QueryChannelRequest query, Channel channel) {
        if (!query.isFilteringMessages()) {
            this.state.clearCachedLatestMessages();
            this.state.setMessages(channel.getMessages());
            this.state.setInsideSearch(false);
        } else if (query.isFilteringAroundIdMessages()) {
            if (((Boolean) this.state.getInsideSearch().getValue()).booleanValue()) {
                this.state.setMessages(channel.getMessages());
            } else {
                this.state.cacheLatestMessages();
                this.state.setMessages(channel.getMessages());
                this.state.setInsideSearch(true);
            }
        } else if (query.isFilteringNewerMessages()) {
            ChannelStateImpl.upsertMessages$default(this.state, channel.getMessages(), false, 2, null);
            this.state.trimOldestMessages();
            if (query.messagesLimit() > channel.getMessages().size()) {
                this.state.clearCachedLatestMessages();
                this.state.setInsideSearch(false);
            }
        } else if (query.filteringOlderMessages()) {
            ChannelStateImpl.upsertMessages$default(this.state, channel.getMessages(), false, 2, null);
            this.state.trimNewestMessages();
        }
        ChannelStateImpl channelStateImpl = this.state;
        List<PendingMessage> pendingMessages = channel.getPendingMessages();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(pendingMessages, 10));
        Iterator<T> it = pendingMessages.iterator();
        while (it.hasNext()) {
            arrayList.add(((PendingMessage) it.next()).getMessage());
        }
        channelStateImpl.setPendingMessages(arrayList);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final void deleteMessage(Message message) {
        AbstractC22676k.m65750j(message, "message");
        this.state.deleteMessage(message.getId());
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final String getCid() {
        return this.cid;
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final Date getLastStartTypingEvent() {
        return this.state.getLastStartTypingEvent();
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final Message getMessage(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.state.getMessageById(messageId);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final ChannelMessagesUpdateLogic getMessagesUpdateLogic() {
        return this.messagesUpdateLogic;
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final void handleEvent(ChatEvent event) {
        AbstractC22676k.m65750j(event, "event");
        this.eventHandler.handle(event);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final void handleEvents(List<? extends ChatEvent> events) {
        AbstractC22676k.m65750j(events, "events");
        Iterator<? extends ChatEvent> it = events.iterator();
        while (it.hasNext()) {
            handleEvent(it.next());
        }
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final void hideMessagesBefore(Date date) {
        AbstractC22676k.m65750j(date, "date");
        this.state.hideMessagesBefore(date);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final Object loadAfter(String str, int i13, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        QueryChannelPaginationRequest queryChannelPaginationRequest = new QueryChannelPaginationRequest(i13);
        queryChannelPaginationRequest.setMessageFilterValue(str);
        queryChannelPaginationRequest.setMessageFilterDirection(Pagination.GREATER_THAN);
        return queryChannel(queryChannelPaginationRequest.toWatchChannelRequest(this.userPresence), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final Object loadAround(String str, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        QueryChannelPaginationRequest queryChannelPaginationRequest = new QueryChannelPaginationRequest(0, 1, null);
        queryChannelPaginationRequest.setMessageFilterValue(str);
        queryChannelPaginationRequest.setMessageFilterDirection(Pagination.AROUND_ID);
        WatchChannelRequest watchChannelRequest = queryChannelPaginationRequest.toWatchChannelRequest(this.userPresence);
        watchChannelRequest.setShouldRefresh(true);
        return queryChannel(watchChannelRequest, interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final Object loadBefore(String str, int i13, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        if (str == null) {
            Message oldestMessage = this.state.getOldestMessage();
            str = oldestMessage != null ? oldestMessage.getId() : null;
        }
        QueryChannelPaginationRequest queryChannelPaginationRequest = new QueryChannelPaginationRequest(i13);
        if (str != null) {
            queryChannelPaginationRequest.setMessageFilterValue(str);
            queryChannelPaginationRequest.setMessageFilterDirection(Pagination.LESS_THAN);
        }
        return queryChannel(queryChannelPaginationRequest.toWatchChannelRequest(this.userPresence), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final boolean markRead() {
        return this.state.markRead();
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final void onQueryChannelResult(QueryChannelRequest query, AbstractC26205h result) {
        AbstractC22676k.m65750j(query, "query");
        AbstractC22676k.m65750j(result, "result");
        int iMessagesLimit = query.messagesLimit();
        boolean isNotificationUpdate = query.getIsNotificationUpdate();
        if (!isNotificationUpdate && iMessagesLimit != 0) {
            this.state.getPaginationManager().end(query, result);
        }
        if (!(result instanceof C26204g)) {
            if (!(result instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            this.state.setRecoveryNeeded(!ChatErrorKt.isPermanent(((C26203f) result).f103918a));
            return;
        }
        Channel channel = (Channel) ((C26204g) result).f103919a;
        this.state.updateChannelData(new C19302a(ChannelKt.toChannelData(channel), this, 1));
        this.state.setMemberCount(channel.getMemberCount());
        this.state.upsertMembers(channel.getMembers());
        this.state.upsertWatchers(channel.getWatchers(), channel.getWatcherCount());
        this.state.updateReads(channel.getRead());
        this.state.setChannelConfig(channel.getConfig());
        if (iMessagesLimit > 0) {
            updateMessages(query, channel);
        }
        this.state.addPinnedMessages(channel.getPinnedMessages());
        if (isNotificationUpdate || iMessagesLimit == 0) {
            return;
        }
        this.state.setRecoveryNeeded(false);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final void removeMessagesBefore(Date date) {
        AbstractC22676k.m65750j(date, "date");
        this.state.removeMessagesBefore(date, null);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final void setHidden(boolean hidden) {
        this.state.setHidden(hidden);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final void setKeystrokeParentMessageId(String messageId) {
        this.state.setKeystrokeParentMessageId(messageId);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final void setLastStartTypingEvent(Date date) {
        this.state.setLastStartTypingEvent(date);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final void setPaginationDirection(QueryChannelRequest query) {
        AbstractC22676k.m65750j(query, "query");
        this.state.getPaginationManager().begin(query);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final void setPushPreference(PushPreference preference) {
        AbstractC22676k.m65750j(preference, "preference");
        this.state.setPushPreference(preference);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final void setRepliedMessage(Message message) {
        this.state.setRepliedMessage(message);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final boolean typingEventsEnabled() {
        return ((Config) this.state.getChannelConfig().getValue()).getTypingEventsEnabled();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final Object updateDataForChannel(Channel channel, int i13, boolean z4, boolean z13, boolean z14, boolean z15, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        C192981 c192981;
        if (interfaceC30057d instanceof C192981) {
            c192981 = (C192981) interfaceC30057d;
            int i14 = c192981.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c192981.label = i14 - Integer.MIN_VALUE;
            } else {
                c192981 = new C192981(interfaceC30057d);
            }
        } else {
            c192981 = new C192981(interfaceC30057d);
        }
        Object objM8705K = c192981.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c192981.label;
        if (i15 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            this.state.updateChannelData(new C19302a(ChannelKt.toChannelData(channel), this, 0));
            this.state.setMemberCount(channel.getMemberCount());
            this.state.upsertMembers(channel.getMembers());
            this.state.upsertWatchers(channel.getWatchers(), channel.getWatcherCount());
            this.state.updateReads(channel.getRead());
            this.state.setChannelConfig(channel.getConfig());
            ChannelStateImpl channelStateImpl = this.state;
            List<PendingMessage> pendingMessages = channel.getPendingMessages();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(pendingMessages, 10));
            Iterator<T> it = pendingMessages.iterator();
            while (it.hasNext()) {
                arrayList.add(((PendingMessage) it.next()).getMessage());
            }
            channelStateImpl.setPendingMessages(arrayList);
            if (i13 > 0) {
                C22365e c22365e = AbstractC3050q0.f12077a;
                ChannelLogicImpl$updateDataForChannel$sortedMessages$1 channelLogicImpl$updateDataForChannel$sortedMessages$1 = new ChannelLogicImpl$updateDataForChannel$sortedMessages$1(channel, null);
                c192981.L$0 = channel;
                c192981.L$1 = null;
                c192981.I$0 = i13;
                c192981.Z$0 = z4;
                c192981.Z$1 = z13;
                c192981.Z$2 = z14;
                c192981.Z$3 = z15;
                c192981.label = 1;
                objM8705K = AbstractC3006f0.m8705K(c22365e, channelLogicImpl$updateDataForChannel$sortedMessages$1, c192981);
                if (objM8705K == enumC31071a) {
                    return enumC31071a;
                }
            }
            this.state.addPinnedMessages(channel.getPinnedMessages());
            return C23454a0.f92919a;
        }
        if (i15 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z4 = c192981.Z$0;
        i13 = c192981.I$0;
        channel = (Channel) c192981.L$0;
        AbstractC34132o.m107864I(objM8705K);
        List<Message> list = (List) objM8705K;
        List<Message> list2 = (List) this.state.getMessages().getValue();
        if (z4 || list2.isEmpty()) {
            this.state.setMessages(list);
            this.state.getPaginationManager().setEndOfOlderMessages(channel.getMessages().size() < i13);
        } else if (((Boolean) this.state.getInsideSearch().getValue()).booleanValue()) {
            this.state.upsertCachedLatestMessages(list, true);
        } else if (hasGap(list2, list)) {
            this.state.upsertCachedLatestMessages(list, true);
            this.state.setInsideSearch(true);
            this.state.getPaginationManager().setEndOfNewerMessages(false);
        } else {
            this.state.upsertMessages(list, true);
            this.state.getPaginationManager().setEndOfOlderMessages(channel.getMessages().size() < i13);
        }
        this.state.addPinnedMessages(channel.getPinnedMessages());
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final void updateLastMessageAt(Message message) {
        AbstractC22676k.m65750j(message, "message");
        this.state.updateLastMessageAt(message);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final Object updateStateFromDatabase(QueryChannelRequest queryChannelRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C193001 c193001;
        QueryChannelRequest queryChannelRequest2;
        Channel channel;
        List<Message> list;
        int iMessagesLimit;
        boolean isNotificationUpdate;
        ChannelLogicImpl channelLogicImpl;
        Channel channel2;
        List<Message> list2;
        Channel channel3;
        if (interfaceC30057d instanceof C193001) {
            c193001 = (C193001) interfaceC30057d;
            int i13 = c193001.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c193001.label = i13 - Integer.MIN_VALUE;
            } else {
                c193001 = new C193001(interfaceC30057d);
            }
        } else {
            c193001 = new C193001(interfaceC30057d);
        }
        C193001 c193002 = c193001;
        Object objFetchOfflineChannel = c193002.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c193002.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objFetchOfflineChannel);
            if (queryChannelRequest.getIsNotificationUpdate() || queryChannelRequest.isFilteringMessages()) {
                return c23454a0;
            }
            String str = this.cid;
            c193002.L$0 = queryChannelRequest;
            c193002.label = 1;
            objFetchOfflineChannel = fetchOfflineChannel(str, queryChannelRequest, c193002);
            if (objFetchOfflineChannel != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            queryChannelRequest = (QueryChannelRequest) c193002.L$0;
            AbstractC34132o.m107864I(objFetchOfflineChannel);
        } else {
            if (i14 == 2) {
                channel = (Channel) c193002.L$1;
                queryChannelRequest2 = (QueryChannelRequest) c193002.L$0;
                AbstractC34132o.m107864I(objFetchOfflineChannel);
                list = (List) objFetchOfflineChannel;
                iMessagesLimit = queryChannelRequest2.messagesLimit();
                isNotificationUpdate = queryChannelRequest2.getIsNotificationUpdate();
                c193002.L$0 = null;
                c193002.L$1 = channel;
                c193002.L$2 = list;
                c193002.label = 3;
                channelLogicImpl = this;
                channel2 = channel;
                if (channelLogicImpl.updateDataForChannel(channel2, iMessagesLimit, true, false, isNotificationUpdate, true, c193002) != enumC31071a) {
                    list2 = list;
                    channel3 = channel2;
                }
                return enumC31071a;
            }
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = (List) c193002.L$2;
            channel3 = (Channel) c193002.L$1;
            AbstractC34132o.m107864I(objFetchOfflineChannel);
            channelLogicImpl = this;
        }
        channelLogicImpl.state.getPaginationManager().setOldestMessage((Message) AbstractC25265s.m74114R0(channel3.getMessages()));
        channelLogicImpl.state.setLocalOnlyMessages(list2);
        return c23454a0;
        Channel channel4 = (Channel) objFetchOfflineChannel;
        if (channel4 == null) {
            return c23454a0;
        }
        RepositoryFacade repositoryFacade = this.repository;
        String str2 = this.cid;
        c193002.L$0 = queryChannelRequest;
        c193002.L$1 = channel4;
        c193002.label = 2;
        Object objSelectLocalOnlyMessagesForChannel = repositoryFacade.selectLocalOnlyMessagesForChannel(str2, c193002);
        if (objSelectLocalOnlyMessagesForChannel != enumC31071a) {
            queryChannelRequest2 = queryChannelRequest;
            channel = channel4;
            objFetchOfflineChannel = objSelectLocalOnlyMessagesForChannel;
            list = (List) objFetchOfflineChannel;
            iMessagesLimit = queryChannelRequest2.messagesLimit();
            isNotificationUpdate = queryChannelRequest2.getIsNotificationUpdate();
            c193002.L$0 = null;
            c193002.L$1 = channel;
            c193002.L$2 = list;
            c193002.label = 3;
            channelLogicImpl = this;
            channel2 = channel;
            if (channelLogicImpl.updateDataForChannel(channel2, iMessagesLimit, true, false, isNotificationUpdate, true, c193002) != enumC31071a) {
                list2 = list;
                channel3 = channel2;
                channelLogicImpl.state.getPaginationManager().setOldestMessage((Message) AbstractC25265s.m74114R0(channel3.getMessages()));
                channelLogicImpl.state.setLocalOnlyMessages(list2);
                return c23454a0;
            }
        }
        return enumC31071a;
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final void upsertMembers(List<Member> members) {
        AbstractC22676k.m65750j(members, "members");
        this.state.upsertMembers(members);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final void upsertMessage(Message message) {
        AbstractC22676k.m65750j(message, "message");
        this.state.upsertMessage(message);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final Object watch(int i13, boolean z4, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        WatchChannelRequest watchChannelRequest = new QueryChannelPaginationRequest(i13).toWatchChannelRequest(z4);
        watchChannelRequest.setShouldRefresh(true);
        return queryChannel(watchChannelRequest, interfaceC30057d);
    }
}
