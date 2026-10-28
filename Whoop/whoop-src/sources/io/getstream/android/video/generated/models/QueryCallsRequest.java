package io.getstream.android.video.generated.models;

import com.mapbox.maps.MapboxMap;
import java.util.List;
import java.util.Map;
import m83.C25271y;
import m83.C25272z;
import p441qx.InterfaceC30731q;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0018\b\u0003\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0019\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\rHÆ\u0003Jj\u0010\"\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0018\b\u0003\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R!\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, m65681d2 = {"Lio/getstream/android/video/generated/models/QueryCallsRequest;", "", MapboxMap.QFE_LIMIT, "", "next", "", "prev", "watch", "", "sort", "", "Lio/getstream/android/video/generated/models/SortParamRequest;", "filterConditions", "", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;)V", "getFilterConditions", "()Ljava/util/Map;", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNext", "()Ljava/lang/String;", "getPrev", "getSort", "()Ljava/util/List;", "getWatch", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/Map;)Lio/getstream/android/video/generated/models/QueryCallsRequest;", "equals", "other", "hashCode", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class QueryCallsRequest {
    private final Map<String, Object> filterConditions;
    private final Integer limit;
    private final String next;
    private final String prev;
    private final List<SortParamRequest> sort;
    private final Boolean watch;

    public QueryCallsRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryCallsRequest copy$default(QueryCallsRequest queryCallsRequest, Integer num, String str, String str2, Boolean bool, List list, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = queryCallsRequest.limit;
        }
        if ((i13 & 2) != 0) {
            str = queryCallsRequest.next;
        }
        if ((i13 & 4) != 0) {
            str2 = queryCallsRequest.prev;
        }
        if ((i13 & 8) != 0) {
            bool = queryCallsRequest.watch;
        }
        if ((i13 & 16) != 0) {
            list = queryCallsRequest.sort;
        }
        if ((i13 & 32) != 0) {
            map = queryCallsRequest.filterConditions;
        }
        List list2 = list;
        Map map2 = map;
        return queryCallsRequest.copy(num, str, str2, bool, list2, map2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPrev() {
        return this.prev;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getWatch() {
        return this.watch;
    }

    public final List<SortParamRequest> component5() {
        return this.sort;
    }

    public final Map<String, Object> component6() {
        return this.filterConditions;
    }

    public final QueryCallsRequest copy(@InterfaceC30731q(name = MapboxMap.QFE_LIMIT) Integer limit, @InterfaceC30731q(name = "next") String next, @InterfaceC30731q(name = "prev") String prev, @InterfaceC30731q(name = "watch") Boolean watch, @InterfaceC30731q(name = "sort") List<SortParamRequest> sort, @InterfaceC30731q(name = "filter_conditions") Map<String, ? extends Object> filterConditions) {
        return new QueryCallsRequest(limit, next, prev, watch, sort, filterConditions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryCallsRequest)) {
            return false;
        }
        QueryCallsRequest queryCallsRequest = (QueryCallsRequest) other;
        return AbstractC22676k.m65745e(this.limit, queryCallsRequest.limit) && AbstractC22676k.m65745e(this.next, queryCallsRequest.next) && AbstractC22676k.m65745e(this.prev, queryCallsRequest.prev) && AbstractC22676k.m65745e(this.watch, queryCallsRequest.watch) && AbstractC22676k.m65745e(this.sort, queryCallsRequest.sort) && AbstractC22676k.m65745e(this.filterConditions, queryCallsRequest.filterConditions);
    }

    public final Map<String, Object> getFilterConditions() {
        return this.filterConditions;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final String getNext() {
        return this.next;
    }

    public final String getPrev() {
        return this.prev;
    }

    public final List<SortParamRequest> getSort() {
        return this.sort;
    }

    public final Boolean getWatch() {
        return this.watch;
    }

    public int hashCode() {
        Integer num = this.limit;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.next;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.prev;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.watch;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<SortParamRequest> list = this.sort;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, Object> map = this.filterConditions;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.limit;
        String str = this.next;
        String str2 = this.prev;
        Boolean bool = this.watch;
        List<SortParamRequest> list = this.sort;
        Map<String, Object> map = this.filterConditions;
        StringBuilder sbM95643s = AbstractC31061c.m95643s("QueryCallsRequest(limit=", ", next=", num, str, ", prev=");
        AbstractC36095b.m114692t(bool, str2, ", watch=", ", sort=", sbM95643s);
        sbM95643s.append(list);
        sbM95643s.append(", filterConditions=");
        sbM95643s.append(map);
        sbM95643s.append(")");
        return sbM95643s.toString();
    }

    public QueryCallsRequest(@InterfaceC30731q(name = MapboxMap.QFE_LIMIT) Integer num, @InterfaceC30731q(name = "next") String str, @InterfaceC30731q(name = "prev") String str2, @InterfaceC30731q(name = "watch") Boolean bool, @InterfaceC30731q(name = "sort") List<SortParamRequest> list, @InterfaceC30731q(name = "filter_conditions") Map<String, ? extends Object> map) {
        this.limit = num;
        this.next = str;
        this.prev = str2;
        this.watch = bool;
        this.sort = list;
        this.filterConditions = map;
    }

    public /* synthetic */ QueryCallsRequest(Integer num, String str, String str2, Boolean bool, List list, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : bool, (i13 & 16) != 0 ? C25271y.f99162w : list, (i13 & 32) != 0 ? C25272z.f99163w : map);
    }
}
