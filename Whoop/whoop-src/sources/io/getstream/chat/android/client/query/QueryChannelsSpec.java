package io.getstream.chat.android.client.query;

import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.util.Map;
import java.util.Set;
import m83.C25235a0;
import p000.AbstractC30802r;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u000e\u0010\u0010J \u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fHÆ\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fHÆ\u0003Jo\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001c¨\u0006+"}, m65681d2 = {"Lio/getstream/chat/android/client/query/QueryChannelsSpec;", "", "filter", "Lio/getstream/chat/android/models/FilterObject;", "querySort", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/Channel;", "cids", "", "", "predefinedFilterName", "predefinedFilterValues", "", "predefinedSortValues", "<init>", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/Set;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)V", "getFilter", "()Lio/getstream/chat/android/models/FilterObject;", "getQuerySort", "()Lio/getstream/chat/android/models/querysort/QuerySorter;", "getCids", "()Ljava/util/Set;", "setCids", "(Ljava/util/Set;)V", "getPredefinedFilterName", "()Ljava/lang/String;", "getPredefinedFilterValues", "()Ljava/util/Map;", "getPredefinedSortValues", "copy", "component1", "component2", "component3", "component4", "component5", "component6", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class QueryChannelsSpec {
    private Set<String> cids;
    private final FilterObject filter;
    private final String predefinedFilterName;
    private final Map<String, Object> predefinedFilterValues;
    private final Map<String, Object> predefinedSortValues;
    private final QuerySorter<Channel> querySort;

    public QueryChannelsSpec(FilterObject filter, QuerySorter<Channel> querySort, Set<String> cids, String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(querySort, "querySort");
        AbstractC22676k.m65750j(cids, "cids");
        this.filter = filter;
        this.querySort = querySort;
        this.cids = cids;
        this.predefinedFilterName = str;
        this.predefinedFilterValues = map;
        this.predefinedSortValues = map2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryChannelsSpec copy$default(QueryChannelsSpec queryChannelsSpec, FilterObject filterObject, QuerySorter querySorter, Set set, String str, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            filterObject = queryChannelsSpec.filter;
        }
        if ((i13 & 2) != 0) {
            querySorter = queryChannelsSpec.querySort;
        }
        if ((i13 & 4) != 0) {
            set = queryChannelsSpec.cids;
        }
        if ((i13 & 8) != 0) {
            str = queryChannelsSpec.predefinedFilterName;
        }
        if ((i13 & 16) != 0) {
            map = queryChannelsSpec.predefinedFilterValues;
        }
        if ((i13 & 32) != 0) {
            map2 = queryChannelsSpec.predefinedSortValues;
        }
        Map map3 = map;
        Map map4 = map2;
        return queryChannelsSpec.copy(filterObject, querySorter, set, str, map3, map4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FilterObject getFilter() {
        return this.filter;
    }

    public final QuerySorter<Channel> component2() {
        return this.querySort;
    }

    public final Set<String> component3() {
        return this.cids;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPredefinedFilterName() {
        return this.predefinedFilterName;
    }

    public final Map<String, Object> component5() {
        return this.predefinedFilterValues;
    }

    public final Map<String, Object> component6() {
        return this.predefinedSortValues;
    }

    public final QueryChannelsSpec copy(FilterObject filter, QuerySorter<Channel> querySort, Set<String> cids, String predefinedFilterName, Map<String, ? extends Object> predefinedFilterValues, Map<String, ? extends Object> predefinedSortValues) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(querySort, "querySort");
        AbstractC22676k.m65750j(cids, "cids");
        return new QueryChannelsSpec(filter, querySort, cids, predefinedFilterName, predefinedFilterValues, predefinedSortValues);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryChannelsSpec)) {
            return false;
        }
        QueryChannelsSpec queryChannelsSpec = (QueryChannelsSpec) other;
        return AbstractC22676k.m65745e(this.filter, queryChannelsSpec.filter) && AbstractC22676k.m65745e(this.querySort, queryChannelsSpec.querySort) && AbstractC22676k.m65745e(this.cids, queryChannelsSpec.cids) && AbstractC22676k.m65745e(this.predefinedFilterName, queryChannelsSpec.predefinedFilterName) && AbstractC22676k.m65745e(this.predefinedFilterValues, queryChannelsSpec.predefinedFilterValues) && AbstractC22676k.m65745e(this.predefinedSortValues, queryChannelsSpec.predefinedSortValues);
    }

    public final Set<String> getCids() {
        return this.cids;
    }

    public final FilterObject getFilter() {
        return this.filter;
    }

    public final String getPredefinedFilterName() {
        return this.predefinedFilterName;
    }

    public final Map<String, Object> getPredefinedFilterValues() {
        return this.predefinedFilterValues;
    }

    public final Map<String, Object> getPredefinedSortValues() {
        return this.predefinedSortValues;
    }

    public final QuerySorter<Channel> getQuerySort() {
        return this.querySort;
    }

    public final int hashCode() {
        int iM73368a = AbstractC25012a.m73368a(this.cids, (this.querySort.hashCode() + (this.filter.hashCode() * 31)) * 31, 31);
        String str = this.predefinedFilterName;
        int iHashCode = (iM73368a + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map = this.predefinedFilterValues;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, Object> map2 = this.predefinedSortValues;
        return iHashCode2 + (map2 != null ? map2.hashCode() : 0);
    }

    public final void setCids(Set<String> set) {
        AbstractC22676k.m65750j(set, "<set-?>");
        this.cids = set;
    }

    public final String toString() {
        FilterObject filterObject = this.filter;
        QuerySorter<Channel> querySorter = this.querySort;
        Set<String> set = this.cids;
        String str = this.predefinedFilterName;
        Map<String, Object> map = this.predefinedFilterValues;
        Map<String, Object> map2 = this.predefinedSortValues;
        StringBuilder sb4 = new StringBuilder("QueryChannelsSpec(filter=");
        sb4.append(filterObject);
        sb4.append(", querySort=");
        sb4.append(querySorter);
        sb4.append(", cids=");
        sb4.append(set);
        sb4.append(", predefinedFilterName=");
        sb4.append(str);
        sb4.append(", predefinedFilterValues=");
        return AbstractC30802r.m94765n(sb4, map, ", predefinedSortValues=", map2, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryChannelsSpec copy$default(QueryChannelsSpec queryChannelsSpec, FilterObject filterObject, QuerySorter querySorter, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            filterObject = queryChannelsSpec.filter;
        }
        if ((i13 & 2) != 0) {
            querySorter = queryChannelsSpec.querySort;
        }
        return queryChannelsSpec.copy(filterObject, querySorter);
    }

    public final QueryChannelsSpec copy(FilterObject filter, QuerySorter<Channel> querySort) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(querySort, "querySort");
        return new QueryChannelsSpec(filter, querySort, this.cids, this.predefinedFilterName, this.predefinedFilterValues, this.predefinedSortValues);
    }

    public /* synthetic */ QueryChannelsSpec(FilterObject filterObject, QuerySorter querySorter, Set set, String str, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(filterObject, querySorter, (i13 & 4) != 0 ? C25235a0.f99113w : set, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? null : map, (i13 & 32) != 0 ? null : map2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QueryChannelsSpec(FilterObject filter, QuerySorter<Channel> querySort) {
        this(filter, querySort, C25235a0.f99113w, null, null, null);
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(querySort, "querySort");
    }
}
