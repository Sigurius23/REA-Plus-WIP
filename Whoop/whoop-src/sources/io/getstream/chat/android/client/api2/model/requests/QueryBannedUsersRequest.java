package io.getstream.chat.android.client.api2.model.requests;

import com.mapbox.maps.MapboxMap;
import hc3.AbstractC17176i;
import java.util.Date;
import java.util.List;
import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001Bm\u0012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00030\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010 \u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003HÆ\u0003J\u001b\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00030\u0005HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0084\u0001\u0010(\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00030\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\bHÖ\u0001J\t\u0010.\u001a\u00020\u0006HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R#\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001c¨\u0006/"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;", "", "filter_conditions", "", "sort", "", "", MapboxMap.QFE_OFFSET, "", MapboxMap.QFE_LIMIT, "created_at_after", "Ljava/util/Date;", "created_at_after_or_equal", "created_at_before", "created_at_before_or_equal", "<init>", "(Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V", "getFilter_conditions", "()Ljava/util/Map;", "setFilter_conditions", "(Ljava/util/Map;)V", "getSort", "()Ljava/util/List;", "getOffset", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLimit", "getCreated_at_after", "()Ljava/util/Date;", "getCreated_at_after_or_equal", "getCreated_at_before", "getCreated_at_before_or_equal", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)Lio/getstream/chat/android/client/api2/model/requests/QueryBannedUsersRequest;", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class QueryBannedUsersRequest {
    private final Date created_at_after;
    private final Date created_at_after_or_equal;
    private final Date created_at_before;
    private final Date created_at_before_or_equal;
    private Map<?, ?> filter_conditions;
    private final Integer limit;
    private final Integer offset;
    private final List<Map<String, Object>> sort;

    /* JADX WARN: Multi-variable type inference failed */
    public QueryBannedUsersRequest(Map<?, ?> filter_conditions, List<? extends Map<String, ? extends Object>> sort, Integer num, Integer num2, Date date, Date date2, Date date3, Date date4) {
        AbstractC22676k.m65750j(filter_conditions, "filter_conditions");
        AbstractC22676k.m65750j(sort, "sort");
        this.filter_conditions = filter_conditions;
        this.sort = sort;
        this.offset = num;
        this.limit = num2;
        this.created_at_after = date;
        this.created_at_after_or_equal = date2;
        this.created_at_before = date3;
        this.created_at_before_or_equal = date4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryBannedUsersRequest copy$default(QueryBannedUsersRequest queryBannedUsersRequest, Map map, List list, Integer num, Integer num2, Date date, Date date2, Date date3, Date date4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            map = queryBannedUsersRequest.filter_conditions;
        }
        if ((i13 & 2) != 0) {
            list = queryBannedUsersRequest.sort;
        }
        if ((i13 & 4) != 0) {
            num = queryBannedUsersRequest.offset;
        }
        if ((i13 & 8) != 0) {
            num2 = queryBannedUsersRequest.limit;
        }
        if ((i13 & 16) != 0) {
            date = queryBannedUsersRequest.created_at_after;
        }
        if ((i13 & 32) != 0) {
            date2 = queryBannedUsersRequest.created_at_after_or_equal;
        }
        if ((i13 & 64) != 0) {
            date3 = queryBannedUsersRequest.created_at_before;
        }
        if ((i13 & 128) != 0) {
            date4 = queryBannedUsersRequest.created_at_before_or_equal;
        }
        Date date5 = date3;
        Date date6 = date4;
        Date date7 = date;
        Date date8 = date2;
        return queryBannedUsersRequest.copy(map, list, num, num2, date7, date8, date5, date6);
    }

    public final Map<?, ?> component1() {
        return this.filter_conditions;
    }

    public final List<Map<String, Object>> component2() {
        return this.sort;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getCreated_at_after() {
        return this.created_at_after;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Date getCreated_at_after_or_equal() {
        return this.created_at_after_or_equal;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Date getCreated_at_before() {
        return this.created_at_before;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Date getCreated_at_before_or_equal() {
        return this.created_at_before_or_equal;
    }

    public final QueryBannedUsersRequest copy(Map<?, ?> filter_conditions, List<? extends Map<String, ? extends Object>> sort, Integer offset, Integer limit, Date created_at_after, Date created_at_after_or_equal, Date created_at_before, Date created_at_before_or_equal) {
        AbstractC22676k.m65750j(filter_conditions, "filter_conditions");
        AbstractC22676k.m65750j(sort, "sort");
        return new QueryBannedUsersRequest(filter_conditions, sort, offset, limit, created_at_after, created_at_after_or_equal, created_at_before, created_at_before_or_equal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryBannedUsersRequest)) {
            return false;
        }
        QueryBannedUsersRequest queryBannedUsersRequest = (QueryBannedUsersRequest) other;
        return AbstractC22676k.m65745e(this.filter_conditions, queryBannedUsersRequest.filter_conditions) && AbstractC22676k.m65745e(this.sort, queryBannedUsersRequest.sort) && AbstractC22676k.m65745e(this.offset, queryBannedUsersRequest.offset) && AbstractC22676k.m65745e(this.limit, queryBannedUsersRequest.limit) && AbstractC22676k.m65745e(this.created_at_after, queryBannedUsersRequest.created_at_after) && AbstractC22676k.m65745e(this.created_at_after_or_equal, queryBannedUsersRequest.created_at_after_or_equal) && AbstractC22676k.m65745e(this.created_at_before, queryBannedUsersRequest.created_at_before) && AbstractC22676k.m65745e(this.created_at_before_or_equal, queryBannedUsersRequest.created_at_before_or_equal);
    }

    public final Date getCreated_at_after() {
        return this.created_at_after;
    }

    public final Date getCreated_at_after_or_equal() {
        return this.created_at_after_or_equal;
    }

    public final Date getCreated_at_before() {
        return this.created_at_before;
    }

    public final Date getCreated_at_before_or_equal() {
        return this.created_at_before_or_equal;
    }

    public final Map<?, ?> getFilter_conditions() {
        return this.filter_conditions;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final Integer getOffset() {
        return this.offset;
    }

    public final List<Map<String, Object>> getSort() {
        return this.sort;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.filter_conditions.hashCode() * 31, 31, this.sort);
        Integer num = this.offset;
        int iHashCode = (iM31983b + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.limit;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Date date = this.created_at_after;
        int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.created_at_after_or_equal;
        int iHashCode4 = (iHashCode3 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.created_at_before;
        int iHashCode5 = (iHashCode4 + (date3 == null ? 0 : date3.hashCode())) * 31;
        Date date4 = this.created_at_before_or_equal;
        return iHashCode5 + (date4 != null ? date4.hashCode() : 0);
    }

    public final void setFilter_conditions(Map<?, ?> map) {
        AbstractC22676k.m65750j(map, "<set-?>");
        this.filter_conditions = map;
    }

    public String toString() {
        Map<?, ?> map = this.filter_conditions;
        List<Map<String, Object>> list = this.sort;
        Integer num = this.offset;
        Integer num2 = this.limit;
        Date date = this.created_at_after;
        Date date2 = this.created_at_after_or_equal;
        Date date3 = this.created_at_before;
        Date date4 = this.created_at_before_or_equal;
        StringBuilder sb4 = new StringBuilder("QueryBannedUsersRequest(filter_conditions=");
        sb4.append(map);
        sb4.append(", sort=");
        sb4.append(list);
        sb4.append(", offset=");
        AbstractC31061c.m95621A(sb4, num, ", limit=", num2, ", created_at_after=");
        AbstractC17176i.m48512n(sb4, date, ", created_at_after_or_equal=", date2, ", created_at_before=");
        sb4.append(date3);
        sb4.append(", created_at_before_or_equal=");
        sb4.append(date4);
        sb4.append(")");
        return sb4.toString();
    }
}
