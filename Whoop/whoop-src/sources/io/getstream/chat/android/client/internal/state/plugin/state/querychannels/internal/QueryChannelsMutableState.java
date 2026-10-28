package io.getstream.chat.android.client.internal.state.plugin.state.querychannels.internal;

import androidx.core.app.NotificationCompat;
import androidx.room.C1844y;
import bc3.InterfaceC2994c0;
import com.mapbox.maps.MapboxMap;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13045h2;
import ec3.C13060l1;
import ec3.C13081r1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import h02.C16587n0;
import io.getstream.chat.android.client.api.event.ChatEventHandler;
import io.getstream.chat.android.client.api.event.ChatEventHandlerFactory;
import io.getstream.chat.android.client.api.event.DefaultChatEventHandler;
import io.getstream.chat.android.client.api.event.EventHandlingResult;
import io.getstream.chat.android.client.api.models.QueryChannelsRequest;
import io.getstream.chat.android.client.api.state.ChannelsStateData;
import io.getstream.chat.android.client.api.state.QueryChannelsState;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.internal.state.plugin.QueryChannelsIdentifier;
import io.getstream.chat.android.client.query.QueryChannelsSpec;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0\u000b\u0012\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b \u0010\u001fJ\u0015\u0010#\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u001b¢\u0006\u0004\b&\u0010\u001fJ\u0015\u0010(\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u001b¢\u0006\u0004\b(\u0010\u001fJ\u0015\u0010+\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J!\u0010.\u001a\u00020\u001d2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0004\b.\u0010/J#\u00102\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\u00042\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b2\u00103J\u001b\u00106\u001a\u00020\u001d2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\r04¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u001d¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R \u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR,\u0010D\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010?R(\u0010E\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001e\u0010G\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010?R\u001e\u0010H\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010?R\u001e\u0010I\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010?R\"\u0010J\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00100\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010FR \u0010K\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010?R\u001e\u0010L\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010?R\u001e\u0010M\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010?R \u0010N\u001a\b\u0012\u0004\u0012\u00020)0\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010F\u001a\u0004\bO\u0010PR$\u0010R\u001a\u0004\u0018\u00010Q8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR \u0010'\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010F\u001a\u0004\bX\u0010PR\u001b\u0010^\u001a\u00020Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\"\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010F\u001a\u0004\b`\u0010PR \u0010a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u0010F\u001a\u0004\bb\u0010PR \u0010c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bc\u0010F\u001a\u0004\bd\u0010PR \u0010e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\be\u0010F\u001a\u0004\bf\u0010PR(\u0010g\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00100\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bg\u0010F\u001a\u0004\bh\u0010PR \u0010j\u001a\b\u0012\u0004\u0012\u00020i0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bj\u0010F\u001a\u0004\bk\u0010PR\"\u0010l\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bl\u0010F\u001a\u0004\bm\u0010PR\u0014\u00100\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR@\u0010v\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f2\u0014\u0010r\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f8@@BX\u0080\u000e¢\u0006\f\u001a\u0004\bs\u0010t\"\u0004\bu\u0010/R\u0014\u0010y\u001a\u00020A8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bw\u0010xR\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bz\u0010P¨\u0006|"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;", "Lio/getstream/chat/android/client/api/state/QueryChannelsState;", "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;", "identifier", "Lio/getstream/chat/android/models/FilterObject;", "initialFilter", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/Channel;", "initialSort", "Lbc3/c0;", "scope", "Lec3/f2;", "", "", "Lio/getstream/chat/android/models/User;", "latestUsers", "", "Lio/getstream/chat/android/models/Location;", "activeLiveLocations", "<init>", "(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Lbc3/c0;Lec3/f2;Lec3/f2;)V", "Lio/getstream/chat/android/client/events/ChatEvent;", NotificationCompat.CATEGORY_EVENT, "cachedChannel", "Lio/getstream/chat/android/client/api/event/EventHandlingResult;", "handleChatEvent", "(Lio/getstream/chat/android/client/events/ChatEvent;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;", "", "isLoading", "Ll83/a0;", "setLoadingMore", "(Z)V", "setLoadingFirstPage", "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;", "request", "setCurrentRequest", "(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)V", "isEnd", "setEndOfChannels", "recoveryNeeded", "setRecoveryNeeded", "", MapboxMap.QFE_OFFSET, "setChannelsOffset", "(I)V", "channelsMap", "setChannels", "(Ljava/util/Map;)V", "filter", "sort", "applyResolvedSpec", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)V", "", "cids", "setCids", "(Ljava/util/Set;)V", "destroy", "()V", "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;", "getIdentifier", "()Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;", "Lec3/p1;", "_filter", "Lec3/p1;", "_sort", "Lio/getstream/chat/android/client/query/QueryChannelsSpec;", "_querySpec", "Lio/getstream/chat/android/client/query/QueryChannelsSpec;", "_channels", "mapChannels", "Lec3/f2;", "_loading", "_loadingMore", "_endOfChannels", "sortedChannels", "_currentRequest", "_recoveryNeeded", "_channelsOffset", "channelsOffset", "getChannelsOffset$stream_chat_android_client_release", "()Lec3/f2;", "Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;", "chatEventHandlerFactory", "Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;", "getChatEventHandlerFactory", "()Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;", "setChatEventHandlerFactory", "(Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;)V", "getRecoveryNeeded", "Lio/getstream/chat/android/client/api/event/ChatEventHandler;", "eventHandler$delegate", "Ll83/h;", "getEventHandler", "()Lio/getstream/chat/android/client/api/event/ChatEventHandler;", "eventHandler", "currentRequest", "getCurrentRequest", "loading", "getLoading", "loadingMore", "getLoadingMore", "endOfChannels", "getEndOfChannels", "channels", "getChannels", "Lio/getstream/chat/android/client/api/state/ChannelsStateData;", "channelsStateData", "getChannelsStateData", "nextPageRequest", "getNextPageRequest", "getFilter", "()Lio/getstream/chat/android/models/FilterObject;", "getSort", "()Lio/getstream/chat/android/models/querysort/QuerySorter;", "value", "getRawChannels$stream_chat_android_client_release", "()Ljava/util/Map;", "setRawChannels", "rawChannels", "getQueryChannelsSpec$stream_chat_android_client_release", "()Lio/getstream/chat/android/client/query/QueryChannelsSpec;", "queryChannelsSpec", "getCurrentLoading$stream_chat_android_client_release", "currentLoading", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QueryChannelsMutableState implements QueryChannelsState {
    private InterfaceC13075p1 _channels;
    private InterfaceC13075p1 _channelsOffset;
    private InterfaceC13075p1 _currentRequest;
    private InterfaceC13075p1 _endOfChannels;
    private final InterfaceC13075p1 _filter;
    private InterfaceC13075p1 _loading;
    private InterfaceC13075p1 _loadingMore;
    private QueryChannelsSpec _querySpec;
    private InterfaceC13075p1 _recoveryNeeded;
    private final InterfaceC13075p1 _sort;
    private final InterfaceC13037f2 channels;
    private final InterfaceC13037f2 channelsOffset;
    private final InterfaceC13037f2 channelsStateData;
    private ChatEventHandlerFactory chatEventHandlerFactory;
    private final InterfaceC13037f2 currentRequest;
    private final InterfaceC13037f2 endOfChannels;

    /* JADX INFO: renamed from: eventHandler$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h eventHandler;
    private final QueryChannelsIdentifier identifier;
    private final InterfaceC13037f2 loading;
    private final InterfaceC13037f2 loadingMore;
    private final InterfaceC13037f2 mapChannels;
    private final InterfaceC13037f2 nextPageRequest;
    private final InterfaceC13037f2 recoveryNeeded;
    private final InterfaceC13037f2 sortedChannels;

    public QueryChannelsMutableState(QueryChannelsIdentifier identifier, FilterObject initialFilter, QuerySorter<Channel> initialSort, InterfaceC2994c0 scope, InterfaceC13037f2 latestUsers, InterfaceC13037f2 activeLiveLocations) {
        QueryChannelsSpec queryChannelsSpec;
        AbstractC22676k.m65750j(identifier, "identifier");
        AbstractC22676k.m65750j(initialFilter, "initialFilter");
        AbstractC22676k.m65750j(initialSort, "initialSort");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(latestUsers, "latestUsers");
        AbstractC22676k.m65750j(activeLiveLocations, "activeLiveLocations");
        this.identifier = identifier;
        this._filter = AbstractC13091v.m36593c(initialFilter);
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(initialSort);
        this._sort = c13045h2M36593c;
        if (identifier instanceof QueryChannelsIdentifier.Standard) {
            queryChannelsSpec = new QueryChannelsSpec(initialFilter, initialSort);
        } else {
            if (!(identifier instanceof QueryChannelsIdentifier.Predefined)) {
                throw new NoWhenBranchMatchedException();
            }
            QueryChannelsIdentifier.Predefined predefined = (QueryChannelsIdentifier.Predefined) identifier;
            queryChannelsSpec = new QueryChannelsSpec(initialFilter, initialSort, null, predefined.getName(), predefined.getFilterValues(), predefined.getSortValues(), 4, null);
        }
        this._querySpec = queryChannelsSpec;
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(null);
        this._channels = c13045h2M36593c2;
        this.mapChannels = c13045h2M36593c2;
        Boolean bool = Boolean.FALSE;
        this._loading = AbstractC13091v.m36593c(bool);
        this._loadingMore = AbstractC13091v.m36593c(bool);
        this._endOfChannels = AbstractC13091v.m36593c(bool);
        C1844y c1844yM36605o = AbstractC13091v.m36605o(c13045h2M36593c2, latestUsers, activeLiveLocations, c13045h2M36593c, new QueryChannelsMutableState$sortedChannels$1(5, null));
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13081r1 c13081r1M36587M = AbstractC13091v.m36587M(c1844yM36605o, scope, c13021b2, null);
        this.sortedChannels = c13081r1M36587M;
        this._currentRequest = AbstractC13091v.m36593c(null);
        this._recoveryNeeded = AbstractC13091v.m36593c(bool);
        C13045h2 c13045h2M36593c3 = AbstractC13091v.m36593c(0);
        this._channelsOffset = c13045h2M36593c3;
        this.channelsOffset = c13045h2M36593c3;
        InterfaceC13075p1 interfaceC13075p1 = this._recoveryNeeded;
        AbstractC22676k.m65747g(interfaceC13075p1);
        this.recoveryNeeded = interfaceC13075p1;
        this.eventHandler = AbstractC30060g.m92088H(new C16587n0(this, 25));
        InterfaceC13075p1 interfaceC13075p2 = this._currentRequest;
        AbstractC22676k.m65747g(interfaceC13075p2);
        this.currentRequest = interfaceC13075p2;
        InterfaceC13075p1 interfaceC13075p3 = this._loading;
        AbstractC22676k.m65747g(interfaceC13075p3);
        this.loading = interfaceC13075p3;
        InterfaceC13075p1 interfaceC13075p4 = this._loadingMore;
        AbstractC22676k.m65747g(interfaceC13075p4);
        this.loadingMore = interfaceC13075p4;
        InterfaceC13075p1 interfaceC13075p5 = this._endOfChannels;
        AbstractC22676k.m65747g(interfaceC13075p5);
        this.endOfChannels = interfaceC13075p5;
        this.channels = c13081r1M36587M;
        this.channelsStateData = AbstractC13091v.m36587M(new C13060l1(interfaceC13075p3, c13081r1M36587M, new QueryChannelsMutableState$channelsStateData$1(3, null), 1), scope, c13021b2, ChannelsStateData.NoQueryActive.INSTANCE);
        this.nextPageRequest = AbstractC13091v.m36587M(new C13060l1(interfaceC13075p2, c13045h2M36593c3, new QueryChannelsMutableState$nextPageRequest$1(3, null), 1), scope, c13021b2, null);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ DefaultChatEventHandler m54864a(QueryChannelsMutableState queryChannelsMutableState) {
        return (DefaultChatEventHandler) eventHandler_delegate$lambda$0(queryChannelsMutableState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final ChatEventHandler eventHandler_delegate$lambda$0(QueryChannelsMutableState queryChannelsMutableState) {
        ChatEventHandlerFactory chatEventHandlerFactory = queryChannelsMutableState.chatEventHandlerFactory;
        if (chatEventHandlerFactory == null) {
            chatEventHandlerFactory = new ChatEventHandlerFactory(null, 1, 0 == true ? 1 : 0);
        }
        return chatEventHandlerFactory.chatEventHandler(queryChannelsMutableState.mapChannels);
    }

    private final ChatEventHandler getEventHandler() {
        return (ChatEventHandler) this.eventHandler.getValue();
    }

    private final void setRawChannels(Map<String, Channel> map) {
        InterfaceC13075p1 interfaceC13075p1 = this._channels;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36570j(map);
        }
    }

    public final void applyResolvedSpec(FilterObject filter, QuerySorter<Channel> sort) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        if (this.identifier instanceof QueryChannelsIdentifier.Predefined) {
            C13045h2 c13045h2 = (C13045h2) this._filter;
            c13045h2.getClass();
            c13045h2.m36571k(null, filter);
            C13045h2 c13045h3 = (C13045h2) this._sort;
            c13045h3.getClass();
            c13045h3.m36571k(null, sort);
            this._querySpec = this._querySpec.copy(filter, sort);
        }
    }

    public final void destroy() {
        this._channels = null;
        this._loading = null;
        this._loadingMore = null;
        this._endOfChannels = null;
        this._currentRequest = null;
        this._recoveryNeeded = null;
        this._channelsOffset = null;
    }

    @Override // io.getstream.chat.android.client.api.state.QueryChannelsState
    public final InterfaceC13037f2 getChannels() {
        return this.channels;
    }

    /* JADX INFO: renamed from: getChannelsOffset$stream_chat_android_client_release, reason: from getter */
    public final InterfaceC13037f2 getChannelsOffset() {
        return this.channelsOffset;
    }

    @Override // io.getstream.chat.android.client.api.state.QueryChannelsState
    public final InterfaceC13037f2 getChannelsStateData() {
        return this.channelsStateData;
    }

    @Override // io.getstream.chat.android.client.api.state.QueryChannelsState
    public final ChatEventHandlerFactory getChatEventHandlerFactory() {
        return this.chatEventHandlerFactory;
    }

    public final InterfaceC13037f2 getCurrentLoading$stream_chat_android_client_release() {
        Collection collection = (Collection) this.channels.getValue();
        return (collection == null || collection.isEmpty()) ? this.loading : this.loadingMore;
    }

    @Override // io.getstream.chat.android.client.api.state.QueryChannelsState
    public final InterfaceC13037f2 getCurrentRequest() {
        return this.currentRequest;
    }

    @Override // io.getstream.chat.android.client.api.state.QueryChannelsState
    public final InterfaceC13037f2 getEndOfChannels() {
        return this.endOfChannels;
    }

    @Override // io.getstream.chat.android.client.api.state.QueryChannelsState
    public final FilterObject getFilter() {
        return (FilterObject) ((C13045h2) this._filter).getValue();
    }

    public final QueryChannelsIdentifier getIdentifier() {
        return this.identifier;
    }

    @Override // io.getstream.chat.android.client.api.state.QueryChannelsState
    public final InterfaceC13037f2 getLoading() {
        return this.loading;
    }

    @Override // io.getstream.chat.android.client.api.state.QueryChannelsState
    public final InterfaceC13037f2 getLoadingMore() {
        return this.loadingMore;
    }

    @Override // io.getstream.chat.android.client.api.state.QueryChannelsState
    public final InterfaceC13037f2 getNextPageRequest() {
        return this.nextPageRequest;
    }

    /* JADX INFO: renamed from: getQueryChannelsSpec$stream_chat_android_client_release, reason: from getter */
    public final QueryChannelsSpec get_querySpec() {
        return this._querySpec;
    }

    public final Map<String, Channel> getRawChannels$stream_chat_android_client_release() {
        InterfaceC13075p1 interfaceC13075p1 = this._channels;
        if (interfaceC13075p1 != null) {
            return (Map) ((C13045h2) interfaceC13075p1).getValue();
        }
        return null;
    }

    @Override // io.getstream.chat.android.client.api.state.QueryChannelsState
    public final InterfaceC13037f2 getRecoveryNeeded() {
        return this.recoveryNeeded;
    }

    @Override // io.getstream.chat.android.client.api.state.QueryChannelsState
    public final QuerySorter<Channel> getSort() {
        return (QuerySorter) ((C13045h2) this._sort).getValue();
    }

    public final EventHandlingResult handleChatEvent(ChatEvent event, Channel cachedChannel) {
        AbstractC22676k.m65750j(event, "event");
        return getEventHandler().handleChatEvent(event, getFilter(), cachedChannel);
    }

    public final void setChannels(Map<String, Channel> channelsMap) {
        AbstractC22676k.m65750j(channelsMap, "channelsMap");
        setRawChannels(channelsMap);
    }

    public final void setChannelsOffset(int offset) {
        InterfaceC13075p1 interfaceC13075p1 = this._channelsOffset;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36571k(null, Integer.valueOf(offset));
        }
    }

    @Override // io.getstream.chat.android.client.api.state.QueryChannelsState
    public final void setChatEventHandlerFactory(ChatEventHandlerFactory chatEventHandlerFactory) {
        this.chatEventHandlerFactory = chatEventHandlerFactory;
    }

    public final void setCids(Set<String> cids) {
        AbstractC22676k.m65750j(cids, "cids");
        this._querySpec = QueryChannelsSpec.copy$default(this._querySpec, null, null, cids, null, null, null, 59, null);
    }

    public final void setCurrentRequest(QueryChannelsRequest request) {
        AbstractC22676k.m65750j(request, "request");
        InterfaceC13075p1 interfaceC13075p1 = this._currentRequest;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36571k(null, request);
        }
    }

    public final void setEndOfChannels(boolean isEnd) {
        InterfaceC13075p1 interfaceC13075p1 = this._endOfChannels;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36571k(null, Boolean.valueOf(isEnd));
        }
    }

    public final void setLoadingFirstPage(boolean isLoading) {
        InterfaceC13075p1 interfaceC13075p1 = this._loading;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36571k(null, Boolean.valueOf(isLoading));
        }
    }

    public final void setLoadingMore(boolean isLoading) {
        InterfaceC13075p1 interfaceC13075p1 = this._loadingMore;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36571k(null, Boolean.valueOf(isLoading));
        }
    }

    public final void setRecoveryNeeded(boolean recoveryNeeded) {
        InterfaceC13075p1 interfaceC13075p1 = this._recoveryNeeded;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36571k(null, Boolean.valueOf(recoveryNeeded));
        }
    }
}
