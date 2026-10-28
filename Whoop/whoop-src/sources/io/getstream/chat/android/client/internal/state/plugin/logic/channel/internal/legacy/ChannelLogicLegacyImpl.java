package io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy;

import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.mapbox.common.HttpHeaders;
import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.models.Pagination;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.api.models.WatchChannelRequest;
import io.getstream.chat.android.client.channel.ChannelMessagesUpdateLogic;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.extensions.internal.ChannelKt;
import io.getstream.chat.android.client.internal.state.model.querychannels.pagination.internal.MapperKt;
import io.getstream.chat.android.client.internal.state.model.querychannels.pagination.internal.QueryChannelPaginationRequest;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic;
import io.getstream.chat.android.client.internal.state.plugin.state.channel.internal.ChannelStateLegacyImpl;
import io.getstream.chat.android.client.persistance.repository.RepositoryFacade;
import io.getstream.chat.android.client.query.pagination.AnyChannelPaginationRequest;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Config;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.PushPreference;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import l83.InterfaceC23462h;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25265s;
import n23.AbstractC26205h;
import n23.C26198a;
import n23.C26203f;
import n23.C26204g;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ&\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b \u0010!J(\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\"\u0010!J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00112\u0006\u0010(\u001a\u00020%H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00112\u0006\u0010(\u001a\u00020%H\u0016¢\u0006\u0004\b+\u0010*J\u0017\u0010,\u001a\u00020\u00112\u0006\u0010(\u001a\u00020%H\u0016¢\u0006\u0004\b,\u0010*J@\u00103\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b3\u00104J\u001d\u00108\u001a\u00020\u00112\f\u00107\u001a\b\u0012\u0004\u0012\u00020605H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u0004H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020\u00112\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u00112\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\bA\u0010@J\u0017\u0010D\u001a\u00020\u00112\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ\u0019\u0010F\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\bF\u0010*J\u000f\u0010G\u001a\u00020\u0004H\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0004H\u0016¢\u0006\u0004\bI\u0010HJ\u0011\u0010J\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\bJ\u0010KJ\u0019\u0010L\u001a\u00020\u00112\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\bL\u0010@J\u0019\u0010M\u001a\u00020\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\bM\u0010NJ\u001d\u0010Q\u001a\u00020\u00112\f\u0010P\u001a\b\u0012\u0004\u0012\u00020O05H\u0016¢\u0006\u0004\bQ\u00109J\u0017\u0010S\u001a\u00020\u00112\u0006\u0010R\u001a\u00020OH\u0016¢\u0006\u0004\bS\u0010TJ&\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010U\u001a\u00020\u000b2\u0006\u0010W\u001a\u00020VH\u0082@¢\u0006\u0004\bX\u0010YJ\u001e\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010W\u001a\u00020VH\u0082@¢\u0006\u0004\bZ\u0010[J3\u0010^\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u001b2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020%052\f\u0010]\u001a\b\u0012\u0004\u0012\u00020%05H\u0002¢\u0006\u0004\b^\u0010_J\u001a\u0010`\u001a\u0004\u0018\u00010\u00172\u0006\u0010W\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b`\u0010\u0013JB\u0010b\u001a\u00020\u00112\u0006\u0010a\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\u0004H\u0082@¢\u0006\u0004\bb\u0010cJ\u0017\u0010d\u001a\u00020\u00112\u0006\u0010a\u001a\u00020\u0017H\u0002¢\u0006\u0004\bd\u0010eJ\"\u0010h\u001a\u0004\u0018\u00010\u00172\u0006\u0010f\u001a\u00020\u000b2\u0006\u0010g\u001a\u00020\u000fH\u0082@¢\u0006\u0004\bh\u0010iJ,\u0010l\u001a\b\u0012\u0004\u0012\u00020\u0017052\f\u0010j\u001a\b\u0012\u0004\u0012\u00020\u000b052\u0006\u0010g\u001a\u00020kH\u0082@¢\u0006\u0004\bl\u0010mJ!\u0010o\u001a\u00020V2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010n\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\bo\u0010pJ!\u0010q\u001a\u00020V2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010n\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\bq\u0010pJ\u0017\u0010s\u001a\u00020V2\u0006\u0010r\u001a\u00020\u000bH\u0002¢\u0006\u0004\bs\u0010tJ)\u0010v\u001a\u00020V2\u0006\u0010g\u001a\u00020u2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010n\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\bv\u0010wJ\u0019\u0010y\u001a\u0004\u0018\u00010%2\u0006\u0010x\u001a\u00020uH\u0002¢\u0006\u0004\by\u0010zR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010{R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010|R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010}R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010~R\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u007fR\u0018\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R!\u0010\u008b\u0001\u001a\u00030\u0086\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0017\u0010\u008e\u0001\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u008f\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001¨\u0006\u0093\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;", "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;", "repos", "", "userPresence", "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;", "stateLogic", "Lbc3/c0;", "coroutineScope", "Lkotlin/Function0;", "", "getCurrentUserId", "<init>", "(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;ZLio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;Lbc3/c0;Lc93/a;)V", "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;", "query", "Ll83/a0;", "updateStateFromDatabase", "(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;", "setPaginationDirection", "(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)V", "Ln23/h;", "Lio/getstream/chat/android/models/Channel;", "result", "onQueryChannelResult", "(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Ln23/h;)V", "", MapboxMap.QFE_LIMIT, "watch", "(IZLq83/d;)Ljava/lang/Object;", "messageId", "loadAfter", "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;", "loadBefore", "loadAround", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/Message;", "getMessage", "(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;", "message", "upsertMessage", "(Lio/getstream/chat/android/models/Message;)V", "updateLastMessageAt", "deleteMessage", "channel", "messageLimit", "shouldRefreshMessages", "scrollUpdate", "isNotificationUpdate", "isChannelsStateUpdate", "updateDataForChannel", "(Lio/getstream/chat/android/models/Channel;IZZZZLq83/d;)Ljava/lang/Object;", "", "Lio/getstream/chat/android/models/Member;", QueryChannelRequest.KEY_MEMBERS, "upsertMembers", "(Ljava/util/List;)V", "hidden", "setHidden", "(Z)V", "Ljava/util/Date;", HttpHeaders.DATE, "hideMessagesBefore", "(Ljava/util/Date;)V", "removeMessagesBefore", "Lio/getstream/chat/android/models/PushPreference;", "preference", "setPushPreference", "(Lio/getstream/chat/android/models/PushPreference;)V", "setRepliedMessage", "markRead", "()Z", "typingEventsEnabled", "getLastStartTypingEvent", "()Ljava/util/Date;", "setLastStartTypingEvent", "setKeystrokeParentMessageId", "(Ljava/lang/String;)V", "Lio/getstream/chat/android/client/events/ChatEvent;", "events", "handleEvents", NotificationCompat.CATEGORY_EVENT, "handleEvent", "(Lio/getstream/chat/android/client/events/ChatEvent;)V", "src", "Lio/getstream/chat/android/client/api/models/WatchChannelRequest;", "request", "runChannelQuery", "(Ljava/lang/String;Lio/getstream/chat/android/client/api/models/WatchChannelRequest;Lq83/d;)Ljava/lang/Object;", "runChannelQueryOnline", "(Lio/getstream/chat/android/client/api/models/WatchChannelRequest;Lq83/d;)Ljava/lang/Object;", "loadedMessages", "requestedMessages", "fillTheGap", "(ILjava/util/List;Ljava/util/List;)V", "runChannelQueryOffline", "localChannel", "updateDataFromLocalChannel", "(Lio/getstream/chat/android/models/Channel;ZIZZZLq83/d;)Ljava/lang/Object;", "updateOldMessagesFromLocalChannel", "(Lio/getstream/chat/android/models/Channel;)V", "channelId", "pagination", "selectAndEnrichChannel", "(Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;", "channelIds", "Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;", "selectAndEnrichChannels", "(Ljava/util/List;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;", "baseMessageId", "olderWatchChannelRequest", "(ILjava/lang/String;)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;", "newerWatchChannelRequest", "aroundMessageId", "aroundIdWatchChannelRequest", "(Ljava/lang/String;)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;", "Lio/getstream/chat/android/client/api/models/Pagination;", "watchChannelRequest", "(Lio/getstream/chat/android/client/api/models/Pagination;ILjava/lang/String;)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;", "direction", "getLoadMoreBaseMessage", "(Lio/getstream/chat/android/client/api/models/Pagination;)Lio/getstream/chat/android/models/Message;", "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;", "Z", "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;", "Lbc3/c0;", "Lc93/a;", "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;", "mutableState", "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;", "eventHandler", "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "getCid", "()Ljava/lang/String;", "cid", "Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;", "getMessagesUpdateLogic", "()Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;", "messagesUpdateLogic", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelLogicLegacyImpl implements ChannelLogic {
    private final InterfaceC2994c0 coroutineScope;
    private final ChannelEventHandlerLegacyImpl eventHandler;
    private final InterfaceC4339a getCurrentUserId;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final ChannelStateLegacyImpl mutableState;
    private final RepositoryFacade repos;
    private final ChannelStateLogic stateLogic;
    private final boolean userPresence;

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Pagination.values().length];
            try {
                iArr[Pagination.GREATER_THAN_OR_EQUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Pagination.GREATER_THAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Pagination.LESS_THAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Pagination.LESS_THAN_OR_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Pagination.AROUND_ID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy.ChannelLogicLegacyImpl$fillTheGap$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy.ChannelLogicLegacyImpl$fillTheGap$1", m100430f = "ChannelLogicLegacyImpl.kt", m100431l = {294, 302}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C193091 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ List<Message> $loadedMessages;
        final /* synthetic */ int $messageLimit;
        final /* synthetic */ List<Message> $requestedMessages;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        final /* synthetic */ ChannelLogicLegacyImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C193091(List<Message> list, List<Message> list2, ChannelLogicLegacyImpl channelLogicLegacyImpl, int i13, InterfaceC30057d<? super C193091> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$loadedMessages = list;
            this.$requestedMessages = list2;
            this.this$0 = channelLogicLegacyImpl;
            this.$messageLimit = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C193091(this.$loadedMessages, this.$requestedMessages, this.this$0, this.$messageLimit, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C193091) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:77:0x024f  */
        /* JADX WARN: Code duplicated, block: B:79:0x0259  */
        /* JADX WARN: Code duplicated, block: B:80:0x0267  */
        /* JADX WARN: Code duplicated, block: B:83:0x026c  */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0218, code lost:
        
            if (r12 == r0) goto L74;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x0247, code lost:
        
            if (r12 == r0) goto L74;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 653
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy.ChannelLogicLegacyImpl.C193091.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy.ChannelLogicLegacyImpl$runChannelQuery$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy.ChannelLogicLegacyImpl", m100430f = "ChannelLogicLegacyImpl.kt", m100431l = {241, 243}, m100432m = "runChannelQuery")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193121 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C193121(InterfaceC30057d<? super C193121> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelLogicLegacyImpl.this.runChannelQuery(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy.ChannelLogicLegacyImpl$runChannelQueryOffline$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy.ChannelLogicLegacyImpl", m100430f = "ChannelLogicLegacyImpl.kt", m100431l = {320, 328}, m100432m = "runChannelQueryOffline")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193131 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C193131(InterfaceC30057d<? super C193131> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelLogicLegacyImpl.this.runChannelQueryOffline(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy.ChannelLogicLegacyImpl$selectAndEnrichChannel$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy.ChannelLogicLegacyImpl", m100430f = "ChannelLogicLegacyImpl.kt", m100431l = {374}, m100432m = "selectAndEnrichChannel")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193141 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C193141(InterfaceC30057d<? super C193141> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelLogicLegacyImpl.this.selectAndEnrichChannel(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy.ChannelLogicLegacyImpl$selectAndEnrichChannels$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.legacy.ChannelLogicLegacyImpl", m100430f = "ChannelLogicLegacyImpl.kt", m100431l = {379}, m100432m = "selectAndEnrichChannels")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193151 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C193151(InterfaceC30057d<? super C193151> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelLogicLegacyImpl.this.selectAndEnrichChannels(null, null, this);
        }
    }

    public ChannelLogicLegacyImpl(RepositoryFacade repos, boolean z4, ChannelStateLogic stateLogic, InterfaceC2994c0 coroutineScope, InterfaceC4339a getCurrentUserId) {
        AbstractC22676k.m65750j(repos, "repos");
        AbstractC22676k.m65750j(stateLogic, "stateLogic");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(getCurrentUserId, "getCurrentUserId");
        this.repos = repos;
        this.userPresence = z4;
        this.stateLogic = stateLogic;
        this.coroutineScope = coroutineScope;
        this.getCurrentUserId = getCurrentUserId;
        ChannelStateLegacyImpl mutableState = stateLogic.getMutableState();
        this.mutableState = mutableState;
        this.eventHandler = new ChannelEventHandlerLegacyImpl(mutableState.getCid(), stateLogic, getCurrentUserId);
        this.logger = AbstractC1772c1.m5382S(this, "Chat:ChannelLogicDB");
    }

    public static final WatchChannelRequest access$newerWatchChannelRequest(ChannelLogicLegacyImpl channelLogicLegacyImpl, int i13, String str) {
        channelLogicLegacyImpl.getClass();
        return channelLogicLegacyImpl.watchChannelRequest(Pagination.GREATER_THAN, i13, str);
    }

    public static final WatchChannelRequest access$olderWatchChannelRequest(ChannelLogicLegacyImpl channelLogicLegacyImpl, int i13, String str) {
        channelLogicLegacyImpl.getClass();
        return channelLogicLegacyImpl.watchChannelRequest(Pagination.LESS_THAN, i13, str);
    }

    public static final /* synthetic */ Object access$updateDataFromLocalChannel(ChannelLogicLegacyImpl channelLogicLegacyImpl, Channel channel, boolean z4, int i13, boolean z13, boolean z14, boolean z15, InterfaceC30057d interfaceC30057d) {
        channelLogicLegacyImpl.updateDataFromLocalChannel(channel, z4, i13, z13, z14, z15, interfaceC30057d);
        return C23454a0.f92919a;
    }

    private final WatchChannelRequest aroundIdWatchChannelRequest(String aroundMessageId) {
        QueryChannelPaginationRequest queryChannelPaginationRequest = new QueryChannelPaginationRequest(0, 1, null);
        queryChannelPaginationRequest.setMessageFilterDirection(Pagination.AROUND_ID);
        queryChannelPaginationRequest.setMessageFilterValue(aroundMessageId);
        WatchChannelRequest watchChannelRequest = queryChannelPaginationRequest.toWatchChannelRequest(this.userPresence);
        watchChannelRequest.setShouldRefresh(false);
        return watchChannelRequest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fillTheGap(int messageLimit, List<Message> loadedMessages, List<Message> requestedMessages) {
        if (loadedMessages.isEmpty() || requestedMessages.isEmpty() || messageLimit <= 0) {
            return;
        }
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new C193091(loadedMessages, requestedMessages, this, messageLimit, null), 3);
    }

    private final Message getLoadMoreBaseMessage(Pagination direction) {
        Object value = this.mutableState.getSortedMessages().getValue();
        if (((Collection) value).isEmpty()) {
            value = null;
        }
        List list = (List) value;
        if (list == null) {
            return null;
        }
        int i13 = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i13 == 1 || i13 == 2) {
            return (Message) AbstractC25265s.m74112P0(list);
        }
        if (i13 == 3 || i13 == 4 || i13 == 5) {
            return (Message) AbstractC25265s.m74096F0(list);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final WatchChannelRequest newerWatchChannelRequest(int limit, String baseMessageId) {
        return watchChannelRequest(Pagination.GREATER_THAN, limit, baseMessageId);
    }

    private final WatchChannelRequest olderWatchChannelRequest(int limit, String baseMessageId) {
        return watchChannelRequest(Pagination.LESS_THAN, limit, baseMessageId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:29:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object runChannelQuery(String str, WatchChannelRequest watchChannelRequest, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        C193121 c193121;
        List<Message> list;
        WatchChannelRequest watchChannelRequest2;
        List<Message> list2;
        Channel channel;
        AbstractC26205h abstractC26205h;
        boolean z4;
        if (interfaceC30057d instanceof C193121) {
            c193121 = (C193121) interfaceC30057d;
            int i13 = c193121.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c193121.label = i13 - Integer.MIN_VALUE;
            } else {
                c193121 = new C193121(interfaceC30057d);
            }
        } else {
            c193121 = new C193121(interfaceC30057d);
        }
        Object objRunChannelQueryOffline = c193121.result;
        Object obj = EnumC31071a.f128113w;
        int i14 = c193121.label;
        if (i14 != 0) {
            if (i14 == 1) {
                list = (List) c193121.L$2;
                watchChannelRequest = (WatchChannelRequest) c193121.L$1;
                AbstractC34132o.m107864I(objRunChannelQueryOffline);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                channel = (Channel) c193121.L$3;
                list2 = (List) c193121.L$2;
                watchChannelRequest2 = (WatchChannelRequest) c193121.L$1;
                AbstractC34132o.m107864I(objRunChannelQueryOffline);
            }
            abstractC26205h = (AbstractC26205h) objRunChannelQueryOffline;
            z4 = abstractC26205h instanceof C26204g;
            if (z4) {
                fillTheGap(watchChannelRequest2.messagesLimit(), list2, ((Channel) ((C26204g) abstractC26205h).f103919a).getMessages());
            } else if (!(abstractC26205h instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            return (z4 || channel == null) ? abstractC26205h : new C26204g(channel);
        }
        AbstractC34132o.m107864I(objRunChannelQueryOffline);
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str2 = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            logger.f9274b.log(enumC2341g, str2, "[runChannelQuery] #" + str + "; request: " + watchChannelRequest, null);
        }
        list = (List) this.mutableState.getMessageList().getValue();
        c193121.L$0 = null;
        c193121.L$1 = watchChannelRequest;
        c193121.L$2 = list;
        c193121.label = 1;
        objRunChannelQueryOffline = runChannelQueryOffline(watchChannelRequest, c193121);
        if (objRunChannelQueryOffline != obj) {
        }
        return obj;
        Channel channel2 = (Channel) objRunChannelQueryOffline;
        c193121.L$0 = null;
        c193121.L$1 = watchChannelRequest;
        c193121.L$2 = list;
        c193121.L$3 = channel2;
        c193121.label = 2;
        Object objRunChannelQueryOnline = runChannelQueryOnline(watchChannelRequest, c193121);
        if (objRunChannelQueryOnline != obj) {
            watchChannelRequest2 = watchChannelRequest;
            list2 = list;
            channel = channel2;
            objRunChannelQueryOffline = objRunChannelQueryOnline;
            abstractC26205h = (AbstractC26205h) objRunChannelQueryOffline;
            z4 = abstractC26205h instanceof C26204g;
            if (z4) {
                fillTheGap(watchChannelRequest2.messagesLimit(), list2, ((Channel) ((C26204g) abstractC26205h).f103919a).getMessages());
            } else if (!(abstractC26205h instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            if (z4) {
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object runChannelQueryOffline(QueryChannelRequest queryChannelRequest, InterfaceC30057d<? super Channel> interfaceC30057d) {
        C193131 c193131;
        Object obj;
        boolean z4;
        if (interfaceC30057d instanceof C193131) {
            c193131 = (C193131) interfaceC30057d;
            int i13 = c193131.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c193131.label = i13 - Integer.MIN_VALUE;
            } else {
                c193131 = new C193131(interfaceC30057d);
            }
        } else {
            c193131 = new C193131(interfaceC30057d);
        }
        C193131 c193132 = c193131;
        Object objSelectAndEnrichChannel = c193132.result;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c193132.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objSelectAndEnrichChannel);
            if (!queryChannelRequest.isFilteringNewerMessages() && !queryChannelRequest.isFilteringAroundIdMessages()) {
                String cid = this.mutableState.getCid();
                c193132.L$0 = queryChannelRequest;
                c193132.label = 1;
                objSelectAndEnrichChannel = selectAndEnrichChannel(cid, queryChannelRequest, c193132);
                if (objSelectAndEnrichChannel != obj2) {
                }
            }
            return null;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Channel channel = (Channel) c193132.L$1;
            AbstractC34132o.m107864I(objSelectAndEnrichChannel);
            return channel;
        }
        queryChannelRequest = (QueryChannelRequest) c193132.L$0;
        AbstractC34132o.m107864I(objSelectAndEnrichChannel);
        Channel channel2 = (Channel) objSelectAndEnrichChannel;
        if (channel2 != null) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, AbstractC25012a.m73374g(channel2.getMessages().size(), "[runChannelQueryOffline] completed; channel.cid: ", channel2.getCid(), ", channel.messages.size: "), null);
            }
            if (queryChannelRequest.filteringOlderMessages()) {
                updateOldMessagesFromLocalChannel(channel2);
                return channel2;
            }
            boolean isNotificationUpdate = queryChannelRequest.getIsNotificationUpdate();
            int iMessagesLimit = queryChannelRequest.messagesLimit();
            if (!queryChannelRequest.isFilteringMessages() || queryChannelRequest.isFilteringAroundIdMessages()) {
                obj = null;
                z4 = false;
            } else {
                z4 = true;
                obj = null;
            }
            boolean shouldRefresh = queryChannelRequest.getShouldRefresh();
            c193132.L$0 = obj;
            c193132.L$1 = channel2;
            c193132.L$2 = obj;
            c193132.I$0 = 0;
            c193132.label = 2;
            updateDataFromLocalChannel(channel2, isNotificationUpdate, iMessagesLimit, z4, shouldRefresh, true, c193132);
            return C23454a0.f92919a == obj2 ? obj2 : channel2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object runChannelQueryOnline(WatchChannelRequest watchChannelRequest, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        return ChatClient.INSTANCE.instance().queryChannel(this.mutableState.getChannelType(), this.mutableState.getChannelId(), watchChannelRequest, true).await(interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object selectAndEnrichChannel(String str, QueryChannelRequest queryChannelRequest, InterfaceC30057d<? super Channel> interfaceC30057d) {
        C193141 c193141;
        if (interfaceC30057d instanceof C193141) {
            c193141 = (C193141) interfaceC30057d;
            int i13 = c193141.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c193141.label = i13 - Integer.MIN_VALUE;
            } else {
                c193141 = new C193141(interfaceC30057d);
            }
        } else {
            c193141 = new C193141(interfaceC30057d);
        }
        Object objSelectAndEnrichChannels = c193141.result;
        Object obj = EnumC31071a.f128113w;
        int i14 = c193141.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objSelectAndEnrichChannels);
            List<String> listM118958J = AbstractC37056f.m118958J(str);
            AnyChannelPaginationRequest anyChannelPaginationRequest = MapperKt.toAnyChannelPaginationRequest(queryChannelRequest);
            c193141.L$0 = null;
            c193141.L$1 = null;
            c193141.label = 1;
            objSelectAndEnrichChannels = selectAndEnrichChannels(listM118958J, anyChannelPaginationRequest, c193141);
            if (objSelectAndEnrichChannels == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objSelectAndEnrichChannels);
        }
        return AbstractC25265s.m74102I0(0, (List) objSelectAndEnrichChannels);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object selectAndEnrichChannels(List<String> list, AnyChannelPaginationRequest anyChannelPaginationRequest, InterfaceC30057d<? super List<Channel>> interfaceC30057d) {
        C193151 c193151;
        if (interfaceC30057d instanceof C193151) {
            c193151 = (C193151) interfaceC30057d;
            int i13 = c193151.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c193151.label = i13 - Integer.MIN_VALUE;
            } else {
                c193151 = new C193151(interfaceC30057d);
            }
        } else {
            c193151 = new C193151(interfaceC30057d);
        }
        Object objSelectChannels = c193151.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c193151.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objSelectChannels);
            RepositoryFacade repositoryFacade = this.repos;
            c193151.L$0 = null;
            c193151.L$1 = anyChannelPaginationRequest;
            c193151.label = 1;
            objSelectChannels = repositoryFacade.selectChannels(list, anyChannelPaginationRequest, c193151);
            if (objSelectChannels == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            anyChannelPaginationRequest = (AnyChannelPaginationRequest) c193151.L$1;
            AbstractC34132o.m107864I(objSelectChannels);
        }
        return ChannelKt.applyPagination((Collection) objSelectChannels, anyChannelPaginationRequest);
    }

    private final Object updateDataFromLocalChannel(Channel channel, boolean z4, int i13, boolean z13, boolean z14, boolean z15, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "[updateDataFromLocalChannel] localChannel.cid: ", channel.getCid(), ", messageLimit: ", ", scrollUpdate: ");
            AbstractC38963t7.m124392v(sbM30467u, z13, ", shouldRefreshMessages: ", z14, ", isChannelsStateUpdate: ");
            sbM30467u.append(z15);
            interfaceC2344j.log(enumC2341g, str, sbM30467u.toString(), null);
        }
        Boolean hidden = channel.getHidden();
        if (hidden != null) {
            this.stateLogic.setHidden(hidden.booleanValue());
        }
        Date hiddenMessagesBefore = channel.getHiddenMessagesBefore();
        if (hiddenMessagesBefore != null) {
            this.stateLogic.hideMessagesBefore(hiddenMessagesBefore);
        }
        updateDataForChannel(channel, i13, z14, z13, z4, z15, interfaceC30057d);
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return C23454a0.f92919a;
    }

    public static /* synthetic */ Object updateDataFromLocalChannel$default(ChannelLogicLegacyImpl channelLogicLegacyImpl, Channel channel, boolean z4, int i13, boolean z13, boolean z14, boolean z15, InterfaceC30057d interfaceC30057d, int i14, Object obj) {
        if ((i14 & 32) != 0) {
            z15 = false;
        }
        channelLogicLegacyImpl.updateDataFromLocalChannel(channel, z4, i13, z13, z14, z15, interfaceC30057d);
        return C23454a0.f92919a;
    }

    private final void updateOldMessagesFromLocalChannel(Channel localChannel) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[updateOldMessagesFromLocalChannel] localChannel.cid: ", localChannel.getCid()), null);
        }
        Boolean hidden = localChannel.getHidden();
        if (hidden != null) {
            this.stateLogic.setHidden(hidden.booleanValue());
        }
        this.stateLogic.updateOldMessagesFromChannel(localChannel);
    }

    private final WatchChannelRequest watchChannelRequest(Pagination pagination, int limit, String baseMessageId) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[watchChannelRequest] pagination: " + pagination + ", limit: " + limit + ", baseMessageId: " + baseMessageId, null);
        }
        if (baseMessageId == null) {
            Message loadMoreBaseMessage = getLoadMoreBaseMessage(pagination);
            if (loadMoreBaseMessage != null) {
                C2345k logger2 = getLogger();
                InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
                String str2 = logger2.f9273a;
                EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
                if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                    logger2.f9274b.log(enumC2341g2, str2, AbstractC31061c.m95640p("[watchChannelRequest] baseMessage(", loadMoreBaseMessage.getId(), "): ", loadMoreBaseMessage.getText()), null);
                }
                baseMessageId = loadMoreBaseMessage.getId();
            } else {
                baseMessageId = null;
            }
        }
        QueryChannelPaginationRequest queryChannelPaginationRequest = new QueryChannelPaginationRequest(limit);
        if (baseMessageId != null) {
            queryChannelPaginationRequest.setMessageFilterDirection(pagination);
            queryChannelPaginationRequest.setMessageFilterValue(baseMessageId);
        }
        return queryChannelPaginationRequest.toWatchChannelRequest(this.userPresence);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final void deleteMessage(Message message) {
        AbstractC22676k.m65750j(message, "message");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC31061c.m95640p("[deleteMessage] message.id: ", message.getId(), ", message.text: ", message.getText()), null);
        }
        this.stateLogic.deleteMessage(message);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final String getCid() {
        return this.mutableState.getCid();
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final Date getLastStartTypingEvent() {
        return this.mutableState.getLastStartTypingEvent();
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final Message getMessage(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        Message message = (Message) ((Map) this.mutableState.getVisibleMessages().getValue()).get(messageId);
        if (message != null) {
            return message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false);
        }
        return null;
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final ChannelMessagesUpdateLogic getMessagesUpdateLogic() {
        return this.stateLogic;
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final void handleEvent(ChatEvent event) {
        AbstractC22676k.m65750j(event, "event");
        String str = (String) this.getCurrentUserId.invoke();
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str2 = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("[handleEvent] cid: ", this.mutableState.getCid(), ", currentUserId: ", str, ", event: ");
            sbM32001t.append(event);
            interfaceC2344j.log(enumC2341g, str2, sbM32001t.toString(), null);
        }
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
        this.stateLogic.hideMessagesBefore(date);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final Object loadAfter(String str, int i13, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str2 = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            logger.f9274b.log(enumC2341g, str2, AbstractC25012a.m73374g(i13, "[loadAfter] messageId: ", str, ", limit: "), null);
        }
        this.stateLogic.loadingNewerMessages();
        return runChannelQuery("loadAfter", watchChannelRequest(Pagination.GREATER_THAN, i13, str), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final Object loadAround(String str, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str2 = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            logger.f9274b.log(enumC2341g, str2, AbstractC11266d.m30461o("[loadAround] messageId: ", str), null);
        }
        return runChannelQuery("loadAround", aroundIdWatchChannelRequest(str), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final Object loadBefore(String str, int i13, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str2 = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            logger.f9274b.log(enumC2341g, str2, AbstractC25012a.m73374g(i13, "[loadBefore] messageId: ", str, ", limit: "), null);
        }
        this.stateLogic.loadingOlderMessages();
        return runChannelQuery("loadBefore", watchChannelRequest(Pagination.LESS_THAN, i13, str), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final boolean markRead() {
        return this.stateLogic.markRead();
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final void onQueryChannelResult(QueryChannelRequest query, AbstractC26205h result) {
        AbstractC22676k.m65750j(query, "query");
        AbstractC22676k.m65750j(result, "result");
        if (result instanceof C26204g) {
            this.stateLogic.propagateChannelQuery((Channel) ((C26204g) result).f103919a, query);
        } else {
            if (!(result instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            this.stateLogic.propagateQueryError(((C26203f) result).f103918a);
        }
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final void removeMessagesBefore(Date date) {
        AbstractC22676k.m65750j(date, "date");
        ChannelStateLogic.removeMessagesBefore$default(this.stateLogic, date, null, 2, null);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final void setHidden(boolean hidden) {
        this.stateLogic.setHidden(hidden);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final void setKeystrokeParentMessageId(String messageId) {
        this.mutableState.setKeystrokeParentMessageId$stream_chat_android_client_release(messageId);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final void setLastStartTypingEvent(Date date) {
        this.mutableState.setLastStartTypingEvent(date);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final void setPaginationDirection(QueryChannelRequest query) {
        AbstractC22676k.m65750j(query, "query");
        if (query.filteringOlderMessages()) {
            this.stateLogic.loadingOlderMessages();
        } else if (query.isFilteringNewerMessages()) {
            this.stateLogic.loadingNewerMessages();
        } else {
            if (query.isFilteringMessages()) {
                return;
            }
            this.stateLogic.loadingNewestMessages();
        }
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final void setPushPreference(PushPreference preference) {
        AbstractC22676k.m65750j(preference, "preference");
        this.stateLogic.setPushPreference(preference);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final void setRepliedMessage(Message message) {
        this.stateLogic.setRepliedMessage(message);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final boolean typingEventsEnabled() {
        return ((Config) this.mutableState.getChannelConfig().getValue()).getTypingEventsEnabled();
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final Object updateDataForChannel(Channel channel, int i13, boolean z4, boolean z13, boolean z14, boolean z15, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        ChannelStateLogic.updateDataForChannel$default(this.stateLogic, channel, i13, z4, z13, z14, z15, false, 64, null);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final void updateLastMessageAt(Message message) {
        AbstractC22676k.m65750j(message, "message");
        this.stateLogic.updateLastMessageAt(message);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final Object updateStateFromDatabase(QueryChannelRequest queryChannelRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objRunChannelQueryOffline;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[updateStateFromDatabase] request: " + queryChannelRequest, null);
        }
        if (!queryChannelRequest.getIsNotificationUpdate()) {
            this.stateLogic.syncMuteState$stream_chat_android_client_release();
            if (!queryChannelRequest.isFilteringNewerMessages() && (objRunChannelQueryOffline = runChannelQueryOffline(queryChannelRequest, interfaceC30057d)) == EnumC31071a.f128113w) {
                return objRunChannelQueryOffline;
            }
        }
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final void upsertMembers(List<Member> members) {
        AbstractC22676k.m65750j(members, "members");
        this.stateLogic.upsertMembers(members);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final void upsertMessage(Message message) {
        AbstractC22676k.m65750j(message, "message");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC31061c.m95640p("[upsertMessage] message.id: ", message.getId(), ", message.text: ", message.getText()), null);
        }
        this.stateLogic.upsertMessage(message);
    }

    @Override // io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic
    public final Object watch(int i13, boolean z4, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[watch] messagesLimit: " + i13 + ", userPresence: " + z4, null);
        }
        if (!((Boolean) this.mutableState.getLoading().getValue()).booleanValue()) {
            this.stateLogic.loadingNewestMessages();
            WatchChannelRequest watchChannelRequest = new QueryChannelPaginationRequest(i13).toWatchChannelRequest(z4);
            watchChannelRequest.setShouldRefresh(true);
            return runChannelQuery("watch", watchChannelRequest, interfaceC30057d);
        }
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
        String str2 = logger2.f9273a;
        if (interfaceC2339e2.isLoggable(enumC2341g, str2)) {
            logger2.f9274b.log(enumC2341g, str2, "Another request to watch this channel is in progress. Ignoring this request.", null);
        }
        return new C26203f(new C26198a("Another request to watch this channel is in progress. Ignoring this request."));
    }
}
