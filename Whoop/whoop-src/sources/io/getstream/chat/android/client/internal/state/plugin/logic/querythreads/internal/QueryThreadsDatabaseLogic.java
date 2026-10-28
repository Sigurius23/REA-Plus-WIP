package io.getstream.chat.android.client.internal.state.plugin.logic.querythreads.internal;

import io.getstream.chat.android.client.persistance.repository.ThreadsRepository;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Thread;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ.\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0080@¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0016\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0080@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0080@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsDatabaseLogic;", "", "Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;", "repository", "<init>", "(Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;)V", "Lio/getstream/chat/android/models/FilterObject;", "filter", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/Thread;", "sort", "", "queryId", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)Ljava/lang/String;", "", "getLocalThreadsOrder$stream_chat_android_client_release", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Lq83/d;)Ljava/lang/Object;", "getLocalThreadsOrder", "order", "Ll83/a0;", "setLocalThreadsOrder$stream_chat_android_client_release", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "setLocalThreadsOrder", "ids", "getLocalThreads$stream_chat_android_client_release", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "getLocalThreads", "Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class QueryThreadsDatabaseLogic {
    private final ThreadsRepository repository;

    public QueryThreadsDatabaseLogic(ThreadsRepository repository) {
        AbstractC22676k.m65750j(repository, "repository");
        this.repository = repository;
    }

    private final String queryId(FilterObject filter, QuerySorter<Thread> sort) {
        return (filter != null ? filter.hashCode() : 0) + "-" + sort.toDto().hashCode();
    }

    public final Object getLocalThreads$stream_chat_android_client_release(List<String> list, InterfaceC30057d<? super List<Thread>> interfaceC30057d) {
        return this.repository.selectThreads(list, interfaceC30057d);
    }

    public final Object getLocalThreadsOrder$stream_chat_android_client_release(FilterObject filterObject, QuerySorter<Thread> querySorter, InterfaceC30057d<? super List<String>> interfaceC30057d) {
        return this.repository.selectThreadOrder(queryId(filterObject, querySorter), interfaceC30057d);
    }

    public final Object setLocalThreadsOrder$stream_chat_android_client_release(FilterObject filterObject, QuerySorter<Thread> querySorter, List<String> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objInsertThreadOrder = this.repository.insertThreadOrder(queryId(filterObject, querySorter), list, interfaceC30057d);
        return objInsertThreadOrder == EnumC31071a.f128113w ? objInsertThreadOrder : C23454a0.f92919a;
    }
}
