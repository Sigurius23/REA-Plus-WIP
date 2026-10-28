package io.getstream.chat.android.client.api.models;

import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Filters;
import io.getstream.chat.android.models.querysort.QuerySortByField;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.util.List;
import java.util.Map;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0016\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0087\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013Bk\b\u0017\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0012\u0010\u0014J\u000e\u0010;\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010<\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010=\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\u000f\u0010B\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010D\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010E\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0017\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u0017\u0010G\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u0090\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010IJ\u0013\u0010J\u001a\u00020,2\b\u0010K\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010L\u001a\u00020\u0005HÖ\u0001J\t\u0010M\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u001a\u0010+\u001a\u00020,X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u00020,X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R\u001a\u00104\u001a\u00020,X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010.\"\u0004\b6\u00100R#\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\u000f08¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010>\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b>\u0010.¨\u0006N"}, m65681d2 = {"Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;", "Lio/getstream/chat/android/client/api/models/ChannelRequest;", "filter", "Lio/getstream/chat/android/models/FilterObject;", MapboxMap.QFE_OFFSET, "", MapboxMap.QFE_LIMIT, "querySort", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/Channel;", "messageLimit", "memberLimit", "predefinedFilter", "", "filterValues", "", "", "sortValues", "<init>", "(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "(Ljava/lang/String;ILjava/util/Map;Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;)V", "getFilter", "()Lio/getstream/chat/android/models/FilterObject;", "getOffset", "()I", "setOffset", "(I)V", "getLimit", "setLimit", "getQuerySort", "()Lio/getstream/chat/android/models/querysort/QuerySorter;", "getMessageLimit", "()Ljava/lang/Integer;", "setMessageLimit", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getMemberLimit", "setMemberLimit", "getPredefinedFilter", "()Ljava/lang/String;", "getFilterValues", "()Ljava/util/Map;", "getSortValues", "state", "", "getState", "()Z", "setState", "(Z)V", "watch", "getWatch", "setWatch", "presence", "getPresence", "setPresence", "sort", "", "getSort", "()Ljava/util/List;", "withMessages", "withLimit", "withOffset", "isFirstPage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;", "equals", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class QueryChannelsRequest implements ChannelRequest<QueryChannelsRequest> {
    private final FilterObject filter;
    private final Map<String, Object> filterValues;
    private int limit;
    private Integer memberLimit;
    private Integer messageLimit;
    private int offset;
    private final String predefinedFilter;
    private boolean presence;
    private final QuerySorter<Channel> querySort;
    private final List<Map<String, Object>> sort;
    private final Map<String, Object> sortValues;
    private boolean state;
    private boolean watch;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QueryChannelsRequest(FilterObject filter, int i13) {
        this(filter, 0, i13, null, null, null, null, null, null, 506, null);
        AbstractC22676k.m65750j(filter, "filter");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryChannelsRequest copy$default(QueryChannelsRequest queryChannelsRequest, FilterObject filterObject, int i13, int i14, QuerySorter querySorter, Integer num, Integer num2, String str, Map map, Map map2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            filterObject = queryChannelsRequest.filter;
        }
        if ((i15 & 2) != 0) {
            i13 = queryChannelsRequest.offset;
        }
        if ((i15 & 4) != 0) {
            i14 = queryChannelsRequest.limit;
        }
        if ((i15 & 8) != 0) {
            querySorter = queryChannelsRequest.querySort;
        }
        if ((i15 & 16) != 0) {
            num = queryChannelsRequest.messageLimit;
        }
        if ((i15 & 32) != 0) {
            num2 = queryChannelsRequest.memberLimit;
        }
        if ((i15 & 64) != 0) {
            str = queryChannelsRequest.predefinedFilter;
        }
        if ((i15 & 128) != 0) {
            map = queryChannelsRequest.filterValues;
        }
        if ((i15 & 256) != 0) {
            map2 = queryChannelsRequest.sortValues;
        }
        Map map3 = map;
        Map map4 = map2;
        Integer num3 = num2;
        String str2 = str;
        Integer num4 = num;
        int i16 = i14;
        return queryChannelsRequest.copy(filterObject, i13, i16, querySorter, num4, num3, str2, map3, map4);
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

    public final QuerySorter<Channel> component4() {
        return this.querySort;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getMessageLimit() {
        return this.messageLimit;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getMemberLimit() {
        return this.memberLimit;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPredefinedFilter() {
        return this.predefinedFilter;
    }

    public final Map<String, Object> component8() {
        return this.filterValues;
    }

    public final Map<String, Object> component9() {
        return this.sortValues;
    }

    public final QueryChannelsRequest copy(FilterObject filter, int offset, int limit, QuerySorter<Channel> querySort, Integer messageLimit, Integer memberLimit, String predefinedFilter, Map<String, ? extends Object> filterValues, Map<String, ? extends Object> sortValues) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(querySort, "querySort");
        return new QueryChannelsRequest(filter, offset, limit, querySort, messageLimit, memberLimit, predefinedFilter, filterValues, sortValues);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryChannelsRequest)) {
            return false;
        }
        QueryChannelsRequest queryChannelsRequest = (QueryChannelsRequest) other;
        return AbstractC22676k.m65745e(this.filter, queryChannelsRequest.filter) && this.offset == queryChannelsRequest.offset && this.limit == queryChannelsRequest.limit && AbstractC22676k.m65745e(this.querySort, queryChannelsRequest.querySort) && AbstractC22676k.m65745e(this.messageLimit, queryChannelsRequest.messageLimit) && AbstractC22676k.m65745e(this.memberLimit, queryChannelsRequest.memberLimit) && AbstractC22676k.m65745e(this.predefinedFilter, queryChannelsRequest.predefinedFilter) && AbstractC22676k.m65745e(this.filterValues, queryChannelsRequest.filterValues) && AbstractC22676k.m65745e(this.sortValues, queryChannelsRequest.sortValues);
    }

    public final FilterObject getFilter() {
        return this.filter;
    }

    public final Map<String, Object> getFilterValues() {
        return this.filterValues;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final Integer getMemberLimit() {
        return this.memberLimit;
    }

    public final Integer getMessageLimit() {
        return this.messageLimit;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final String getPredefinedFilter() {
        return this.predefinedFilter;
    }

    @Override // io.getstream.chat.android.client.api.models.ChannelRequest
    public final boolean getPresence() {
        return this.presence;
    }

    public final QuerySorter<Channel> getQuerySort() {
        return this.querySort;
    }

    public final List<Map<String, Object>> getSort() {
        return this.sort;
    }

    public final Map<String, Object> getSortValues() {
        return this.sortValues;
    }

    @Override // io.getstream.chat.android.client.api.models.ChannelRequest
    public final boolean getState() {
        return this.state;
    }

    @Override // io.getstream.chat.android.client.api.models.ChannelRequest
    public final boolean getWatch() {
        return this.watch;
    }

    public final int hashCode() {
        int iHashCode = (this.querySort.hashCode() + AbstractC11266d.m30448b(this.limit, AbstractC11266d.m30448b(this.offset, this.filter.hashCode() * 31, 31), 31)) * 31;
        Integer num = this.messageLimit;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.memberLimit;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.predefinedFilter;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map = this.filterValues;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, Object> map2 = this.sortValues;
        return iHashCode5 + (map2 != null ? map2.hashCode() : 0);
    }

    public final boolean isFirstPage() {
        return this.offset == 0;
    }

    public final void setLimit(int i13) {
        this.limit = i13;
    }

    public final void setMemberLimit(Integer num) {
        this.memberLimit = num;
    }

    public final void setMessageLimit(Integer num) {
        this.messageLimit = num;
    }

    public final void setOffset(int i13) {
        this.offset = i13;
    }

    @Override // io.getstream.chat.android.client.api.models.ChannelRequest
    public final void setPresence(boolean z4) {
        this.presence = z4;
    }

    @Override // io.getstream.chat.android.client.api.models.ChannelRequest
    public final void setState(boolean z4) {
        this.state = z4;
    }

    @Override // io.getstream.chat.android.client.api.models.ChannelRequest
    public final void setWatch(boolean z4) {
        this.watch = z4;
    }

    public final String toString() {
        FilterObject filterObject = this.filter;
        int i13 = this.offset;
        int i14 = this.limit;
        QuerySorter<Channel> querySorter = this.querySort;
        Integer num = this.messageLimit;
        Integer num2 = this.memberLimit;
        String str = this.predefinedFilter;
        Map<String, Object> map = this.filterValues;
        Map<String, Object> map2 = this.sortValues;
        StringBuilder sb4 = new StringBuilder("QueryChannelsRequest(filter=");
        sb4.append(filterObject);
        sb4.append(", offset=");
        sb4.append(i13);
        sb4.append(", limit=");
        sb4.append(i14);
        sb4.append(", querySort=");
        sb4.append(querySorter);
        sb4.append(", messageLimit=");
        AbstractC31061c.m95621A(sb4, num, ", memberLimit=", num2, ", predefinedFilter=");
        AbstractC36095b.m114695w(sb4, str, ", filterValues=", map, ", sortValues=");
        return AbstractC13673n.m38565l(sb4, map2, ")");
    }

    public final QueryChannelsRequest withLimit(int limit) {
        this.limit = limit;
        return this;
    }

    public final QueryChannelsRequest withMessages(int limit) {
        this.messageLimit = Integer.valueOf(limit);
        return this;
    }

    public final QueryChannelsRequest withOffset(int offset) {
        this.offset = offset;
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QueryChannelsRequest(FilterObject filter, int i13, int i14) {
        this(filter, i13, i14, null, null, null, null, null, null, 504, null);
        AbstractC22676k.m65750j(filter, "filter");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QueryChannelsRequest(FilterObject filter, int i13, int i14, QuerySorter<Channel> querySort) {
        this(filter, i13, i14, querySort, null, null, null, null, null, 496, null);
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(querySort, "querySort");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QueryChannelsRequest(FilterObject filter, int i13, int i14, QuerySorter<Channel> querySort, Integer num) {
        this(filter, i13, i14, querySort, num, null, null, null, null, 480, null);
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(querySort, "querySort");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QueryChannelsRequest(FilterObject filter, int i13, int i14, QuerySorter<Channel> querySort, Integer num, Integer num2) {
        this(filter, i13, i14, querySort, num, num2, null, null, null, 448, null);
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(querySort, "querySort");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QueryChannelsRequest(FilterObject filter, int i13, int i14, QuerySorter<Channel> querySort, Integer num, Integer num2, String str) {
        this(filter, i13, i14, querySort, num, num2, str, null, null, 384, null);
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(querySort, "querySort");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QueryChannelsRequest(FilterObject filter, int i13, int i14, QuerySorter<Channel> querySort, Integer num, Integer num2, String str, Map<String, ? extends Object> map) {
        this(filter, i13, i14, querySort, num, num2, str, map, null, 256, null);
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(querySort, "querySort");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QueryChannelsRequest(String predefinedFilter, int i13) {
        this(predefinedFilter, i13, (Map) null, (Map) null, 0, (Integer) null, (Integer) null, 124, (DefaultConstructorMarker) null);
        AbstractC22676k.m65750j(predefinedFilter, "predefinedFilter");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QueryChannelsRequest(String predefinedFilter, int i13, Map<String, ? extends Object> map) {
        this(predefinedFilter, i13, map, (Map) null, 0, (Integer) null, (Integer) null, 120, (DefaultConstructorMarker) null);
        AbstractC22676k.m65750j(predefinedFilter, "predefinedFilter");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QueryChannelsRequest(String predefinedFilter, int i13, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        this(predefinedFilter, i13, map, map2, 0, (Integer) null, (Integer) null, 112, (DefaultConstructorMarker) null);
        AbstractC22676k.m65750j(predefinedFilter, "predefinedFilter");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QueryChannelsRequest(String predefinedFilter, int i13, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, int i14) {
        this(predefinedFilter, i13, map, map2, i14, (Integer) null, (Integer) null, 96, (DefaultConstructorMarker) null);
        AbstractC22676k.m65750j(predefinedFilter, "predefinedFilter");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QueryChannelsRequest(String predefinedFilter, int i13, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, int i14, Integer num) {
        this(predefinedFilter, i13, map, map2, i14, num, (Integer) null, 64, (DefaultConstructorMarker) null);
        AbstractC22676k.m65750j(predefinedFilter, "predefinedFilter");
    }

    public QueryChannelsRequest(FilterObject filter, int i13, int i14, QuerySorter<Channel> querySort, Integer num, Integer num2, String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(querySort, "querySort");
        this.filter = filter;
        this.offset = i13;
        this.limit = i14;
        this.querySort = querySort;
        this.messageLimit = num;
        this.memberLimit = num2;
        this.predefinedFilter = str;
        this.filterValues = map;
        this.sortValues = map2;
        this.state = true;
        this.watch = true;
        this.sort = querySort.toDto();
    }

    public /* synthetic */ QueryChannelsRequest(FilterObject filterObject, int i13, int i14, QuerySorter querySorter, Integer num, Integer num2, String str, Map map, Map map2, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(filterObject, (i15 & 2) != 0 ? 0 : i13, i14, (QuerySorter<Channel>) ((i15 & 8) != 0 ? new QuerySortByField() : querySorter), (i15 & 16) != 0 ? null : num, (i15 & 32) != 0 ? null : num2, (i15 & 64) != 0 ? null : str, (Map<String, ? extends Object>) ((i15 & 128) != 0 ? null : map), (Map<String, ? extends Object>) ((i15 & 256) != 0 ? null : map2));
    }

    public /* synthetic */ QueryChannelsRequest(String str, int i13, Map map, Map map2, int i14, Integer num, Integer num2, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, (Map<String, ? extends Object>) ((i15 & 4) != 0 ? null : map), (Map<String, ? extends Object>) ((i15 & 8) != 0 ? null : map2), (i15 & 16) != 0 ? 0 : i14, (i15 & 32) != 0 ? null : num, (i15 & 64) != 0 ? null : num2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QueryChannelsRequest(String predefinedFilter, int i13, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, int i14, Integer num, Integer num2) {
        this(Filters.neutral(), i14, i13, new QuerySortByField(), num, num2, predefinedFilter, map, map2);
        AbstractC22676k.m65750j(predefinedFilter, "predefinedFilter");
    }
}
