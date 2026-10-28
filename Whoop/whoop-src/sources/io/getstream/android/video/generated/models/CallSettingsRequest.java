package io.getstream.android.video.generated.models;

import no.nordicsemi.android.dfu.DfuBaseService;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010!¢\u0006\u0002\u0010\"J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010!HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0013HÆ\u0003JÉ\u0001\u0010S\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010!HÆ\u0001J\u0013\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010W\u001a\u00020XHÖ\u0001J\t\u0010Y\u001a\u00020ZHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bA\u0010B¨\u0006["}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallSettingsRequest;", "", "audio", "Lio/getstream/android/video/generated/models/AudioSettingsRequest;", "backstage", "Lio/getstream/android/video/generated/models/BackstageSettingsRequest;", "broadcasting", "Lio/getstream/android/video/generated/models/BroadcastSettingsRequest;", "frameRecording", "Lio/getstream/android/video/generated/models/FrameRecordingSettingsRequest;", "geofencing", "Lio/getstream/android/video/generated/models/GeofenceSettingsRequest;", "individualRecording", "Lio/getstream/android/video/generated/models/IndividualRecordingSettingsRequest;", "ingress", "Lio/getstream/android/video/generated/models/IngressSettingsRequest;", "limits", "Lio/getstream/android/video/generated/models/LimitsSettingsRequest;", "rawRecording", "Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest;", "recording", "Lio/getstream/android/video/generated/models/RecordSettingsRequest;", "ring", "Lio/getstream/android/video/generated/models/RingSettingsRequest;", "screensharing", "Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;", "session", "Lio/getstream/android/video/generated/models/SessionSettingsRequest;", "thumbnails", "Lio/getstream/android/video/generated/models/ThumbnailsSettingsRequest;", "transcription", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest;", "video", "Lio/getstream/android/video/generated/models/VideoSettingsRequest;", "(Lio/getstream/android/video/generated/models/AudioSettingsRequest;Lio/getstream/android/video/generated/models/BackstageSettingsRequest;Lio/getstream/android/video/generated/models/BroadcastSettingsRequest;Lio/getstream/android/video/generated/models/FrameRecordingSettingsRequest;Lio/getstream/android/video/generated/models/GeofenceSettingsRequest;Lio/getstream/android/video/generated/models/IndividualRecordingSettingsRequest;Lio/getstream/android/video/generated/models/IngressSettingsRequest;Lio/getstream/android/video/generated/models/LimitsSettingsRequest;Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest;Lio/getstream/android/video/generated/models/RecordSettingsRequest;Lio/getstream/android/video/generated/models/RingSettingsRequest;Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;Lio/getstream/android/video/generated/models/SessionSettingsRequest;Lio/getstream/android/video/generated/models/ThumbnailsSettingsRequest;Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest;Lio/getstream/android/video/generated/models/VideoSettingsRequest;)V", "getAudio", "()Lio/getstream/android/video/generated/models/AudioSettingsRequest;", "getBackstage", "()Lio/getstream/android/video/generated/models/BackstageSettingsRequest;", "getBroadcasting", "()Lio/getstream/android/video/generated/models/BroadcastSettingsRequest;", "getFrameRecording", "()Lio/getstream/android/video/generated/models/FrameRecordingSettingsRequest;", "getGeofencing", "()Lio/getstream/android/video/generated/models/GeofenceSettingsRequest;", "getIndividualRecording", "()Lio/getstream/android/video/generated/models/IndividualRecordingSettingsRequest;", "getIngress", "()Lio/getstream/android/video/generated/models/IngressSettingsRequest;", "getLimits", "()Lio/getstream/android/video/generated/models/LimitsSettingsRequest;", "getRawRecording", "()Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest;", "getRecording", "()Lio/getstream/android/video/generated/models/RecordSettingsRequest;", "getRing", "()Lio/getstream/android/video/generated/models/RingSettingsRequest;", "getScreensharing", "()Lio/getstream/android/video/generated/models/ScreensharingSettingsRequest;", "getSession", "()Lio/getstream/android/video/generated/models/SessionSettingsRequest;", "getThumbnails", "()Lio/getstream/android/video/generated/models/ThumbnailsSettingsRequest;", "getTranscription", "()Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest;", "getVideo", "()Lio/getstream/android/video/generated/models/VideoSettingsRequest;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CallSettingsRequest {
    private final AudioSettingsRequest audio;
    private final BackstageSettingsRequest backstage;
    private final BroadcastSettingsRequest broadcasting;
    private final FrameRecordingSettingsRequest frameRecording;
    private final GeofenceSettingsRequest geofencing;
    private final IndividualRecordingSettingsRequest individualRecording;
    private final IngressSettingsRequest ingress;
    private final LimitsSettingsRequest limits;
    private final RawRecordingSettingsRequest rawRecording;
    private final RecordSettingsRequest recording;
    private final RingSettingsRequest ring;
    private final ScreensharingSettingsRequest screensharing;
    private final SessionSettingsRequest session;
    private final ThumbnailsSettingsRequest thumbnails;
    private final TranscriptionSettingsRequest transcription;
    private final VideoSettingsRequest video;

    public CallSettingsRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AudioSettingsRequest getAudio() {
        return this.audio;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final RecordSettingsRequest getRecording() {
        return this.recording;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final RingSettingsRequest getRing() {
        return this.ring;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final ScreensharingSettingsRequest getScreensharing() {
        return this.screensharing;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final SessionSettingsRequest getSession() {
        return this.session;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final ThumbnailsSettingsRequest getThumbnails() {
        return this.thumbnails;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final TranscriptionSettingsRequest getTranscription() {
        return this.transcription;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final VideoSettingsRequest getVideo() {
        return this.video;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BackstageSettingsRequest getBackstage() {
        return this.backstage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BroadcastSettingsRequest getBroadcasting() {
        return this.broadcasting;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FrameRecordingSettingsRequest getFrameRecording() {
        return this.frameRecording;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final GeofenceSettingsRequest getGeofencing() {
        return this.geofencing;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final IndividualRecordingSettingsRequest getIndividualRecording() {
        return this.individualRecording;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final IngressSettingsRequest getIngress() {
        return this.ingress;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final LimitsSettingsRequest getLimits() {
        return this.limits;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final RawRecordingSettingsRequest getRawRecording() {
        return this.rawRecording;
    }

    public final CallSettingsRequest copy(@InterfaceC30731q(name = "audio") AudioSettingsRequest audio, @InterfaceC30731q(name = "backstage") BackstageSettingsRequest backstage, @InterfaceC30731q(name = "broadcasting") BroadcastSettingsRequest broadcasting, @InterfaceC30731q(name = "frame_recording") FrameRecordingSettingsRequest frameRecording, @InterfaceC30731q(name = "geofencing") GeofenceSettingsRequest geofencing, @InterfaceC30731q(name = "individual_recording") IndividualRecordingSettingsRequest individualRecording, @InterfaceC30731q(name = "ingress") IngressSettingsRequest ingress, @InterfaceC30731q(name = "limits") LimitsSettingsRequest limits, @InterfaceC30731q(name = "raw_recording") RawRecordingSettingsRequest rawRecording, @InterfaceC30731q(name = "recording") RecordSettingsRequest recording, @InterfaceC30731q(name = "ring") RingSettingsRequest ring, @InterfaceC30731q(name = "screensharing") ScreensharingSettingsRequest screensharing, @InterfaceC30731q(name = "session") SessionSettingsRequest session, @InterfaceC30731q(name = "thumbnails") ThumbnailsSettingsRequest thumbnails, @InterfaceC30731q(name = "transcription") TranscriptionSettingsRequest transcription, @InterfaceC30731q(name = "video") VideoSettingsRequest video) {
        return new CallSettingsRequest(audio, backstage, broadcasting, frameRecording, geofencing, individualRecording, ingress, limits, rawRecording, recording, ring, screensharing, session, thumbnails, transcription, video);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallSettingsRequest)) {
            return false;
        }
        CallSettingsRequest callSettingsRequest = (CallSettingsRequest) other;
        return AbstractC22676k.m65745e(this.audio, callSettingsRequest.audio) && AbstractC22676k.m65745e(this.backstage, callSettingsRequest.backstage) && AbstractC22676k.m65745e(this.broadcasting, callSettingsRequest.broadcasting) && AbstractC22676k.m65745e(this.frameRecording, callSettingsRequest.frameRecording) && AbstractC22676k.m65745e(this.geofencing, callSettingsRequest.geofencing) && AbstractC22676k.m65745e(this.individualRecording, callSettingsRequest.individualRecording) && AbstractC22676k.m65745e(this.ingress, callSettingsRequest.ingress) && AbstractC22676k.m65745e(this.limits, callSettingsRequest.limits) && AbstractC22676k.m65745e(this.rawRecording, callSettingsRequest.rawRecording) && AbstractC22676k.m65745e(this.recording, callSettingsRequest.recording) && AbstractC22676k.m65745e(this.ring, callSettingsRequest.ring) && AbstractC22676k.m65745e(this.screensharing, callSettingsRequest.screensharing) && AbstractC22676k.m65745e(this.session, callSettingsRequest.session) && AbstractC22676k.m65745e(this.thumbnails, callSettingsRequest.thumbnails) && AbstractC22676k.m65745e(this.transcription, callSettingsRequest.transcription) && AbstractC22676k.m65745e(this.video, callSettingsRequest.video);
    }

    public final AudioSettingsRequest getAudio() {
        return this.audio;
    }

    public final BackstageSettingsRequest getBackstage() {
        return this.backstage;
    }

    public final BroadcastSettingsRequest getBroadcasting() {
        return this.broadcasting;
    }

    public final FrameRecordingSettingsRequest getFrameRecording() {
        return this.frameRecording;
    }

    public final GeofenceSettingsRequest getGeofencing() {
        return this.geofencing;
    }

    public final IndividualRecordingSettingsRequest getIndividualRecording() {
        return this.individualRecording;
    }

    public final IngressSettingsRequest getIngress() {
        return this.ingress;
    }

    public final LimitsSettingsRequest getLimits() {
        return this.limits;
    }

    public final RawRecordingSettingsRequest getRawRecording() {
        return this.rawRecording;
    }

    public final RecordSettingsRequest getRecording() {
        return this.recording;
    }

    public final RingSettingsRequest getRing() {
        return this.ring;
    }

    public final ScreensharingSettingsRequest getScreensharing() {
        return this.screensharing;
    }

    public final SessionSettingsRequest getSession() {
        return this.session;
    }

    public final ThumbnailsSettingsRequest getThumbnails() {
        return this.thumbnails;
    }

    public final TranscriptionSettingsRequest getTranscription() {
        return this.transcription;
    }

    public final VideoSettingsRequest getVideo() {
        return this.video;
    }

    public int hashCode() {
        AudioSettingsRequest audioSettingsRequest = this.audio;
        int iHashCode = (audioSettingsRequest == null ? 0 : audioSettingsRequest.hashCode()) * 31;
        BackstageSettingsRequest backstageSettingsRequest = this.backstage;
        int iHashCode2 = (iHashCode + (backstageSettingsRequest == null ? 0 : backstageSettingsRequest.hashCode())) * 31;
        BroadcastSettingsRequest broadcastSettingsRequest = this.broadcasting;
        int iHashCode3 = (iHashCode2 + (broadcastSettingsRequest == null ? 0 : broadcastSettingsRequest.hashCode())) * 31;
        FrameRecordingSettingsRequest frameRecordingSettingsRequest = this.frameRecording;
        int iHashCode4 = (iHashCode3 + (frameRecordingSettingsRequest == null ? 0 : frameRecordingSettingsRequest.hashCode())) * 31;
        GeofenceSettingsRequest geofenceSettingsRequest = this.geofencing;
        int iHashCode5 = (iHashCode4 + (geofenceSettingsRequest == null ? 0 : geofenceSettingsRequest.hashCode())) * 31;
        IndividualRecordingSettingsRequest individualRecordingSettingsRequest = this.individualRecording;
        int iHashCode6 = (iHashCode5 + (individualRecordingSettingsRequest == null ? 0 : individualRecordingSettingsRequest.hashCode())) * 31;
        IngressSettingsRequest ingressSettingsRequest = this.ingress;
        int iHashCode7 = (iHashCode6 + (ingressSettingsRequest == null ? 0 : ingressSettingsRequest.hashCode())) * 31;
        LimitsSettingsRequest limitsSettingsRequest = this.limits;
        int iHashCode8 = (iHashCode7 + (limitsSettingsRequest == null ? 0 : limitsSettingsRequest.hashCode())) * 31;
        RawRecordingSettingsRequest rawRecordingSettingsRequest = this.rawRecording;
        int iHashCode9 = (iHashCode8 + (rawRecordingSettingsRequest == null ? 0 : rawRecordingSettingsRequest.hashCode())) * 31;
        RecordSettingsRequest recordSettingsRequest = this.recording;
        int iHashCode10 = (iHashCode9 + (recordSettingsRequest == null ? 0 : recordSettingsRequest.hashCode())) * 31;
        RingSettingsRequest ringSettingsRequest = this.ring;
        int iHashCode11 = (iHashCode10 + (ringSettingsRequest == null ? 0 : ringSettingsRequest.hashCode())) * 31;
        ScreensharingSettingsRequest screensharingSettingsRequest = this.screensharing;
        int iHashCode12 = (iHashCode11 + (screensharingSettingsRequest == null ? 0 : screensharingSettingsRequest.hashCode())) * 31;
        SessionSettingsRequest sessionSettingsRequest = this.session;
        int iHashCode13 = (iHashCode12 + (sessionSettingsRequest == null ? 0 : sessionSettingsRequest.hashCode())) * 31;
        ThumbnailsSettingsRequest thumbnailsSettingsRequest = this.thumbnails;
        int iHashCode14 = (iHashCode13 + (thumbnailsSettingsRequest == null ? 0 : thumbnailsSettingsRequest.hashCode())) * 31;
        TranscriptionSettingsRequest transcriptionSettingsRequest = this.transcription;
        int iHashCode15 = (iHashCode14 + (transcriptionSettingsRequest == null ? 0 : transcriptionSettingsRequest.hashCode())) * 31;
        VideoSettingsRequest videoSettingsRequest = this.video;
        return iHashCode15 + (videoSettingsRequest != null ? videoSettingsRequest.hashCode() : 0);
    }

    public String toString() {
        return "CallSettingsRequest(audio=" + this.audio + ", backstage=" + this.backstage + ", broadcasting=" + this.broadcasting + ", frameRecording=" + this.frameRecording + ", geofencing=" + this.geofencing + ", individualRecording=" + this.individualRecording + ", ingress=" + this.ingress + ", limits=" + this.limits + ", rawRecording=" + this.rawRecording + ", recording=" + this.recording + ", ring=" + this.ring + ", screensharing=" + this.screensharing + ", session=" + this.session + ", thumbnails=" + this.thumbnails + ", transcription=" + this.transcription + ", video=" + this.video + ")";
    }

    public CallSettingsRequest(@InterfaceC30731q(name = "audio") AudioSettingsRequest audioSettingsRequest, @InterfaceC30731q(name = "backstage") BackstageSettingsRequest backstageSettingsRequest, @InterfaceC30731q(name = "broadcasting") BroadcastSettingsRequest broadcastSettingsRequest, @InterfaceC30731q(name = "frame_recording") FrameRecordingSettingsRequest frameRecordingSettingsRequest, @InterfaceC30731q(name = "geofencing") GeofenceSettingsRequest geofenceSettingsRequest, @InterfaceC30731q(name = "individual_recording") IndividualRecordingSettingsRequest individualRecordingSettingsRequest, @InterfaceC30731q(name = "ingress") IngressSettingsRequest ingressSettingsRequest, @InterfaceC30731q(name = "limits") LimitsSettingsRequest limitsSettingsRequest, @InterfaceC30731q(name = "raw_recording") RawRecordingSettingsRequest rawRecordingSettingsRequest, @InterfaceC30731q(name = "recording") RecordSettingsRequest recordSettingsRequest, @InterfaceC30731q(name = "ring") RingSettingsRequest ringSettingsRequest, @InterfaceC30731q(name = "screensharing") ScreensharingSettingsRequest screensharingSettingsRequest, @InterfaceC30731q(name = "session") SessionSettingsRequest sessionSettingsRequest, @InterfaceC30731q(name = "thumbnails") ThumbnailsSettingsRequest thumbnailsSettingsRequest, @InterfaceC30731q(name = "transcription") TranscriptionSettingsRequest transcriptionSettingsRequest, @InterfaceC30731q(name = "video") VideoSettingsRequest videoSettingsRequest) {
        this.audio = audioSettingsRequest;
        this.backstage = backstageSettingsRequest;
        this.broadcasting = broadcastSettingsRequest;
        this.frameRecording = frameRecordingSettingsRequest;
        this.geofencing = geofenceSettingsRequest;
        this.individualRecording = individualRecordingSettingsRequest;
        this.ingress = ingressSettingsRequest;
        this.limits = limitsSettingsRequest;
        this.rawRecording = rawRecordingSettingsRequest;
        this.recording = recordSettingsRequest;
        this.ring = ringSettingsRequest;
        this.screensharing = screensharingSettingsRequest;
        this.session = sessionSettingsRequest;
        this.thumbnails = thumbnailsSettingsRequest;
        this.transcription = transcriptionSettingsRequest;
        this.video = videoSettingsRequest;
    }

    public /* synthetic */ CallSettingsRequest(AudioSettingsRequest audioSettingsRequest, BackstageSettingsRequest backstageSettingsRequest, BroadcastSettingsRequest broadcastSettingsRequest, FrameRecordingSettingsRequest frameRecordingSettingsRequest, GeofenceSettingsRequest geofenceSettingsRequest, IndividualRecordingSettingsRequest individualRecordingSettingsRequest, IngressSettingsRequest ingressSettingsRequest, LimitsSettingsRequest limitsSettingsRequest, RawRecordingSettingsRequest rawRecordingSettingsRequest, RecordSettingsRequest recordSettingsRequest, RingSettingsRequest ringSettingsRequest, ScreensharingSettingsRequest screensharingSettingsRequest, SessionSettingsRequest sessionSettingsRequest, ThumbnailsSettingsRequest thumbnailsSettingsRequest, TranscriptionSettingsRequest transcriptionSettingsRequest, VideoSettingsRequest videoSettingsRequest, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : audioSettingsRequest, (i13 & 2) != 0 ? null : backstageSettingsRequest, (i13 & 4) != 0 ? null : broadcastSettingsRequest, (i13 & 8) != 0 ? null : frameRecordingSettingsRequest, (i13 & 16) != 0 ? null : geofenceSettingsRequest, (i13 & 32) != 0 ? null : individualRecordingSettingsRequest, (i13 & 64) != 0 ? null : ingressSettingsRequest, (i13 & 128) != 0 ? null : limitsSettingsRequest, (i13 & 256) != 0 ? null : rawRecordingSettingsRequest, (i13 & 512) != 0 ? null : recordSettingsRequest, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : ringSettingsRequest, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : screensharingSettingsRequest, (i13 & 4096) != 0 ? null : sessionSettingsRequest, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : thumbnailsSettingsRequest, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : transcriptionSettingsRequest, (i13 & 32768) != 0 ? null : videoSettingsRequest);
    }
}
