package io.getstream.android.video.generated.models;

import com.mapbox.common.HttpHeaders;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m65681d2 = {"Lio/getstream/android/video/generated/models/DailyAggregateCallParticipantCountReportResponse;", "", HttpHeaders.DATE, "", "report", "Lio/getstream/android/video/generated/models/CallParticipantCountReport;", "(Ljava/lang/String;Lio/getstream/android/video/generated/models/CallParticipantCountReport;)V", "getDate", "()Ljava/lang/String;", "getReport", "()Lio/getstream/android/video/generated/models/CallParticipantCountReport;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class DailyAggregateCallParticipantCountReportResponse {
    private final String date;
    private final CallParticipantCountReport report;

    public DailyAggregateCallParticipantCountReportResponse(@InterfaceC30731q(name = HttpHeaders.DATE) String date, @InterfaceC30731q(name = "report") CallParticipantCountReport report) {
        AbstractC22676k.m65750j(date, "date");
        AbstractC22676k.m65750j(report, "report");
        this.date = date;
        this.report = report;
    }

    public static /* synthetic */ DailyAggregateCallParticipantCountReportResponse copy$default(DailyAggregateCallParticipantCountReportResponse dailyAggregateCallParticipantCountReportResponse, String str, CallParticipantCountReport callParticipantCountReport, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = dailyAggregateCallParticipantCountReportResponse.date;
        }
        if ((i13 & 2) != 0) {
            callParticipantCountReport = dailyAggregateCallParticipantCountReportResponse.report;
        }
        return dailyAggregateCallParticipantCountReportResponse.copy(str, callParticipantCountReport);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CallParticipantCountReport getReport() {
        return this.report;
    }

    public final DailyAggregateCallParticipantCountReportResponse copy(@InterfaceC30731q(name = HttpHeaders.DATE) String date, @InterfaceC30731q(name = "report") CallParticipantCountReport report) {
        AbstractC22676k.m65750j(date, "date");
        AbstractC22676k.m65750j(report, "report");
        return new DailyAggregateCallParticipantCountReportResponse(date, report);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyAggregateCallParticipantCountReportResponse)) {
            return false;
        }
        DailyAggregateCallParticipantCountReportResponse dailyAggregateCallParticipantCountReportResponse = (DailyAggregateCallParticipantCountReportResponse) other;
        return AbstractC22676k.m65745e(this.date, dailyAggregateCallParticipantCountReportResponse.date) && AbstractC22676k.m65745e(this.report, dailyAggregateCallParticipantCountReportResponse.report);
    }

    public final String getDate() {
        return this.date;
    }

    public final CallParticipantCountReport getReport() {
        return this.report;
    }

    public int hashCode() {
        return this.report.hashCode() + (this.date.hashCode() * 31);
    }

    public String toString() {
        return "DailyAggregateCallParticipantCountReportResponse(date=" + this.date + ", report=" + this.report + ")";
    }
}
