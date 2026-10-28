package io.getstream.chat.android.client.api.models;

import androidx.core.app.FrameMetricsAggregator;
import com.mapbox.maps.MapboxMap;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Thread;
import io.getstream.chat.android.models.querysort.QuerySortByField;
import io.getstream.chat.android.models.querysort.QuerySorter;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b#\b\u0086\b\u0018\u0000 /2\u00020\u0001:\u0001/Bo\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003Jo\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\nHÆ\u0001J\u0013\u0010+\u001a\u00020\b2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\nHÖ\u0001J\t\u0010.\u001a\u00020\rHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001a¨\u00060"}, m65681d2 = {"Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;", "", "filter", "Lio/getstream/chat/android/models/FilterObject;", "sort", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/Thread;", "watch", "", MapboxMap.QFE_LIMIT, "", "memberLimit", "next", "", "participantLimit", "prev", "replyLimit", "<init>", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ZIILjava/lang/String;ILjava/lang/String;I)V", "getFilter", "()Lio/getstream/chat/android/models/FilterObject;", "getSort", "()Lio/getstream/chat/android/models/querysort/QuerySorter;", "getWatch", "()Z", "getLimit", "()I", "getMemberLimit", "getNext", "()Ljava/lang/String;", "getParticipantLimit", "getPrev", "getReplyLimit", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class QueryThreadsRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final QuerySorter<Thread> DefaultSort;
    private final FilterObject filter;
    private final int limit;
    private final int memberLimit;
    private final String next;
    private final int participantLimit;
    private final String prev;
    private final int replyLimit;
    private final QuerySorter<Thread> sort;
    private final boolean watch;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/client/api/models/QueryThreadsRequest$Companion;", "", "<init>", "()V", "DefaultSort", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/Thread;", "getDefaultSort$annotations", "getDefaultSort", "()Lio/getstream/chat/android/models/querysort/QuerySorter;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @InternalStreamChatApi
        public static /* synthetic */ void getDefaultSort$annotations() {
        }

        public final QuerySorter<Thread> getDefaultSort() {
            return QueryThreadsRequest.DefaultSort;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        QuerySortByField.Companion companion = QuerySortByField.INSTANCE;
        DefaultSort = companion.descByName(companion.descByName(companion.descByName("has_unread"), "last_message_at"), "parent_message_id");
    }

    public QueryThreadsRequest() {
        this(null, null, false, 0, 0, null, 0, null, 0, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryThreadsRequest copy$default(QueryThreadsRequest queryThreadsRequest, FilterObject filterObject, QuerySorter querySorter, boolean z4, int i13, int i14, String str, int i15, String str2, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            filterObject = queryThreadsRequest.filter;
        }
        if ((i17 & 2) != 0) {
            querySorter = queryThreadsRequest.sort;
        }
        if ((i17 & 4) != 0) {
            z4 = queryThreadsRequest.watch;
        }
        if ((i17 & 8) != 0) {
            i13 = queryThreadsRequest.limit;
        }
        if ((i17 & 16) != 0) {
            i14 = queryThreadsRequest.memberLimit;
        }
        if ((i17 & 32) != 0) {
            str = queryThreadsRequest.next;
        }
        if ((i17 & 64) != 0) {
            i15 = queryThreadsRequest.participantLimit;
        }
        if ((i17 & 128) != 0) {
            str2 = queryThreadsRequest.prev;
        }
        if ((i17 & 256) != 0) {
            i16 = queryThreadsRequest.replyLimit;
        }
        String str3 = str2;
        int i18 = i16;
        String str4 = str;
        int i19 = i15;
        int i24 = i14;
        boolean z13 = z4;
        return queryThreadsRequest.copy(filterObject, querySorter, z13, i13, i24, str4, i19, str3, i18);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FilterObject getFilter() {
        return this.filter;
    }

    public final QuerySorter<Thread> component2() {
        return this.sort;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getWatch() {
        return this.watch;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMemberLimit() {
        return this.memberLimit;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getParticipantLimit() {
        return this.participantLimit;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPrev() {
        return this.prev;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getReplyLimit() {
        return this.replyLimit;
    }

    public final QueryThreadsRequest copy(FilterObject filter, QuerySorter<Thread> sort, boolean watch, int limit, int memberLimit, String next, int participantLimit, String prev, int replyLimit) {
        AbstractC22676k.m65750j(sort, "sort");
        return new QueryThreadsRequest(filter, sort, watch, limit, memberLimit, next, participantLimit, prev, replyLimit);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryThreadsRequest)) {
            return false;
        }
        QueryThreadsRequest queryThreadsRequest = (QueryThreadsRequest) other;
        return AbstractC22676k.m65745e(this.filter, queryThreadsRequest.filter) && AbstractC22676k.m65745e(this.sort, queryThreadsRequest.sort) && this.watch == queryThreadsRequest.watch && this.limit == queryThreadsRequest.limit && this.memberLimit == queryThreadsRequest.memberLimit && AbstractC22676k.m65745e(this.next, queryThreadsRequest.next) && this.participantLimit == queryThreadsRequest.participantLimit && AbstractC22676k.m65745e(this.prev, queryThreadsRequest.prev) && this.replyLimit == queryThreadsRequest.replyLimit;
    }

    public final FilterObject getFilter() {
        return this.filter;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final int getMemberLimit() {
        return this.memberLimit;
    }

    public final String getNext() {
        return this.next;
    }

    public final int getParticipantLimit() {
        return this.participantLimit;
    }

    public final String getPrev() {
        return this.prev;
    }

    public final int getReplyLimit() {
        return this.replyLimit;
    }

    public final QuerySorter<Thread> getSort() {
        return this.sort;
    }

    public final boolean getWatch() {
        return this.watch;
    }

    public final int hashCode() {
        FilterObject filterObject = this.filter;
        int iM30448b = AbstractC11266d.m30448b(this.memberLimit, AbstractC11266d.m30448b(this.limit, AbstractC2875y.m8289b((this.sort.hashCode() + ((filterObject == null ? 0 : filterObject.hashCode()) * 31)) * 31, 31, this.watch), 31), 31);
        String str = this.next;
        int iM30448b2 = AbstractC11266d.m30448b(this.participantLimit, (iM30448b + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.prev;
        return Integer.hashCode(this.replyLimit) + ((iM30448b2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        FilterObject filterObject = this.filter;
        QuerySorter<Thread> querySorter = this.sort;
        boolean z4 = this.watch;
        int i13 = this.limit;
        int i14 = this.memberLimit;
        String str = this.next;
        int i15 = this.participantLimit;
        String str2 = this.prev;
        int i16 = this.replyLimit;
        StringBuilder sb4 = new StringBuilder("QueryThreadsRequest(filter=");
        sb4.append(filterObject);
        sb4.append(", sort=");
        sb4.append(querySorter);
        sb4.append(", watch=");
        AbstractC30802r.m94769r(i13, ", limit=", ", memberLimit=", sb4, z4);
        AbstractC11895b.m31979B(i14, ", next=", str, ", participantLimit=", sb4);
        AbstractC11895b.m31979B(i15, ", prev=", str2, ", replyLimit=", sb4);
        return AbstractC18489d0.m53371l(sb4, i16, ")");
    }

    public QueryThreadsRequest(FilterObject filterObject) {
        this(filterObject, null, false, 0, 0, null, 0, null, 0, 510, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QueryThreadsRequest(FilterObject filterObject, QuerySorter<Thread> sort) {
        this(filterObject, sort, false, 0, 0, null, 0, null, 0, 508, null);
        AbstractC22676k.m65750j(sort, "sort");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QueryThreadsRequest(FilterObject filterObject, QuerySorter<Thread> sort, boolean z4) {
        this(filterObject, sort, z4, 0, 0, null, 0, null, 0, 504, null);
        AbstractC22676k.m65750j(sort, "sort");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QueryThreadsRequest(FilterObject filterObject, QuerySorter<Thread> sort, boolean z4, int i13) {
        this(filterObject, sort, z4, i13, 0, null, 0, null, 0, 496, null);
        AbstractC22676k.m65750j(sort, "sort");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QueryThreadsRequest(FilterObject filterObject, QuerySorter<Thread> sort, boolean z4, int i13, int i14) {
        this(filterObject, sort, z4, i13, i14, null, 0, null, 0, 480, null);
        AbstractC22676k.m65750j(sort, "sort");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QueryThreadsRequest(FilterObject filterObject, QuerySorter<Thread> sort, boolean z4, int i13, int i14, String str) {
        this(filterObject, sort, z4, i13, i14, str, 0, null, 0, 448, null);
        AbstractC22676k.m65750j(sort, "sort");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QueryThreadsRequest(FilterObject filterObject, QuerySorter<Thread> sort, boolean z4, int i13, int i14, String str, int i15) {
        this(filterObject, sort, z4, i13, i14, str, i15, null, 0, 384, null);
        AbstractC22676k.m65750j(sort, "sort");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QueryThreadsRequest(FilterObject filterObject, QuerySorter<Thread> sort, boolean z4, int i13, int i14, String str, int i15, String str2) {
        this(filterObject, sort, z4, i13, i14, str, i15, str2, 0, 256, null);
        AbstractC22676k.m65750j(sort, "sort");
    }

    public QueryThreadsRequest(FilterObject filterObject, QuerySorter<Thread> sort, boolean z4, int i13, int i14, String str, int i15, String str2, int i16) {
        AbstractC22676k.m65750j(sort, "sort");
        this.filter = filterObject;
        this.sort = sort;
        this.watch = z4;
        this.limit = i13;
        this.memberLimit = i14;
        this.next = str;
        this.participantLimit = i15;
        this.prev = str2;
        this.replyLimit = i16;
    }

    public /* synthetic */ QueryThreadsRequest(FilterObject filterObject, QuerySorter querySorter, boolean z4, int i13, int i14, String str, int i15, String str2, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this((i17 & 1) != 0 ? null : filterObject, (i17 & 2) != 0 ? DefaultSort : querySorter, (i17 & 4) != 0 ? true : z4, (i17 & 8) != 0 ? 10 : i13, (i17 & 16) != 0 ? 100 : i14, (i17 & 32) != 0 ? null : str, (i17 & 64) != 0 ? 100 : i15, (i17 & 128) != 0 ? null : str2, (i17 & 256) != 0 ? 2 : i16);
    }
}
