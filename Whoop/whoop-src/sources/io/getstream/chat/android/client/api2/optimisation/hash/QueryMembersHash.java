package io.getstream.chat.android.client.api2.optimisation.hash;

import c13.AbstractC3855a;
import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.querysort.QuerySorter;
import java.util.List;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u000eHÆ\u0003J[\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0006HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/optimisation/hash/QueryMembersHash;", "", "channelType", "", "channelId", MapboxMap.QFE_OFFSET, "", MapboxMap.QFE_LIMIT, "filter", "Lio/getstream/chat/android/models/FilterObject;", "sort", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/Member;", QueryChannelRequest.KEY_MEMBERS, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)V", "getChannelType", "()Ljava/lang/String;", "getChannelId", "getOffset", "()I", "getLimit", "getFilter", "()Lio/getstream/chat/android/models/FilterObject;", "getSort", "()Lio/getstream/chat/android/models/querysort/QuerySorter;", "getMembers", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class QueryMembersHash {
    private final String channelId;
    private final String channelType;
    private final FilterObject filter;
    private final int limit;
    private final List<Member> members;
    private final int offset;
    private final QuerySorter<Member> sort;

    public QueryMembersHash(String channelType, String channelId, int i13, int i14, FilterObject filter, QuerySorter<Member> sort, List<Member> members) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        AbstractC22676k.m65750j(members, "members");
        this.channelType = channelType;
        this.channelId = channelId;
        this.offset = i13;
        this.limit = i14;
        this.filter = filter;
        this.sort = sort;
        this.members = members;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryMembersHash copy$default(QueryMembersHash queryMembersHash, String str, String str2, int i13, int i14, FilterObject filterObject, QuerySorter querySorter, List list, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = queryMembersHash.channelType;
        }
        if ((i15 & 2) != 0) {
            str2 = queryMembersHash.channelId;
        }
        if ((i15 & 4) != 0) {
            i13 = queryMembersHash.offset;
        }
        if ((i15 & 8) != 0) {
            i14 = queryMembersHash.limit;
        }
        if ((i15 & 16) != 0) {
            filterObject = queryMembersHash.filter;
        }
        if ((i15 & 32) != 0) {
            querySorter = queryMembersHash.sort;
        }
        if ((i15 & 64) != 0) {
            list = queryMembersHash.members;
        }
        QuerySorter querySorter2 = querySorter;
        List list2 = list;
        FilterObject filterObject2 = filterObject;
        int i16 = i13;
        return queryMembersHash.copy(str, str2, i16, i14, filterObject2, querySorter2, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannelType() {
        return this.channelType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final FilterObject getFilter() {
        return this.filter;
    }

    public final QuerySorter<Member> component6() {
        return this.sort;
    }

    public final List<Member> component7() {
        return this.members;
    }

    public final QueryMembersHash copy(String channelType, String channelId, int offset, int limit, FilterObject filter, QuerySorter<Member> sort, List<Member> members) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        AbstractC22676k.m65750j(members, "members");
        return new QueryMembersHash(channelType, channelId, offset, limit, filter, sort, members);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryMembersHash)) {
            return false;
        }
        QueryMembersHash queryMembersHash = (QueryMembersHash) other;
        return AbstractC22676k.m65745e(this.channelType, queryMembersHash.channelType) && AbstractC22676k.m65745e(this.channelId, queryMembersHash.channelId) && this.offset == queryMembersHash.offset && this.limit == queryMembersHash.limit && AbstractC22676k.m65745e(this.filter, queryMembersHash.filter) && AbstractC22676k.m65745e(this.sort, queryMembersHash.sort) && AbstractC22676k.m65745e(this.members, queryMembersHash.members);
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final String getChannelType() {
        return this.channelType;
    }

    public final FilterObject getFilter() {
        return this.filter;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final List<Member> getMembers() {
        return this.members;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final QuerySorter<Member> getSort() {
        return this.sort;
    }

    public final int hashCode() {
        return this.members.hashCode() + ((this.sort.hashCode() + ((this.filter.hashCode() + AbstractC11266d.m30448b(this.limit, AbstractC11266d.m30448b(this.offset, AbstractC11266d.m30450d(this.channelType.hashCode() * 31, 31, this.channelId), 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        String str = this.channelType;
        String str2 = this.channelId;
        int i13 = this.offset;
        int i14 = this.limit;
        FilterObject filterObject = this.filter;
        QuerySorter<Member> querySorter = this.sort;
        List<Member> list = this.members;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("QueryMembersHash(channelType=", str, ", channelId=", str2, ", offset=");
        AbstractC30802r.m94773v(sbM32001t, i13, ", limit=", i14, ", filter=");
        sbM32001t.append(filterObject);
        sbM32001t.append(", sort=");
        sbM32001t.append(querySorter);
        sbM32001t.append(", members=");
        return AbstractC3855a.m11829m(sbM32001t, list, ")");
    }
}
