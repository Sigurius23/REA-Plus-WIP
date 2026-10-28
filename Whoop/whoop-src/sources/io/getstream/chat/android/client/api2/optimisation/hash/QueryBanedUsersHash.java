package io.getstream.chat.android.client.api2.optimisation.hash;

import com.mapbox.maps.MapboxMap;
import hc3.AbstractC17176i;
import io.getstream.chat.android.models.BannedUsersSort;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.util.Date;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003Jp\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\bHÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001a¨\u0006."}, m65681d2 = {"Lio/getstream/chat/android/client/api2/optimisation/hash/QueryBanedUsersHash;", "", "filter", "Lio/getstream/chat/android/models/FilterObject;", "sort", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/BannedUsersSort;", MapboxMap.QFE_OFFSET, "", MapboxMap.QFE_LIMIT, "createdAtAfter", "Ljava/util/Date;", "createdAtAfterOrEqual", "createdAtBefore", "createdAtBeforeOrEqual", "<init>", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V", "getFilter", "()Lio/getstream/chat/android/models/FilterObject;", "getSort", "()Lio/getstream/chat/android/models/querysort/QuerySorter;", "getOffset", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLimit", "getCreatedAtAfter", "()Ljava/util/Date;", "getCreatedAtAfterOrEqual", "getCreatedAtBefore", "getCreatedAtBeforeOrEqual", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)Lio/getstream/chat/android/client/api2/optimisation/hash/QueryBanedUsersHash;", "equals", "", "other", "hashCode", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class QueryBanedUsersHash {
    private final Date createdAtAfter;
    private final Date createdAtAfterOrEqual;
    private final Date createdAtBefore;
    private final Date createdAtBeforeOrEqual;
    private final FilterObject filter;
    private final Integer limit;
    private final Integer offset;
    private final QuerySorter<BannedUsersSort> sort;

    public QueryBanedUsersHash(FilterObject filter, QuerySorter<BannedUsersSort> sort, Integer num, Integer num2, Date date, Date date2, Date date3, Date date4) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        this.filter = filter;
        this.sort = sort;
        this.offset = num;
        this.limit = num2;
        this.createdAtAfter = date;
        this.createdAtAfterOrEqual = date2;
        this.createdAtBefore = date3;
        this.createdAtBeforeOrEqual = date4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryBanedUsersHash copy$default(QueryBanedUsersHash queryBanedUsersHash, FilterObject filterObject, QuerySorter querySorter, Integer num, Integer num2, Date date, Date date2, Date date3, Date date4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            filterObject = queryBanedUsersHash.filter;
        }
        if ((i13 & 2) != 0) {
            querySorter = queryBanedUsersHash.sort;
        }
        if ((i13 & 4) != 0) {
            num = queryBanedUsersHash.offset;
        }
        if ((i13 & 8) != 0) {
            num2 = queryBanedUsersHash.limit;
        }
        if ((i13 & 16) != 0) {
            date = queryBanedUsersHash.createdAtAfter;
        }
        if ((i13 & 32) != 0) {
            date2 = queryBanedUsersHash.createdAtAfterOrEqual;
        }
        if ((i13 & 64) != 0) {
            date3 = queryBanedUsersHash.createdAtBefore;
        }
        if ((i13 & 128) != 0) {
            date4 = queryBanedUsersHash.createdAtBeforeOrEqual;
        }
        Date date5 = date3;
        Date date6 = date4;
        Date date7 = date;
        Date date8 = date2;
        return queryBanedUsersHash.copy(filterObject, querySorter, num, num2, date7, date8, date5, date6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FilterObject getFilter() {
        return this.filter;
    }

    public final QuerySorter<BannedUsersSort> component2() {
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
    public final Date getCreatedAtAfter() {
        return this.createdAtAfter;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Date getCreatedAtAfterOrEqual() {
        return this.createdAtAfterOrEqual;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Date getCreatedAtBefore() {
        return this.createdAtBefore;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Date getCreatedAtBeforeOrEqual() {
        return this.createdAtBeforeOrEqual;
    }

    public final QueryBanedUsersHash copy(FilterObject filter, QuerySorter<BannedUsersSort> sort, Integer offset, Integer limit, Date createdAtAfter, Date createdAtAfterOrEqual, Date createdAtBefore, Date createdAtBeforeOrEqual) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        return new QueryBanedUsersHash(filter, sort, offset, limit, createdAtAfter, createdAtAfterOrEqual, createdAtBefore, createdAtBeforeOrEqual);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryBanedUsersHash)) {
            return false;
        }
        QueryBanedUsersHash queryBanedUsersHash = (QueryBanedUsersHash) other;
        return AbstractC22676k.m65745e(this.filter, queryBanedUsersHash.filter) && AbstractC22676k.m65745e(this.sort, queryBanedUsersHash.sort) && AbstractC22676k.m65745e(this.offset, queryBanedUsersHash.offset) && AbstractC22676k.m65745e(this.limit, queryBanedUsersHash.limit) && AbstractC22676k.m65745e(this.createdAtAfter, queryBanedUsersHash.createdAtAfter) && AbstractC22676k.m65745e(this.createdAtAfterOrEqual, queryBanedUsersHash.createdAtAfterOrEqual) && AbstractC22676k.m65745e(this.createdAtBefore, queryBanedUsersHash.createdAtBefore) && AbstractC22676k.m65745e(this.createdAtBeforeOrEqual, queryBanedUsersHash.createdAtBeforeOrEqual);
    }

    public final Date getCreatedAtAfter() {
        return this.createdAtAfter;
    }

    public final Date getCreatedAtAfterOrEqual() {
        return this.createdAtAfterOrEqual;
    }

    public final Date getCreatedAtBefore() {
        return this.createdAtBefore;
    }

    public final Date getCreatedAtBeforeOrEqual() {
        return this.createdAtBeforeOrEqual;
    }

    public final FilterObject getFilter() {
        return this.filter;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final Integer getOffset() {
        return this.offset;
    }

    public final QuerySorter<BannedUsersSort> getSort() {
        return this.sort;
    }

    public final int hashCode() {
        int iHashCode = (this.sort.hashCode() + (this.filter.hashCode() * 31)) * 31;
        Integer num = this.offset;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.limit;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Date date = this.createdAtAfter;
        int iHashCode4 = (iHashCode3 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.createdAtAfterOrEqual;
        int iHashCode5 = (iHashCode4 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.createdAtBefore;
        int iHashCode6 = (iHashCode5 + (date3 == null ? 0 : date3.hashCode())) * 31;
        Date date4 = this.createdAtBeforeOrEqual;
        return iHashCode6 + (date4 != null ? date4.hashCode() : 0);
    }

    public final String toString() {
        FilterObject filterObject = this.filter;
        QuerySorter<BannedUsersSort> querySorter = this.sort;
        Integer num = this.offset;
        Integer num2 = this.limit;
        Date date = this.createdAtAfter;
        Date date2 = this.createdAtAfterOrEqual;
        Date date3 = this.createdAtBefore;
        Date date4 = this.createdAtBeforeOrEqual;
        StringBuilder sb4 = new StringBuilder("QueryBanedUsersHash(filter=");
        sb4.append(filterObject);
        sb4.append(", sort=");
        sb4.append(querySorter);
        sb4.append(", offset=");
        AbstractC31061c.m95621A(sb4, num, ", limit=", num2, ", createdAtAfter=");
        AbstractC17176i.m48512n(sb4, date, ", createdAtAfterOrEqual=", date2, ", createdAtBefore=");
        sb4.append(date3);
        sb4.append(", createdAtBeforeOrEqual=");
        sb4.append(date4);
        sb4.append(")");
        return sb4.toString();
    }
}
