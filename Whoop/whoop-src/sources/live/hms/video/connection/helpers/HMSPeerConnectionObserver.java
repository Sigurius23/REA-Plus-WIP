package live.hms.video.connection.helpers;

import androidx.core.app.NotificationCompat;
import hms.webrtc.CandidatePairChangeEvent;
import hms.webrtc.DataChannel;
import hms.webrtc.IceCandidate;
import hms.webrtc.IceCandidateErrorEvent;
import hms.webrtc.MediaStream;
import hms.webrtc.MediaStreamTrack;
import hms.webrtc.PeerConnection;
import hms.webrtc.RtpReceiver;
import hms.webrtc.RtpTransceiver;
import java.util.ArrayList;
import live.hms.video.connection.models.HMSConnectionRole;
import live.hms.video.utils.HMSLogger;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000 ;2\u00020\u0001:\u0001;B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010 J\u0019\u0010$\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\u00020\b2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u0010/\u001a\u00020\b2\b\u0010+\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\bH\u0016¢\u0006\u0004\b1\u00102J%\u00104\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0019H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\b2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010:¨\u0006<"}, m65681d2 = {"Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;", "Lhms/webrtc/PeerConnection$Observer;", "Llive/hms/video/connection/models/HMSConnectionRole;", "role", "<init>", "(Llive/hms/video/connection/models/HMSConnectionRole;)V", "Lhms/webrtc/PeerConnection$SignalingState;", "newState", "Ll83/a0;", "onSignalingChange", "(Lhms/webrtc/PeerConnection$SignalingState;)V", "Lhms/webrtc/PeerConnection$IceConnectionState;", "onIceConnectionChange", "(Lhms/webrtc/PeerConnection$IceConnectionState;)V", "", "receiving", "onIceConnectionReceivingChange", "(Z)V", "Lhms/webrtc/PeerConnection$IceGatheringState;", "onIceGatheringChange", "(Lhms/webrtc/PeerConnection$IceGatheringState;)V", "Lhms/webrtc/IceCandidate;", "candidate", "onIceCandidate", "(Lhms/webrtc/IceCandidate;)V", "", "candidates", "onIceCandidatesRemoved", "([Lhms/webrtc/IceCandidate;)V", "Lhms/webrtc/MediaStream;", "stream", "onAddStream", "(Lhms/webrtc/MediaStream;)V", "onRemoveStream", "Lhms/webrtc/RtpReceiver;", "receiver", "onRemoveTrack", "(Lhms/webrtc/RtpReceiver;)V", "Lhms/webrtc/DataChannel;", "dataChannel", "onDataChannel", "(Lhms/webrtc/DataChannel;)V", "Lhms/webrtc/CandidatePairChangeEvent;", NotificationCompat.CATEGORY_EVENT, "onSelectedCandidatePairChanged", "(Lhms/webrtc/CandidatePairChangeEvent;)V", "Lhms/webrtc/IceCandidateErrorEvent;", "onIceCandidateError", "(Lhms/webrtc/IceCandidateErrorEvent;)V", "onRenegotiationNeeded", "()V", "mediaStreams", "onAddTrack", "(Lhms/webrtc/RtpReceiver;[Lhms/webrtc/MediaStream;)V", "Lhms/webrtc/RtpTransceiver;", "transceiver", "onTrack", "(Lhms/webrtc/RtpTransceiver;)V", "Llive/hms/video/connection/models/HMSConnectionRole;", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public class HMSPeerConnectionObserver implements PeerConnection.Observer {
    private static final String TAG = "HMSPeerConnectionObserver";
    private final HMSConnectionRole role;

    public HMSPeerConnectionObserver(HMSConnectionRole role) {
        AbstractC22676k.m65750j(role, "role");
        this.role = role;
    }

    @Override // hms.webrtc.PeerConnection.Observer
    public void onAddStream(MediaStream stream2) {
        AbstractC22676k.m65750j(stream2, "stream");
        HMSLogger.INSTANCE.m71139i(TAG, "[role=" + this.role + "] onAddStream: streamId=" + stream2.getId());
    }

    @Override // hms.webrtc.PeerConnection.Observer
    public void onAddTrack(RtpReceiver receiver, MediaStream[] mediaStreams) {
        AbstractC22676k.m65750j(receiver, "receiver");
        AbstractC22676k.m65750j(mediaStreams, "mediaStreams");
        HMSLogger hMSLogger = HMSLogger.INSTANCE;
        StringBuilder sb4 = new StringBuilder("[role=");
        sb4.append(this.role);
        sb4.append("] onAddTrack: receiverId=");
        sb4.append(receiver.m49594id());
        sb4.append(" trackId=");
        MediaStreamTrack mediaStreamTrackTrack = receiver.track();
        sb4.append(mediaStreamTrackTrack != null ? mediaStreamTrackTrack.m49577id() : null);
        sb4.append("streams=");
        ArrayList arrayList = new ArrayList(mediaStreams.length);
        for (MediaStream mediaStream : mediaStreams) {
            arrayList.add(mediaStream.getId());
        }
        sb4.append(arrayList);
        hMSLogger.m71139i(TAG, sb4.toString());
    }

    @Override // hms.webrtc.PeerConnection.Observer
    public void onDataChannel(DataChannel dataChannel) {
        AbstractC22676k.m65750j(dataChannel, "dataChannel");
        HMSLogger.INSTANCE.m71139i(TAG, "[role=" + this.role + "] onDataChannel: id=" + dataChannel.m49548id() + " label=" + dataChannel.label());
    }

    @Override // hms.webrtc.PeerConnection.Observer
    public void onIceCandidate(IceCandidate candidate) {
        AbstractC22676k.m65750j(candidate, "candidate");
        HMSLogger.m71136d(TAG, "[role=" + this.role + "] onIceCandidate: candidate=" + candidate);
    }

    @Override // hms.webrtc.PeerConnection.Observer
    public void onIceCandidateError(IceCandidateErrorEvent event) {
        HMSLogger hMSLogger = HMSLogger.INSTANCE;
        StringBuilder sb4 = new StringBuilder("[role=");
        sb4.append(this.role);
        sb4.append("] onIceCandidateError: error=");
        sb4.append(event != null ? event.errorText : null);
        sb4.append(" for ");
        sb4.append(event != null ? event.url : null);
        sb4.append('}');
        hMSLogger.m71139i(TAG, sb4.toString());
    }

    @Override // hms.webrtc.PeerConnection.Observer
    public void onIceCandidatesRemoved(IceCandidate[] candidates) {
        AbstractC22676k.m65750j(candidates, "candidates");
        HMSLogger.m71136d(TAG, "[role=" + this.role + "] onIceCandidatesRemoved: candidates=" + candidates);
    }

    @Override // hms.webrtc.PeerConnection.Observer
    public void onIceConnectionChange(PeerConnection.IceConnectionState newState) {
        AbstractC22676k.m65750j(newState, "newState");
        HMSLogger.m71136d(TAG, "[role=" + this.role + "] onIceConnectionChange: newState=" + newState);
    }

    @Override // hms.webrtc.PeerConnection.Observer
    public void onIceConnectionReceivingChange(boolean receiving) {
        HMSLogger.m71136d(TAG, "[role=" + this.role + "] onIceConnectionReceivingChange: receiving=" + receiving);
    }

    @Override // hms.webrtc.PeerConnection.Observer
    public void onIceGatheringChange(PeerConnection.IceGatheringState newState) {
        AbstractC22676k.m65750j(newState, "newState");
        HMSLogger.m71136d(TAG, "[role=" + this.role + "] onIceGatheringChange: newState=" + newState);
    }

    @Override // hms.webrtc.PeerConnection.Observer
    public void onRemoveStream(MediaStream stream2) {
        AbstractC22676k.m65750j(stream2, "stream");
        HMSLogger.INSTANCE.m71139i(TAG, "[role=" + this.role + "] onRemoveStream: streamId=" + stream2.getId());
    }

    @Override // hms.webrtc.PeerConnection.Observer
    public void onRemoveTrack(RtpReceiver receiver) {
        MediaStreamTrack mediaStreamTrackTrack;
        HMSLogger hMSLogger = HMSLogger.INSTANCE;
        StringBuilder sb4 = new StringBuilder("[role=");
        sb4.append(this.role);
        sb4.append("] onRemoveTrack: trackId=");
        sb4.append((receiver == null || (mediaStreamTrackTrack = receiver.track()) == null) ? null : mediaStreamTrackTrack.m49577id());
        hMSLogger.m71139i(TAG, sb4.toString());
    }

    @Override // hms.webrtc.PeerConnection.Observer
    public void onRenegotiationNeeded() {
        HMSLogger.m71136d(TAG, "[role=" + this.role + "] onRenegotiationNeeded");
    }

    @Override // hms.webrtc.PeerConnection.Observer
    public void onSelectedCandidatePairChanged(CandidatePairChangeEvent event) {
        HMSLogger hMSLogger = HMSLogger.INSTANCE;
        StringBuilder sb4 = new StringBuilder("[role=");
        sb4.append(this.role);
        sb4.append("] onSelectedCandidatePairChanged: remote=");
        sb4.append(event != null ? event.remote : null);
        sb4.append(" local=");
        sb4.append(event != null ? event.local : null);
        sb4.append('}');
        hMSLogger.m71139i(TAG, sb4.toString());
    }

    @Override // hms.webrtc.PeerConnection.Observer
    public void onSignalingChange(PeerConnection.SignalingState newState) {
        AbstractC22676k.m65750j(newState, "newState");
        HMSLogger.m71136d(TAG, "[role=" + this.role + "] onSignalingChange: newState=" + newState);
    }

    @Override // hms.webrtc.PeerConnection.Observer
    public void onTrack(RtpTransceiver transceiver) {
        AbstractC22676k.m65750j(transceiver, "transceiver");
        super.onTrack(transceiver);
        HMSLogger.INSTANCE.m71139i(TAG, "[role=" + this.role + "] onTrack: transceiverId=" + transceiver.getMid());
    }
}
