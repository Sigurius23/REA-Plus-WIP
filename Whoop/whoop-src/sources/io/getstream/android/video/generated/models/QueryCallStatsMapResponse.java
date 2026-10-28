package io.getstream.android.video.generated.models;

import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import jg3.C21682i;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010 J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010 J\u0012\u0010&\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b*\u0010+J®\u0001\u0010,\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u0019J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b9\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b:\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b<\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\b>\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b?\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b@\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\bA\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\bB\u0010 R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\bC\u0010 R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010D\u001a\u0004\bE\u0010'R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010F\u001a\u0004\bG\u0010)R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010H\u001a\u0004\bI\u0010+¨\u0006J"}, m65681d2 = {"Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;", "", "", "callId", "callSessionId", "callType", AttachmentExtensionsKt.EXTRA_DURATION, "Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;", "counts", "Ljg3/i;", "callEndedAt", "callStartedAt", "dataSource", "endTime", "generatedAt", "startTime", "Lio/getstream/android/video/generated/models/CallStatsMapPublishers;", "publishers", "Lio/getstream/android/video/generated/models/CallStatsMapSFUs;", "sfus", "Lio/getstream/android/video/generated/models/CallStatsMapSubscribers;", "subscribers", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljg3/i;Ljg3/i;Ljg3/i;Lio/getstream/android/video/generated/models/CallStatsMapPublishers;Lio/getstream/android/video/generated/models/CallStatsMapSFUs;Lio/getstream/android/video/generated/models/CallStatsMapSubscribers;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;", "component6", "()Ljg3/i;", "component7", "component8", "component9", "component10", "component11", "component12", "()Lio/getstream/android/video/generated/models/CallStatsMapPublishers;", "component13", "()Lio/getstream/android/video/generated/models/CallStatsMapSFUs;", "component14", "()Lio/getstream/android/video/generated/models/CallStatsMapSubscribers;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljg3/i;Ljg3/i;Ljg3/i;Lio/getstream/android/video/generated/models/CallStatsMapPublishers;Lio/getstream/android/video/generated/models/CallStatsMapSFUs;Lio/getstream/android/video/generated/models/CallStatsMapSubscribers;)Lio/getstream/android/video/generated/models/QueryCallStatsMapResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallId", "getCallSessionId", "getCallType", "getDuration", "Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;", "getCounts", "Ljg3/i;", "getCallEndedAt", "getCallStartedAt", "getDataSource", "getEndTime", "getGeneratedAt", "getStartTime", "Lio/getstream/android/video/generated/models/CallStatsMapPublishers;", "getPublishers", "Lio/getstream/android/video/generated/models/CallStatsMapSFUs;", "getSfus", "Lio/getstream/android/video/generated/models/CallStatsMapSubscribers;", "getSubscribers", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class QueryCallStatsMapResponse {
    private final C21682i callEndedAt;
    private final String callId;
    private final String callSessionId;
    private final C21682i callStartedAt;
    private final String callType;
    private final CallStatsParticipantCounts counts;
    private final String dataSource;
    private final String duration;
    private final C21682i endTime;
    private final C21682i generatedAt;
    private final CallStatsMapPublishers publishers;
    private final CallStatsMapSFUs sfus;
    private final C21682i startTime;
    private final CallStatsMapSubscribers subscribers;

    public QueryCallStatsMapResponse(@InterfaceC30731q(name = "call_id") String callId, @InterfaceC30731q(name = "call_session_id") String callSessionId, @InterfaceC30731q(name = "call_type") String callType, @InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = "counts") CallStatsParticipantCounts counts, @InterfaceC30731q(name = "call_ended_at") C21682i c21682i, @InterfaceC30731q(name = "call_started_at") C21682i c21682i2, @InterfaceC30731q(name = "data_source") String str, @InterfaceC30731q(name = "end_time") C21682i c21682i3, @InterfaceC30731q(name = "generated_at") C21682i c21682i4, @InterfaceC30731q(name = "start_time") C21682i c21682i5, @InterfaceC30731q(name = "publishers") CallStatsMapPublishers callStatsMapPublishers, @InterfaceC30731q(name = "sfus") CallStatsMapSFUs callStatsMapSFUs, @InterfaceC30731q(name = "subscribers") CallStatsMapSubscribers callStatsMapSubscribers) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(callSessionId, "callSessionId");
        AbstractC22676k.m65750j(callType, "callType");
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(counts, "counts");
        this.callId = callId;
        this.callSessionId = callSessionId;
        this.callType = callType;
        this.duration = duration;
        this.counts = counts;
        this.callEndedAt = c21682i;
        this.callStartedAt = c21682i2;
        this.dataSource = str;
        this.endTime = c21682i3;
        this.generatedAt = c21682i4;
        this.startTime = c21682i5;
        this.publishers = callStatsMapPublishers;
        this.sfus = callStatsMapSFUs;
        this.subscribers = callStatsMapSubscribers;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final C21682i getGeneratedAt() {
        return this.generatedAt;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final C21682i getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final CallStatsMapPublishers getPublishers() {
        return this.publishers;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final CallStatsMapSFUs getSfus() {
        return this.sfus;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final CallStatsMapSubscribers getSubscribers() {
        return this.subscribers;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCallSessionId() {
        return this.callSessionId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCallType() {
        return this.callType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CallStatsParticipantCounts getCounts() {
        return this.counts;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final C21682i getCallEndedAt() {
        return this.callEndedAt;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final C21682i getCallStartedAt() {
        return this.callStartedAt;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDataSource() {
        return this.dataSource;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final C21682i getEndTime() {
        return this.endTime;
    }

    public final QueryCallStatsMapResponse copy(@InterfaceC30731q(name = "call_id") String callId, @InterfaceC30731q(name = "call_session_id") String callSessionId, @InterfaceC30731q(name = "call_type") String callType, @InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = "counts") CallStatsParticipantCounts counts, @InterfaceC30731q(name = "call_ended_at") C21682i callEndedAt, @InterfaceC30731q(name = "call_started_at") C21682i callStartedAt, @InterfaceC30731q(name = "data_source") String dataSource, @InterfaceC30731q(name = "end_time") C21682i endTime, @InterfaceC30731q(name = "generated_at") C21682i generatedAt, @InterfaceC30731q(name = "start_time") C21682i startTime, @InterfaceC30731q(name = "publishers") CallStatsMapPublishers publishers, @InterfaceC30731q(name = "sfus") CallStatsMapSFUs sfus, @InterfaceC30731q(name = "subscribers") CallStatsMapSubscribers subscribers) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(callSessionId, "callSessionId");
        AbstractC22676k.m65750j(callType, "callType");
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(counts, "counts");
        return new QueryCallStatsMapResponse(callId, callSessionId, callType, duration, counts, callEndedAt, callStartedAt, dataSource, endTime, generatedAt, startTime, publishers, sfus, subscribers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryCallStatsMapResponse)) {
            return false;
        }
        QueryCallStatsMapResponse queryCallStatsMapResponse = (QueryCallStatsMapResponse) other;
        return AbstractC22676k.m65745e(this.callId, queryCallStatsMapResponse.callId) && AbstractC22676k.m65745e(this.callSessionId, queryCallStatsMapResponse.callSessionId) && AbstractC22676k.m65745e(this.callType, queryCallStatsMapResponse.callType) && AbstractC22676k.m65745e(this.duration, queryCallStatsMapResponse.duration) && AbstractC22676k.m65745e(this.counts, queryCallStatsMapResponse.counts) && AbstractC22676k.m65745e(this.callEndedAt, queryCallStatsMapResponse.callEndedAt) && AbstractC22676k.m65745e(this.callStartedAt, queryCallStatsMapResponse.callStartedAt) && AbstractC22676k.m65745e(this.dataSource, queryCallStatsMapResponse.dataSource) && AbstractC22676k.m65745e(this.endTime, queryCallStatsMapResponse.endTime) && AbstractC22676k.m65745e(this.generatedAt, queryCallStatsMapResponse.generatedAt) && AbstractC22676k.m65745e(this.startTime, queryCallStatsMapResponse.startTime) && AbstractC22676k.m65745e(this.publishers, queryCallStatsMapResponse.publishers) && AbstractC22676k.m65745e(this.sfus, queryCallStatsMapResponse.sfus) && AbstractC22676k.m65745e(this.subscribers, queryCallStatsMapResponse.subscribers);
    }

    public final C21682i getCallEndedAt() {
        return this.callEndedAt;
    }

    public final String getCallId() {
        return this.callId;
    }

    public final String getCallSessionId() {
        return this.callSessionId;
    }

    public final C21682i getCallStartedAt() {
        return this.callStartedAt;
    }

    public final String getCallType() {
        return this.callType;
    }

    public final CallStatsParticipantCounts getCounts() {
        return this.counts;
    }

    public final String getDataSource() {
        return this.dataSource;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final C21682i getEndTime() {
        return this.endTime;
    }

    public final C21682i getGeneratedAt() {
        return this.generatedAt;
    }

    public final CallStatsMapPublishers getPublishers() {
        return this.publishers;
    }

    public final CallStatsMapSFUs getSfus() {
        return this.sfus;
    }

    public final C21682i getStartTime() {
        return this.startTime;
    }

    public final CallStatsMapSubscribers getSubscribers() {
        return this.subscribers;
    }

    public int hashCode() {
        int iHashCode = (this.counts.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.callId.hashCode() * 31, 31, this.callSessionId), 31, this.callType), 31, this.duration)) * 31;
        C21682i c21682i = this.callEndedAt;
        int iHashCode2 = (iHashCode + (c21682i == null ? 0 : c21682i.hashCode())) * 31;
        C21682i c21682i2 = this.callStartedAt;
        int iHashCode3 = (iHashCode2 + (c21682i2 == null ? 0 : c21682i2.hashCode())) * 31;
        String str = this.dataSource;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        C21682i c21682i3 = this.endTime;
        int iHashCode5 = (iHashCode4 + (c21682i3 == null ? 0 : c21682i3.hashCode())) * 31;
        C21682i c21682i4 = this.generatedAt;
        int iHashCode6 = (iHashCode5 + (c21682i4 == null ? 0 : c21682i4.hashCode())) * 31;
        C21682i c21682i5 = this.startTime;
        int iHashCode7 = (iHashCode6 + (c21682i5 == null ? 0 : c21682i5.hashCode())) * 31;
        CallStatsMapPublishers callStatsMapPublishers = this.publishers;
        int iHashCode8 = (iHashCode7 + (callStatsMapPublishers == null ? 0 : callStatsMapPublishers.hashCode())) * 31;
        CallStatsMapSFUs callStatsMapSFUs = this.sfus;
        int iHashCode9 = (iHashCode8 + (callStatsMapSFUs == null ? 0 : callStatsMapSFUs.hashCode())) * 31;
        CallStatsMapSubscribers callStatsMapSubscribers = this.subscribers;
        return iHashCode9 + (callStatsMapSubscribers != null ? callStatsMapSubscribers.hashCode() : 0);
    }

    public String toString() {
        String str = this.callId;
        String str2 = this.callSessionId;
        String str3 = this.callType;
        String str4 = this.duration;
        CallStatsParticipantCounts callStatsParticipantCounts = this.counts;
        C21682i c21682i = this.callEndedAt;
        C21682i c21682i2 = this.callStartedAt;
        String str5 = this.dataSource;
        C21682i c21682i3 = this.endTime;
        C21682i c21682i4 = this.generatedAt;
        C21682i c21682i5 = this.startTime;
        CallStatsMapPublishers callStatsMapPublishers = this.publishers;
        CallStatsMapSFUs callStatsMapSFUs = this.sfus;
        CallStatsMapSubscribers callStatsMapSubscribers = this.subscribers;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("QueryCallStatsMapResponse(callId=", str, ", callSessionId=", str2, ", callType=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", duration=", str4, ", counts=");
        sbM32001t.append(callStatsParticipantCounts);
        sbM32001t.append(", callEndedAt=");
        sbM32001t.append(c21682i);
        sbM32001t.append(", callStartedAt=");
        sbM32001t.append(c21682i2);
        sbM32001t.append(", dataSource=");
        sbM32001t.append(str5);
        sbM32001t.append(", endTime=");
        sbM32001t.append(c21682i3);
        sbM32001t.append(", generatedAt=");
        sbM32001t.append(c21682i4);
        sbM32001t.append(", startTime=");
        sbM32001t.append(c21682i5);
        sbM32001t.append(", publishers=");
        sbM32001t.append(callStatsMapPublishers);
        sbM32001t.append(", sfus=");
        sbM32001t.append(callStatsMapSFUs);
        sbM32001t.append(", subscribers=");
        sbM32001t.append(callStatsMapSubscribers);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ QueryCallStatsMapResponse(String str, String str2, String str3, String str4, CallStatsParticipantCounts callStatsParticipantCounts, C21682i c21682i, C21682i c21682i2, String str5, C21682i c21682i3, C21682i c21682i4, C21682i c21682i5, CallStatsMapPublishers callStatsMapPublishers, CallStatsMapSFUs callStatsMapSFUs, CallStatsMapSubscribers callStatsMapSubscribers, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, callStatsParticipantCounts, (i13 & 32) != 0 ? null : c21682i, (i13 & 64) != 0 ? null : c21682i2, (i13 & 128) != 0 ? null : str5, (i13 & 256) != 0 ? null : c21682i3, (i13 & 512) != 0 ? null : c21682i4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : c21682i5, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : callStatsMapPublishers, (i13 & 4096) != 0 ? null : callStatsMapSFUs, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : callStatsMapSubscribers);
    }
}
