package live.hms.video.connection.stats;

import java.util.List;
import live.hms.video.media.tracks.HMSTrack;
import live.hms.video.sdk.models.HMSPeer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u000e\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0015\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Llive/hms/video/connection/stats/HMSStatsObserver;", "", "Llive/hms/video/connection/stats/HMSRTCStatsReport;", "rtcStats", "Ll83/a0;", "onRTCStats", "(Llive/hms/video/connection/stats/HMSRTCStatsReport;)V", "", "Llive/hms/video/connection/stats/HMSLocalVideoStats;", "videoStats", "Llive/hms/video/media/tracks/HMSTrack;", "hmsTrack", "Llive/hms/video/sdk/models/HMSPeer;", "hmsPeer", "onLocalVideoStats", "(Ljava/util/List;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V", "Llive/hms/video/connection/stats/HMSLocalAudioStats;", "audioStats", "onLocalAudioStats", "(Llive/hms/video/connection/stats/HMSLocalAudioStats;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V", "Llive/hms/video/connection/stats/HMSRemoteVideoStats;", "onRemoteVideoStats", "(Llive/hms/video/connection/stats/HMSRemoteVideoStats;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V", "Llive/hms/video/connection/stats/HMSRemoteAudioStats;", "onRemoteAudioStats", "(Llive/hms/video/connection/stats/HMSRemoteAudioStats;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface HMSStatsObserver {

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        public static void onLocalAudioStats(HMSStatsObserver hMSStatsObserver, HMSLocalAudioStats audioStats, HMSTrack hMSTrack, HMSPeer hMSPeer) {
            AbstractC22676k.m65750j(audioStats, "audioStats");
        }

        public static void onLocalVideoStats(HMSStatsObserver hMSStatsObserver, List<HMSLocalVideoStats> videoStats, HMSTrack hMSTrack, HMSPeer hMSPeer) {
            AbstractC22676k.m65750j(videoStats, "videoStats");
        }

        public static void onRTCStats(HMSStatsObserver hMSStatsObserver, HMSRTCStatsReport rtcStats) {
            AbstractC22676k.m65750j(rtcStats, "rtcStats");
        }

        public static void onRemoteAudioStats(HMSStatsObserver hMSStatsObserver, HMSRemoteAudioStats audioStats, HMSTrack hMSTrack, HMSPeer hMSPeer) {
            AbstractC22676k.m65750j(audioStats, "audioStats");
        }

        public static void onRemoteVideoStats(HMSStatsObserver hMSStatsObserver, HMSRemoteVideoStats videoStats, HMSTrack hMSTrack, HMSPeer hMSPeer) {
            AbstractC22676k.m65750j(videoStats, "videoStats");
        }
    }

    void onLocalAudioStats(HMSLocalAudioStats audioStats, HMSTrack hmsTrack, HMSPeer hmsPeer);

    void onLocalVideoStats(List<HMSLocalVideoStats> videoStats, HMSTrack hmsTrack, HMSPeer hmsPeer);

    void onRTCStats(HMSRTCStatsReport rtcStats);

    void onRemoteAudioStats(HMSRemoteAudioStats audioStats, HMSTrack hmsTrack, HMSPeer hmsPeer);

    void onRemoteVideoStats(HMSRemoteVideoStats videoStats, HMSTrack hmsTrack, HMSPeer hmsPeer);
}
