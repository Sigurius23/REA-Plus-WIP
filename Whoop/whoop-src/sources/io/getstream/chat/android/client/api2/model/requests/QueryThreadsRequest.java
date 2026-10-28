package io.getstream.chat.android.client.api2.model.requests;

import androidx.core.app.FrameMetricsAggregator;
import com.mapbox.maps.MapboxMap;
import ih0.AbstractC18489d0;
import java.util.List;
import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b$\b\u0081\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0003\u0012\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0003\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010 \u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0003HÆ\u0003J\u001d\u0010!\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0003\u0018\u00010\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\u0085\u0001\u0010)\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00032\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0003\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000f\u001a\u00020\nHÆ\u0001J\u0013\u0010*\u001a\u00020\b2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\nHÖ\u0001J\t\u0010-\u001a\u00020\u0006HÖ\u0001R\u001b\u0010\u0002\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R%\u0010\u0004\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019¨\u0006."}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/QueryThreadsRequest;", "", "filter", "", "sort", "", "", "watch", "", MapboxMap.QFE_LIMIT, "", "member_limit", "next", "participant_limit", "prev", "reply_limit", "<init>", "(Ljava/util/Map;Ljava/util/List;ZIILjava/lang/String;ILjava/lang/String;I)V", "getFilter", "()Ljava/util/Map;", "getSort", "()Ljava/util/List;", "getWatch", "()Z", "getLimit", "()I", "getMember_limit", "getNext", "()Ljava/lang/String;", "getParticipant_limit", "getPrev", "getReply_limit", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class QueryThreadsRequest {
    private final Map<?, ?> filter;
    private final int limit;
    private final int member_limit;
    private final String next;
    private final int participant_limit;
    private final String prev;
    private final int reply_limit;
    private final List<Map<String, Object>> sort;
    private final boolean watch;

    public QueryThreadsRequest() {
        this(null, null, false, 0, 0, null, 0, null, 0, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryThreadsRequest copy$default(QueryThreadsRequest queryThreadsRequest, Map map, List list, boolean z4, int i13, int i14, String str, int i15, String str2, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            map = queryThreadsRequest.filter;
        }
        if ((i17 & 2) != 0) {
            list = queryThreadsRequest.sort;
        }
        if ((i17 & 4) != 0) {
            z4 = queryThreadsRequest.watch;
        }
        if ((i17 & 8) != 0) {
            i13 = queryThreadsRequest.limit;
        }
        if ((i17 & 16) != 0) {
            i14 = queryThreadsRequest.member_limit;
        }
        if ((i17 & 32) != 0) {
            str = queryThreadsRequest.next;
        }
        if ((i17 & 64) != 0) {
            i15 = queryThreadsRequest.participant_limit;
        }
        if ((i17 & 128) != 0) {
            str2 = queryThreadsRequest.prev;
        }
        if ((i17 & 256) != 0) {
            i16 = queryThreadsRequest.reply_limit;
        }
        String str3 = str2;
        int i18 = i16;
        String str4 = str;
        int i19 = i15;
        int i24 = i14;
        boolean z13 = z4;
        return queryThreadsRequest.copy(map, list, z13, i13, i24, str4, i19, str3, i18);
    }

    public final Map<?, ?> component1() {
        return this.filter;
    }

    public final List<Map<String, Object>> component2() {
        return this.sort;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getWatch() {
        return this.watch;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMember_limit() {
        return this.member_limit;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getParticipant_limit() {
        return this.participant_limit;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPrev() {
        return this.prev;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getReply_limit() {
        return this.reply_limit;
    }

    public final QueryThreadsRequest copy(Map<?, ?> filter, List<? extends Map<String, ? extends Object>> sort, boolean watch, int limit, int member_limit, String next, int participant_limit, String prev, int reply_limit) {
        return new QueryThreadsRequest(filter, sort, watch, limit, member_limit, next, participant_limit, prev, reply_limit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryThreadsRequest)) {
            return false;
        }
        QueryThreadsRequest queryThreadsRequest = (QueryThreadsRequest) other;
        return AbstractC22676k.m65745e(this.filter, queryThreadsRequest.filter) && AbstractC22676k.m65745e(this.sort, queryThreadsRequest.sort) && this.watch == queryThreadsRequest.watch && this.limit == queryThreadsRequest.limit && this.member_limit == queryThreadsRequest.member_limit && AbstractC22676k.m65745e(this.next, queryThreadsRequest.next) && this.participant_limit == queryThreadsRequest.participant_limit && AbstractC22676k.m65745e(this.prev, queryThreadsRequest.prev) && this.reply_limit == queryThreadsRequest.reply_limit;
    }

    public final Map<?, ?> getFilter() {
        return this.filter;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final int getMember_limit() {
        return this.member_limit;
    }

    public final String getNext() {
        return this.next;
    }

    public final int getParticipant_limit() {
        return this.participant_limit;
    }

    public final String getPrev() {
        return this.prev;
    }

    public final int getReply_limit() {
        return this.reply_limit;
    }

    public final List<Map<String, Object>> getSort() {
        return this.sort;
    }

    public final boolean getWatch() {
        return this.watch;
    }

    public int hashCode() {
        Map<?, ?> map = this.filter;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        List<Map<String, Object>> list = this.sort;
        int iM30448b = AbstractC11266d.m30448b(this.member_limit, AbstractC11266d.m30448b(this.limit, AbstractC2875y.m8289b((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.watch), 31), 31);
        String str = this.next;
        int iM30448b2 = AbstractC11266d.m30448b(this.participant_limit, (iM30448b + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.prev;
        return Integer.hashCode(this.reply_limit) + ((iM30448b2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        Map<?, ?> map = this.filter;
        List<Map<String, Object>> list = this.sort;
        boolean z4 = this.watch;
        int i13 = this.limit;
        int i14 = this.member_limit;
        String str = this.next;
        int i15 = this.participant_limit;
        String str2 = this.prev;
        int i16 = this.reply_limit;
        StringBuilder sb4 = new StringBuilder("QueryThreadsRequest(filter=");
        sb4.append(map);
        sb4.append(", sort=");
        sb4.append(list);
        sb4.append(", watch=");
        AbstractC30802r.m94769r(i13, ", limit=", ", member_limit=", sb4, z4);
        AbstractC11895b.m31979B(i14, ", next=", str, ", participant_limit=", sb4);
        AbstractC11895b.m31979B(i15, ", prev=", str2, ", reply_limit=", sb4);
        return AbstractC18489d0.m53371l(sb4, i16, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QueryThreadsRequest(Map<?, ?> map, List<? extends Map<String, ? extends Object>> list, boolean z4, int i13, int i14, String str, int i15, String str2, int i16) {
        this.filter = map;
        this.sort = list;
        this.watch = z4;
        this.limit = i13;
        this.member_limit = i14;
        this.next = str;
        this.participant_limit = i15;
        this.prev = str2;
        this.reply_limit = i16;
    }

    public /* synthetic */ QueryThreadsRequest(Map map, List list, boolean z4, int i13, int i14, String str, int i15, String str2, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this((i17 & 1) != 0 ? null : map, (i17 & 2) != 0 ? null : list, (i17 & 4) != 0 ? true : z4, (i17 & 8) != 0 ? 10 : i13, (i17 & 16) != 0 ? 100 : i14, (i17 & 32) != 0 ? null : str, (i17 & 64) != 0 ? 100 : i15, (i17 & 128) != 0 ? null : str2, (i17 & 256) != 0 ? 2 : i16);
    }
}
