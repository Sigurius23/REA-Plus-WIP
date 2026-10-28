package io.getstream.android.video.generated.models;

import androidx.core.app.FrameMetricsAggregator;
import c13.AbstractC3855a;
import p319m4.AbstractC25012a;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jz\u0010#\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0016\u0010\u0011R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u0011R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000f¨\u0006*"}, m65681d2 = {"Lio/getstream/android/video/generated/models/GoLiveRequest;", "", "recordingStorageName", "", "startClosedCaption", "", "startCompositeRecording", "startHls", "startIndividualRecording", "startRawRecording", "startRecording", "startTranscription", "transcriptionStorageName", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "getRecordingStorageName", "()Ljava/lang/String;", "getStartClosedCaption", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getStartCompositeRecording", "getStartHls", "getStartIndividualRecording", "getStartRawRecording", "getStartRecording", "getStartTranscription", "getTranscriptionStorageName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lio/getstream/android/video/generated/models/GoLiveRequest;", "equals", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class GoLiveRequest {
    private final String recordingStorageName;
    private final Boolean startClosedCaption;
    private final Boolean startCompositeRecording;
    private final Boolean startHls;
    private final Boolean startIndividualRecording;
    private final Boolean startRawRecording;
    private final Boolean startRecording;
    private final Boolean startTranscription;
    private final String transcriptionStorageName;

    public GoLiveRequest() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public static /* synthetic */ GoLiveRequest copy$default(GoLiveRequest goLiveRequest, String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = goLiveRequest.recordingStorageName;
        }
        if ((i13 & 2) != 0) {
            bool = goLiveRequest.startClosedCaption;
        }
        if ((i13 & 4) != 0) {
            bool2 = goLiveRequest.startCompositeRecording;
        }
        if ((i13 & 8) != 0) {
            bool3 = goLiveRequest.startHls;
        }
        if ((i13 & 16) != 0) {
            bool4 = goLiveRequest.startIndividualRecording;
        }
        if ((i13 & 32) != 0) {
            bool5 = goLiveRequest.startRawRecording;
        }
        if ((i13 & 64) != 0) {
            bool6 = goLiveRequest.startRecording;
        }
        if ((i13 & 128) != 0) {
            bool7 = goLiveRequest.startTranscription;
        }
        if ((i13 & 256) != 0) {
            str2 = goLiveRequest.transcriptionStorageName;
        }
        Boolean bool8 = bool7;
        String str3 = str2;
        Boolean bool9 = bool5;
        Boolean bool10 = bool6;
        Boolean bool11 = bool4;
        Boolean bool12 = bool2;
        return goLiveRequest.copy(str, bool, bool12, bool3, bool11, bool9, bool10, bool8, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRecordingStorageName() {
        return this.recordingStorageName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getStartClosedCaption() {
        return this.startClosedCaption;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getStartCompositeRecording() {
        return this.startCompositeRecording;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getStartHls() {
        return this.startHls;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getStartIndividualRecording() {
        return this.startIndividualRecording;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getStartRawRecording() {
        return this.startRawRecording;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getStartRecording() {
        return this.startRecording;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getStartTranscription() {
        return this.startTranscription;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTranscriptionStorageName() {
        return this.transcriptionStorageName;
    }

    public final GoLiveRequest copy(@InterfaceC30731q(name = "recording_storage_name") String recordingStorageName, @InterfaceC30731q(name = "start_closed_caption") Boolean startClosedCaption, @InterfaceC30731q(name = "start_composite_recording") Boolean startCompositeRecording, @InterfaceC30731q(name = "start_hls") Boolean startHls, @InterfaceC30731q(name = "start_individual_recording") Boolean startIndividualRecording, @InterfaceC30731q(name = "start_raw_recording") Boolean startRawRecording, @InterfaceC30731q(name = "start_recording") Boolean startRecording, @InterfaceC30731q(name = "start_transcription") Boolean startTranscription, @InterfaceC30731q(name = "transcription_storage_name") String transcriptionStorageName) {
        return new GoLiveRequest(recordingStorageName, startClosedCaption, startCompositeRecording, startHls, startIndividualRecording, startRawRecording, startRecording, startTranscription, transcriptionStorageName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoLiveRequest)) {
            return false;
        }
        GoLiveRequest goLiveRequest = (GoLiveRequest) other;
        return AbstractC22676k.m65745e(this.recordingStorageName, goLiveRequest.recordingStorageName) && AbstractC22676k.m65745e(this.startClosedCaption, goLiveRequest.startClosedCaption) && AbstractC22676k.m65745e(this.startCompositeRecording, goLiveRequest.startCompositeRecording) && AbstractC22676k.m65745e(this.startHls, goLiveRequest.startHls) && AbstractC22676k.m65745e(this.startIndividualRecording, goLiveRequest.startIndividualRecording) && AbstractC22676k.m65745e(this.startRawRecording, goLiveRequest.startRawRecording) && AbstractC22676k.m65745e(this.startRecording, goLiveRequest.startRecording) && AbstractC22676k.m65745e(this.startTranscription, goLiveRequest.startTranscription) && AbstractC22676k.m65745e(this.transcriptionStorageName, goLiveRequest.transcriptionStorageName);
    }

    public final String getRecordingStorageName() {
        return this.recordingStorageName;
    }

    public final Boolean getStartClosedCaption() {
        return this.startClosedCaption;
    }

    public final Boolean getStartCompositeRecording() {
        return this.startCompositeRecording;
    }

    public final Boolean getStartHls() {
        return this.startHls;
    }

    public final Boolean getStartIndividualRecording() {
        return this.startIndividualRecording;
    }

    public final Boolean getStartRawRecording() {
        return this.startRawRecording;
    }

    public final Boolean getStartRecording() {
        return this.startRecording;
    }

    public final Boolean getStartTranscription() {
        return this.startTranscription;
    }

    public final String getTranscriptionStorageName() {
        return this.transcriptionStorageName;
    }

    public int hashCode() {
        String str = this.recordingStorageName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.startClosedCaption;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.startCompositeRecording;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.startHls;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.startIndividualRecording;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.startRawRecording;
        int iHashCode6 = (iHashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.startRecording;
        int iHashCode7 = (iHashCode6 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.startTranscription;
        int iHashCode8 = (iHashCode7 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str2 = this.transcriptionStorageName;
        return iHashCode8 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.recordingStorageName;
        Boolean bool = this.startClosedCaption;
        Boolean bool2 = this.startCompositeRecording;
        Boolean bool3 = this.startHls;
        Boolean bool4 = this.startIndividualRecording;
        Boolean bool5 = this.startRawRecording;
        Boolean bool6 = this.startRecording;
        Boolean bool7 = this.startTranscription;
        String str2 = this.transcriptionStorageName;
        StringBuilder sb4 = new StringBuilder("GoLiveRequest(recordingStorageName=");
        sb4.append(str);
        sb4.append(", startClosedCaption=");
        sb4.append(bool);
        sb4.append(", startCompositeRecording=");
        AbstractC3855a.m11839w(sb4, bool2, ", startHls=", bool3, ", startIndividualRecording=");
        AbstractC3855a.m11839w(sb4, bool4, ", startRawRecording=", bool5, ", startRecording=");
        AbstractC3855a.m11839w(sb4, bool6, ", startTranscription=", bool7, ", transcriptionStorageName=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }

    public GoLiveRequest(@InterfaceC30731q(name = "recording_storage_name") String str, @InterfaceC30731q(name = "start_closed_caption") Boolean bool, @InterfaceC30731q(name = "start_composite_recording") Boolean bool2, @InterfaceC30731q(name = "start_hls") Boolean bool3, @InterfaceC30731q(name = "start_individual_recording") Boolean bool4, @InterfaceC30731q(name = "start_raw_recording") Boolean bool5, @InterfaceC30731q(name = "start_recording") Boolean bool6, @InterfaceC30731q(name = "start_transcription") Boolean bool7, @InterfaceC30731q(name = "transcription_storage_name") String str2) {
        this.recordingStorageName = str;
        this.startClosedCaption = bool;
        this.startCompositeRecording = bool2;
        this.startHls = bool3;
        this.startIndividualRecording = bool4;
        this.startRawRecording = bool5;
        this.startRecording = bool6;
        this.startTranscription = bool7;
        this.transcriptionStorageName = str2;
    }

    public /* synthetic */ GoLiveRequest(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : bool, (i13 & 4) != 0 ? null : bool2, (i13 & 8) != 0 ? null : bool3, (i13 & 16) != 0 ? null : bool4, (i13 & 32) != 0 ? null : bool5, (i13 & 64) != 0 ? null : bool6, (i13 & 128) != 0 ? null : bool7, (i13 & 256) != 0 ? null : str2);
    }
}
