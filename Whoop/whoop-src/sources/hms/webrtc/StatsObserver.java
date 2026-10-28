package hms.webrtc;

/* JADX INFO: loaded from: classes11.dex */
public interface StatsObserver {
    @CalledByNative
    void onComplete(StatsReport[] statsReportArr);
}
