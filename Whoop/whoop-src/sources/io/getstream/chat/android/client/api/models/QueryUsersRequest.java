package io.getstream.chat.android.client.api.models;

import com.mapbox.maps.MapboxMap;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.models.querysort.QuerySortByField;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.util.List;
import java.util.Map;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003JA\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010)\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0005HÖ\u0001J\t\u0010,\u001a\u00020 HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR#\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00010\u001f0\u001e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006-"}, m65681d2 = {"Lio/getstream/chat/android/client/api/models/QueryUsersRequest;", "", "filter", "Lio/getstream/chat/android/models/FilterObject;", MapboxMap.QFE_OFFSET, "", MapboxMap.QFE_LIMIT, "querySort", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/User;", "presence", "", "<init>", "(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Z)V", "getFilter", "()Lio/getstream/chat/android/models/FilterObject;", "setFilter", "(Lio/getstream/chat/android/models/FilterObject;)V", "getOffset", "()I", "getLimit", "getQuerySort", "()Lio/getstream/chat/android/models/querysort/QuerySorter;", "setQuerySort", "(Lio/getstream/chat/android/models/querysort/QuerySorter;)V", "getPresence", "()Z", "setPresence", "(Z)V", "sort", "", "", "", "getSort", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class QueryUsersRequest {
    private FilterObject filter;
    private final int limit;
    private final int offset;
    private boolean presence;
    private QuerySorter<User> querySort;
    private final List<Map<String, Object>> sort;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QueryUsersRequest(FilterObject filter, int i13, int i14) {
        this(filter, i13, i14, null, false, 24, null);
        AbstractC22676k.m65750j(filter, "filter");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryUsersRequest copy$default(QueryUsersRequest queryUsersRequest, FilterObject filterObject, int i13, int i14, QuerySorter querySorter, boolean z4, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            filterObject = queryUsersRequest.filter;
        }
        if ((i15 & 2) != 0) {
            i13 = queryUsersRequest.offset;
        }
        if ((i15 & 4) != 0) {
            i14 = queryUsersRequest.limit;
        }
        if ((i15 & 8) != 0) {
            querySorter = queryUsersRequest.querySort;
        }
        if ((i15 & 16) != 0) {
            z4 = queryUsersRequest.presence;
        }
        boolean z13 = z4;
        int i16 = i14;
        return queryUsersRequest.copy(filterObject, i13, i16, querySorter, z13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FilterObject getFilter() {
        return this.filter;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    public final QuerySorter<User> component4() {
        return this.querySort;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getPresence() {
        return this.presence;
    }

    public final QueryUsersRequest copy(FilterObject filter, int offset, int limit, QuerySorter<User> querySort, boolean presence) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(querySort, "querySort");
        return new QueryUsersRequest(filter, offset, limit, querySort, presence);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryUsersRequest)) {
            return false;
        }
        QueryUsersRequest queryUsersRequest = (QueryUsersRequest) other;
        return AbstractC22676k.m65745e(this.filter, queryUsersRequest.filter) && this.offset == queryUsersRequest.offset && this.limit == queryUsersRequest.limit && AbstractC22676k.m65745e(this.querySort, queryUsersRequest.querySort) && this.presence == queryUsersRequest.presence;
    }

    public final FilterObject getFilter() {
        return this.filter;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final boolean getPresence() {
        return this.presence;
    }

    public final QuerySorter<User> getQuerySort() {
        return this.querySort;
    }

    public final List<Map<String, Object>> getSort() {
        return this.sort;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.presence) + ((this.querySort.hashCode() + AbstractC11266d.m30448b(this.limit, AbstractC11266d.m30448b(this.offset, this.filter.hashCode() * 31, 31), 31)) * 31);
    }

    public final void setFilter(FilterObject filterObject) {
        AbstractC22676k.m65750j(filterObject, "<set-?>");
        this.filter = filterObject;
    }

    public final void setPresence(boolean z4) {
        this.presence = z4;
    }

    public final void setQuerySort(QuerySorter<User> querySorter) {
        AbstractC22676k.m65750j(querySorter, "<set-?>");
        this.querySort = querySorter;
    }

    public final String toString() {
        FilterObject filterObject = this.filter;
        int i13 = this.offset;
        int i14 = this.limit;
        QuerySorter<User> querySorter = this.querySort;
        boolean z4 = this.presence;
        StringBuilder sb4 = new StringBuilder("QueryUsersRequest(filter=");
        sb4.append(filterObject);
        sb4.append(", offset=");
        sb4.append(i13);
        sb4.append(", limit=");
        sb4.append(i14);
        sb4.append(", querySort=");
        sb4.append(querySorter);
        sb4.append(", presence=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QueryUsersRequest(FilterObject filter, int i13, int i14, QuerySorter<User> querySort) {
        this(filter, i13, i14, querySort, false, 16, null);
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(querySort, "querySort");
    }

    public QueryUsersRequest(FilterObject filter, int i13, int i14, QuerySorter<User> querySort, boolean z4) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(querySort, "querySort");
        this.filter = filter;
        this.offset = i13;
        this.limit = i14;
        this.querySort = querySort;
        this.presence = z4;
        this.sort = querySort.toDto();
    }

    public /* synthetic */ QueryUsersRequest(FilterObject filterObject, int i13, int i14, QuerySorter querySorter, boolean z4, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(filterObject, i13, i14, (i15 & 8) != 0 ? new QuerySortByField() : querySorter, (i15 & 16) != 0 ? false : z4);
    }
}
