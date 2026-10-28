package io.getstream.chat.android.client.api2.model.requests;

import com.mapbox.maps.MapboxMap;
import java.util.List;
import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00030\t¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u0014\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u001b\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00030\tHÆ\u0003JM\u0010\u0018\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00030\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R#\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/QueryRemindersRequest;", "", "filter", "", MapboxMap.QFE_LIMIT, "", "next", "", "sort", "", "<init>", "(Ljava/util/Map;ILjava/lang/String;Ljava/util/List;)V", "getFilter", "()Ljava/util/Map;", "getLimit", "()I", "getNext", "()Ljava/lang/String;", "getSort", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class QueryRemindersRequest {
    private final Map<?, ?> filter;
    private final int limit;
    private final String next;
    private final List<Map<String, Object>> sort;

    /* JADX WARN: Multi-variable type inference failed */
    public QueryRemindersRequest(Map<?, ?> filter, int i13, String str, List<? extends Map<String, ? extends Object>> sort) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        this.filter = filter;
        this.limit = i13;
        this.next = str;
        this.sort = sort;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryRemindersRequest copy$default(QueryRemindersRequest queryRemindersRequest, Map map, int i13, String str, List list, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            map = queryRemindersRequest.filter;
        }
        if ((i14 & 2) != 0) {
            i13 = queryRemindersRequest.limit;
        }
        if ((i14 & 4) != 0) {
            str = queryRemindersRequest.next;
        }
        if ((i14 & 8) != 0) {
            list = queryRemindersRequest.sort;
        }
        return queryRemindersRequest.copy(map, i13, str, list);
    }

    public final Map<?, ?> component1() {
        return this.filter;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    public final List<Map<String, Object>> component4() {
        return this.sort;
    }

    public final QueryRemindersRequest copy(Map<?, ?> filter, int limit, String next, List<? extends Map<String, ? extends Object>> sort) {
        AbstractC22676k.m65750j(filter, "filter");
        AbstractC22676k.m65750j(sort, "sort");
        return new QueryRemindersRequest(filter, limit, next, sort);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryRemindersRequest)) {
            return false;
        }
        QueryRemindersRequest queryRemindersRequest = (QueryRemindersRequest) other;
        return AbstractC22676k.m65745e(this.filter, queryRemindersRequest.filter) && this.limit == queryRemindersRequest.limit && AbstractC22676k.m65745e(this.next, queryRemindersRequest.next) && AbstractC22676k.m65745e(this.sort, queryRemindersRequest.sort);
    }

    public final Map<?, ?> getFilter() {
        return this.filter;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final String getNext() {
        return this.next;
    }

    public final List<Map<String, Object>> getSort() {
        return this.sort;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.limit, this.filter.hashCode() * 31, 31);
        String str = this.next;
        return this.sort.hashCode() + ((iM30448b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        Map<?, ?> map = this.filter;
        int i13 = this.limit;
        String str = this.next;
        List<Map<String, Object>> list = this.sort;
        StringBuilder sb4 = new StringBuilder("QueryRemindersRequest(filter=");
        sb4.append(map);
        sb4.append(", limit=");
        sb4.append(i13);
        sb4.append(", next=");
        return AbstractC30007c.m91840j(str, ", sort=", ")", sb4, list);
    }
}
