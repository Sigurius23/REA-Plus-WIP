package live.hms.video.media.streams;

import hms.webrtc.MediaStream;
import hms.webrtc.MediaStreamTrack;
import hms.webrtc.RtpParameters;
import hms.webrtc.RtpSender;
import hms.webrtc.RtpTransceiver;
import java.util.List;
import live.hms.video.connection.publish.HMSPublishConnection;
import live.hms.video.media.settings.HMSTrackSettings;
import live.hms.video.media.settings.HMSVideoTrackSettings;
import live.hms.video.media.tracks.HMSLocalAudioTrack;
import live.hms.video.media.tracks.HMSLocalVideoTrack;
import live.hms.video.media.tracks.HMSTrack;
import live.hms.video.media.tracks.HMSTrackType;
import live.hms.video.sdk.models.DegradationPreference;
import live.hms.video.utils.HMSLogger;
import live.hms.video.utils.HMSUtils;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Llive/hms/video/media/streams/HMSLocalStream;", "Llive/hms/video/media/streams/HMSMediaStream;", "Lhms/webrtc/MediaStream;", "nativeStream", "<init>", "(Lhms/webrtc/MediaStream;)V", "Llive/hms/video/connection/publish/HMSPublishConnection;", "connection", "Llive/hms/video/media/tracks/HMSTrack;", "track", "", "isScreenShare", "Llive/hms/video/media/settings/HMSTrackSettings;", "hmsTrackSettings", "Lhms/webrtc/RtpTransceiver;", "addTransceiver", "(Llive/hms/video/connection/publish/HMSPublishConnection;Llive/hms/video/media/tracks/HMSTrack;ZLlive/hms/video/media/settings/HMSTrackSettings;)Lhms/webrtc/RtpTransceiver;", "Ll83/a0;", "removeSender", "(Llive/hms/video/connection/publish/HMSPublishConnection;Llive/hms/video/media/tracks/HMSTrack;)V", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSLocalStream extends HMSMediaStream {
    private static final String TAG = "HMSLocalStream";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMSLocalStream(MediaStream nativeStream) {
        super(nativeStream);
        AbstractC22676k.m65750j(nativeStream, "nativeStream");
    }

    public final RtpTransceiver addTransceiver(HMSPublishConnection connection, HMSTrack track, boolean isScreenShare, HMSTrackSettings hmsTrackSettings) {
        List<RtpParameters.Encoding> listM118958J;
        AbstractC22676k.m65750j(connection, "connection");
        AbstractC22676k.m65750j(track, "track");
        AbstractC22676k.m65750j(hmsTrackSettings, "hmsTrackSettings");
        HMSTrackType type = track.getType();
        HMSTrackType hMSTrackType = HMSTrackType.VIDEO;
        if (type == hMSTrackType) {
            listM118958J = HMSUtils.INSTANCE.getVideoEncodingParameter$lib_release(((HMSLocalVideoTrack) track).getSettings(), isScreenShare);
        } else {
            RtpParameters.Encoding encoding = new RtpParameters.Encoding(null, true, null);
            encoding.bitratePriority = 2.0d;
            encoding.maxBitrateBps = Integer.valueOf(((HMSLocalAudioTrack) track).getSettings().getMaxBitrate() * 1000);
            listM118958J = AbstractC37056f.m118958J(encoding);
        }
        RtpTransceiver rtpTransceiverAddTransceiver = connection.addTransceiver(track.getNativeTrack(), new RtpTransceiver.RtpTransceiverInit(RtpTransceiver.RtpTransceiverDirection.SEND_ONLY, AbstractC37056f.m118958J(getNativeStream().getId()), listM118958J));
        HMSVideoTrackSettings videoSettings = hmsTrackSettings.getVideoSettings();
        if ((videoSettings != null ? videoSettings.getDegradationPreference() : null) != DegradationPreference.DEFAULT && track.getType() == hMSTrackType && !isScreenShare) {
            RtpParameters parameters = rtpTransceiverAddTransceiver.getSender().getParameters();
            HMSUtils hMSUtils = HMSUtils.INSTANCE;
            HMSVideoTrackSettings videoSettings2 = hmsTrackSettings.getVideoSettings();
            parameters.degradationPreference = hMSUtils.mapHmsDegradationPreference(videoSettings2 != null ? videoSettings2.getDegradationPreference() : null);
        }
        HMSLogger.m71136d(TAG, "[streamId=" + getNativeStream().getId() + "] publishTrack trackId=" + track.getTrackId() + " kind=" + track.getType() + " sendEncodings=" + listM118958J + ", Added transceiver: mid=" + rtpTransceiverAddTransceiver.getMid());
        return rtpTransceiverAddTransceiver;
    }

    public final void removeSender(HMSPublishConnection connection, HMSTrack track) {
        AbstractC22676k.m65750j(connection, "connection");
        AbstractC22676k.m65750j(track, "track");
        for (RtpSender rtpSender : connection.getSenders()) {
            rtpSender.getParameters();
            MediaStreamTrack mediaStreamTrackTrack = rtpSender.track();
            if (mediaStreamTrackTrack != null && mediaStreamTrackTrack.m49577id().equals(track.getNativeTrack().m49577id())) {
                connection.removeTrack(rtpSender);
                if (getTracks().remove(track)) {
                    return;
                }
                throw new IllegalStateException("Cannot find " + track + " in locally stored tracks");
            }
        }
        HMSLogger.m71137e(TAG, "Cannot find sender track in streamId=" + getId());
    }
}
