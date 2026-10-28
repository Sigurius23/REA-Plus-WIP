package hms.webrtc;

/* JADX INFO: loaded from: classes11.dex */
public interface RTCStatsCollectorCallback {
    @CalledByNative
    void onStatsDelivered(RTCStatsReport rTCStatsReport);
}
