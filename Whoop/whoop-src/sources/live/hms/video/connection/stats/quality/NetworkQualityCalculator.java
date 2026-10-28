package live.hms.video.connection.stats.quality;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¨\u0006\t"}, m65681d2 = {"Llive/hms/video/connection/stats/quality/NetworkQualityCalculator;", "", "<init>", "()V", "calculateNetworkQuality", "", "totalPackets", "", "packetLoss", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class NetworkQualityCalculator {
    public final int calculateNetworkQuality(long totalPackets, long packetLoss) {
        if (totalPackets == 0) {
            return 5;
        }
        double d3 = (packetLoss * 100.0d) / totalPackets;
        if (d3 < 0.01d) {
            return 5;
        }
        if (d3 < 0.04d) {
            return 4;
        }
        if (d3 < 0.1d) {
            return 3;
        }
        return d3 < 1.0d ? 2 : 1;
    }
}
