package io.getstream.chat.android.client.internal.state.event.handler.internal;

import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import androidx.recyclerview.widget.AbstractC1707m0;
import androidx.room.AbstractC1772c1;
import b23.C2343i;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import bc3.AbstractC3006f0;
import bc3.C2986a0;
import bc3.C2996c2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import dc3.EnumC11916a;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import h02.C16587n0;
import io.getstream.chat.android.client.ChatEventListener;
import io.getstream.chat.android.client.api.MessageBufferConfig;
import io.getstream.chat.android.client.api.MessageBufferOverflow;
import io.getstream.chat.android.client.api.state.C19031a;
import io.getstream.chat.android.client.api.state.StateRegistry;
import io.getstream.chat.android.client.channel.state.ChannelState;
import io.getstream.chat.android.client.events.ChannelDeletedEvent;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.events.CidEvent;
import io.getstream.chat.android.client.events.HasMessage;
import io.getstream.chat.android.client.events.HasPoll;
import io.getstream.chat.android.client.events.HasReminder;
import io.getstream.chat.android.client.events.MarkAllReadEvent;
import io.getstream.chat.android.client.events.NewMessageEvent;
import io.getstream.chat.android.client.events.NotificationChannelDeletedEvent;
import io.getstream.chat.android.client.events.NotificationChannelMutesUpdatedEvent;
import io.getstream.chat.android.client.events.UserMessagesDeletedEvent;
import io.getstream.chat.android.client.events.UserPresenceChangedEvent;
import io.getstream.chat.android.client.extensions.StringExtensionsKt;
import io.getstream.chat.android.client.extensions.internal.MessageReminderKt;
import io.getstream.chat.android.client.extensions.internal.ReactionKt;
import io.getstream.chat.android.client.extensions.internal.ThreadKt;
import io.getstream.chat.android.client.internal.state.event.handler.internal.batch.BatchEvent;
import io.getstream.chat.android.client.internal.state.event.handler.internal.batch.SocketEventCollector;
import io.getstream.chat.android.client.internal.state.event.handler.internal.utils.ChatEventUtilsKt;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.ChannelLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.internal.LogicRegistry;
import io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsLogic;
import io.getstream.chat.android.client.internal.state.plugin.logic.querythreads.internal.QueryThreadsLogic;
import io.getstream.chat.android.client.internal.state.plugin.state.global.internal.MutableGlobalState;
import io.getstream.chat.android.client.persistance.repository.RepositoryFacade;
import io.getstream.chat.android.client.setup.state.ClientState;
import io.getstream.chat.android.client.utils.observable.Disposable;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ChannelCapabilities;
import io.getstream.chat.android.models.ChannelData;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.MessageReminder;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.Thread;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import l83.C23454a0;
import l83.C23465k;
import l83.InterfaceC23462h;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22665e0;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u008b\u00012\u00020\u0001:\u0002\u008b\u0001B\u0097\u0001\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u001c\u0010\u0017\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0005\u0012\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00190\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0015H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0015H\u0016¢\u0006\u0004\b#\u0010\"J$\u0010&\u001a\u00020\u00152\u0012\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070$\"\u00020\u0007H\u0097@¢\u0006\u0004\b&\u0010'J\u001f\u0010+\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00152\u0006\u0010(\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/J \u00104\u001a\u00020\u00152\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0082@¢\u0006\u0004\b4\u00105J\u0018\u00106\u001a\u00020\u00152\u0006\u0010(\u001a\u000200H\u0082@¢\u0006\u0004\b6\u00107J\u0018\u00108\u001a\u00020\u00152\u0006\u00101\u001a\u000200H\u0082@¢\u0006\u0004\b8\u00107J\u0018\u00109\u001a\u00020\u00152\u0006\u00101\u001a\u000200H\u0082@¢\u0006\u0004\b9\u00107J\u0017\u0010:\u001a\u00020\u00152\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00152\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b<\u0010;J\u0018\u0010=\u001a\u00020\u00152\u0006\u00101\u001a\u000200H\u0082@¢\u0006\u0004\b=\u00107J\u001f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019*\b\u0012\u0004\u0012\u00020\u00070\u0019H\u0002¢\u0006\u0004\b>\u0010?J'\u0010C\u001a\u00020)*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0\u00190@2\u0006\u0010B\u001a\u00020\u0002H\u0002¢\u0006\u0004\bC\u0010DJ\u0018\u0010F\u001a\u00020)2\u0006\u0010E\u001a\u00020\u0002H\u0082@¢\u0006\u0004\bF\u0010GJ2\u0010K\u001a\u00020\u00152\b\u0010E\u001a\u0004\u0018\u00010\u00022\u0006\u0010B\u001a\u00020\u00022\u0006\u0010H\u001a\u00020)2\u0006\u0010J\u001a\u00020IH\u0082@¢\u0006\u0004\bK\u0010LJ1\u0010R\u001a\u00020M*\u00020M2\u0006\u0010O\u001a\u00020N2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\u0010Q\u001a\u0004\u0018\u00010PH\u0002¢\u0006\u0004\bR\u0010SJ\u001b\u0010T\u001a\u00020M*\u00020M2\u0006\u0010O\u001a\u00020NH\u0002¢\u0006\u0004\bT\u0010UJ\u001c\u0010W\u001a\u00020\u0015*\u00020N2\u0006\u0010V\u001a\u00020MH\u0082@¢\u0006\u0004\bW\u0010XJ\"\u0010[\u001a\u0004\u0018\u00010Z2\u0006\u0010Y\u001a\u00020N2\u0006\u0010V\u001a\u00020MH\u0082@¢\u0006\u0004\b[\u0010XJ\"\u0010]\u001a\u0004\u0018\u00010Z2\u0006\u0010Y\u001a\u00020N2\u0006\u0010\\\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b]\u0010^J$\u0010b\u001a\u00020\u0015*\u00020N2\u0006\u0010_\u001a\u00020\u00022\u0006\u0010a\u001a\u00020`H\u0082@¢\u0006\u0004\bb\u0010cJ\u001c\u0010d\u001a\u00020\u0015*\u00020N2\u0006\u0010_\u001a\u00020\u0002H\u0082@¢\u0006\u0004\bd\u0010^R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010eR&\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010gR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010hR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010iR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010jR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010kR*\u0010\u0017\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010fR \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010lR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010mR\u001b\u0010s\u001a\u00020n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010tR\u0014\u0010v\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u001a\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00070x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR!\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00070x8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010p\u001a\u0004\b|\u0010}R\u0017\u0010\u0080\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0019\u0010\u0082\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001d\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001d\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0085\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0089\u0001¨\u0006\u008c\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;", "Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandler;", "", "Lio/getstream/chat/android/models/UserId;", "currentUserId", "Lkotlin/Function1;", "Lio/getstream/chat/android/client/ChatEventListener;", "Lio/getstream/chat/android/client/events/ChatEvent;", "Lio/getstream/chat/android/client/utils/observable/Disposable;", "subscribeForEvents", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "logicRegistry", "Lio/getstream/chat/android/client/api/state/StateRegistry;", "stateRegistry", "Lio/getstream/chat/android/client/setup/state/ClientState;", "clientState", "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;", "mutableGlobalState", "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;", "repos", "Lq83/d;", "Ll83/a0;", "", "sideEffect", "Lec3/l;", "", "syncedEvents", "Lio/getstream/chat/android/client/api/MessageBufferConfig;", "bufferConfig", "Lbc3/c0;", "scope", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/api/state/StateRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lkotlin/jvm/functions/Function1;Lec3/l;Lio/getstream/chat/android/client/api/MessageBufferConfig;Lbc3/c0;)V", "startListening", "()V", "stopListening", "", "events", "handleEvents", "([Lio/getstream/chat/android/client/events/ChatEvent;Lq83/d;)Ljava/lang/Object;", NotificationCompat.CATEGORY_EVENT, "", "emitted", "logEmitOutcome", "(Lio/getstream/chat/android/client/events/ChatEvent;Z)V", "Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;", "handleUserMessagesDeletedEvent", "(Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;)V", "Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;", "batchEvent", "Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;", "queryChannelsLogic", "handleChatEvents", "(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;Lq83/d;)Ljava/lang/Object;", "handleBatchEvent", "(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;Lq83/d;)Ljava/lang/Object;", "updateGlobalState", "updateChannelsState", "updateQueryThreadsState", "(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;)V", "updateThreadState", "updateOfflineStorage", "extractMessageIds", "(Ljava/util/List;)Ljava/util/List;", "Lec3/f2;", "Lio/getstream/chat/android/models/Member;", "userId", "containsWithUserId", "(Lec3/f2;Ljava/lang/String;)Z", "cid", "checkReadEventsCapability", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "hard", "Ljava/util/Date;", "deletedAt", "deleteMessagesFromUser", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/Message;", "Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;", "batch", "Lio/getstream/chat/android/models/User;", "eventUser", "enrichWithOwnReactions", "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Ljava/lang/String;Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/models/Message;", "enrichWithOwnPoll", "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;)Lio/getstream/chat/android/models/Message;", "message", "addThreadIfExists", "(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;", "pendingUpdate", "Lio/getstream/chat/android/models/Thread;", "threadFromMessage", "threadId", "threadFromPendingUpdateOrRepo", "(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "messageId", "Lio/getstream/chat/android/models/MessageReminder;", NotificationCompat.CATEGORY_REMINDER, "upsertReminder", "(Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;Ljava/lang/String;Lio/getstream/chat/android/models/MessageReminder;Lq83/d;)Ljava/lang/Object;", "deleteReminder", "Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;", "Lio/getstream/chat/android/client/api/state/StateRegistry;", "Lio/getstream/chat/android/client/setup/state/ClientState;", "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;", "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;", "Lec3/l;", "Lio/getstream/chat/android/client/api/MessageBufferConfig;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Lbc3/c0;", "Lmc3/a;", "mutex", "Lmc3/a;", "Lec3/o1;", "socketEvents", "Lec3/o1;", "bufferedNewMessageEvents$delegate", "getBufferedNewMessageEvents", "()Lec3/o1;", "bufferedNewMessageEvents", "Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;", "socketEventCollector", "Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;", "eventsDisposable", "Lio/getstream/chat/android/client/utils/observable/Disposable;", "defaultSocketEventListener", "Lio/getstream/chat/android/client/ChatEventListener;", "bufferedSocketEventListener", "Ljava/util/concurrent/atomic/AtomicInteger;", "emittedCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "collectedCount", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class EventHandlerSequential implements EventHandler {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final Disposable EMPTY_DISPOSABLE = new Disposable() { // from class: io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$Companion$EMPTY_DISPOSABLE$1
        private final boolean isDisposed = true;

        @Override // io.getstream.chat.android.client.utils.observable.Disposable
        public final void dispose() {
        }

        @Override // io.getstream.chat.android.client.utils.observable.Disposable
        /* JADX INFO: renamed from: isDisposed, reason: from getter */
        public final boolean getIsDisposed() {
            return this.isDisposed;
        }
    };
    private final MessageBufferConfig bufferConfig;

    /* JADX INFO: renamed from: bufferedNewMessageEvents$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h bufferedNewMessageEvents;
    private final ChatEventListener<ChatEvent> bufferedSocketEventListener;
    private final ClientState clientState;
    private final AtomicInteger collectedCount;
    private final String currentUserId;
    private final ChatEventListener<ChatEvent> defaultSocketEventListener;
    private final AtomicInteger emittedCount;
    private Disposable eventsDisposable;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final LogicRegistry logicRegistry;
    private final MutableGlobalState mutableGlobalState;
    private final InterfaceC25435a mutex;
    private final RepositoryFacade repos;
    private final InterfaceC2994c0 scope;
    private final Function1 sideEffect;
    private final SocketEventCollector socketEventCollector;
    private final InterfaceC13072o1 socketEvents;
    private final StateRegistry stateRegistry;
    private final Function1 subscribeForEvents;
    private final InterfaceC13058l syncedEvents;

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$Companion;", "", "<init>", "()V", "EMPTY_DISPOSABLE", "Lio/getstream/chat/android/client/utils/observable/Disposable;", "getEMPTY_DISPOSABLE", "()Lio/getstream/chat/android/client/utils/observable/Disposable;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final Disposable getEMPTY_DISPOSABLE() {
            return EventHandlerSequential.EMPTY_DISPOSABLE;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageBufferOverflow.values().length];
            try {
                iArr[MessageBufferOverflow.DROP_OLDEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageBufferOverflow.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$addThreadIfExists$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential", m100430f = "EventHandlerSequential.kt", m100431l = {988}, m100432m = "addThreadIfExists")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192601 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C192601(InterfaceC30057d<? super C192601> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventHandlerSequential.this.addThreadIfExists(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$checkReadEventsCapability$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential", m100430f = "EventHandlerSequential.kt", m100431l = {936}, m100432m = "checkReadEventsCapability")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192611 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C192611(InterfaceC30057d<? super C192611> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventHandlerSequential.this.checkReadEventsCapability(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$deleteMessagesFromUser$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential", m100430f = "EventHandlerSequential.kt", m100431l = {950, 953, 957, 959, 963}, m100432m = "deleteMessagesFromUser")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192621 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C192621(InterfaceC30057d<? super C192621> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventHandlerSequential.this.deleteMessagesFromUser(null, null, false, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$deleteReminder$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential", m100430f = "EventHandlerSequential.kt", m100431l = {MessageListItemViewType.MEDIA_ATTACHMENT}, m100432m = "deleteReminder")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192631 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C192631(InterfaceC30057d<? super C192631> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventHandlerSequential.this.deleteReminder(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$handleBatchEvent$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential", m100430f = "EventHandlerSequential.kt", m100431l = {1032, 355, 356, 357}, m100432m = "handleBatchEvent")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192641 extends AbstractC32269c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C192641(InterfaceC30057d<? super C192641> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventHandlerSequential.this.handleBatchEvent(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$handleChatEvents$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential", m100430f = "EventHandlerSequential.kt", m100431l = {307, 309, 310, 311}, m100432m = "handleChatEvents")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192651 extends AbstractC32269c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C192651(InterfaceC30057d<? super C192651> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventHandlerSequential.this.handleChatEvents(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$startListening$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$startListening$2", m100430f = "EventHandlerSequential.kt", m100431l = {AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C192672 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C192672(InterfaceC30057d<? super C192672> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return EventHandlerSequential.this.new C192672(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C192672) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058l = EventHandlerSequential.this.syncedEvents;
                final EventHandlerSequential eventHandlerSequential = EventHandlerSequential.this;
                InterfaceC13062m interfaceC13062m = new InterfaceC13062m() { // from class: io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential.startListening.2.1
                    @Override // ec3.InterfaceC13062m
                    public final /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC30057d interfaceC30057d) {
                        return emit((List<? extends ChatEvent>) obj2, (InterfaceC30057d<? super C23454a0>) interfaceC30057d);
                    }

                    public final Object emit(List<? extends ChatEvent> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                        C2345k logger = eventHandlerSequential.getLogger();
                        InterfaceC2339e interfaceC2339e = logger.f9275c;
                        EnumC2341g enumC2341g = EnumC2341g.INFO;
                        String str = logger.f9273a;
                        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                            logger.f9274b.log(enumC2341g, str, AbstractC2875y.m8295h(list.size(), "[onSyncEventsReceived] events.size: "), null);
                        }
                        Object objHandleBatchEvent = eventHandlerSequential.handleBatchEvent(new BatchEvent(0, list, true, 1, null), interfaceC30057d);
                        return objHandleBatchEvent == EnumC31071a.f128113w ? objHandleBatchEvent : C23454a0.f92919a;
                    }
                };
                this.label = 1;
                if (interfaceC13058l.collect(interfaceC13062m, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$startListening$3 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$startListening$3", m100430f = "EventHandlerSequential.kt", m100431l = {263}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C192683 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ InterfaceC4351m $collectSocketEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192683(InterfaceC4351m interfaceC4351m, InterfaceC30057d<? super C192683> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$collectSocketEvent = interfaceC4351m;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return EventHandlerSequential.this.new C192683(this.$collectSocketEvent, interfaceC30057d);
        }

        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            ((C192683) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            return EnumC31071a.f128113w;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = EventHandlerSequential.this.socketEvents;
                C19283x5398d305 c19283x5398d305 = new C19283x5398d305(this.$collectSocketEvent);
                this.label = 1;
                if (interfaceC13072o1.collect(c19283x5398d305, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2994c0) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return EnumC31071a.f128113w;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$startListening$4 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$startListening$4", m100430f = "EventHandlerSequential.kt", m100431l = {266}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C192694 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ InterfaceC4351m $collectSocketEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C192694(InterfaceC4351m interfaceC4351m, InterfaceC30057d<? super C192694> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$collectSocketEvent = interfaceC4351m;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return EventHandlerSequential.this.new C192694(this.$collectSocketEvent, interfaceC30057d);
        }

        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            ((C192694) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            return EnumC31071a.f128113w;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 bufferedNewMessageEvents = EventHandlerSequential.this.getBufferedNewMessageEvents();
                C19283x5398d305 c19283x5398d305 = new C19283x5398d305(this.$collectSocketEvent);
                this.label = 1;
                if (bufferedNewMessageEvents.collect(c19283x5398d305, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2994c0) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return EnumC31071a.f128113w;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$threadFromMessage$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential", m100430f = "EventHandlerSequential.kt", m100431l = {995, 996}, m100432m = "threadFromMessage")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192701 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C192701(InterfaceC30057d<? super C192701> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventHandlerSequential.this.threadFromMessage(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$updateChannelsState$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential", m100430f = "EventHandlerSequential.kt", m100431l = {523}, m100432m = "updateChannelsState")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192711 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public C192711(InterfaceC30057d<? super C192711> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventHandlerSequential.this.updateChannelsState(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$updateGlobalState$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential", m100430f = "EventHandlerSequential.kt", m100431l = {426, 428}, m100432m = "updateGlobalState")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192721 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$14;
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

        public C192721(InterfaceC30057d<? super C192721> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventHandlerSequential.this.updateGlobalState(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$updateOfflineStorage$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential", m100430f = "EventHandlerSequential.kt", m100431l = {590, 602, 620, 630, 631, 648, 698, 703, 708, 804, 821, 828, 845, 846, 847, 854, 856, 858, 865, 871, 874, 877, 878, 881, 883, 888, 890, 894, 897, 900, 903, 906}, m100432m = "updateOfflineStorage")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192751 extends AbstractC32269c {
        int I$0;
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

        public C192751(InterfaceC30057d<? super C192751> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventHandlerSequential.this.updateOfflineStorage(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$updateOfflineStorage$25 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C1927625 extends C22672i implements Function1 {
        public C1927625(Object obj) {
            super(1, 0, EventBatchUpdate.class, obj, "getPoll", "getPoll(Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Poll invoke(String p13) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((EventBatchUpdate) this.receiver).getPoll(p13);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$updateOfflineStorage$26 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C1927726 extends C22672i implements Function1 {
        public C1927726(Object obj) {
            super(1, 0, EventBatchUpdate.class, obj, "getPoll", "getPoll(Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Poll invoke(String p13) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((EventBatchUpdate) this.receiver).getPoll(p13);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$updateOfflineStorage$27 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C1927827 extends C22672i implements Function1 {
        public C1927827(Object obj) {
            super(1, 0, EventBatchUpdate.class, obj, "getPoll", "getPoll(Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Poll invoke(String p13) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((EventBatchUpdate) this.receiver).getPoll(p13);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$updateOfflineStorage$28 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C1927928 extends C22672i implements Function1 {
        public C1927928(Object obj) {
            super(1, 0, EventBatchUpdate.class, obj, "getPoll", "getPoll(Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Poll invoke(String p13) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((EventBatchUpdate) this.receiver).getPoll(p13);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$updateOfflineStorage$29 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C1928029 extends C22672i implements Function1 {
        public C1928029(Object obj) {
            super(1, 0, EventBatchUpdate.class, obj, "getPoll", "getPoll(Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Poll invoke(String p13) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((EventBatchUpdate) this.receiver).getPoll(p13);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$updateOfflineStorage$30 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C1928130 extends C22672i implements Function1 {
        public C1928130(Object obj) {
            super(1, 0, EventBatchUpdate.class, obj, "getPoll", "getPoll(Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Poll invoke(String p13) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((EventBatchUpdate) this.receiver).getPoll(p13);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$upsertReminder$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential", m100430f = "EventHandlerSequential.kt", m100431l = {MessageListItemViewType.THREAD_SEPARATOR}, m100432m = "upsertReminder")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192821 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C192821(InterfaceC30057d<? super C192821> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventHandlerSequential.this.upsertReminder(null, null, null, this);
        }
    }

    public EventHandlerSequential(String currentUserId, Function1 subscribeForEvents, LogicRegistry logicRegistry, StateRegistry stateRegistry, ClientState clientState, MutableGlobalState mutableGlobalState, RepositoryFacade repos, Function1 sideEffect, InterfaceC13058l syncedEvents, MessageBufferConfig bufferConfig, InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(currentUserId, "currentUserId");
        AbstractC22676k.m65750j(subscribeForEvents, "subscribeForEvents");
        AbstractC22676k.m65750j(logicRegistry, "logicRegistry");
        AbstractC22676k.m65750j(stateRegistry, "stateRegistry");
        AbstractC22676k.m65750j(clientState, "clientState");
        AbstractC22676k.m65750j(mutableGlobalState, "mutableGlobalState");
        AbstractC22676k.m65750j(repos, "repos");
        AbstractC22676k.m65750j(sideEffect, "sideEffect");
        AbstractC22676k.m65750j(syncedEvents, "syncedEvents");
        AbstractC22676k.m65750j(bufferConfig, "bufferConfig");
        AbstractC22676k.m65750j(scope, "scope");
        this.currentUserId = currentUserId;
        this.subscribeForEvents = subscribeForEvents;
        this.logicRegistry = logicRegistry;
        this.stateRegistry = stateRegistry;
        this.clientState = clientState;
        this.mutableGlobalState = mutableGlobalState;
        this.repos = repos;
        this.sideEffect = sideEffect;
        this.syncedEvents = syncedEvents;
        this.bufferConfig = bufferConfig;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:EventHandlerSeq");
        this.scope = AbstractC3006f0.m8696B(AbstractC3006f0.m8696B(scope, AbstractC3006f0.m8710d()), new C19266x4fba96c3(C2986a0.f11990w, this));
        this.mutex = AbstractC25438d.m74669a();
        this.socketEvents = AbstractC13091v.m36592b(0, Integer.MAX_VALUE, null, 5);
        this.bufferedNewMessageEvents = AbstractC30060g.m92088H(new C16587n0(this, 24));
        this.socketEventCollector = new SocketEventCollector(scope, new EventHandlerSequential$socketEventCollector$1(this, null));
        this.eventsDisposable = EMPTY_DISPOSABLE;
        this.defaultSocketEventListener = new C19284a(this, 0);
        this.bufferedSocketEventListener = new C19284a(this, 1);
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "<init> no args", null);
        }
        this.emittedCount = new AtomicInteger();
        this.collectedCount = new AtomicInteger();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object addThreadIfExists(EventBatchUpdate eventBatchUpdate, Message message, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C192601 c192601;
        if (interfaceC30057d instanceof C192601) {
            c192601 = (C192601) interfaceC30057d;
            int i13 = c192601.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c192601.label = i13 - Integer.MIN_VALUE;
            } else {
                c192601 = new C192601(interfaceC30057d);
            }
        } else {
            c192601 = new C192601(interfaceC30057d);
        }
        Object objThreadFromMessage = c192601.result;
        Object obj = EnumC31071a.f128113w;
        int i14 = c192601.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objThreadFromMessage);
            c192601.L$0 = eventBatchUpdate;
            c192601.L$1 = message;
            c192601.label = 1;
            objThreadFromMessage = threadFromMessage(eventBatchUpdate, message, c192601);
            if (objThreadFromMessage == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            message = (Message) c192601.L$1;
            eventBatchUpdate = (EventBatchUpdate) c192601.L$0;
            AbstractC34132o.m107864I(objThreadFromMessage);
        }
        Thread thread = (Thread) objThreadFromMessage;
        if (thread != null) {
            eventBatchUpdate.addThread(ThreadKt.updateParentOrReply(thread, message));
        }
        return C23454a0.f92919a;
    }

    private static final InterfaceC13072o1 bufferedNewMessageEvents_delegate$lambda$2(EventHandlerSequential eventHandlerSequential) {
        EnumC11916a enumC11916a;
        int capacity = eventHandlerSequential.bufferConfig.getCapacity();
        int i13 = WhenMappings.$EnumSwitchMapping$0[eventHandlerSequential.bufferConfig.getOverflow().ordinal()];
        if (i13 == 1) {
            enumC11916a = EnumC11916a.f38983x;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            enumC11916a = EnumC11916a.f38984y;
        }
        return AbstractC13091v.m36592b(0, capacity, enumC11916a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bufferedSocketEventListener$lambda$4(EventHandlerSequential eventHandlerSequential, ChatEvent event) {
        AbstractC22676k.m65750j(event, "event");
        eventHandlerSequential.logEmitOutcome(event, (((event instanceof NewMessageEvent) && eventHandlerSequential.bufferConfig.getChannelTypes().contains(((NewMessageEvent) event).getChannelType())) ? eventHandlerSequential.getBufferedNewMessageEvents() : eventHandlerSequential.socketEvents).mo36564a(event));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m54782c(ChatEvent chatEvent) {
        return (String) handleBatchEvent$lambda$21$lambda$18$lambda$17(chatEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object checkReadEventsCapability(String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        C192611 c192611;
        boolean zContains;
        if (interfaceC30057d instanceof C192611) {
            c192611 = (C192611) interfaceC30057d;
            int i13 = c192611.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c192611.label = i13 - Integer.MIN_VALUE;
            } else {
                c192611 = new C192611(interfaceC30057d);
            }
        } else {
            c192611 = new C192611(interfaceC30057d);
        }
        Object objSelectChannel = c192611.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c192611.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objSelectChannel);
            RepositoryFacade repositoryFacade = this.repos;
            c192611.L$0 = str;
            c192611.label = 1;
            objSelectChannel = repositoryFacade.selectChannel(str, c192611);
            if (objSelectChannel == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c192611.L$0;
            AbstractC34132o.m107864I(objSelectChannel);
        }
        Channel channel = (Channel) objSelectChannel;
        if (channel != null) {
            zContains = channel.getOwnCapabilities().contains(ChannelCapabilities.READ_EVENTS);
        } else {
            C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(str);
            zContains = ((ChannelData) this.stateRegistry.channel((String) c23465kCidToTypeAndId.f92937w, (String) c23465kCidToTypeAndId.f92938x).getChannelData().getValue()).getOwnCapabilities().contains(ChannelCapabilities.READ_EVENTS);
        }
        return Boolean.valueOf(zContains);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x002b A[RETURN] */
    private final boolean containsWithUserId(InterfaceC13037f2 interfaceC13037f2, String str) {
        for (Object obj : (Iterable) interfaceC13037f2.getValue()) {
            if (AbstractC22676k.m65745e(((Member) obj).getUser().getId(), str)) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C13096w1 m54783d(EventHandlerSequential eventHandlerSequential) {
        return (C13096w1) bufferedNewMessageEvents_delegate$lambda$2(eventHandlerSequential);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void defaultSocketEventListener$lambda$3(EventHandlerSequential eventHandlerSequential, ChatEvent event) {
        AbstractC22676k.m65750j(event, "event");
        eventHandlerSequential.logEmitOutcome(event, eventHandlerSequential.socketEvents.mo36564a(event));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d2, code lost:
    
        if (r5 == r7) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f0, code lost:
    
        if (r5 == r7) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deleteMessagesFromUser(java.lang.String r70, java.lang.String r71, boolean r72, java.util.Date r73, q83.InterfaceC30057d<? super l83.C23454a0> r74) {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential.deleteMessagesFromUser(java.lang.String, java.lang.String, boolean, java.util.Date, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object deleteReminder(EventBatchUpdate eventBatchUpdate, String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C192631 c192631;
        Message currentMessage;
        EventBatchUpdate eventBatchUpdate2;
        Message message;
        if (interfaceC30057d instanceof C192631) {
            c192631 = (C192631) interfaceC30057d;
            int i13 = c192631.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c192631.label = i13 - Integer.MIN_VALUE;
            } else {
                c192631 = new C192631(interfaceC30057d);
            }
        } else {
            c192631 = new C192631(interfaceC30057d);
        }
        Object objSelectMessage = c192631.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c192631.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objSelectMessage);
            currentMessage = eventBatchUpdate.getCurrentMessage(str);
            if (currentMessage == null) {
                RepositoryFacade repositoryFacade = this.repos;
                c192631.L$0 = eventBatchUpdate;
                c192631.L$1 = null;
                c192631.label = 1;
                objSelectMessage = repositoryFacade.selectMessage(str, c192631);
                if (objSelectMessage == enumC31071a) {
                    return enumC31071a;
                }
                eventBatchUpdate2 = eventBatchUpdate;
            } else {
                eventBatchUpdate2 = eventBatchUpdate;
            }
            message = currentMessage;
            if (message != null) {
                eventBatchUpdate2.addMessage(message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false));
            }
            return C23454a0.f92919a;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        eventBatchUpdate2 = (EventBatchUpdate) c192631.L$0;
        AbstractC34132o.m107864I(objSelectMessage);
        currentMessage = (Message) objSelectMessage;
        message = currentMessage;
        if (message != null) {
            eventBatchUpdate2.addMessage(message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false));
        }
        return C23454a0.f92919a;
    }

    private final Message enrichWithOwnPoll(Message message, EventBatchUpdate eventBatchUpdate) {
        Message currentMessage = eventBatchUpdate.getCurrentMessage(message.getId());
        Poll poll = message.getPoll();
        if (poll == null) {
            poll = currentMessage != null ? currentMessage.getPoll() : null;
        }
        return message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : poll, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false);
    }

    private final Message enrichWithOwnReactions(Message message, EventBatchUpdate eventBatchUpdate, String str, User user) {
        List<Reaction> listM74097F1;
        List<Reaction> ownReactions;
        if (user == null || AbstractC22676k.m65745e(str, user.getId())) {
            List<Reaction> latestReactions = message.getLatestReactions();
            ArrayList arrayList = new ArrayList();
            for (Object obj : latestReactions) {
                if (AbstractC22676k.m65745e(((Reaction) obj).getUserId(), str)) {
                    arrayList.add(obj);
                }
            }
            Message currentMessage = eventBatchUpdate.getCurrentMessage(message.getId());
            listM74097F1 = AbstractC25265s.m74097F1(ReactionKt.mergeReactions(arrayList, (currentMessage == null || (ownReactions = currentMessage.getOwnReactions()) == null) ? new ArrayList() : ownReactions));
        } else {
            Message currentMessage2 = eventBatchUpdate.getCurrentMessage(message.getId());
            if (currentMessage2 == null || (listM74097F1 = currentMessage2.getOwnReactions()) == null) {
                listM74097F1 = new ArrayList<>();
            }
        }
        return message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : listM74097F1, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false);
    }

    private final List<String> extractMessageIds(List<? extends ChatEvent> list) {
        Message message;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String id4 = null;
            HasMessage hasMessage = obj instanceof HasMessage ? (HasMessage) obj : null;
            if (hasMessage != null && (message = hasMessage.getMessage()) != null) {
                id4 = message.getId();
            }
            if (id4 != null) {
                arrayList.add(id4);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC13072o1 getBufferedNewMessageEvents() {
        return (InterfaceC13072o1) this.bufferedNewMessageEvents.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:53:0x0153  */
    /* JADX WARN: Code duplicated, block: B:54:0x0154 A[Catch: all -> 0x0196, PHI: r4 r7 r8 r14 r23
      0x0154: PHI (r4v10 mc3.a) = (r4v7 mc3.a), (r4v20 mc3.a) binds: [B:52:0x0151, B:23:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r7v5 int) = (r7v4 int), (r7v13 int) binds: [B:52:0x0151, B:23:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r8v4 int) = (r8v3 int), (r8v10 int) binds: [B:52:0x0151, B:23:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r14v5 io.getstream.chat.android.client.internal.state.event.handler.internal.batch.BatchEvent) = 
      (r14v2 io.getstream.chat.android.client.internal.state.event.handler.internal.batch.BatchEvent)
      (r14v11 io.getstream.chat.android.client.internal.state.event.handler.internal.batch.BatchEvent)
     binds: [B:52:0x0151, B:23:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r23v9 java.lang.String) = (r23v6 java.lang.String), (r23v15 java.lang.String) binds: [B:52:0x0151, B:23:0x0062] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {all -> 0x0196, blocks: (B:54:0x0154, B:51:0x0142), top: B:80:0x0142 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0166  */
    /* JADX WARN: Code duplicated, block: B:60:0x017d A[Catch: all -> 0x0194, TRY_LEAVE, TryCatch #1 {all -> 0x0194, blocks: (B:58:0x0167, B:60:0x017d), top: B:78:0x0167 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01a8 A[Catch: all -> 0x01ce, TryCatch #7 {all -> 0x01ce, blocks: (B:71:0x01d1, B:66:0x0198, B:68:0x01a8), top: B:90:0x0198 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x017d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x01a8, please report this as an issue */
    public final Object handleBatchEvent(BatchEvent batchEvent, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C192641 c192641;
        InterfaceC25435a interfaceC25435a;
        BatchEvent batchEvent2;
        int i13;
        String str;
        InterfaceC25435a interfaceC25435a2;
        int i14;
        BatchEvent batchEvent3;
        C2345k logger;
        InterfaceC2339e interfaceC2339e;
        EnumC2341g enumC2341g;
        C2345k logger2;
        InterfaceC2339e interfaceC2339e2;
        String str2;
        EnumC2341g enumC2341g2;
        if (interfaceC30057d instanceof C192641) {
            c192641 = (C192641) interfaceC30057d;
            int i15 = c192641.label;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                c192641.label = i15 - Integer.MIN_VALUE;
            } else {
                c192641 = new C192641(interfaceC30057d);
            }
        } else {
            c192641 = new C192641(interfaceC30057d);
        }
        Object obj = c192641.result;
        Object obj2 = EnumC31071a.f128113w;
        int i16 = c192641.label;
        try {
            if (i16 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC25435a interfaceC25435a3 = this.mutex;
                c192641.L$0 = batchEvent;
                c192641.L$1 = interfaceC25435a3;
                c192641.I$0 = 0;
                c192641.label = 1;
                if (interfaceC25435a3.mo68211b(c192641) != obj2) {
                    interfaceC25435a = interfaceC25435a3;
                    batchEvent2 = batchEvent;
                    i13 = 0;
                }
                return obj2;
            }
            if (i16 != 1) {
                try {
                    if (i16 == 2) {
                        i14 = c192641.I$1;
                        int i17 = c192641.I$0;
                        InterfaceC25435a interfaceC25435a4 = (InterfaceC25435a) c192641.L$1;
                        BatchEvent batchEvent4 = (BatchEvent) c192641.L$0;
                        try {
                            AbstractC34132o.m107864I(obj);
                            i13 = i17;
                            interfaceC25435a2 = interfaceC25435a4;
                            str = "[handleBatchEvent] failed(";
                            batchEvent2 = batchEvent4;
                            try {
                                c192641.L$0 = batchEvent2;
                                c192641.L$1 = interfaceC25435a2;
                                c192641.I$0 = i13;
                                c192641.I$1 = i14;
                                c192641.label = 3;
                                if (updateChannelsState(batchEvent2, c192641) == obj2) {
                                    c192641.L$0 = batchEvent2;
                                    c192641.L$1 = interfaceC25435a2;
                                    c192641.I$0 = i13;
                                    c192641.I$1 = i14;
                                    c192641.label = 4;
                                    if (updateOfflineStorage(batchEvent2, c192641) != obj2) {
                                        batchEvent3 = batchEvent2;
                                        updateQueryThreadsState(batchEvent3);
                                        updateThreadState(batchEvent3);
                                        logger2 = getLogger();
                                        interfaceC2339e2 = logger2.f9275c;
                                        str2 = logger2.f9273a;
                                        enumC2341g2 = EnumC2341g.VERBOSE;
                                        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                                            logger2.f9274b.log(enumC2341g2, str2, "[handleBatchEvent] <<< id: " + batchEvent3.getId(), null);
                                        }
                                        Object obj3 = null;
                                        return C23454a0.f92919a;
                                    }
                                }
                                return obj2;
                            } catch (Throwable th3) {
                                th = th3;
                                batchEvent3 = batchEvent2;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            str = "[handleBatchEvent] failed(";
                            interfaceC25435a2 = interfaceC25435a4;
                            batchEvent3 = batchEvent4;
                        }
                    } else {
                        if (i16 != 3) {
                            if (i16 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC25435a2 = (InterfaceC25435a) c192641.L$1;
                            batchEvent3 = (BatchEvent) c192641.L$0;
                            try {
                                AbstractC34132o.m107864I(obj);
                                str = "[handleBatchEvent] failed(";
                                try {
                                    updateQueryThreadsState(batchEvent3);
                                    updateThreadState(batchEvent3);
                                    logger2 = getLogger();
                                    interfaceC2339e2 = logger2.f9275c;
                                    str2 = logger2.f9273a;
                                    enumC2341g2 = EnumC2341g.VERBOSE;
                                    if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                                        logger2.f9274b.log(enumC2341g2, str2, "[handleBatchEvent] <<< id: " + batchEvent3.getId(), null);
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    logger = getLogger();
                                    interfaceC2339e = logger.f9275c;
                                    enumC2341g = EnumC2341g.ERROR;
                                    if (interfaceC2339e.isLoggable(enumC2341g, logger.f9273a)) {
                                        logger.f9274b.log(enumC2341g, logger.f9273a, str + batchEvent3.getId() + "): " + th.getMessage(), th);
                                    }
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                str = "[handleBatchEvent] failed(";
                            }
                            Object obj4 = null;
                            return C23454a0.f92919a;
                        }
                        int i18 = c192641.I$1;
                        i13 = c192641.I$0;
                        InterfaceC25435a interfaceC25435a5 = (InterfaceC25435a) c192641.L$1;
                        BatchEvent batchEvent5 = (BatchEvent) c192641.L$0;
                        try {
                            AbstractC34132o.m107864I(obj);
                            i14 = i18;
                            interfaceC25435a2 = interfaceC25435a5;
                            str = "[handleBatchEvent] failed(";
                            batchEvent2 = batchEvent5;
                            c192641.L$0 = batchEvent2;
                            c192641.L$1 = interfaceC25435a2;
                            c192641.I$0 = i13;
                            c192641.I$1 = i14;
                            c192641.label = 4;
                            if (updateOfflineStorage(batchEvent2, c192641) != obj2) {
                                batchEvent3 = batchEvent2;
                                updateQueryThreadsState(batchEvent3);
                                updateThreadState(batchEvent3);
                                logger2 = getLogger();
                                interfaceC2339e2 = logger2.f9275c;
                                str2 = logger2.f9273a;
                                enumC2341g2 = EnumC2341g.VERBOSE;
                                if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                                    logger2.f9274b.log(enumC2341g2, str2, "[handleBatchEvent] <<< id: " + batchEvent3.getId(), null);
                                }
                                Object obj5 = null;
                                return C23454a0.f92919a;
                            }
                            return obj2;
                        } catch (Throwable th7) {
                            th = th7;
                            str = "[handleBatchEvent] failed(";
                            interfaceC25435a2 = interfaceC25435a5;
                            batchEvent3 = batchEvent5;
                        }
                    }
                    logger = getLogger();
                    interfaceC2339e = logger.f9275c;
                    enumC2341g = EnumC2341g.ERROR;
                    if (interfaceC2339e.isLoggable(enumC2341g, logger.f9273a)) {
                        logger.f9274b.log(enumC2341g, logger.f9273a, str + batchEvent3.getId() + "): " + th.getMessage(), th);
                    }
                    Object obj6 = null;
                    return C23454a0.f92919a;
                } finally {
                    interfaceC25435a2.mo68214i(null);
                }
            }
            i13 = c192641.I$0;
            interfaceC25435a = (InterfaceC25435a) c192641.L$1;
            batchEvent2 = (BatchEvent) c192641.L$0;
            AbstractC34132o.m107864I(obj);
            C2345k logger3 = getLogger();
            InterfaceC2339e interfaceC2339e3 = logger3.f9275c;
            String str3 = logger3.f9273a;
            EnumC2341g enumC2341g3 = EnumC2341g.DEBUG;
            if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
                InterfaceC2344j interfaceC2344j = logger3.f9274b;
                int id4 = batchEvent2.getId();
                boolean zIsFromSocketConnection = batchEvent2.getIsFromSocketConnection();
                int size = batchEvent2.getSize();
                str = "[handleBatchEvent] failed(";
                try {
                    interfaceC2344j.log(enumC2341g3, str3, "[handleBatchEvent] >>> id: " + id4 + ", fromSocket: " + zIsFromSocketConnection + ", size: " + size + ", event.types: '" + AbstractC25265s.m74110N0(batchEvent2.getSortedEvents(), null, null, null, new C19031a(20), 31) + "'", null);
                } catch (Throwable th8) {
                    th = th8;
                    interfaceC25435a2 = interfaceC25435a;
                    batchEvent3 = batchEvent2;
                }
            } else {
                str = "[handleBatchEvent] failed(";
            }
            c192641.L$0 = batchEvent2;
            c192641.L$1 = interfaceC25435a;
            c192641.I$0 = i13;
            c192641.I$1 = 0;
            c192641.label = 2;
            if (updateGlobalState(batchEvent2, c192641) != obj2) {
                i14 = 0;
                interfaceC25435a2 = interfaceC25435a;
                c192641.L$0 = batchEvent2;
                c192641.L$1 = interfaceC25435a2;
                c192641.I$0 = i13;
                c192641.I$1 = i14;
                c192641.label = 3;
                if (updateChannelsState(batchEvent2, c192641) == obj2) {
                    c192641.L$0 = batchEvent2;
                    c192641.L$1 = interfaceC25435a2;
                    c192641.I$0 = i13;
                    c192641.I$1 = i14;
                    c192641.label = 4;
                    if (updateOfflineStorage(batchEvent2, c192641) != obj2) {
                        batchEvent3 = batchEvent2;
                        updateQueryThreadsState(batchEvent3);
                        updateThreadState(batchEvent3);
                        logger2 = getLogger();
                        interfaceC2339e2 = logger2.f9275c;
                        str2 = logger2.f9273a;
                        enumC2341g2 = EnumC2341g.VERBOSE;
                        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                            logger2.f9274b.log(enumC2341g2, str2, "[handleBatchEvent] <<< id: " + batchEvent3.getId(), null);
                        }
                        Object obj7 = null;
                        return C23454a0.f92919a;
                    }
                }
            }
            return obj2;
        } catch (Throwable th9) {
            th = th9;
            str = "[handleBatchEvent] failed(";
        }
    }

    private static final CharSequence handleBatchEvent$lambda$21$lambda$18$lambda$17(ChatEvent it) {
        AbstractC22676k.m65750j(it, "it");
        return ChatEventUtilsKt.getRealType(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:100:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x018b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x017d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0198 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:39:0x011a  */
    /* JADX WARN: Code duplicated, block: B:52:0x015c  */
    /* JADX WARN: Code duplicated, block: B:57:0x016b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0183  */
    /* JADX WARN: Code duplicated, block: B:67:0x019e  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c7 A[LOOP:4: B:74:0x01c1->B:76:0x01c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x020d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0224  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x011e A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00f5 -> B:26:0x00c6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:98:0x00d6
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object handleChatEvents(io.getstream.chat.android.client.internal.state.event.handler.internal.batch.BatchEvent r17, io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsLogic r18, q83.InterfaceC30057d<? super l83.C23454a0> r19) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential.handleChatEvents(io.getstream.chat.android.client.internal.state.event.handler.internal.batch.BatchEvent, io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsLogic, q83.d):java.lang.Object");
    }

    private final void handleUserMessagesDeletedEvent(UserMessagesDeletedEvent event) {
        if (event.getCid() == null) {
            Iterator<T> it = this.logicRegistry.getActiveChannelsLogic().iterator();
            while (it.hasNext()) {
                ((ChannelLogic) it.next()).handleEvent(event);
            }
        } else {
            C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(event.getCid());
            String str = (String) c23465kCidToTypeAndId.f92937w;
            String str2 = (String) c23465kCidToTypeAndId.f92938x;
            if (this.logicRegistry.isActiveChannel(str, str2)) {
                this.logicRegistry.channel(str, str2).handleEvent(event);
            }
        }
    }

    private final void logEmitOutcome(ChatEvent event, boolean emitted) {
        if (!emitted) {
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e = C2343i.f9272d;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, "Chat:SocketEvent")) {
                C2343i.f9271c.log(enumC2341g, "Chat:SocketEvent", "[onSocketEventReceived] failed to emit socket event: " + event, null);
                return;
            }
            return;
        }
        int i13 = this.collectedCount.get();
        int iIncrementAndGet = this.emittedCount.incrementAndGet();
        double d3 = ((double) iIncrementAndGet) / ((double) i13);
        C2343i c2343i2 = C2343i.f9269a;
        InterfaceC2339e interfaceC2339e2 = C2343i.f9272d;
        EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
        if (interfaceC2339e2.isLoggable(enumC2341g2, "Chat:SocketEvent")) {
            InterfaceC2344j interfaceC2344j = C2343i.f9271c;
            StringBuilder sbM30467u = AbstractC11266d.m30467u(iIncrementAndGet, "[onSocketEventReceived] event.type: ", ChatEventUtilsKt.getRealType(event), "; ", " => ");
            sbM30467u.append(i13);
            sbM30467u.append(" (");
            sbM30467u.append(d3);
            sbM30467u.append(")");
            interfaceC2344j.log(enumC2341g2, "Chat:SocketEvent", sbM30467u.toString(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        if (r8 == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object threadFromMessage(io.getstream.chat.android.client.internal.state.event.handler.internal.EventBatchUpdate r6, io.getstream.chat.android.models.Message r7, q83.InterfaceC30057d<? super io.getstream.chat.android.models.Thread> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential.C192701
            if (r0 == 0) goto L13
            r0 = r8
            io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$threadFromMessage$1 r0 = (io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential.C192701) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$threadFromMessage$1 r0 = new io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential$threadFromMessage$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r6 = r0.L$2
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.L$1
            io.getstream.chat.android.models.Message r6 = (io.getstream.chat.android.models.Message) r6
            java.lang.Object r6 = r0.L$0
            io.getstream.chat.android.client.internal.state.event.handler.internal.EventBatchUpdate r6 = (io.getstream.chat.android.client.internal.state.event.handler.internal.EventBatchUpdate) r6
            p505ts.AbstractC34132o.m107864I(r8)
            goto L7c
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            java.lang.Object r6 = r0.L$1
            r7 = r6
            io.getstream.chat.android.models.Message r7 = (io.getstream.chat.android.models.Message) r7
            java.lang.Object r6 = r0.L$0
            io.getstream.chat.android.client.internal.state.event.handler.internal.EventBatchUpdate r6 = (io.getstream.chat.android.client.internal.state.event.handler.internal.EventBatchUpdate) r6
            p505ts.AbstractC34132o.m107864I(r8)
            goto L5f
        L4b:
            p505ts.AbstractC34132o.m107864I(r8)
            java.lang.String r8 = r7.getId()
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r5.threadFromPendingUpdateOrRepo(r6, r8, r0)
            if (r8 != r1) goto L5f
            goto L7b
        L5f:
            io.getstream.chat.android.models.Thread r8 = (io.getstream.chat.android.models.Thread) r8
            if (r8 != 0) goto L7e
            java.lang.String r7 = r7.getParentId()
            r8 = 0
            if (r7 == 0) goto L7e
            r0.L$0 = r8
            r0.L$1 = r8
            r0.L$2 = r8
            r8 = 0
            r0.I$0 = r8
            r0.label = r3
            java.lang.Object r8 = r5.threadFromPendingUpdateOrRepo(r6, r7, r0)
            if (r8 != r1) goto L7c
        L7b:
            return r1
        L7c:
            io.getstream.chat.android.models.Thread r8 = (io.getstream.chat.android.models.Thread) r8
        L7e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential.threadFromMessage(io.getstream.chat.android.client.internal.state.event.handler.internal.EventBatchUpdate, io.getstream.chat.android.models.Message, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object threadFromPendingUpdateOrRepo(EventBatchUpdate eventBatchUpdate, String str, InterfaceC30057d<? super Thread> interfaceC30057d) {
        Thread currentThread = eventBatchUpdate.getCurrentThread(str);
        return currentThread == null ? this.repos.selectThread(str, interfaceC30057d) : currentThread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object updateChannelsState(BatchEvent batchEvent, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C192711 c192711;
        Object next;
        BatchEvent batchEvent2 = batchEvent;
        if (interfaceC30057d instanceof C192711) {
            c192711 = (C192711) interfaceC30057d;
            int i13 = c192711.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c192711.label = i13 - Integer.MIN_VALUE;
            } else {
                c192711 = new C192711(interfaceC30057d);
            }
        } else {
            c192711 = new C192711(interfaceC30057d);
        }
        Object obj = c192711.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c192711.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            ChatEvent chatEvent = (ChatEvent) AbstractC25265s.m74100H0(batchEvent2.getSortedEvents());
            ChatEvent chatEvent2 = (ChatEvent) AbstractC25265s.m74114R0(batchEvent2.getSortedEvents());
            Date createdAt = chatEvent != null ? chatEvent.getCreatedAt() : null;
            Date createdAt2 = chatEvent2 != null ? chatEvent2.getCreatedAt() : null;
            Boolean boolValueOf = (createdAt == null || createdAt2 == null) ? null : Boolean.valueOf(createdAt.compareTo(createdAt2) < 0);
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                InterfaceC2344j interfaceC2344j = logger.f9274b;
                int id4 = batchEvent2.getId();
                int size = batchEvent2.getSize();
                Integer num = chatEvent != null ? new Integer(chatEvent.getSeq()) : null;
                Integer num2 = chatEvent2 != null ? new Integer(chatEvent2.getSeq()) : null;
                StringBuilder sbM30465s = AbstractC11266d.m30465s(id4, size, "[updateChannelsState] batchId: ", ", batchEvent.size: ", ", first(");
                AbstractC31061c.m95621A(sbM30465s, num, ") < last(", num2, "): ");
                sbM30465s.append(boolValueOf);
                interfaceC2344j.log(enumC2341g, str, sbM30465s.toString(), null);
            }
            List<ChatEvent> sortedEvents = batchEvent2.getSortedEvents();
            this.stateRegistry.handleBatchEvent$stream_chat_android_client_release(batchEvent2);
            List<ChatEvent> list = sortedEvents;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof CidEvent) {
                    arrayList.add(obj2);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj3 : arrayList) {
                String cid = ((CidEvent) obj3).getCid();
                Object arrayList2 = linkedHashMap.get(cid);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(cid, arrayList2);
                }
                ((List) arrayList2).add(obj3);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                List<? extends ChatEvent> list2 = (List) entry.getValue();
                C23465k c23465kCidToTypeAndId = StringExtensionsKt.cidToTypeAndId(str2);
                String str3 = (String) c23465kCidToTypeAndId.f92937w;
                String str4 = (String) c23465kCidToTypeAndId.f92938x;
                List<? extends ChatEvent> list3 = list2;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        CidEvent cidEvent = (CidEvent) it.next();
                        if ((cidEvent instanceof ChannelDeletedEvent) || (cidEvent instanceof NotificationChannelDeletedEvent)) {
                            this.logicRegistry.removeChannel$stream_chat_android_client_release(str3, str4);
                            break;
                        }
                    }
                }
                if (this.logicRegistry.isActiveChannel(str3, str4)) {
                    this.logicRegistry.channel(str3, str4).handleEvents(list2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj4 : list) {
                if (obj4 instanceof MarkAllReadEvent) {
                    arrayList3.add(obj4);
                }
            }
            MarkAllReadEvent markAllReadEvent = (MarkAllReadEvent) AbstractC25265s.m74114R0(arrayList3);
            if (markAllReadEvent != null) {
                Iterator<T> it3 = this.logicRegistry.getActiveChannelsLogic().iterator();
                while (it3.hasNext()) {
                    ((ChannelLogic) it3.next()).handleEvent(markAllReadEvent);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj5 : list) {
                if (obj5 instanceof NotificationChannelMutesUpdatedEvent) {
                    arrayList4.add(obj5);
                }
            }
            NotificationChannelMutesUpdatedEvent notificationChannelMutesUpdatedEvent = (NotificationChannelMutesUpdatedEvent) AbstractC25265s.m74114R0(arrayList4);
            if (notificationChannelMutesUpdatedEvent != null) {
                Iterator<T> it4 = this.logicRegistry.getActiveChannelsLogic().iterator();
                while (it4.hasNext()) {
                    ((ChannelLogic) it4.next()).handleEvent(notificationChannelMutesUpdatedEvent);
                }
            }
            Iterator<T> it5 = list.iterator();
            do {
                if (!it5.hasNext()) {
                    next = null;
                    break;
                }
                next = it5.next();
            } while (!(((ChatEvent) next) instanceof UserPresenceChangedEvent));
            ChatEvent chatEvent3 = (ChatEvent) next;
            if (chatEvent3 != null) {
                UserPresenceChangedEvent userPresenceChangedEvent = (UserPresenceChangedEvent) chatEvent3;
                List<ChannelState> activeChannelStates$stream_chat_android_client_release = this.stateRegistry.getActiveChannelStates$stream_chat_android_client_release();
                ArrayList<ChannelState> arrayList5 = new ArrayList();
                for (Object obj6 : activeChannelStates$stream_chat_android_client_release) {
                    if (containsWithUserId(((ChannelState) obj6).getMembers(), userPresenceChangedEvent.getUser().getId())) {
                        arrayList5.add(obj6);
                    }
                }
                for (ChannelState channelState : arrayList5) {
                    this.logicRegistry.channel(channelState.getChannelType(), channelState.getChannelId()).handleEvent(chatEvent3);
                }
            }
            ArrayList arrayList6 = new ArrayList();
            for (Object obj7 : list) {
                if (obj7 instanceof UserMessagesDeletedEvent) {
                    arrayList6.add(obj7);
                }
            }
            Iterator it6 = arrayList6.iterator();
            while (it6.hasNext()) {
                handleUserMessagesDeletedEvent((UserMessagesDeletedEvent) it6.next());
            }
            List<QueryChannelsLogic> activeQueryChannelsLogic = this.logicRegistry.getActiveQueryChannelsLogic();
            ArrayList arrayList7 = new ArrayList(AbstractC25267u.m74163i0(activeQueryChannelsLogic, 10));
            Iterator<T> it7 = activeQueryChannelsLogic.iterator();
            while (it7.hasNext()) {
                arrayList7.add(AbstractC3006f0.m8711e(this.scope, null, new EventHandlerSequential$updateChannelsState$10$1(this, batchEvent2, (QueryChannelsLogic) it7.next(), null), 3));
            }
            c192711.L$0 = batchEvent2;
            c192711.L$1 = null;
            c192711.L$2 = null;
            c192711.L$3 = null;
            c192711.L$4 = null;
            c192711.L$5 = null;
            c192711.L$6 = null;
            c192711.label = 1;
            if (AbstractC3006f0.m8712f(arrayList7, c192711) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            batchEvent2 = (BatchEvent) c192711.L$0;
            AbstractC34132o.m107864I(obj);
        }
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
        String str5 = logger2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str5)) {
            logger2.f9274b.log(enumC2341g2, str5, AbstractC2875y.m8295h(batchEvent2.getId(), "[updateChannelsState] completed batchId: "), null);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:100:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:102:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:109:0x030d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0311  */
    /* JADX WARN: Code duplicated, block: B:112:0x0314  */
    /* JADX WARN: Code duplicated, block: B:30:0x0190  */
    /* JADX WARN: Code duplicated, block: B:32:0x019b  */
    /* JADX WARN: Code duplicated, block: B:33:0x019f  */
    /* JADX WARN: Code duplicated, block: B:35:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:36:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:39:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:42:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:45:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:46:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:48:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:51:0x0204  */
    /* JADX WARN: Code duplicated, block: B:56:0x0231  */
    /* JADX WARN: Code duplicated, block: B:57:0x0235  */
    /* JADX WARN: Code duplicated, block: B:59:0x0238  */
    /* JADX WARN: Code duplicated, block: B:63:0x024a  */
    /* JADX WARN: Code duplicated, block: B:65:0x024d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0293  */
    /* JADX WARN: Code duplicated, block: B:73:0x0297  */
    /* JADX WARN: Code duplicated, block: B:75:0x029a  */
    /* JADX WARN: Code duplicated, block: B:78:0x02af  */
    /* JADX WARN: Code duplicated, block: B:80:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:82:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:84:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:86:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:89:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:90:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:92:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:99:0x02f1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x027c -> B:68:0x027f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object updateGlobalState(io.getstream.chat.android.client.internal.state.event.handler.internal.batch.BatchEvent r20, q83.InterfaceC30057d<? super l83.C23454a0> r21) {
        /*
            Method dump skipped, instruction units count: 922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential.updateGlobalState(io.getstream.chat.android.client.internal.state.event.handler.internal.batch.BatchEvent, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 updateGlobalState$lambda$25(EventHandlerSequential eventHandlerSequential, C22669g0 c22669g0, C22665e0 c22665e0, C22665e0 c22665e1, C22665e0 c22665e2, C22669g0 c22669g1, User user) {
        AbstractC22676k.m65750j(user, "user");
        if (!AbstractC22676k.m65745e(user.getId(), eventHandlerSequential.currentUserId)) {
            user = null;
        }
        if (user == null) {
            return null;
        }
        c22669g0.f89336w = user;
        c22665e0.f89334w = user.getTotalUnreadCount();
        c22665e1.f89334w = user.getUnreadChannels();
        c22665e2.f89334w = user.getUnreadThreads();
        c22669g1.f89336w = user.getBlockedUserIds();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:105:0x0521  */
    /* JADX WARN: Code duplicated, block: B:138:0x068d  */
    /* JADX WARN: Code duplicated, block: B:158:0x0781  */
    /* JADX WARN: Code duplicated, block: B:164:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:173:0x0858  */
    /* JADX WARN: Code duplicated, block: B:182:0x0887  */
    /* JADX WARN: Code duplicated, block: B:185:0x08a2  */
    /* JADX WARN: Code duplicated, block: B:194:0x08d9  */
    /* JADX WARN: Code duplicated, block: B:203:0x0910  */
    /* JADX WARN: Code duplicated, block: B:212:0x0984  */
    /* JADX WARN: Code duplicated, block: B:217:0x09ea  */
    /* JADX WARN: Code duplicated, block: B:222:0x0a29  */
    /* JADX WARN: Code duplicated, block: B:227:0x0a69  */
    /* JADX WARN: Code duplicated, block: B:232:0x0aa9  */
    /* JADX WARN: Code duplicated, block: B:237:0x0adb  */
    /* JADX WARN: Code duplicated, block: B:242:0x0b09  */
    /* JADX WARN: Code duplicated, block: B:247:0x0b31  */
    /* JADX WARN: Code duplicated, block: B:252:0x0b57  */
    /* JADX WARN: Code duplicated, block: B:262:0x0bb2  */
    /* JADX WARN: Code duplicated, block: B:267:0x0c35  */
    /* JADX WARN: Code duplicated, block: B:276:0x0c5a  */
    /* JADX WARN: Code duplicated, block: B:285:0x0c7f  */
    /* JADX WARN: Code duplicated, block: B:294:0x0ca4  */
    /* JADX WARN: Code duplicated, block: B:303:0x0cc9  */
    /* JADX WARN: Code duplicated, block: B:312:0x0cee  */
    /* JADX WARN: Code duplicated, block: B:321:0x0d13  */
    /* JADX WARN: Code duplicated, block: B:323:0x0d17  */
    /* JADX WARN: Code duplicated, block: B:325:0x0d24  */
    /* JADX WARN: Code duplicated, block: B:330:0x0d39  */
    /* JADX WARN: Code duplicated, block: B:333:0x0d67  */
    /* JADX WARN: Code duplicated, block: B:336:0x0d74  */
    /* JADX WARN: Code duplicated, block: B:338:0x0d85  */
    /* JADX WARN: Code duplicated, block: B:428:0x108a  */
    /* JADX WARN: Code duplicated, block: B:433:0x10be  */
    /* JADX WARN: Code duplicated, block: B:435:0x10c2  */
    /* JADX WARN: Code duplicated, block: B:437:0x10d4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x05c2 -> B:103:0x051b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:423:0x1055 -> B:427:0x1087). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:425:0x1083 -> B:427:0x1087). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:431:0x10ba -> B:427:0x1087). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:434:0x10c0 -> B:427:0x1087). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:436:0x10d2 -> B:427:0x1087). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:438:0x10fe -> B:427:0x1087). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:474:0x1236 -> B:446:0x1132). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:476:0x125e -> B:446:0x1132). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:509:0x136e -> B:513:0x13a6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:511:0x13a3 -> B:513:0x13a6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object updateOfflineStorage(io.getstream.chat.android.client.internal.state.event.handler.internal.batch.BatchEvent r55, q83.InterfaceC30057d<? super l83.C23454a0> r56) {
        /*
            Method dump skipped, instruction units count: 5156
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential.updateOfflineStorage(io.getstream.chat.android.client.internal.state.event.handler.internal.batch.BatchEvent, q83.d):java.lang.Object");
    }

    private final void updateQueryThreadsState(BatchEvent batchEvent) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC2875y.m8295h(batchEvent.getSize(), "[updateQueryThreadsState] batchEvent.size: "), null);
        }
        Iterator<T> it = this.logicRegistry.getActiveQueryThreadsLogic().iterator();
        while (it.hasNext()) {
            ((QueryThreadsLogic) it.next()).handleEvents$stream_chat_android_client_release(batchEvent.getSortedEvents());
        }
    }

    private final void updateThreadState(BatchEvent batchEvent) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC2875y.m8295h(batchEvent.getSize(), "[updateThreadState] batchEvent.size: "), null);
        }
        List<ChatEvent> sortedEvents = batchEvent.getSortedEvents();
        ArrayList arrayList = new ArrayList();
        for (Object obj : sortedEvents) {
            if (obj instanceof HasMessage) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            HasMessage hasMessage = (HasMessage) obj2;
            String parentId = hasMessage.getMessage().getParentId();
            if (parentId == null) {
                parentId = hasMessage.getMessage().getId();
            }
            Object arrayList2 = linkedHashMap.get(parentId);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(parentId, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        LogicRegistry logicRegistry = this.logicRegistry;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (logicRegistry.isActiveThread((String) entry.getKey())) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            String str2 = (String) entry2.getKey();
            this.logicRegistry.thread(str2).handleMessageEvents$stream_chat_android_client_release((List) entry2.getValue());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : sortedEvents) {
            if (obj3 instanceof HasReminder) {
                arrayList3.add(obj3);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj4 : arrayList3) {
            String messageId = ((HasReminder) obj4).getReminder().getMessageId();
            Object arrayList4 = linkedHashMap3.get(messageId);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap3.put(messageId, arrayList4);
            }
            ((List) arrayList4).add(obj4);
        }
        LogicRegistry logicRegistry2 = this.logicRegistry;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            if (logicRegistry2.isActiveThread((String) entry3.getKey())) {
                linkedHashMap4.put(entry3.getKey(), entry3.getValue());
            }
        }
        for (Map.Entry entry4 : linkedHashMap4.entrySet()) {
            String str3 = (String) entry4.getKey();
            this.logicRegistry.thread(str3).handleReminderEvents$stream_chat_android_client_release((List) entry4.getValue());
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : sortedEvents) {
            if (obj5 instanceof HasPoll) {
                arrayList5.add(obj5);
            }
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        for (Object obj6 : arrayList5) {
            String messageId2 = ((HasPoll) obj6).getMessageId();
            Object arrayList6 = linkedHashMap5.get(messageId2);
            if (arrayList6 == null) {
                arrayList6 = new ArrayList();
                linkedHashMap5.put(messageId2, arrayList6);
            }
            ((List) arrayList6).add(obj6);
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        for (Map.Entry entry5 : linkedHashMap5.entrySet()) {
            String str4 = (String) entry5.getKey();
            if (str4 != null && this.logicRegistry.isActiveThread(str4)) {
                linkedHashMap6.put(entry5.getKey(), entry5.getValue());
            }
        }
        for (Map.Entry entry6 : linkedHashMap6.entrySet()) {
            String str5 = (String) entry6.getKey();
            List<? extends HasPoll> list = (List) entry6.getValue();
            if (str5 != null) {
                this.logicRegistry.thread(str5).handlePollEvents$stream_chat_android_client_release(this.currentUserId, list);
            }
        }
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
        String str6 = logger2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str6)) {
            logger2.f9274b.log(enumC2341g2, str6, AbstractC2875y.m8295h(batchEvent.getId(), "[updateThreadState] completed batchId: "), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object upsertReminder(EventBatchUpdate eventBatchUpdate, String str, MessageReminder messageReminder, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C192821 c192821;
        EventBatchUpdate eventBatchUpdate2;
        MessageReminder messageReminder2;
        Message message;
        EventBatchUpdate eventBatchUpdate3;
        MessageReminder messageReminder3;
        if (interfaceC30057d instanceof C192821) {
            c192821 = (C192821) interfaceC30057d;
            int i13 = c192821.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c192821.label = i13 - Integer.MIN_VALUE;
            } else {
                c192821 = new C192821(interfaceC30057d);
            }
        } else {
            c192821 = new C192821(interfaceC30057d);
        }
        Object objSelectMessage = c192821.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c192821.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objSelectMessage);
            Message message2 = messageReminder.getMessage();
            if (message2 == null && (message2 = eventBatchUpdate.getCurrentMessage(str)) == null) {
                RepositoryFacade repositoryFacade = this.repos;
                c192821.L$0 = eventBatchUpdate;
                c192821.L$1 = null;
                c192821.L$2 = messageReminder;
                c192821.label = 1;
                objSelectMessage = repositoryFacade.selectMessage(str, c192821);
                if (objSelectMessage == enumC31071a) {
                    return enumC31071a;
                }
                eventBatchUpdate3 = eventBatchUpdate;
                messageReminder3 = messageReminder;
            } else {
                eventBatchUpdate2 = eventBatchUpdate;
                messageReminder2 = messageReminder;
                message = message2;
            }
            if (message != null) {
                eventBatchUpdate2.addMessage(message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : MessageReminderKt.toMessageReminderInfo(messageReminder2), (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false));
            }
            return C23454a0.f92919a;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        messageReminder3 = (MessageReminder) c192821.L$2;
        eventBatchUpdate3 = (EventBatchUpdate) c192821.L$0;
        AbstractC34132o.m107864I(objSelectMessage);
        message = (Message) objSelectMessage;
        eventBatchUpdate2 = eventBatchUpdate3;
        messageReminder2 = messageReminder3;
        if (message != null) {
            eventBatchUpdate2.addMessage(message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : MessageReminderKt.toMessageReminderInfo(messageReminder2), (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false));
        }
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandler
    public final Object handleEvents(ChatEvent[] chatEventArr, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objHandleBatchEvent = handleBatchEvent(new BatchEvent(0, AbstractC25260n.m74049W0(chatEventArr), false, 1, null), interfaceC30057d);
        return objHandleBatchEvent == EnumC31071a.f128113w ? objHandleBatchEvent : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandler
    public final void startListening() {
        boolean zIsDisposed = this.eventsDisposable.getIsDisposed();
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[startListening] isDisposed: " + zIsDisposed + ", currentUserId: " + this.currentUserId, null);
        }
        if (zIsDisposed) {
            C2996c2 c2996c2M8732z = AbstractC3006f0.m8732z(this.scope, null, null, new EventHandlerSequential$startListening$initJob$1(this, null), 3);
            AbstractC3006f0.m8732z(this.scope, null, null, new C192672(null), 3);
            EventHandlerSequential$startListening$collectSocketEvent$1 eventHandlerSequential$startListening$collectSocketEvent$1 = new EventHandlerSequential$startListening$collectSocketEvent$1(this, c2996c2M8732z, null);
            AbstractC3006f0.m8732z(this.scope, null, null, new C192683(eventHandlerSequential$startListening$collectSocketEvent$1, null), 3);
            boolean zIsEmpty = this.bufferConfig.getChannelTypes().isEmpty();
            if (!zIsEmpty) {
                AbstractC3006f0.m8732z(this.scope, null, null, new C192694(eventHandlerSequential$startListening$collectSocketEvent$1, null), 3);
            }
            this.eventsDisposable = (Disposable) this.subscribeForEvents.invoke(!zIsEmpty ? this.bufferedSocketEventListener : this.defaultSocketEventListener);
        }
    }

    @Override // io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandler
    public final void stopListening() {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[stopListening] no args", null);
        }
        this.eventsDisposable.dispose();
        AbstractC3006f0.m8717k(AbstractC3006f0.m8725s(this.scope.getCoroutineContext()));
    }
}
