package io.getstream.android.video.generated.models;

import androidx.profileinstaller.ProfileVerifier;
import ih0.AbstractC18489d0;
import jg3.C21682i;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001B×\u0002\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010&\u001a\u00020\u0002H\u0000¢\u0006\u0004\b$\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010%J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010%J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010%J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010%J\u0012\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010%J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010%J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010%J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010%J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010%J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010%J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010%J\u0012\u00104\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b6\u0010,J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010%J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u0010%J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010%J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u0010%J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u0010%J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u0010%J\u0012\u0010=\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b=\u0010%J\u0012\u0010>\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b>\u00105J\u0012\u0010?\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b?\u0010%J\u0012\u0010@\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b@\u0010%J\u0012\u0010A\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bA\u0010%J\u0012\u0010B\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bB\u0010%J\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u0010%J\u0012\u0010D\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\bD\u0010EJà\u0002\u0010F\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010!\u001a\u0004\u0018\u00010 HÆ\u0001¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bH\u0010%J\u0010\u0010I\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\bI\u0010JJ\u001a\u0010L\u001a\u00020 2\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bL\u0010MJ)\u0010S\u001a\u00020R*\u00060Nj\u0002`O2\u0006\u0010P\u001a\u00020\u00022\b\u0010Q\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\bS\u0010TR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010U\u001a\u0004\bV\u0010%R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010U\u001a\u0004\bW\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010U\u001a\u0004\bX\u0010%R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010U\u001a\u0004\bY\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010Z\u001a\u0004\b[\u0010,R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010U\u001a\u0004\b\\\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010U\u001a\u0004\b]\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010U\u001a\u0004\b^\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010U\u001a\u0004\b_\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010U\u001a\u0004\b`\u0010%R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010U\u001a\u0004\ba\u0010%R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010U\u001a\u0004\bb\u0010%R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010c\u001a\u0004\bd\u00105R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010Z\u001a\u0004\be\u0010,R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010U\u001a\u0004\bf\u0010%R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010U\u001a\u0004\bg\u0010%R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010U\u001a\u0004\bh\u0010%R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010U\u001a\u0004\bi\u0010%R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010U\u001a\u0004\bj\u0010%R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010U\u001a\u0004\bk\u0010%R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010U\u001a\u0004\bl\u0010%R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u001a\u0010c\u001a\u0004\bm\u00105R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010U\u001a\u0004\bn\u0010%R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010U\u001a\u0004\bo\u0010%R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010U\u001a\u0004\bp\u0010%R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010U\u001a\u0004\bq\u0010%R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010U\u001a\u0004\br\u0010%R\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b!\u0010s\u001a\u0004\bt\u0010E¨\u0006u"}, m65681d2 = {"Lio/getstream/android/video/generated/models/ClientEvent;", "", "", "callSessionId", "cameraPermissionStatus", "coordinatorConnectId", "joinReason", "", "elapsedTime", "eventType", "iceState", "id", "joinAttemptId", "microphonePermissionStatus", "outcome", "peerConnection", "Ljg3/i;", "previouslyConnectedTimestamp", "retryCountAttempt", "retryFailureCode", "retryFailureReason", "screenShareStatus", "sdkVersion", "sfuId", "stage", "stageId", "timestamp", "trackId", "type", "userAgent", "userId", "userSessionId", "", "wasPreviouslyConnected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "toLog$stream_video_android_core_release", "()Ljava/lang/String;", "toLog", "component1", "component2", "component3", "component4", "component5", "()Ljava/lang/Integer;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "()Ljg3/i;", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lio/getstream/android/video/generated/models/ClientEvent;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "key", "value", "Ll83/a0;", "appendIfNotNull", "(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/lang/String;", "getCallSessionId", "getCameraPermissionStatus", "getCoordinatorConnectId", "getJoinReason", "Ljava/lang/Integer;", "getElapsedTime", "getEventType", "getIceState", "getId", "getJoinAttemptId", "getMicrophonePermissionStatus", "getOutcome", "getPeerConnection", "Ljg3/i;", "getPreviouslyConnectedTimestamp", "getRetryCountAttempt", "getRetryFailureCode", "getRetryFailureReason", "getScreenShareStatus", "getSdkVersion", "getSfuId", "getStage", "getStageId", "getTimestamp", "getTrackId", "getType", "getUserAgent", "getUserId", "getUserSessionId", "Ljava/lang/Boolean;", "getWasPreviouslyConnected", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class ClientEvent {
    private final String callSessionId;
    private final String cameraPermissionStatus;
    private final String coordinatorConnectId;
    private final Integer elapsedTime;
    private final String eventType;
    private final String iceState;
    private final String id;
    private final String joinAttemptId;
    private final String joinReason;
    private final String microphonePermissionStatus;
    private final String outcome;
    private final String peerConnection;
    private final C21682i previouslyConnectedTimestamp;
    private final Integer retryCountAttempt;
    private final String retryFailureCode;
    private final String retryFailureReason;
    private final String screenShareStatus;
    private final String sdkVersion;
    private final String sfuId;
    private final String stage;
    private final String stageId;
    private final C21682i timestamp;
    private final String trackId;
    private final String type;
    private final String userAgent;
    private final String userId;
    private final String userSessionId;
    private final Boolean wasPreviouslyConnected;

    public ClientEvent() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268435455, null);
    }

    private final void appendIfNotNull(StringBuilder sb4, String str, Object obj) {
        if (obj == null) {
            return;
        }
        if (!AbstractC39414r.m125880Y(sb4, "(")) {
            sb4.append(",\n");
        }
        sb4.append(str);
        sb4.append("=");
        sb4.append(obj);
    }

    public static /* synthetic */ ClientEvent copy$default(ClientEvent clientEvent, String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, String str8, String str9, String str10, String str11, C21682i c21682i, Integer num2, String str12, String str13, String str14, String str15, String str16, String str17, String str18, C21682i c21682i2, String str19, String str20, String str21, String str22, String str23, Boolean bool, int i13, Object obj) {
        Boolean bool2;
        String str24;
        String str25 = (i13 & 1) != 0 ? clientEvent.callSessionId : str;
        String str26 = (i13 & 2) != 0 ? clientEvent.cameraPermissionStatus : str2;
        String str27 = (i13 & 4) != 0 ? clientEvent.coordinatorConnectId : str3;
        String str28 = (i13 & 8) != 0 ? clientEvent.joinReason : str4;
        Integer num3 = (i13 & 16) != 0 ? clientEvent.elapsedTime : num;
        String str29 = (i13 & 32) != 0 ? clientEvent.eventType : str5;
        String str30 = (i13 & 64) != 0 ? clientEvent.iceState : str6;
        String str31 = (i13 & 128) != 0 ? clientEvent.id : str7;
        String str32 = (i13 & 256) != 0 ? clientEvent.joinAttemptId : str8;
        String str33 = (i13 & 512) != 0 ? clientEvent.microphonePermissionStatus : str9;
        String str34 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? clientEvent.outcome : str10;
        String str35 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? clientEvent.peerConnection : str11;
        C21682i c21682i3 = (i13 & 4096) != 0 ? clientEvent.previouslyConnectedTimestamp : c21682i;
        Integer num4 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? clientEvent.retryCountAttempt : num2;
        String str36 = str25;
        String str37 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? clientEvent.retryFailureCode : str12;
        String str38 = (i13 & 32768) != 0 ? clientEvent.retryFailureReason : str13;
        String str39 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? clientEvent.screenShareStatus : str14;
        String str40 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? clientEvent.sdkVersion : str15;
        String str41 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? clientEvent.sfuId : str16;
        String str42 = (i13 & 524288) != 0 ? clientEvent.stage : str17;
        String str43 = (i13 & 1048576) != 0 ? clientEvent.stageId : str18;
        C21682i c21682i4 = (i13 & 2097152) != 0 ? clientEvent.timestamp : c21682i2;
        String str44 = (i13 & 4194304) != 0 ? clientEvent.trackId : str19;
        String str45 = (i13 & 8388608) != 0 ? clientEvent.type : str20;
        String str46 = (i13 & 16777216) != 0 ? clientEvent.userAgent : str21;
        String str47 = (i13 & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? clientEvent.userId : str22;
        String str48 = (i13 & 67108864) != 0 ? clientEvent.userSessionId : str23;
        if ((i13 & 134217728) != 0) {
            str24 = str48;
            bool2 = clientEvent.wasPreviouslyConnected;
        } else {
            bool2 = bool;
            str24 = str48;
        }
        return clientEvent.copy(str36, str26, str27, str28, num3, str29, str30, str31, str32, str33, str34, str35, c21682i3, num4, str37, str38, str39, str40, str41, str42, str43, c21682i4, str44, str45, str46, str47, str24, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCallSessionId() {
        return this.callSessionId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getMicrophonePermissionStatus() {
        return this.microphonePermissionStatus;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getOutcome() {
        return this.outcome;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPeerConnection() {
        return this.peerConnection;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final C21682i getPreviouslyConnectedTimestamp() {
        return this.previouslyConnectedTimestamp;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getRetryCountAttempt() {
        return this.retryCountAttempt;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getRetryFailureCode() {
        return this.retryFailureCode;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getRetryFailureReason() {
        return this.retryFailureReason;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getScreenShareStatus() {
        return this.screenShareStatus;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getSfuId() {
        return this.sfuId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCameraPermissionStatus() {
        return this.cameraPermissionStatus;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getStage() {
        return this.stage;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getStageId() {
        return this.stageId;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final C21682i getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getTrackId() {
        return this.trackId;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getUserAgent() {
        return this.userAgent;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getUserSessionId() {
        return this.userSessionId;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Boolean getWasPreviouslyConnected() {
        return this.wasPreviouslyConnected;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCoordinatorConnectId() {
        return this.coordinatorConnectId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getJoinReason() {
        return this.joinReason;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getElapsedTime() {
        return this.elapsedTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIceState() {
        return this.iceState;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getJoinAttemptId() {
        return this.joinAttemptId;
    }

    public final ClientEvent copy(@InterfaceC30731q(name = "call_session_id") String callSessionId, @InterfaceC30731q(name = "camera_permission_status") String cameraPermissionStatus, @InterfaceC30731q(name = "coordinator_connect_id") String coordinatorConnectId, @InterfaceC30731q(name = "join_reason") String joinReason, @InterfaceC30731q(name = "elapsed_time") Integer elapsedTime, @InterfaceC30731q(name = "event_type") String eventType, @InterfaceC30731q(name = "ice_state") String iceState, @InterfaceC30731q(name = "id") String id4, @InterfaceC30731q(name = "join_attempt_id") String joinAttemptId, @InterfaceC30731q(name = "microphone_permission_status") String microphonePermissionStatus, @InterfaceC30731q(name = "outcome") String outcome, @InterfaceC30731q(name = "peer_connection") String peerConnection, @InterfaceC30731q(name = "previously_connected_timestamp") C21682i previouslyConnectedTimestamp, @InterfaceC30731q(name = "retry_count_attempt") Integer retryCountAttempt, @InterfaceC30731q(name = "retry_failure_code") String retryFailureCode, @InterfaceC30731q(name = "retry_failure_reason") String retryFailureReason, @InterfaceC30731q(name = "screen_share_status") String screenShareStatus, @InterfaceC30731q(name = "sdk_version") String sdkVersion, @InterfaceC30731q(name = "sfu_id") String sfuId, @InterfaceC30731q(name = "stage") String stage, @InterfaceC30731q(name = "stage_id") String stageId, @InterfaceC30731q(name = "timestamp") C21682i timestamp, @InterfaceC30731q(name = "track_id") String trackId, @InterfaceC30731q(name = "type") String type, @InterfaceC30731q(name = "user_agent") String userAgent, @InterfaceC30731q(name = "user_id") String userId, @InterfaceC30731q(name = "user_session_id") String userSessionId, @InterfaceC30731q(name = "was_previously_connected") Boolean wasPreviouslyConnected) {
        return new ClientEvent(callSessionId, cameraPermissionStatus, coordinatorConnectId, joinReason, elapsedTime, eventType, iceState, id4, joinAttemptId, microphonePermissionStatus, outcome, peerConnection, previouslyConnectedTimestamp, retryCountAttempt, retryFailureCode, retryFailureReason, screenShareStatus, sdkVersion, sfuId, stage, stageId, timestamp, trackId, type, userAgent, userId, userSessionId, wasPreviouslyConnected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClientEvent)) {
            return false;
        }
        ClientEvent clientEvent = (ClientEvent) other;
        return AbstractC22676k.m65745e(this.callSessionId, clientEvent.callSessionId) && AbstractC22676k.m65745e(this.cameraPermissionStatus, clientEvent.cameraPermissionStatus) && AbstractC22676k.m65745e(this.coordinatorConnectId, clientEvent.coordinatorConnectId) && AbstractC22676k.m65745e(this.joinReason, clientEvent.joinReason) && AbstractC22676k.m65745e(this.elapsedTime, clientEvent.elapsedTime) && AbstractC22676k.m65745e(this.eventType, clientEvent.eventType) && AbstractC22676k.m65745e(this.iceState, clientEvent.iceState) && AbstractC22676k.m65745e(this.id, clientEvent.id) && AbstractC22676k.m65745e(this.joinAttemptId, clientEvent.joinAttemptId) && AbstractC22676k.m65745e(this.microphonePermissionStatus, clientEvent.microphonePermissionStatus) && AbstractC22676k.m65745e(this.outcome, clientEvent.outcome) && AbstractC22676k.m65745e(this.peerConnection, clientEvent.peerConnection) && AbstractC22676k.m65745e(this.previouslyConnectedTimestamp, clientEvent.previouslyConnectedTimestamp) && AbstractC22676k.m65745e(this.retryCountAttempt, clientEvent.retryCountAttempt) && AbstractC22676k.m65745e(this.retryFailureCode, clientEvent.retryFailureCode) && AbstractC22676k.m65745e(this.retryFailureReason, clientEvent.retryFailureReason) && AbstractC22676k.m65745e(this.screenShareStatus, clientEvent.screenShareStatus) && AbstractC22676k.m65745e(this.sdkVersion, clientEvent.sdkVersion) && AbstractC22676k.m65745e(this.sfuId, clientEvent.sfuId) && AbstractC22676k.m65745e(this.stage, clientEvent.stage) && AbstractC22676k.m65745e(this.stageId, clientEvent.stageId) && AbstractC22676k.m65745e(this.timestamp, clientEvent.timestamp) && AbstractC22676k.m65745e(this.trackId, clientEvent.trackId) && AbstractC22676k.m65745e(this.type, clientEvent.type) && AbstractC22676k.m65745e(this.userAgent, clientEvent.userAgent) && AbstractC22676k.m65745e(this.userId, clientEvent.userId) && AbstractC22676k.m65745e(this.userSessionId, clientEvent.userSessionId) && AbstractC22676k.m65745e(this.wasPreviouslyConnected, clientEvent.wasPreviouslyConnected);
    }

    public final String getCallSessionId() {
        return this.callSessionId;
    }

    public final String getCameraPermissionStatus() {
        return this.cameraPermissionStatus;
    }

    public final String getCoordinatorConnectId() {
        return this.coordinatorConnectId;
    }

    public final Integer getElapsedTime() {
        return this.elapsedTime;
    }

    public final String getEventType() {
        return this.eventType;
    }

    public final String getIceState() {
        return this.iceState;
    }

    public final String getId() {
        return this.id;
    }

    public final String getJoinAttemptId() {
        return this.joinAttemptId;
    }

    public final String getJoinReason() {
        return this.joinReason;
    }

    public final String getMicrophonePermissionStatus() {
        return this.microphonePermissionStatus;
    }

    public final String getOutcome() {
        return this.outcome;
    }

    public final String getPeerConnection() {
        return this.peerConnection;
    }

    public final C21682i getPreviouslyConnectedTimestamp() {
        return this.previouslyConnectedTimestamp;
    }

    public final Integer getRetryCountAttempt() {
        return this.retryCountAttempt;
    }

    public final String getRetryFailureCode() {
        return this.retryFailureCode;
    }

    public final String getRetryFailureReason() {
        return this.retryFailureReason;
    }

    public final String getScreenShareStatus() {
        return this.screenShareStatus;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getSfuId() {
        return this.sfuId;
    }

    public final String getStage() {
        return this.stage;
    }

    public final String getStageId() {
        return this.stageId;
    }

    public final C21682i getTimestamp() {
        return this.timestamp;
    }

    public final String getTrackId() {
        return this.trackId;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserSessionId() {
        return this.userSessionId;
    }

    public final Boolean getWasPreviouslyConnected() {
        return this.wasPreviouslyConnected;
    }

    public int hashCode() {
        String str = this.callSessionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cameraPermissionStatus;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.coordinatorConnectId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.joinReason;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.elapsedTime;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.eventType;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.iceState;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.id;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.joinAttemptId;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.microphonePermissionStatus;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.outcome;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.peerConnection;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        C21682i c21682i = this.previouslyConnectedTimestamp;
        int iHashCode13 = (iHashCode12 + (c21682i == null ? 0 : c21682i.hashCode())) * 31;
        Integer num2 = this.retryCountAttempt;
        int iHashCode14 = (iHashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str12 = this.retryFailureCode;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.retryFailureReason;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.screenShareStatus;
        int iHashCode17 = (iHashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.sdkVersion;
        int iHashCode18 = (iHashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.sfuId;
        int iHashCode19 = (iHashCode18 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.stage;
        int iHashCode20 = (iHashCode19 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.stageId;
        int iHashCode21 = (iHashCode20 + (str18 == null ? 0 : str18.hashCode())) * 31;
        C21682i c21682i2 = this.timestamp;
        int iHashCode22 = (iHashCode21 + (c21682i2 == null ? 0 : c21682i2.hashCode())) * 31;
        String str19 = this.trackId;
        int iHashCode23 = (iHashCode22 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.type;
        int iHashCode24 = (iHashCode23 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.userAgent;
        int iHashCode25 = (iHashCode24 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.userId;
        int iHashCode26 = (iHashCode25 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.userSessionId;
        int iHashCode27 = (iHashCode26 + (str23 == null ? 0 : str23.hashCode())) * 31;
        Boolean bool = this.wasPreviouslyConnected;
        return iHashCode27 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toLog$stream_video_android_core_release() {
        StringBuilder sbM53374o = AbstractC18489d0.m53374o("ClientEvent(");
        appendIfNotNull(sbM53374o, "type", this.type);
        appendIfNotNull(sbM53374o, "eventType", this.eventType);
        appendIfNotNull(sbM53374o, "stage", this.stage);
        appendIfNotNull(sbM53374o, "outcome", this.outcome);
        appendIfNotNull(sbM53374o, "callSessionId", this.callSessionId);
        appendIfNotNull(sbM53374o, "stageId", this.stageId);
        appendIfNotNull(sbM53374o, "userSessionId", this.userSessionId);
        appendIfNotNull(sbM53374o, "joinAttemptId", this.joinAttemptId);
        appendIfNotNull(sbM53374o, "joinReason", this.joinReason);
        appendIfNotNull(sbM53374o, "coordinatorConnectId", this.coordinatorConnectId);
        appendIfNotNull(sbM53374o, "userId", this.userId);
        appendIfNotNull(sbM53374o, "sfuId", this.sfuId);
        appendIfNotNull(sbM53374o, "peerConnection", this.peerConnection);
        appendIfNotNull(sbM53374o, "iceState", this.iceState);
        appendIfNotNull(sbM53374o, "retryCountAttempt", this.retryCountAttempt);
        appendIfNotNull(sbM53374o, "retryFailureCode", this.retryFailureCode);
        appendIfNotNull(sbM53374o, "retryFailureReason", this.retryFailureReason);
        appendIfNotNull(sbM53374o, "elapsedTime", this.elapsedTime);
        appendIfNotNull(sbM53374o, "wasPreviouslyConnected", this.wasPreviouslyConnected);
        appendIfNotNull(sbM53374o, "previouslyConnectedTimestamp", this.previouslyConnectedTimestamp);
        appendIfNotNull(sbM53374o, "sdkVersion", this.sdkVersion);
        appendIfNotNull(sbM53374o, "timestamp", this.timestamp);
        appendIfNotNull(sbM53374o, "cameraPermissionStatus", this.cameraPermissionStatus);
        appendIfNotNull(sbM53374o, "microphonePermissionStatus", this.microphonePermissionStatus);
        appendIfNotNull(sbM53374o, "screenShareStatus", this.screenShareStatus);
        appendIfNotNull(sbM53374o, "trackId", this.trackId);
        sbM53374o.append(")");
        String string = sbM53374o.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    public String toString() {
        String str = this.callSessionId;
        String str2 = this.cameraPermissionStatus;
        String str3 = this.coordinatorConnectId;
        String str4 = this.joinReason;
        Integer num = this.elapsedTime;
        String str5 = this.eventType;
        String str6 = this.iceState;
        String str7 = this.id;
        String str8 = this.joinAttemptId;
        String str9 = this.microphonePermissionStatus;
        String str10 = this.outcome;
        String str11 = this.peerConnection;
        C21682i c21682i = this.previouslyConnectedTimestamp;
        Integer num2 = this.retryCountAttempt;
        String str12 = this.retryFailureCode;
        String str13 = this.retryFailureReason;
        String str14 = this.screenShareStatus;
        String str15 = this.sdkVersion;
        String str16 = this.sfuId;
        String str17 = this.stage;
        String str18 = this.stageId;
        C21682i c21682i2 = this.timestamp;
        String str19 = this.trackId;
        String str20 = this.type;
        String str21 = this.userAgent;
        String str22 = this.userId;
        String str23 = this.userSessionId;
        Boolean bool = this.wasPreviouslyConnected;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ClientEvent(callSessionId=", str, ", cameraPermissionStatus=", str2, ", coordinatorConnectId=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", joinReason=", str4, ", elapsedTime=");
        AbstractC13673n.m38577x(num, ", eventType=", str5, ", iceState=", sbM32001t);
        AbstractC11266d.m30444B(sbM32001t, str6, ", id=", str7, ", joinAttemptId=");
        AbstractC11266d.m30444B(sbM32001t, str8, ", microphonePermissionStatus=", str9, ", outcome=");
        AbstractC11266d.m30444B(sbM32001t, str10, ", peerConnection=", str11, ", previouslyConnectedTimestamp=");
        sbM32001t.append(c21682i);
        sbM32001t.append(", retryCountAttempt=");
        sbM32001t.append(num2);
        sbM32001t.append(", retryFailureCode=");
        AbstractC11266d.m30444B(sbM32001t, str12, ", retryFailureReason=", str13, ", screenShareStatus=");
        AbstractC11266d.m30444B(sbM32001t, str14, ", sdkVersion=", str15, ", sfuId=");
        AbstractC11266d.m30444B(sbM32001t, str16, ", stage=", str17, ", stageId=");
        sbM32001t.append(str18);
        sbM32001t.append(", timestamp=");
        sbM32001t.append(c21682i2);
        sbM32001t.append(", trackId=");
        AbstractC11266d.m30444B(sbM32001t, str19, ", type=", str20, ", userAgent=");
        AbstractC11266d.m30444B(sbM32001t, str21, ", userId=", str22, ", userSessionId=");
        sbM32001t.append(str23);
        sbM32001t.append(", wasPreviouslyConnected=");
        sbM32001t.append(bool);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ClientEvent(@InterfaceC30731q(name = "call_session_id") String str, @InterfaceC30731q(name = "camera_permission_status") String str2, @InterfaceC30731q(name = "coordinator_connect_id") String str3, @InterfaceC30731q(name = "join_reason") String str4, @InterfaceC30731q(name = "elapsed_time") Integer num, @InterfaceC30731q(name = "event_type") String str5, @InterfaceC30731q(name = "ice_state") String str6, @InterfaceC30731q(name = "id") String str7, @InterfaceC30731q(name = "join_attempt_id") String str8, @InterfaceC30731q(name = "microphone_permission_status") String str9, @InterfaceC30731q(name = "outcome") String str10, @InterfaceC30731q(name = "peer_connection") String str11, @InterfaceC30731q(name = "previously_connected_timestamp") C21682i c21682i, @InterfaceC30731q(name = "retry_count_attempt") Integer num2, @InterfaceC30731q(name = "retry_failure_code") String str12, @InterfaceC30731q(name = "retry_failure_reason") String str13, @InterfaceC30731q(name = "screen_share_status") String str14, @InterfaceC30731q(name = "sdk_version") String str15, @InterfaceC30731q(name = "sfu_id") String str16, @InterfaceC30731q(name = "stage") String str17, @InterfaceC30731q(name = "stage_id") String str18, @InterfaceC30731q(name = "timestamp") C21682i c21682i2, @InterfaceC30731q(name = "track_id") String str19, @InterfaceC30731q(name = "type") String str20, @InterfaceC30731q(name = "user_agent") String str21, @InterfaceC30731q(name = "user_id") String str22, @InterfaceC30731q(name = "user_session_id") String str23, @InterfaceC30731q(name = "was_previously_connected") Boolean bool) {
        this.callSessionId = str;
        this.cameraPermissionStatus = str2;
        this.coordinatorConnectId = str3;
        this.joinReason = str4;
        this.elapsedTime = num;
        this.eventType = str5;
        this.iceState = str6;
        this.id = str7;
        this.joinAttemptId = str8;
        this.microphonePermissionStatus = str9;
        this.outcome = str10;
        this.peerConnection = str11;
        this.previouslyConnectedTimestamp = c21682i;
        this.retryCountAttempt = num2;
        this.retryFailureCode = str12;
        this.retryFailureReason = str13;
        this.screenShareStatus = str14;
        this.sdkVersion = str15;
        this.sfuId = str16;
        this.stage = str17;
        this.stageId = str18;
        this.timestamp = c21682i2;
        this.trackId = str19;
        this.type = str20;
        this.userAgent = str21;
        this.userId = str22;
        this.userSessionId = str23;
        this.wasPreviouslyConnected = bool;
    }

    public /* synthetic */ ClientEvent(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, String str8, String str9, String str10, String str11, C21682i c21682i, Integer num2, String str12, String str13, String str14, String str15, String str16, String str17, String str18, C21682i c21682i2, String str19, String str20, String str21, String str22, String str23, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : num, (i13 & 32) != 0 ? null : str5, (i13 & 64) != 0 ? null : str6, (i13 & 128) != 0 ? null : str7, (i13 & 256) != 0 ? null : str8, (i13 & 512) != 0 ? null : str9, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str10, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str11, (i13 & 4096) != 0 ? null : c21682i, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : num2, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : str12, (i13 & 32768) != 0 ? null : str13, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? null : str14, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? null : str15, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? null : str16, (i13 & 524288) != 0 ? null : str17, (i13 & 1048576) != 0 ? null : str18, (i13 & 2097152) != 0 ? null : c21682i2, (i13 & 4194304) != 0 ? null : str19, (i13 & 8388608) != 0 ? null : str20, (i13 & 16777216) != 0 ? null : str21, (i13 & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? null : str22, (i13 & 67108864) != 0 ? null : str23, (i13 & 134217728) != 0 ? null : bool);
    }
}
