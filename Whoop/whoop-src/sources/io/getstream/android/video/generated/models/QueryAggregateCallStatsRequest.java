package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import java.util.List;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J3\u0010\u0010\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/android/video/generated/models/QueryAggregateCallStatsRequest;", "", "from", "", "to", "reportTypes", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getFrom", "()Ljava/lang/String;", "getReportTypes", "()Ljava/util/List;", "getTo", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class QueryAggregateCallStatsRequest {
    private final String from;
    private final List<String> reportTypes;
    private final String to;

    public QueryAggregateCallStatsRequest() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryAggregateCallStatsRequest copy$default(QueryAggregateCallStatsRequest queryAggregateCallStatsRequest, String str, String str2, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = queryAggregateCallStatsRequest.from;
        }
        if ((i13 & 2) != 0) {
            str2 = queryAggregateCallStatsRequest.to;
        }
        if ((i13 & 4) != 0) {
            list = queryAggregateCallStatsRequest.reportTypes;
        }
        return queryAggregateCallStatsRequest.copy(str, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTo() {
        return this.to;
    }

    public final List<String> component3() {
        return this.reportTypes;
    }

    public final QueryAggregateCallStatsRequest copy(@InterfaceC30731q(name = "from") String from, @InterfaceC30731q(name = "to") String to3, @InterfaceC30731q(name = "report_types") List<String> reportTypes) {
        return new QueryAggregateCallStatsRequest(from, to3, reportTypes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryAggregateCallStatsRequest)) {
            return false;
        }
        QueryAggregateCallStatsRequest queryAggregateCallStatsRequest = (QueryAggregateCallStatsRequest) other;
        return AbstractC22676k.m65745e(this.from, queryAggregateCallStatsRequest.from) && AbstractC22676k.m65745e(this.to, queryAggregateCallStatsRequest.to) && AbstractC22676k.m65745e(this.reportTypes, queryAggregateCallStatsRequest.reportTypes);
    }

    public final String getFrom() {
        return this.from;
    }

    public final List<String> getReportTypes() {
        return this.reportTypes;
    }

    public final String getTo() {
        return this.to;
    }

    public int hashCode() {
        String str = this.from;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.to;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.reportTypes;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.from;
        String str2 = this.to;
        return AbstractC3855a.m11829m(AbstractC11895b.m32001t("QueryAggregateCallStatsRequest(from=", str, ", to=", str2, ", reportTypes="), this.reportTypes, ")");
    }

    public QueryAggregateCallStatsRequest(@InterfaceC30731q(name = "from") String str, @InterfaceC30731q(name = "to") String str2, @InterfaceC30731q(name = "report_types") List<String> list) {
        this.from = str;
        this.to = str2;
        this.reportTypes = list;
    }

    public /* synthetic */ QueryAggregateCallStatsRequest(String str, String str2, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? C25271y.f99162w : list);
    }
}
