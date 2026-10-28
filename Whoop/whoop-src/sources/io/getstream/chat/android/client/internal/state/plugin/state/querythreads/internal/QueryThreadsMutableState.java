package io.getstream.chat.android.client.internal.state.plugin.state.querythreads.internal;

import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import io.getstream.chat.android.client.api.state.QueryThreadsState;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Thread;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u001d\u0010\u0015\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0000¢\u0006\u0004\b\u0016\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0000¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\"\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001f\u001a\u00020\u001aH\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010%\u001a\u00020\u000bH\u0000¢\u0006\u0004\b#\u0010$J\u0019\u0010(\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010\u001aH\u0000¢\u0006\u0004\b'\u0010\u001dJ\u0017\u0010+\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u001aH\u0000¢\u0006\u0004\b*\u0010\u001dJ\u000f\u0010-\u001a\u00020\u000bH\u0000¢\u0006\u0004\b,\u0010$J\u0017\u00100\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\tH\u0000¢\u0006\u0004\b/\u0010\rJ\u000f\u00102\u001a\u00020\u000bH\u0000¢\u0006\u0004\b1\u0010$R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u00105R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b7\u00108R0\u0010;\u001a\u001e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000509j\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0005`:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R$\u0010>\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0011\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001e\u0010@\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010?R\u001e\u0010A\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010?R \u0010B\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010?R$\u0010D\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0C\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010?R\u001e\u0010E\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010?R&\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00110F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010G\u001a\u0004\bH\u0010IR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010G\u001a\u0004\bJ\u0010IR \u0010K\u001a\b\u0012\u0004\u0012\u00020\t0F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010G\u001a\u0004\bL\u0010IR\"\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010G\u001a\u0004\bM\u0010IR&\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0C0F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010G\u001a\u0004\bO\u0010IR \u0010P\u001a\b\u0012\u0004\u0012\u00020\t0F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010G\u001a\u0004\bQ\u0010IR\u001d\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00050R8F¢\u0006\u0006\u001a\u0004\bS\u0010T¨\u0006V"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;", "Lio/getstream/chat/android/client/api/state/QueryThreadsState;", "Lio/getstream/chat/android/models/FilterObject;", "filter", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/Thread;", "sort", "<init>", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)V", "", "loading", "Ll83/a0;", "setLoading$stream_chat_android_client_release", "(Z)V", "setLoading", "setLoadingMore$stream_chat_android_client_release", "setLoadingMore", "", "threads", "setThreads$stream_chat_android_client_release", "(Ljava/util/List;)V", "setThreads", "insertThreadsIfAbsent$stream_chat_android_client_release", "insertThreadsIfAbsent", "upsertThreads$stream_chat_android_client_release", "upsertThreads", "", "threadId", "deleteThread$stream_chat_android_client_release", "(Ljava/lang/String;)V", "deleteThread", "messageId", "deleteMessageFromThread$stream_chat_android_client_release", "(Ljava/lang/String;Ljava/lang/String;)V", "deleteMessageFromThread", "clearThreads$stream_chat_android_client_release", "()V", "clearThreads", "next", "setNext$stream_chat_android_client_release", "setNext", "id", "addUnseenThreadId$stream_chat_android_client_release", "addUnseenThreadId", "clearUnseenThreadIds$stream_chat_android_client_release", "clearUnseenThreadIds", "error", "setLoadingError$stream_chat_android_client_release", "setLoadingError", "destroy$stream_chat_android_client_release", "destroy", "Lio/getstream/chat/android/models/FilterObject;", "getFilter", "()Lio/getstream/chat/android/models/FilterObject;", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "getSort", "()Lio/getstream/chat/android/models/querysort/QuerySorter;", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "_threadMap", "Ljava/util/LinkedHashMap;", "Lec3/p1;", "_threads", "Lec3/p1;", "_loading", "_loadingMore", "_next", "", "_unseenThreadIds", "_loadingError", "Lec3/f2;", "Lec3/f2;", "getThreads", "()Lec3/f2;", "getLoading", "loadingMore", "getLoadingMore", "getNext", "unseenThreadIds", "getUnseenThreadIds", "loadingError", "getLoadingError", "", "getThreadMap", "()Ljava/util/Map;", "threadMap", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QueryThreadsMutableState implements QueryThreadsState {
    private InterfaceC13075p1 _loading;
    private InterfaceC13075p1 _loadingError;
    private InterfaceC13075p1 _loadingMore;
    private InterfaceC13075p1 _next;
    private final LinkedHashMap<String, Thread> _threadMap;
    private InterfaceC13075p1 _threads;
    private InterfaceC13075p1 _unseenThreadIds;
    private final FilterObject filter;
    private final InterfaceC13037f2 loading;
    private final InterfaceC13037f2 loadingError;
    private final InterfaceC13037f2 loadingMore;
    private final InterfaceC13037f2 next;
    private final QuerySorter<Thread> sort;
    private final InterfaceC13037f2 threads;
    private final InterfaceC13037f2 unseenThreadIds;

    public QueryThreadsMutableState(FilterObject filterObject, QuerySorter<Thread> sort) {
        AbstractC22676k.m65750j(sort, "sort");
        this.filter = filterObject;
        this.sort = sort;
        this._threadMap = new LinkedHashMap<>();
        this._threads = AbstractC13091v.m36593c(C25271y.f99162w);
        Boolean bool = Boolean.FALSE;
        this._loading = AbstractC13091v.m36593c(bool);
        this._loadingMore = AbstractC13091v.m36593c(bool);
        this._next = AbstractC13091v.m36593c(null);
        this._unseenThreadIds = AbstractC13091v.m36593c(C25235a0.f99113w);
        this._loadingError = AbstractC13091v.m36593c(bool);
        InterfaceC13075p1 interfaceC13075p1 = this._threads;
        AbstractC22676k.m65747g(interfaceC13075p1);
        this.threads = interfaceC13075p1;
        InterfaceC13075p1 interfaceC13075p2 = this._loading;
        AbstractC22676k.m65747g(interfaceC13075p2);
        this.loading = interfaceC13075p2;
        InterfaceC13075p1 interfaceC13075p3 = this._loadingMore;
        AbstractC22676k.m65747g(interfaceC13075p3);
        this.loadingMore = interfaceC13075p3;
        InterfaceC13075p1 interfaceC13075p4 = this._next;
        AbstractC22676k.m65747g(interfaceC13075p4);
        this.next = interfaceC13075p4;
        InterfaceC13075p1 interfaceC13075p5 = this._unseenThreadIds;
        AbstractC22676k.m65747g(interfaceC13075p5);
        this.unseenThreadIds = interfaceC13075p5;
        InterfaceC13075p1 interfaceC13075p6 = this._loadingError;
        AbstractC22676k.m65747g(interfaceC13075p6);
        this.loadingError = interfaceC13075p6;
    }

    public final void addUnseenThreadId$stream_chat_android_client_release(String id4) {
        C13045h2 c13045h2;
        Object value;
        Set setM74101H1;
        AbstractC22676k.m65750j(id4, "id");
        InterfaceC13075p1 interfaceC13075p1 = this._unseenThreadIds;
        if (interfaceC13075p1 != null) {
            do {
                c13045h2 = (C13045h2) interfaceC13075p1;
                value = c13045h2.getValue();
                setM74101H1 = AbstractC25265s.m74101H1((Set) value);
                setM74101H1.add(id4);
            } while (!c13045h2.m36569i(value, setM74101H1));
        }
    }

    public final void clearThreads$stream_chat_android_client_release() {
        this._threadMap.clear();
        InterfaceC13075p1 interfaceC13075p1 = this._threads;
        if (interfaceC13075p1 != null) {
            Collection<Thread> collectionValues = this._threadMap.values();
            AbstractC22676k.m65749i(collectionValues, "<get-values>(...)");
            ((C13045h2) interfaceC13075p1).m36571k(null, AbstractC25265s.m74093D1(collectionValues));
        }
    }

    public final void clearUnseenThreadIds$stream_chat_android_client_release() {
        InterfaceC13075p1 interfaceC13075p1 = this._unseenThreadIds;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36571k(null, C25235a0.f99113w);
        }
    }

    public final void deleteMessageFromThread$stream_chat_android_client_release(String threadId, String messageId) {
        Thread thread;
        AbstractC22676k.m65750j(messageId, "messageId");
        if (threadId == null || (thread = this._threadMap.get(threadId)) == null) {
            return;
        }
        Iterator<Message> it = thread.getLatestReplies().iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            } else if (AbstractC22676k.m65745e(it.next().getId(), messageId)) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 > -1) {
            ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(thread.getLatestReplies());
            arrayListM74097F1.remove(i13);
            this._threadMap.put(threadId, Thread.copy$default(thread, 0, null, null, null, null, null, null, 0, null, null, null, null, null, null, arrayListM74097F1, null, null, null, 245759, null));
            InterfaceC13075p1 interfaceC13075p1 = this._threads;
            if (interfaceC13075p1 != null) {
                Collection<Thread> collectionValues = this._threadMap.values();
                AbstractC22676k.m65749i(collectionValues, "<get-values>(...)");
                ((C13045h2) interfaceC13075p1).m36571k(null, AbstractC25265s.m74093D1(collectionValues));
            }
        }
    }

    public final void deleteThread$stream_chat_android_client_release(String threadId) {
        AbstractC22676k.m65750j(threadId, "threadId");
        this._threadMap.remove(threadId);
        InterfaceC13075p1 interfaceC13075p1 = this._threads;
        if (interfaceC13075p1 != null) {
            Collection<Thread> collectionValues = this._threadMap.values();
            AbstractC22676k.m65749i(collectionValues, "<get-values>(...)");
            ((C13045h2) interfaceC13075p1).m36571k(null, AbstractC25265s.m74093D1(collectionValues));
        }
    }

    public final void destroy$stream_chat_android_client_release() {
        this._threadMap.clear();
        this._threads = null;
        this._loading = null;
        this._loadingMore = null;
        this._next = null;
        this._unseenThreadIds = null;
        this._loadingError = null;
    }

    @Override // io.getstream.chat.android.client.api.state.QueryThreadsState
    public final FilterObject getFilter() {
        return this.filter;
    }

    @Override // io.getstream.chat.android.client.api.state.QueryThreadsState
    public final InterfaceC13037f2 getLoading() {
        return this.loading;
    }

    @Override // io.getstream.chat.android.client.api.state.QueryThreadsState
    public final InterfaceC13037f2 getLoadingError() {
        return this.loadingError;
    }

    @Override // io.getstream.chat.android.client.api.state.QueryThreadsState
    public final InterfaceC13037f2 getLoadingMore() {
        return this.loadingMore;
    }

    @Override // io.getstream.chat.android.client.api.state.QueryThreadsState
    public final InterfaceC13037f2 getNext() {
        return this.next;
    }

    @Override // io.getstream.chat.android.client.api.state.QueryThreadsState
    public final QuerySorter<Thread> getSort() {
        return this.sort;
    }

    public final Map<String, Thread> getThreadMap() {
        return this._threadMap;
    }

    @Override // io.getstream.chat.android.client.api.state.QueryThreadsState
    public final InterfaceC13037f2 getThreads() {
        return this.threads;
    }

    @Override // io.getstream.chat.android.client.api.state.QueryThreadsState
    public final InterfaceC13037f2 getUnseenThreadIds() {
        return this.unseenThreadIds;
    }

    public final void insertThreadsIfAbsent$stream_chat_android_client_release(List<Thread> threads) {
        AbstractC22676k.m65750j(threads, "threads");
        for (Thread thread : threads) {
            if (!this._threadMap.containsKey(thread.getParentMessageId())) {
                this._threadMap.put(thread.getParentMessageId(), thread);
            }
        }
        InterfaceC13075p1 interfaceC13075p1 = this._threads;
        if (interfaceC13075p1 != null) {
            Collection<Thread> collectionValues = this._threadMap.values();
            AbstractC22676k.m65749i(collectionValues, "<get-values>(...)");
            ((C13045h2) interfaceC13075p1).m36571k(null, AbstractC25265s.m74093D1(collectionValues));
        }
    }

    public final void setLoading$stream_chat_android_client_release(boolean loading) {
        InterfaceC13075p1 interfaceC13075p1 = this._loading;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36571k(null, Boolean.valueOf(loading));
        }
    }

    public final void setLoadingError$stream_chat_android_client_release(boolean error) {
        InterfaceC13075p1 interfaceC13075p1 = this._loadingError;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36571k(null, Boolean.valueOf(error));
        }
    }

    public final void setLoadingMore$stream_chat_android_client_release(boolean loading) {
        InterfaceC13075p1 interfaceC13075p1 = this._loadingMore;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36571k(null, Boolean.valueOf(loading));
        }
    }

    public final void setNext$stream_chat_android_client_release(String next) {
        InterfaceC13075p1 interfaceC13075p1 = this._next;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36570j(next);
        }
    }

    public final void setThreads$stream_chat_android_client_release(List<Thread> threads) {
        AbstractC22676k.m65750j(threads, "threads");
        this._threadMap.clear();
        upsertThreads$stream_chat_android_client_release(threads);
    }

    public final void upsertThreads$stream_chat_android_client_release(List<Thread> threads) {
        AbstractC22676k.m65750j(threads, "threads");
        List<Thread> list = threads;
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Object obj : list) {
            linkedHashMap.put(((Thread) obj).getParentMessageId(), obj);
        }
        this._threadMap.putAll(linkedHashMap);
        InterfaceC13075p1 interfaceC13075p1 = this._threads;
        if (interfaceC13075p1 != null) {
            Collection<Thread> collectionValues = this._threadMap.values();
            AbstractC22676k.m65749i(collectionValues, "<get-values>(...)");
            ((C13045h2) interfaceC13075p1).m36571k(null, AbstractC25265s.m74093D1(collectionValues));
        }
    }
}
