package io.getstream.android.video.generated.models;

import java.util.List;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0010HÆ\u0003J_\u0010'\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010(\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006."}, m65681d2 = {"Lio/getstream/android/video/generated/models/EgressResponse;", "", "broadcasting", "", "rtmps", "", "Lio/getstream/android/video/generated/models/EgressRTMPResponse;", "compositeRecording", "Lio/getstream/android/video/generated/models/CompositeRecordingResponse;", "frameRecording", "Lio/getstream/android/video/generated/models/FrameRecordingResponse;", "hls", "Lio/getstream/android/video/generated/models/EgressHLSResponse;", "individualRecording", "Lio/getstream/android/video/generated/models/IndividualRecordingResponse;", "rawRecording", "Lio/getstream/android/video/generated/models/RawRecordingResponse;", "(ZLjava/util/List;Lio/getstream/android/video/generated/models/CompositeRecordingResponse;Lio/getstream/android/video/generated/models/FrameRecordingResponse;Lio/getstream/android/video/generated/models/EgressHLSResponse;Lio/getstream/android/video/generated/models/IndividualRecordingResponse;Lio/getstream/android/video/generated/models/RawRecordingResponse;)V", "getBroadcasting", "()Z", "getCompositeRecording", "()Lio/getstream/android/video/generated/models/CompositeRecordingResponse;", "getFrameRecording", "()Lio/getstream/android/video/generated/models/FrameRecordingResponse;", "getHls", "()Lio/getstream/android/video/generated/models/EgressHLSResponse;", "getIndividualRecording", "()Lio/getstream/android/video/generated/models/IndividualRecordingResponse;", "getRawRecording", "()Lio/getstream/android/video/generated/models/RawRecordingResponse;", "getRtmps", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class EgressResponse {
    private final boolean broadcasting;
    private final CompositeRecordingResponse compositeRecording;
    private final FrameRecordingResponse frameRecording;
    private final EgressHLSResponse hls;
    private final IndividualRecordingResponse individualRecording;
    private final RawRecordingResponse rawRecording;
    private final List<EgressRTMPResponse> rtmps;

    public EgressResponse(@InterfaceC30731q(name = "broadcasting") boolean z4, @InterfaceC30731q(name = "rtmps") List<EgressRTMPResponse> rtmps, @InterfaceC30731q(name = "composite_recording") CompositeRecordingResponse compositeRecordingResponse, @InterfaceC30731q(name = "frame_recording") FrameRecordingResponse frameRecordingResponse, @InterfaceC30731q(name = "hls") EgressHLSResponse egressHLSResponse, @InterfaceC30731q(name = "individual_recording") IndividualRecordingResponse individualRecordingResponse, @InterfaceC30731q(name = "raw_recording") RawRecordingResponse rawRecordingResponse) {
        AbstractC22676k.m65750j(rtmps, "rtmps");
        this.broadcasting = z4;
        this.rtmps = rtmps;
        this.compositeRecording = compositeRecordingResponse;
        this.frameRecording = frameRecordingResponse;
        this.hls = egressHLSResponse;
        this.individualRecording = individualRecordingResponse;
        this.rawRecording = rawRecordingResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EgressResponse copy$default(EgressResponse egressResponse, boolean z4, List list, CompositeRecordingResponse compositeRecordingResponse, FrameRecordingResponse frameRecordingResponse, EgressHLSResponse egressHLSResponse, IndividualRecordingResponse individualRecordingResponse, RawRecordingResponse rawRecordingResponse, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = egressResponse.broadcasting;
        }
        if ((i13 & 2) != 0) {
            list = egressResponse.rtmps;
        }
        if ((i13 & 4) != 0) {
            compositeRecordingResponse = egressResponse.compositeRecording;
        }
        if ((i13 & 8) != 0) {
            frameRecordingResponse = egressResponse.frameRecording;
        }
        if ((i13 & 16) != 0) {
            egressHLSResponse = egressResponse.hls;
        }
        if ((i13 & 32) != 0) {
            individualRecordingResponse = egressResponse.individualRecording;
        }
        if ((i13 & 64) != 0) {
            rawRecordingResponse = egressResponse.rawRecording;
        }
        IndividualRecordingResponse individualRecordingResponse2 = individualRecordingResponse;
        RawRecordingResponse rawRecordingResponse2 = rawRecordingResponse;
        EgressHLSResponse egressHLSResponse2 = egressHLSResponse;
        CompositeRecordingResponse compositeRecordingResponse2 = compositeRecordingResponse;
        return egressResponse.copy(z4, list, compositeRecordingResponse2, frameRecordingResponse, egressHLSResponse2, individualRecordingResponse2, rawRecordingResponse2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getBroadcasting() {
        return this.broadcasting;
    }

    public final List<EgressRTMPResponse> component2() {
        return this.rtmps;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CompositeRecordingResponse getCompositeRecording() {
        return this.compositeRecording;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FrameRecordingResponse getFrameRecording() {
        return this.frameRecording;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final EgressHLSResponse getHls() {
        return this.hls;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final IndividualRecordingResponse getIndividualRecording() {
        return this.individualRecording;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final RawRecordingResponse getRawRecording() {
        return this.rawRecording;
    }

    public final EgressResponse copy(@InterfaceC30731q(name = "broadcasting") boolean broadcasting, @InterfaceC30731q(name = "rtmps") List<EgressRTMPResponse> rtmps, @InterfaceC30731q(name = "composite_recording") CompositeRecordingResponse compositeRecording, @InterfaceC30731q(name = "frame_recording") FrameRecordingResponse frameRecording, @InterfaceC30731q(name = "hls") EgressHLSResponse hls, @InterfaceC30731q(name = "individual_recording") IndividualRecordingResponse individualRecording, @InterfaceC30731q(name = "raw_recording") RawRecordingResponse rawRecording) {
        AbstractC22676k.m65750j(rtmps, "rtmps");
        return new EgressResponse(broadcasting, rtmps, compositeRecording, frameRecording, hls, individualRecording, rawRecording);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EgressResponse)) {
            return false;
        }
        EgressResponse egressResponse = (EgressResponse) other;
        return this.broadcasting == egressResponse.broadcasting && AbstractC22676k.m65745e(this.rtmps, egressResponse.rtmps) && AbstractC22676k.m65745e(this.compositeRecording, egressResponse.compositeRecording) && AbstractC22676k.m65745e(this.frameRecording, egressResponse.frameRecording) && AbstractC22676k.m65745e(this.hls, egressResponse.hls) && AbstractC22676k.m65745e(this.individualRecording, egressResponse.individualRecording) && AbstractC22676k.m65745e(this.rawRecording, egressResponse.rawRecording);
    }

    public final boolean getBroadcasting() {
        return this.broadcasting;
    }

    public final CompositeRecordingResponse getCompositeRecording() {
        return this.compositeRecording;
    }

    public final FrameRecordingResponse getFrameRecording() {
        return this.frameRecording;
    }

    public final EgressHLSResponse getHls() {
        return this.hls;
    }

    public final IndividualRecordingResponse getIndividualRecording() {
        return this.individualRecording;
    }

    public final RawRecordingResponse getRawRecording() {
        return this.rawRecording;
    }

    public final List<EgressRTMPResponse> getRtmps() {
        return this.rtmps;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(Boolean.hashCode(this.broadcasting) * 31, 31, this.rtmps);
        CompositeRecordingResponse compositeRecordingResponse = this.compositeRecording;
        int iHashCode = (iM31983b + (compositeRecordingResponse == null ? 0 : compositeRecordingResponse.hashCode())) * 31;
        FrameRecordingResponse frameRecordingResponse = this.frameRecording;
        int iHashCode2 = (iHashCode + (frameRecordingResponse == null ? 0 : frameRecordingResponse.hashCode())) * 31;
        EgressHLSResponse egressHLSResponse = this.hls;
        int iHashCode3 = (iHashCode2 + (egressHLSResponse == null ? 0 : egressHLSResponse.hashCode())) * 31;
        IndividualRecordingResponse individualRecordingResponse = this.individualRecording;
        int iHashCode4 = (iHashCode3 + (individualRecordingResponse == null ? 0 : individualRecordingResponse.hashCode())) * 31;
        RawRecordingResponse rawRecordingResponse = this.rawRecording;
        return iHashCode4 + (rawRecordingResponse != null ? rawRecordingResponse.hashCode() : 0);
    }

    public String toString() {
        return "EgressResponse(broadcasting=" + this.broadcasting + ", rtmps=" + this.rtmps + ", compositeRecording=" + this.compositeRecording + ", frameRecording=" + this.frameRecording + ", hls=" + this.hls + ", individualRecording=" + this.individualRecording + ", rawRecording=" + this.rawRecording + ")";
    }

    public /* synthetic */ EgressResponse(boolean z4, List list, CompositeRecordingResponse compositeRecordingResponse, FrameRecordingResponse frameRecordingResponse, EgressHLSResponse egressHLSResponse, IndividualRecordingResponse individualRecordingResponse, RawRecordingResponse rawRecordingResponse, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? null : compositeRecordingResponse, (i13 & 8) != 0 ? null : frameRecordingResponse, (i13 & 16) != 0 ? null : egressHLSResponse, (i13 & 32) != 0 ? null : individualRecordingResponse, (i13 & 64) != 0 ? null : rawRecordingResponse);
    }
}
