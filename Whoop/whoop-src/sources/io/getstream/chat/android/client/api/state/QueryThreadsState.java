package io.getstream.chat.android.client.api.state;

import ec3.InterfaceC13037f2;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Thread;
import io.getstream.chat.android.models.querysort.QuerySorter;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000eR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000eR \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00180\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000eR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/api/state/QueryThreadsState;", "", "Lio/getstream/chat/android/models/FilterObject;", "getFilter", "()Lio/getstream/chat/android/models/FilterObject;", "filter", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/Thread;", "getSort", "()Lio/getstream/chat/android/models/querysort/QuerySorter;", "sort", "Lec3/f2;", "", "getThreads", "()Lec3/f2;", "threads", "", "getLoading", "loading", "getLoadingMore", "loadingMore", "", "getNext", "next", "", "getUnseenThreadIds", "unseenThreadIds", "getLoadingError", "loadingError", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface QueryThreadsState {
    FilterObject getFilter();

    InterfaceC13037f2 getLoading();

    InterfaceC13037f2 getLoadingError();

    InterfaceC13037f2 getLoadingMore();

    InterfaceC13037f2 getNext();

    QuerySorter<Thread> getSort();

    InterfaceC13037f2 getThreads();

    InterfaceC13037f2 getUnseenThreadIds();
}
