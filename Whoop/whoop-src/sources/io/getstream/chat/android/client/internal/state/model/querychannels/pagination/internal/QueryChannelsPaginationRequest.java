package io.getstream.chat.android.client.internal.state.model.querychannels.pagination.internal;

import ih0.AbstractC18489d0;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.querysort.QuerySorter;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015¨\u0006!"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelsPaginationRequest;", "", "sort", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/Channel;", "channelOffset", "", "channelLimit", "messageLimit", "memberLimit", "<init>", "(Lio/getstream/chat/android/models/querysort/QuerySorter;IIII)V", "getSort", "()Lio/getstream/chat/android/models/querysort/QuerySorter;", "getChannelOffset", "()I", "getChannelLimit", "getMessageLimit", "getMemberLimit", "isFirstPage", "", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class QueryChannelsPaginationRequest {
    private final int channelLimit;
    private final int channelOffset;
    private final int memberLimit;
    private final int messageLimit;
    private final QuerySorter<Channel> sort;

    public QueryChannelsPaginationRequest(QuerySorter<Channel> sort, int i13, int i14, int i15, int i16) {
        AbstractC22676k.m65750j(sort, "sort");
        this.sort = sort;
        this.channelOffset = i13;
        this.channelLimit = i14;
        this.messageLimit = i15;
        this.memberLimit = i16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryChannelsPaginationRequest copy$default(QueryChannelsPaginationRequest queryChannelsPaginationRequest, QuerySorter querySorter, int i13, int i14, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            querySorter = queryChannelsPaginationRequest.sort;
        }
        if ((i17 & 2) != 0) {
            i13 = queryChannelsPaginationRequest.channelOffset;
        }
        if ((i17 & 4) != 0) {
            i14 = queryChannelsPaginationRequest.channelLimit;
        }
        if ((i17 & 8) != 0) {
            i15 = queryChannelsPaginationRequest.messageLimit;
        }
        if ((i17 & 16) != 0) {
            i16 = queryChannelsPaginationRequest.memberLimit;
        }
        int i18 = i16;
        int i19 = i14;
        return queryChannelsPaginationRequest.copy(querySorter, i13, i19, i15, i18);
    }

    public final QuerySorter<Channel> component1() {
        return this.sort;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getChannelOffset() {
        return this.channelOffset;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getChannelLimit() {
        return this.channelLimit;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMessageLimit() {
        return this.messageLimit;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMemberLimit() {
        return this.memberLimit;
    }

    public final QueryChannelsPaginationRequest copy(QuerySorter<Channel> sort, int channelOffset, int channelLimit, int messageLimit, int memberLimit) {
        AbstractC22676k.m65750j(sort, "sort");
        return new QueryChannelsPaginationRequest(sort, channelOffset, channelLimit, messageLimit, memberLimit);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryChannelsPaginationRequest)) {
            return false;
        }
        QueryChannelsPaginationRequest queryChannelsPaginationRequest = (QueryChannelsPaginationRequest) other;
        return AbstractC22676k.m65745e(this.sort, queryChannelsPaginationRequest.sort) && this.channelOffset == queryChannelsPaginationRequest.channelOffset && this.channelLimit == queryChannelsPaginationRequest.channelLimit && this.messageLimit == queryChannelsPaginationRequest.messageLimit && this.memberLimit == queryChannelsPaginationRequest.memberLimit;
    }

    public final int getChannelLimit() {
        return this.channelLimit;
    }

    public final int getChannelOffset() {
        return this.channelOffset;
    }

    public final int getMemberLimit() {
        return this.memberLimit;
    }

    public final int getMessageLimit() {
        return this.messageLimit;
    }

    public final QuerySorter<Channel> getSort() {
        return this.sort;
    }

    public final int hashCode() {
        return Integer.hashCode(this.memberLimit) + AbstractC11266d.m30448b(this.messageLimit, AbstractC11266d.m30448b(this.channelLimit, AbstractC11266d.m30448b(this.channelOffset, this.sort.hashCode() * 31, 31), 31), 31);
    }

    public final boolean isFirstPage() {
        return this.channelOffset == 0;
    }

    public final String toString() {
        QuerySorter<Channel> querySorter = this.sort;
        int i13 = this.channelOffset;
        int i14 = this.channelLimit;
        int i15 = this.messageLimit;
        int i16 = this.memberLimit;
        StringBuilder sb4 = new StringBuilder("QueryChannelsPaginationRequest(sort=");
        sb4.append(querySorter);
        sb4.append(", channelOffset=");
        sb4.append(i13);
        sb4.append(", channelLimit=");
        AbstractC30802r.m94773v(sb4, i14, ", messageLimit=", i15, ", memberLimit=");
        return AbstractC18489d0.m53371l(sb4, i16, ")");
    }

    public /* synthetic */ QueryChannelsPaginationRequest(QuerySorter querySorter, int i13, int i14, int i15, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(querySorter, (i17 & 2) != 0 ? 0 : i13, (i17 & 4) != 0 ? 30 : i14, (i17 & 8) != 0 ? 10 : i15, i16);
    }
}
