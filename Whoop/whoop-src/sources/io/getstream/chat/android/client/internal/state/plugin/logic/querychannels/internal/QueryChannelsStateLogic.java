package io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal;

import androidx.core.app.NotificationCompat;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.InterfaceC2994c0;
import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.api.event.EventHandlingResult;
import io.getstream.chat.android.client.api.models.QueryChannelsRequest;
import io.getstream.chat.android.client.api.state.QueryChannelsState;
import io.getstream.chat.android.client.api.state.StateRegistry;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.extensions.StringExtensionsKt;
import io.getstream.chat.android.client.extensions.internal.ChannelKt;
import io.getstream.chat.android.client.extensions.internal.PairKt;
import io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry;
import io.getstream.chat.android.client.internal.state.plugin.state.querychannels.internal.QueryChannelsMutableState;
import io.getstream.chat.android.client.query.QueryChannelsSpec;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23465k;
import l83.InterfaceC23462h;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\f*\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\f*\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ!\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010$\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\f\u0018\u00010 H\u0000¢\u0006\u0004\b\"\u0010#J\u000f\u0010(\u001a\u00020%H\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010,\u001a\u00020)H\u0000¢\u0006\u0004\b*\u0010+J\u0017\u00100\u001a\u00020-2\u0006\u0010\u001b\u001a\u00020\u0018H\u0000¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020-2\u0006\u0010\u001b\u001a\u00020\u0018H\u0000¢\u0006\u0004\b1\u0010/J\u0017\u00107\u001a\u00020-2\u0006\u00104\u001a\u000203H\u0000¢\u0006\u0004\b5\u00106J%\u0010>\u001a\u00020-2\u0006\u00109\u001a\u0002082\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\f0:H\u0000¢\u0006\u0004\b<\u0010=J\u0017\u0010A\u001a\u00020-2\u0006\u0010?\u001a\u00020\u0018H\u0000¢\u0006\u0004\b@\u0010/J\u0017\u0010D\u001a\u00020-2\u0006\u0010B\u001a\u00020\u0018H\u0000¢\u0006\u0004\bC\u0010/J\u0017\u0010H\u001a\u00020-2\u0006\u0010E\u001a\u00020\u001cH\u0000¢\u0006\u0004\bF\u0010GJ\u0017\u0010K\u001a\u00020-2\u0006\u0010I\u001a\u00020\u001cH\u0000¢\u0006\u0004\bJ\u0010GJ\u001e\u0010P\u001a\u00020-2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\f0LH\u0080@¢\u0006\u0004\bN\u0010OJ\u001d\u0010U\u001a\u00020-2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020!0QH\u0000¢\u0006\u0004\bS\u0010TJ\u000f\u0010X\u001a\u00020-H\u0000¢\u0006\u0004\bV\u0010WJ\u001d\u0010]\u001a\u00020-2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020!0YH\u0000¢\u0006\u0004\b[\u0010\\J\u0019\u0010a\u001a\u0004\u0018\u00010\f2\u0006\u0010^\u001a\u00020!H\u0000¢\u0006\u0004\b_\u0010`J\u0017\u0010f\u001a\u00020-2\u0006\u0010c\u001a\u00020bH\u0000¢\u0006\u0004\bd\u0010eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010gR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010hR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010iR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010jR\u001b\u0010p\u001a\u00020k8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o¨\u0006q"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;", "", "Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;", "mutableState", "Lio/getstream/chat/android/client/api/state/StateRegistry;", "stateRegistry", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "logicRegistry", "Lbc3/c0;", "coroutineScope", "<init>", "(Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;Lio/getstream/chat/android/client/api/state/StateRegistry;Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lbc3/c0;)V", "Lio/getstream/chat/android/models/Channel;", "existingChannel", "joinMessages", "(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/Channel;", "joinMembers", "Lio/getstream/chat/android/client/events/ChatEvent;", NotificationCompat.CATEGORY_EVENT, "cachedChannel", "Lio/getstream/chat/android/client/api/event/EventHandlingResult;", "handleChatEvent$stream_chat_android_client_release", "(Lio/getstream/chat/android/client/events/ChatEvent;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;", "handleChatEvent", "", "isLoading$stream_chat_android_client_release", "()Z", "isLoading", "", "getChannelsOffset$stream_chat_android_client_release", "()I", "getChannelsOffset", "", "", "getChannels$stream_chat_android_client_release", "()Ljava/util/Map;", "getChannels", "Lio/getstream/chat/android/client/query/QueryChannelsSpec;", "getQuerySpecs$stream_chat_android_client_release", "()Lio/getstream/chat/android/client/query/QueryChannelsSpec;", "getQuerySpecs", "Lio/getstream/chat/android/client/api/state/QueryChannelsState;", "getState$stream_chat_android_client_release", "()Lio/getstream/chat/android/client/api/state/QueryChannelsState;", "getState", "Ll83/a0;", "setLoadingMore$stream_chat_android_client_release", "(Z)V", "setLoadingMore", "setLoadingFirstPage$stream_chat_android_client_release", "setLoadingFirstPage", "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;", "request", "setCurrentRequest$stream_chat_android_client_release", "(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)V", "setCurrentRequest", "Lio/getstream/chat/android/models/FilterObject;", "filter", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "sort", "applyResolvedSpec$stream_chat_android_client_release", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)V", "applyResolvedSpec", "isEnd", "setEndOfChannels$stream_chat_android_client_release", "setEndOfChannels", "recoveryNeeded", "setRecoveryNeeded$stream_chat_android_client_release", "setRecoveryNeeded", MapboxMap.QFE_OFFSET, "setChannelsOffset$stream_chat_android_client_release", "(I)V", "setChannelsOffset", "size", "incrementChannelsOffset$stream_chat_android_client_release", "incrementChannelsOffset", "", "channels", "addChannelsState$stream_chat_android_client_release", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "addChannelsState", "", "cidSet", "removeChannels$stream_chat_android_client_release", "(Ljava/util/Set;)V", "removeChannels", "initializeChannelsIfNeeded$stream_chat_android_client_release", "()V", "initializeChannelsIfNeeded", "", "cidList", "refreshChannels$stream_chat_android_client_release", "(Ljava/util/Collection;)V", "refreshChannels", "cid", "getActiveChannelState$stream_chat_android_client_release", "(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;", "getActiveChannelState", "Lio/getstream/chat/android/models/User;", "newUser", "refreshMembersStateForUser$stream_chat_android_client_release", "(Lio/getstream/chat/android/models/User;)V", "refreshMembersStateForUser", "Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;", "Lio/getstream/chat/android/client/api/state/StateRegistry;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "Lbc3/c0;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QueryChannelsStateLogic {
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final LogicRegistry logicRegistry;
    private final QueryChannelsMutableState mutableState;
    private final StateRegistry stateRegistry;

    public QueryChannelsStateLogic(QueryChannelsMutableState mutableState, StateRegistry stateRegistry, LogicRegistry logicRegistry, InterfaceC2994c0 coroutineScope) {
        AbstractC22676k.m65750j(mutableState, "mutableState");
        AbstractC22676k.m65750j(stateRegistry, "stateRegistry");
        AbstractC22676k.m65750j(logicRegistry, "logicRegistry");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.mutableState = mutableState;
        this.stateRegistry = stateRegistry;
        this.logicRegistry = logicRegistry;
        this.coroutineScope = coroutineScope;
        this.logger = AbstractC1772c1.m5382S(this, "QueryChannelsStateLogic");
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final Channel joinMembers(Channel channel, Channel channel2) {
        Collection collectionValues;
        if (channel2 != null) {
            List<Member> members = channel.getMembers();
            int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(members, 10));
            if (iM73988W < 16) {
                iM73988W = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
            for (Object obj : members) {
                linkedHashMap.put(((Member) obj).getUserId(), obj);
            }
            List<Member> members2 = channel2.getMembers();
            int iM73988W2 = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(members2, 10));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM73988W2 >= 16 ? iM73988W2 : 16);
            for (Object obj2 : members2) {
                linkedHashMap2.put(((Member) obj2).getUserId(), obj2);
            }
            LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(linkedHashMap, linkedHashMap2);
            if (linkedHashMapM73995d0.size() > channel.getMemberCount()) {
                linkedHashMapM73995d0 = null;
            }
            Channel channelCopy$default = Channel.copy$default(channel, null, null, null, null, 0, false, null, null, null, null, 0, null, (linkedHashMapM73995d0 == null || (collectionValues = linkedHashMapM73995d0.values()) == null) ? channel.getMembers() : AbstractC25265s.m74093D1(collectionValues), null, null, null, null, 0, null, null, null, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, -4097, 7, null);
            if (channelCopy$default != null) {
                return channelCopy$default;
            }
        }
        return channel;
    }

    private final Channel joinMessages(Channel channel, Channel channel2) {
        List<Message> messages;
        if (channel2 == null || (messages = channel2.getMessages()) == null) {
            messages = C25271y.f99162w;
        }
        ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(messages, channel.getMessages());
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM74129g1) {
            if (hashSet.add(((Message) obj).getId())) {
                arrayList.add(obj);
            }
        }
        return Channel.copy$default(channel, null, null, null, null, 0, false, null, null, null, null, 0, arrayList, null, null, null, null, null, 0, null, null, null, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, -2049, 7, null);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0136  */
    /* JADX WARN: Code duplicated, block: B:38:0x015c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x015d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x015d -> B:40:0x015e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object addChannelsState$stream_chat_android_client_release(java.util.List<io.getstream.chat.android.models.Channel> r14, q83.InterfaceC30057d<? super l83.C23454a0> r15) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsStateLogic.addChannelsState$stream_chat_android_client_release(java.util.List, q83.d):java.lang.Object");
    }

    public final void applyResolvedSpec$stream_chat_android_client_release(FilterObject filter, QuerySorter<Channel> sort) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        this.mutableState.applyResolvedSpec(filter, sort);
    }

    public final Channel getActiveChannelState$stream_chat_android_client_release(String cid) {
        AbstractC22676k.m65750j(cid, "cid");
        C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(cid);
        String str = (String) c23465kCidToTypeAndId.f92937w;
        String str2 = (String) c23465kCidToTypeAndId.f92938x;
        if (this.stateRegistry.isActiveChannel$stream_chat_android_client_release(str, str2)) {
            return this.stateRegistry.channel(str, str2).toChannel();
        }
        return null;
    }

    public final Map<String, Channel> getChannels$stream_chat_android_client_release() {
        return this.mutableState.getRawChannels$stream_chat_android_client_release();
    }

    public final int getChannelsOffset$stream_chat_android_client_release() {
        return ((Number) this.mutableState.getChannelsOffset().getValue()).intValue();
    }

    public final QueryChannelsSpec getQuerySpecs$stream_chat_android_client_release() {
        return this.mutableState.get_querySpec();
    }

    public final QueryChannelsState getState$stream_chat_android_client_release() {
        return this.mutableState;
    }

    public final EventHandlingResult handleChatEvent$stream_chat_android_client_release(ChatEvent event, Channel cachedChannel) {
        AbstractC22676k.m65750j(event, "event");
        return this.mutableState.handleChatEvent(event, cachedChannel);
    }

    public final void incrementChannelsOffset$stream_chat_android_client_release(int size) {
        int iIntValue = ((Number) this.mutableState.getChannelsOffset().getValue()).intValue();
        int i13 = size + iIntValue;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC2875y.m8294g(i13, iIntValue, "[updateOnlineChannels] newChannelsOffset: ", " <= "), null);
        }
        this.mutableState.setChannelsOffset(i13);
    }

    public final void initializeChannelsIfNeeded$stream_chat_android_client_release() {
        if (this.mutableState.getRawChannels$stream_chat_android_client_release() == null) {
            this.mutableState.setChannels(C25272z.f99163w);
        }
    }

    public final boolean isLoading$stream_chat_android_client_release() {
        return ((Boolean) this.mutableState.getCurrentLoading$stream_chat_android_client_release().getValue()).booleanValue();
    }

    public final void refreshChannels$stream_chat_android_client_release(Collection<String> cidList) {
        AbstractC22676k.m65750j(cidList, "cidList");
        Map<String, Channel> rawChannels$stream_chat_android_client_release = this.mutableState.getRawChannels$stream_chat_android_client_release();
        if (rawChannels$stream_chat_android_client_release == null) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "[refreshChannels] rejected (existingChannels is null)", null);
                return;
            }
            return;
        }
        LinkedHashSet linkedHashSetM74106K0 = AbstractC25265s.m74106K0(this.mutableState.get_querySpec().getCids(), AbstractC25265s.m74103I1(cidList));
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(linkedHashSetM74106K0, 10));
        Iterator it = linkedHashSetM74106K0.iterator();
        while (it.hasNext()) {
            arrayList.add(StringExtensionsKt.cidToTypeAndId((String) it.next()));
        }
        ArrayList<C23465k> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C23465k c23465k = (C23465k) obj;
            if (this.stateRegistry.isActiveChannel$stream_chat_android_client_release((String) c23465k.f92937w, (String) c23465k.f92938x)) {
                arrayList2.add(obj);
            }
        }
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(arrayList2, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (C23465k c23465k2 : arrayList2) {
            String str2 = (String) c23465k2.f92937w;
            String str3 = (String) c23465k2.f92938x;
            linkedHashMap.put(PairKt.toCid(new C23465k(str2, str3)), this.stateRegistry.channel(str2, str3).toChannel());
        }
        this.mutableState.setChannels(AbstractC25247g0.m73995d0(rawChannels$stream_chat_android_client_release, linkedHashMap));
    }

    public final void refreshMembersStateForUser$stream_chat_android_client_release(User newUser) {
        AbstractC22676k.m65750j(newUser, "newUser");
        String id4 = newUser.getId();
        Map<String, Channel> rawChannels$stream_chat_android_client_release = this.mutableState.getRawChannels$stream_chat_android_client_release();
        if (rawChannels$stream_chat_android_client_release == null) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "[refreshMembersStateForUser] rejected (existingChannels is null)", null);
                return;
            }
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Channel> entry : rawChannels$stream_chat_android_client_release.entrySet()) {
            ArrayList arrayList = (ArrayList) ChannelKt.users(entry.getValue());
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (AbstractC22676k.m65745e(((User) it.next()).getId(), id4)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                        break;
                    }
                }
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC25247g0.m73988W(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Channel channel = (Channel) entry2.getValue();
            List<Member> members = channel.getMembers();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(members, 10));
            for (Member member : members) {
                User user = member.getUser();
                if (AbstractC22676k.m65745e(user.getId(), id4)) {
                    user = null;
                }
                arrayList2.add(member.copy((32766 & 1) != 0 ? member.user : user == null ? newUser : user, (32766 & 2) != 0 ? member.createdAt : null, (32766 & 4) != 0 ? member.updatedAt : null, (32766 & 8) != 0 ? member.isInvited : null, (32766 & 16) != 0 ? member.inviteAcceptedAt : null, (32766 & 32) != 0 ? member.inviteRejectedAt : null, (32766 & 64) != 0 ? member.shadowBanned : false, (32766 & 128) != 0 ? member.banned : false, (32766 & 256) != 0 ? member.channelRole : null, (32766 & 512) != 0 ? member.notificationsMuted : null, (32766 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? member.status : null, (32766 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? member.banExpires : null, (32766 & 4096) != 0 ? member.pinnedAt : null, (32766 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? member.archivedAt : null, (32766 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? member.extraData : null));
            }
            linkedHashMap2.put(key, Channel.copy$default(channel, null, null, null, null, 0, false, null, null, null, null, 0, null, arrayList2, null, null, null, null, 0, null, null, null, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, -4097, 7, null));
        }
        this.mutableState.setChannels(AbstractC25247g0.m73995d0(rawChannels$stream_chat_android_client_release, linkedHashMap2));
    }

    public final void removeChannels$stream_chat_android_client_release(Set<String> cidSet) {
        AbstractC22676k.m65750j(cidSet, "cidSet");
        Map<String, Channel> rawChannels$stream_chat_android_client_release = this.mutableState.getRawChannels$stream_chat_android_client_release();
        if (rawChannels$stream_chat_android_client_release != null) {
            QueryChannelsMutableState queryChannelsMutableState = this.mutableState;
            Set<String> set = cidSet;
            queryChannelsMutableState.setCids(AbstractC12350b.m34605z(queryChannelsMutableState.get_querySpec().getCids(), set));
            this.mutableState.setChannels(AbstractC25247g0.m73992a0(rawChannels$stream_chat_android_client_release, set));
            return;
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.WARN;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[removeChannels] rejected (existingChannels is null)", null);
        }
    }

    public final void setChannelsOffset$stream_chat_android_client_release(int offset) {
        this.mutableState.setChannelsOffset(offset);
    }

    public final void setCurrentRequest$stream_chat_android_client_release(QueryChannelsRequest request) {
        AbstractC22676k.m65750j(request, "request");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[onQueryChannelsRequest] request: " + request, null);
        }
        this.mutableState.setCurrentRequest(request);
    }

    public final void setEndOfChannels$stream_chat_android_client_release(boolean isEnd) {
        this.mutableState.setEndOfChannels(isEnd);
    }

    public final void setLoadingFirstPage$stream_chat_android_client_release(boolean isLoading) {
        this.mutableState.setLoadingFirstPage(isLoading);
    }

    public final void setLoadingMore$stream_chat_android_client_release(boolean isLoading) {
        this.mutableState.setLoadingMore(isLoading);
    }

    public final void setRecoveryNeeded$stream_chat_android_client_release(boolean recoveryNeeded) {
        this.mutableState.setRecoveryNeeded(recoveryNeeded);
    }
}
