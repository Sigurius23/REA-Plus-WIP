package io.getstream.android.video.generated.models;

import com.mapbox.maps.MapboxMap;
import java.util.List;
import java.util.Map;
import m83.C25271y;
import m83.C25272z;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30731q;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0018\b\u0003\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0019\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\rHÆ\u0003Jr\u0010\"\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0018\b\u0003\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0006HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R!\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u0006)"}, m65681d2 = {"Lio/getstream/android/video/generated/models/QueryCallMembersRequest;", "", "id", "", "type", MapboxMap.QFE_LIMIT, "", "next", "prev", "sort", "", "Lio/getstream/android/video/generated/models/SortParamRequest;", "filterConditions", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "getFilterConditions", "()Ljava/util/Map;", "getId", "()Ljava/lang/String;", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNext", "getPrev", "getSort", "()Ljava/util/List;", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lio/getstream/android/video/generated/models/QueryCallMembersRequest;", "equals", "", "other", "hashCode", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class QueryCallMembersRequest {
    private final Map<String, Object> filterConditions;
    private final String id;
    private final Integer limit;
    private final String next;
    private final String prev;
    private final List<SortParamRequest> sort;
    private final String type;

    public QueryCallMembersRequest(@InterfaceC30731q(name = "id") String id4, @InterfaceC30731q(name = "type") String type, @InterfaceC30731q(name = MapboxMap.QFE_LIMIT) Integer num, @InterfaceC30731q(name = "next") String str, @InterfaceC30731q(name = "prev") String str2, @InterfaceC30731q(name = "sort") List<SortParamRequest> list, @InterfaceC30731q(name = "filter_conditions") Map<String, ? extends Object> map) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(type, "type");
        this.id = id4;
        this.type = type;
        this.limit = num;
        this.next = str;
        this.prev = str2;
        this.sort = list;
        this.filterConditions = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryCallMembersRequest copy$default(QueryCallMembersRequest queryCallMembersRequest, String str, String str2, Integer num, String str3, String str4, List list, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = queryCallMembersRequest.id;
        }
        if ((i13 & 2) != 0) {
            str2 = queryCallMembersRequest.type;
        }
        if ((i13 & 4) != 0) {
            num = queryCallMembersRequest.limit;
        }
        if ((i13 & 8) != 0) {
            str3 = queryCallMembersRequest.next;
        }
        if ((i13 & 16) != 0) {
            str4 = queryCallMembersRequest.prev;
        }
        if ((i13 & 32) != 0) {
            list = queryCallMembersRequest.sort;
        }
        if ((i13 & 64) != 0) {
            map = queryCallMembersRequest.filterConditions;
        }
        List list2 = list;
        Map map2 = map;
        String str5 = str4;
        Integer num2 = num;
        return queryCallMembersRequest.copy(str, str2, num2, str3, str5, list2, map2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPrev() {
        return this.prev;
    }

    public final List<SortParamRequest> component6() {
        return this.sort;
    }

    public final Map<String, Object> component7() {
        return this.filterConditions;
    }

    public final QueryCallMembersRequest copy(@InterfaceC30731q(name = "id") String id4, @InterfaceC30731q(name = "type") String type, @InterfaceC30731q(name = MapboxMap.QFE_LIMIT) Integer limit, @InterfaceC30731q(name = "next") String next, @InterfaceC30731q(name = "prev") String prev, @InterfaceC30731q(name = "sort") List<SortParamRequest> sort, @InterfaceC30731q(name = "filter_conditions") Map<String, ? extends Object> filterConditions) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(type, "type");
        return new QueryCallMembersRequest(id4, type, limit, next, prev, sort, filterConditions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryCallMembersRequest)) {
            return false;
        }
        QueryCallMembersRequest queryCallMembersRequest = (QueryCallMembersRequest) other;
        return AbstractC22676k.m65745e(this.id, queryCallMembersRequest.id) && AbstractC22676k.m65745e(this.type, queryCallMembersRequest.type) && AbstractC22676k.m65745e(this.limit, queryCallMembersRequest.limit) && AbstractC22676k.m65745e(this.next, queryCallMembersRequest.next) && AbstractC22676k.m65745e(this.prev, queryCallMembersRequest.prev) && AbstractC22676k.m65745e(this.sort, queryCallMembersRequest.sort) && AbstractC22676k.m65745e(this.filterConditions, queryCallMembersRequest.filterConditions);
    }

    public final Map<String, Object> getFilterConditions() {
        return this.filterConditions;
    }

    public final String getId() {
        return this.id;
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

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.type);
        Integer num = this.limit;
        int iHashCode = (iM30450d + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.next;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.prev;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<SortParamRequest> list = this.sort;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, Object> map = this.filterConditions;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.type;
        Integer num = this.limit;
        String str3 = this.next;
        String str4 = this.prev;
        List<SortParamRequest> list = this.sort;
        Map<String, Object> map = this.filterConditions;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("QueryCallMembersRequest(id=", str, ", type=", str2, ", limit=");
        AbstractC13673n.m38577x(num, ", next=", str3, ", prev=", sbM32001t);
        AbstractC36095b.m114694v(str4, ", sort=", ", filterConditions=", sbM32001t, list);
        return AbstractC13673n.m38565l(sbM32001t, map, ")");
    }

    public /* synthetic */ QueryCallMembersRequest(String str, String str2, Integer num, String str3, String str4, List list, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : num, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? C25271y.f99162w : list, (i13 & 64) != 0 ? C25272z.f99163w : map);
    }
}
