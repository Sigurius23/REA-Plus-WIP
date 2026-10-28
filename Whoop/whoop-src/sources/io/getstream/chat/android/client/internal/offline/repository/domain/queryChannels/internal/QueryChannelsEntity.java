package io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal;

import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.util.List;
import java.util.Map;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rHÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rHÆ\u0003Jy\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001d¨\u0006-"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;", "", "id", "", "filter", "Lio/getstream/chat/android/models/FilterObject;", "querySort", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/Channel;", "cids", "", "predefinedFilterName", "predefinedFilterValues", "", "predefinedSortValues", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getFilter", "()Lio/getstream/chat/android/models/FilterObject;", "getQuerySort", "()Lio/getstream/chat/android/models/querysort/QuerySorter;", "getCids", "()Ljava/util/List;", "getPredefinedFilterName", "getPredefinedFilterValues", "()Ljava/util/Map;", "getPredefinedSortValues", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class QueryChannelsEntity {
    private final List<String> cids;
    private final FilterObject filter;
    private String id;
    private final String predefinedFilterName;
    private final Map<String, Object> predefinedFilterValues;
    private final Map<String, Object> predefinedSortValues;
    private final QuerySorter<Channel> querySort;

    public QueryChannelsEntity(String id4, FilterObject filter, QuerySorter<Channel> querySort, List<String> cids, String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(querySort, "querySort");
        AbstractC22676k.m65750j(cids, "cids");
        this.id = id4;
        this.filter = filter;
        this.querySort = querySort;
        this.cids = cids;
        this.predefinedFilterName = str;
        this.predefinedFilterValues = map;
        this.predefinedSortValues = map2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryChannelsEntity copy$default(QueryChannelsEntity queryChannelsEntity, String str, FilterObject filterObject, QuerySorter querySorter, List list, String str2, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = queryChannelsEntity.id;
        }
        if ((i13 & 2) != 0) {
            filterObject = queryChannelsEntity.filter;
        }
        if ((i13 & 4) != 0) {
            querySorter = queryChannelsEntity.querySort;
        }
        if ((i13 & 8) != 0) {
            list = queryChannelsEntity.cids;
        }
        if ((i13 & 16) != 0) {
            str2 = queryChannelsEntity.predefinedFilterName;
        }
        if ((i13 & 32) != 0) {
            map = queryChannelsEntity.predefinedFilterValues;
        }
        if ((i13 & 64) != 0) {
            map2 = queryChannelsEntity.predefinedSortValues;
        }
        Map map3 = map;
        Map map4 = map2;
        String str3 = str2;
        QuerySorter querySorter2 = querySorter;
        return queryChannelsEntity.copy(str, filterObject, querySorter2, list, str3, map3, map4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FilterObject getFilter() {
        return this.filter;
    }

    public final QuerySorter<Channel> component3() {
        return this.querySort;
    }

    public final List<String> component4() {
        return this.cids;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPredefinedFilterName() {
        return this.predefinedFilterName;
    }

    public final Map<String, Object> component6() {
        return this.predefinedFilterValues;
    }

    public final Map<String, Object> component7() {
        return this.predefinedSortValues;
    }

    public final QueryChannelsEntity copy(String id4, FilterObject filter, QuerySorter<Channel> querySort, List<String> cids, String predefinedFilterName, Map<String, ? extends Object> predefinedFilterValues, Map<String, ? extends Object> predefinedSortValues) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(querySort, "querySort");
        AbstractC22676k.m65750j(cids, "cids");
        return new QueryChannelsEntity(id4, filter, querySort, cids, predefinedFilterName, predefinedFilterValues, predefinedSortValues);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryChannelsEntity)) {
            return false;
        }
        QueryChannelsEntity queryChannelsEntity = (QueryChannelsEntity) other;
        return AbstractC22676k.m65745e(this.id, queryChannelsEntity.id) && AbstractC22676k.m65745e(this.filter, queryChannelsEntity.filter) && AbstractC22676k.m65745e(this.querySort, queryChannelsEntity.querySort) && AbstractC22676k.m65745e(this.cids, queryChannelsEntity.cids) && AbstractC22676k.m65745e(this.predefinedFilterName, queryChannelsEntity.predefinedFilterName) && AbstractC22676k.m65745e(this.predefinedFilterValues, queryChannelsEntity.predefinedFilterValues) && AbstractC22676k.m65745e(this.predefinedSortValues, queryChannelsEntity.predefinedSortValues);
    }

    public final List<String> getCids() {
        return this.cids;
    }

    public final FilterObject getFilter() {
        return this.filter;
    }

    public final String getId() {
        return this.id;
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
        int iM31983b = AbstractC11895b.m31983b((this.querySort.hashCode() + ((this.filter.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31, 31, this.cids);
        String str = this.predefinedFilterName;
        int iHashCode = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map = this.predefinedFilterValues;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, Object> map2 = this.predefinedSortValues;
        return iHashCode2 + (map2 != null ? map2.hashCode() : 0);
    }

    public final void setId(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.id = str;
    }

    public final String toString() {
        String str = this.id;
        FilterObject filterObject = this.filter;
        QuerySorter<Channel> querySorter = this.querySort;
        List<String> list = this.cids;
        String str2 = this.predefinedFilterName;
        Map<String, Object> map = this.predefinedFilterValues;
        Map<String, Object> map2 = this.predefinedSortValues;
        StringBuilder sb4 = new StringBuilder("QueryChannelsEntity(id=");
        sb4.append(str);
        sb4.append(", filter=");
        sb4.append(filterObject);
        sb4.append(", querySort=");
        sb4.append(querySorter);
        sb4.append(", cids=");
        sb4.append(list);
        sb4.append(", predefinedFilterName=");
        AbstractC36095b.m114695w(sb4, str2, ", predefinedFilterValues=", map, ", predefinedSortValues=");
        return AbstractC13673n.m38565l(sb4, map2, ")");
    }

    public /* synthetic */ QueryChannelsEntity(String str, FilterObject filterObject, QuerySorter querySorter, List list, String str2, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, filterObject, querySorter, list, (i13 & 16) != 0 ? null : str2, (i13 & 32) != 0 ? null : map, (i13 & 64) != 0 ? null : map2);
    }
}
