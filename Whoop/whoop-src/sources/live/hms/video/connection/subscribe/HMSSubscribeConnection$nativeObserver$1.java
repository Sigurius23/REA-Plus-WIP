package live.hms.video.connection.subscribe;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import hms.webrtc.CandidatePairChangeEvent;
import hms.webrtc.DataChannel;
import hms.webrtc.IceCandidate;
import hms.webrtc.MediaStream;
import hms.webrtc.MediaStreamTrack;
import hms.webrtc.PeerConnection;
import hms.webrtc.RtpReceiver;
import java.util.Collection;
import live.hms.video.connection.helpers.HMSPeerConnectionObserver;
import live.hms.video.connection.models.HMSConnectionRole;
import live.hms.video.connection.models.HMSIceCandidate;
import live.hms.video.connection.models.HMSTrickle;
import live.hms.video.media.streams.HMSRemoteStream;
import live.hms.video.media.tracks.HMSTrack;
import live.hms.video.signal.ISignal;
import live.hms.video.utils.HMSCoroutineScope;
import live.hms.video.utils.HMSLogger;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000I\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"live/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1", "Llive/hms/video/connection/helpers/HMSPeerConnectionObserver;", "Lhms/webrtc/RtpReceiver;", "receiver", "Llive/hms/video/media/tracks/HMSTrack;", "getTrack", "(Lhms/webrtc/RtpReceiver;)Llive/hms/video/media/tracks/HMSTrack;", "Lhms/webrtc/PeerConnection$IceConnectionState;", "newState", "Ll83/a0;", "onIceConnectionChange", "(Lhms/webrtc/PeerConnection$IceConnectionState;)V", "Lhms/webrtc/DataChannel;", "dataChannel", "onDataChannel", "(Lhms/webrtc/DataChannel;)V", "", "Lhms/webrtc/MediaStream;", "mediaStreams", "onAddTrack", "(Lhms/webrtc/RtpReceiver;[Lhms/webrtc/MediaStream;)V", "onRemoveTrack", "(Lhms/webrtc/RtpReceiver;)V", "Lhms/webrtc/IceCandidate;", "candidate", "onIceCandidate", "(Lhms/webrtc/IceCandidate;)V", "Lhms/webrtc/CandidatePairChangeEvent;", NotificationCompat.CATEGORY_EVENT, "onSelectedCandidatePairChanged", "(Lhms/webrtc/CandidatePairChangeEvent;)V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSSubscribeConnection$nativeObserver$1 extends HMSPeerConnectionObserver {
    final /* synthetic */ ISubscribeConnectionObserver $observer;
    final /* synthetic */ RemoteTrackFactory $remoteTrackFactory;
    final /* synthetic */ ISignal $signal;
    final /* synthetic */ HMSSubscribeConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMSSubscribeConnection$nativeObserver$1(HMSSubscribeConnection hMSSubscribeConnection, ISubscribeConnectionObserver iSubscribeConnectionObserver, RemoteTrackFactory remoteTrackFactory, ISignal iSignal, HMSConnectionRole hMSConnectionRole) {
        super(hMSConnectionRole);
        this.this$0 = hMSSubscribeConnection;
        this.$observer = iSubscribeConnectionObserver;
        this.$remoteTrackFactory = remoteTrackFactory;
        this.$signal = iSignal;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMSTrack getTrack(RtpReceiver receiver) {
        MediaStreamTrack mediaStreamTrackTrack;
        Collection<HMSRemoteStream> collectionValues = this.this$0.remoteStreams.values();
        AbstractC22676k.m65749i(collectionValues, "<get-values>(...)");
        for (HMSRemoteStream hMSRemoteStream : collectionValues) {
            int size = hMSRemoteStream.getTracks().size();
            for (int i13 = 0; i13 < size; i13++) {
                try {
                    if (AbstractC22676k.m65745e(hMSRemoteStream.getTracks().get(i13).getTrackId(), (receiver == null || (mediaStreamTrackTrack = receiver.track()) == null) ? null : mediaStreamTrackTrack.m49577id())) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Track::");
                        MediaStreamTrack mediaStreamTrackTrack2 = receiver.track();
                        sb4.append(mediaStreamTrackTrack2 != null ? mediaStreamTrackTrack2.m49577id() : null);
                        sb4.append(" removed from the ");
                        sb4.append(i13);
                        sb4.append("th position");
                        HMSLogger.m71136d("HMSSubscribeConnection", sb4.toString());
                        return hMSRemoteStream.getTracks().remove(i13);
                    }
                } catch (IllegalStateException e5) {
                    HMSLogger.m71137e("HMSSubscribeConnection", String.valueOf(e5.getMessage()));
                }
            }
        }
        return null;
    }

    @Override // live.hms.video.connection.helpers.HMSPeerConnectionObserver, hms.webrtc.PeerConnection.Observer
    public void onAddTrack(RtpReceiver receiver, MediaStream[] mediaStreams) {
        AbstractC22676k.m65750j(receiver, "receiver");
        AbstractC22676k.m65750j(mediaStreams, "mediaStreams");
        super.onAddTrack(receiver, mediaStreams);
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new HMSSubscribeConnection$nativeObserver$1$onAddTrack$1(this.this$0, mediaStreams, receiver, this.$remoteTrackFactory, this.$observer, null), 3);
    }

    @Override // live.hms.video.connection.helpers.HMSPeerConnectionObserver, hms.webrtc.PeerConnection.Observer
    public void onDataChannel(DataChannel dataChannel) {
        AbstractC22676k.m65750j(dataChannel, "dataChannel");
        super.onDataChannel(dataChannel);
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new HMSSubscribeConnection$nativeObserver$1$onDataChannel$1(this.this$0, dataChannel, this.$observer, null), 3);
    }

    @Override // live.hms.video.connection.helpers.HMSPeerConnectionObserver, hms.webrtc.PeerConnection.Observer
    public void onIceCandidate(IceCandidate candidate) {
        AbstractC22676k.m65750j(candidate, "candidate");
        super.onIceCandidate(candidate);
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new HMSSubscribeConnection$nativeObserver$1$onIceCandidate$1(this.this$0, this.$observer, candidate, null), 3);
        this.$signal.trickle(new HMSTrickle(HMSIceCandidate.INSTANCE.from(candidate), this.this$0.getRole(), this.this$0.get_nodeInfo()));
    }

    @Override // live.hms.video.connection.helpers.HMSPeerConnectionObserver, hms.webrtc.PeerConnection.Observer
    public void onIceConnectionChange(PeerConnection.IceConnectionState newState) {
        AbstractC22676k.m65750j(newState, "newState");
        super.onIceConnectionChange(newState);
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new HMSSubscribeConnection$nativeObserver$1$onIceConnectionChange$1(this.this$0, this.$observer, newState, null), 3);
    }

    @Override // live.hms.video.connection.helpers.HMSPeerConnectionObserver, hms.webrtc.PeerConnection.Observer
    public void onRemoveTrack(RtpReceiver receiver) {
        super.onRemoveTrack(receiver);
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new HMSSubscribeConnection$nativeObserver$1$onRemoveTrack$1(this.this$0, this, receiver, this.$observer, null), 3);
    }

    @Override // live.hms.video.connection.helpers.HMSPeerConnectionObserver, hms.webrtc.PeerConnection.Observer
    public void onSelectedCandidatePairChanged(CandidatePairChangeEvent event) {
        super.onSelectedCandidatePairChanged(event);
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C24122x5def6ede(this.this$0, this.$observer, event, null), 3);
    }
}
