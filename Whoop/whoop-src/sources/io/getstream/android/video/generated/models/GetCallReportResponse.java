package io.getstream.android.video.generated.models;

import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.List;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003JQ\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, m65681d2 = {"Lio/getstream/android/video/generated/models/GetCallReportResponse;", "", AttachmentExtensionsKt.EXTRA_DURATION, "", "sessionId", "report", "Lio/getstream/android/video/generated/models/ReportResponse;", "videoReactions", "", "Lio/getstream/android/video/generated/models/VideoReactionsResponse;", "chatActivity", "Lio/getstream/android/video/generated/models/ChatActivityStatsResponse;", "session", "Lio/getstream/android/video/generated/models/CallSessionResponse;", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/ReportResponse;Ljava/util/List;Lio/getstream/android/video/generated/models/ChatActivityStatsResponse;Lio/getstream/android/video/generated/models/CallSessionResponse;)V", "getChatActivity", "()Lio/getstream/android/video/generated/models/ChatActivityStatsResponse;", "getDuration", "()Ljava/lang/String;", "getReport", "()Lio/getstream/android/video/generated/models/ReportResponse;", "getSession", "()Lio/getstream/android/video/generated/models/CallSessionResponse;", "getSessionId", "getVideoReactions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class GetCallReportResponse {
    private final ChatActivityStatsResponse chatActivity;
    private final String duration;
    private final ReportResponse report;
    private final CallSessionResponse session;
    private final String sessionId;
    private final List<VideoReactionsResponse> videoReactions;

    public GetCallReportResponse(@InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = "session_id") String sessionId, @InterfaceC30731q(name = "report") ReportResponse report, @InterfaceC30731q(name = "video_reactions") List<VideoReactionsResponse> list, @InterfaceC30731q(name = "chat_activity") ChatActivityStatsResponse chatActivityStatsResponse, @InterfaceC30731q(name = "session") CallSessionResponse callSessionResponse) {
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(sessionId, "sessionId");
        AbstractC22676k.m65750j(report, "report");
        this.duration = duration;
        this.sessionId = sessionId;
        this.report = report;
        this.videoReactions = list;
        this.chatActivity = chatActivityStatsResponse;
        this.session = callSessionResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetCallReportResponse copy$default(GetCallReportResponse getCallReportResponse, String str, String str2, ReportResponse reportResponse, List list, ChatActivityStatsResponse chatActivityStatsResponse, CallSessionResponse callSessionResponse, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = getCallReportResponse.duration;
        }
        if ((i13 & 2) != 0) {
            str2 = getCallReportResponse.sessionId;
        }
        if ((i13 & 4) != 0) {
            reportResponse = getCallReportResponse.report;
        }
        if ((i13 & 8) != 0) {
            list = getCallReportResponse.videoReactions;
        }
        if ((i13 & 16) != 0) {
            chatActivityStatsResponse = getCallReportResponse.chatActivity;
        }
        if ((i13 & 32) != 0) {
            callSessionResponse = getCallReportResponse.session;
        }
        ChatActivityStatsResponse chatActivityStatsResponse2 = chatActivityStatsResponse;
        CallSessionResponse callSessionResponse2 = callSessionResponse;
        return getCallReportResponse.copy(str, str2, reportResponse, list, chatActivityStatsResponse2, callSessionResponse2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ReportResponse getReport() {
        return this.report;
    }

    public final List<VideoReactionsResponse> component4() {
        return this.videoReactions;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ChatActivityStatsResponse getChatActivity() {
        return this.chatActivity;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CallSessionResponse getSession() {
        return this.session;
    }

    public final GetCallReportResponse copy(@InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = "session_id") String sessionId, @InterfaceC30731q(name = "report") ReportResponse report, @InterfaceC30731q(name = "video_reactions") List<VideoReactionsResponse> videoReactions, @InterfaceC30731q(name = "chat_activity") ChatActivityStatsResponse chatActivity, @InterfaceC30731q(name = "session") CallSessionResponse session) {
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(sessionId, "sessionId");
        AbstractC22676k.m65750j(report, "report");
        return new GetCallReportResponse(duration, sessionId, report, videoReactions, chatActivity, session);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetCallReportResponse)) {
            return false;
        }
        GetCallReportResponse getCallReportResponse = (GetCallReportResponse) other;
        return AbstractC22676k.m65745e(this.duration, getCallReportResponse.duration) && AbstractC22676k.m65745e(this.sessionId, getCallReportResponse.sessionId) && AbstractC22676k.m65745e(this.report, getCallReportResponse.report) && AbstractC22676k.m65745e(this.videoReactions, getCallReportResponse.videoReactions) && AbstractC22676k.m65745e(this.chatActivity, getCallReportResponse.chatActivity) && AbstractC22676k.m65745e(this.session, getCallReportResponse.session);
    }

    public final ChatActivityStatsResponse getChatActivity() {
        return this.chatActivity;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final ReportResponse getReport() {
        return this.report;
    }

    public final CallSessionResponse getSession() {
        return this.session;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final List<VideoReactionsResponse> getVideoReactions() {
        return this.videoReactions;
    }

    public int hashCode() {
        int iHashCode = (this.report.hashCode() + AbstractC11266d.m30450d(this.duration.hashCode() * 31, 31, this.sessionId)) * 31;
        List<VideoReactionsResponse> list = this.videoReactions;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        ChatActivityStatsResponse chatActivityStatsResponse = this.chatActivity;
        int iHashCode3 = (iHashCode2 + (chatActivityStatsResponse == null ? 0 : chatActivityStatsResponse.hashCode())) * 31;
        CallSessionResponse callSessionResponse = this.session;
        return iHashCode3 + (callSessionResponse != null ? callSessionResponse.hashCode() : 0);
    }

    public String toString() {
        String str = this.duration;
        String str2 = this.sessionId;
        ReportResponse reportResponse = this.report;
        List<VideoReactionsResponse> list = this.videoReactions;
        ChatActivityStatsResponse chatActivityStatsResponse = this.chatActivity;
        CallSessionResponse callSessionResponse = this.session;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("GetCallReportResponse(duration=", str, ", sessionId=", str2, ", report=");
        sbM32001t.append(reportResponse);
        sbM32001t.append(", videoReactions=");
        sbM32001t.append(list);
        sbM32001t.append(", chatActivity=");
        sbM32001t.append(chatActivityStatsResponse);
        sbM32001t.append(", session=");
        sbM32001t.append(callSessionResponse);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ GetCallReportResponse(String str, String str2, ReportResponse reportResponse, List list, ChatActivityStatsResponse chatActivityStatsResponse, CallSessionResponse callSessionResponse, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, reportResponse, (i13 & 8) != 0 ? C25271y.f99162w : list, (i13 & 16) != 0 ? null : chatActivityStatsResponse, (i13 & 32) != 0 ? null : callSessionResponse);
    }
}
