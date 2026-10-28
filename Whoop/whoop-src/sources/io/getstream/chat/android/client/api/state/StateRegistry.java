package io.getstream.chat.android.client.api.state;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4339a;
import ec3.AbstractC13091v;
import ec3.InterfaceC13037f2;
import io.getstream.chat.android.client.api.ChannelMessageLimit;
import io.getstream.chat.android.client.api.MessageLimitConfig;
import io.getstream.chat.android.client.channel.state.ChannelState;
import io.getstream.chat.android.client.events.ChannelDeletedEvent;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.events.NotificationChannelDeletedEvent;
import io.getstream.chat.android.client.internal.state.event.handler.internal.batch.BatchEvent;
import io.getstream.chat.android.client.internal.state.plugin.QueryChannelsIdentifier;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateImpl;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateLegacyImpl;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.thread.internal.ThreadMutableState;
import io.getstream.chat.android.client.internal.state.plugin.state.querychannels.internal.QueryChannelsMutableState;
import io.getstream.chat.android.client.internal.state.plugin.state.querythreads.internal.QueryThreadsMutableState;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Filters;
import io.getstream.chat.android.models.Thread;
import io.getstream.chat.android.models.querysort.QuerySortByField;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import l83.C23454a0;
import l83.C23465k;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u008d\u0001\b\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00050\u0002\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\b0\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\u001f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!¢\u0006\u0004\b%\u0010&J\u0017\u0010%\u001a\u00020$2\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b%\u0010)J\u001d\u0010+\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b+\u0010,J\u001f\u00100\u001a\u00020-2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b.\u0010/J\u001f\u00104\u001a\u0002012\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b2\u00103J\u001f\u00107\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b5\u00106J'\u0010<\u001a\u0002092\b\u0010 \u001a\u0004\u0018\u00010\u001f2\f\u0010#\u001a\b\u0012\u0004\u0012\u0002080!H\u0000¢\u0006\u0004\b:\u0010;J'\u0010@\u001a\u00020=2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\f\u0010#\u001a\b\u0012\u0004\u0012\u0002080!H\u0000¢\u0006\u0004\b>\u0010?J\u0015\u0010C\u001a\u00020B2\u0006\u0010A\u001a\u00020\u0006¢\u0006\u0004\bC\u0010DJ\u0017\u0010H\u001a\u00020E2\u0006\u0010A\u001a\u00020\u0006H\u0000¢\u0006\u0004\bF\u0010GJ\u0015\u0010K\u001a\b\u0012\u0004\u0012\u00020*0\bH\u0000¢\u0006\u0004\bI\u0010JJ\r\u0010L\u001a\u00020\u001c¢\u0006\u0004\bL\u0010MJ\u0017\u0010R\u001a\u00020\u001c2\u0006\u0010O\u001a\u00020NH\u0000¢\u0006\u0004\bP\u0010QR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010SR(\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00050\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010SR \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010SR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010TR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010UR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010VR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010WR \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010SR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010XR\u001b\u0010^\u001a\u00020Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020`0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010aR,\u0010c\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060b\u0012\u0004\u0012\u00020-0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010aR,\u0010d\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060b\u0012\u0004\u0012\u0002010_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010aR4\u0010<\u001a\"\u0012\u0018\u0012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u0002080!0b\u0012\u0004\u0012\u00020=0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010aR \u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020E0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010a¨\u0006f"}, m65681d2 = {"Lio/getstream/chat/android/client/api/state/StateRegistry;", "", "Lec3/f2;", "Lio/getstream/chat/android/models/User;", "userStateFlow", "", "", "latestUsers", "", "Lio/getstream/chat/android/models/Location;", "activeLiveLocations", "Lbc3/k1;", "job", "Lkotlin/Function0;", "", "now", "Lbc3/c0;", "scope", "Lio/getstream/chat/android/client/api/MessageLimitConfig;", "messageLimitConfig", "Lio/getstream/chat/android/models/Mute;", "mutedUsers", "", "useLegacyChannelState", "<init>", "(Lec3/f2;Lec3/f2;Lec3/f2;Lbc3/k1;Lc93/a;Lbc3/c0;Lio/getstream/chat/android/client/api/MessageLimitConfig;Lec3/f2;Z)V", "channelType", "channelId", "Ll83/a0;", "removeChanel", "(Ljava/lang/String;Ljava/lang/String;)V", "Lio/getstream/chat/android/models/FilterObject;", "filter", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/Channel;", "sort", "Lio/getstream/chat/android/client/api/state/QueryChannelsState;", "queryChannels", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lio/getstream/chat/android/client/api/state/QueryChannelsState;", "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;", "identifier", "(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;)Lio/getstream/chat/android/client/api/state/QueryChannelsState;", "Lio/getstream/chat/android/client/channel/state/ChannelState;", "channel", "(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/channel/state/ChannelState;", "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;", "legacyChannelState$stream_chat_android_client_release", "(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;", "legacyChannelState", "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;", "channelState$stream_chat_android_client_release", "(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;", "channelState", "isActiveChannel$stream_chat_android_client_release", "(Ljava/lang/String;Ljava/lang/String;)Z", "isActiveChannel", "Lio/getstream/chat/android/models/Thread;", "Lio/getstream/chat/android/client/api/state/QueryThreadsState;", "queryThreads$stream_chat_android_client_release", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lio/getstream/chat/android/client/api/state/QueryThreadsState;", "queryThreads", "Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;", "mutableQueryThreads$stream_chat_android_client_release", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;", "mutableQueryThreads", "messageId", "Lio/getstream/chat/android/client/api/state/ThreadState;", "thread", "(Ljava/lang/String;)Lio/getstream/chat/android/client/api/state/ThreadState;", "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;", "mutableThread$stream_chat_android_client_release", "(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;", "mutableThread", "getActiveChannelStates$stream_chat_android_client_release", "()Ljava/util/List;", "getActiveChannelStates", "clear", "()V", "Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;", "batchEvent", "handleBatchEvent$stream_chat_android_client_release", "(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;)V", "handleBatchEvent", "Lec3/f2;", "Lbc3/k1;", "Lc93/a;", "Lbc3/c0;", "Lio/getstream/chat/android/client/api/MessageLimitConfig;", "Z", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Ljava/util/concurrent/ConcurrentHashMap;", "Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ll83/k;", "legacyChannels", "channels", "threads", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StateRegistry {
    private final InterfaceC13037f2 activeLiveLocations;
    private final ConcurrentHashMap<C23465k, ChannelStateImpl> channels;
    private final InterfaceC3027k1 job;
    private InterfaceC13037f2 latestUsers;
    private final ConcurrentHashMap<C23465k, ChannelStateLegacyImpl> legacyChannels;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final MessageLimitConfig messageLimitConfig;
    private final InterfaceC13037f2 mutedUsers;
    private final InterfaceC4339a now;
    private final ConcurrentHashMap<QueryChannelsIdentifier, QueryChannelsMutableState> queryChannels;
    private final ConcurrentHashMap<C23465k, QueryThreadsMutableState> queryThreads;
    private final InterfaceC2994c0 scope;
    private final ConcurrentHashMap<String, ThreadMutableState> threads;
    private final boolean useLegacyChannelState;
    private final InterfaceC13037f2 userStateFlow;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StateRegistry(InterfaceC13037f2 userStateFlow, InterfaceC13037f2 latestUsers, InterfaceC13037f2 activeLiveLocations, InterfaceC3027k1 job, InterfaceC4339a now, InterfaceC2994c0 scope, MessageLimitConfig messageLimitConfig) {
        this(userStateFlow, latestUsers, activeLiveLocations, job, now, scope, messageLimitConfig, null, false, 384, null);
        AbstractC22676k.m65750j(userStateFlow, "userStateFlow");
        AbstractC22676k.m65750j(latestUsers, "latestUsers");
        AbstractC22676k.m65750j(activeLiveLocations, "activeLiveLocations");
        AbstractC22676k.m65750j(job, "job");
        AbstractC22676k.m65750j(now, "now");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(messageLimitConfig, "messageLimitConfig");
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    private final void removeChanel(String channelType, String channelId) {
        boolean z4 = this.useLegacyChannelState;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (z4) {
            ChannelStateLegacyImpl channelStateLegacyImplRemove = this.legacyChannels.remove(new C23465k(channelType, channelId));
            if (channelStateLegacyImplRemove != null) {
                channelStateLegacyImplRemove.destroy$stream_chat_android_client_release();
            } else {
                c23454a0 = null;
            }
        } else {
            ChannelStateImpl channelStateImplRemove = this.channels.remove(new C23465k(channelType, channelId));
            if (channelStateImplRemove != null) {
                channelStateImplRemove.destroy();
            } else {
                c23454a0 = null;
            }
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("[removeChanel] removed channel(", channelType, ", ", channelId, "): ");
            sbM32001t.append(c23454a0);
            interfaceC2344j.log(enumC2341g, str, sbM32001t.toString(), null);
        }
    }

    public final ChannelState channel(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.useLegacyChannelState ? legacyChannelState$stream_chat_android_client_release(channelType, channelId) : channelState$stream_chat_android_client_release(channelType, channelId);
    }

    public final ChannelStateImpl channelState$stream_chat_android_client_release(String channelType, String channelId) {
        Object next;
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        Iterator<T> it = this.messageLimitConfig.getChannelMessageLimits().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((ChannelMessageLimit) next).getChannelType(), channelType));
        ChannelMessageLimit channelMessageLimit = (ChannelMessageLimit) next;
        Integer numValueOf = channelMessageLimit != null ? Integer.valueOf(channelMessageLimit.getBaseLimit()) : null;
        ConcurrentHashMap<C23465k, ChannelStateImpl> concurrentHashMap = this.channels;
        C23465k c23465k = new C23465k(channelType, channelId);
        ChannelStateImpl channelStateImpl = concurrentHashMap.get(c23465k);
        if (channelStateImpl == null) {
            channelStateImpl = new ChannelStateImpl(channelType, channelId, this.userStateFlow, this.latestUsers, this.mutedUsers, this.activeLiveLocations, numValueOf, null, null, 384, null);
            ChannelStateImpl channelStateImplPutIfAbsent = concurrentHashMap.putIfAbsent(c23465k, channelStateImpl);
            if (channelStateImplPutIfAbsent != null) {
                channelStateImpl = channelStateImplPutIfAbsent;
            }
        }
        return channelStateImpl;
    }

    public final void clear() {
        AbstractC3006f0.m8717k(this.job);
        Iterator<Map.Entry<QueryChannelsIdentifier, QueryChannelsMutableState>> it = this.queryChannels.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().destroy();
        }
        this.queryChannels.clear();
        Iterator<Map.Entry<C23465k, ChannelStateLegacyImpl>> it3 = this.legacyChannels.entrySet().iterator();
        while (it3.hasNext()) {
            it3.next().getValue().destroy$stream_chat_android_client_release();
        }
        this.legacyChannels.clear();
        Iterator<Map.Entry<C23465k, ChannelStateImpl>> it4 = this.channels.entrySet().iterator();
        while (it4.hasNext()) {
            it4.next().getValue().destroy();
        }
        this.channels.clear();
        Iterator<Map.Entry<C23465k, QueryThreadsMutableState>> it5 = this.queryThreads.entrySet().iterator();
        while (it5.hasNext()) {
            it5.next().getValue().destroy$stream_chat_android_client_release();
        }
        this.queryThreads.clear();
        Iterator<Map.Entry<String, ThreadMutableState>> it6 = this.threads.entrySet().iterator();
        while (it6.hasNext()) {
            it6.next().getValue().destroy();
        }
        this.threads.clear();
    }

    public final List<ChannelState> getActiveChannelStates$stream_chat_android_client_release() {
        if (this.useLegacyChannelState) {
            Collection<ChannelStateLegacyImpl> collectionValues = this.legacyChannels.values();
            AbstractC22676k.m65749i(collectionValues, "<get-values>(...)");
            return AbstractC25265s.m74093D1(collectionValues);
        }
        Collection<ChannelStateImpl> collectionValues2 = this.channels.values();
        AbstractC22676k.m65749i(collectionValues2, "<get-values>(...)");
        return AbstractC25265s.m74093D1(collectionValues2);
    }

    public final void handleBatchEvent$stream_chat_android_client_release(BatchEvent batchEvent) {
        AbstractC22676k.m65750j(batchEvent, "batchEvent");
        for (ChatEvent chatEvent : batchEvent.getSortedEvents()) {
            if (chatEvent instanceof ChannelDeletedEvent) {
                ChannelDeletedEvent channelDeletedEvent = (ChannelDeletedEvent) chatEvent;
                removeChanel(channelDeletedEvent.getChannelType(), channelDeletedEvent.getChannelId());
            } else if (chatEvent instanceof NotificationChannelDeletedEvent) {
                NotificationChannelDeletedEvent notificationChannelDeletedEvent = (NotificationChannelDeletedEvent) chatEvent;
                removeChanel(notificationChannelDeletedEvent.getChannelType(), notificationChannelDeletedEvent.getChannelId());
            }
        }
    }

    public final boolean isActiveChannel$stream_chat_android_client_release(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return this.useLegacyChannelState ? this.legacyChannels.containsKey(new C23465k(channelType, channelId)) : this.channels.containsKey(new C23465k(channelType, channelId));
    }

    public final ChannelStateLegacyImpl legacyChannelState$stream_chat_android_client_release(String channelType, String channelId) {
        Object next;
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        ConcurrentHashMap<C23465k, ChannelStateLegacyImpl> concurrentHashMap = this.legacyChannels;
        C23465k c23465k = new C23465k(channelType, channelId);
        ChannelStateLegacyImpl channelStateLegacyImpl = concurrentHashMap.get(c23465k);
        if (channelStateLegacyImpl == null) {
            Iterator<T> it = this.messageLimitConfig.getChannelMessageLimits().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC22676k.m65745e(((ChannelMessageLimit) next).getChannelType(), channelType));
            ChannelMessageLimit channelMessageLimit = (ChannelMessageLimit) next;
            ChannelStateLegacyImpl channelStateLegacyImpl2 = new ChannelStateLegacyImpl(channelType, channelId, this.userStateFlow, this.latestUsers, this.activeLiveLocations, channelMessageLimit != null ? Integer.valueOf(channelMessageLimit.getBaseLimit()) : null, this.now);
            ChannelStateLegacyImpl channelStateLegacyImplPutIfAbsent = concurrentHashMap.putIfAbsent(c23465k, channelStateLegacyImpl2);
            channelStateLegacyImpl = channelStateLegacyImplPutIfAbsent == null ? channelStateLegacyImpl2 : channelStateLegacyImplPutIfAbsent;
        }
        return channelStateLegacyImpl;
    }

    public final QueryThreadsMutableState mutableQueryThreads$stream_chat_android_client_release(FilterObject filter, QuerySorter<Thread> sort) {
        QueryThreadsMutableState queryThreadsMutableStatePutIfAbsent;
        AbstractC22676k.m65750j(sort, "sort");
        ConcurrentHashMap<C23465k, QueryThreadsMutableState> concurrentHashMap = this.queryThreads;
        C23465k c23465k = new C23465k(filter, sort);
        QueryThreadsMutableState queryThreadsMutableState = concurrentHashMap.get(c23465k);
        if (queryThreadsMutableState == null && (queryThreadsMutableStatePutIfAbsent = concurrentHashMap.putIfAbsent(c23465k, (queryThreadsMutableState = new QueryThreadsMutableState(filter, sort)))) != null) {
            queryThreadsMutableState = queryThreadsMutableStatePutIfAbsent;
        }
        return queryThreadsMutableState;
    }

    public final ThreadMutableState mutableThread$stream_chat_android_client_release(String messageId) {
        ThreadMutableState threadMutableStatePutIfAbsent;
        AbstractC22676k.m65750j(messageId, "messageId");
        ConcurrentHashMap<String, ThreadMutableState> concurrentHashMap = this.threads;
        ThreadMutableState threadMutableState = concurrentHashMap.get(messageId);
        if (threadMutableState == null && (threadMutableStatePutIfAbsent = concurrentHashMap.putIfAbsent(messageId, (threadMutableState = new ThreadMutableState(messageId, this.scope)))) != null) {
            threadMutableState = threadMutableStatePutIfAbsent;
        }
        return threadMutableState;
    }

    public final QueryChannelsState queryChannels(FilterObject filter, QuerySorter<Channel> sort) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        return queryChannels(new QueryChannelsIdentifier.Standard(filter, sort));
    }

    public final QueryThreadsState queryThreads$stream_chat_android_client_release(FilterObject filter, QuerySorter<Thread> sort) {
        AbstractC22676k.m65750j(sort, "sort");
        return mutableQueryThreads$stream_chat_android_client_release(filter, sort);
    }

    public final ThreadState thread(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return mutableThread$stream_chat_android_client_release(messageId);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StateRegistry(InterfaceC13037f2 userStateFlow, InterfaceC13037f2 latestUsers, InterfaceC13037f2 activeLiveLocations, InterfaceC3027k1 job, InterfaceC4339a now, InterfaceC2994c0 scope, MessageLimitConfig messageLimitConfig, InterfaceC13037f2 mutedUsers) {
        this(userStateFlow, latestUsers, activeLiveLocations, job, now, scope, messageLimitConfig, mutedUsers, false, 256, null);
        AbstractC22676k.m65750j(userStateFlow, "userStateFlow");
        AbstractC22676k.m65750j(latestUsers, "latestUsers");
        AbstractC22676k.m65750j(activeLiveLocations, "activeLiveLocations");
        AbstractC22676k.m65750j(job, "job");
        AbstractC22676k.m65750j(now, "now");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(messageLimitConfig, "messageLimitConfig");
        AbstractC22676k.m65750j(mutedUsers, "mutedUsers");
    }

    @InternalStreamChatApi
    public final QueryChannelsState queryChannels(QueryChannelsIdentifier identifier) {
        C23465k c23465k;
        AbstractC22676k.m65750j(identifier, "identifier");
        ConcurrentHashMap<QueryChannelsIdentifier, QueryChannelsMutableState> concurrentHashMap = this.queryChannels;
        QueryChannelsMutableState queryChannelsMutableState = concurrentHashMap.get(identifier);
        if (queryChannelsMutableState == null) {
            if (identifier instanceof QueryChannelsIdentifier.Standard) {
                QueryChannelsIdentifier.Standard standard = (QueryChannelsIdentifier.Standard) identifier;
                c23465k = new C23465k(standard.getFilter(), standard.getSort());
            } else {
                if (!(identifier instanceof QueryChannelsIdentifier.Predefined)) {
                    throw new NoWhenBranchMatchedException();
                }
                c23465k = new C23465k(Filters.neutral(), new QuerySortByField());
            }
            QueryChannelsMutableState queryChannelsMutableState2 = new QueryChannelsMutableState(identifier, (FilterObject) c23465k.f92937w, (QuerySorter) c23465k.f92938x, this.scope, this.latestUsers, this.activeLiveLocations);
            QueryChannelsMutableState queryChannelsMutableStatePutIfAbsent = concurrentHashMap.putIfAbsent(identifier, queryChannelsMutableState2);
            queryChannelsMutableState = queryChannelsMutableStatePutIfAbsent == null ? queryChannelsMutableState2 : queryChannelsMutableStatePutIfAbsent;
        }
        return queryChannelsMutableState;
    }

    public StateRegistry(InterfaceC13037f2 userStateFlow, InterfaceC13037f2 latestUsers, InterfaceC13037f2 activeLiveLocations, InterfaceC3027k1 job, InterfaceC4339a now, InterfaceC2994c0 scope, MessageLimitConfig messageLimitConfig, InterfaceC13037f2 mutedUsers, boolean z4) {
        AbstractC22676k.m65750j(userStateFlow, "userStateFlow");
        AbstractC22676k.m65750j(latestUsers, "latestUsers");
        AbstractC22676k.m65750j(activeLiveLocations, "activeLiveLocations");
        AbstractC22676k.m65750j(job, "job");
        AbstractC22676k.m65750j(now, "now");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(messageLimitConfig, "messageLimitConfig");
        AbstractC22676k.m65750j(mutedUsers, "mutedUsers");
        this.userStateFlow = userStateFlow;
        this.latestUsers = latestUsers;
        this.activeLiveLocations = activeLiveLocations;
        this.job = job;
        this.now = now;
        this.scope = scope;
        this.messageLimitConfig = messageLimitConfig;
        this.mutedUsers = mutedUsers;
        this.useLegacyChannelState = z4;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:StateRegistry");
        this.queryChannels = new ConcurrentHashMap<>();
        this.legacyChannels = new ConcurrentHashMap<>();
        this.channels = new ConcurrentHashMap<>();
        this.queryThreads = new ConcurrentHashMap<>();
        this.threads = new ConcurrentHashMap<>();
    }

    public /* synthetic */ StateRegistry(InterfaceC13037f2 interfaceC13037f2, InterfaceC13037f2 interfaceC13037f3, InterfaceC13037f2 interfaceC13037f4, InterfaceC3027k1 interfaceC3027k1, InterfaceC4339a interfaceC4339a, InterfaceC2994c0 interfaceC2994c0, MessageLimitConfig messageLimitConfig, InterfaceC13037f2 interfaceC13037f5, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC13037f2, interfaceC13037f3, interfaceC13037f4, interfaceC3027k1, interfaceC4339a, interfaceC2994c0, messageLimitConfig, (i13 & 128) != 0 ? AbstractC13091v.m36593c(C25271y.f99162w) : interfaceC13037f5, (i13 & 256) != 0 ? true : z4);
    }
}
