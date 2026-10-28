package io.getstream.chat.android.client.api2.model.requests;

import com.mapbox.maps.MapboxMap;
import ih0.AbstractC18489d0;
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
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00020\u0001BI\u0012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00030\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u0017\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u001b\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00030\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JU\u0010\u001c\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00030\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\tHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R#\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/QueryUsersRequest;", "", "filter_conditions", "", MapboxMap.QFE_OFFSET, "", MapboxMap.QFE_LIMIT, "sort", "", "", "presence", "", "<init>", "(Ljava/util/Map;IILjava/util/List;Z)V", "getFilter_conditions", "()Ljava/util/Map;", "getOffset", "()I", "getLimit", "getSort", "()Ljava/util/List;", "getPresence", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class QueryUsersRequest {
    private final Map<?, ?> filter_conditions;
    private final int limit;
    private final int offset;
    private final boolean presence;
    private final List<Map<String, Object>> sort;

    /* JADX WARN: Multi-variable type inference failed */
    public QueryUsersRequest(Map<?, ?> filter_conditions, int i13, int i14, List<? extends Map<String, ? extends Object>> sort, boolean z4) {
        AbstractC22676k.m65750j(filter_conditions, "filter_conditions");
        AbstractC22676k.m65750j(sort, "sort");
        this.filter_conditions = filter_conditions;
        this.offset = i13;
        this.limit = i14;
        this.sort = sort;
        this.presence = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryUsersRequest copy$default(QueryUsersRequest queryUsersRequest, Map map, int i13, int i14, List list, boolean z4, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            map = queryUsersRequest.filter_conditions;
        }
        if ((i15 & 2) != 0) {
            i13 = queryUsersRequest.offset;
        }
        if ((i15 & 4) != 0) {
            i14 = queryUsersRequest.limit;
        }
        if ((i15 & 8) != 0) {
            list = queryUsersRequest.sort;
        }
        if ((i15 & 16) != 0) {
            z4 = queryUsersRequest.presence;
        }
        boolean z13 = z4;
        int i16 = i14;
        return queryUsersRequest.copy(map, i13, i16, list, z13);
    }

    public final Map<?, ?> component1() {
        return this.filter_conditions;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    public final List<Map<String, Object>> component4() {
        return this.sort;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getPresence() {
        return this.presence;
    }

    public final QueryUsersRequest copy(Map<?, ?> filter_conditions, int offset, int limit, List<? extends Map<String, ? extends Object>> sort, boolean presence) {
        AbstractC22676k.m65750j(filter_conditions, "filter_conditions");
        AbstractC22676k.m65750j(sort, "sort");
        return new QueryUsersRequest(filter_conditions, offset, limit, sort, presence);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryUsersRequest)) {
            return false;
        }
        QueryUsersRequest queryUsersRequest = (QueryUsersRequest) other;
        return AbstractC22676k.m65745e(this.filter_conditions, queryUsersRequest.filter_conditions) && this.offset == queryUsersRequest.offset && this.limit == queryUsersRequest.limit && AbstractC22676k.m65745e(this.sort, queryUsersRequest.sort) && this.presence == queryUsersRequest.presence;
    }

    public final Map<?, ?> getFilter_conditions() {
        return this.filter_conditions;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final boolean getPresence() {
        return this.presence;
    }

    public final List<Map<String, Object>> getSort() {
        return this.sort;
    }

    public int hashCode() {
        return Boolean.hashCode(this.presence) + AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.limit, AbstractC11266d.m30448b(this.offset, this.filter_conditions.hashCode() * 31, 31), 31), 31, this.sort);
    }

    public String toString() {
        Map<?, ?> map = this.filter_conditions;
        int i13 = this.offset;
        int i14 = this.limit;
        List<Map<String, Object>> list = this.sort;
        boolean z4 = this.presence;
        StringBuilder sb4 = new StringBuilder("QueryUsersRequest(filter_conditions=");
        sb4.append(map);
        sb4.append(", offset=");
        sb4.append(i13);
        sb4.append(", limit=");
        sb4.append(i14);
        sb4.append(", sort=");
        sb4.append(list);
        sb4.append(", presence=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }
}
