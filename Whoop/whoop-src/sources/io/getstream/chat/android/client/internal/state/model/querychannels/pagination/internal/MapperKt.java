package io.getstream.chat.android.client.internal.state.model.querychannels.pagination.internal;

import io.getstream.chat.android.client.api.models.Pagination;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.client.query.pagination.AnyChannelPaginationRequest;
import l83.C23465k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0000¨\u0006\u0004"}, m65681d2 = {"toAnyChannelPaginationRequest", "Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;", "Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;", "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MapperKt {
    public static final AnyChannelPaginationRequest toAnyChannelPaginationRequest(QueryChannelsPaginationRequest queryChannelsPaginationRequest) {
        AbstractC22676k.m65750j(queryChannelsPaginationRequest, "<this>");
        AnyChannelPaginationRequest anyChannelPaginationRequest = new AnyChannelPaginationRequest(0, 1, null);
        anyChannelPaginationRequest.setChannelLimit(queryChannelsPaginationRequest.getChannelLimit());
        anyChannelPaginationRequest.setChannelOffset(queryChannelsPaginationRequest.getChannelOffset());
        anyChannelPaginationRequest.setMessageLimit(queryChannelsPaginationRequest.getMessageLimit());
        anyChannelPaginationRequest.setSort(queryChannelsPaginationRequest.getSort());
        return anyChannelPaginationRequest;
    }

    public static final AnyChannelPaginationRequest toAnyChannelPaginationRequest(QueryChannelRequest queryChannelRequest) {
        String str;
        AbstractC22676k.m65750j(queryChannelRequest, "<this>");
        C23465k c23465kPagination = queryChannelRequest.pagination();
        AnyChannelPaginationRequest anyChannelPaginationRequest = new AnyChannelPaginationRequest(0, 1, null);
        anyChannelPaginationRequest.setMessageLimit(queryChannelRequest.messagesLimit());
        anyChannelPaginationRequest.setMessageFilterDirection(c23465kPagination != null ? (Pagination) c23465kPagination.f92937w : null);
        if (c23465kPagination == null || (str = (String) c23465kPagination.f92938x) == null) {
            str = "";
        }
        anyChannelPaginationRequest.setMessageFilterValue(str);
        anyChannelPaginationRequest.setMemberLimit(queryChannelRequest.membersLimit());
        anyChannelPaginationRequest.setMemberOffset(queryChannelRequest.membersOffset());
        anyChannelPaginationRequest.setWatcherLimit(queryChannelRequest.watchersLimit());
        anyChannelPaginationRequest.setWatcherOffset(queryChannelRequest.watchersOffset());
        anyChannelPaginationRequest.setChannelLimit(1);
        return anyChannelPaginationRequest;
    }
}
