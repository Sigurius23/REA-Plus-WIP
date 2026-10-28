package io.getstream.android.video.generated.models;

import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.List;
import m83.C25271y;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/android/video/generated/models/QueryCallStatsResponse;", "", AttachmentExtensionsKt.EXTRA_DURATION, "", "reports", "", "Lio/getstream/android/video/generated/models/CallStatsReportSummaryResponse;", "next", "prev", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getDuration", "()Ljava/lang/String;", "getNext", "getPrev", "getReports", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class QueryCallStatsResponse {
    private final String duration;
    private final String next;
    private final String prev;
    private final List<CallStatsReportSummaryResponse> reports;

    public QueryCallStatsResponse(@InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = "reports") List<CallStatsReportSummaryResponse> reports, @InterfaceC30731q(name = "next") String str, @InterfaceC30731q(name = "prev") String str2) {
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(reports, "reports");
        this.duration = duration;
        this.reports = reports;
        this.next = str;
        this.prev = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryCallStatsResponse copy$default(QueryCallStatsResponse queryCallStatsResponse, String str, List list, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = queryCallStatsResponse.duration;
        }
        if ((i13 & 2) != 0) {
            list = queryCallStatsResponse.reports;
        }
        if ((i13 & 4) != 0) {
            str2 = queryCallStatsResponse.next;
        }
        if ((i13 & 8) != 0) {
            str3 = queryCallStatsResponse.prev;
        }
        return queryCallStatsResponse.copy(str, list, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    public final List<CallStatsReportSummaryResponse> component2() {
        return this.reports;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPrev() {
        return this.prev;
    }

    public final QueryCallStatsResponse copy(@InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = "reports") List<CallStatsReportSummaryResponse> reports, @InterfaceC30731q(name = "next") String next, @InterfaceC30731q(name = "prev") String prev) {
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(reports, "reports");
        return new QueryCallStatsResponse(duration, reports, next, prev);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryCallStatsResponse)) {
            return false;
        }
        QueryCallStatsResponse queryCallStatsResponse = (QueryCallStatsResponse) other;
        return AbstractC22676k.m65745e(this.duration, queryCallStatsResponse.duration) && AbstractC22676k.m65745e(this.reports, queryCallStatsResponse.reports) && AbstractC22676k.m65745e(this.next, queryCallStatsResponse.next) && AbstractC22676k.m65745e(this.prev, queryCallStatsResponse.prev);
    }

    public final String getDuration() {
        return this.duration;
    }

    public final String getNext() {
        return this.next;
    }

    public final String getPrev() {
        return this.prev;
    }

    public final List<CallStatsReportSummaryResponse> getReports() {
        return this.reports;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.duration.hashCode() * 31, 31, this.reports);
        String str = this.next;
        int iHashCode = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.prev;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.duration;
        List<CallStatsReportSummaryResponse> list = this.reports;
        return AbstractC11266d.m30464r(AbstractC30802r.m94766o("QueryCallStatsResponse(duration=", str, ", reports=", ", next=", list), this.next, ", prev=", this.prev, ")");
    }

    public /* synthetic */ QueryCallStatsResponse(String str, List list, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3);
    }
}
