package io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import com.mapbox.maps.MapboxMap;
import ec3.InterfaceC13037f2;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.event.EventHandlingResult;
import io.getstream.chat.android.client.api.models.PredefinedFilter;
import io.getstream.chat.android.client.api.models.QueryChannelsRequest;
import io.getstream.chat.android.client.api.models.QueryChannelsResult;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.events.CidEvent;
import io.getstream.chat.android.client.internal.state.plugin.QueryChannelsIdentifier;
import io.getstream.chat.android.client.internal.state.plugin.state.querychannels.internal.QueryChannelsMutableState;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ChannelConfig;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23454a0;
import l83.C23465k;
import l83.InterfaceC23462h;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import o23.InterfaceC27474d;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u001b\u001a\u00020\u000f2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010&\u001a\u0012\u0012\u0004\u0012\u00020$0#j\b\u0012\u0004\u0012\u00020$`%2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001fH\u0082@¢\u0006\u0004\b&\u0010'J&\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u001fH\u0082@¢\u0006\u0004\b*\u0010+J\u001e\u0010-\u001a\u00020\u000f2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020$0\u0012H\u0082@¢\u0006\u0004\b-\u0010\u0016J\u0018\u00102\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020.H\u0080@¢\u0006\u0004\b0\u00101J\u0017\u00105\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b3\u00104J\u0015\u00109\u001a\b\u0012\u0004\u0012\u00020\f06H\u0000¢\u0006\u0004\b7\u00108J%\u0010@\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020:2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00130<H\u0000¢\u0006\u0004\b>\u0010?J\u0018\u0010D\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u0013H\u0080@¢\u0006\u0004\bB\u0010CJ\u0018\u0010H\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020$H\u0080@¢\u0006\u0004\bF\u0010GJ,\u0010I\u001a\u00020\u000f2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@¢\u0006\u0004\bI\u0010\u001cJ\u001c\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0017H\u0080@¢\u0006\u0004\bJ\u0010KJ\u0018\u0010N\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020$H\u0080@¢\u0006\u0004\bM\u0010GJ\u001d\u0010R\u001a\u00020\u000f2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020$0OH\u0000¢\u0006\u0004\bP\u0010QJ\u0017\u0010W\u001a\u00020\u000f2\u0006\u0010T\u001a\u00020SH\u0000¢\u0006\u0004\bU\u0010VJ\u000f\u0010Z\u001a\u00020\u000fH\u0000¢\u0006\u0004\bX\u0010YJ$\u0010_\u001a\b\u0012\u0004\u0012\u00020]0\u00122\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020[0\u0012H\u0080@¢\u0006\u0004\b^\u0010\u0016J\u0017\u0010b\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020$H\u0000¢\u0006\u0004\b`\u0010aR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010c\u001a\u0004\bd\u0010eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010gR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010hR\u001b\u0010n\u001a\u00020i8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m¨\u0006o"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;", "", "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;", "identifier", "Lio/getstream/chat/android/client/ChatClient;", "client", "Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;", "queryChannelsStateLogic", "Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;", "queryChannelsDatabaseLogic", "<init>", "(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;)V", "", "isLoading", "hasOffset", "Ll83/a0;", "loadingPerPage", "(ZZ)V", "", "Lio/getstream/chat/android/models/Channel;", "channels", "addChannels", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Ln23/h;", "result", "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;", "request", "onOnlineQueryResult", "(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lq83/d;)Ljava/lang/Object;", "updateOnlineChannels", "(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "", "initialOffset", "step", "thresholdCount", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "getRemoteCids", "(IIILq83/d;)Ljava/lang/Object;", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "fetchPage", "(IILq83/d;)Ljava/lang/Object;", "cidList", "removeChannels", "Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;", "pagination", "queryOffline$stream_chat_android_client_release", "(Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;", "queryOffline", "setCurrentRequest$stream_chat_android_client_release", "(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)V", "setCurrentRequest", "Lec3/f2;", "recoveryNeeded$stream_chat_android_client_release", "()Lec3/f2;", "recoveryNeeded", "Lio/getstream/chat/android/models/FilterObject;", "filter", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "sort", "applyResolvedSpec$stream_chat_android_client_release", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)V", "applyResolvedSpec", "channel", "addChannel$stream_chat_android_client_release", "(Lio/getstream/chat/android/models/Channel;Lq83/d;)Ljava/lang/Object;", "addChannel", "cid", "watchAndAddChannel$stream_chat_android_client_release", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "watchAndAddChannel", "onQueryChannelsResult", "queryFirstPage$stream_chat_android_client_release", "(Lq83/d;)Ljava/lang/Object;", "queryFirstPage", "removeChannel$stream_chat_android_client_release", "removeChannel", "", "refreshChannelsState$stream_chat_android_client_release", "(Ljava/util/Collection;)V", "refreshChannelsState", "Lio/getstream/chat/android/models/User;", "newUser", "refreshMembersStateForUser$stream_chat_android_client_release", "(Lio/getstream/chat/android/models/User;)V", "refreshMembersStateForUser", "refreshAllChannelsState$stream_chat_android_client_release", "()V", "refreshAllChannelsState", "Lio/getstream/chat/android/client/events/ChatEvent;", "chatEvents", "Lio/getstream/chat/android/client/api/event/EventHandlingResult;", "parseChatEventResults$stream_chat_android_client_release", "parseChatEventResults", "refreshChannelState$stream_chat_android_client_release", "(Ljava/lang/String;)V", "refreshChannelState", "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;", "getIdentifier$stream_chat_android_client_release", "()Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;", "Lio/getstream/chat/android/client/ChatClient;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QueryChannelsLogic {
    private final ChatClient client;
    private final QueryChannelsIdentifier identifier;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final QueryChannelsDatabaseLogic queryChannelsDatabaseLogic;
    private final QueryChannelsStateLogic queryChannelsStateLogic;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsLogic$addChannels$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsLogic", m100430f = "QueryChannelsLogic.kt", m100431l = {123, 125}, m100432m = "addChannels")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193221 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C193221(InterfaceC30057d<? super C193221> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return QueryChannelsLogic.this.addChannels(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsLogic$fetchPage$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsLogic", m100430f = "QueryChannelsLogic.kt", m100431l = {307}, m100432m = "fetchPage")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193231 extends AbstractC32269c {
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C193231(InterfaceC30057d<? super C193231> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return QueryChannelsLogic.this.fetchPage(0, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsLogic$getRemoteCids$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsLogic", m100430f = "QueryChannelsLogic.kt", m100431l = {276}, m100432m = "getRemoteCids")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193241 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C193241(InterfaceC30057d<? super C193241> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return QueryChannelsLogic.this.getRemoteCids(0, 0, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsLogic$onOnlineQueryResult$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsLogic", m100430f = "QueryChannelsLogic.kt", m100431l = {202, 204}, m100432m = "onOnlineQueryResult")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193251 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C193251(InterfaceC30057d<? super C193251> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return QueryChannelsLogic.this.onOnlineQueryResult(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsLogic$onQueryChannelsResult$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsLogic", m100430f = "QueryChannelsLogic.kt", m100431l = {131, 135}, m100432m = "onQueryChannelsResult")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193261 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C193261(InterfaceC30057d<? super C193261> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return QueryChannelsLogic.this.onQueryChannelsResult(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsLogic$updateOnlineChannels$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsLogic", m100430f = "QueryChannelsLogic.kt", m100431l = {240, 243, 253}, m100432m = "updateOnlineChannels")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193271 extends AbstractC32269c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        /* synthetic */ Object result;

        public C193271(InterfaceC30057d<? super C193271> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return QueryChannelsLogic.this.updateOnlineChannels(null, null, this);
        }
    }

    public QueryChannelsLogic(QueryChannelsIdentifier identifier, ChatClient client, QueryChannelsStateLogic queryChannelsStateLogic, QueryChannelsDatabaseLogic queryChannelsDatabaseLogic) {
        AbstractC22676k.m65750j(identifier, "identifier");
        AbstractC22676k.m65750j(client, "client");
        AbstractC22676k.m65750j(queryChannelsStateLogic, "queryChannelsStateLogic");
        AbstractC22676k.m65750j(queryChannelsDatabaseLogic, "queryChannelsDatabaseLogic");
        this.identifier = identifier;
        this.client = client;
        this.queryChannelsStateLogic = queryChannelsStateLogic;
        this.queryChannelsDatabaseLogic = queryChannelsDatabaseLogic;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:QueryChannelsLogic");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r8.insertQueryChannels$stream_chat_android_client_release(r7, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object addChannels(java.util.List<io.getstream.chat.android.models.Channel> r7, q83.InterfaceC30057d<? super l83.C23454a0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsLogic.C193221
            if (r0 == 0) goto L13
            r0 = r8
            io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsLogic$addChannels$1 r0 = (io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsLogic.C193221) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsLogic$addChannels$1 r0 = new io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsLogic$addChannels$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r7 = r0.L$1
            io.getstream.chat.android.client.query.QueryChannelsSpec r7 = (io.getstream.chat.android.client.query.QueryChannelsSpec) r7
            java.lang.Object r7 = r0.L$0
            java.util.List r7 = (java.util.List) r7
            p505ts.AbstractC34132o.m107864I(r8)
            goto L6b
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            java.lang.Object r7 = r0.L$0
            java.util.List r7 = (java.util.List) r7
            p505ts.AbstractC34132o.m107864I(r8)
            goto L53
        L43:
            p505ts.AbstractC34132o.m107864I(r8)
            io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsStateLogic r8 = r6.queryChannelsStateLogic
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r7 = r8.addChannelsState$stream_chat_android_client_release(r7, r0)
            if (r7 != r1) goto L53
            goto L6a
        L53:
            io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsStateLogic r7 = r6.queryChannelsStateLogic
            io.getstream.chat.android.client.query.QueryChannelsSpec r7 = r7.getQuerySpecs$stream_chat_android_client_release()
            io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsDatabaseLogic r8 = r6.queryChannelsDatabaseLogic
            r0.L$0 = r5
            r0.L$1 = r5
            r2 = 0
            r0.I$0 = r2
            r0.label = r3
            java.lang.Object r7 = r8.insertQueryChannels$stream_chat_android_client_release(r7, r0)
            if (r7 != r1) goto L6b
        L6a:
            return r1
        L6b:
            l83.a0 r7 = l83.C23454a0.f92919a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsLogic.addChannels(java.util.List, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object fetchPage(int i13, int i14, InterfaceC30057d<? super List<Channel>> interfaceC30057d) {
        C193231 c193231;
        QueryChannelsRequest queryChannelsRequest;
        if (interfaceC30057d instanceof C193231) {
            c193231 = (C193231) interfaceC30057d;
            int i15 = c193231.label;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                c193231.label = i15 - Integer.MIN_VALUE;
            } else {
                c193231 = new C193231(interfaceC30057d);
            }
        } else {
            c193231 = new C193231(interfaceC30057d);
        }
        Object objAwait = c193231.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i16 = c193231.label;
        if (i16 == 0) {
            AbstractC34132o.m107864I(objAwait);
            QueryChannelsIdentifier queryChannelsIdentifier = this.identifier;
            if (queryChannelsIdentifier instanceof QueryChannelsIdentifier.Standard) {
                queryChannelsRequest = new QueryChannelsRequest(((QueryChannelsIdentifier.Standard) queryChannelsIdentifier).getFilter(), i13, i14, ((QueryChannelsIdentifier.Standard) this.identifier).getSort(), new Integer(0), new Integer(0), null, null, null, 448, null);
            } else {
                if (!(queryChannelsIdentifier instanceof QueryChannelsIdentifier.Predefined)) {
                    throw new NoWhenBranchMatchedException();
                }
                queryChannelsRequest = new QueryChannelsRequest(((QueryChannelsIdentifier.Predefined) queryChannelsIdentifier).getName(), i14, (Map<String, ? extends Object>) ((QueryChannelsIdentifier.Predefined) this.identifier).getFilterValues(), (Map<String, ? extends Object>) ((QueryChannelsIdentifier.Predefined) this.identifier).getSortValues(), i13, new Integer(0), new Integer(0));
            }
            InterfaceC27474d interfaceC27474dQueryChannelsInternal = this.client.queryChannelsInternal(queryChannelsRequest);
            c193231.L$0 = null;
            c193231.I$0 = i13;
            c193231.I$1 = i14;
            c193231.label = 1;
            objAwait = interfaceC27474dQueryChannelsInternal.await(c193231);
            if (objAwait == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objAwait);
        }
        AbstractC26205h abstractC26205h = (AbstractC26205h) objAwait;
        if (abstractC26205h instanceof C26204g) {
            return ((QueryChannelsResult) ((C26204g) abstractC26205h).f103919a).getChannels();
        }
        if (abstractC26205h instanceof C26203f) {
            return C25271y.f99162w;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x008b  */
    /* JADX WARN: Code duplicated, block: B:23:0x009b  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e7 A[LOOP:0: B:29:0x00e1->B:31:0x00e7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0108  */
    /* JADX WARN: Code duplicated, block: B:37:0x0122 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x0123  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00c7 -> B:28:0x00cd). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object getRemoteCids(int r18, int r19, int r20, q83.InterfaceC30057d<? super java.util.HashSet<java.lang.String>> r21) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsLogic.getRemoteCids(int, int, int, q83.d):java.lang.Object");
    }

    private final void loadingPerPage(boolean isLoading, boolean hasOffset) {
        if (hasOffset) {
            this.queryChannelsStateLogic.setLoadingMore$stream_chat_android_client_release(isLoading);
        } else {
            this.queryChannelsStateLogic.setLoadingFirstPage$stream_chat_android_client_release(isLoading);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object onOnlineQueryResult(AbstractC26205h abstractC26205h, QueryChannelsRequest queryChannelsRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C193251 c193251;
        Set setM74103I1;
        if (interfaceC30057d instanceof C193251) {
            c193251 = (C193251) interfaceC30057d;
            int i13 = c193251.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c193251.label = i13 - Integer.MIN_VALUE;
            } else {
                c193251 = new C193251(interfaceC30057d);
            }
        } else {
            c193251 = new C193251(interfaceC30057d);
        }
        Object obj = c193251.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c193251.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            boolean z4 = abstractC26205h instanceof C26203f;
            this.queryChannelsStateLogic.setRecoveryNeeded$stream_chat_android_client_release(z4);
            if (abstractC26205h instanceof C26204g) {
                setM74103I1 = AbstractC25265s.m74103I1((Iterable) ((C26204g) abstractC26205h).f103919a);
                this.queryChannelsStateLogic.setEndOfChannels$stream_chat_android_client_release(setM74103I1.size() < queryChannelsRequest.getLimit());
                Set<Channel> set = setM74103I1;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(set, 10));
                for (Channel channel : set) {
                    arrayList.add(new ChannelConfig(channel.getType(), channel.getConfig()));
                }
                QueryChannelsDatabaseLogic queryChannelsDatabaseLogic = this.queryChannelsDatabaseLogic;
                c193251.L$0 = null;
                c193251.L$1 = null;
                c193251.L$2 = setM74103I1;
                c193251.L$3 = null;
                c193251.label = 1;
                if (queryChannelsDatabaseLogic.insertChannelConfigs$stream_chat_android_client_release(arrayList, c193251) != enumC31071a) {
                }
            }
            if (!z4) {
                throw new NoWhenBranchMatchedException();
            }
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.INFO;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "[onOnlineQueryResult] query with filter " + queryChannelsRequest.getFilter() + " failed; recovery needed", null);
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return c23454a0;
        }
        setM74103I1 = (Set) c193251.L$2;
        AbstractC34132o.m107864I(obj);
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
        String str2 = logger2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.INFO;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
            logger2.f9274b.log(enumC2341g2, str2, AbstractC2875y.m8296i(setM74103I1.size(), "[onOnlineQueryResult] api call returned ", " channels"), null);
        }
        c193251.L$0 = null;
        c193251.L$1 = null;
        c193251.L$2 = null;
        c193251.L$3 = null;
        c193251.label = 2;
        return this.queryChannelsDatabaseLogic.storeStateForChannels$stream_chat_android_client_release(setM74103I1, c193251) == enumC31071a ? enumC31071a : c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object removeChannels(List<String> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        boolean zIsEmpty = this.queryChannelsStateLogic.getQuerySpecs$stream_chat_android_client_release().getCids().isEmpty();
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (zIsEmpty) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "[removeChannels] skipping remove channels as they are not loaded yet.", null);
                return c23454a0;
            }
        } else {
            this.queryChannelsStateLogic.removeChannels$stream_chat_android_client_release(AbstractC25265s.m74103I1(list));
            Object objInsertQueryChannels$stream_chat_android_client_release = this.queryChannelsDatabaseLogic.insertQueryChannels$stream_chat_android_client_release(this.queryChannelsStateLogic.getQuerySpecs$stream_chat_android_client_release(), interfaceC30057d);
            if (objInsertQueryChannels$stream_chat_android_client_release == EnumC31071a.f128113w) {
                return objInsertQueryChannels$stream_chat_android_client_release;
            }
        }
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:59:0x0229  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x025f, code lost:
    
        if (addChannels(r12, r3) == r4) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateOnlineChannels(io.getstream.chat.android.client.api.models.QueryChannelsRequest r17, java.util.List<io.getstream.chat.android.models.Channel> r18, q83.InterfaceC30057d<? super l83.C23454a0> r19) {
        /*
            Method dump skipped, instruction units count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsLogic.updateOnlineChannels(io.getstream.chat.android.client.api.models.QueryChannelsRequest, java.util.List, q83.d):java.lang.Object");
    }

    public final Object addChannel$stream_chat_android_client_release(Channel channel, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objAddChannels = addChannels(AbstractC37056f.m118958J(channel), interfaceC30057d);
        return objAddChannels == EnumC31071a.f128113w ? objAddChannels : C23454a0.f92919a;
    }

    public final void applyResolvedSpec$stream_chat_android_client_release(FilterObject filter, QuerySorter<Channel> sort) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        this.queryChannelsStateLogic.applyResolvedSpec$stream_chat_android_client_release(filter, sort);
    }

    /* JADX INFO: renamed from: getIdentifier$stream_chat_android_client_release, reason: from getter */
    public final QueryChannelsIdentifier getIdentifier() {
        return this.identifier;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object onQueryChannelsResult(AbstractC26205h abstractC26205h, QueryChannelsRequest queryChannelsRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C193261 c193261;
        QueryChannelsRequest queryChannelsRequest2;
        if (interfaceC30057d instanceof C193261) {
            c193261 = (C193261) interfaceC30057d;
            int i13 = c193261.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c193261.label = i13 - Integer.MIN_VALUE;
            } else {
                c193261 = new C193261(interfaceC30057d);
            }
        } else {
            c193261 = new C193261(interfaceC30057d);
        }
        Object obj = c193261.result;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c193261.label;
        if (i14 != 0) {
            if (i14 == 1) {
                queryChannelsRequest = (QueryChannelsRequest) c193261.L$1;
                abstractC26205h = (AbstractC26205h) c193261.L$0;
                AbstractC34132o.m107864I(obj);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                queryChannelsRequest2 = (QueryChannelsRequest) c193261.L$1;
                AbstractC34132o.m107864I(obj);
            }
            queryChannelsRequest = queryChannelsRequest2;
            loadingPerPage(false, queryChannelsRequest.getOffset() > 0);
            return C23454a0.f92919a;
        }
        AbstractC34132o.m107864I(obj);
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[onQueryChannelsResult] result.isSuccess: " + (abstractC26205h instanceof C26204g) + ", request: " + queryChannelsRequest, null);
        }
        c193261.L$0 = abstractC26205h;
        c193261.L$1 = queryChannelsRequest;
        c193261.label = 1;
        if (onOnlineQueryResult(abstractC26205h, queryChannelsRequest, c193261) != obj2) {
        }
        return obj2;
        if (abstractC26205h instanceof C26204g) {
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
            String str2 = logger2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                logger2.f9274b.log(enumC2341g2, str2, AbstractC2875y.m8295h(((List) ((C26204g) abstractC26205h).f103919a).size(), "Number of returned channels: "), null);
            }
            List<Channel> list = (List) ((C26204g) abstractC26205h).f103919a;
            c193261.L$0 = null;
            c193261.L$1 = queryChannelsRequest;
            c193261.label = 2;
            if (updateOnlineChannels(queryChannelsRequest, list, c193261) != obj2) {
                queryChannelsRequest2 = queryChannelsRequest;
                queryChannelsRequest = queryChannelsRequest2;
            }
            return obj2;
        }
        this.queryChannelsStateLogic.initializeChannelsIfNeeded$stream_chat_android_client_release();
        loadingPerPage(false, queryChannelsRequest.getOffset() > 0);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0128  */
    /* JADX WARN: Code duplicated, block: B:52:0x0132  */
    /* JADX WARN: Code duplicated, block: B:53:0x0136  */
    /* JADX WARN: Code duplicated, block: B:55:0x0139  */
    /* JADX WARN: Code duplicated, block: B:56:0x0144  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object parseChatEventResults$stream_chat_android_client_release(List<? extends ChatEvent> list, InterfaceC30057d<? super List<? extends EventHandlingResult>> interfaceC30057d) {
        QueryChannelsLogic$parseChatEventResults$1 queryChannelsLogic$parseChatEventResults$1;
        Map mapM74000i0;
        Map map;
        LinkedHashMap linkedHashMapM73995d0;
        ArrayList arrayList;
        CidEvent cidEvent;
        Channel channel;
        if (interfaceC30057d instanceof QueryChannelsLogic$parseChatEventResults$1) {
            queryChannelsLogic$parseChatEventResults$1 = (QueryChannelsLogic$parseChatEventResults$1) interfaceC30057d;
            int i13 = queryChannelsLogic$parseChatEventResults$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                queryChannelsLogic$parseChatEventResults$1.label = i13 - Integer.MIN_VALUE;
            } else {
                queryChannelsLogic$parseChatEventResults$1 = new QueryChannelsLogic$parseChatEventResults$1(this, interfaceC30057d);
            }
        } else {
            queryChannelsLogic$parseChatEventResults$1 = new QueryChannelsLogic$parseChatEventResults$1(this, interfaceC30057d);
        }
        Object objSelectChannels$stream_chat_android_client_release = queryChannelsLogic$parseChatEventResults$1.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = queryChannelsLogic$parseChatEventResults$1.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objSelectChannels$stream_chat_android_client_release);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof CidEvent) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((CidEvent) it.next()).getCid());
            }
            List<String> listM74159y0 = AbstractC25265s.m74159y0(arrayList3);
            ArrayList arrayList4 = new ArrayList();
            for (String str : listM74159y0) {
                Channel activeChannelState$stream_chat_android_client_release = this.queryChannelsStateLogic.getActiveChannelState$stream_chat_android_client_release(str);
                C23465k c23465k = activeChannelState$stream_chat_android_client_release != null ? new C23465k(str, activeChannelState$stream_chat_android_client_release) : null;
                if (c23465k != null) {
                    arrayList4.add(c23465k);
                }
            }
            mapM74000i0 = AbstractC25247g0.m74000i0(arrayList4);
            List<String> listM74125c1 = AbstractC25265s.m74125c1(listM74159y0, mapM74000i0.keySet());
            if (listM74125c1.isEmpty()) {
                map = C25272z.f99163w;
            } else {
                QueryChannelsDatabaseLogic queryChannelsDatabaseLogic = this.queryChannelsDatabaseLogic;
                queryChannelsLogic$parseChatEventResults$1.L$0 = list;
                queryChannelsLogic$parseChatEventResults$1.L$1 = null;
                queryChannelsLogic$parseChatEventResults$1.L$2 = mapM74000i0;
                queryChannelsLogic$parseChatEventResults$1.L$3 = null;
                queryChannelsLogic$parseChatEventResults$1.label = 1;
                objSelectChannels$stream_chat_android_client_release = queryChannelsDatabaseLogic.selectChannels$stream_chat_android_client_release(listM74125c1, queryChannelsLogic$parseChatEventResults$1);
                if (objSelectChannels$stream_chat_android_client_release == enumC31071a) {
                    return enumC31071a;
                }
            }
            linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(mapM74000i0, map);
            List<? extends ChatEvent> list2 = list;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            for (ChatEvent chatEvent : list2) {
                if (chatEvent instanceof CidEvent) {
                    cidEvent = (CidEvent) chatEvent;
                } else {
                    cidEvent = null;
                }
                if (cidEvent != null) {
                    channel = (Channel) linkedHashMapM73995d0.get(cidEvent.getCid());
                } else {
                    channel = null;
                }
                arrayList.add(this.queryChannelsStateLogic.handleChatEvent$stream_chat_android_client_release(chatEvent, channel));
            }
            return arrayList;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Map map2 = (Map) queryChannelsLogic$parseChatEventResults$1.L$2;
        List<? extends ChatEvent> list3 = (List) queryChannelsLogic$parseChatEventResults$1.L$0;
        AbstractC34132o.m107864I(objSelectChannels$stream_chat_android_client_release);
        mapM74000i0 = map2;
        list = list3;
        Iterable iterable = (Iterable) objSelectChannels$stream_chat_android_client_release;
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(iterable, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Object obj2 : iterable) {
            linkedHashMap.put(((Channel) obj2).getCid(), obj2);
        }
        map = linkedHashMap;
        linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(mapM74000i0, map);
        List<? extends ChatEvent> list4 = list;
        arrayList = new ArrayList(AbstractC25267u.m74163i0(list4, 10));
        while (r11.hasNext()) {
            if (chatEvent instanceof CidEvent) {
                cidEvent = (CidEvent) chatEvent;
            } else {
                cidEvent = null;
            }
            if (cidEvent != null) {
                channel = (Channel) linkedHashMapM73995d0.get(cidEvent.getCid());
            } else {
                channel = null;
            }
            arrayList.add(this.queryChannelsStateLogic.handleChatEvent$stream_chat_android_client_release(chatEvent, channel));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object queryFirstPage$stream_chat_android_client_release(InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        QueryChannelsLogic$queryFirstPage$1 queryChannelsLogic$queryFirstPage$1;
        QueryChannelsRequest queryChannelsRequest;
        QueryChannelsRequest queryChannelsRequest2;
        PredefinedFilter predefinedFilter;
        if (interfaceC30057d instanceof QueryChannelsLogic$queryFirstPage$1) {
            queryChannelsLogic$queryFirstPage$1 = (QueryChannelsLogic$queryFirstPage$1) interfaceC30057d;
            int i13 = queryChannelsLogic$queryFirstPage$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                queryChannelsLogic$queryFirstPage$1.label = i13 - Integer.MIN_VALUE;
            } else {
                queryChannelsLogic$queryFirstPage$1 = new QueryChannelsLogic$queryFirstPage$1(this, interfaceC30057d);
            }
        } else {
            queryChannelsLogic$queryFirstPage$1 = new QueryChannelsLogic$queryFirstPage$1(this, interfaceC30057d);
        }
        Object objAwait = queryChannelsLogic$queryFirstPage$1.result;
        Object obj = EnumC31071a.f128113w;
        int i14 = queryChannelsLogic$queryFirstPage$1.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objAwait);
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "[queryFirstPage] no args", null);
            }
            QueryChannelsRequest queryChannelsRequest3 = (QueryChannelsRequest) ((QueryChannelsMutableState) this.queryChannelsStateLogic.getState$stream_chat_android_client_release()).getCurrentRequest().getValue();
            Integer messageLimit = queryChannelsRequest3 != null ? queryChannelsRequest3.getMessageLimit() : null;
            Integer memberLimit = queryChannelsRequest3 != null ? queryChannelsRequest3.getMemberLimit() : null;
            QueryChannelsIdentifier queryChannelsIdentifier = this.identifier;
            if (queryChannelsIdentifier instanceof QueryChannelsIdentifier.Standard) {
                queryChannelsRequest = new QueryChannelsRequest(((QueryChannelsIdentifier.Standard) queryChannelsIdentifier).getFilter(), 0, 30, ((QueryChannelsIdentifier.Standard) this.identifier).getSort(), messageLimit, memberLimit, null, null, null, 448, null);
            } else {
                Integer num = messageLimit;
                Integer num2 = memberLimit;
                if (!(queryChannelsIdentifier instanceof QueryChannelsIdentifier.Predefined)) {
                    throw new NoWhenBranchMatchedException();
                }
                queryChannelsRequest = new QueryChannelsRequest(((QueryChannelsIdentifier.Predefined) queryChannelsIdentifier).getName(), 30, (Map<String, ? extends Object>) ((QueryChannelsIdentifier.Predefined) this.identifier).getFilterValues(), (Map<String, ? extends Object>) ((QueryChannelsIdentifier.Predefined) this.identifier).getSortValues(), 0, num, num2);
            }
            queryChannelsRequest2 = queryChannelsRequest;
            this.queryChannelsStateLogic.setCurrentRequest$stream_chat_android_client_release(queryChannelsRequest2);
            InterfaceC27474d interfaceC27474dQueryChannelsInternal = this.client.queryChannelsInternal(queryChannelsRequest2);
            queryChannelsLogic$queryFirstPage$1.L$0 = null;
            queryChannelsLogic$queryFirstPage$1.L$1 = null;
            queryChannelsLogic$queryFirstPage$1.L$2 = null;
            queryChannelsLogic$queryFirstPage$1.L$3 = queryChannelsRequest2;
            queryChannelsLogic$queryFirstPage$1.label = 1;
            objAwait = interfaceC27474dQueryChannelsInternal.await(queryChannelsLogic$queryFirstPage$1);
            if (objAwait != obj) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC26205h abstractC26205h = (AbstractC26205h) queryChannelsLogic$queryFirstPage$1.L$5;
            AbstractC34132o.m107864I(objAwait);
            return abstractC26205h;
        }
        queryChannelsRequest2 = (QueryChannelsRequest) queryChannelsLogic$queryFirstPage$1.L$3;
        AbstractC34132o.m107864I(objAwait);
        AbstractC26205h c26204g = (AbstractC26205h) objAwait;
        boolean z4 = c26204g instanceof C26204g;
        if (z4 && (predefinedFilter = ((QueryChannelsResult) ((C26204g) c26204g).f103919a).getPredefinedFilter()) != null) {
            applyResolvedSpec$stream_chat_android_client_release(predefinedFilter.getFilter(), predefinedFilter.getSort());
        }
        if (z4) {
            c26204g = new C26204g(((QueryChannelsResult) ((C26204g) c26204g).f103919a).getChannels());
        } else if (!(c26204g instanceof C26203f)) {
            throw new NoWhenBranchMatchedException();
        }
        queryChannelsLogic$queryFirstPage$1.L$0 = null;
        queryChannelsLogic$queryFirstPage$1.L$1 = null;
        queryChannelsLogic$queryFirstPage$1.L$2 = null;
        queryChannelsLogic$queryFirstPage$1.L$3 = null;
        queryChannelsLogic$queryFirstPage$1.L$4 = null;
        queryChannelsLogic$queryFirstPage$1.L$5 = c26204g;
        queryChannelsLogic$queryFirstPage$1.label = 2;
        return onQueryChannelsResult(c26204g, queryChannelsRequest2, queryChannelsLogic$queryFirstPage$1) == obj ? obj : c26204g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bf, code lost:
    
        if (addChannels(r12, r0) == r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsLogic] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object queryOffline$stream_chat_android_client_release(io.getstream.chat.android.client.query.pagination.AnyChannelPaginationRequest r11, q83.InterfaceC30057d<? super l83.C23454a0> r12) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsLogic.queryOffline$stream_chat_android_client_release(io.getstream.chat.android.client.query.pagination.AnyChannelPaginationRequest, q83.d):java.lang.Object");
    }

    public final InterfaceC13037f2 recoveryNeeded$stream_chat_android_client_release() {
        return ((QueryChannelsMutableState) this.queryChannelsStateLogic.getState$stream_chat_android_client_release()).getRecoveryNeeded();
    }

    public final void refreshAllChannelsState$stream_chat_android_client_release() {
        refreshChannelsState$stream_chat_android_client_release(this.queryChannelsStateLogic.getQuerySpecs$stream_chat_android_client_release().getCids());
    }

    public final void refreshChannelState$stream_chat_android_client_release(String cid) {
        AbstractC22676k.m65750j(cid, "cid");
        refreshChannelsState$stream_chat_android_client_release(AbstractC37056f.m118958J(cid));
    }

    public final void refreshChannelsState$stream_chat_android_client_release(Collection<String> cidList) {
        AbstractC22676k.m65750j(cidList, "cidList");
        this.queryChannelsStateLogic.refreshChannels$stream_chat_android_client_release(cidList);
    }

    public final void refreshMembersStateForUser$stream_chat_android_client_release(User newUser) {
        AbstractC22676k.m65750j(newUser, "newUser");
        this.queryChannelsStateLogic.refreshMembersStateForUser$stream_chat_android_client_release(newUser);
    }

    public final Object removeChannel$stream_chat_android_client_release(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objRemoveChannels = removeChannels(AbstractC37056f.m118958J(str), interfaceC30057d);
        return objRemoveChannels == EnumC31071a.f128113w ? objRemoveChannels : C23454a0.f92919a;
    }

    public final void setCurrentRequest$stream_chat_android_client_release(QueryChannelsRequest request) {
        AbstractC22676k.m65750j(request, "request");
        this.queryChannelsStateLogic.setCurrentRequest$stream_chat_android_client_release(request);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object watchAndAddChannel$stream_chat_android_client_release(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        QueryChannelsLogic$watchAndAddChannel$1 queryChannelsLogic$watchAndAddChannel$1;
        if (interfaceC30057d instanceof QueryChannelsLogic$watchAndAddChannel$1) {
            queryChannelsLogic$watchAndAddChannel$1 = (QueryChannelsLogic$watchAndAddChannel$1) interfaceC30057d;
            int i13 = queryChannelsLogic$watchAndAddChannel$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                queryChannelsLogic$watchAndAddChannel$1.label = i13 - Integer.MIN_VALUE;
            } else {
                queryChannelsLogic$watchAndAddChannel$1 = new QueryChannelsLogic$watchAndAddChannel$1(this, interfaceC30057d);
            }
        } else {
            queryChannelsLogic$watchAndAddChannel$1 = new QueryChannelsLogic$watchAndAddChannel$1(this, interfaceC30057d);
        }
        Object objAwait = queryChannelsLogic$watchAndAddChannel$1.result;
        Object obj = EnumC31071a.f128113w;
        int i14 = queryChannelsLogic$watchAndAddChannel$1.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objAwait);
            InterfaceC27474d interfaceC27474dWatch = this.client.channel(str).watch();
            queryChannelsLogic$watchAndAddChannel$1.L$0 = null;
            queryChannelsLogic$watchAndAddChannel$1.label = 1;
            objAwait = interfaceC27474dWatch.await(queryChannelsLogic$watchAndAddChannel$1);
            if (objAwait != obj) {
            }
            return obj;
        }
        if (i14 == 1) {
            AbstractC34132o.m107864I(objAwait);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objAwait);
        }
        return c23454a0;
        AbstractC26205h abstractC26205h = (AbstractC26205h) objAwait;
        if (abstractC26205h instanceof C26204g) {
            Channel channel = (Channel) ((C26204g) abstractC26205h).f103919a;
            queryChannelsLogic$watchAndAddChannel$1.L$0 = null;
            queryChannelsLogic$watchAndAddChannel$1.L$1 = null;
            queryChannelsLogic$watchAndAddChannel$1.label = 2;
            if (addChannel$stream_chat_android_client_release(channel, queryChannelsLogic$watchAndAddChannel$1) == obj) {
                return obj;
            }
        }
        return c23454a0;
    }
}
