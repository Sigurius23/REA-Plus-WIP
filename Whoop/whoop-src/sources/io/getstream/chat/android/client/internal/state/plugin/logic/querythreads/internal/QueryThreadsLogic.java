package io.getstream.chat.android.client.internal.state.plugin.logic.querythreads.internal;

import androidx.core.app.NotificationCompat;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import io.getstream.chat.android.client.api.models.QueryThreadsRequest;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.events.MessageDeletedEvent;
import io.getstream.chat.android.client.events.MessageReadEvent;
import io.getstream.chat.android.client.events.MessageUpdatedEvent;
import io.getstream.chat.android.client.events.NewMessageEvent;
import io.getstream.chat.android.client.events.NotificationChannelDeletedEvent;
import io.getstream.chat.android.client.events.NotificationMarkReadEvent;
import io.getstream.chat.android.client.events.NotificationMarkUnreadEvent;
import io.getstream.chat.android.client.events.NotificationThreadMessageNewEvent;
import io.getstream.chat.android.client.events.ReactionDeletedEvent;
import io.getstream.chat.android.client.events.ReactionNewEvent;
import io.getstream.chat.android.client.events.ReactionUpdateEvent;
import io.getstream.chat.android.client.events.ThreadUpdatedEvent;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.QueryThreadsResult;
import io.getstream.chat.android.models.Thread;
import io.getstream.chat.android.models.ThreadInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import n23.AbstractC26205h;
import n23.C26198a;
import n23.C26203f;
import n23.C26204g;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u0019\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0018\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020\rH\u0082@¢\u0006\u0004\b%\u0010&J\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0'2\u0006\u0010$\u001a\u00020\rH\u0000¢\u0006\u0004\b(\u0010)J\u0018\u0010,\u001a\u00020\n2\u0006\u0010$\u001a\u00020\rH\u0080@¢\u0006\u0004\b+\u0010&J&\u00101\u001a\u00020\n2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0'2\u0006\u0010$\u001a\u00020\rH\u0080@¢\u0006\u0004\b/\u00100J\u001d\u00106\u001a\u00020\n2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\b02H\u0000¢\u0006\u0004\b4\u00105J\u0019\u0010:\u001a\u0004\u0018\u00010\u00142\u0006\u00107\u001a\u00020 H\u0000¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b;\u0010\u0017J\u0017\u0010>\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b=\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010?R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010@R\u001b\u0010F\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001c\u0010H\u001a\b\u0012\u0004\u0012\u00020 0G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006J"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;", "", "Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;", "stateLogic", "Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsDatabaseLogic;", "databaseLogic", "<init>", "(Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsDatabaseLogic;)V", "Lio/getstream/chat/android/client/events/ChatEvent;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "handleEvent", "(Lio/getstream/chat/android/client/events/ChatEvent;)V", "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;", "", "isNextPageRequest", "(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;)Z", "Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;", "onNewThreadMessageNotification", "(Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;)V", "Lio/getstream/chat/android/models/Message;", "message", "updateParentOrReply", "(Lio/getstream/chat/android/models/Message;)V", "Lio/getstream/chat/android/client/events/MessageReadEvent;", "markThreadAsRead", "(Lio/getstream/chat/android/client/events/MessageReadEvent;)V", "Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;", "(Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;)V", "Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;", "markThreadAsUnread", "(Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;)V", "", "cid", "deleteThreadsFromChannel", "(Ljava/lang/String;)V", "request", "queryThreadsOffline", "(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;", "Ln23/h;", "onQueryThreadsPrecondition$stream_chat_android_client_release", "(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;)Ln23/h;", "onQueryThreadsPrecondition", "onQueryThreadsRequest$stream_chat_android_client_release", "onQueryThreadsRequest", "Lio/getstream/chat/android/models/QueryThreadsResult;", "result", "onQueryThreadsResult$stream_chat_android_client_release", "(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;", "onQueryThreadsResult", "", "events", "handleEvents$stream_chat_android_client_release", "(Ljava/util/List;)V", "handleEvents", "messageId", "getMessage$stream_chat_android_client_release", "(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;", "getMessage", "upsertMessage$stream_chat_android_client_release", "upsertMessage", "deleteMessage$stream_chat_android_client_release", "deleteMessage", "Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;", "Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsDatabaseLogic;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "", "threadIdsInSession", "Ljava/util/List;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QueryThreadsLogic {
    private final QueryThreadsDatabaseLogic databaseLogic;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final QueryThreadsStateLogic stateLogic;
    private List<String> threadIdsInSession;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.logic.querythreads.internal.QueryThreadsLogic$queryThreadsOffline$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.plugin.logic.querythreads.internal.QueryThreadsLogic", m100430f = "QueryThreadsLogic.kt", m100431l = {253, 255}, m100432m = "queryThreadsOffline")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193281 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C193281(InterfaceC30057d<? super C193281> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return QueryThreadsLogic.this.queryThreadsOffline(null, this);
        }
    }

    public QueryThreadsLogic(QueryThreadsStateLogic stateLogic, QueryThreadsDatabaseLogic databaseLogic) {
        AbstractC22676k.m65750j(stateLogic, "stateLogic");
        AbstractC22676k.m65750j(databaseLogic, "databaseLogic");
        this.stateLogic = stateLogic;
        this.databaseLogic = databaseLogic;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:QueryThreadsLogic");
        this.threadIdsInSession = new ArrayList();
    }

    private final void deleteThreadsFromChannel(String cid) {
        List<Thread> threads$stream_chat_android_client_release = this.stateLogic.getThreads$stream_chat_android_client_release();
        ArrayList arrayList = new ArrayList();
        for (Object obj : threads$stream_chat_android_client_release) {
            if (!AbstractC22676k.m65745e(((Thread) obj).getCid(), cid)) {
                arrayList.add(obj);
            }
        }
        this.stateLogic.setThreads$stream_chat_android_client_release(arrayList);
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final void handleEvent(ChatEvent event) {
        if (event instanceof NotificationChannelDeletedEvent) {
            deleteThreadsFromChannel(((NotificationChannelDeletedEvent) event).getCid());
            return;
        }
        if (event instanceof NotificationThreadMessageNewEvent) {
            onNewThreadMessageNotification((NotificationThreadMessageNewEvent) event);
            return;
        }
        if (event instanceof NotificationMarkUnreadEvent) {
            markThreadAsUnread((NotificationMarkUnreadEvent) event);
            return;
        }
        if (event instanceof MessageReadEvent) {
            markThreadAsRead((MessageReadEvent) event);
            return;
        }
        if (event instanceof NotificationMarkReadEvent) {
            markThreadAsRead((NotificationMarkReadEvent) event);
            return;
        }
        if (event instanceof ThreadUpdatedEvent) {
            this.stateLogic.updateThreadFromEvent$stream_chat_android_client_release(((ThreadUpdatedEvent) event).getThread());
            return;
        }
        if (event instanceof NewMessageEvent) {
            updateParentOrReply(((NewMessageEvent) event).getMessage());
            return;
        }
        if (event instanceof MessageUpdatedEvent) {
            updateParentOrReply(((MessageUpdatedEvent) event).getMessage());
            return;
        }
        if (event instanceof MessageDeletedEvent) {
            updateParentOrReply(((MessageDeletedEvent) event).getMessage());
            return;
        }
        if (event instanceof ReactionNewEvent) {
            updateParentOrReply(((ReactionNewEvent) event).getMessage());
        } else if (event instanceof ReactionUpdateEvent) {
            updateParentOrReply(((ReactionUpdateEvent) event).getMessage());
        } else if (event instanceof ReactionDeletedEvent) {
            updateParentOrReply(((ReactionDeletedEvent) event).getMessage());
        }
    }

    private final boolean isNextPageRequest(QueryThreadsRequest queryThreadsRequest) {
        return queryThreadsRequest.getNext() != null;
    }

    private final void markThreadAsRead(MessageReadEvent event) {
        ThreadInfo thread = event.getThread();
        if (thread == null) {
            return;
        }
        this.stateLogic.markThreadAsReadByUser$stream_chat_android_client_release(thread, event.getUser(), event.getCreatedAt());
    }

    private final void markThreadAsUnread(NotificationMarkUnreadEvent event) {
        String threadId = event.getThreadId();
        if (threadId == null) {
            return;
        }
        this.stateLogic.markThreadAsUnreadByUser$stream_chat_android_client_release(threadId, event.getUser(), event.getCreatedAt());
    }

    private final void onNewThreadMessageNotification(NotificationThreadMessageNewEvent event) {
        String parentId = event.getMessage().getParentId();
        if (parentId == null) {
            return;
        }
        List<Thread> threads$stream_chat_android_client_release = this.stateLogic.getThreads$stream_chat_android_client_release();
        if (!(threads$stream_chat_android_client_release instanceof Collection) || !threads$stream_chat_android_client_release.isEmpty()) {
            Iterator<T> it = threads$stream_chat_android_client_release.iterator();
            while (it.hasNext()) {
                if (AbstractC22676k.m65745e(((Thread) it.next()).getParentMessageId(), parentId)) {
                    return;
                }
            }
        }
        this.stateLogic.addUnseenThreadId$stream_chat_android_client_release(parentId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
    
        if (r10 == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object queryThreadsOffline(io.getstream.chat.android.client.api.models.QueryThreadsRequest r9, q83.InterfaceC30057d<? super l83.C23454a0> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof io.getstream.chat.android.client.internal.state.plugin.logic.querythreads.internal.QueryThreadsLogic.C193281
            if (r0 == 0) goto L13
            r0 = r10
            io.getstream.chat.android.client.internal.state.plugin.logic.querythreads.internal.QueryThreadsLogic$queryThreadsOffline$1 r0 = (io.getstream.chat.android.client.internal.state.plugin.logic.querythreads.internal.QueryThreadsLogic.C193281) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.internal.state.plugin.logic.querythreads.internal.QueryThreadsLogic$queryThreadsOffline$1 r0 = new io.getstream.chat.android.client.internal.state.plugin.logic.querythreads.internal.QueryThreadsLogic$queryThreadsOffline$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 2
            r4 = 1
            l83.a0 r5 = l83.C23454a0.f92919a
            r6 = 0
            if (r2 == 0) goto L55
            if (r2 == r4) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r9 = r0.L$3
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r9 = r0.L$2
            io.getstream.chat.android.models.querysort.QuerySorter r9 = (io.getstream.chat.android.models.querysort.QuerySorter) r9
            java.lang.Object r9 = r0.L$1
            io.getstream.chat.android.models.FilterObject r9 = (io.getstream.chat.android.models.FilterObject) r9
            java.lang.Object r9 = r0.L$0
            io.getstream.chat.android.client.api.models.QueryThreadsRequest r9 = (io.getstream.chat.android.client.api.models.QueryThreadsRequest) r9
            p505ts.AbstractC34132o.m107864I(r10)
            goto L95
        L3d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L45:
            java.lang.Object r9 = r0.L$2
            io.getstream.chat.android.models.querysort.QuerySorter r9 = (io.getstream.chat.android.models.querysort.QuerySorter) r9
            java.lang.Object r9 = r0.L$1
            io.getstream.chat.android.models.FilterObject r9 = (io.getstream.chat.android.models.FilterObject) r9
            java.lang.Object r9 = r0.L$0
            io.getstream.chat.android.client.api.models.QueryThreadsRequest r9 = (io.getstream.chat.android.client.api.models.QueryThreadsRequest) r9
            p505ts.AbstractC34132o.m107864I(r10)
            goto L71
        L55:
            p505ts.AbstractC34132o.m107864I(r10)
            io.getstream.chat.android.models.FilterObject r10 = r9.getFilter()
            io.getstream.chat.android.models.querysort.QuerySorter r2 = r9.getSort()
            io.getstream.chat.android.client.internal.state.plugin.logic.querythreads.internal.QueryThreadsDatabaseLogic r7 = r8.databaseLogic
            r0.L$0 = r9
            r0.L$1 = r6
            r0.L$2 = r6
            r0.label = r4
            java.lang.Object r10 = r7.getLocalThreadsOrder$stream_chat_android_client_release(r10, r2, r0)
            if (r10 != r1) goto L71
            goto L94
        L71:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            int r9 = r9.getLimit()
            java.util.List r9 = m83.AbstractC25265s.m74156w1(r10, r9)
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L82
            return r5
        L82:
            io.getstream.chat.android.client.internal.state.plugin.logic.querythreads.internal.QueryThreadsDatabaseLogic r10 = r8.databaseLogic
            r0.L$0 = r6
            r0.L$1 = r6
            r0.L$2 = r6
            r0.L$3 = r6
            r0.label = r3
            java.lang.Object r10 = r10.getLocalThreads$stream_chat_android_client_release(r9, r0)
            if (r10 != r1) goto L95
        L94:
            return r1
        L95:
            java.util.List r10 = (java.util.List) r10
            boolean r9 = r10.isEmpty()
            if (r9 == 0) goto L9e
            return r5
        L9e:
            io.getstream.chat.android.client.internal.state.plugin.logic.querythreads.internal.QueryThreadsStateLogic r9 = r8.stateLogic
            r9.insertThreadsIfAbsent$stream_chat_android_client_release(r10)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.plugin.logic.querythreads.internal.QueryThreadsLogic.queryThreadsOffline(io.getstream.chat.android.client.api.models.QueryThreadsRequest, q83.d):java.lang.Object");
    }

    private final void updateParentOrReply(Message message) {
        if (this.stateLogic.updateParent$stream_chat_android_client_release(message)) {
            return;
        }
        this.stateLogic.upsertReply$stream_chat_android_client_release(message);
    }

    public final void deleteMessage$stream_chat_android_client_release(Message message) {
        AbstractC22676k.m65750j(message, "message");
        this.stateLogic.deleteMessage$stream_chat_android_client_release(message);
    }

    public final Message getMessage$stream_chat_android_client_release(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.stateLogic.getMessage$stream_chat_android_client_release(messageId);
    }

    public final void handleEvents$stream_chat_android_client_release(List<? extends ChatEvent> events) {
        AbstractC22676k.m65750j(events, "events");
        Iterator<T> it = events.iterator();
        while (it.hasNext()) {
            handleEvent((ChatEvent) it.next());
        }
    }

    public final AbstractC26205h onQueryThreadsPrecondition$stream_chat_android_client_release(QueryThreadsRequest request) {
        AbstractC22676k.m65750j(request, "request");
        if (this.stateLogic.isLoading$stream_chat_android_client_release()) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "Already loading the threads, ignoring all other load requests.", null);
            }
            return new C26203f(new C26198a("Already loading the threads, ignoring all other load requests."));
        }
        if (!this.stateLogic.isLoadingMore$stream_chat_android_client_release() || request.getNext() == null) {
            return new C26204g(C23454a0.f92919a);
        }
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
        String str2 = logger2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
            logger2.f9274b.log(enumC2341g2, str2, "Already loading the next page of threads, ignoring all other next page requests.", null);
        }
        return new C26203f(new C26198a("Already loading the next page of threads, ignoring all other next page requests."));
    }

    public final Object onQueryThreadsRequest$stream_chat_android_client_release(QueryThreadsRequest queryThreadsRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objQueryThreadsOffline;
        boolean zIsNextPageRequest = isNextPageRequest(queryThreadsRequest);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (zIsNextPageRequest) {
            this.stateLogic.setLoadingMore$stream_chat_android_client_release(true);
        } else {
            this.stateLogic.setLoadingError$stream_chat_android_client_release(false);
            this.stateLogic.setLoading$stream_chat_android_client_release(true);
            if (!this.stateLogic.getUnseenThreadIds$stream_chat_android_client_release().isEmpty()) {
                this.stateLogic.clearUnseenThreadIds$stream_chat_android_client_release();
            } else if (this.stateLogic.getThreads$stream_chat_android_client_release().isEmpty() && (objQueryThreadsOffline = queryThreadsOffline(queryThreadsRequest, interfaceC30057d)) == EnumC31071a.f128113w) {
                return objQueryThreadsOffline;
            }
        }
        return c23454a0;
    }

    public final Object onQueryThreadsResult$stream_chat_android_client_release(AbstractC26205h abstractC26205h, QueryThreadsRequest queryThreadsRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.stateLogic.setLoadingMore$stream_chat_android_client_release(false);
        this.stateLogic.setLoading$stream_chat_android_client_release(false);
        boolean z4 = abstractC26205h instanceof C26204g;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (z4) {
            if (isNextPageRequest(queryThreadsRequest)) {
                QueryThreadsStateLogic queryThreadsStateLogic = this.stateLogic;
                QueryThreadsResult queryThreadsResult = (QueryThreadsResult) ((C26204g) abstractC26205h).f103919a;
                queryThreadsStateLogic.upsertThreads$stream_chat_android_client_release(queryThreadsResult.getThreads());
                List<String> list = this.threadIdsInSession;
                List<Thread> threads = queryThreadsResult.getThreads();
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(threads, 10));
                Iterator<T> it = threads.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Thread) it.next()).getParentMessageId());
                }
                AbstractC25265s.m74141p0(list, arrayList);
            } else {
                QueryThreadsStateLogic queryThreadsStateLogic2 = this.stateLogic;
                QueryThreadsResult queryThreadsResult2 = (QueryThreadsResult) ((C26204g) abstractC26205h).f103919a;
                queryThreadsStateLogic2.setThreads$stream_chat_android_client_release(queryThreadsResult2.getThreads());
                this.stateLogic.clearUnseenThreadIds$stream_chat_android_client_release();
                List<Thread> threads2 = queryThreadsResult2.getThreads();
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(threads2, 10));
                Iterator<T> it3 = threads2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((Thread) it3.next()).getParentMessageId());
                }
                this.threadIdsInSession = AbstractC25265s.m74097F1(arrayList2);
            }
            this.stateLogic.setNext$stream_chat_android_client_release(((QueryThreadsResult) ((C26204g) abstractC26205h).f103919a).getNext());
            Object localThreadsOrder$stream_chat_android_client_release = this.databaseLogic.setLocalThreadsOrder$stream_chat_android_client_release(queryThreadsRequest.getFilter(), queryThreadsRequest.getSort(), this.threadIdsInSession, interfaceC30057d);
            if (localThreadsOrder$stream_chat_android_client_release == EnumC31071a.f128113w) {
                return localThreadsOrder$stream_chat_android_client_release;
            }
        } else {
            if (!(abstractC26205h instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!isNextPageRequest(queryThreadsRequest)) {
                this.stateLogic.setLoadingError$stream_chat_android_client_release(true);
            }
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.INFO;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "[queryThreadsResult] with request: " + queryThreadsRequest + " failed.", null);
            }
        }
        return c23454a0;
    }

    public final void upsertMessage$stream_chat_android_client_release(Message message) {
        AbstractC22676k.m65750j(message, "message");
        updateParentOrReply(message);
    }

    private final void markThreadAsRead(NotificationMarkReadEvent event) {
        ThreadInfo thread = event.getThread();
        if (thread == null) {
            return;
        }
        this.stateLogic.markThreadAsReadByUser$stream_chat_android_client_release(thread, event.getUser(), event.getCreatedAt());
    }
}
