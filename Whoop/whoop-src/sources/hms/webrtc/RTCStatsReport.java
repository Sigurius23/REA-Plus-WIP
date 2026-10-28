package hms.webrtc;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class RTCStatsReport {
    private final Map<String, RTCStats> stats;
    private final long timestampUs;

    public RTCStatsReport(long j7, Map<String, RTCStats> map) {
        this.timestampUs = j7;
        this.stats = map;
    }

    @CalledByNative
    private static RTCStatsReport create(long j7, Map map) {
        return new RTCStatsReport(j7, map);
    }

    public Map<String, RTCStats> getStatsMap() {
        return this.stats;
    }

    public double getTimestampUs() {
        return this.timestampUs;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("{ timestampUs: ");
        sb4.append(this.timestampUs);
        sb4.append(", stats: [\n");
        boolean z4 = true;
        for (RTCStats rTCStats : this.stats.values()) {
            if (!z4) {
                sb4.append(",\n");
            }
            sb4.append(rTCStats);
            z4 = false;
        }
        sb4.append(" ] }");
        return sb4.toString();
    }
}
