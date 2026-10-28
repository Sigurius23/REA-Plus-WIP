package io.getstream.chat.android.client.api2.model.requests;

import c13.AbstractC3855a;
import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.api2.model.dto.UpstreamMemberDto;
import java.util.List;
import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00060\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\u001b\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00060\u000bHÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\u000bHÆ\u0003Jo\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00060\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u000bHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\bHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0019\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00060\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019¨\u0006("}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/QueryMembersRequest;", "", "type", "", "id", "filter_conditions", "", MapboxMap.QFE_OFFSET, "", MapboxMap.QFE_LIMIT, "sort", "", io.getstream.chat.android.client.api.models.QueryChannelRequest.KEY_MEMBERS, "Lio/getstream/chat/android/client/api2/model/dto/UpstreamMemberDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;IILjava/util/List;Ljava/util/List;)V", "getType", "()Ljava/lang/String;", "getId", "getFilter_conditions", "()Ljava/util/Map;", "getOffset", "()I", "getLimit", "getSort", "()Ljava/util/List;", "getMembers", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class QueryMembersRequest {
    private final Map<?, ?> filter_conditions;
    private final String id;
    private final int limit;
    private final List<UpstreamMemberDto> members;
    private final int offset;
    private final List<Map<String, Object>> sort;
    private final String type;

    /* JADX WARN: Multi-variable type inference failed */
    public QueryMembersRequest(String type, String id4, Map<?, ?> filter_conditions, int i13, int i14, List<? extends Map<String, ? extends Object>> sort, List<UpstreamMemberDto> members) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(filter_conditions, "filter_conditions");
        AbstractC22676k.m65750j(sort, "sort");
        AbstractC22676k.m65750j(members, "members");
        this.type = type;
        this.id = id4;
        this.filter_conditions = filter_conditions;
        this.offset = i13;
        this.limit = i14;
        this.sort = sort;
        this.members = members;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryMembersRequest copy$default(QueryMembersRequest queryMembersRequest, String str, String str2, Map map, int i13, int i14, List list, List list2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = queryMembersRequest.type;
        }
        if ((i15 & 2) != 0) {
            str2 = queryMembersRequest.id;
        }
        if ((i15 & 4) != 0) {
            map = queryMembersRequest.filter_conditions;
        }
        if ((i15 & 8) != 0) {
            i13 = queryMembersRequest.offset;
        }
        if ((i15 & 16) != 0) {
            i14 = queryMembersRequest.limit;
        }
        if ((i15 & 32) != 0) {
            list = queryMembersRequest.sort;
        }
        if ((i15 & 64) != 0) {
            list2 = queryMembersRequest.members;
        }
        List list3 = list;
        List list4 = list2;
        int i16 = i14;
        Map map2 = map;
        return queryMembersRequest.copy(str, str2, map2, i13, i16, list3, list4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final Map<?, ?> component3() {
        return this.filter_conditions;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    public final List<Map<String, Object>> component6() {
        return this.sort;
    }

    public final List<UpstreamMemberDto> component7() {
        return this.members;
    }

    public final QueryMembersRequest copy(String type, String id4, Map<?, ?> filter_conditions, int offset, int limit, List<? extends Map<String, ? extends Object>> sort, List<UpstreamMemberDto> members) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(filter_conditions, "filter_conditions");
        AbstractC22676k.m65750j(sort, "sort");
        AbstractC22676k.m65750j(members, "members");
        return new QueryMembersRequest(type, id4, filter_conditions, offset, limit, sort, members);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryMembersRequest)) {
            return false;
        }
        QueryMembersRequest queryMembersRequest = (QueryMembersRequest) other;
        return AbstractC22676k.m65745e(this.type, queryMembersRequest.type) && AbstractC22676k.m65745e(this.id, queryMembersRequest.id) && AbstractC22676k.m65745e(this.filter_conditions, queryMembersRequest.filter_conditions) && this.offset == queryMembersRequest.offset && this.limit == queryMembersRequest.limit && AbstractC22676k.m65745e(this.sort, queryMembersRequest.sort) && AbstractC22676k.m65745e(this.members, queryMembersRequest.members);
    }

    public final Map<?, ?> getFilter_conditions() {
        return this.filter_conditions;
    }

    public final String getId() {
        return this.id;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final List<UpstreamMemberDto> getMembers() {
        return this.members;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final List<Map<String, Object>> getSort() {
        return this.sort;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.members.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.limit, AbstractC11266d.m30448b(this.offset, AbstractC3855a.m11821e(this.filter_conditions, AbstractC11266d.m30450d(this.type.hashCode() * 31, 31, this.id), 31), 31), 31), 31, this.sort);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.id;
        Map<?, ?> map = this.filter_conditions;
        int i13 = this.offset;
        int i14 = this.limit;
        List<Map<String, Object>> list = this.sort;
        List<UpstreamMemberDto> list2 = this.members;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("QueryMembersRequest(type=", str, ", id=", str2, ", filter_conditions=");
        sbM32001t.append(map);
        sbM32001t.append(", offset=");
        sbM32001t.append(i13);
        sbM32001t.append(", limit=");
        sbM32001t.append(i14);
        sbM32001t.append(", sort=");
        sbM32001t.append(list);
        sbM32001t.append(", members=");
        return AbstractC3855a.m11829m(sbM32001t, list2, ")");
    }
}
