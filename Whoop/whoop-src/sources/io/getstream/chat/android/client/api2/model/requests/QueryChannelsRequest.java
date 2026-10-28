package io.getstream.chat.android.client.api2.model.requests;

import com.mapbox.maps.MapboxMap;
import java.util.List;
import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p441qx.InterfaceC30737t;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b*\b\u0081\b\u0018\u00002\u00020\u0001B±\u0001\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0003\u0012\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0003\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010(\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0003HÆ\u0003J\u001d\u0010)\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003HÆ\u0003J\u0017\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010!J\t\u00101\u001a\u00020\u0010HÆ\u0003J\t\u00102\u001a\u00020\u0010HÆ\u0003J\t\u00103\u001a\u00020\u0010HÆ\u0003JÆ\u0001\u00104\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00032\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010HÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\u000bHÖ\u0001J\t\u00109\u001a\u00020\u0006HÖ\u0001R\u001b\u0010\u0002\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R%\u0010\u0004\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b#\u0010!R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\u0012\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%¨\u0006:"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;", "", "filter_conditions", "", "sort", "", "", "predefined_filter", "filter_values", "sort_values", MapboxMap.QFE_OFFSET, "", MapboxMap.QFE_LIMIT, "message_limit", "member_limit", "state", "", "watch", "presence", "<init>", "(Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;IILjava/lang/Integer;Ljava/lang/Integer;ZZZ)V", "getFilter_conditions", "()Ljava/util/Map;", "getSort", "()Ljava/util/List;", "getPredefined_filter", "()Ljava/lang/String;", "getFilter_values", "getSort_values", "getOffset", "()I", "getLimit", "getMessage_limit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMember_limit", "getState", "()Z", "getWatch", "getPresence", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;IILjava/lang/Integer;Ljava/lang/Integer;ZZZ)Lio/getstream/chat/android/client/api2/model/requests/QueryChannelsRequest;", "equals", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class QueryChannelsRequest {
    private final Map<?, ?> filter_conditions;
    private final Map<String, Object> filter_values;
    private final int limit;
    private final Integer member_limit;
    private final Integer message_limit;
    private final int offset;
    private final String predefined_filter;
    private final boolean presence;
    private final List<Map<String, Object>> sort;
    private final Map<String, Object> sort_values;
    private final boolean state;
    private final boolean watch;

    /* JADX WARN: Multi-variable type inference failed */
    public QueryChannelsRequest(Map<?, ?> map, List<? extends Map<String, ? extends Object>> list, String str, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, int i13, int i14, Integer num, Integer num2, boolean z4, boolean z13, boolean z14) {
        this.filter_conditions = map;
        this.sort = list;
        this.predefined_filter = str;
        this.filter_values = map2;
        this.sort_values = map3;
        this.offset = i13;
        this.limit = i14;
        this.message_limit = num;
        this.member_limit = num2;
        this.state = z4;
        this.watch = z13;
        this.presence = z14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryChannelsRequest copy$default(QueryChannelsRequest queryChannelsRequest, Map map, List list, String str, Map map2, Map map3, int i13, int i14, Integer num, Integer num2, boolean z4, boolean z13, boolean z14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            map = queryChannelsRequest.filter_conditions;
        }
        if ((i15 & 2) != 0) {
            list = queryChannelsRequest.sort;
        }
        if ((i15 & 4) != 0) {
            str = queryChannelsRequest.predefined_filter;
        }
        if ((i15 & 8) != 0) {
            map2 = queryChannelsRequest.filter_values;
        }
        if ((i15 & 16) != 0) {
            map3 = queryChannelsRequest.sort_values;
        }
        if ((i15 & 32) != 0) {
            i13 = queryChannelsRequest.offset;
        }
        if ((i15 & 64) != 0) {
            i14 = queryChannelsRequest.limit;
        }
        if ((i15 & 128) != 0) {
            num = queryChannelsRequest.message_limit;
        }
        if ((i15 & 256) != 0) {
            num2 = queryChannelsRequest.member_limit;
        }
        if ((i15 & 512) != 0) {
            z4 = queryChannelsRequest.state;
        }
        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            z13 = queryChannelsRequest.watch;
        }
        if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            z14 = queryChannelsRequest.presence;
        }
        boolean z15 = z13;
        boolean z16 = z14;
        Integer num3 = num2;
        boolean z17 = z4;
        int i16 = i14;
        Integer num4 = num;
        Map map4 = map3;
        int i17 = i13;
        return queryChannelsRequest.copy(map, list, str, map2, map4, i17, i16, num4, num3, z17, z15, z16);
    }

    public final Map<?, ?> component1() {
        return this.filter_conditions;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getWatch() {
        return this.watch;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getPresence() {
        return this.presence;
    }

    public final List<Map<String, Object>> component2() {
        return this.sort;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPredefined_filter() {
        return this.predefined_filter;
    }

    public final Map<String, Object> component4() {
        return this.filter_values;
    }

    public final Map<String, Object> component5() {
        return this.sort_values;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getMessage_limit() {
        return this.message_limit;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getMember_limit() {
        return this.member_limit;
    }

    public final QueryChannelsRequest copy(Map<?, ?> filter_conditions, List<? extends Map<String, ? extends Object>> sort, String predefined_filter, Map<String, ? extends Object> filter_values, Map<String, ? extends Object> sort_values, int offset, int limit, Integer message_limit, Integer member_limit, boolean state, boolean watch, boolean presence) {
        return new QueryChannelsRequest(filter_conditions, sort, predefined_filter, filter_values, sort_values, offset, limit, message_limit, member_limit, state, watch, presence);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryChannelsRequest)) {
            return false;
        }
        QueryChannelsRequest queryChannelsRequest = (QueryChannelsRequest) other;
        return AbstractC22676k.m65745e(this.filter_conditions, queryChannelsRequest.filter_conditions) && AbstractC22676k.m65745e(this.sort, queryChannelsRequest.sort) && AbstractC22676k.m65745e(this.predefined_filter, queryChannelsRequest.predefined_filter) && AbstractC22676k.m65745e(this.filter_values, queryChannelsRequest.filter_values) && AbstractC22676k.m65745e(this.sort_values, queryChannelsRequest.sort_values) && this.offset == queryChannelsRequest.offset && this.limit == queryChannelsRequest.limit && AbstractC22676k.m65745e(this.message_limit, queryChannelsRequest.message_limit) && AbstractC22676k.m65745e(this.member_limit, queryChannelsRequest.member_limit) && this.state == queryChannelsRequest.state && this.watch == queryChannelsRequest.watch && this.presence == queryChannelsRequest.presence;
    }

    public final Map<?, ?> getFilter_conditions() {
        return this.filter_conditions;
    }

    public final Map<String, Object> getFilter_values() {
        return this.filter_values;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final Integer getMember_limit() {
        return this.member_limit;
    }

    public final Integer getMessage_limit() {
        return this.message_limit;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final String getPredefined_filter() {
        return this.predefined_filter;
    }

    public final boolean getPresence() {
        return this.presence;
    }

    public final List<Map<String, Object>> getSort() {
        return this.sort;
    }

    public final Map<String, Object> getSort_values() {
        return this.sort_values;
    }

    public final boolean getState() {
        return this.state;
    }

    public final boolean getWatch() {
        return this.watch;
    }

    public int hashCode() {
        Map<?, ?> map = this.filter_conditions;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        List<Map<String, Object>> list = this.sort;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.predefined_filter;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map2 = this.filter_values;
        int iHashCode4 = (iHashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, Object> map3 = this.sort_values;
        int iM30448b = AbstractC11266d.m30448b(this.limit, AbstractC11266d.m30448b(this.offset, (iHashCode4 + (map3 == null ? 0 : map3.hashCode())) * 31, 31), 31);
        Integer num = this.message_limit;
        int iHashCode5 = (iM30448b + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.member_limit;
        return Boolean.hashCode(this.presence) + AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.state), 31, this.watch);
    }

    public String toString() {
        Map<?, ?> map = this.filter_conditions;
        List<Map<String, Object>> list = this.sort;
        String str = this.predefined_filter;
        Map<String, Object> map2 = this.filter_values;
        Map<String, Object> map3 = this.sort_values;
        int i13 = this.offset;
        int i14 = this.limit;
        Integer num = this.message_limit;
        Integer num2 = this.member_limit;
        boolean z4 = this.state;
        boolean z13 = this.watch;
        boolean z14 = this.presence;
        StringBuilder sb4 = new StringBuilder("QueryChannelsRequest(filter_conditions=");
        sb4.append(map);
        sb4.append(", sort=");
        sb4.append(list);
        sb4.append(", predefined_filter=");
        AbstractC36095b.m114695w(sb4, str, ", filter_values=", map2, ", sort_values=");
        sb4.append(map3);
        sb4.append(", offset=");
        sb4.append(i13);
        sb4.append(", limit=");
        sb4.append(i14);
        sb4.append(", message_limit=");
        sb4.append(num);
        sb4.append(", member_limit=");
        sb4.append(num2);
        sb4.append(", state=");
        sb4.append(z4);
        sb4.append(", watch=");
        return AbstractC36095b.m114682j(sb4, z13, ", presence=", z14, ")");
    }

    public /* synthetic */ QueryChannelsRequest(Map map, List list, String str, Map map2, Map map3, int i13, int i14, Integer num, Integer num2, boolean z4, boolean z13, boolean z14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? null : map, (i15 & 2) != 0 ? null : list, (i15 & 4) != 0 ? null : str, (i15 & 8) != 0 ? null : map2, (i15 & 16) != 0 ? null : map3, i13, i14, num, num2, z4, z13, z14);
    }
}
