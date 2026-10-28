package io.getstream.android.video.generated.models;

import androidx.profileinstaller.ProfileVerifier;
import jg3.C21682i;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\bE\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010$J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010$J\u0012\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b+\u0010$J\u0012\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b,\u0010$J\u0012\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b1\u0010*J\u0012\u00102\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b2\u0010$J\u0012\u00103\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b3\u0010*J\u0012\u00104\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b4\u0010*J\u0012\u00105\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b5\u0010$J\u0012\u00106\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b6\u0010$J\u0012\u00107\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b7\u0010$J\u0012\u00108\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b8\u0010$J\u0012\u00109\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b9\u00100J\u0012\u0010:\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b:\u0010$J\u0012\u0010;\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b;\u0010$J\u0012\u0010<\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0092\u0002\u0010>\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÆ\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b@\u0010$J\u0010\u0010A\u001a\u00020\nHÖ\u0001¢\u0006\u0004\bA\u0010BJ\u001a\u0010D\u001a\u00020\u00022\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bD\u0010ER\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010F\u001a\u0004\b\u0003\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010G\u001a\u0004\bH\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010I\u001a\u0004\bJ\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010G\u001a\u0004\bK\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010G\u001a\u0004\bL\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010M\u001a\u0004\bN\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010G\u001a\u0004\bO\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010G\u001a\u0004\bP\u0010$R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010Q\u001a\u0004\bR\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010S\u001a\u0004\bT\u00100R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010M\u001a\u0004\bU\u0010*R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010G\u001a\u0004\bV\u0010$R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010M\u001a\u0004\bW\u0010*R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0015\u0010M\u001a\u0004\bX\u0010*R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010G\u001a\u0004\bY\u0010$R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010G\u001a\u0004\bZ\u0010$R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010G\u001a\u0004\b[\u0010$R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010G\u001a\u0004\b\\\u0010$R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u001a\u0010S\u001a\u0004\b]\u00100R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010G\u001a\u0004\b^\u0010$R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010G\u001a\u0004\b_\u0010$R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010`\u001a\u0004\ba\u0010=¨\u0006b"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallStatsParticipantSession;", "", "", "isLive", "", "userSessionId", "Lio/getstream/android/video/generated/models/PublishedTrackFlags;", "publishedTracks", "browser", "browserVersion", "", "cqScore", "currentIp", "currentSfu", "", "distanceToSfuKilometers", "Ljg3/i;", "endedAt", "freezesDurationMs", "ingress", "jitterMs", "latencyMs", "os", "publisherType", "sdk", "sdkVersion", "startedAt", "unifiedSessionId", "webrtcVersion", "Lio/getstream/android/video/generated/models/CallStatsLocation;", "location", "<init>", "(ZLjava/lang/String;Lio/getstream/android/video/generated/models/PublishedTrackFlags;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsLocation;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "()Lio/getstream/android/video/generated/models/PublishedTrackFlags;", "component4", "component5", "component6", "()Ljava/lang/Integer;", "component7", "component8", "component9", "()Ljava/lang/Float;", "component10", "()Ljg3/i;", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "()Lio/getstream/android/video/generated/models/CallStatsLocation;", "copy", "(ZLjava/lang/String;Lio/getstream/android/video/generated/models/PublishedTrackFlags;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsLocation;)Lio/getstream/android/video/generated/models/CallStatsParticipantSession;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/lang/String;", "getUserSessionId", "Lio/getstream/android/video/generated/models/PublishedTrackFlags;", "getPublishedTracks", "getBrowser", "getBrowserVersion", "Ljava/lang/Integer;", "getCqScore", "getCurrentIp", "getCurrentSfu", "Ljava/lang/Float;", "getDistanceToSfuKilometers", "Ljg3/i;", "getEndedAt", "getFreezesDurationMs", "getIngress", "getJitterMs", "getLatencyMs", "getOs", "getPublisherType", "getSdk", "getSdkVersion", "getStartedAt", "getUnifiedSessionId", "getWebrtcVersion", "Lio/getstream/android/video/generated/models/CallStatsLocation;", "getLocation", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CallStatsParticipantSession {
    private final String browser;
    private final String browserVersion;
    private final Integer cqScore;
    private final String currentIp;
    private final String currentSfu;
    private final Float distanceToSfuKilometers;
    private final C21682i endedAt;
    private final Integer freezesDurationMs;
    private final String ingress;
    private final boolean isLive;
    private final Integer jitterMs;
    private final Integer latencyMs;
    private final CallStatsLocation location;
    private final String os;
    private final PublishedTrackFlags publishedTracks;
    private final String publisherType;
    private final String sdk;
    private final String sdkVersion;
    private final C21682i startedAt;
    private final String unifiedSessionId;
    private final String userSessionId;
    private final String webrtcVersion;

    public CallStatsParticipantSession(@InterfaceC30731q(name = "is_live") boolean z4, @InterfaceC30731q(name = "user_session_id") String userSessionId, @InterfaceC30731q(name = "published_tracks") PublishedTrackFlags publishedTracks, @InterfaceC30731q(name = "browser") String str, @InterfaceC30731q(name = "browser_version") String str2, @InterfaceC30731q(name = "cq_score") Integer num, @InterfaceC30731q(name = "current_ip") String str3, @InterfaceC30731q(name = "current_sfu") String str4, @InterfaceC30731q(name = "distance_to_sfu_kilometers") Float f13, @InterfaceC30731q(name = "ended_at") C21682i c21682i, @InterfaceC30731q(name = "freezes_duration_ms") Integer num2, @InterfaceC30731q(name = "ingress") String str5, @InterfaceC30731q(name = "jitter_ms") Integer num3, @InterfaceC30731q(name = "latency_ms") Integer num4, @InterfaceC30731q(name = "os") String str6, @InterfaceC30731q(name = "publisher_type") String str7, @InterfaceC30731q(name = "sdk") String str8, @InterfaceC30731q(name = "sdk_version") String str9, @InterfaceC30731q(name = "started_at") C21682i c21682i2, @InterfaceC30731q(name = "unified_session_id") String str10, @InterfaceC30731q(name = "webrtc_version") String str11, @InterfaceC30731q(name = "location") CallStatsLocation callStatsLocation) {
        AbstractC22676k.m65750j(userSessionId, "userSessionId");
        AbstractC22676k.m65750j(publishedTracks, "publishedTracks");
        this.isLive = z4;
        this.userSessionId = userSessionId;
        this.publishedTracks = publishedTracks;
        this.browser = str;
        this.browserVersion = str2;
        this.cqScore = num;
        this.currentIp = str3;
        this.currentSfu = str4;
        this.distanceToSfuKilometers = f13;
        this.endedAt = c21682i;
        this.freezesDurationMs = num2;
        this.ingress = str5;
        this.jitterMs = num3;
        this.latencyMs = num4;
        this.os = str6;
        this.publisherType = str7;
        this.sdk = str8;
        this.sdkVersion = str9;
        this.startedAt = c21682i2;
        this.unifiedSessionId = str10;
        this.webrtcVersion = str11;
        this.location = callStatsLocation;
    }

    public static /* synthetic */ CallStatsParticipantSession copy$default(CallStatsParticipantSession callStatsParticipantSession, boolean z4, String str, PublishedTrackFlags publishedTrackFlags, String str2, String str3, Integer num, String str4, String str5, Float f13, C21682i c21682i, Integer num2, String str6, Integer num3, Integer num4, String str7, String str8, String str9, String str10, C21682i c21682i2, String str11, String str12, CallStatsLocation callStatsLocation, int i13, Object obj) {
        CallStatsLocation callStatsLocation2;
        String str13;
        boolean z13 = (i13 & 1) != 0 ? callStatsParticipantSession.isLive : z4;
        String str14 = (i13 & 2) != 0 ? callStatsParticipantSession.userSessionId : str;
        PublishedTrackFlags publishedTrackFlags2 = (i13 & 4) != 0 ? callStatsParticipantSession.publishedTracks : publishedTrackFlags;
        String str15 = (i13 & 8) != 0 ? callStatsParticipantSession.browser : str2;
        String str16 = (i13 & 16) != 0 ? callStatsParticipantSession.browserVersion : str3;
        Integer num5 = (i13 & 32) != 0 ? callStatsParticipantSession.cqScore : num;
        String str17 = (i13 & 64) != 0 ? callStatsParticipantSession.currentIp : str4;
        String str18 = (i13 & 128) != 0 ? callStatsParticipantSession.currentSfu : str5;
        Float f14 = (i13 & 256) != 0 ? callStatsParticipantSession.distanceToSfuKilometers : f13;
        C21682i c21682i3 = (i13 & 512) != 0 ? callStatsParticipantSession.endedAt : c21682i;
        Integer num6 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? callStatsParticipantSession.freezesDurationMs : num2;
        String str19 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? callStatsParticipantSession.ingress : str6;
        Integer num7 = (i13 & 4096) != 0 ? callStatsParticipantSession.jitterMs : num3;
        Integer num8 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? callStatsParticipantSession.latencyMs : num4;
        boolean z14 = z13;
        String str20 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? callStatsParticipantSession.os : str7;
        String str21 = (i13 & 32768) != 0 ? callStatsParticipantSession.publisherType : str8;
        String str22 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? callStatsParticipantSession.sdk : str9;
        String str23 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? callStatsParticipantSession.sdkVersion : str10;
        C21682i c21682i4 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? callStatsParticipantSession.startedAt : c21682i2;
        String str24 = (i13 & 524288) != 0 ? callStatsParticipantSession.unifiedSessionId : str11;
        String str25 = (i13 & 1048576) != 0 ? callStatsParticipantSession.webrtcVersion : str12;
        if ((i13 & 2097152) != 0) {
            str13 = str25;
            callStatsLocation2 = callStatsParticipantSession.location;
        } else {
            callStatsLocation2 = callStatsLocation;
            str13 = str25;
        }
        return callStatsParticipantSession.copy(z14, str14, publishedTrackFlags2, str15, str16, num5, str17, str18, f14, c21682i3, num6, str19, num7, num8, str20, str21, str22, str23, c21682i4, str24, str13, callStatsLocation2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsLive() {
        return this.isLive;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final C21682i getEndedAt() {
        return this.endedAt;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getFreezesDurationMs() {
        return this.freezesDurationMs;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getIngress() {
        return this.ingress;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getJitterMs() {
        return this.jitterMs;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getLatencyMs() {
        return this.latencyMs;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getOs() {
        return this.os;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getPublisherType() {
        return this.publisherType;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getSdk() {
        return this.sdk;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final C21682i getStartedAt() {
        return this.startedAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserSessionId() {
        return this.userSessionId;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getUnifiedSessionId() {
        return this.unifiedSessionId;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getWebrtcVersion() {
        return this.webrtcVersion;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final CallStatsLocation getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PublishedTrackFlags getPublishedTracks() {
        return this.publishedTracks;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBrowser() {
        return this.browser;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBrowserVersion() {
        return this.browserVersion;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getCqScore() {
        return this.cqScore;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCurrentIp() {
        return this.currentIp;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCurrentSfu() {
        return this.currentSfu;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Float getDistanceToSfuKilometers() {
        return this.distanceToSfuKilometers;
    }

    public final CallStatsParticipantSession copy(@InterfaceC30731q(name = "is_live") boolean isLive, @InterfaceC30731q(name = "user_session_id") String userSessionId, @InterfaceC30731q(name = "published_tracks") PublishedTrackFlags publishedTracks, @InterfaceC30731q(name = "browser") String browser, @InterfaceC30731q(name = "browser_version") String browserVersion, @InterfaceC30731q(name = "cq_score") Integer cqScore, @InterfaceC30731q(name = "current_ip") String currentIp, @InterfaceC30731q(name = "current_sfu") String currentSfu, @InterfaceC30731q(name = "distance_to_sfu_kilometers") Float distanceToSfuKilometers, @InterfaceC30731q(name = "ended_at") C21682i endedAt, @InterfaceC30731q(name = "freezes_duration_ms") Integer freezesDurationMs, @InterfaceC30731q(name = "ingress") String ingress, @InterfaceC30731q(name = "jitter_ms") Integer jitterMs, @InterfaceC30731q(name = "latency_ms") Integer latencyMs, @InterfaceC30731q(name = "os") String os2, @InterfaceC30731q(name = "publisher_type") String publisherType, @InterfaceC30731q(name = "sdk") String sdk, @InterfaceC30731q(name = "sdk_version") String sdkVersion, @InterfaceC30731q(name = "started_at") C21682i startedAt, @InterfaceC30731q(name = "unified_session_id") String unifiedSessionId, @InterfaceC30731q(name = "webrtc_version") String webrtcVersion, @InterfaceC30731q(name = "location") CallStatsLocation location) {
        AbstractC22676k.m65750j(userSessionId, "userSessionId");
        AbstractC22676k.m65750j(publishedTracks, "publishedTracks");
        return new CallStatsParticipantSession(isLive, userSessionId, publishedTracks, browser, browserVersion, cqScore, currentIp, currentSfu, distanceToSfuKilometers, endedAt, freezesDurationMs, ingress, jitterMs, latencyMs, os2, publisherType, sdk, sdkVersion, startedAt, unifiedSessionId, webrtcVersion, location);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallStatsParticipantSession)) {
            return false;
        }
        CallStatsParticipantSession callStatsParticipantSession = (CallStatsParticipantSession) other;
        return this.isLive == callStatsParticipantSession.isLive && AbstractC22676k.m65745e(this.userSessionId, callStatsParticipantSession.userSessionId) && AbstractC22676k.m65745e(this.publishedTracks, callStatsParticipantSession.publishedTracks) && AbstractC22676k.m65745e(this.browser, callStatsParticipantSession.browser) && AbstractC22676k.m65745e(this.browserVersion, callStatsParticipantSession.browserVersion) && AbstractC22676k.m65745e(this.cqScore, callStatsParticipantSession.cqScore) && AbstractC22676k.m65745e(this.currentIp, callStatsParticipantSession.currentIp) && AbstractC22676k.m65745e(this.currentSfu, callStatsParticipantSession.currentSfu) && AbstractC22676k.m65745e(this.distanceToSfuKilometers, callStatsParticipantSession.distanceToSfuKilometers) && AbstractC22676k.m65745e(this.endedAt, callStatsParticipantSession.endedAt) && AbstractC22676k.m65745e(this.freezesDurationMs, callStatsParticipantSession.freezesDurationMs) && AbstractC22676k.m65745e(this.ingress, callStatsParticipantSession.ingress) && AbstractC22676k.m65745e(this.jitterMs, callStatsParticipantSession.jitterMs) && AbstractC22676k.m65745e(this.latencyMs, callStatsParticipantSession.latencyMs) && AbstractC22676k.m65745e(this.os, callStatsParticipantSession.os) && AbstractC22676k.m65745e(this.publisherType, callStatsParticipantSession.publisherType) && AbstractC22676k.m65745e(this.sdk, callStatsParticipantSession.sdk) && AbstractC22676k.m65745e(this.sdkVersion, callStatsParticipantSession.sdkVersion) && AbstractC22676k.m65745e(this.startedAt, callStatsParticipantSession.startedAt) && AbstractC22676k.m65745e(this.unifiedSessionId, callStatsParticipantSession.unifiedSessionId) && AbstractC22676k.m65745e(this.webrtcVersion, callStatsParticipantSession.webrtcVersion) && AbstractC22676k.m65745e(this.location, callStatsParticipantSession.location);
    }

    public final String getBrowser() {
        return this.browser;
    }

    public final String getBrowserVersion() {
        return this.browserVersion;
    }

    public final Integer getCqScore() {
        return this.cqScore;
    }

    public final String getCurrentIp() {
        return this.currentIp;
    }

    public final String getCurrentSfu() {
        return this.currentSfu;
    }

    public final Float getDistanceToSfuKilometers() {
        return this.distanceToSfuKilometers;
    }

    public final C21682i getEndedAt() {
        return this.endedAt;
    }

    public final Integer getFreezesDurationMs() {
        return this.freezesDurationMs;
    }

    public final String getIngress() {
        return this.ingress;
    }

    public final Integer getJitterMs() {
        return this.jitterMs;
    }

    public final Integer getLatencyMs() {
        return this.latencyMs;
    }

    public final CallStatsLocation getLocation() {
        return this.location;
    }

    public final String getOs() {
        return this.os;
    }

    public final PublishedTrackFlags getPublishedTracks() {
        return this.publishedTracks;
    }

    public final String getPublisherType() {
        return this.publisherType;
    }

    public final String getSdk() {
        return this.sdk;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final C21682i getStartedAt() {
        return this.startedAt;
    }

    public final String getUnifiedSessionId() {
        return this.unifiedSessionId;
    }

    public final String getUserSessionId() {
        return this.userSessionId;
    }

    public final String getWebrtcVersion() {
        return this.webrtcVersion;
    }

    public int hashCode() {
        int iHashCode = (this.publishedTracks.hashCode() + AbstractC11266d.m30450d(Boolean.hashCode(this.isLive) * 31, 31, this.userSessionId)) * 31;
        String str = this.browser;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.browserVersion;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.cqScore;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.currentIp;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currentSfu;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Float f13 = this.distanceToSfuKilometers;
        int iHashCode7 = (iHashCode6 + (f13 == null ? 0 : f13.hashCode())) * 31;
        C21682i c21682i = this.endedAt;
        int iHashCode8 = (iHashCode7 + (c21682i == null ? 0 : c21682i.hashCode())) * 31;
        Integer num2 = this.freezesDurationMs;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.ingress;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.jitterMs;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.latencyMs;
        int iHashCode12 = (iHashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str6 = this.os;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.publisherType;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.sdk;
        int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.sdkVersion;
        int iHashCode16 = (iHashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        C21682i c21682i2 = this.startedAt;
        int iHashCode17 = (iHashCode16 + (c21682i2 == null ? 0 : c21682i2.hashCode())) * 31;
        String str10 = this.unifiedSessionId;
        int iHashCode18 = (iHashCode17 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.webrtcVersion;
        int iHashCode19 = (iHashCode18 + (str11 == null ? 0 : str11.hashCode())) * 31;
        CallStatsLocation callStatsLocation = this.location;
        return iHashCode19 + (callStatsLocation != null ? callStatsLocation.hashCode() : 0);
    }

    public final boolean isLive() {
        return this.isLive;
    }

    public String toString() {
        boolean z4 = this.isLive;
        String str = this.userSessionId;
        PublishedTrackFlags publishedTrackFlags = this.publishedTracks;
        String str2 = this.browser;
        String str3 = this.browserVersion;
        Integer num = this.cqScore;
        String str4 = this.currentIp;
        String str5 = this.currentSfu;
        Float f13 = this.distanceToSfuKilometers;
        C21682i c21682i = this.endedAt;
        Integer num2 = this.freezesDurationMs;
        String str6 = this.ingress;
        Integer num3 = this.jitterMs;
        Integer num4 = this.latencyMs;
        String str7 = this.os;
        String str8 = this.publisherType;
        String str9 = this.sdk;
        String str10 = this.sdkVersion;
        C21682i c21682i2 = this.startedAt;
        String str11 = this.unifiedSessionId;
        String str12 = this.webrtcVersion;
        CallStatsLocation callStatsLocation = this.location;
        StringBuilder sbM38567n = AbstractC13673n.m38567n("CallStatsParticipantSession(isLive=", ", userSessionId=", str, ", publishedTracks=", z4);
        sbM38567n.append(publishedTrackFlags);
        sbM38567n.append(", browser=");
        sbM38567n.append(str2);
        sbM38567n.append(", browserVersion=");
        AbstractC30007c.m91853w(num, str3, ", cqScore=", ", currentIp=", sbM38567n);
        AbstractC11266d.m30444B(sbM38567n, str4, ", currentSfu=", str5, ", distanceToSfuKilometers=");
        sbM38567n.append(f13);
        sbM38567n.append(", endedAt=");
        sbM38567n.append(c21682i);
        sbM38567n.append(", freezesDurationMs=");
        AbstractC13673n.m38577x(num2, ", ingress=", str6, ", jitterMs=", sbM38567n);
        AbstractC31061c.m95621A(sbM38567n, num3, ", latencyMs=", num4, ", os=");
        AbstractC11266d.m30444B(sbM38567n, str7, ", publisherType=", str8, ", sdk=");
        AbstractC11266d.m30444B(sbM38567n, str9, ", sdkVersion=", str10, ", startedAt=");
        sbM38567n.append(c21682i2);
        sbM38567n.append(", unifiedSessionId=");
        sbM38567n.append(str11);
        sbM38567n.append(", webrtcVersion=");
        sbM38567n.append(str12);
        sbM38567n.append(", location=");
        sbM38567n.append(callStatsLocation);
        sbM38567n.append(")");
        return sbM38567n.toString();
    }

    public /* synthetic */ CallStatsParticipantSession(boolean z4, String str, PublishedTrackFlags publishedTrackFlags, String str2, String str3, Integer num, String str4, String str5, Float f13, C21682i c21682i, Integer num2, String str6, Integer num3, Integer num4, String str7, String str8, String str9, String str10, C21682i c21682i2, String str11, String str12, CallStatsLocation callStatsLocation, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, str, publishedTrackFlags, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? null : num, (i13 & 64) != 0 ? null : str4, (i13 & 128) != 0 ? null : str5, (i13 & 256) != 0 ? null : f13, (i13 & 512) != 0 ? null : c21682i, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : num2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str6, (i13 & 4096) != 0 ? null : num3, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : num4, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : str7, (32768 & i13) != 0 ? null : str8, (65536 & i13) != 0 ? null : str9, (131072 & i13) != 0 ? null : str10, (262144 & i13) != 0 ? null : c21682i2, (524288 & i13) != 0 ? null : str11, (1048576 & i13) != 0 ? null : str12, (i13 & 2097152) != 0 ? null : callStatsLocation);
    }
}
