package io.getstream.chat.android.client.api2.model.requests;

import com.mapbox.maps.MapboxMap;
import java.util.List;
import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BQ\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0003\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0015\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u001d\u0010\u0018\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0003\u0018\u00010\tHÆ\u0003JX\u0010\u0019\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0003\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u001b\u0010\u0002\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R%\u0010\b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/QueryPollsRequest;", "", "filter", "", MapboxMap.QFE_LIMIT, "", "next", "", "sort", "", "<init>", "(Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "getFilter", "()Ljava/util/Map;", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNext", "()Ljava/lang/String;", "getSort", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lio/getstream/chat/android/client/api2/model/requests/QueryPollsRequest;", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class QueryPollsRequest {
    private final Map<?, ?> filter;
    private final Integer limit;
    private final String next;
    private final List<Map<String, Object>> sort;

    public QueryPollsRequest() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryPollsRequest copy$default(QueryPollsRequest queryPollsRequest, Map map, Integer num, String str, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            map = queryPollsRequest.filter;
        }
        if ((i13 & 2) != 0) {
            num = queryPollsRequest.limit;
        }
        if ((i13 & 4) != 0) {
            str = queryPollsRequest.next;
        }
        if ((i13 & 8) != 0) {
            list = queryPollsRequest.sort;
        }
        return queryPollsRequest.copy(map, num, str, list);
    }

    public final Map<?, ?> component1() {
        return this.filter;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    public final List<Map<String, Object>> component4() {
        return this.sort;
    }

    public final QueryPollsRequest copy(Map<?, ?> filter, Integer limit, String next, List<? extends Map<String, ? extends Object>> sort) {
        return new QueryPollsRequest(filter, limit, next, sort);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryPollsRequest)) {
            return false;
        }
        QueryPollsRequest queryPollsRequest = (QueryPollsRequest) other;
        return AbstractC22676k.m65745e(this.filter, queryPollsRequest.filter) && AbstractC22676k.m65745e(this.limit, queryPollsRequest.limit) && AbstractC22676k.m65745e(this.next, queryPollsRequest.next) && AbstractC22676k.m65745e(this.sort, queryPollsRequest.sort);
    }

    public final Map<?, ?> getFilter() {
        return this.filter;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final String getNext() {
        return this.next;
    }

    public final List<Map<String, Object>> getSort() {
        return this.sort;
    }

    public int hashCode() {
        Map<?, ?> map = this.filter;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Integer num = this.limit;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.next;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<Map<String, Object>> list = this.sort;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        Map<?, ?> map = this.filter;
        Integer num = this.limit;
        String str = this.next;
        List<Map<String, Object>> list = this.sort;
        StringBuilder sb4 = new StringBuilder("QueryPollsRequest(filter=");
        sb4.append(map);
        sb4.append(", limit=");
        sb4.append(num);
        sb4.append(", next=");
        return AbstractC30007c.m91840j(str, ", sort=", ")", sb4, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QueryPollsRequest(Map<?, ?> map, Integer num, String str, List<? extends Map<String, ? extends Object>> list) {
        this.filter = map;
        this.limit = num;
        this.next = str;
        this.sort = list;
    }

    public /* synthetic */ QueryPollsRequest(Map map, Integer num, String str, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : map, (i13 & 2) != 0 ? null : num, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : list);
    }
}
