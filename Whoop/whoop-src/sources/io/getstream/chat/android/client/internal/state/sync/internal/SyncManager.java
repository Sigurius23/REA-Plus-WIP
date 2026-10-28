package io.getstream.chat.android.client.internal.state.sync.internal;

import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import androidx.recyclerview.widget.AbstractC1707m0;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import bc3.AbstractC3006f0;
import bc3.C2986a0;
import bc3.C3004e2;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13052j1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13075p1;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.ChatEventListener;
import io.getstream.chat.android.client.api.state.StateRegistry;
import io.getstream.chat.android.client.channel.state.ChannelState;
import io.getstream.chat.android.client.errors.NetworkErrorKt;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.events.ConnectedEvent;
import io.getstream.chat.android.client.events.ConnectingEvent;
import io.getstream.chat.android.client.events.DisconnectedEvent;
import io.getstream.chat.android.client.events.HealthEvent;
import io.getstream.chat.android.client.events.MarkAllReadEvent;
import io.getstream.chat.android.client.extensions.internal.MessageReactionsKt;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.thread.internal.ThreadLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry;
import io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.querythreads.internal.QueryThreadsLogic;
import io.getstream.chat.android.client.internal.state.plugin.state.global.internal.MutableGlobalState;
import io.getstream.chat.android.client.persistance.repository.RepositoryFacade;
import io.getstream.chat.android.client.setup.state.ClientState;
import io.getstream.chat.android.client.sync.SyncState;
import io.getstream.chat.android.client.sync.SyncStateKt;
import io.getstream.chat.android.client.utils.internal.ServerClockOffset;
import io.getstream.chat.android.client.utils.observable.Disposable;
import io.getstream.chat.android.core.internal.coroutines.Tube;
import io.getstream.chat.android.core.utils.date.DateUtils;
import io.getstream.chat.android.models.DraftMessage;
import io.getstream.chat.android.models.Location;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.SyncStatus;
import io.getstream.chat.android.models.TimeDuration;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import l83.C23454a0;
import l83.InterfaceC23459e;
import l83.InterfaceC23462h;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25267u;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import n23.AbstractC26202e;
import n23.AbstractC26205h;
import n23.C26200c;
import n23.C26201d;
import n23.C26203f;
import n23.C26204g;
import no.nordicsemi.android.dfu.DfuBaseService;
import o23.C27478h;
import o23.InterfaceC27474d;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.jvm.internal.InterfaceC22666f;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\u009e\u0001B\u009d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001c\u0012\u0010\b\u0002\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 ¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020%H\u0016¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020%H\u0096@¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020%H\u0096@¢\u0006\u0004\b+\u0010*J\u0017\u0010/\u001a\u00020%2\u0006\u0010,\u001a\u00020\u001eH\u0001¢\u0006\u0004\b-\u0010.J\u001e\u00103\u001a\u00020%2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0081@¢\u0006\u0004\b1\u00102J\u0010\u00105\u001a\u00020%H\u0081@¢\u0006\u0004\b4\u0010*J\u000f\u00106\u001a\u00020%H\u0002¢\u0006\u0004\b6\u0010'J\u0010\u00107\u001a\u00020%H\u0082@¢\u0006\u0004\b7\u0010*J\u0019\u00109\u001a\u00020%2\b\u00108\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b9\u0010:J\u0018\u0010<\u001a\u00020%2\u0006\u0010;\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010%H\u0082@¢\u0006\u0004\b>\u0010*J\u0010\u00103\u001a\u00020%H\u0082@¢\u0006\u0004\b3\u0010*J\"\u0010B\u001a\u00020%2\u0006\u0010@\u001a\u00020?2\b\u0010A\u001a\u0004\u0018\u00010\u0002H\u0082@¢\u0006\u0004\bB\u0010CJ \u0010E\u001a\u00020%2\u0006\u0010;\u001a\u00020\u00022\u0006\u0010D\u001a\u00020?H\u0082@¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020%H\u0082@¢\u0006\u0004\bG\u0010*J\u0010\u0010H\u001a\u00020%H\u0082@¢\u0006\u0004\bH\u0010*J$\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020K0J2\u0006\u0010I\u001a\u00020\u0010H\u0082@¢\u0006\u0004\bL\u0010MJ&\u0010O\u001a\u00020%2\u0006\u0010I\u001a\u00020\u00102\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00020KH\u0082@¢\u0006\u0004\bO\u0010PJ\u0010\u0010Q\u001a\u00020%H\u0082@¢\u0006\u0004\bQ\u0010*J\u0010\u0010R\u001a\u00020%H\u0082@¢\u0006\u0004\bR\u0010*J\u0010\u0010S\u001a\u00020%H\u0082@¢\u0006\u0004\bS\u0010*J\u001e\u0010V\u001a\b\u0012\u0004\u0012\u00020U0J2\u0006\u0010T\u001a\u00020\u0002H\u0082@¢\u0006\u0004\bV\u0010=J\u0010\u0010W\u001a\u00020%H\u0082@¢\u0006\u0004\bW\u0010*J\u001c\u0010Y\u001a\u00020%*\u00020\n2\u0006\u0010X\u001a\u00020UH\u0082@¢\u0006\u0004\bY\u0010ZJ(\u0010a\u001a\n\u0012\u0006\b\u0001\u0012\u00020`0_2\u0006\u0010\\\u001a\u00020[2\u0006\u0010^\u001a\u00020]H\u0082@¢\u0006\u0004\ba\u0010bJ(\u0010c\u001a\n\u0012\u0006\b\u0001\u0012\u00020`0_2\u0006\u0010^\u001a\u00020]2\u0006\u0010\\\u001a\u00020[H\u0082@¢\u0006\u0004\bc\u0010dJ.\u0010g\u001a\b\u0012\u0004\u0012\u00020`0J2\u0006\u0010\\\u001a\u00020\u00022\u0006\u0010X\u001a\u00020U2\u0006\u0010f\u001a\u00020eH\u0082@¢\u0006\u0004\bg\u0010hJ.\u0010i\u001a\b\u0012\u0004\u0012\u00020`0J2\u0006\u0010\\\u001a\u00020\u00022\u0006\u0010X\u001a\u00020U2\u0006\u0010f\u001a\u00020eH\u0082@¢\u0006\u0004\bi\u0010hJ.\u0010j\u001a\b\u0012\u0004\u0012\u00020`0J2\u0006\u0010X\u001a\u00020U2\u0006\u0010\\\u001a\u00020\u00022\u0006\u0010f\u001a\u00020eH\u0082@¢\u0006\u0004\bj\u0010kJ\u001e\u0010l\u001a\b\u0012\u0004\u0012\u00020%0_2\u0006\u0010^\u001a\u00020]H\u0082@¢\u0006\u0004\bl\u0010mJ\u001e\u0010n\u001a\b\u0012\u0004\u0012\u00020%0_2\u0006\u0010X\u001a\u00020UH\u0082@¢\u0006\u0004\bn\u0010oJ\u001f\u0010p\u001a\u00020\u0010*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0JH\u0002¢\u0006\u0004\bp\u0010qJ\u0015\u0010r\u001a\u00020\u0010*\u0004\u0018\u00010?H\u0002¢\u0006\u0004\br\u0010sJ\u0015\u0010t\u001a\u00020\u0010*\u0004\u0018\u00010?H\u0002¢\u0006\u0004\bt\u0010sR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010uR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010vR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010wR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010xR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010yR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010zR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010{R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010|R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010|R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010}R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010~R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u007fR!\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010\u0080\u0001R\u001d\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\"\u0010\u0081\u0001R!\u0010\u0087\u0001\u001a\u00030\u0082\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0017\u0010\u0088\u0001\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001c\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001c\u00108\u001a\t\u0012\u0005\u0012\u00030\u0093\u00010 8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b8\u0010\u0081\u0001R,\u0010\u0095\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u0094\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u008c\u0001R\u001f\u0010\u009c\u0001\u001a\n\u0012\u0005\u0012\u00030\u009b\u00010\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001¨\u0006\u009f\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;", "Lio/getstream/chat/android/client/internal/state/sync/internal/SyncHistoryManager;", "", "currentUserId", "Lio/getstream/chat/android/client/ChatClient;", "chatClient", "Lio/getstream/chat/android/client/setup/state/ClientState;", "clientState", "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;", "mutableGlobalState", "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;", "repos", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "logicRegistry", "Lio/getstream/chat/android/client/api/state/StateRegistry;", "stateRegistry", "", "userPresence", "isAutomaticSyncOnReconnectEnabled", "Lio/getstream/chat/android/models/TimeDuration;", "syncMaxThreshold", "Lkotlin/Function0;", "", "now", "Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;", "serverClockOffset", "Lbc3/c0;", "scope", "Lio/getstream/chat/android/core/internal/coroutines/Tube;", "", "Lio/getstream/chat/android/client/events/ChatEvent;", "events", "Lec3/p1;", "Lio/getstream/chat/android/client/sync/SyncState;", "syncState", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/api/state/StateRegistry;ZZLio/getstream/chat/android/models/TimeDuration;Lc93/a;Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;Lbc3/c0;Lio/getstream/chat/android/core/internal/coroutines/Tube;Lec3/p1;)V", "Ll83/a0;", "start", "()V", "stop", "sync", "(Lq83/d;)Ljava/lang/Object;", "awaitSyncing", NotificationCompat.CATEGORY_EVENT, "onEvent$stream_chat_android_client_release", "(Lio/getstream/chat/android/client/events/ChatEvent;)V", "onEvent", "cids", "performSync$stream_chat_android_client_release", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "performSync", "retryMessages$stream_chat_android_client_release", "retryMessages", "scheduleLiveLocationMessageUpdates", "syncOfflineDraftMessages", "state", "setSyncState", "(Lio/getstream/chat/android/client/sync/SyncState;)V", "userId", "onConnectionEstablished", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "onConnectionLost", "Ljava/util/Date;", "latestEventDate", "rawLatestEventDate", "updateLastSyncedDate", "(Ljava/util/Date;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "currentDate", "updateAllReadStateForDate", "(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;", "retryFailedEntities", "restoreActiveChannels", "recoverAll", "Ln23/h;", "", "updateActiveQueryChannels", "(ZLq83/d;)Ljava/lang/Object;", "cidsToExclude", "updateActiveChannels", "(ZLjava/util/Set;Lq83/d;)Ljava/lang/Object;", "retryChannels", "retryReactions", "retryMessagesWithSyncedAttachments", "messageId", "Lio/getstream/chat/android/models/Message;", "retryDeleteMessageForMe", "retryMessagesWithPendingAttachments", "message", "markMessageAsFailed", "(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "", "id", "Lio/getstream/chat/android/models/Reaction;", "reaction", "Lo23/d;", "", "retryReactionDeletion", "(ILio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;", "retryReactionSending", "(Lio/getstream/chat/android/models/Reaction;ILq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/channel/ChannelClient;", "channelClient", "retryDeletionOfMessageWithSyncedAttachments", "(Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/channel/ChannelClient;Lq83/d;)Ljava/lang/Object;", "retryUpdateOfMessageWithSyncedAttachments", "retrySendingOfMessageWithSyncedAttachments", "(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Lio/getstream/chat/android/client/channel/ChannelClient;Lq83/d;)Ljava/lang/Object;", "removeReaction", "(Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;", "removeMessage", "(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "isTooManyEventsToSyncError", "(Ln23/h;)Z", "exceedsSyncThreshold", "(Ljava/util/Date;)Z", "exceedsSyncThresholdServerTime", "Ljava/lang/String;", "Lio/getstream/chat/android/client/ChatClient;", "Lio/getstream/chat/android/client/setup/state/ClientState;", "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;", "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "Lio/getstream/chat/android/client/api/state/StateRegistry;", "Z", "Lio/getstream/chat/android/models/TimeDuration;", "Lc93/a;", "Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;", "Lio/getstream/chat/android/core/internal/coroutines/Tube;", "Lec3/p1;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "syncScope", "Lbc3/c0;", "Lmc3/a;", "entitiesRetryMutex", "Lmc3/a;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isFirstConnect", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lio/getstream/chat/android/client/utils/observable/Disposable;", "eventsDisposable", "Lio/getstream/chat/android/client/utils/observable/Disposable;", "Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$State;", "Lec3/l;", "syncedEvents", "Lec3/l;", "getSyncedEvents", "()Lec3/l;", "mutex", "", "Lbc3/k1;", "liveLocationJobs", "Ljava/util/List;", "State", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SyncManager implements SyncHistoryManager {
    private final ChatClient chatClient;
    private final ClientState clientState;
    private final String currentUserId;
    private final InterfaceC25435a entitiesRetryMutex;
    private final Tube<List<ChatEvent>> events;
    private Disposable eventsDisposable;
    private final boolean isAutomaticSyncOnReconnectEnabled;
    private final AtomicBoolean isFirstConnect;
    private final List<InterfaceC3027k1> liveLocationJobs;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final LogicRegistry logicRegistry;
    private final MutableGlobalState mutableGlobalState;
    private final InterfaceC25435a mutex;
    private final InterfaceC4339a now;
    private final RepositoryFacade repos;
    private final ServerClockOffset serverClockOffset;
    private final InterfaceC13075p1 state;
    private final StateRegistry stateRegistry;
    private final TimeDuration syncMaxThreshold;
    private final InterfaceC2994c0 syncScope;
    private final InterfaceC13075p1 syncState;
    private final InterfaceC13058l syncedEvents;
    private final boolean userPresence;

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$State;", "", "<init>", "(Ljava/lang/String;I)V", "Idle", "Syncing", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public enum State {
        Idle,
        Syncing;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$awaitSyncing$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.sync.internal.SyncManager", m100430f = "SyncManager.kt", m100431l = {151}, m100432m = "awaitSyncing")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193471 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C193471(InterfaceC30057d<? super C193471> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SyncManager.this.awaitSyncing(this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$awaitSyncing$3 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$awaitSyncing$3", m100430f = "SyncManager.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m65681d2 = {"<anonymous>", "", "it", "Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$State;"}, m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193483 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ Object L$0;
        int label;

        public C193483(InterfaceC30057d<? super C193483> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C193483 c193483 = new C193483(2, interfaceC30057d);
            c193483.L$0 = obj;
            return c193483;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(State state, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((C193483) create(state, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            State state = (State) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return Boolean.valueOf(state == State.Idle);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$onConnectionEstablished$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.sync.internal.SyncManager", m100430f = "SyncManager.kt", m100431l = {246, AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION, 254, 255}, m100432m = "onConnectionEstablished")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193491 extends AbstractC32269c {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C193491(InterfaceC30057d<? super C193491> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SyncManager.this.onConnectionEstablished(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$onConnectionLost$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.sync.internal.SyncManager", m100430f = "SyncManager.kt", m100431l = {277}, m100432m = "onConnectionLost")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193501 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C193501(InterfaceC30057d<? super C193501> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SyncManager.this.onConnectionLost(this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$performSync$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.sync.internal.SyncManager", m100430f = "SyncManager.kt", m100431l = {289, 783, 292}, m100432m = "performSync")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193521 extends AbstractC32269c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C193521(InterfaceC30057d<? super C193521> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SyncManager.this.performSync(this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$performSync$4 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.sync.internal.SyncManager", m100430f = "SyncManager.kt", m100431l = {303, 309, 311, 315, 328, 332, 343}, m100432m = "performSync$stream_chat_android_client_release")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193534 extends AbstractC32269c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        public C193534(InterfaceC30057d<? super C193534> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SyncManager.this.performSync$stream_chat_android_client_release(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$removeMessage$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$removeMessage$2", m100430f = "SyncManager.kt", m100431l = {722}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C193542 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Message $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C193542(Message message, InterfaceC30057d<? super C193542> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$message = message;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SyncManager.this.new C193542(this.$message, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C193542) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C2345k logger = SyncManager.this.getLogger();
                    Message message = this.$message;
                    InterfaceC2339e interfaceC2339e = logger.f9275c;
                    String str = logger.f9273a;
                    EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                    if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                        logger.f9274b.log(enumC2341g, str, "[removeMessage] message.id: " + message.getId(), null);
                    }
                    RepositoryFacade repositoryFacade = SyncManager.this.repos;
                    Message message2 = this.$message;
                    this.label = 1;
                    if (repositoryFacade.deleteChannelMessage(message2, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                ChannelLogic channelLogicChannelFromMessage = SyncManager.this.logicRegistry.channelFromMessage(this.$message);
                if (channelLogicChannelFromMessage != null) {
                    channelLogicChannelFromMessage.deleteMessage(this.$message);
                }
                List<QueryThreadsLogic> activeQueryThreadsLogic = SyncManager.this.logicRegistry.getActiveQueryThreadsLogic();
                Message message3 = this.$message;
                Iterator<T> it = activeQueryThreadsLogic.iterator();
                while (it.hasNext()) {
                    ((QueryThreadsLogic) it.next()).deleteMessage$stream_chat_android_client_release(message3);
                }
                ThreadLogic threadLogicThreadFromMessage = SyncManager.this.logicRegistry.threadFromMessage(this.$message);
                if (threadLogicThreadFromMessage != null) {
                    threadLogicThreadFromMessage.deleteMessage$stream_chat_android_client_release(this.$message);
                }
                C2345k logger2 = SyncManager.this.getLogger();
                Message message4 = this.$message;
                InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
                String str2 = logger2.f9273a;
                EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
                if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                    logger2.f9274b.log(enumC2341g2, str2, "[removeMessage] completed: " + message4.getId(), null);
                }
                return new C26204g(C23454a0.f92919a);
            } catch (Throwable th3) {
                C2345k logger3 = SyncManager.this.getLogger();
                Message message5 = this.$message;
                InterfaceC2339e interfaceC2339e3 = logger3.f9275c;
                String str3 = logger3.f9273a;
                EnumC2341g enumC2341g3 = EnumC2341g.ERROR;
                if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
                    logger3.f9274b.log(enumC2341g3, str3, "[removeMessage] failed(" + message5.getId() + "): " + th3, null);
                }
                String message6 = th3.getMessage();
                if (message6 == null) {
                    message6 = "";
                }
                return new C26203f(new C26201d(message6, th3));
            }
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$removeReaction$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$removeReaction$2", m100430f = "SyncManager.kt", m100431l = {702}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C193552 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Reaction $reaction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C193552(Reaction reaction, InterfaceC30057d<? super C193552> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$reaction = reaction;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SyncManager.this.new C193552(this.$reaction, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C193552) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Message message$stream_chat_android_client_release;
            Message message;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C2345k logger = SyncManager.this.getLogger();
                    Reaction reaction = this.$reaction;
                    InterfaceC2339e interfaceC2339e = logger.f9275c;
                    String str = logger.f9273a;
                    EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                    if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                        logger.f9274b.log(enumC2341g, str, "[removeReaction] reaction.id: " + reaction.getId(), null);
                    }
                    RepositoryFacade repositoryFacade = SyncManager.this.repos;
                    Reaction reaction2 = this.$reaction;
                    this.label = 1;
                    if (repositoryFacade.deleteReaction(reaction2, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                ChannelLogic channelLogicChannelFromMessageId = SyncManager.this.logicRegistry.channelFromMessageId(this.$reaction.getMessageId());
                if (channelLogicChannelFromMessageId != null && (message = channelLogicChannelFromMessageId.getMessage(this.$reaction.getMessageId())) != null) {
                    MessageReactionsKt.removeMyReaction(message, this.$reaction);
                }
                ThreadLogic threadLogicThreadFromMessageId = SyncManager.this.logicRegistry.threadFromMessageId(this.$reaction.getMessageId());
                if (threadLogicThreadFromMessageId != null && (message$stream_chat_android_client_release = threadLogicThreadFromMessageId.getMessage$stream_chat_android_client_release(this.$reaction.getMessageId())) != null) {
                    MessageReactionsKt.removeMyReaction(message$stream_chat_android_client_release, this.$reaction);
                }
                C2345k logger2 = SyncManager.this.getLogger();
                Reaction reaction3 = this.$reaction;
                InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
                String str2 = logger2.f9273a;
                EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
                if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                    logger2.f9274b.log(enumC2341g2, str2, "[removeReaction] completed: " + reaction3.getId(), null);
                }
                return new C26204g(C23454a0.f92919a);
            } catch (Throwable th3) {
                C2345k logger3 = SyncManager.this.getLogger();
                Reaction reaction4 = this.$reaction;
                InterfaceC2339e interfaceC2339e3 = logger3.f9275c;
                String str3 = logger3.f9273a;
                EnumC2341g enumC2341g3 = EnumC2341g.ERROR;
                if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
                    logger3.f9274b.log(enumC2341g3, str3, "[removeReaction] failed(" + reaction4.getId() + "): " + th3, null);
                }
                String message2 = th3.getMessage();
                if (message2 == null) {
                    message2 = "";
                }
                return new C26203f(new C26201d(message2, th3));
            }
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$restoreActiveChannels$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.sync.internal.SyncManager", m100430f = "SyncManager.kt", m100431l = {410, 414}, m100432m = "restoreActiveChannels")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193561 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C193561(InterfaceC30057d<? super C193561> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SyncManager.this.restoreActiveChannels(this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$retryChannels$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.sync.internal.SyncManager", m100430f = "SyncManager.kt", m100431l = {514, 518, 521, 535}, m100432m = "retryChannels")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193571 extends AbstractC32269c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public C193571(InterfaceC30057d<? super C193571> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SyncManager.this.retryChannels(this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$retryDeletionOfMessageWithSyncedAttachments$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.sync.internal.SyncManager", m100430f = "SyncManager.kt", m100431l = {654, 654, 656}, m100432m = "retryDeletionOfMessageWithSyncedAttachments")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193581 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C193581(InterfaceC30057d<? super C193581> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SyncManager.this.retryDeletionOfMessageWithSyncedAttachments(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$retryFailedEntities$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.sync.internal.SyncManager", m100430f = "SyncManager.kt", m100431l = {771, 398, 399, 400}, m100432m = "retryFailedEntities")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193591 extends AbstractC32269c {
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C193591(InterfaceC30057d<? super C193591> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SyncManager.this.retryFailedEntities(this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$retryMessagesWithPendingAttachments$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.sync.internal.SyncManager", m100430f = "SyncManager.kt", m100431l = {595, 599, 603, 608, 608, 611}, m100432m = "retryMessagesWithPendingAttachments")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193601 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        public C193601(InterfaceC30057d<? super C193601> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SyncManager.this.retryMessagesWithPendingAttachments(this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$retryMessagesWithSyncedAttachments$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.sync.internal.SyncManager", m100430f = "SyncManager.kt", m100431l = {565, 569, 573, 575, 577, 580}, m100432m = "retryMessagesWithSyncedAttachments")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193611 extends AbstractC32269c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public C193611(InterfaceC30057d<? super C193611> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SyncManager.this.retryMessagesWithSyncedAttachments(this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$retryReactions$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.sync.internal.SyncManager", m100430f = "SyncManager.kt", m100431l = {550, 554, 556, 558, 559}, m100432m = "retryReactions")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193621 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C193621(InterfaceC30057d<? super C193621> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SyncManager.this.retryReactions(this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$retrySendingOfMessageWithSyncedAttachments$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.sync.internal.SyncManager", m100430f = "SyncManager.kt", m100431l = {682, 682, 684, 686, 691}, m100432m = "retrySendingOfMessageWithSyncedAttachments")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193631 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C193631(InterfaceC30057d<? super C193631> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SyncManager.this.retrySendingOfMessageWithSyncedAttachments(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$retryUpdateOfMessageWithSyncedAttachments$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.sync.internal.SyncManager", m100430f = "SyncManager.kt", m100431l = {668, 668, 670}, m100432m = "retryUpdateOfMessageWithSyncedAttachments")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193641 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C193641(InterfaceC30057d<? super C193641> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SyncManager.this.retryUpdateOfMessageWithSyncedAttachments(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$scheduleLiveLocationMessageUpdates$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$scheduleLiveLocationMessageUpdates$2", m100430f = "SyncManager.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"", "Lio/getstream/chat/android/models/Location;", "locations", "Ll83/a0;", "<anonymous>", "(Ljava/util/List;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C193652 extends AbstractC32275i implements InterfaceC4351m {
        /* synthetic */ Object L$0;
        int label;

        public C193652(InterfaceC30057d<? super C193652> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C193652 c193652 = SyncManager.this.new C193652(interfaceC30057d);
            c193652.L$0 = obj;
            return c193652;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((List<Location>) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            List<Location> list = (List) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C2345k logger = SyncManager.this.getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, AbstractC2875y.m8295h(list.size(), "[scheduleLiveLocationMessageUpdates] locations: "), null);
            }
            Iterator it = SyncManager.this.liveLocationJobs.iterator();
            while (it.hasNext()) {
                ((InterfaceC3027k1) it.next()).cancel((CancellationException) null);
            }
            SyncManager syncManager = SyncManager.this;
            for (Location location : list) {
                Date endAt = location.getEndAt();
                long time = (endAt != null ? endAt.getTime() : ((Number) syncManager.now.invoke()).longValue()) - ((Number) syncManager.now.invoke()).longValue();
                C2345k logger2 = syncManager.getLogger();
                InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
                String str2 = logger2.f9273a;
                EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
                if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                    InterfaceC2344j interfaceC2344j = logger2.f9274b;
                    StringBuilder sbM32001t = AbstractC11895b.m32001t("[scheduleLiveLocationMessageUpdates] cid: ", location.getCid(), ", messageId: ", location.getMessageId(), ", delayMillis: ");
                    sbM32001t.append(time);
                    interfaceC2344j.log(enumC2341g2, str2, sbM32001t.toString(), null);
                }
                syncManager.liveLocationJobs.add(AbstractC3006f0.m8732z(syncManager.syncScope, null, null, new SyncManager$scheduleLiveLocationMessageUpdates$2$3$2(time, syncManager, location, null), 3));
            }
            return C23454a0.f92919a;
        }

        public final Object invoke(List<Location> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C193652 c193652 = (C193652) create(list, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c193652.invokeSuspend(c23454a0);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$start$2 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C193662 implements ChatEventListener, InterfaceC22666f {
        public C193662() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ChatEventListener) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return new C22672i(1, 0, SyncManager.class, SyncManager.this, "onEvent", "onEvent$stream_chat_android_client_release(Lio/getstream/chat/android/client/events/ChatEvent;)V");
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // io.getstream.chat.android.client.ChatEventListener
        public final void onEvent(ChatEvent p13) {
            AbstractC22676k.m65750j(p13, "p0");
            SyncManager.this.onEvent$stream_chat_android_client_release(p13);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$sync$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.sync.internal.SyncManager", m100430f = "SyncManager.kt", m100431l = {142}, m100432m = "sync")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193671 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C193671(InterfaceC30057d<? super C193671> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SyncManager.this.sync(this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$syncOfflineDraftMessages$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.sync.internal.SyncManager", m100430f = "SyncManager.kt", m100431l = {227}, m100432m = "syncOfflineDraftMessages")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193681 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C193681(InterfaceC30057d<? super C193681> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SyncManager.this.syncOfflineDraftMessages(this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$updateActiveChannels$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.sync.internal.SyncManager", m100430f = "SyncManager.kt", m100431l = {487, 497, 499, 508}, m100432m = "updateActiveChannels")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193691 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$14;
        Object L$15;
        Object L$16;
        Object L$17;
        Object L$18;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        public C193691(InterfaceC30057d<? super C193691> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SyncManager.this.updateActiveChannels(false, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$updateActiveQueryChannels$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.sync.internal.SyncManager", m100430f = "SyncManager.kt", m100431l = {445}, m100432m = "updateActiveQueryChannels")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193701 extends AbstractC32269c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C193701(InterfaceC30057d<? super C193701> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SyncManager.this.updateActiveQueryChannels(false, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$updateAllReadStateForDate$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.sync.internal.SyncManager", m100430f = "SyncManager.kt", m100431l = {376, 382}, m100432m = "updateAllReadStateForDate")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193711 extends AbstractC32269c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C193711(InterfaceC30057d<? super C193711> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SyncManager.this.updateAllReadStateForDate(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$updateLastSyncedDate$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.sync.internal.SyncManager", m100430f = "SyncManager.kt", m100431l = {357}, m100432m = "updateLastSyncedDate")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193721 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C193721(InterfaceC30057d<? super C193721> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SyncManager.this.updateLastSyncedDate(null, null, this);
        }
    }

    public SyncManager(String currentUserId, ChatClient chatClient, ClientState clientState, MutableGlobalState mutableGlobalState, RepositoryFacade repos, LogicRegistry logicRegistry, StateRegistry stateRegistry, boolean z4, boolean z13, TimeDuration syncMaxThreshold, InterfaceC4339a now, ServerClockOffset serverClockOffset, InterfaceC2994c0 scope, Tube<List<ChatEvent>> events, InterfaceC13075p1 syncState) {
        AbstractC22676k.m65750j(currentUserId, "currentUserId");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(clientState, "clientState");
        AbstractC22676k.m65750j(mutableGlobalState, "mutableGlobalState");
        AbstractC22676k.m65750j(repos, "repos");
        AbstractC22676k.m65750j(logicRegistry, "logicRegistry");
        AbstractC22676k.m65750j(stateRegistry, "stateRegistry");
        AbstractC22676k.m65750j(syncMaxThreshold, "syncMaxThreshold");
        AbstractC22676k.m65750j(now, "now");
        AbstractC22676k.m65750j(serverClockOffset, "serverClockOffset");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(events, "events");
        AbstractC22676k.m65750j(syncState, "syncState");
        this.currentUserId = currentUserId;
        this.chatClient = chatClient;
        this.clientState = clientState;
        this.mutableGlobalState = mutableGlobalState;
        this.repos = repos;
        this.logicRegistry = logicRegistry;
        this.stateRegistry = stateRegistry;
        this.userPresence = z4;
        this.isAutomaticSyncOnReconnectEnabled = z13;
        this.syncMaxThreshold = syncMaxThreshold;
        this.now = now;
        this.serverClockOffset = serverClockOffset;
        this.events = events;
        this.syncState = syncState;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:SyncManager");
        this.syncScope = AbstractC3006f0.m8696B(AbstractC3006f0.m8696B(scope, new C3004e2(AbstractC3006f0.m8725s(scope.getCoroutineContext()))), new SyncManager$special$$inlined$CoroutineExceptionHandler$1(C2986a0.f11990w, this));
        this.entitiesRetryMutex = AbstractC25438d.m74669a();
        this.isFirstConnect = new AtomicBoolean(true);
        this.state = AbstractC13091v.m36593c(State.Idle);
        this.syncedEvents = events;
        this.mutex = AbstractC25438d.m74669a();
        this.liveLocationJobs = new ArrayList();
    }

    private final boolean exceedsSyncThreshold(Date date) {
        return date == null || DateUtils.diff(date, ((Number) this.now.invoke()).longValue()).compareTo(this.syncMaxThreshold) > 0;
    }

    private final boolean exceedsSyncThresholdServerTime(Date date) {
        return date == null || DateUtils.diff(date, this.serverClockOffset.estimatedServerTime()).compareTo(this.syncMaxThreshold) > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final boolean isTooManyEventsToSyncError(AbstractC26205h abstractC26205h) {
        AbstractC26202e abstractC26202eM77815a = abstractC26205h.m77815a();
        if (!(abstractC26202eM77815a instanceof C26200c)) {
            return false;
        }
        C26200c c26200c = (C26200c) abstractC26202eM77815a;
        return NetworkErrorKt.isStatusBadRequest(c26200c) && NetworkErrorKt.isValidationError(c26200c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object markMessageAsFailed(RepositoryFacade repositoryFacade, Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objInsertMessage = repositoryFacade.insertMessage(message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : SyncStatus.FAILED_PERMANENTLY, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : new Date(((Number) this.now.invoke()).longValue()), ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false), interfaceC30057d);
        return objInsertMessage == EnumC31071a.f128113w ? objInsertMessage : C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:61:0x0153 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003d, B:73:0x019c, B:75:0x01b5, B:22:0x0053, B:67:0x0177, B:25:0x005e, B:59:0x014f, B:61:0x0153, B:63:0x0163, B:64:0x016a, B:70:0x0185, B:72:0x0195, B:28:0x0069, B:40:0x00db, B:42:0x00e5, B:44:0x00f1, B:46:0x00f7, B:48:0x00fd, B:50:0x010d, B:52:0x011b, B:54:0x0121, B:55:0x0130, B:31:0x0072, B:33:0x0082, B:34:0x009d, B:36:0x00bc, B:37:0x00cd), top: B:82:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0163 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003d, B:73:0x019c, B:75:0x01b5, B:22:0x0053, B:67:0x0177, B:25:0x005e, B:59:0x014f, B:61:0x0153, B:63:0x0163, B:64:0x016a, B:70:0x0185, B:72:0x0195, B:28:0x0069, B:40:0x00db, B:42:0x00e5, B:44:0x00f1, B:46:0x00f7, B:48:0x00fd, B:50:0x010d, B:52:0x011b, B:54:0x0121, B:55:0x0130, B:31:0x0072, B:33:0x0082, B:34:0x009d, B:36:0x00bc, B:37:0x00cd), top: B:82:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0176  */
    /* JADX WARN: Code duplicated, block: B:67:0x0177 A[Catch: all -> 0x0042, PHI: r0
      0x0177: PHI (r0v10 boolean) = (r0v7 boolean), (r0v20 boolean) binds: [B:65:0x0174, B:22:0x0053] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003d, B:73:0x019c, B:75:0x01b5, B:22:0x0053, B:67:0x0177, B:25:0x005e, B:59:0x014f, B:61:0x0153, B:63:0x0163, B:64:0x016a, B:70:0x0185, B:72:0x0195, B:28:0x0069, B:40:0x00db, B:42:0x00e5, B:44:0x00f1, B:46:0x00f7, B:48:0x00fd, B:50:0x010d, B:52:0x011b, B:54:0x0121, B:55:0x0130, B:31:0x0072, B:33:0x0082, B:34:0x009d, B:36:0x00bc, B:37:0x00cd), top: B:82:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0185 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003d, B:73:0x019c, B:75:0x01b5, B:22:0x0053, B:67:0x0177, B:25:0x005e, B:59:0x014f, B:61:0x0153, B:63:0x0163, B:64:0x016a, B:70:0x0185, B:72:0x0195, B:28:0x0069, B:40:0x00db, B:42:0x00e5, B:44:0x00f1, B:46:0x00f7, B:48:0x00fd, B:50:0x010d, B:52:0x011b, B:54:0x0121, B:55:0x0130, B:31:0x0072, B:33:0x0082, B:34:0x009d, B:36:0x00bc, B:37:0x00cd), top: B:82:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0195 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003d, B:73:0x019c, B:75:0x01b5, B:22:0x0053, B:67:0x0177, B:25:0x005e, B:59:0x014f, B:61:0x0153, B:63:0x0163, B:64:0x016a, B:70:0x0185, B:72:0x0195, B:28:0x0069, B:40:0x00db, B:42:0x00e5, B:44:0x00f1, B:46:0x00f7, B:48:0x00fd, B:50:0x010d, B:52:0x011b, B:54:0x0121, B:55:0x0130, B:31:0x0072, B:33:0x0082, B:34:0x009d, B:36:0x00bc, B:37:0x00cd), top: B:82:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01b5 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003d, B:73:0x019c, B:75:0x01b5, B:22:0x0053, B:67:0x0177, B:25:0x005e, B:59:0x014f, B:61:0x0153, B:63:0x0163, B:64:0x016a, B:70:0x0185, B:72:0x0195, B:28:0x0069, B:40:0x00db, B:42:0x00e5, B:44:0x00f1, B:46:0x00f7, B:48:0x00fd, B:50:0x010d, B:52:0x011b, B:54:0x0121, B:55:0x0130, B:31:0x0072, B:33:0x0082, B:34:0x009d, B:36:0x00bc, B:37:0x00cd), top: B:82:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0182, code lost:
    
        if (restoreActiveChannels(r6) == r7) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onConnectionEstablished(java.lang.String r17, q83.InterfaceC30057d<? super l83.C23454a0> r18) {
        /*
            Method dump skipped, instruction units count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager.onConnectionEstablished(java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object onConnectionLost(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C193501 c193501;
        SyncState syncStateCopy$default;
        if (interfaceC30057d instanceof C193501) {
            c193501 = (C193501) interfaceC30057d;
            int i13 = c193501.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c193501.label = i13 - Integer.MIN_VALUE;
            } else {
                c193501 = new C193501(interfaceC30057d);
            }
        } else {
            c193501 = new C193501(interfaceC30057d);
        }
        Object obj = c193501.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c193501.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C2345k logger = getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.INFO;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, "[connectionLost] firstConnect: " + this.isFirstConnect, null);
                }
                ((C13045h2) this.state).m36570j(State.Idle);
                SyncState syncState = (SyncState) ((C13045h2) this.syncState).getValue();
                if (syncState == null) {
                    return null;
                }
                List<ChannelLogic> activeChannelsLogic = this.logicRegistry.getActiveChannelsLogic();
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(activeChannelsLogic, 10));
                Iterator<T> it = activeChannelsLogic.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ChannelLogic) it.next()).getCid());
                }
                C2345k logger2 = getLogger();
                InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
                String str2 = logger2.f9273a;
                EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
                if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                    logger2.f9274b.log(enumC2341g2, str2, "[connectionLost] activeCids.size: " + arrayList.size(), null);
                }
                syncStateCopy$default = SyncState.copy$default(syncState, null, arrayList, null, null, null, 29, null);
                RepositoryFacade repositoryFacade = this.repos;
                c193501.L$0 = null;
                c193501.L$1 = syncStateCopy$default;
                c193501.L$2 = null;
                c193501.I$0 = 0;
                c193501.label = 1;
                if (repositoryFacade.insertSyncState(syncStateCopy$default, c193501) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                syncStateCopy$default = (SyncState) c193501.L$1;
                AbstractC34132o.m107864I(obj);
            }
            setSyncState(syncStateCopy$default);
            C2345k logger3 = getLogger();
            InterfaceC2339e interfaceC2339e3 = logger3.f9275c;
            String str3 = logger3.f9273a;
            EnumC2341g enumC2341g3 = EnumC2341g.VERBOSE;
            if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
                logger3.f9274b.log(enumC2341g3, str3, "[connectionLost] syncState saved", null);
                return c23454a0;
            }
        } catch (Throwable th3) {
            C2345k logger4 = getLogger();
            InterfaceC2339e interfaceC2339e4 = logger4.f9275c;
            String str4 = logger4.f9273a;
            EnumC2341g enumC2341g4 = EnumC2341g.INFO;
            if (interfaceC2339e4.isLoggable(enumC2341g4, str4)) {
                logger4.f9274b.log(enumC2341g4, str4, AbstractC2875y.m8301n("[connectionLost] failed: ", th3), null);
            }
        }
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c5, code lost:
    
        if (r11 == r1) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object performSync(q83.InterfaceC30057d<? super l83.C23454a0> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager.performSync(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object removeMessage(Message message, InterfaceC30057d<? super InterfaceC27474d> interfaceC30057d) {
        return new C27478h(this.syncScope, new C193542(message, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object removeReaction(Reaction reaction, InterfaceC30057d<? super InterfaceC27474d> interfaceC30057d) {
        return new C27478h(this.syncScope, new C193552(reaction, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [io.getstream.chat.android.client.internal.state.sync.internal.SyncManager] */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final Object restoreActiveChannels(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C193561 c193561;
        ?? r10;
        if (interfaceC30057d instanceof C193561) {
            c193561 = (C193561) interfaceC30057d;
            int i13 = c193561.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c193561.label = i13 - Integer.MIN_VALUE;
            } else {
                c193561 = new C193561(interfaceC30057d);
            }
        } else {
            c193561 = new C193561(interfaceC30057d);
        }
        Object objUpdateActiveQueryChannels = c193561.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c193561.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objUpdateActiveQueryChannels);
            ?? r14 = !this.isFirstConnect.compareAndSet(true, false);
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30462p("[restoreActiveChannels] recoverAll: ", r14), null);
            }
            c193561.I$0 = r14;
            c193561.label = 1;
            objUpdateActiveQueryChannels = updateActiveQueryChannels(r14, c193561);
            r10 = r14;
            if (objUpdateActiveQueryChannels != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objUpdateActiveQueryChannels);
            return c23454a0;
        }
        int i15 = c193561.I$0;
        AbstractC34132o.m107864I(objUpdateActiveQueryChannels);
        r10 = i15;
        AbstractC26205h abstractC26205h = (AbstractC26205h) objUpdateActiveQueryChannels;
        if (abstractC26205h instanceof C26204g) {
            Set set = (Set) ((C26204g) abstractC26205h).f103919a;
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
            String str2 = logger2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                logger2.f9274b.log(enumC2341g2, str2, AbstractC2875y.m8295h(set.size(), "[restoreActiveChannels] updatedCids.size: "), null);
            }
            boolean z4 = r10 != 0;
            c193561.L$0 = null;
            c193561.L$1 = null;
            c193561.I$0 = r10;
            c193561.label = 2;
            if (updateActiveChannels(z4, set, c193561) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (!(abstractC26205h instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            C2345k logger3 = getLogger();
            InterfaceC2339e interfaceC2339e3 = logger3.f9275c;
            String str3 = logger3.f9273a;
            EnumC2341g enumC2341g3 = EnumC2341g.ERROR;
            if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
                logger3.f9274b.log(enumC2341g3, str3, "[restoreActiveChannels] failed: " + ((C26203f) abstractC26205h).f103918a, null);
            }
        }
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:35:0x0114  */
    /* JADX WARN: Code duplicated, block: B:39:0x011f  */
    /* JADX WARN: Code duplicated, block: B:41:0x012b  */
    /* JADX WARN: Code duplicated, block: B:43:0x013b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0162  */
    /* JADX WARN: Code duplicated, block: B:63:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x011c -> B:65:0x020e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01ea -> B:60:0x01ec). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object retryChannels(q83.InterfaceC30057d<? super l83.C23454a0> r18) {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager.retryChannels(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object retryDeleteMessageForMe(String str, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str2 = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            logger.f9274b.log(enumC2341g, str2, AbstractC11266d.m30461o("[retryDeleteMessageForMe] messageId: ", str), null);
        }
        return this.chatClient.deleteMessageForMe(str).await(interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c6, code lost:
    
        if (r14 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e1, code lost:
    
        if (r14 == r1) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object retryDeletionOfMessageWithSyncedAttachments(java.lang.String r11, io.getstream.chat.android.models.Message r12, io.getstream.chat.android.client.channel.ChannelClient r13, q83.InterfaceC30057d<? super n23.AbstractC26205h> r14) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager.retryDeletionOfMessageWithSyncedAttachments(java.lang.String, io.getstream.chat.android.models.Message, io.getstream.chat.android.client.channel.ChannelClient, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:52:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c7 A[Catch: all -> 0x00a1, PHI: r2 r3 r14
      0x00c7: PHI (r2v7 int) = (r2v6 int), (r2v12 int) binds: [B:51:0x00c4, B:23:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r3v4 int) = (r3v3 int), (r3v8 int) binds: [B:51:0x00c4, B:23:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r14v9 mc3.a) = (r14v6 mc3.a), (r14v19 mc3.a) binds: [B:51:0x00c4, B:23:0x004d] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x00a1, blocks: (B:53:0x00c7, B:50:0x00b8, B:41:0x0089, B:43:0x0099, B:46:0x00a6), top: B:70:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e7 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #4 {all -> 0x0037, blocks: (B:15:0x0032, B:57:0x00d7, B:59:0x00e7), top: B:75:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object retryFailedEntities(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C193591 c193591;
        InterfaceC25435a interfaceC25435a;
        int i13;
        int i14;
        int i15;
        InterfaceC25435a interfaceC25435a2;
        Throwable th3;
        C2345k logger;
        InterfaceC2339e interfaceC2339e;
        String str;
        EnumC2341g enumC2341g;
        if (interfaceC30057d instanceof C193591) {
            c193591 = (C193591) interfaceC30057d;
            int i16 = c193591.label;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                c193591.label = i16 - Integer.MIN_VALUE;
            } else {
                c193591 = new C193591(interfaceC30057d);
            }
        } else {
            c193591 = new C193591(interfaceC30057d);
        }
        Object obj = c193591.result;
        Object obj2 = EnumC31071a.f128113w;
        int i17 = c193591.label;
        try {
            try {
                if (i17 == 0) {
                    AbstractC34132o.m107864I(obj);
                    interfaceC25435a = this.entitiesRetryMutex;
                    c193591.L$0 = interfaceC25435a;
                    c193591.I$0 = 0;
                    c193591.label = 1;
                    if (interfaceC25435a.mo68211b(c193591) != obj2) {
                        i13 = 0;
                    }
                    return obj2;
                }
                if (i17 != 1) {
                    if (i17 == 2) {
                        int i18 = c193591.I$1;
                        int i19 = c193591.I$0;
                        InterfaceC25435a interfaceC25435a3 = (InterfaceC25435a) c193591.L$0;
                        try {
                            AbstractC34132o.m107864I(obj);
                            i14 = i19;
                            i15 = i18;
                            interfaceC25435a = interfaceC25435a3;
                            c193591.L$0 = interfaceC25435a;
                            c193591.I$0 = i14;
                            c193591.I$1 = i15;
                            c193591.label = 3;
                            if (retryMessages$stream_chat_android_client_release(c193591) == obj2) {
                                c193591.L$0 = interfaceC25435a;
                                c193591.I$0 = i14;
                                c193591.I$1 = i15;
                                c193591.label = 4;
                                if (retryReactions(c193591) != obj2) {
                                    interfaceC25435a2 = interfaceC25435a;
                                    logger = getLogger();
                                    interfaceC2339e = logger.f9275c;
                                    str = logger.f9273a;
                                    enumC2341g = EnumC2341g.VERBOSE;
                                    if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                                        logger.f9274b.log(enumC2341g, str, "[retryFailedEntities] completed", null);
                                    }
                                    interfaceC25435a2.mo68214i(null);
                                    return C23454a0.f92919a;
                                }
                            }
                            return obj2;
                        } catch (Throwable th4) {
                            th3 = th4;
                            interfaceC25435a2 = interfaceC25435a3;
                        }
                    } else if (i17 == 3) {
                        i15 = c193591.I$1;
                        i14 = c193591.I$0;
                        InterfaceC25435a interfaceC25435a4 = (InterfaceC25435a) c193591.L$0;
                        try {
                            AbstractC34132o.m107864I(obj);
                            interfaceC25435a = interfaceC25435a4;
                            c193591.L$0 = interfaceC25435a;
                            c193591.I$0 = i14;
                            c193591.I$1 = i15;
                            c193591.label = 4;
                            if (retryReactions(c193591) != obj2) {
                                interfaceC25435a2 = interfaceC25435a;
                                logger = getLogger();
                                interfaceC2339e = logger.f9275c;
                                str = logger.f9273a;
                                enumC2341g = EnumC2341g.VERBOSE;
                                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                                    logger.f9274b.log(enumC2341g, str, "[retryFailedEntities] completed", null);
                                }
                                interfaceC25435a2.mo68214i(null);
                                return C23454a0.f92919a;
                            }
                            return obj2;
                        } catch (Throwable th5) {
                            th3 = th5;
                            interfaceC25435a2 = interfaceC25435a4;
                        }
                    } else {
                        if (i17 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC25435a2 = (InterfaceC25435a) c193591.L$0;
                        try {
                            AbstractC34132o.m107864I(obj);
                            logger = getLogger();
                            interfaceC2339e = logger.f9275c;
                            str = logger.f9273a;
                            enumC2341g = EnumC2341g.VERBOSE;
                            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                                logger.f9274b.log(enumC2341g, str, "[retryFailedEntities] completed", null);
                            }
                            interfaceC25435a2.mo68214i(null);
                            return C23454a0.f92919a;
                        } catch (Throwable th6) {
                            th3 = th6;
                        }
                    }
                    interfaceC25435a2.mo68214i(null);
                    throw th3;
                }
                i13 = c193591.I$0;
                InterfaceC25435a interfaceC25435a5 = (InterfaceC25435a) c193591.L$0;
                AbstractC34132o.m107864I(obj);
                interfaceC25435a = interfaceC25435a5;
                C2345k logger2 = getLogger();
                InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
                String str2 = logger2.f9273a;
                EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
                if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                    logger2.f9274b.log(enumC2341g2, str2, "[retryFailedEntities] no args", null);
                }
                c193591.L$0 = interfaceC25435a;
                c193591.I$0 = i13;
                c193591.I$1 = 0;
                c193591.label = 2;
                if (retryChannels(c193591) != obj2) {
                    i14 = i13;
                    i15 = 0;
                    c193591.L$0 = interfaceC25435a;
                    c193591.I$0 = i14;
                    c193591.I$1 = i15;
                    c193591.label = 3;
                    if (retryMessages$stream_chat_android_client_release(c193591) == obj2) {
                        c193591.L$0 = interfaceC25435a;
                        c193591.I$0 = i14;
                        c193591.I$1 = i15;
                        c193591.label = 4;
                        if (retryReactions(c193591) != obj2) {
                            interfaceC25435a2 = interfaceC25435a;
                            logger = getLogger();
                            interfaceC2339e = logger.f9275c;
                            str = logger.f9273a;
                            enumC2341g = EnumC2341g.VERBOSE;
                            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                                logger.f9274b.log(enumC2341g, str, "[retryFailedEntities] completed", null);
                            }
                            interfaceC25435a2.mo68214i(null);
                            return C23454a0.f92919a;
                        }
                    }
                }
                return obj2;
            } catch (Throwable th7) {
                interfaceC25435a2 = interfaceC25435a;
                th3 = th7;
            }
        } catch (Throwable th8) {
            C2345k logger3 = getLogger();
            InterfaceC2339e interfaceC2339e3 = logger3.f9275c;
            String str3 = logger3.f9273a;
            EnumC2341g enumC2341g3 = EnumC2341g.ERROR;
            if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
                logger3.f9274b.log(enumC2341g3, str3, AbstractC2875y.m8301n("[retryFailedEntities] failed: ", th8), th8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x0112  */
    /* JADX WARN: Code duplicated, block: B:29:0x0129  */
    /* JADX WARN: Code duplicated, block: B:33:0x0155  */
    /* JADX WARN: Code duplicated, block: B:36:0x015e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x015e -> B:37:0x015f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x01ce -> B:37:0x015f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0281 -> B:75:0x0284). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object retryMessagesWithPendingAttachments(q83.InterfaceC30057d<? super l83.C23454a0> r18) {
        /*
            Method dump skipped, instruction units count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager.retryMessagesWithPendingAttachments(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x010a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0121  */
    /* JADX WARN: Code duplicated, block: B:33:0x014b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0153 A[PHI: r2 r6
      0x0153: PHI (r2v12 int) = (r2v10 int), (r2v13 int), (r2v13 int) binds: [B:35:0x0151, B:68:0x0214, B:69:0x0216] A[DONT_GENERATE, DONT_INLINE]
      0x0153: PHI (r6v20 java.util.Iterator) = (r6v16 java.util.Iterator), (r6v21 java.util.Iterator), (r6v21 java.util.Iterator) binds: [B:35:0x0151, B:68:0x0214, B:69:0x0216] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0151 -> B:36:0x0153). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0201 -> B:66:0x0204). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object retryMessagesWithSyncedAttachments(q83.InterfaceC30057d<? super l83.C23454a0> r14) {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager.retryMessagesWithSyncedAttachments(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object retryReactionDeletion(int i13, Reaction reaction, InterfaceC30057d<? super InterfaceC27474d> interfaceC30057d) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30456j(i13, "[retryReactionDeletion] reaction(", ") for messageId: ", reaction.getMessageId()), null);
        }
        if (!exceedsSyncThreshold(reaction.getDeletedAt())) {
            return ChatClient.deleteReaction$default(this.chatClient, reaction.getMessageId(), reaction.getType(), null, 4, null);
        }
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
        String str2 = logger2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.WARN;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
            logger2.f9274b.log(enumC2341g2, str2, AbstractC2875y.m8296i(i13, "[retryReactionDeletion] outdated deletion(", ")"), null);
        }
        Object objRemoveReaction = removeReaction(reaction, interfaceC30057d);
        return objRemoveReaction == EnumC31071a.f128113w ? objRemoveReaction : (InterfaceC27474d) objRemoveReaction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object retryReactionSending(Reaction reaction, int i13, InterfaceC30057d<? super InterfaceC27474d> interfaceC30057d) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC31061c.m95640p("[retryReactionSending] reaction(", reaction.getId(), ") for messageId: ", reaction.getMessageId()), null);
        }
        if (!exceedsSyncThreshold(reaction.getCreatedLocallyAt())) {
            return this.chatClient.sendReaction(reaction, reaction.getEnforceUnique(), null, reaction.getSkipPush());
        }
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
        String str2 = logger2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.WARN;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
            logger2.f9274b.log(enumC2341g2, str2, AbstractC2875y.m8296i(i13, "[retryReactionSending] outdated sending(", ")"), null);
        }
        Object objRemoveReaction = removeReaction(reaction, interfaceC30057d);
        return objRemoveReaction == EnumC31071a.f128113w ? objRemoveReaction : (InterfaceC27474d) objRemoveReaction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:37:0x0128  */
    /* JADX WARN: Code duplicated, block: B:40:0x0131  */
    /* JADX WARN: Code duplicated, block: B:41:0x0135  */
    /* JADX WARN: Code duplicated, block: B:43:0x013b  */
    /* JADX WARN: Code duplicated, block: B:48:0x015b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0191  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0131 -> B:60:0x01b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0191 -> B:56:0x0192). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object retryReactions(q83.InterfaceC30057d<? super l83.C23454a0> r17) {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager.retryReactions(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x0117  */
    /* JADX WARN: Code duplicated, block: B:49:0x019a  */
    /* JADX WARN: Code duplicated, block: B:51:0x019e  */
    /* JADX WARN: Code duplicated, block: B:53:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:58:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f3, code lost:
    
        if (r2 == r4) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0194, code lost:
    
        if (r1.insertMessage(r5, r3) == r4) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0197, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01bd, code lost:
    
        if (markMessageAsFailed(r1, r13, r3) == r4) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object retrySendingOfMessageWithSyncedAttachments(io.getstream.chat.android.models.Message r66, java.lang.String r67, io.getstream.chat.android.client.channel.ChannelClient r68, q83.InterfaceC30057d<? super n23.AbstractC26205h> r69) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager.retrySendingOfMessageWithSyncedAttachments(io.getstream.chat.android.models.Message, java.lang.String, io.getstream.chat.android.client.channel.ChannelClient, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c6, code lost:
    
        if (r14 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00dc, code lost:
    
        if (r14 == r1) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object retryUpdateOfMessageWithSyncedAttachments(java.lang.String r11, io.getstream.chat.android.models.Message r12, io.getstream.chat.android.client.channel.ChannelClient r13, q83.InterfaceC30057d<? super n23.AbstractC26205h> r14) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager.retryUpdateOfMessageWithSyncedAttachments(java.lang.String, io.getstream.chat.android.models.Message, io.getstream.chat.android.client.channel.ChannelClient, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleLiveLocationMessageUpdates() {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[scheduleLiveLocationMessageUpdates] no args", null);
        }
        AbstractC13091v.m36582H(new C13052j1(this.mutableGlobalState.getActiveLiveLocations(), new C193652(null), 0), this.syncScope);
    }

    private final void setSyncState(SyncState state) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[setSyncState] state: ", state != null ? SyncStateKt.stringify(state) : null), null);
        }
        ((C13045h2) this.syncState).m36570j(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object syncOfflineDraftMessages(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C193681 c193681;
        if (interfaceC30057d instanceof C193681) {
            c193681 = (C193681) interfaceC30057d;
            int i13 = c193681.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c193681.label = i13 - Integer.MIN_VALUE;
            } else {
                c193681 = new C193681(interfaceC30057d);
            }
        } else {
            c193681 = new C193681(interfaceC30057d);
        }
        Object objSelectDraftMessages = c193681.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c193681.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objSelectDraftMessages);
            RepositoryFacade repositoryFacade = this.repos;
            c193681.label = 1;
            objSelectDraftMessages = repositoryFacade.selectDraftMessages(c193681);
            if (objSelectDraftMessages == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objSelectDraftMessages);
        }
        Iterator it = ((Iterable) objSelectDraftMessages).iterator();
        while (it.hasNext()) {
            this.mutableGlobalState.updateDraftMessage((DraftMessage) it.next());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:52:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:55:0x0315  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0315 -> B:56:0x0316). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object updateActiveChannels(boolean r32, java.util.Set<java.lang.String> r33, q83.InterfaceC30057d<? super l83.C23454a0> r34) {
        /*
            Method dump skipped, instruction units count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager.updateActiveChannels(boolean, java.util.Set, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean updateActiveChannels$lambda$68(boolean z4, Set set, ChannelState it) {
        AbstractC22676k.m65750j(it, "it");
        return (it.getRecoveryNeeded() || z4) && !set.contains(it.getCid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String updateActiveChannels$lambda$69(ChannelState it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getCid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:32:0x010f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0144 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0145  */
    /* JADX WARN: Code duplicated, block: B:39:0x0151  */
    /* JADX WARN: Code duplicated, block: B:41:0x0155  */
    /* JADX WARN: Code duplicated, block: B:43:0x016a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0182  */
    /* JADX WARN: Code duplicated, block: B:48:0x018a  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:54:0x01c7 A[LOOP:0: B:52:0x01c1->B:54:0x01c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:58:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:59:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:62:0x0206  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0145 -> B:37:0x014b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object updateActiveQueryChannels(boolean r18, q83.InterfaceC30057d<? super n23.AbstractC26205h> r19) {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager.updateActiveQueryChannels(boolean, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean updateActiveQueryChannels$lambda$56(boolean z4, QueryChannelsLogic queryChannelsLogic) {
        AbstractC22676k.m65750j(queryChannelsLogic, "queryChannelsLogic");
        return ((Boolean) queryChannelsLogic.recoveryNeeded$stream_chat_android_client_release().getValue()).booleanValue() || z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:45:0x0145 A[PHI: r1
      0x0145: PHI (r1v5 java.lang.String) = (r1v3 java.lang.String), (r1v6 java.lang.String) binds: [B:29:0x00d7, B:44:0x0143] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object updateAllReadStateForDate(String str, Date date, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C193711 c193711;
        SyncState syncState;
        String str2;
        SyncState syncState2;
        String str3 = str;
        Date date2 = date;
        if (interfaceC30057d instanceof C193711) {
            c193711 = (C193711) interfaceC30057d;
            int i13 = c193711.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c193711.label = i13 - Integer.MIN_VALUE;
            } else {
                c193711 = new C193711(interfaceC30057d);
            }
        } else {
            c193711 = new C193711(interfaceC30057d);
        }
        Object objSelectSyncState = c193711.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c193711.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 != 0) {
            if (i14 == 1) {
                Date date3 = (Date) c193711.L$1;
                String str4 = (String) c193711.L$0;
                AbstractC34132o.m107864I(objSelectSyncState);
                date2 = date3;
                str3 = str4;
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                syncState2 = (SyncState) c193711.L$3;
                str2 = (String) c193711.L$0;
                AbstractC34132o.m107864I(objSelectSyncState);
            }
            syncState = syncState2;
            str3 = str2;
            if (syncState == null) {
                syncState = new SyncState(str3, null, null, null, null, 30, null);
            }
            setSyncState(syncState);
            return c23454a0;
        }
        AbstractC34132o.m107864I(objSelectSyncState);
        if (!AbstractC22676k.m65745e(this.currentUserId, str3)) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str5 = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, str5)) {
                logger.f9274b.log(enumC2341g, str5, "[updateAllReadStateForDate] rejected (userId mismatch): " + str3 + " != " + date2, null);
            }
            return c23454a0;
        }
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
        String str6 = logger2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str6)) {
            logger2.f9274b.log(enumC2341g2, str6, "[updateAllReadStateForDate] userId: " + str3 + ", currentDate: " + date2, null);
        }
        RepositoryFacade repositoryFacade = this.repos;
        c193711.L$0 = str3;
        c193711.L$1 = date2;
        c193711.label = 1;
        objSelectSyncState = repositoryFacade.selectSyncState(str3, c193711);
        if (objSelectSyncState != enumC31071a) {
        }
        return enumC31071a;
        syncState = (SyncState) objSelectSyncState;
        if (syncState != null) {
            C2345k logger3 = getLogger();
            InterfaceC2339e interfaceC2339e3 = logger3.f9275c;
            String str7 = logger3.f9273a;
            EnumC2341g enumC2341g3 = EnumC2341g.VERBOSE;
            if (interfaceC2339e3.isLoggable(enumC2341g3, str7)) {
                logger3.f9274b.log(enumC2341g3, str7, AbstractC2875y.m8295h(syncState.getActiveChannelIds().size(), "[updateAllReadStateForDate] selectedState.activeCids.zie: "), null);
            }
            Date markedAllReadAt = syncState.getMarkedAllReadAt();
            if (AbstractC22676k.m65745e(markedAllReadAt != null ? Boolean.valueOf(markedAllReadAt.before(date2)) : null, Boolean.TRUE)) {
                SyncState syncStateCopy$default = SyncState.copy$default(syncState, null, null, null, null, date2, 15, null);
                RepositoryFacade repositoryFacade2 = this.repos;
                c193711.L$0 = str3;
                c193711.L$1 = null;
                c193711.L$2 = null;
                c193711.L$3 = syncStateCopy$default;
                c193711.L$4 = null;
                c193711.I$0 = 0;
                c193711.I$1 = 0;
                c193711.label = 2;
                if (repositoryFacade2.insertSyncState(syncStateCopy$default, c193711) != enumC31071a) {
                    str2 = str3;
                    syncState2 = syncStateCopy$default;
                    syncState = syncState2;
                    str3 = str2;
                    if (syncState == null) {
                        syncState = new SyncState(str3, null, null, null, null, 30, null);
                    }
                }
                return enumC31071a;
            }
            if (syncState == null) {
                syncState = new SyncState(str3, null, null, null, null, 30, null);
            }
        } else {
            syncState = new SyncState(str3, null, null, null, null, 30, null);
        }
        setSyncState(syncState);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object updateLastSyncedDate(Date date, String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C193721 c193721;
        Date date2;
        String str2;
        SyncState syncState;
        if (interfaceC30057d instanceof C193721) {
            c193721 = (C193721) interfaceC30057d;
            int i13 = c193721.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c193721.label = i13 - Integer.MIN_VALUE;
            } else {
                c193721 = new C193721(interfaceC30057d);
            }
        } else {
            c193721 = new C193721(interfaceC30057d);
        }
        Object obj = c193721.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c193721.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str3 = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str3)) {
                InterfaceC2344j interfaceC2344j = logger.f9274b;
                StringBuilder sb4 = new StringBuilder("[updateLastSyncedDate] latestEventDate: ");
                date2 = date;
                sb4.append(date2);
                sb4.append(", rawLatestEventDate: ");
                str2 = str;
                sb4.append(str2);
                interfaceC2344j.log(enumC2341g, str3, sb4.toString(), null);
            } else {
                date2 = date;
                str2 = str;
            }
            SyncState syncState2 = (SyncState) ((C13045h2) this.syncState).getValue();
            if (syncState2 != null) {
                SyncState syncStateCopy$default = SyncState.copy$default(syncState2, null, null, date2, str2, null, 19, null);
                RepositoryFacade repositoryFacade = this.repos;
                c193721.L$0 = null;
                c193721.L$1 = null;
                c193721.L$2 = null;
                c193721.L$3 = syncStateCopy$default;
                c193721.I$0 = 0;
                c193721.label = 1;
                if (repositoryFacade.insertSyncState(syncStateCopy$default, c193721) == enumC31071a) {
                    return enumC31071a;
                }
                syncState = syncStateCopy$default;
            }
            return C23454a0.f92919a;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        syncState = (SyncState) c193721.L$3;
        AbstractC34132o.m107864I(obj);
        setSyncState(syncState);
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
        String str4 = logger2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str4)) {
            logger2.f9274b.log(enumC2341g2, str4, "[updateLastSyncedDate] saved", null);
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.chat.android.client.internal.state.sync.internal.SyncHistoryManager
    public final Object awaitSyncing(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C193471 c193471;
        if (interfaceC30057d instanceof C193471) {
            c193471 = (C193471) interfaceC30057d;
            int i13 = c193471.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c193471.label = i13 - Integer.MIN_VALUE;
            } else {
                c193471 = new C193471(interfaceC30057d);
            }
        } else {
            c193471 = new C193471(interfaceC30057d);
        }
        Object obj = c193471.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c193471.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (((C13045h2) this.state).getValue() != State.Idle) {
                C2345k logger = getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.INFO;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, "[awaitSyncing] no args", null);
                }
                InterfaceC13075p1 interfaceC13075p1 = this.state;
                C193483 c193483 = new C193483(2, null);
                c193471.label = 1;
                if (AbstractC13091v.m36616z(interfaceC13075p1, c193483, c193471) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return c23454a0;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
        String str2 = logger2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
            logger2.f9274b.log(enumC2341g2, str2, "[awaitSyncing] completed", null);
        }
        return c23454a0;
    }

    @Override // io.getstream.chat.android.client.internal.state.sync.internal.SyncHistoryManager
    public final InterfaceC13058l getSyncedEvents() {
        return this.syncedEvents;
    }

    public final void onEvent$stream_chat_android_client_release(ChatEvent event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof ConnectingEvent) {
            AbstractC3006f0.m8732z(this.syncScope, null, null, new SyncManager$onEvent$1(this, null), 3);
            return;
        }
        if (event instanceof ConnectedEvent) {
            AbstractC3006f0.m8732z(this.syncScope, null, null, new SyncManager$onEvent$2(this, null), 3);
            return;
        }
        if (event instanceof DisconnectedEvent) {
            AbstractC3006f0.m8732z(this.syncScope, null, null, new SyncManager$onEvent$3(this, null), 3);
        } else if (event instanceof HealthEvent) {
            AbstractC3006f0.m8732z(this.syncScope, null, null, new SyncManager$onEvent$4(this, null), 3);
        } else if (event instanceof MarkAllReadEvent) {
            AbstractC3006f0.m8732z(this.syncScope, null, null, new SyncManager$onEvent$5(this, event, null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:93:0x0328  */
    /* JADX WARN: Code duplicated, block: B:95:0x0332  */
    /* JADX WARN: Code duplicated, block: B:97:0x0342  */
    /* JADX WARN: Code duplicated, block: B:98:0x0356  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x0330 -> B:14:0x0096). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object performSync$stream_chat_android_client_release(java.util.List<java.lang.String> r18, q83.InterfaceC30057d<? super l83.C23454a0> r19) {
        /*
            Method dump skipped, instruction units count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager.performSync$stream_chat_android_client_release(java.util.List, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        if (retryMessagesWithPendingAttachments(r0) == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object retryMessages$stream_chat_android_client_release(q83.InterfaceC30057d<? super l83.C23454a0> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$retryMessages$1
            if (r0 == 0) goto L13
            r0 = r9
            io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$retryMessages$1 r0 = (io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$retryMessages$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$retryMessages$1 r0 = new io.getstream.chat.android.client.internal.state.sync.internal.SyncManager$retryMessages$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            p505ts.AbstractC34132o.m107864I(r9)
            goto L63
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L33:
            p505ts.AbstractC34132o.m107864I(r9)
            goto L5a
        L37:
            p505ts.AbstractC34132o.m107864I(r9)
            b23.k r9 = r8.getLogger()
            b23.e r2 = r9.f9275c
            java.lang.String r6 = r9.f9273a
            b23.g r7 = b23.EnumC2341g.DEBUG
            boolean r2 = r2.isLoggable(r7, r6)
            if (r2 == 0) goto L51
            b23.j r9 = r9.f9274b
            java.lang.String r2 = "[retryMessages] no args"
            r9.log(r7, r6, r2, r3)
        L51:
            r0.label = r5
            java.lang.Object r9 = r8.retryMessagesWithSyncedAttachments(r0)
            if (r9 != r1) goto L5a
            goto L62
        L5a:
            r0.label = r4
            java.lang.Object r9 = r8.retryMessagesWithPendingAttachments(r0)
            if (r9 != r1) goto L63
        L62:
            return r1
        L63:
            b23.k r9 = r8.getLogger()
            b23.e r0 = r9.f9275c
            java.lang.String r1 = r9.f9273a
            b23.g r2 = b23.EnumC2341g.VERBOSE
            boolean r0 = r0.isLoggable(r2, r1)
            if (r0 == 0) goto L7a
            b23.j r9 = r9.f9274b
            java.lang.String r0 = "[retryMessages] completed"
            r9.log(r2, r1, r0, r3)
        L7a:
            l83.a0 r9 = l83.C23454a0.f92919a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.sync.internal.SyncManager.retryMessages$stream_chat_android_client_release(q83.d):java.lang.Object");
    }

    @Override // io.getstream.chat.android.client.internal.state.sync.internal.SyncHistoryManager
    public final void start() {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[start] no args", null);
        }
        Disposable disposable = this.eventsDisposable;
        if (disposable != null ? disposable.getIsDisposed() : true) {
            this.eventsDisposable = this.chatClient.subscribe(new C193662());
        }
    }

    @Override // io.getstream.chat.android.client.internal.state.sync.internal.SyncHistoryManager
    public final void stop() {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[stop] no args", null);
        }
        Disposable disposable = this.eventsDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
        AbstractC3006f0.m8717k(AbstractC3006f0.m8725s(this.syncScope.getCoroutineContext()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.getstream.chat.android.client.internal.state.sync.internal.SyncHistoryManager
    public final Object sync(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C193671 c193671;
        if (interfaceC30057d instanceof C193671) {
            c193671 = (C193671) interfaceC30057d;
            int i13 = c193671.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c193671.label = i13 - Integer.MIN_VALUE;
            } else {
                c193671 = new C193671(interfaceC30057d);
            }
        } else {
            c193671 = new C193671(interfaceC30057d);
        }
        Object obj = c193671.result;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c193671.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "[sync] no args", null);
            }
            ((C13045h2) this.state).m36570j(State.Syncing);
            c193671.label = 1;
            if (performSync(c193671) == obj2) {
                return obj2;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        ((C13045h2) this.state).m36570j(State.Idle);
        return C23454a0.f92919a;
    }

    public /* synthetic */ SyncManager(String str, ChatClient chatClient, ClientState clientState, MutableGlobalState mutableGlobalState, RepositoryFacade repositoryFacade, LogicRegistry logicRegistry, StateRegistry stateRegistry, boolean z4, boolean z13, TimeDuration timeDuration, InterfaceC4339a interfaceC4339a, ServerClockOffset serverClockOffset, InterfaceC2994c0 interfaceC2994c0, Tube tube, InterfaceC13075p1 interfaceC13075p1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, chatClient, clientState, mutableGlobalState, repositoryFacade, logicRegistry, stateRegistry, z4, z13, timeDuration, interfaceC4339a, serverClockOffset, interfaceC2994c0, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? new Tube() : tube, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? AbstractC13091v.m36593c(null) : interfaceC13075p1);
    }
}
