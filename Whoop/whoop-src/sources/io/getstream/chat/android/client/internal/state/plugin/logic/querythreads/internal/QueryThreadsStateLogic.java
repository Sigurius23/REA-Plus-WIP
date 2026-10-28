package io.getstream.chat.android.client.internal.state.plugin.logic.querythreads.internal;

import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.extensions.internal.ThreadKt;
import io.getstream.chat.android.client.internal.state.plugin.state.global.internal.MutableGlobalState;
import io.getstream.chat.android.client.internal.state.plugin.state.querythreads.internal.QueryThreadsMutableState;
import io.getstream.chat.android.models.DraftMessage;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.MessageType;
import io.getstream.chat.android.models.Thread;
import io.getstream.chat.android.models.ThreadInfo;
import io.getstream.chat.android.models.User;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0016\u0010\u0010J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0018\u0010\u0014J\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\u001d\u0010\rJ\u001d\u0010 \u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\u001f\u0010\rJ\u001d\u0010\"\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b!\u0010\rJ\u000f\u0010%\u001a\u00020\u000bH\u0000¢\u0006\u0004\b#\u0010$J\u0019\u0010*\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010&H\u0000¢\u0006\u0004\b(\u0010)J\u0015\u0010.\u001a\b\u0012\u0004\u0012\u00020&0+H\u0000¢\u0006\u0004\b,\u0010-J\u0017\u00101\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020&H\u0000¢\u0006\u0004\b0\u0010)J\u000f\u00103\u001a\u00020\u000bH\u0000¢\u0006\u0004\b2\u0010$J\u0017\u00106\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000eH\u0000¢\u0006\u0004\b5\u0010\u0014J\u0019\u0010;\u001a\u0004\u0018\u0001082\u0006\u00107\u001a\u00020&H\u0000¢\u0006\u0004\b9\u0010:J\u0017\u0010?\u001a\u00020\u000b2\u0006\u0010<\u001a\u000208H\u0000¢\u0006\u0004\b=\u0010>J\u0017\u0010C\u001a\u00020\u000e2\u0006\u0010@\u001a\u000208H\u0000¢\u0006\u0004\bA\u0010BJ\u0017\u0010F\u001a\u00020\u000b2\u0006\u0010D\u001a\u000208H\u0000¢\u0006\u0004\bE\u0010>J'\u0010O\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020KH\u0000¢\u0006\u0004\bM\u0010NJ'\u0010S\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020&2\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020KH\u0000¢\u0006\u0004\bQ\u0010RJ\u0017\u0010V\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020GH\u0000¢\u0006\u0004\bT\u0010UR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010WR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010X¨\u0006Y"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;", "", "Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;", "mutableState", "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;", "mutableGlobalState", "<init>", "(Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;)V", "", "Lio/getstream/chat/android/models/Thread;", "threads", "Ll83/a0;", "upsertDraftMessages", "(Ljava/util/List;)V", "", "isLoading$stream_chat_android_client_release", "()Z", "isLoading", "loading", "setLoading$stream_chat_android_client_release", "(Z)V", "setLoading", "isLoadingMore$stream_chat_android_client_release", "isLoadingMore", "setLoadingMore$stream_chat_android_client_release", "setLoadingMore", "getThreads$stream_chat_android_client_release", "()Ljava/util/List;", "getThreads", "setThreads$stream_chat_android_client_release", "setThreads", "insertThreadsIfAbsent$stream_chat_android_client_release", "insertThreadsIfAbsent", "upsertThreads$stream_chat_android_client_release", "upsertThreads", "clearThreads$stream_chat_android_client_release", "()V", "clearThreads", "", "next", "setNext$stream_chat_android_client_release", "(Ljava/lang/String;)V", "setNext", "", "getUnseenThreadIds$stream_chat_android_client_release", "()Ljava/util/Set;", "getUnseenThreadIds", "id", "addUnseenThreadId$stream_chat_android_client_release", "addUnseenThreadId", "clearUnseenThreadIds$stream_chat_android_client_release", "clearUnseenThreadIds", "error", "setLoadingError$stream_chat_android_client_release", "setLoadingError", "messageId", "Lio/getstream/chat/android/models/Message;", "getMessage$stream_chat_android_client_release", "(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;", "getMessage", "message", "deleteMessage$stream_chat_android_client_release", "(Lio/getstream/chat/android/models/Message;)V", "deleteMessage", "parent", "updateParent$stream_chat_android_client_release", "(Lio/getstream/chat/android/models/Message;)Z", "updateParent", MessageType.REPLY, "upsertReply$stream_chat_android_client_release", "upsertReply", "Lio/getstream/chat/android/models/ThreadInfo;", "threadInfo", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "Ljava/util/Date;", "createdAt", "markThreadAsReadByUser$stream_chat_android_client_release", "(Lio/getstream/chat/android/models/ThreadInfo;Lio/getstream/chat/android/models/User;Ljava/util/Date;)V", "markThreadAsReadByUser", "threadId", "markThreadAsUnreadByUser$stream_chat_android_client_release", "(Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/util/Date;)V", "markThreadAsUnreadByUser", "updateThreadFromEvent$stream_chat_android_client_release", "(Lio/getstream/chat/android/models/ThreadInfo;)V", "updateThreadFromEvent", "Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;", "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QueryThreadsStateLogic {
    private final MutableGlobalState mutableGlobalState;
    private final QueryThreadsMutableState mutableState;

    public QueryThreadsStateLogic(QueryThreadsMutableState mutableState, MutableGlobalState mutableGlobalState) {
        AbstractC22676k.m65750j(mutableState, "mutableState");
        AbstractC22676k.m65750j(mutableGlobalState, "mutableGlobalState");
        this.mutableState = mutableState;
        this.mutableGlobalState = mutableGlobalState;
    }

    private final void upsertDraftMessages(List<Thread> threads) {
        Iterator<T> it = threads.iterator();
        while (it.hasNext()) {
            DraftMessage draft = ((Thread) it.next()).getDraft();
            if (draft != null) {
                this.mutableGlobalState.updateDraftMessage(draft);
            }
        }
    }

    public final void addUnseenThreadId$stream_chat_android_client_release(String id4) {
        AbstractC22676k.m65750j(id4, "id");
        this.mutableState.addUnseenThreadId$stream_chat_android_client_release(id4);
    }

    public final void clearThreads$stream_chat_android_client_release() {
        this.mutableState.clearThreads$stream_chat_android_client_release();
    }

    public final void clearUnseenThreadIds$stream_chat_android_client_release() {
        this.mutableState.clearUnseenThreadIds$stream_chat_android_client_release();
    }

    public final void deleteMessage$stream_chat_android_client_release(Message message) {
        AbstractC22676k.m65750j(message, "message");
        Map<String, Thread> threadMap = this.mutableState.getThreadMap();
        if (message.getParentId() == null && threadMap.containsKey(message.getId())) {
            this.mutableState.deleteThread$stream_chat_android_client_release(message.getId());
        } else if (message.getParentId() != null) {
            this.mutableState.deleteMessageFromThread$stream_chat_android_client_release(message.getParentId(), message.getId());
        }
    }

    public final Message getMessage$stream_chat_android_client_release(String messageId) {
        Object next;
        Message parentMessage;
        AbstractC22676k.m65750j(messageId, "messageId");
        Map<String, Thread> threadMap = this.mutableState.getThreadMap();
        Thread thread = threadMap.get(messageId);
        if (thread != null && (parentMessage = thread.getParentMessage()) != null) {
            return parentMessage;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, Thread>> it = threadMap.entrySet().iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList, it.next().getValue().getLatestReplies());
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            next = it3.next();
            if (AbstractC22676k.m65745e(((Message) next).getId(), messageId)) {
                return (Message) next;
            }
        }
        next = null;
        return (Message) next;
    }

    public final List<Thread> getThreads$stream_chat_android_client_release() {
        return (List) this.mutableState.getThreads().getValue();
    }

    public final Set<String> getUnseenThreadIds$stream_chat_android_client_release() {
        return (Set) this.mutableState.getUnseenThreadIds().getValue();
    }

    public final void insertThreadsIfAbsent$stream_chat_android_client_release(List<Thread> threads) {
        AbstractC22676k.m65750j(threads, "threads");
        upsertDraftMessages(threads);
        this.mutableState.insertThreadsIfAbsent$stream_chat_android_client_release(threads);
    }

    public final boolean isLoading$stream_chat_android_client_release() {
        return ((Boolean) this.mutableState.getLoading().getValue()).booleanValue();
    }

    public final boolean isLoadingMore$stream_chat_android_client_release() {
        return ((Boolean) this.mutableState.getLoadingMore().getValue()).booleanValue();
    }

    public final void markThreadAsReadByUser$stream_chat_android_client_release(ThreadInfo threadInfo, User user, Date createdAt) {
        AbstractC22676k.m65750j(threadInfo, "threadInfo");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        Thread thread = this.mutableState.getThreadMap().get(threadInfo.getParentMessageId());
        if (thread == null) {
            return;
        }
        this.mutableState.upsertThreads$stream_chat_android_client_release(AbstractC37056f.m118958J(ThreadKt.markAsReadByUser(thread, threadInfo, user, createdAt)));
    }

    public final void markThreadAsUnreadByUser$stream_chat_android_client_release(String threadId, User user, Date createdAt) {
        AbstractC22676k.m65750j(threadId, "threadId");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        Thread thread = this.mutableState.getThreadMap().get(threadId);
        if (thread == null) {
            return;
        }
        this.mutableState.upsertThreads$stream_chat_android_client_release(AbstractC37056f.m118958J(ThreadKt.markAsUnreadByUser(thread, user, createdAt)));
    }

    public final void setLoading$stream_chat_android_client_release(boolean loading) {
        this.mutableState.setLoading$stream_chat_android_client_release(loading);
    }

    public final void setLoadingError$stream_chat_android_client_release(boolean error) {
        this.mutableState.setLoadingError$stream_chat_android_client_release(error);
    }

    public final void setLoadingMore$stream_chat_android_client_release(boolean loading) {
        this.mutableState.setLoadingMore$stream_chat_android_client_release(loading);
    }

    public final void setNext$stream_chat_android_client_release(String next) {
        this.mutableState.setNext$stream_chat_android_client_release(next);
    }

    public final void setThreads$stream_chat_android_client_release(List<Thread> threads) {
        AbstractC22676k.m65750j(threads, "threads");
        upsertDraftMessages(threads);
        this.mutableState.setThreads$stream_chat_android_client_release(threads);
    }

    public final boolean updateParent$stream_chat_android_client_release(Message parent) {
        AbstractC22676k.m65750j(parent, "parent");
        Thread thread = this.mutableState.getThreadMap().get(parent.getId());
        if (thread == null) {
            return false;
        }
        this.mutableState.upsertThreads$stream_chat_android_client_release(AbstractC37056f.m118958J(ThreadKt.updateParent(thread, parent)));
        return true;
    }

    public final void updateThreadFromEvent$stream_chat_android_client_release(ThreadInfo threadInfo) {
        AbstractC22676k.m65750j(threadInfo, "threadInfo");
        Thread thread = this.mutableState.getThreadMap().get(threadInfo.getParentMessageId());
        if (thread == null) {
            return;
        }
        this.mutableState.upsertThreads$stream_chat_android_client_release(AbstractC37056f.m118958J(ThreadKt.applyThreadUpdatedEventChanges(thread, threadInfo)));
    }

    public final void upsertReply$stream_chat_android_client_release(Message reply) {
        Thread thread;
        AbstractC22676k.m65750j(reply, "reply");
        String parentId = reply.getParentId();
        if (parentId == null || (thread = this.mutableState.getThreadMap().get(parentId)) == null) {
            return;
        }
        this.mutableState.upsertThreads$stream_chat_android_client_release(AbstractC37056f.m118958J(ThreadKt.upsertReply(thread, reply)));
    }

    public final void upsertThreads$stream_chat_android_client_release(List<Thread> threads) {
        AbstractC22676k.m65750j(threads, "threads");
        upsertDraftMessages(threads);
        this.mutableState.upsertThreads$stream_chat_android_client_release(threads);
    }
}
